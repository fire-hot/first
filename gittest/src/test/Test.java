package test;

public class Test {
	public int sum(int x,int y) {
		return x+y;		
	}
	private void show(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.sum(1, 2);
		test.show("aa");
	}

}
