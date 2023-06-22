/*
Create a class called House that has 3 instance variables:
    - a string address
    - an int numberOfFloors
Define a constructor method for House that will print in console a message as soon as a House object is created
Define a testing class (e.g. Tester, Start or another reasonable name you prefer) with a main method where:
    - you declare two House variables house1 and house2
    - you create two House objects and assign them to the variables house1 and house2
*/

public class Tester {
    public static void main(String[] args){
        House house1 = new House("Via Verdi n. 3, Roma", 2);
        House house2 = new House("Via Pascoli n. 12, Aosta", 3);
    }
}
