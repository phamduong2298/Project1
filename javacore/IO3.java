package luyentapti;
import java.io.*;
import java.util.*;

public class IO3 {
	public static void main(String args[]) throws IOException{
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			String c;
			Scanner sc = new Scanner(in);
			c = sc.next();
			System.out.println(c);
			c = sc.next();
			System.out.println(c);
		}
		
		finally {
			if (in !=null) {
				in.close();
			}
			if (out !=null) {
				out.close();
			}
		}
	}
}
