import java.util.*;

class problem1{

					public static void main(String[] args) {
								
								int array[] = new int[1000];
							
							
							System.out.print("The series till 100 goes like  : 2");
							array[1]=2;
							int j=1;

							
							for(int i=2 ;i<=100;i++)

							{

								if ((i%2)!=0)
								{

									if (i<=11)
									{
										if ((i%2)!=0 && (i%9)!=0)
									
									{
										System.out.print(" , "+i);
										j=j+1;
										array[j]=i;
									}
									}



									else if((i%3)!=0 &&(i%5)!=0 && (i%7)!=0)
										System.out.print(" , "+i);
										j=j+1;
										array[j]=i;


								}



							};
System.out.println(" ");


								for (int i =1 ; i<=100; )
								{
									System.out.print(" "+array[i]+" ");
									i=i+2;

								}
							



						
					}


}