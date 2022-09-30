package com.javaregex;
import java.util.Scanner;
import java.util.regex.Pattern;
public class RegexPattern {
        public static void main(String[] args) {
            String userRegex="^[A-Z]{1}[a-z]{2,}";
            Scanner sc =new Scanner(System.in);
           String userName =sc.nextLine();
           boolean checkUser = Pattern.matches(userRegex,userName);
           System.out.println(checkUser);
           String lnameRegex="^[A-Z]{1}[a-z]{2,}";
           String lastName =sc.nextLine();
           boolean checklname = Pattern.matches(lnameRegex,lastName);
           System.out.println(checklname);
           String emailRegex="^([a-zA-Z0-9/./-/_/+]+)+@([a-zA-Z0-9/.]+)([a-zA-Z]{2,5})+$";
           String email =sc.nextLine();
           boolean checkemail = Pattern.matches(emailRegex,email);
           System.out.println(checkemail);
           String phoneRegex="^[0-9]{2}\s{0,1}[0-9]{10}$";
           String phone =sc.nextLine();
           boolean checkphone = Pattern.matches(phoneRegex,phone);
           System.out.println(checkphone);
           String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$";
           String password = sc.nextLine();
           boolean checkpass = Pattern.matches(passwordRegex,password);
           System.out.println(checkpass);



        }
}
