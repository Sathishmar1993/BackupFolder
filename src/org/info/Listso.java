package org.info;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Listso {

	public static void main(String[] args) {
		 
		List<Integer>li = new ArrayList();
		  li.add(10);
		  li.add(20);
		  li.add(10);
		  li.add(30);
		  li.add(50);
		  li.add(7998);
		  li.add(10);
		  
//		  System.out.println(li);
//		  
//		  
//		  
		  Set<Integer> s = new LinkedHashSet<>(li);
//
//			  
			  s.addAll(li);
			  System.out.println(s);
//			  
//			  
//			  
			  int size = li.size();
			  System.out.println(size);
//			  
			  Integer integer = li.get(6);
			  System.out.println(integer);
//			  
//			  for (int i = 0; i < 5; i++) {
//				  Integer integer2 = li.get(i);
//				  System.out.println(integer2);
//				  				
//			}
//			  int size = li.size();
//	     	int middle = li.size()/2;
//	     	
//	     	Integer integer = li.get(middle);
//	     	System.out.println(integer);
	     	

//			int a= li.size()%5;
////			System.out.println(a);
//	
//			for (int i = a; i <size ; i++) {
//			  
//			  System.out.println(li.get(i));
//			}	
			
//	for (int i = 0; i < size; i++) {
//		Integer integer = li.get(i);
//		System.out.println(integer);
//		i++;
//	}
		
			
		}
	}

