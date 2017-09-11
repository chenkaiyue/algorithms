import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class TestJava {
	public static int rank(int key,int[] a){
		return rank(key,a,0,a.length-1,0);
	}
	public static int rank(int key,int[] a, int lo, int hi, int depth){
		for (int i=0;i<depth;i++){
			System.out.printf("  ");
		}
		System.out.println("lo="+lo+",hi="+hi);
		if (lo > hi){
			return -1;
		}
		int mid = (lo+hi)/2;
		
		if (key < a[mid]){
			return rank(key,a,0,mid-1,depth+1);
		}
		else if (key > a[mid]) {
			return rank(key, a, mid + 1, hi, depth + 1);
		} else {
			return mid;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] whitelist={1,2,3};
		Arrays.sort(whitelist);
		while (!StdIn.isEmpty()){
			int key = StdIn.readInt();
			if (rank(key,whitelist) < 0){
				StdOut.println(key);
			}
		}
	}
}
