import java.util.*;

class problem4{

					public static void main(String[] args) {
								
								int area=0;
								int usesticks=0;

							Scanner digit=new Scanner(System.in);
							
							System.out.print("Enter the number of sticks : ");
							int sticks = digit.nextInt();
							
							if ((sticks%2)!=0)
							{

									usesticks=sticks-1;

							}else{usesticks=sticks;};


							int sticks_side = usesticks/4; 	

							area = (int)((sticks_side*2) * (sticks_side*2));




							System.out.print( area+"cm2 is the area of largest square that can be formed from "+sticks+" sticks");




						
					}


}