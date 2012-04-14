package me.wuky.getclipping;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GetClipping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader in;
			in = new BufferedReader(new FileReader( "c:/1.txt "));
	        String   line; 
	        while((line = in.readLine())!=null) {
	            System.out.println(line); 
	        	}
	 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Scanner scan=new Scanner(System.in);
		String s = scan.next();
		System.out.println("Êä³ö"+s);
		
	}

}
