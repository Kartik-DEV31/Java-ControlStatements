import java.util.*;

class problem6{
						public static void main(String[] args) {
									float fullTile = 0;
							

									Scanner widthRoom = new Scanner(System.in);
									System.out.print("Enter the width of room : ");
									int width=widthRoom.nextInt();

									Scanner lengthRoom = new Scanner(System.in);
									System.out.print("Enter the length of room : ");
									int length=lengthRoom.nextInt();


									float areaRoom = (float)(length * width);


									float tileReq = (float)(areaRoom / 64);
									float tileReq1 = tileReq;
									

									for (float i=1; i<=tileReq; ) {
										fullTile=tileReq;
                                    
										if((fullTile%10)==0) {break;}
										else {tileReq=(float)(tileReq-0.5);};
										
									}


									System.out.println("Full tiles required = "+fullTile);
									System.out.print("Number of tile whose parts were used = "+((float)(tileReq1-fullTile)*2));



						}







}