package kethua;

public class NhanVien {
	float salary = 1000;
	void getSalary() {
		System.out.printf("Luong cua nhan vien la: %f",salary);
	}
	public static void main(String args[]) {
		NhanVien a = new NhanVien();
		a.getSalary();
	}
}
