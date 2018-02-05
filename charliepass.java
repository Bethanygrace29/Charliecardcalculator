
import java.util.Scanner;

//Created by Bethany Taylor
//February 1, 2018
public class charliepass {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Program to purchase MBTA Subway passes.");

		
		//Ask user if they would like to buy a one day pass
	
	//OD is first declared variable integer linked to first question
	System.out.println("\n" + 
			"Do you want to purchase 1-Day Passes (0 = No, 1 = Yes)?:");
	int OD = keyboard.nextInt();
	// get answer from user
	
	
	
	//if input is 1 which is yes then ask how many


		if (OD==1) 
		System.out.println("How many 1-Day passes do you want to purchase?:");
		double O=keyboard.nextDouble();
	 //create varible O as next input for number of 1-day passes
		System.out.println("Do you want to purchase 7-Day Passes (0 = No, 1 = Yes)?:");
	
		int Seven = keyboard.nextInt();
	//creating variable seven as yes or no 
		//if input is 0 skip to next question asking about 7 day passes	
	
		
		
	//
	
		if (Seven==1) {
		System.out.println("How many 7-Day Passes do you want to purchase");}
		//if user says one then prompt will ask how many
		double Sevens= keyboard.nextDouble();	
		//creating variable "Sevens" as input variable for number of 7 day passes
		System.out.println("Do you want to purchase Monthly Passes (0 = No, 1 = Yes)?:");
		
		int Month = keyboard.nextInt();
		//creating variable Month as binary question and asking user if they want to purchase monthly pass	
		double Sevenday = Sevens * 21.25;
	 //factoring price of sevenday pass 
		if(Month ==1) {
			//if month user prompt equals yes ask yes if charliecard or charlieticket
			System.out.println("Are you purchasing a CharlieCard (0) or a CharlieTicket/Cash (1):");}
			double Ch = keyboard.nextDouble();
			//Ch is variable to display charliecard or charlieticket info this will be used at end
			{System.out.println("Are you purchasing Standard (0), Student (1), or Senior (2) passes?:");}
			//ask user if they are student or senior for discount pricing	
			double D = keyboard.nextDouble();
			//if input is greater or equal to one give discount pricing to monthly	
			{System.out.println("How many monthly passes do you want to purchase?:");	}
				double Monthly= keyboard.nextDouble();
	//next input variable labeled monthly user prompt number purchasing
	double Discount = Monthly *30.00;
	double Standard = Monthly *84.50;
	double Oneday = O * 12.5;	
	double Totalcost = Standard + Oneday + Sevenday;
	double Discounttotalcost = Discount + Oneday + Sevenday;
	
//calculates total cost of each ticket
	
				
				keyboard.close();				
	
	double Total = Sevens + O + Monthly;
	System.out.println("MBTA Subway Pass Cost Breakdown");
	System.out.println("------------------------------------------------------------------------");
	System.out.println("Passes:"  );
	String s4=  ("Passes:" + " " + Monthly + " " + "(84.50 Each)" + " " + "Monthly Charliecard Pass Cost " + ":" + Standard );
	String s5=  ("Passes:" + " " + Monthly + " " + "(84.50 Each)" + " " + "Monthly Charlieticket Pass Cost " + ":" + Standard);
	String s6=  ("Passes:" + " " + Monthly + " " + "(30.00 Each)" + " " + "Monthly Student Charliecard Pass Cost " + ":"+ Discount);
	String s12=  ("Passes:" + " " + Monthly + " " + "(30.00 Each)" + " " + "Monthly Senior Charliecard Pass Cost "+":" + Discount);
	String s7=  ("Passes:" + " " + Monthly + " " + "(30.00 Each)" + " " + "Monthly Student Charlieticket Cost " + ":"+ Discount);
	String s8=  ("Passes:" + " " + Monthly + " " + "(30.00 Each)" + " " + "Monthly Senior Charlieticket Cost " + ":"+ Discount );
	String s9= ("Passes:" + " " + Monthly + " " + "(84.50 Each)" + " " + "Monthly Charlieticket Pass Cost " + ":" + Standard);
	String s10= ("Passes:" + " " +  "(" + O + ")" + " " +"(12.50 each)"+ "1 Day Charlieticket Pass Cost" + " " + ":" + Oneday);
	String s11= ("Passes:" + " " +  "(" + Sevens + ")" + " " +"(21.25 each)" +"7_Day Charlieticket Pass Cost" + " " + ":" + Sevenday);
	String s13=("Total Passes :" +"(" +  Total + ")" + "   " + "Total Cost of all pass purchases" + ":" + " " + Totalcost);
	String totaldiscounts =("Total Passes :" +"(" +  Total + ")" + "   " + "Total Cost of all pass purchases" + ":" + " " + Discounttotalcost);
	//strings output end result lines giving totals 
	if (O >=1) {
		System.out.println(s10);
	//calculates whether or not to print total of one day passes if greater or equal to one
	}
	if (Sevenday >=1) {
	System.out.println(s11);
	}
	//calculates whether or not to print toal of seven day passes if greater or equal to one
	if (Monthly >= 1) {
	if (Ch==0) {  
		if (D==1) {
			System.out.println(s6);
		System.out.println(totaldiscounts);}
		else if(D==2){
			System.out.println(s12);
			System.out.println(totaldiscounts);}
		else if(D==0) {
			System.out.println(s4);
			System.out.println(s13);}
		}
	}
	//if else statement figures what to print at end for total based on passes purchased 
	if (Ch==1) {
		if (D==1) {
			System.out.println(s7);
			System.out.println(totaldiscounts);}
		else if(D==2) {
			System.out.println(s8);
			System.out.println(totaldiscounts);}
		else if(D==0) {
			System.out.println (s5);
			System.out.println(s13);
		
		// calculates which charlie pass info to print given discounts with student and charlie passes	
		}
	
	}
	
	System.out.println("--------------------------------------------------");
	
	System.exit(0);
	}
}

