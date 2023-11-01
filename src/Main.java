import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         Masina masina = new Masina();
         masina.marka = "MERCEDES-BENZ";
         masina.model = " W 218 AMG";
         masina.abom =  6.3;
         masina.gotvyhoda= 2013;
        System.out.println(masina);

        Masina masina1 = new Masina();
        masina1.marka = "BMW";
        masina1.model = "F 90 ALPHINE";
        masina1.abom =  4.4;
        masina1.gotvyhoda= 2010;
        System.out.println(masina1);

        Masina masina2 = new Masina();
        masina2.marka = "TOYOTA";
        masina2.model = "SUPRA ";
        masina2.abom = 3.5;
        masina2.gotvyhoda= 2001;
        System.out.println(masina2);

    }
}
