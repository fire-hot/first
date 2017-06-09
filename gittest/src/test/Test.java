package test;

public class Test {
	public int sum(int x,int y) {
		return x+y;		
	}
	private void show(String s) {
		int x=5;
		System.out.println(s+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.sum(1, 2);
		test.show("aa");
	}

}
