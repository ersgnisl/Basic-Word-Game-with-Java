import java.util.Scanner;
import java.util.Random;
public class ErsagunIslamogullariMIS131LastHomework {

	public static void main(String[] args) {
		
		
		
			
			Scanner scan = new Scanner (System.in);
			String cevap;
			int secim1;
			String appearance4 = "****";
			String appearance5 ="*****",appearance6 = "******" ;
			int numberA4 = 0, numbera5=0, numbera6=0;
			int ms4,ms5,ms6;
			int s4=0,s5=0,s6=0;
			int max4=400, max5=500, max6=600;
			
		

			String [][] arr = new String [2][9];
			arr [0][0] = "1)What is the antonym of the word hot? ";
			arr [0][1] = "1)an amount that has to be paid or spent to buy or obtain something ? ";
			arr [0][2] = "1)a verb used for perceiving with the ear the sound made by someone or something?";
			arr [0][3] = "2)an establishment providing accommodation, meals, and other services for travellers and tourists?";
			arr [0][4] = "2)the name of a book, composition, or other artistic work ?";
			arr [0][5] = "2)a state or assert that something is the case, typically without providing evidence or proof?";
			arr [0][6] = "3)a cause, explanation, or justification for an action or event ?";
			arr [0][7] = "3)a thing designed or used for inflicting bodily harm or physical damage? ";
			arr [0][8] = "3) a person with whom one has a bond of mutual affection, typically one exclusive of sexual or family relations ? ";
			arr [1][0] = "cold";
			arr [1][1] = "cost";
			arr [1][2] = "hear";
			arr [1][3] = "hotel";
			arr [1][4] = "title";
			arr [1][5] = "claim";
			arr [1][6] = "reason";
			arr [1][7] = "weapon";
			arr [1][8] = "friend";
			
			// the game is starting
					
			System.out.println("Welcome to the word game. You will give an answer for 3 questions.");
			System.out.println("Your first question consists of 4 letters.");
			System.out.println();
		
			int a = (int) (Math.random()*3);
			int b = a;
			
			System.out.println(arr[0][a]);
			System.out.println(appearance4);
			
				
			for (int i =0; i<4; i++) {
				
				System.out.println("Enter 1 to answer or enter 2 to request a letter:");
				secim1= scan.nextInt();	
					
				while (secim1>2 || secim1<1) {	
					System.out.println("Enter 1 to answer or enter 2 to request a letter:");
					secim1= scan.nextInt();		}
				
				if (secim1 ==1) {
					System.out.println("Please write your word");
					cevap = scan.next();
					
					if (cevap.equals(arr[1][b])) {
						System.out.println("Congrats! that is correct");
						s4 = max4- (numberA4*100);
						System.out.println("You gained "+ (4-numberA4)*100 +" points from this question. \nYour total score for now is " + s4);
						System.out.println();
						System.out.println("your next question consists of 5 letters.");

						break;
						
					} else {
						System.out.println("Wrong! ");
						s4 = (max4*-1) + (numberA4*100);
						System.out.println("You lost " + (4-numberA4)*100 + "points from this question. \nYour total score for now is " + s4);
						System.out.println();
						System.out.println("your next question consists of 5 letters.");

						break;
					}
				} 
				
				while (secim1 ==2) {
				numberA4++;
				
				
				int c = (int) ((Math.random()*4)+1);

				
				if (c == 1) {
					if (appearance4.substring(0,1).equals("*")) {
					appearance4 = appearance4.substring(0,0) + arr[1][b].substring(0, 1)+ appearance4.substring(1);
				 	System.out.println(appearance4);
				 	} else {
				 		int[] name2  = {2,3,4};
				 		int c1 = (int) ((Math.random()*3));
				 		c1 = name2[c1];
				 		c1=c;
				 		int k=1;
				 		k ++;
				 		numberA4 -= k-1; 
				 		continue;
				 	}
					break;
					} 
				
				else if (c==2) {
					if (appearance4.substring(1,2).equals("*")) {
					appearance4 = appearance4.substring(0,1) + arr[1][b].substring(1, 2)+ appearance4.substring(2);
				 	System.out.println(appearance4);
				} else {
				
			 		int[] name  = {1,3,4};
			 		int c1 = (int) ((Math.random()*3));
			 		c1 = name[c1];
			 		c1=c;
			 		int k=1;
			 		k ++;
			 		numberA4 -= k-1; 
			 		continue;
				} 
					break;
					}
				
				else if (c==3) {
					if (appearance4.substring(2,3).equals("*")) {
					
					appearance4 = appearance4.substring(0,2) + arr[1][b].substring(2, 3)+ appearance4.substring(3);
				 	System.out.println(appearance4);}
					else {
					
						int[] name1  = {1,2,4};
				 		int c1 = (int) ((Math.random()*3));
				 		c1 = name1[c1];
				 		c1=c;
				 		int k=1;
				 		k ++;
				 		numberA4 -= k-1; 
				 		continue;
					}
					break;
				} else if (c ==4) {
					if (appearance4.substring(3,4).equals("*")) {
					appearance4 = appearance4.substring(0,3) + arr[1][b].substring(3, 4)+ appearance4.substring(4);
				 	System.out.println(appearance4);}
					else {
						int[] name4  = {1,2,3};
				 		int c1 = (int) ((Math.random()*3 ));
				 		c1 = name4[c1];
				 		c1=c;
				 		int k=1;
				 		k ++;
				 		numberA4 -= k-1; 
				 		continue;
					}
					break;
				}
				
				
				} 
				
			}
			
			if(appearance4.equals(arr[1][b])){
				s4 = 0;
				System.out.println("you couldn't find the answer. you got 0 points");
				System.out.println("your total score for now is:" + s4);
				System.out.println();
				System.out.println("your next question consists of 5 letters.");
				
			}
			
			
			
			
			 a = (int) ((Math.random()*3) +3);
			 b = a;
		
			
			System.out.println(arr[0][a]);
			System.out.println(appearance5);
			
				
			for (int i =0; i<5; i++) {
				
				System.out.println("Enter 1 to answer or enter 2 to request a letter:");
				secim1= scan.nextInt();
			

					
				while (secim1>2 || secim1<1) {	
					System.out.println("Enter 1 to answer or enter 2 to request a letter:");
					secim1= scan.nextInt();		}
				
				if (secim1 ==1) {
					System.out.println("Please write your word");
					cevap = scan.next();
					
					if (cevap.equals(arr[1][b])) {
						System.out.println("Congrats! that is correct");
						s5 = max5- (numbera5*100);
						System.out.println("You gained "+ (5-numbera5)*100 +" points from this question. \nYour total score for now is " + (s5+s4));
						System.out.println();
						System.out.println("your next question consists of 6 letters.");

						break;
						
					} else {
						System.out.println("Wrong! ");
						s5 = (max5*-1) + (numbera5*100);
						System.out.println("You lost " + (5-numbera5)*100 + "points from this question. \nYour total score for now is " + (s4+s5));
						System.out.println();
						System.out.println("your next question consists of 6 letters.");


						break;
					}
				} 
				
				while (secim1 ==2) {
				numbera5++;
				
				
				int c = (int) ((Math.random()*5)+1);

				
				if (c == 1) {
					if (appearance5.substring(0,1).equals("*")) {
					appearance5 = appearance5.substring(0,0) + arr[1][b].substring(0, 1)+ appearance5.substring(1);
				 	System.out.println(appearance5);
				 	} else {
				 		int[] name2  = {2,3,4,5};
				 		int c1 = (int) ((Math.random()*4));
				 		c1 = name2[c1];
				 		c1=c;
				 		int k=1;
				 		k ++;
				 		numbera5 -= k-1; 
				 		continue;
				 	}
					break;
					} 
				
				else if (c==2) {
					if (appearance5.substring(1,2).equals("*")) {
					appearance5 = appearance5.substring(0,1) + arr[1][b].substring(1, 2)+ appearance5.substring(2);
				 	System.out.println(appearance5);
				} else {
				
			 		int[] name  = {1,3,4,5};
			 		int c1 = (int) ((Math.random()*4));
			 		c1 = name[c1];
			 		c1=c;
			 		int k=1;
			 		k ++;
			 		numbera5 -= k-1; 
			 		continue;
				} 
					break;
					}
				
				else if (c==3) {
					if (appearance5.substring(2,3).equals("*")) {
					
					appearance5 = appearance5.substring(0,2) + arr[1][b].substring(2, 3)+ appearance5.substring(3);
				 	System.out.println(appearance5);}
					else {
					
						int[] name1  = {1,2,4,5};
				 		int c1 = (int) ((Math.random()*4));
				 		c1 = name1[c1];
				 		c1=c;
				 		int k=1;
				 		k ++;
				 		numbera5 -= k-1; 
				 		continue;
					}
					break;
				} else if (c ==4) {
					if (appearance5.substring(3,4).equals("*")) {
					appearance5 = appearance5.substring(0,3) + arr[1][b].substring(3, 4)+ appearance5.substring(4);
				 	System.out.println(appearance5);}
					else {
						int[] name4  = {1,2,3,5};
				 		int c1 = (int) ((Math.random()*4));
				 		c1 = name4[c1];
				 		c1=c;
				 		int k=1;
				 		k ++;
				 		numbera5 -= k-1; 
				 		continue;
					}
					break;
				} else if (c ==5) {
					if (appearance5.substring(4,5).equals("*")) {
					appearance5 = appearance5.substring(0,4) + arr[1][b].substring(4, 5)+ appearance5.substring(5);
				 	System.out.println(appearance5);}
					else {
						int[] name4  = {1,2,3,4};
				 		int c1 = (int) ((Math.random()*4));
				 		c1 = name4[c1];
				 		c1=c;
				 		int k=1;
				 		k ++;
				 		numbera5 -= k-1; 
				 		continue;
					}
					break;
				}
				
				
				} // end of if which is about user wants a letter 
				
			}// end of second for
			if(appearance5.equals(arr[1][b])){
				s5 = 0;
				System.out.println("you couldn't find the answer. you got 0 points");
				System.out.println("your total score for now is:" + (s4+s5));
				System.out.println();
				System.out.println("your next question consists of 6 letters.");

				
			}
			 a = (int) ((Math.random()*3) +6);
			 b = a;
		
			
			System.out.println(arr[0][a]);
			System.out.println(appearance6);
			
				
			for (int i =0; i<6; i++) {
				
				System.out.println("Enter 1 to answer or enter 2 to request a letter:");
				secim1= scan.nextInt();
			

					
				while (secim1>2 || secim1<1) {	
					System.out.println("Enter 1 to answer or enter 2 to request a letter:");
					secim1= scan.nextInt();		}
				
				if (secim1 ==1) {
					System.out.println("Please write your word");
					cevap = scan.next();
					
					if (cevap.equals(arr[1][b])) {
						System.out.println("Congrats! that is correct");
						s6 = max6- (numbera6*100);
						System.out.println("You gained "+ (6-numbera6)*100 +" points from this question. \nYour total score out of 1500 is " + (s6+s5+s4));
						System.out.println();
						break;
						
					} else {
						System.out.println("Wrong! ");
						s6 = (max6*-1) + (numbera6*100);
						System.out.println("You lost " + (6-numbera6)*100 + "points from this question. \nYour total score out of 1500 is " + (s6+s4+s5));
						System.out.println();

						break;
					}
				} 
				
				while (secim1 ==2) {
				numbera6++;
				
				
				int c = (int) ((Math.random()*6)+1);

				
				if (c == 1) {
					if (appearance6.substring(0,1).equals("*")) {
					appearance6 = appearance6.substring(0,0) + arr[1][b].substring(0, 1)+ appearance6.substring(1);
				 	System.out.println(appearance6);
				 	} else {
				 		int[] name2  = {2,3,4,5,6};
				 		int c1 = (int) ((Math.random()*5));
				 		c1 = name2[c1];
				 		c1=c;
				 		int k=1;
				 		k ++;
				 		numbera6 -= k-1; 
				 		continue;
				 	}
					break;
					} 
				
				else if (c==2) {
					if (appearance6.substring(1,2).equals("*")) {
					appearance6 = appearance6.substring(0,1) + arr[1][b].substring(1, 2)+ appearance6.substring(2);
				 	System.out.println(appearance6);
				} else {
				
			 		int[] name  = {1,3,4,5,6};
			 		int c1 = (int) ((Math.random()*5));
			 		c1 = name[c1];
			 		c1=c;
			 		int k=1;
			 		k ++;
			 		numbera6 -= k-1; 
			 		continue;
				} 
					break;
					}
				
				else if (c==3) {
					if (appearance6.substring(2,3).equals("*")) {
					
					appearance6 = appearance6.substring(0,2) + arr[1][b].substring(2, 3)+ appearance6.substring(3);
				 	System.out.println(appearance6);}
					else {
					
						int[] name1  = {1,2,4,5,6};
				 		int c1 = (int) ((Math.random()*5));
				 		c1 = name1[c1];
				 		c1=c;
				 		int k=1;
				 		k ++;
				 		numbera6 -= k-1; 
				 		continue;
					}
					break;
				} else if (c ==4) {
					if (appearance6.substring(3,4).equals("*")) {
					appearance6 = appearance6.substring(0,3) + arr[1][b].substring(3, 4)+ appearance6.substring(4);
				 	System.out.println(appearance6);}
					else {
						int[] name4  = {1,2,3,5,6};
				 		int c1 = (int) ((Math.random()*5));
				 		c1 = name4[c1];
				 		c1=c;
				 		int k=1;
				 		k ++;
				 		numbera6 -= k-1; 
				 		continue;
					}
					break;
				} else if (c ==5) {
					if (appearance6.substring(4,5).equals("*")) {
					appearance6 = appearance6.substring(0,4) + arr[1][b].substring(4, 5)+ appearance6.substring(5);
				 	System.out.println(appearance6);}
					else {
						int[] name4  = {1,2,3,4,6};
				 		int c1 = (int) ((Math.random()*5));
				 		c1 = name4[c1];
				 		c1=c;
				 		int k=1;
				 		k ++;
				 		numbera6 -= k-1; 
				 		continue;
					}
					break;
				} else if (c ==6) {
					if (appearance6.substring(5,6).equals("*")) {
					appearance6 = appearance6.substring(0,5) + arr[1][b].substring(5, 6)+ appearance6.substring(6);
				 	System.out.println(appearance6);}
					else {
						int[] name4  = {1,2,3,4,5};
				 		int c1 = (int) ((Math.random()*5));
				 		c1 = name4[c1];
				 		c1=c;
				 		int k=1;
				 		k ++;
				 		numbera6 -= k-1; 
				 		continue;
					}
					break;}
				
				
				} // end of if which is about user wants a letter 
				
			}// end of first// end of first FOR
			if(appearance6.equals(arr[1][b])){
				s6 = 0;
				System.out.println("you couldn't find the answer. you got 0 points");
				System.out.println("your total score out of 1500 is:" + (s6+s4+s5));
				System.out.println();

				
			}
			
			System.out.println("thank you for participating");
			
		

		}

	}

