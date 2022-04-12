package org.info;

import java.util.ArrayList;
import java.util.List;

public class Lists {
	
   public static void main(String[] args) {
	   
	  List<Integer> li = new ArrayList<>();
	  
	  li.add(10);
	  li.add(20);
	  li.add(10);
	  li.add(30);
	  li.add(50);
	  li.add(7998);
	  li.add(10);
	  li.add(872);
	  
	  System.out.println(li);
	  
	  List l=new ArrayList();
	  l.add(10);
	  l.add(100);
	  l.add("sathesh");
	  l.add(true);
	  l.add(10.999f);
	  l.add(19876);
	  l.add(1);
	  System.out.println(l);
	  
	  int size = li.size();
	  System.out.println(size);
	  
	  Integer integer = li.get(2);
	  System.out.println(integer);
	  
	  Object object = l.get(2);
	  System.out.println(object);
	  
	  Object object2 = l.get(3);
	  System.out.println(object2);
	  
	  l.add(3, 2675);
	  System.out.println(l);
	  
	  l.remove(3);
	  System.out.println(l);
	  
	  l.set(6, true);
	  System.out.println(l);
	  
	  int indexOf = l.indexOf(19876);
	  System.out.println(indexOf);
	  
	  int lastIndexOf = li.lastIndexOf(10);
	  System.out.println(lastIndexOf);
	  
	  boolean contains = li.contains(50);
	  System.out.println(li);
	  
	  li.addAll(l);
	  System.out.println(li);
	  
	  
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
   }

}
