import java.util.*;

class problem3{

					public static void main(String[] args) {
								int array[] = new int [9999999];
								int addition=0;


							Scanner digit=new Scanner(System.in);
							Scanner birdy = new Scanner(System.in);

							System.out.print("Enter the number of digits in the number that bird told you : ");
							int digits = digit.nextInt();
							
							System.out.print("Enter the number (digit by digit) bird told you :  ");
							
							for (int i =1; i<=digits ;i++ ) {
								 array[i]= birdy.nextInt();
								addition = addition+array[i];
							};

							System.out.print("Patrick and Johnny !... path "+addition+" will lead you to Alice !!..Best of Luck..!!");




						
					}


}