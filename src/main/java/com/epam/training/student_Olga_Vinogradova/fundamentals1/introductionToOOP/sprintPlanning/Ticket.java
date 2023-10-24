package com.epam.training.student_Olga_Vinogradova.fundamentals1.introductionToOOP.sprintPlanning;

public class Ticket {
     private int id;
     private String name;
     private int estimate;
     protected boolean isCompleted;

    public Ticket(int id, String name, int estimate) {
        this.id = id;
        this.name = name;
        this.estimate = estimate;
        this.isCompleted = false;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getEstimate() {
        return estimate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void complete() {
        isCompleted = true;
    }
}
