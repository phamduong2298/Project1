package dahinh;

public class LaiXuat {
	public static void main(String args[]) {
		Bank a = new BankA();
		Bank x = new BankX();
		Bank m = new BankM();
		System.out.printf("Lai xuat ngan hang A la:%d \n", a.getRateOfIntereset());
		System.out.printf("Lai xuat ngan hang M la:%d \n", m.getRateOfIntereset());
		System.out.printf("Lai xuat ngan hang X la:%d \n ", x.getRateOfIntereset());
	}
}
