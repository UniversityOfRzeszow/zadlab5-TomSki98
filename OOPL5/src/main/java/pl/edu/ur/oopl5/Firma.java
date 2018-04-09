/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author Tomasz
 */
import java.util.Scanner;

public class Firma {

    public String[][] spis = new String[100][4];
    Scanner s = new Scanner(System.in);
    int wiek = 0;

    String[][] Nowy_Pracownik(int y, String[][] spis) {
        while (y < 100) {
            Pracownik Pracownik = new Pracownik();
            System.out.println("Pracownik nr: " + (y + 1));
            System.out.println("Imie: ");
            Pracownik.imie = s.nextLine();
            spis[y][0] = Pracownik.imie;
            System.out.println("Nazwisko: ");
            Pracownik.nazwisko = s.nextLine();
            spis[y][1] = Pracownik.nazwisko;
            System.out.println("Stanowisko: ");
            Pracownik.stanowisko = s.nextLine();
            spis[y][2] = Pracownik.stanowisko;
            System.out.println("Wiek: ");
            Pracownik.wiek = s.nextInt();
            spis[y][3] = Integer.toString(Pracownik.wiek);
            y++;
        }
        System.out.println("Wypelniono wszystkie pola ");

        return spis;
    }

    void pokaz_Pracownika(int y, String[][] spis) {
        if (y > 0) {
            for (int z = 0; z < y; z++) {
                System.out.println("Lp.: " + (z + 1));
                System.out.println("Imie: " + spis[y][0]);
                System.out.println("Nazwisko: " + spis[y][1]);
                System.out.println("Stanowisko: " + spis[y][2]);
                System.out.println("Wiek: " + spis[y][3]);
            }
        } else {
            System.out.println("Koniec listy pracownikow");
        }
    }
}
