package luyentapti;

public class NapChongPhuongThuc {
	int tong(int a,int b) {
		return a+b;
	}
	int tong(int a,int b,int c) {
		return a+b+c;
	}
	static void out() {
		System.out.println("Hello");
	}
	void out(String x) {
		System.out.println("Hello " +x);
	}
	
	public static void main(String args[]) {
		NapChongPhuongThuc test = new NapChongPhuongThuc();
		out();
		test.out();
		test.out("Duong");
		System.out.println(test.tong(4,3));
		System.out.println(test.tong(1,2,3));
	}
}
