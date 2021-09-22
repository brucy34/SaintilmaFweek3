package core;

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
	public static void tableConstitution()
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
			tab[i]= scan().nextInt();
		}
		
		
		
		
		
	}
}
