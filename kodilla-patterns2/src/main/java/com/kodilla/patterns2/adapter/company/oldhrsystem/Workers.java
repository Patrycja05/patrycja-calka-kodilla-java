package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"12345678910", "John", "Smith"},
            {"12345678923", "Ivone", "Novak"},
            {"12345678566", "`Jessie", "Pinkman"},
            {"12345677888", "Walter", "White"},
            {"12345678457", "Clara", "Lanson"}};
    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};
    public String getWorker(int n){
        if(n > salaries.length){
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }
    public String[][] getWorkers(){
        return workers;
    }
    public double[] getSalaries(){
        return salaries;
    }
}
