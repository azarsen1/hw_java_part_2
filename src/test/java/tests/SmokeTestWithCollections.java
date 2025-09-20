package tests;

import pages.ArrayListExample;
import pages.HashMapExample;
import pages.HashSetExample;

public class SmokeTestWithCollections {
    public static void main(String[] args) {

        ArrayListExample ArrayListExample = new ArrayListExample();
        System.out.println("База студентов");
        System.out.println();
        ArrayListExample.addStudentName("Arsen")
                        .addStudentName("Violetta")
                        .addStudentName("Arman")
                        .addStudentName("Sergey");

        ArrayListExample.searchStudentName("Timur");
        ArrayListExample.searchStudentName("Sergey");

        ArrayListExample.removeStudentName("Sergey");
        System.out.println();


        HashMapExample HashMapExample = new HashMapExample();
        System.out.println("Телефонная книга");
        System.out.println();
        HashMapExample.addUserInfo(1234567891, "Arsen")
                .addUserInfo(1234567892, "Violetta")
                .addUserInfo(1234567893, "Arman")
                .addUserInfo(1234567894, "Sergey");

        HashMapExample.findPhoneNumber("Timur");
        HashMapExample.findPhoneNumber("Sergey");

        HashMapExample.removePhoneNumber(1234567894);
        System.out.println();



        HashSetExample HashSetExample = new HashSetExample();
        System.out.println("База пользователей");
        System.out.println();
        HashSetExample.addUserLogin("Azarsen1")
                        .addUserLogin("Gyaqsxao")
                        .addUserLogin("Becefoso")
                        .addUserLogin("Woqyzica");


        HashSetExample.searchUserLogin("Timur");
        HashSetExample.searchUserLogin("Azarsen1");

        HashSetExample.removeUserLogin("Azarsen1");
        System.out.println();

    }

}
