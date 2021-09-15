import java.util.Locale;
import java.util.Scanner;

public class Atbash {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej text k zasifrovani");
        String text = sc.nextLine().toLowerCase(Locale.ROOT);

        //System.out.println((int)text.charAt(0));

        for(int i = 0; i < text.length();i++) {
            int znak = text.charAt(i);
            int rozdil = znak - 97;
            rozdil = 122 - rozdil;
            System.out.println((char) rozdil);
        }
    }
}
