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
public class Stos {
    
    Scanner w = new Scanner(System.in);
    
    private int indeks=0;
    private int rozmiar;
    public int stos[];

    public Stos(int n) {
        this.rozmiar = n;
        this.stos = new int[n];
    }
    public void push(){
        if(indeks < rozmiar){
            System.out.println("Podaj liczbe ktora chcesz dodac na stos: ");
            indeks++;
            stos[indeks]=w.nextInt();
        }else{  
            System.out.println("Stos jest pelny ");
        }
    }
    public void pop(){
        if(indeks >= 1){
            System.out.println("Usuwam ostatni element ze stosu: ");
            stos[indeks]=0;
            indeks--;
        }else{
            System.out.println("Stost jest pusty ");
        }
    }
    public void pokaz_Stos(){
        System.out.println("Stos: ");
        for (int s = indeks ; s >= 1; s++){
            System.out.println(stos[s]);
        }
    }
    }
