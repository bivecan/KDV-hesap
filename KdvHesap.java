import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("KDV'siz fiyat giriniz: ");
        double hamFiyat = inp.nextDouble();

        double oran = (hamFiyat > 1000) ? 0.08: 0.18;

        double kdv = hamFiyat * oran;
        double brutFiyat = hamFiyat+kdv;

        System.out.println("KDV'li Fiyat: " + brutFiyat);
        System.out.print("KDV tutarı: " + kdv);
    }
}
