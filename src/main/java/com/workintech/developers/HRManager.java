package com.workintech.developers;

import java.lang.reflect.Array;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary){
        super(id, name, salary);
        juniorDevelopers =new JuniorDeveloper[3];
        midDevelopers = new MidDeveloper[3];
        seniorDevelopers = new SeniorDeveloper[3];
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
        setSalary(getSalary()*5);
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper){
        for(int i=0; i<juniorDevelopers.length; i++){
            if (juniorDevelopers[i] == null){
                juniorDevelopers[i] = juniorDeveloper;
                return;
            }
        }
        System.out.println("Junior Developer eklenemedi");
    }
    public void addEmployee(MidDeveloper midDeveloper){
        for(int i=0; i<midDevelopers.length; i++){
            if (midDevelopers[i] == null){
                midDevelopers[i] = midDeveloper;
                return;
            }
        }
        System.out.println("Mid Developer eklenemedi");
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper){
        for(int i=0; i<seniorDevelopers.length; i++){
            if (seniorDevelopers[i] == null){
                seniorDevelopers[i] = seniorDeveloper;
                return;
            }
        }
        System.out.println("Senior Developer eklenemedi");
    }
}
