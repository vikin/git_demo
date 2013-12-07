package test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		System.out.println("Hello test!");
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		for(String item:list){
			System.out.println(item);
		}
	}
}
