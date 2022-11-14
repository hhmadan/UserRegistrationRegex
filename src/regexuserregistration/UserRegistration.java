package regexuserregistration;

import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.Pattern;

    public class UserRegistration {
        public static boolean validateFirstName(String fName){
            String regex = "[A-z][a-z]{2,}";             //First letter upper case i.e[A-Z] and remaining and above small case letters i.e [a-z]{2,}
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(fName);
            return matcher.matches();
        }
        public static void isValidFirstName(String fName){
            if(validateFirstName(fName)){
                System.out.println("Good Name "+fName);
            }
            else
                System.out.println("Invalid Input..!\nPlease Enter Valid First Name with First Letter Capital And Minimum of 3 Letters");
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Name: ");
            String fName = sc.next();

            validateFirstName(fName);       //validation for first name regex
            isValidFirstName(fName);        //check if input matches the regex
        }
    }
