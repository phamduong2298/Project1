package kethua;

public class GhiDePhuongThuc extends NhanVien{
	void getSalary() {
		System.out.printf("Luong cua lap trinh vien la:%f", salary);
	}
	public static void main(String args[]) {
		GhiDePhuongThuc x = new GhiDePhuongThuc();
		x.getSalary();
	}
}
