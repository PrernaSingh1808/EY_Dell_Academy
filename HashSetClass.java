package com.programming.class2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;


public class HashSetClass {
	
	public static void main(String[] args) {

        LinkedList<String> hsh = new LinkedList<>();

        hsh.add("Z");hsh.add("Z");hsh.add("Z");
       

        hsh.add(null);hsh.add(null);hsh.add(null);

        hsh.add("X");hsh.add("Y");hsh.add("Z");

        

        Iterator<String> itr = hsh.iterator();

        while(itr.hasNext())

        {

            System.out.println(itr.next()+" ");

        }

    }
	
}

