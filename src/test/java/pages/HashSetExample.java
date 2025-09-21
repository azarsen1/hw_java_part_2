package pages;

import java.util.HashSet;

public class HashSetExample {
    HashSet<String> hashSetListWithLogins = new HashSet<>();

    public HashSetExample addUserLogin (String value){
        hashSetListWithLogins.add(value);
        System.out.println("Добавили логин " + value + " в базу");
        return this;
    }

    public HashSetExample removeUserLogin (String value){
        hashSetListWithLogins.remove(value);
        System.out.println("Удалили логин " + value + " из базы");
        return this;
    }

    public boolean searchUserLogin (String value){
        for(String login : hashSetListWithLogins) {
            if (login.equals(value)){
                System.out.println("Пользователь с логином " + value + " найден в базе");
                return true;
            }

        }

        System.out.println("Пользователь с логином " + value + " не найден в базе");
        return false;

    }
}
