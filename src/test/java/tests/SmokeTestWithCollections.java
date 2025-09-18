package tests;

import pages.ArrayListExample;
import pages.HashMapExample;

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


        HashMapExample HashMapExample = new HashMapExample();
        HashMapExample.addUserInfo(1234567891, "Arsen")
                .addUserInfo(1234567892, "Violetta")
                .addUserInfo(1234567893, "Arman")
                .addUserInfo(1234567894, "Sergey");

        HashMapExample.findPhoneNumber("Timur");
        HashMapExample.findPhoneNumber("Sergey");

        HashMapExample.removePhoneNumber(1234567894);

    }
}
