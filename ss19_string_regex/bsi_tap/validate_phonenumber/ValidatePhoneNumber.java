package ss19_string_regex.bsi_tap.validate_phonenumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PhoneNumber: ");
        String phoneNumber = sc.nextLine();

        String regexPhoneBumber = "^\\d{2}[0]\\d{9}$";
        Pattern pattern = Pattern.compile(regexPhoneBumber);
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()){
            System.out.println("Complete!");
        }else {
            System.out.println("Wrong!");
        }
    }
}
