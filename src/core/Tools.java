package core;

import java.util.Arrays;
import java.util.Scanner;

public class Tools {

	private static int aNumber;
	private static int bNumber;
	private static int tab[];
	
	
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
	
	public static void ascendingTab()
	{
		System.out.println("Faites-un choix parmi les methodes");
		System.out.println("1.-Tri a bulle\n2.-Tri par transposition\n3.-Tri par selection\n4.-Tri par insertion lineaire");
		int choice=scan().nextInt();
		
			switch(choice)
			{
			 case 1:{//firstMethod(tri a bulle)
					   for(int p=0;p<=tab.length;p++)
					   {
						   for(int i=0;i<=tab.length-p;i++)
						   {
							   int temp;
							   if(tab[i]>tab[i+1])
							   {
								   temp=tab[i];
								   tab[i]=tab[i+1];
								   tab[i+1]=temp;
							   }
						   }
			           }
			        }break;
			 case 2:{//secondMethod(tri par transposition)
				 int j,temp;
				 		for(int i=0;i<=tab.length;i++)
				 		{
				 			if(tab[i]>tab[i+1])
				 			{
				 				
				 				temp=tab[i];
				 				tab[i]=tab[i+1];
				 				tab[i+1]=temp;
				 				j=i--;
				 				while(j>=1)
				 				{
				 					if(tab[j]>tab[j+1])
				 					{
				 						temp=tab[j];
				 						tab[j]=tab[j+1];
				 						tab[j+1]=temp;
				 						j--;
				 					}
				 					else
				 						j=0;
				 				}
				 			}
				 		}
			 		}break;
			 case 3:{//thirdmethod(tri par selection)
				 		int min,k;
				 		for(int i=0;i<=tab.length;i++)
				 		{
				 			min=tab[i];
				 			k=i;
				 			for(int j=i+1;j<=tab.length-1;j++)
				 			{
				 				if(min>tab[j])
				 				{
				 					min=tab[j];
				 					k=j;
				 				}
				 				tab[k]=tab[i];
				 				tab[i]=min;
				 			}
				 		}
			 		}break;
			 case 4:{//fourthMethod(tri par insertion lineaire
				 		int x,j;
				 		for(int i=1;i<=tab.length-1;i++)
				 		{
				 			x=tab[i];
				 			j=i--;
				 			while(j>=0 && x<tab[j])
				 			{
				 				tab[j+1]=tab[j];
				 				j--;
				 			}
				 			tab[j+1]=x;
				 		}
			 		}break;
			 default:
				 System.out.println("Erreur!!");
			}
		
	}
	
	public static void descendingTable()
	{
		System.out.println("Faites-un choix parmi les methodes");
		System.out.println("1.-Tri a bulle\n2.-Tri par transposition\n3.-Tri par selection\n4.-Tri par insertion lineaire");
		int choice=scan().nextInt();
		
			switch(choice)
			{
			 case 1:{//firstMethod(tri a bulle)
					   for(int p=0;p<=tab.length;p++)
					   {
						   for(int i=0;i<=tab.length-p;i++)
						   {
							   int temp;
							   if(tab[i]<tab[i+1])
							   {
								   temp=tab[i];
								   tab[i]=tab[i+1];
								   tab[i+1]=temp;
							   }
						   }
			           }
			        }break;
			 case 2:{//secondMethod(tri par transposition)
				 int j,temp;
				 		for(int i=0;i<=tab.length;i++)
				 		{
				 			if(tab[i]<tab[i+1])
				 			{
				 				
				 				temp=tab[i];
				 				tab[i]=tab[i+1];
				 				tab[i+1]=temp;
				 				j=i--;
				 				while(j>=1)
				 				{
				 					if(tab[j]<tab[j+1])
				 					{
				 						temp=tab[j];
				 						tab[j]=tab[j+1];
				 						tab[j+1]=temp;
				 						j--;
				 					}
				 					else
				 						j=0;
				 				}
				 			}
				 		}
			 		}break;
			 case 3:{//thirdmethod(tri par selection)
				 		int max,k;
				 		for(int i=0;i<=tab.length;i++)
				 		{
				 			max=tab[i];
				 			k=i;
				 			for(int j=i+1;j<=tab.length-1;j++)
				 			{
				 				if(max<tab[j])
				 				{
				 					max=tab[j];
				 					k=j;
				 				}
				 				tab[k]=tab[i];
				 				tab[i]=max;
				 			}
				 		}
			 		}break;
			 case 4:{//fourthMethod(tri par insertion lineaire
				 		int x,j;
				 		for(int i=1;i<=tab.length-1;i++)
				 		{
				 			x=tab[i];
				 			j=i--;
				 			while(j>=0 && x>tab[j])
				 			{
				 				tab[j+1]=tab[j];
				 				j--;
				 			}
				 			tab[j+1]=x;
				 		}
			 		}break;
			 default:
				 System.out.println("Erreur!!");
				 break;
			}
		
	}
	public static void searchOnTable()
	{
		System.out.println("Veuillez indiquer la metode de recherche");
		System.out.println("1.-Methode dichotomique\n2.-Methode lineaire\n3.-Methode de fibonacci");
		int choice=scan().nextInt();
		System.out.println("Faites le choix du nombre");
		int number=scan().nextInt();
		
		switch(choice)
		{
		case 1:{//dichotomicMethod
				  int inf=1,sup=tab.length,center=(inf+sup)/2;
				  boolean trouv=true;
				
				  while(!trouv && inf <= sup)
				  {
					  if(tab[center]==number)
					  {
						trouv=true;
					  }
					  else if(number<tab[center])
						sup= center-1;
					  else
						inf=center+1;
					
					center=(inf+sup)/2;
				  }
				
			   }break;
		case 2:{//linearMethod
					for(int i=0;i<tab.length;i++)
					{
						if(tab[i]==number)
						{
							System.out.println("trouve");
						}
					}
			   }break;
		case 3:{//fibonacciMethod
					int fib1=0,fib2=1,fibM=fib1+fib2;
					
					//while(fibM<n)
			   }
		}
		
		
	}
}
