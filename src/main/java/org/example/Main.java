package org.example;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        double balance  = 0.0;
        String account = "default";
        int pin = 123;

        System.out.println("Hola mushasho");

        //Ejemplo de Array en JAVA

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for(int i = 0; i < arr.length; i++) System.out.println(arr[i]);

        //ArrayList es dinámico, primero se tiene que importar la clase

        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(34);
        System.out.println(myArray.get(0));
    }
}