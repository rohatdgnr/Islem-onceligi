import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 3 sayıyı al
        System.out.print("Lütfen birinci sayıyı girin: ");
        double a = scanner.nextDouble();
        System.out.print("Lütfen ikinci sayıyı girin: ");
        double b = scanner.nextDouble();
        System.out.print("Lütfen üçüncü sayıyı girin: ");
        double c = scanner.nextDouble();

        // İşlemi gerçekleştir ve sonucu ekrana yazdır
        double sonuc = a + b * c - b;
        System.out.println("İşlem sonucu: " + sonuc);


    }
}