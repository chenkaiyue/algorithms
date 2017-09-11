import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class TestJava {
	public static int Euclid(int p,int q){
		System.out.println("p is "+ p+",q is "+q);
		if (p < q){
			int t = q;
			q = p;
			p = t;
		}
		
		if (q==0){
			return p;
		}
		else{
			return Euclid(q,p%q);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("result"+Euclid(9,2));
	}
}
