package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 5, 6
        
        Scanner s = new Scanner(System.in);
        Firma Firma = new Firma();

        String[][] yy = Firma.spis;
        System.out.println("Wybierz działanie:");
        System.out.println("1 - Dodaj pracownika");
        System.out.println("2 - Wyświetl liste");

        int x = 0;
        int wybor;
        wybor = s.nextInt();

        switch (wybor) {

            case (1):
                Firma.Nowy_Pracownik(x, yy);
                while (x < 100) {
                    x++;
                }
                break;
            case (2):
                Firma.pokaz_Pracownika(x, yy);
                break;
        }
    }
}
