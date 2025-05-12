package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary){
        super(id, name, salary);
    }

    public HRManager(long id, String name, double salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers){
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper){
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Invalid index provided.");
            return;
        }
        if(juniorDevelopers[index] == null){
            juniorDevelopers[index] = juniorDeveloper;
        }
        else{
            System.out.println("The specified index is full.");
        }
    }

    public void addEmployee(int index, MidDeveloper midDeveloper){
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Invalid index provided.");
            return;
        }
        if(midDevelopers[index] == null){
            midDevelopers[index] = midDeveloper;
        }
        else{
            System.out.println("The specified index is full.");
        }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper){
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Invalid index provided.");
            return;
        }
        if(seniorDevelopers[index] == null){
            seniorDevelopers[index] = seniorDeveloper;
        }
        else{
            System.out.println("The specified index is full.");
        }
    }

    @Override
    public void work(){
        System.out.println( getName() + "HR Manager starts to working");
    }
}
