package provjerajelibrojprimarni;

import java.util.Scanner;

public class ProvjeraJeliBrojPrimarni {

    public static void main(String[] args) {
        int temp;
        boolean jestPrim = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite neki broj:");
        //zapisuje unesenu vrijednost kao integer.
        int broj = scan.nextInt();
        scan.close();
        for (int i = 2; i <= broj / 2; i++) {
            temp = broj % i;
            if (temp == 0) {
                jestPrim = false;
                break;
            }
        }
        //Ako jestPrim je true onda broj jeste primarni, a ako nije onda nije primarni broj.
        if (jestPrim) {
            System.out.println(broj + " jest primarni broj.");
        } else {
            System.out.println(broj + " nije primarni broj.");
        }
    }

}
