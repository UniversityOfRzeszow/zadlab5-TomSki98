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

public class Pracownik {

    public String imie = "";
    public String nazwisko = "";
    public String stanowisko = "";
    public int wiek = 0;

    Scanner s = new Scanner(System.in);

    public Pracownik(String imie, String nazwisko, String stanowisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.wiek = wiek;
    }

    Pracownik() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Nowy_Pracownik() {
        System.out.println("Podaj dane nowego pracownika");
        System.out.println("Imie: ");
        this.imie = s.nextLine();
        System.out.println("Nazwisko: ");
        this.nazwisko = s.nextLine();
        System.out.println("Stanowisko: ");
        this.stanowisko = s.nextLine();
        System.out.println("Wiek: ");
        this.wiek = s.nextInt();
    }
}
