package com.epam.training.student_Olga_Vinogradova.fundamentals1.workingWithStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        if (color == null) {
            return false;
        }

        // Regular expression pattern for valid hex color code
        String pattern = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";

        // Compile the pattern
        Pattern colorPattern = Pattern.compile(pattern);

        // Match the color code against the pattern
        Matcher matcher = colorPattern.matcher(color);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] colorCodes = {
                "#0B79E1",
                "#6A8DAF",
                "#002950",
                "123456",
                "#afafah",
                "#-123"
        };

        for (String colorCode : colorCodes) {
            boolean isValid = validateColorCode(colorCode);
            System.out.println(colorCode + " is " + (isValid ? "valid" : "invalid") + " color code.");
        }
    }
}