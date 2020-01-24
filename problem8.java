import java.util.*;

							class problem8{

								public static void main(String[] args) {
									
									Scanner t = new Scanner(System.in);
									System.out.print("Enter the target : ");
									int target = t.nextInt();

									Scanner h = new Scanner(System.in);
									System.out.print("Enter youre score : ");
									int hit =  h.nextInt();

									int n= hit;
									int count = 0;


									for (int i = n ;i<=target;i++  ){

											count++;
											System.out.print("Enter youre score : ");
											hit = h.nextInt();
											n=n+hit;

											if (n>=target){ System.out.print("you took "+(count+1)+" chances..Now go and have food!!! ") ;break; }


									}







								}




							}