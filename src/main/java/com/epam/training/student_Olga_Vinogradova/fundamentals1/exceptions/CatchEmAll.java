package com.epam.training.student_Olga_Vinogradova.fundamentals1.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {

    static Exception exception = new IOException();

    public static void riskyMethod() throws Exception {
        throw exception;
    }

    public static void main(String[] args) throws Exception {
        try {
            riskyMethod();
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Resource is missing", e);
        } catch (IOException exception) {
            throw new IllegalArgumentException("Resource error", exception);
        } catch (ArithmeticException | NumberFormatException ArithmeticNumberError) {
            System.err.println(ArithmeticNumberError.getMessage().trim());
        }
    }
}