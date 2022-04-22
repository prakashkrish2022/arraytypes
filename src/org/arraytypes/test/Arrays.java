package org.arraytypes.test;


public class Arrays {
public static void main(String[] args) {

	int k[]=new int[10];{
	k[0]=1;
	k[1]=2;
	k[2]=3;
	k[3]=4;
	k[4]=5;
	k[5]=6;
	k[6]=7;
	k[7]=8;
	k[8]=9;
	k[9]=10;
	int sum=0;
	int average=0;
	 for (int i = 0; i<k.length; i++) {
		sum=sum+k[i];
		average=sum/10;
		
	}
	
	System.out.println(sum);
	System.out.println(average);
	}	
		}
}