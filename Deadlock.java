package pt4A2;

//Write a program to create a deadlock between two threads.
public class Deadlock 
{
	public static void main(String[] args)
	{
	final String lock1 = "Laura";
	final String lock2 = "Dailey";
	
	//locks lock 1
	Thread t1 = new Thread()
			{
				public void run()
				{
					synchronized(lock1)
					{
						System.out.println("Thread1: locked lock1");
						
						try
						{
							Thread.sleep(100);
						}
						catch(Exception e)
						{
							
						}
						synchronized(lock2)
						{
							System.out.println("Thread1: locked lock2");
						}
						
					}
				}
			};
			
			//Locks lock2
			Thread t2 = new Thread()
					{
						public void run()
						{
							synchronized (lock2)
							{
								System.out.println("Thread2: locked lock2");
								
								try
								{
									Thread.sleep(100);
								}
								catch(Exception e)
								{
									
								}
								synchronized(lock1)
								{
									System.out.println("Thread2: locked lock1");
								}
							}
						}
					};
					
					t1.start();
					t2.start();
}
}
