package cmo.td.sample;

public class Sample {
	
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void sub(int a,int b) {
		System.out.println(a-b);
	}
	public static void div(int a, int b) {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		int a=50;
		int b=30;
		Sample s=new Sample();
		s.add(a, b);
		s.sub(a, b);
		s.div(a, b);
	}

}
