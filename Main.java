import java.util.Scanner;
//Patika.dev linkim -> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args) {
        double pi = 3.14, r, a, alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Yari Cap Giriniz :");
        r = input.nextDouble();
        System.out.print("Merkez Acisinin Olcusunu Giriniz :");
        a = input.nextDouble();

        alan = (pi*(r*r)*a)/360;

        System.out.print("Daire Diliminin Alani :" + alan);
    }
}