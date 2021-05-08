package menu.project;

//import java.io.File;
//import java.util.Scanner;

public class Account { 

//File ac = new File("/Users/ashwot/Documents/project/checking.txt");	
boolean check = user();
String use ;
String password;

public Account(String text , String pass ) {
use = text;
password =pass;
}
String test ;


private boolean user()  {
	boolean cow;
	test = "Ashwot";
	System.out.println(use);
	System.out.println(test);



//	
//	try {
//		Scanner filereader = new Scanner(ac);
//	while (filereader.hasNextLine()) {
//	    String line = filereader.nextLine(); 	
//	    if(line == user) {
//	    	
//	    cow = true;
//	    	
//    }
//	    else {
//	    	cow =  false;
//	    }
//	}
//	filereader.close();
//    return cow;
//    
//
//	}
//	catch(Exception e) {
//		
//	}	
	
// the above is commented out due to problem
	
if(use==test) {
	cow = true;
	System.out.println("tru");
	
}
else {
	cow = false;
	System.out.println("NOPW");
}
return cow;
}




		

}
