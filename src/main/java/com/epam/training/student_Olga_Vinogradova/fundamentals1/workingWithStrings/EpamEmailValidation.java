package com.epam.training.student_Olga_Vinogradova.fundamentals1.workingWithStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {
    public static boolean validateEpamEmail(String email) {
    if (email == null) {
        return false;
    }

    // Define the regular expression pattern for EPAM email
    String pattern = "^[a-zA-Z]+_[a-zA-Z]+\\d*@epam\\.com$";

    // Create a Pattern object from the pattern string
    Pattern emailPattern = Pattern.compile(pattern);

    // Create a Matcher object to match the email against the pattern
    Matcher matcher = emailPattern.matcher(email);

    return matcher.matches();
}

    public static void main(String[] args) {
        String[] validExamples = {
                "william_shakespeare@epam.com",
                "lu_e@epam.com",
                "william_shakespeare1@epam.com",
                "william_shakespeare2@epam.com"
        };

        String[] invalidExamples = {
                "william@epam.com",
                "william.shakespeare@epam.com",
                "william...shakespeare@epam.com",
                "william-shakespeare@epam.com",
                "shakespeare123@epam.com",
                "william_$hakespeare@epam.com"
        };

        for (String email : validExamples) {
            System.out.println(email + " is valid: " + validateEpamEmail(email));
        }

        for (String email : invalidExamples) {
            System.out.println(email + " is valid: " + validateEpamEmail(email));
        }
    }
}