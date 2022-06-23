
import java.util.Scanner;

public class Employee 
{
    // attributes
    private String name;
    private String username;
    private String email ;
    private String password ;
    
    // constructor to initialize the fields
    public  Employee() {

        name = setName();
        username = setUserName(name);
        email = setEmail(username);
        password = setPassword(username);
        
    }//end constructor
    
    // method to count and return the number of times ch occurs in str
    private int countChars(String str, char ch)
    {
        int count = 0; // initialize count to 0
        // loop over string str
        for(int i=0;i<str.length();i++)
            if(str.charAt(i) == ch) // ith character = ch, increment count by 1
                count++;
        return count;
    }
    
    // method to input the name of the employee
    private String setName()
    {
        int count;
        Scanner scnr = new Scanner(System.in);
        
        String name;
        // loop that continues until user enters the first and last name of the employee i.e there is only 1 space in the input
        do
        {
            System.out.print("Enter your full name: ");
            name = scnr.nextLine(); // input the full name
            count = countChars(name, ' '); // get the count of space in name
        }while(count != 1);
        
        return name;
    }
    
    // method to determine and return the username from input name
    private String setUserName(String name)
    {
        // replace space with dot and convert the name to lowercase
        return name.replace(' ', '.').toLowerCase();
        
    }
    
    // method to determine and return the email from input username
    private String setEmail(String username)
    {
        // concatenate the first character with the last name and add the email suffix to get the email
        return username.charAt(0)+username.substring(username.indexOf('.')+1)+"@oracleacademy.Test";
    }
    
    // method to determine and return the password from input username
    public String setPassword(String username)
    {
        String password=""; // create an empty string to store the password
        
        // loop over the username or until 8 characters have been added to password
        for(int i=0;i<username.length() && i < 8;i++)
        {
            // replace all vowels by *
            if(username.charAt(i) == 'a' || username.charAt(i) == 'e' || username.charAt(i) == 'i' || username.charAt(i) == 'o' || username.charAt(i) == 'u')
                password += "*";
            else // add all the consonants to password
                password += username.charAt(i);
        }
        
        // password length < 8, append * to password
        while(password.length() < 8)
            password += "*";
        
        // loop to find the first alphabetic character and convert it to uppercase
        for(int i=0;i<password.length();i++)
        {
            if(password.charAt(i) != '*') {
                password = password.substring(0,i)+(password.charAt(i)+"").toUpperCase()+password.substring(i+1);
                break;
            }
        }
        
        return password;
    }
    
    // return String representation of Employee
    public String toString()
    {
        return "Employee Details\nName : "+name+"\nUsername : "+username+"\nEmail : "+email+"\nInitial Password : "+password;
    }
}


 
