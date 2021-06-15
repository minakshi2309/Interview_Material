package com.in28minutes.java.others;

public class HeapMemoryTest {

	private int i;
	
	public HeapMemoryTest(int i) {
		this.i = i;
	}
	
	public static void swap(HeapMemoryTest f1, HeapMemoryTest f2) {
		HeapMemoryTest temp = f1;
		f1=f2;
		f2=temp;
		f1.i=110;
		f2.i=220;
		print(f1,f2);		
	}
	
	public static void print(HeapMemoryTest f1, HeapMemoryTest f2) {
		System.out.println("f1.i= "+f1.i+"\tf2.i= "+f2.i);
	}
	
	public static void main(String[] args) {
		HeapMemoryTest f1 = new HeapMemoryTest(100);
		HeapMemoryTest f2 = new HeapMemoryTest(200);
		
		print(f1,f2); 
		swap(f1,f2);
		print(f1,f2);

	}

}
