package desafioMegaSena;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Random;
import java.util.Set;

public class MegaSena {
	Random rd = new Random();
	
	Scanner jogos = new Scanner(System.in);
	
    System.out.println("Quantos jogos você quer fazer?");
    int apostas = jogos.nextInt(); 
    Scanner numeros = new Scanner(System.in);
    System.out.println("Quantos números em cada jogo?");
    int numApostas = numeros.nextInt();
	
	Set<Integer> generated = new LinkedHashSet<Integer>();
	while (generated.size() < 6) //repeat as long as generated.size() < 6 -> means you dont have 6 unique integers
	{
	    Integer next = rd.nextInt(60) + 1;
	    // As we're adding to a set, this will automatically do a containment        check
	generated.add(next);
	}
	int[] lottery_numbers =  generated.toArray();
	//Do want you want to do with the 6 lottery numbers

}
