package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Podaj liczbę: ");
	int a = in.nextInt();
	int x = 0;
	if(a <=0) {
	    System.out.print("Liczba musi być całkowita i dodatnia.");
    }
    else{
			for (int i = 0; x <= a; i++) {
				System.out.println(x);
				x = (int) Math.pow(2, i);

			}
		}
    }

}
