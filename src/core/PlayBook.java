package core;

import java.util.Arrays;

public class PlayBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aNumber,tab[];
		System.out.println("Veuillez entrez la grandeur du tableau");

		aNumber =Tools.scan().nextInt();
		tab=new int [aNumber];
		
		
		
		
		for(int i=0;i<=aNumber-1;i++)
		{
			if(i==0)
			{
				System.out.println("Veuillez entrez le premier nombre");
				tab[i]= Tools.scan().nextInt();
			}
			else if(i==aNumber-1)
			{
				System.out.println("Veuillez entrez la derniere valeur");
				tab[i]=Tools.scan().nextInt();
			}
			else
			{
				System.out.println("Veuillez entrez la valeur suivante");
				tab[i]=Tools.scan().nextInt();
			}
		}
		Tools.setTab(tab);
		System.out.println(Arrays.toString(Tools.getTab()));
		System.out.println("Faites un choix d'ordre");
		System.out.println("1.-Ordre croissant\n2.-Ordre decroissant");
		int choice=Tools.scan().nextInt();
		switch(choice)
		{
		case 1:{
					Tools.ascendingTab();
			   }break;
		case 2:{
					Tools.descendingTable();
			   }break;
		}
	}

}
