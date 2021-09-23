package core;

import java.util.Arrays;
import java.util.Scanner;

public class Tools {

	private int aNumber;
	private int bNumber;
	
	
	public Tools(int aNumber,int bNumber)
	{
		this.aNumber = aNumber;
		this.bNumber = bNumber;
	}
	public static Scanner scan()
	{
		Scanner scn = new Scanner(System.in);
		return scn;	
	}
	public static int tableConstitution()
	{
		int aNumber;
		int bNumber;
		System.out.println("Veuillez entrez la grandeur du tableau");
		scan();
		aNumber = scan().nextInt();
		int tab[]=new int [aNumber];
		
		System.out.println("Veuillez entrez les valeurs du tablau");
		scan();
		
		
		for(int i=1;i<=aNumber;i++)
		{
			if(tab[i]==1)
			{
				System.out.println("Veuillez entrez le premier nombre");
				tab[i]= scan().nextInt();
			}
			else if(tab[i]==aNumber)
			{
				System.out.println("Veuillez entrez la derniere valeur");
				tab[i]=scan().nextInt();
			}
			else
			{
				System.out.println("Veuillez entrez la valeur suivante");
				tab[i]=scan().nextInt();
			}
		}
		
		System.out.println(Arrays.toString(tab));
		return tab[aNumber];
	}
	
	public static void ordonnerTab1()
	{
		//linearyMethod
		
	}
}
