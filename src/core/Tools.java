package core;

import java.util.Arrays;
import java.util.Scanner;

public class Tools {

	private static int aNumber;
	private static int tab[];
	
	
	public static int getaNumber() {
		return aNumber;
	}
	public static void setaNumber(int aNumber) {
		Tools.aNumber = aNumber;
	}
	public static int[] getTab() {
		return tab;
	}
	public static void setTab(int[] tab) {
		Tools.tab = tab;
	}
 Tools(int aNumber,int tab[])
	{
		Tools.aNumber = aNumber;
		System.arraycopy(tab, 0, Tools.tab, 0,tab.length);
	}
	public static Scanner scan()
	{
		Scanner scn = new Scanner(System.in);
		return scn;	
	}
//	public static int[] tableConstitution()
//	{	
//		System.out.println(Arrays.toString(tab));
//		return tab;//[aNumber];
//	}
	
	public static void ascendingTab()
	{
		System.out.println("Faites-un choix parmi les methodes");
		System.out.println("1.-Tri a bulle\n2.-Tri par transposition\n3.-Tri par selection\n4.-Tri par insertion lineaire");
		int choice=scan().nextInt();
		
			switch(choice)
			{
			 case 1:{//firstMethod(tri a bulle)
					   for(int p=0;p<tab.length;p++)
					   {
						   for(int i=1;i<tab.length-p;i++)
						   {
							   int temp;
							   if(tab[i-1]>tab[i])
							   {
								   temp=tab[i-1];
								   tab[i-1]=tab[i];
								   tab[i]=temp;
							   }   
						   }
			           }
					   System.out.println(Arrays.toString(tab));
			        }break;
			 case 2:{//secondMethod(tri par transposition)
				 int j,temp;
				 		for(int i=0;i<tab.length;i++)
				 		{
				 			if(tab[i]>tab[i+1])
				 			{
				 				
				 				temp=tab[i];
				 				tab[i]=tab[i+1];
				 				tab[i+1]=temp;
				 				j=i--;
				 				while(j>=0)
				 				{
				 					
				 					if(tab[j]>tab[j+1])
				 					{
				 						temp=tab[j];
				 						tab[j]=tab[j+1];
				 						tab[j+1]=temp;
				 						j--;
				 						System.out.println("I'm out");
				 					}
				 					else
				 						j=0;
				 				}
				 			}
				 		}
				 		System.out.println(Arrays.toString(tab));
			 		}break;
			 case 3:{//thirdmethod(tri par selection)
				 		int min,k;
				 		for(int i=0;i<tab.length;i++)
				 		{
				 			min=tab[i];
				 			k=i;
				 			for(int j=i+1;j<tab.length-1;j++)
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
				 		System.out.println(Arrays.toString(tab));
			 		}break;
			 case 4:{//fourthMethod(tri par insertion lineaire
				 		int x,j;
				 		for(int i=1;i<tab.length-1;i++)
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
				 		System.out.println(Arrays.toString(tab));
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
	public static int minimum(int x,int y)
	{
		return (x<=y)? x:y;
	}
	public static void searchOnTable()
	{
		System.out.println("Veuillez indiquer la metode de recherche");
		System.out.println("1.-Methode dichotomique\n2.-Methode lineaire\n3.-Methode de fibonacci\n4.-Methode Jump");
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
					
					while(fibM<tab.length)
					{
						fib1=fib2;
						fib2=fibM;
						fibM=fib1+fib2;
					}
					
					int decal=-1;
					
					while(fibM>1)
					{
						int i=minimum(decal+fib1,tab.length-1);
						
						if(tab[i]<number)
						{
							fibM=fib2;
							fib2=fib1;
							fib1=fibM-fib2;
							decal=i;
						}
						else if(tab[i]>number)
						{
							fibM=fib1;
							fib2=fib2-fib1;
							fib1=fibM-fib2;
						}
						else
							System.out.println("Votre nombre existe dans le tableau\n");
					}
					if(fib2==1 && tab[tab.length-1]== number)
						System.out.println("Votre nombre existe dans le tableau\n");
					System.out.println("Votre nombre n'existe pas dans le tableau\n");
			   }break;
		case 4:{//JumpMethod
					int n= tab.length;
					int saut=(int)Math.floor(Math.sqrt(n));
					int prev=0;
					
					while(tab[Math.min(saut, n)-1]<number)
					{
						prev=saut;
						saut+=(int)Math.floor(Math.sqrt(n));
						if(prev>=n)
							System.out.println("Votre nombre n'exixte pas dans le tableau");
					}
					
					while(tab[prev]<number)
					{
						prev++;
						if(prev==Math.min(saut, n))
							System.out.println("Votre nombre n'exixte pas dans le tableau");
					}
					
					if(tab[prev]==number)
						System.out.println("Votre nombre existe dans le tableau");
					
					System.out.println("Votre nombre n'exixte pas dans le tableau");
			
		       }break;
		  default:
			  System.out.println("Erreur de saisie");
		}
		
		
	}
}
