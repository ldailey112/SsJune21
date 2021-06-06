package com.ss.jb.lstreams;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaStreams 
{
	public String getString(List<Integer> list) 
	{
		return list.stream()
                .map(i -> i % 2 == 0 ? "e" + i : "o" + i)
                .collect(Collectors.joining(","));
	}
	
	public List<String> search(List<Person> list) 
	{

        return list.stream()
                .filter(p -> p.getName().startsWith("a") && p.getName().length() == 3)
                .map(p -> p.getName()).collect(Collectors.toList());
    }

}

class Person
{
	private String name;
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) 
	{
        this.name = name;
    }
}
