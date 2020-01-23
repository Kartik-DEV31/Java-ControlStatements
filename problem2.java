import java.util.*;


class problem2{

		public static void main(String[] args) {
			int numb[]=new int[100];
			int add[]=new int[100];
			int addition=0;
			int j=1;
		 Scanner num = new Scanner(System.in);
		 Scanner enter_numbers = new Scanner(System.in);
		 System.out.println("Enter the no. of numbers :- ");
		int n=num.nextInt();
		 if(n>0){

		 	System.out.println("Enter "+n+" number(s) :- ");
		 for (int i = 1; i<=n ; i++ ) {

		 				numb[i] = enter_numbers.nextInt();
		 	
		 			}
		 		}

		 		else
		 			System.out.println("No. of numbers cant be ZERO. Try again");

System.out.print("positive numbers are = " );

		 		for (int i = 1 ; i<=n ; i++ ) {

		 			if (numb[i]>=0 ){
                         System.out.print(" "+numb[i]);
                         for (;j<=n ; ) 
                         {
                         		add[j]=numb[i];
                         		j++;
                         		break;	
                         }

						 			};


		 			
		 								};



System.out.println(" ");

		 			

System.out.print("number entered by you are = " );

		 			for (int i = 1; i<=n ; i++ ) {

		 				System.out.print(" "+numb[i]);
		 	
		 			};


System.out.println(" ");

System.out.print(" sum of positive numbers = " );

		 			for (int i = 1; i<=n ; i++ ) {

		 				addition=addition+add[i];
		 	
		 			};
		 	
System.out.print(" "+addition);




		}

}
