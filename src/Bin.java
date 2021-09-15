import java.util.Scanner;

public class Bin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo");
        int cislo = sc.nextInt();
        System.out.println(Integer.toString(cislo, 2));

    }
}
