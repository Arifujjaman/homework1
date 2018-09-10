import java.util.Random;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		final int a=20;
		int []array=new int [a];
		Random rand = new Random();
		for(i=0;i<20;i++){
			array[i]=rand.nextInt(6);
			
		}
		int check=0;
		for(i=0;i<20;i++){
			if(i<(a-1) && array[i]==array[i+1]){
				if(check==0)
				System.out.print("(");
			    check=1;
			}
		    System.out.print(array[i]);
		    System.out.print(" ");
		
		    if(check==1){
		    	if(i<(a-1)&& array[i]!=array[i+1]){
		    		System.out.print(")");
		    		check=0;
		    	}
		    }
		}
				
	}

}
