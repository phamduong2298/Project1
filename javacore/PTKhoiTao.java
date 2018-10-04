package luyentapti;

public class PTKhoiTao {
	String name;
	int age;
	public PTKhoiTao() {
		name = "Duong";
		age = 20;
	}
	public PTKhoiTao(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		PTKhoiTao a = new PTKhoiTao("Chi",20);
		System.out.printf("Ten %s Tuoi %d",a.name,a.age);
	}
}
