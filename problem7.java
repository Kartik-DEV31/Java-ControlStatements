import java.util.*;


								class problem7{

									public static void main(String[] args) {
										
										Scanner n  = new Scanner(System.in);
										float num  = 0;
										
										float countodd = 0; 
										float countneg = 0; 
										float a = 0;
										int i = 1;// because while loop takes i from 0//
										int flag=0; 

										System.out.print("Enter the numbers : ");

										while(i<=3)
												{

												num = n.nextFloat();

												if (num%2!=0 ) {i++ ; countodd++ ;}

												else if(num % 2==0 && num>0) {countodd=(float)(countodd-0.5); }

												else if(num < 0) {flag++ ;countneg=(float)(countodd-1);break;};

													
												}			
												


								

								System.out.println(" ");
								
								
								if (flag ==1)
								{
								System.out.print("Youre score is  = "+countneg);
								}else {System.out.println("Youre score is = "+countodd);};

							}
						}