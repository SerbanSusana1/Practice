package org.fasttrackit;

public class TemperatureConverter {

  //A. Creati 1 metoda care sa primeasca o valoare numerica(temperatura)
    // si sa o transforme din Celsius in Fahreinheit
  //A. Creati 1 metoda care sa primeasca o valoare numerica(temperatura)
  // si sa o transforme din Fahreinheit in Celsius
    // Apelati fiecare metoda din main() cu diferite valori.
    // Metodele ar trebui sa afiseze valorile inainte si dupa

    //b. Creati o singura metida care sa primeasca temperatura si tipul de temperatura(numeric) dorit (string)
    // si sa realizeze conversia necesara
    //apelati metoda din main
    // formule
    // C=(F-32)*5/9
    //F=(c*9/5)+32


    public void calculateCelsius(double f) {
        System.out.println("Temperature in grade Far:" + f);

        double celsius = (f - 32) * 5 / 9;
        System.out.println("Temperatura in grade Celsius:" + celsius);
    }

    public void calculateFar(double c){
        System.out.println("Temperature in grade Celsius:" + c);

        double far =(c*9/5)+32;
        System.out.println("Temperatura in grade Far:" + far);
    }

    public void calculateTemperature(double g,String t){
        if (t== "C") {

            double farcelsius = (g * 9 / 5) + 32;
            System.out.println("Temperatura calculata" +farcelsius);
        }
        else {
            double farcelsius = (g - 32) * 5 / 9;
            System.out.println("Temperatura calculata" +farcelsius);
        }




    }
    public static void main(String[] args) {

        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.calculateCelsius(45);

            TemperatureConverter temperatureConverter1 = new TemperatureConverter();
            temperatureConverter1.calculateFar(23);

            TemperatureConverter temperatureConverter2 = new TemperatureConverter();
            temperatureConverter2.calculateTemperature(23,"C");

        }


    }

