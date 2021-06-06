package com.ss.jb.p4;

import java.util.LinkedList;

public class ThreadAssignment 
{

	public static void main(String[] args) 
		throws InterruptedException
	{
		//object has both produce and consume
		final TC tc = new TC();
		
		//Create producer thread
		Thread t1 = new Thread(new Runnable()
				{
					@Override
					public void run()
					{
						try
						{
							tc.produce();
						}
						catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				});
		
		//create consumer thread
		Thread t2 = new Thread(new Runnable()
				{
					@Override
					public void run()
					{
						try
						{
							tc.consume();
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				});
		
		//start threads
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

	}
	
	//class tha adds items to list(producer)
	//consumerr removes them
	public static class TC
	{
		//create kist
		LinkedList<Integer> list = new LinkedList<>();
		int capacity = 2;
		
		//called by producer
		public void produce() throws InterruptedException
		{
			int value = 0;
			while(true)
			{
				synchronized(this)
				{
					//producer waits while full
					while(list.size()==capacity)
						wait();
					
					System.out.println("Producer-" + value);
					
					//insert into list
					list.add(value++);
					
					//notifies consumer
					notify();
					
					Thread.sleep(1000);
				}
			}
		}
		
		//called by consumer
		public void consume() throws InterruptedException
		{
			while(true)
			{
				synchronized(this)
				{
					//waits while empty
					while(list.size()==0)
						wait();
					
					//retrieve first job
					int val = list.removeFirst();
					
					System.out.println("Consumer-" + val);
					
					//wake up producer
					notify();
					
					Thread.sleep(1000);
				}
			}
		}
	}

}
