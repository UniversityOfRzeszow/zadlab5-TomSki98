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

public class Liczba {

    public int liczba;
    Scanner s = new Scanner(System.in);

    public Liczba(int liczba) {
        this.liczba = liczba;
    }

    public int rozmiar_Tablicy(int liczba) {
        int licznik=0;
        while (liczba/10 != 0) {
            liczba = liczba / 10;
            licznik++;
        }
        return licznik;
    }
    int tab[] = new int[rozmiar_Tablicy(liczba)];

    void rozklad_Liczby(int liczba) {
        for (int i = 0; i < rozmiar_Tablicy(liczba); i++) {
            tab[i] = liczba%10;
            liczba = liczba/10;
        }
    }

    void wypisanie_Liczby() {
        System.out.println("Podana liczba to: " + this.liczba);
    }

    void podanie_Liczby() {
        System.out.print("Podaj liczbe: ");
        this.liczba = s.nextInt();
    }

    int silnia(int n) {
        if(n <=1 ) {
            return 1;
        } else {
            return n * silnia(n-1);
        }
    }
}
