import edu.princeton.cs.algs4.StdIn;

public class TestJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		int N = StdIn.readInt();
		for (int n=N;n>0;n/=2){
			s = (n%2) + s;
		}
		System.out.println(s);
	}

}
