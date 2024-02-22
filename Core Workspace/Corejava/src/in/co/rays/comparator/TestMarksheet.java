package in.co.rays.comparator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {
	
	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		list.add(new Marksheet ("prakhar", 1, 45));
		list.add(new Marksheet ("ganesh", 4, 43));
		list.add(new Marksheet ("shubham", 2,84));
		list.add(new Marksheet ("farukh",5,32));
		list.add(new Marksheet ("aman",8,83));
		list.add(new Marksheet ("riya",6,38));
		list.add(new Marksheet ("babita",9,74));
		list.add(new Marksheet ("chetan", 3, 93));
		list.add(new Marksheet ("damandeep",7,85));
		list.add(new Marksheet ("ehsaan",10,91));
		list.add(new Marksheet ("zeeshaan",9,84));
		
		System.out.println(list);
		
		List list1=new ArrayList(list);
		
		Collections.sort(list1,new OrderByNameAsc());
		
		//System.out.println("Order By Marks");
		//Collections.sort(list1,new OrderByMarks());
		
		System.out.println(list1);
		
		System.out.println();
		
		//for each loop.
		
		for (Object obj:list1) {
			
			System.out.println(obj);
		}
		
	}

}