package com.employee;

public class Main {

    public static void main(String[] args) {

        Doctor[] doctor = new Doctor[3];

        for (int i = 0; i < doctor.length; i++) {
            doctor[i] = new Doctor();
        }
        for (int i = 0; i < doctor.length; i++) {
            doctor[i].getDetails();
        }

        for (int i = 0; i < doctor.length; i++) {
            doctor[i].displayDetails();
        }


        Engineer[] engineer = new Engineer[3];

        for (int i = 0; i < engineer.length; i++) {
            engineer[i] = new Engineer();
        }

        for (int i = 0; i < engineer.length; i++) {
            engineer[i].getDetails();
        }

        for (int i = 0; i < engineer.length; i++) {
            engineer[i].displayDetails();
        }

        Pilot[] pilot = new Pilot[3];

        for (int i = 0; i < pilot.length; i++) {
            pilot[i] = new Pilot();
        }
        for (int i = 0; i < pilot.length; i++) {
            pilot[i].getDetails();
        }
        for (int i = 0; i < pilot.length; i++) {
            pilot[i].displayDetails();
        }

    }
}

