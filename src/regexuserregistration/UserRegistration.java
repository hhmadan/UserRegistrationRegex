package regexuserregistration;

import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean validateInputRegex(String input){
        String regex = "[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    public static void isValidFirstName(String fName){      // validate first name
        if(validateInputRegex(fName)){
            System.out.println("Your First Name ==> "+fName);
        }
        else
            System.out.println("Invalid Input..!\nPlease Enter Valid First Name with First Letter Capital And Minimum of 3 Letters");
    }
    public static void isValidLastName(String lName){       // validate last name
        if(validateInputRegex(lName)){
            System.out.println("Your Last Name ==> "+lName);
        }
        else
            System.out.println("Invalid Input..!\nPlease Enter Valid Last Name with First Letter Capital And Minimum of 3 Letters");
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String fName = sc.next();
        isValidFirstName(fName);        //check if input matches the regex

        System.out.println("Enter Last Name: ");
        String lName = sc.next();
        isValidLastName(lName);         //validating last name
    }
}