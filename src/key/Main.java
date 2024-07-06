package key;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static String string = "1234";
	static char[] key = string.toCharArray();
	static List<String> li = new ArrayList<>();
	static int[] length = new int[4];
	static int counter=0;
	/*public static long algorithm(int i) {
		if (i == 1)
			return 1 ;
		return i*(algorithm(--i));	
	}*/
	
	/*public static void algorithm(int size) {
		
		for(int i = 0 ; i < size; ++i) {
			for(int j = 0 ; j < size ; ++j) {
				System.out.println(i);
				counter+=1;
				if(size >= 0)
				algorithm(--size);
			}
		}
	}*/
	
	/*public static void algorithm(int size) {
		//for(int i = size; i >= 0 ; --i) {
		//if(size>=0)
				for(int j = 0 ; j< 4; ++j) {
				length[size] = j;
				counter+=1;
				//System.out.println(j + " ==> "+ size);
				
				if(size-1 >=0) 
				algorithm(size-1);
			}
		//}
	}*/
	
	//public 
	
	public static void main(String[] args) 	{
		
		
		//algorithm(3);
		System.out.println("DOne==>" + counter + "==>"+ key.length);
		//algorithm(4);
		//System.out.println("Done===> "+ counter);
		/*for (int i = 0 ; i< 10 ;++i) {
			for(int j = 0 ; j< 25 ; ++j) {
				
			}
			
		}*/
		
		/*for (int i = 0 ; i < 9; ++i) {
			for(int j = 0 ;  j <= i ; ++j) {
				for(int k = 0; k < 9 ; ++k) {
					System.out.println(i +" - " +  j +" -  "+  k);
				}
			}
		}*/
		
		//int k = 0 ; 
		
		
		/*for(int i = 0 ; i < 3 ; ++i)
			for(int j = 0 ; j <= i ;++j)
				for(int k = 0 ; k <= j ; ++k)
					for(int l = 0 ; l < 5 ;++l)
						counter+=1;
		System.out.println(counter);*/
		
		/*for(int i = 0 ; i < 25 ; ++i)
			for(int j = 0 ; j < 25 ;++j)
				counter+=1;
		System.out.println(counter);*/
		//int k = 4;//4*4*4*4
		
		//System.out.println(algorithm(24));
		
		/*for (int i = 0; i< 9 ;++i)
			for(int j = 0 ; j<= i ; ++j)
				for(int k = 0;  k< 9 ;++k)
					for(int l = 0 ; l< )*/
		
	}
}
