package com.ehb.student.calculateBMI;

import java.util.Scanner;

/**
 * @author Cédric Devogelaere
 * Here im making a test-class named calculateBMI where i will calculate "the basic BMI" from our User
 */
public class CalculateBMI {
    /**
     * Creating memory for my storing the users info : height and weight
     * private because should only be modified in this class
     */
    private double height;
    private double weight;
    /**
     * public because this will be need in other functions in different classes
     */
    public double valueBMI ;

    public double calculateBMI(double height , double weight )
    {
        // formule to calculate a basic BMI : eenheid [kg / m² ] -> weight / ( height x height ) =BMI
        // eenheden afspreken ! ik werk hier met cm => dus ik vorm om naar m
        this.height = height;// delen door 100 -> cm => m
        this.weight =weight;
         return this.valueBMI = getWeight() / (Math.pow(getHeight()/100,2));// delen door 100 -> cm => m


    }
    public double calculateBMI()
    {
        return valueBMI = getWeight() /(Math.pow(getHeight()/100,2)); // delen door 100 -> cm => m
    }

    /**
     * Making a getter for  height of the user
     * @return
     * returns the actual height of the user
     */
    public double getHeight() {
        Scanner scanner = new Scanner(System.in);

        if ( 0 <= height && height <= 300 )
            return height;
        else {
            while (height <= 0 || height>300) {
                System.out.print("Please enter a valid height in cm : ");
                this.height = scanner.nextDouble();

            }
            return height;
        }
    }
    /**
     * Making a setter for  height of the user
     * set the height of the class equals to the height of setter !!doc setter
     */
    public void setHeight(double height) {
      this.height =height;
    }

    public double getWeight() {
        Scanner scanner = new Scanner(System.in);
        if ( 0 <= weight && weight <= 300 )
            return weight;
        else {
            while (weight <= 0 || weight>1000) {
                System.out.print("Please enter a valid weight in cm : ");
                this.weight = scanner.nextDouble();

            }
            return weight;
        }
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculateBMI test1 = new CalculateBMI();
        CalculateBMI test2 = new CalculateBMI();
        System.out.println(test1.calculateBMI(180,60));
        test1.height = sc.nextDouble();
        test1.weight =sc.nextDouble();
        System.out.println(test2.calculateBMI(test1.height,test1.weight));
        test2.height = 160;
        test2.weight =80;
        System.out.println(test2.calculateBMI()); // error here


    }
}
