package com.epam.training.student_Olga_Vinogradova.fundamentals1.abstractClassesAndInterfaces.taskCarousel;

public class CompleteByRequestTask implements Task {
    private boolean completed;
    private boolean isFinished;

    public CompleteByRequestTask(){
        super();
        this.isFinished = false;
        this.completed = false;
    }

    @Override
    public void execute() {
        if(completed) isFinished = true;
    }

    @Override
    public boolean isFinished() {
        return completed;
    }

    public void complete() {
        completed = true;
    }
}