package Practice.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;


/**
 * Hello world!
 *
 */
public class App 
{
   
    
  //@Test
	public void  reg()
	{
		// TODO Auto-generated method stub
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("Ajay");
		name.add("Babu");
		name.add("chan");
		name.add("Arun");
		name.add("Akash");
		name.add("Babi");
		int count = 0;
		for (int i=0; i<name.size();i++)
		{
			String actualname = name.get(i);
			if(actualname.startsWith("A"))
			{
				count++; 
			}
		}
		//System.out.println(count);
		
	}
	
	//stream
	//@Test
	public void streamFilter()
	{
		ArrayList<String> name = new ArrayList<String>();
		name.add("Ajay");
		name.add("Babu");
		name.add("chan");
		name.add("Arun");
		name.add("Akash");
		name.add("Babi");
		
		//Long c=name.stream().filter(s->s.startsWith("A")).count();
		//System.out.println(c);
		Long d = Stream.of("Ajay","Babu","chan","Arun","Akash","Babi").filter(s->
			s.startsWith("A")
			).count();
		
	System.out.println(d);
	
	//print all the names of array list
	//name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	name.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	
		
	}
	//@Test
	public void streamMap()
	{
		//print names which have last letter as "a" with uppercase
		//foStream.of("Ajay","Babu","chan","Arun","Akash","Babi").filter(s->s.endsWith("n")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		ArrayList<String> names = new ArrayList<String>();
		names.add("Asha");
		names.add("Baji");
		names.add("cherry");
		
		//Print names which have first letter as "a" with upper case and sorted.
		List<String> name =Arrays.asList("Ajay","Babu","chan","Arun","Akash","Babi");
		//name.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//merging 2 different lists
		Stream<String> newStream = Stream.concat(names.stream(), name.stream());
		newStream.sorted().forEach(s->System.out.println(s));
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Ba77bu"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
		
	}
	
	
	@Test
	public void streamCollect()
	{
		List<String> ls = Stream.of("Ajay","Babu","chan","Arun","Akash","Babi").filter(s->
		s.endsWith("n")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List<Integer> value = Arrays.asList(1,2,3,4,5,6,6,4,2,1);
		value.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li = value.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}



}
