package lab2;

import java.util.Random;

public class test {

	void replace(int p1, int p2, double tab[]) {
		for(int i =0; i < tab.length; i++) {
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		double tab[] = {1.0,2.0,3.0,4.0,5.0,6.0,7.0};
		
		int r1 = r.nextInt(tab.length - 1);
		int r2 = r.nextInt(tab.length - 1);
		
		//check if the 2 randoms numbers are differents
		while(true) {
			if(r1 == r2 || r1 > r2) {
				 r2 = r.nextInt(tab.length - 1);
			}else {
				break;
			}
		}
		
		
		//
		int sizeTab = r2 - r1 + 1;
		double tabTemp[] = new double[sizeTab];
		int j = r1;
		for(int i = 0; i < sizeTab; i++) {
			tabTemp[i] = tab[j];
			j++;
		}
		
		
		//tab reverse 
		for(int i = 0; i < tabTemp.length / 2; i++)
		{
		      double temp = tabTemp[i];
		      tabTemp[i] = tabTemp[tabTemp.length - i - 1];
		      tabTemp[tabTemp.length - i - 1] = temp;
		}
		
		
		for(int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " - ");
		}
		
		System.out.println();
		
		for(int i = 0; i < tabTemp.length; i++) {
			System.out.print(tabTemp[i] + " - ");
		}
		
		int var = r1;
		for(int i = 0; i < tabTemp.length; i++) {
			tab[var] = tabTemp[i];
			var++;
		}

		System.out.println();
		System.out.println("Nombre 1 : " + r1 );
		System.out.println("Nombre 2 : " + r2 );

		for(int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " - ");
		}
		
	}

}
