package tests;

import pages.ArrayListExample;

public class SmokeTestWithCollections {
    public static void main(String[] args) {

        ArrayListExample ArrayListExample = new ArrayListExample();
        ArrayListExample.addStudentName("Arsen")
                        .addStudentName("Violetta")
                        .addStudentName("Arman")
                        .addStudentName("Sergey");

        ArrayListExample.searchStudentName("Timur");
        ArrayListExample.searchStudentName("Sergey");

        ArrayListExample.removeStudentName("Sergey");


    }
}
