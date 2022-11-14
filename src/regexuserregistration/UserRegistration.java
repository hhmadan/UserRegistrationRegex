package regexuserregistration;

import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean validateNameRegex(String input){
        String regex = "[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    public static void isValidFirstName(String fName){      // validate first name
        if(validateNameRegex(fName)){
            System.out.println("Your First Name ==> "+fName);
        }
        else
            System.out.println("Invalid Input..!\nPlease Enter Valid First Name with First Letter Capital And Minimum of 3 Letters");
    }
    public static void isValidLastName(String lName){       // validate last name
        if(validateNameRegex(lName)){
            System.out.println("Your Last Name ==> "+lName);
        }
        else
            System.out.println("Invalid Input..!\nPlease Enter Valid Last Name with First Letter Capital And Minimum of 3 Letters");
    }
    public static void isValidEmail(String email){          // validate email-id
        String regex = "^[a-z0-9]+.?+[a-z]?+@+[a-z]+.+[a-z]+.?+[a-z]?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches())
            System.out.println("Your mail-id ==> "+email);
        else
            System.out.println("Invalid Input..!\n Please enter valid email-id");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String fName = sc.next();
        isValidFirstName(fName);        // check if input matches the regex

        System.out.println("Enter Last Name: ");
        String lName = sc.next();
        isValidLastName(lName);         // validating last name

        System.out.println("Enter Email-id: ");
        String email = sc.next();
        isValidEmail(email);            // validating email-id
    }
}