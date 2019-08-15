package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class AverageCalculator
{


    public void displayAverage (int a ,int b, int c){
        System.out.println("Calculate average of :" + a +", " + b +", "+ c);

        double average = (a+b+c)/3d;
        System.out.println("Average :" + average);


    }



    public static void main( String[] args )
    {


        AverageCalculator averageCalculator =new AverageCalculator();
        averageCalculator.displayAverage(3,4,7);


    }


}
