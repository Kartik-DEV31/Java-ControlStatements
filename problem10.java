					import java.util.*;

					class problem10{

							public static void main(String[] args) {

									int old=1;
									int oldest=0;
									int newv = 0;
								
									Scanner m=new Scanner(System.in);
									System.out.print("Enter the month(s)");
									int month = m.nextInt();


									if (month<=3 && month>1)

									{

										System.out.print("Age of amoeba = 1");


									}
									else if (month<=1)

									{

										System.out.print("Age of amoeba = 0");

									} 

									else {



									for (int i = 1 ; i<=month-2;)

									{

										newv = oldest + old;
										
										oldest = old ;
										old = newv;
										i++;


									}


									System.out.print("Age of amoeba = "+newv );

										}





							}




					}