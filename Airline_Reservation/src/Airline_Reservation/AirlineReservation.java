package Airline_Reservation;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class AirlineReservation {
	
	static Scanner sc=new Scanner(System.in);
	public static String[][] GetflightData() throws IOException {
		// file reading code
		// from https://stackoverflow.com/questions/24924937/read-text-string-into-2d-array
		File file = new File("C:\\Users\\bbl\\eclipse-workspace\\Airline_Reservation\\src\\"
				+ "Airline_Reservation\\flightdetails.txt");
        FileReader fr = new FileReader(file);
        char temparr[] = new char[(int) file.length()];
        fr.read(temparr,0,(int) file.length());
        String [] tempstring = (new String(temparr)).split("\n");
        String array2d[][] = new String [tempstring.length][];
        for(int i=0 ; i<tempstring.length; i++)
        {
        	 
            array2d[i]=tempstring[i].split(" ");   
            
           
        }
        fr.close();
        return array2d;
	}
	public static void cancelreservation() throws IOException {
		
		String flightdata[][];
		flightdata=GetflightData();
		int flightno=0;
		int seatsno=0;
		while(true) {	
			try{
					System.out.println("Enter Your Reserved Flight Number: ");
					flightno=sc.nextInt();
					if(flightno<1||flightno>flightdata.length)
					{
						throw new InvalidNumberException("Invalid Number: select Correct Flight No: \n");
					}
					else break;
			}catch(InvalidNumberException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Enter Your Reserved Seats: ");
		seatsno=sc.nextInt();
		int n=Integer.parseInt(flightdata[flightno][3]);
		n=n+seatsno;
		flightdata[flightno][3]="" + n;
	    BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\bbl\\eclipse-workspace\\Airline_Reservation\\src\\"
				+ "Airline_Reservation\\flightdetails.txt"));
	    for(int count=0;count<flightdata.length;count++)
	    {
	    	for(int j=0;j<7;j++) {
	    		 writer.write(flightdata[count][j]+" ");
	    	}
	    	if(count!=flightdata.length-1)
	    	 writer.write("\n");
	    }
	    writer.close();
	    System.out.println("Your Seats Cancelled Successfuly ");
		
		
	}
	public static void Reserveflight() throws IOException {
		
		String flightdata[][];
		flightdata=GetflightData();
		System.out.println("Enter details of required flight: ");
		String[] details = new String[6];   
		int psngrs;
		System.out.println("Origin: ");
		details[0]=sc.next();
		System.out.println("Destination: ");
		details[1]=sc.next();
		System.out.println("Class: ");
		details[2]=sc.next();
		char ch='n';
		System.out.println("Press 'Y' to find flight on specific date: ");
		ch= sc.next().charAt(0); 
		if(ch=='y'||ch=='Y')
		{
			System.out.println("Month: ");
			details[3]=sc.next();
			System.out.println("Day: ");
			details[4]=sc.next();
			System.out.println("Year: ");
			details[5]=sc.next();
		}
		System.out.println("Number of Pessengers: ");
		psngrs=sc.nextInt();
		
		int k=0;
		int n=0;
		int find=0;
		for(int i=1;i<flightdata.length;i++)
		{
			if(find>0)
				break;
			for(int j=1;j<7;j++)
			{
				
				find=i;
				
				if(j==3)
				{
					n=Integer.parseInt(flightdata[i][j]);
						
						try{
							if(n<psngrs)
								throw new SeatsNotAvailableException("Sorry! Seats Not Available");
						}
					catch( SeatsNotAvailableException e) {
						System.out.println(e.getMessage());
						}
						if(n<psngrs)
							System.exit(0);
				}
				else if(j==6&&ch!='n')
				{
					String[] tokens = flightdata[i][j].split("/");
					 
					for (String token : tokens)
					{
						if(details[k].equalsIgnoreCase(token));
						k++;
						
					}  
				}
				else if(j==6)
				{
					k=0;
					find=0;
					break;
					
				}
				else if(j==5)
				{
					j++;
					
					continue;
				}
				else if(flightdata[i][j].equalsIgnoreCase(details[k]))
				{
					k++;
					
				}
				else {
					k=0;
					find=0;
				
					break;
					
				}
			
				
			}
			
		}
		if(find>0)
		{
			
			
			for(int j=0;j<7;j++)
			{
				System.out.println(flightdata[0][j]+"      "+flightdata[find][j]);
			}
			System.out.println("Press 'Y' to confirm Reservation: ");
			ch= sc.next().charAt(0); 
			if(ch=='y'||ch=='Y')
			{
				n=n-psngrs;
				flightdata[find][3]="" + n;
			    BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\bbl\\eclipse-workspace\\Airline_Reservation\\src\\"
						+ "Airline_Reservation\\flightdetails.txt"));
			    for(int count=0;count<flightdata.length;count++)
			    {
			    	for(int j=0;j<7;j++) {
			    		 writer.write(flightdata[count][j]+" ");
			    	}
			    	if(count!=flightdata.length-1)
			    	 writer.write("\n");
			    }
			    System.out.println("   :You Can Print Your Ticket:   ");
			    for(int j=0;j<7;j++)
				{
			    	if(j==3)
			    	{
			    		System.out.println(flightdata[0][j]+"      "+psngrs);
			    		j++;
			    		
			    	}
			    	if(j==5)
			    	{
			    		int tprice=Integer.parseInt(flightdata[find][j]);
			    		System.out.println(flightdata[0][j]+"      "+(psngrs*tprice));
			    		j++;
			    		
			    	}
			    	else 
					System.out.println(flightdata[0][j]+"      "+flightdata[find][j]);
				}
			   
			    
			    writer.close();
			}
			else {
				System.out.print("Seat Reservation is Completed!!");
				System.exit(0);
			}
		}
		else {
			System.out.print("Sorry! Rquired Flight Not Available");
			System.exit(0);
			
		}
		
		
	}
	public static String[][] GetUserData() throws IOException {
		// file reading code
		// from https://stackoverflow.com/questions/24924937/read-text-string-into-2d-array
		File file = new File("C:\\Users\\bbl\\eclipse-workspace\\Airline_Reservation\\"
				+ "src\\Airline_Reservation\\UsersData.txt");
        FileReader fr = new FileReader(file);
        char temparr[] = new char[(int) file.length()];
        fr.read(temparr,0,(int) file.length());
        String [] tempstring = (new String(temparr)).split("\n");
        String array2d[][] = new String [tempstring.length][];
        for(int i=0 ; i<tempstring.length; i++)
        {
        	 
            array2d[i]=tempstring[i].split(" ");   
            
           
        }
        fr.close();
        return array2d;
	}
	public static String[][] GetAdminData() throws IOException {
		// file reading code
		// from https://stackoverflow.com/questions/24924937/read-text-string-into-2d-array
		File file = new File("C:\\Users\\bbl\\eclipse-workspace\\Airline_Reservation\\"
				+ "src\\Airline_Reservation\\adminData.txt");
        FileReader fr = new FileReader(file);
        char temparr[] = new char[(int) file.length()];
        fr.read(temparr,0,(int) file.length());
        String [] tempstring = (new String(temparr)).split("\n");
        String array2d[][] = new String [tempstring.length][];
        for(int i=0 ; i<tempstring.length; i++)
        {
        	 
            array2d[i]=tempstring[i].split(" ");   
            
           
        }
        fr.close();
        return array2d;
	}
	public static void Login(int user) throws IOException {
	
		System.out.println("Enter user Id: ");
		String id= sc.nextLine();
		String userdata[][];
		int userindex=-1;
		if(user==1)
		{
			userdata=GetAdminData();
		}
		else 
		userdata=GetUserData();
		
		id= sc.nextLine();
		while(userindex<0) {
			for(int i=0;i<userdata.length;i++)
			{
				
				if(id.equals(userdata[i][0]))
				{
					
					userindex=i;
					break;
				}
				
			}
			if(userindex<0)
			{	
				try {
							if(userindex<0)
							{
								throw new InvalidIDException("This User ID Doesn't Exist!"
										+ " Enter Correct ID");
							}
					}catch(InvalidIDException e)
					{
						System.out.println(e.getMessage());
					}
				id= sc.nextLine();
			}
		
		}
			System.out.println("Enter Password ");
			String pass= sc.next();
			
			while(true) {
				
		try {
					if(!(userdata[userindex][1].equals(pass)))
						{
							throw new InvalidPasswordException("Incorrect Password"
									+ " Enter Correct Password");
						}
					else break;
				}catch(InvalidPasswordException e)
				{
					System.out.println(e.getMessage());
				}
		pass= sc.next();
			
			}
			System.out.println("\n            Welcome to AirLine Reservation\n");
			
	}
	
	
	public static void Signup() throws IOException {
		 System.out.println("Enter ID: ");
		 String id = null;
		id=sc.next();
		 String userdata[][];
			int userindex=1;
			userdata=GetUserData();
			while(userindex>0) {
				
				 userindex=-1;
				for(int i=0;i<userdata.length;i++)
				{
					
					if(id.equals(userdata[i][0]))
					{
						
						userindex=i;
						break;
					}
					
				}
				if(userindex!=-1)
				{	
					try {
								if(userindex>0)
								{
									throw new InvalidIDException("This User ID already Exist!"
											+ " Enter Unique ID");
								}
						}catch(InvalidIDException e)
						{
							System.out.println(e.getMessage());
						}
					 
					id= sc.next();
				}
			}
		 String pass;
		 System.out.println("Enter Password: ");
		 pass=sc.next();
		 String space="\n";
		 String str4 = space.concat(id).concat(" ").concat(pass).concat(" ");    
		 File file = new File("C:\\Users\\bbl\\eclipse-workspace\\Airline_Reservation\\"
					+ "src\\Airline_Reservation\\UsersData.txt");
		 FileWriter fr = new FileWriter(file, true);
		 fr.write(str4);
		 fr.close();
		 System.out.println("   You have been Registered Succesfuly");
		
	}
	public static void Start(int n) throws IOException
	{
		if(n==1)
			AirlineReservation.Login(2);
		if(n==2)
			AirlineReservation.Signup();
	}
	public static void AddFlight() throws IOException {
		String flightdata[][];
		flightdata=GetflightData();
		System.out.println("Enter details of New flight: ");
		String[] details = new String[6];   
		String psngrs;
		String Fare;
		int n=flightdata.length+1;
		String space="\n"+n+" ";
		System.out.println("Origin: ");
		details[0]=sc.next();
		System.out.println("Destination: ");
		details[1]=sc.next();
		System.out.println("Class: ");
		details[2]=sc.next();
		System.out.println("Month: ");
		details[3]=sc.next();
		System.out.println("Day: ");
		details[4]=sc.next();
		System.out.println("Year: ");
		details[5]=sc.next();
		System.out.println("Number of Seats: ");
		psngrs=sc.next();
		System.out.println("Fare Per Seat: ");
		Fare=sc.next();
		String str4 = space.concat(details[0]).concat(" ").concat(details[1])
				.concat(" ").concat(psngrs).concat(" ").concat(details[2]).concat(" ")
				.concat(Fare).concat(" ").concat(details[3]).concat("/")
				.concat(details[4]).concat("/").concat(details[5]);
		File file = new File("C:\\Users\\bbl\\eclipse-workspace\\Airline_Reservation\\"
				+ "src\\Airline_Reservation\\flightdetails.txt");
	 FileWriter fr = new FileWriter(file, true);
	 str4=str4+" ";
	 fr.write(str4);
	 fr.close();
	 System.out.println("   New Flight has been Added in list Successfuly");
	}
	public static void CancelFlight() throws IOException{
		
		String flightdata[][];
		flightdata=GetflightData();
		int flightno=0;
		while(true) {	
			try{
					System.out.println("Enter  Flight Number to be cancelled: ");
					flightno=sc.nextInt();
					if(flightno<1||flightno>flightdata.length)
					{
						throw new InvalidNumberException("Invalid Number: select Correct Flight No: \n");
					}
					else break;
			}catch(InvalidNumberException e) {
				System.out.println(e.getMessage());
			}
		}
	    BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\bbl\\eclipse-workspace\\Airline_Reservation\\src\\"
				+ "Airline_Reservation\\flightdetails.txt"));
	    for(int count=0;count<flightdata.length;count++)
	    {
	    	System.out.println(count);
	    	if(count==flightno)
	    	{
	    		count++;
	    		//continue;
	    	}
	    	if(count>flightno)
	    	{
	    		int m=count-1;//Integer.parseInt(flightdata[count][0]); 
	    		//m--;
	    		flightdata[count][0]=""+m;
	    	}
	    	System.out.println(count);
	    	for(int j=0;j<7;j++) {
	    		 writer.write(flightdata[count][j]+" ");
	    	}
	    	if(count!=flightdata.length-1)
	    	 writer.write("\n");
	    }
	    writer.close();
	    System.out.println("    Flight has been cancelled Successfuly ");
		
	}
	public static void main(String [] args) throws IOException{
		int n = 0;
		int user=0;
		while(true) {	
			try{
				    System.out.println("Select User: \n1. Admin\n2 Customer");
				    user=sc.nextInt();
					if(user<1||user>2)
					{
						throw new InvalidNumberException("Invalid Number: select between 1 or 2: \n");
					}
					else break;
			}catch(InvalidNumberException e) {
				System.out.println(e.getMessage());
			}
		}
		if(user==1)
		{
			AirlineReservation.Login(1);
			while(true) {	
				try{
					    System.out.println("Select Operation: \n1. Adflight\n2 CancelFlight");
					    user=sc.nextInt();
						if(user<1||user>2)
						{
							throw new InvalidNumberException("Invalid Number: select between 1 or 2: \n");
						}
						else break;
				}catch(InvalidNumberException e) {
					System.out.println(e.getMessage());
				}
			}
			if(user==1)
			AirlineReservation.AddFlight();
			else
			AirlineReservation.CancelFlight();
		}
		else {
		while(true) {	
			try{
				    System.out.println("Select number: \n1. Login\n2 Signup");
					n=sc.nextInt();
					if(n<1||n>2)
					{
						throw new InvalidNumberException("Invalid Number: select between 1 or 2: \n");
					}
					else break;
			}catch(InvalidNumberException e) {
				System.out.println(e.getMessage());
			}
		}
		AirlineReservation.Start(n);
		while(true) {	
			try{
				    System.out.println("Select Operation: \n1. ReserveFlight\n2 CancelFlight");
					n=sc.nextInt();
					if(n<1||n>2)
					{
						throw new InvalidNumberException("Invalid Number: select between 1 or 2: \n");
					}
					else break;
			}catch(InvalidNumberException e) {
				System.out.println(e.getMessage());
			}
		}
		if(n==1)
		AirlineReservation.Reserveflight();
		else 
		AirlineReservation.cancelreservation();
		
		}
	}
			
}
