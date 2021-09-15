import java.util.Scanner;

public class Ryba {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej kolik ryb chces k veceri");
        int cislo = sc.nextInt();

        for(int i = 0; i < cislo; i++) {
            System.out.println("<°)))-<");
        }
    }
}
