package com.bl.ds;
import com.bl.ds.*;
import java.util.ArrayList;
import java.util.*;



public class HashFunction {

	public int hashFun(int value) {
		return value%6;
	}

	
	public void hashMain() {
		int key = 6;
		int numArray[] = {4,34,8,2,99,7,3,5,33,25,44,1,66,36,69,60};
		Object listObj[] = new Object[key];
		
		for(int i=0;i<key;i++)
		{
			listObj[i]= new LinkedListDemo();
		}
		
		for(int i=0;i<numArray.length;i++) {
			int keyValue=hashFun(numArray[i]);
			add(listObj[keyValue],numArray[i]);
			
		}
		
		for(int i=0;i<key;i++)
		{
			print(listObj[i],i);
		}
		

	}


	private void add(Object object, int data) {
		LinkedListDemo list = (LinkedListDemo)object;
		list.add(data);
		
	}
	
	public void print(Object object,int key) {
		LinkedListDemo list = (LinkedListDemo)object;
		System.out.print("slot no. " +key +"->");
		list.printList();
	}
	
	public static void main(String[] args) {
		HashFunction hash = new HashFunction();
		hash.hashMain();
		}
	

	

}
