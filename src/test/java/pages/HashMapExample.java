package pages;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    HashMap<Integer, String> contactList = new HashMap<>();

    public HashMapExample addUserInfo (int phoneNumber, String name) {
        contactList.put( phoneNumber, name);
        System.out.println("Добавлен номер - " + phoneNumber + " с именем - " + name);
        return this;
    }

    public HashMapExample removePhoneNumber (int phoneNumber) {
        contactList.remove(phoneNumber);
        System.out.println("Удален номер - " + phoneNumber);
        return this;
    }

    public boolean findPhoneNumber(String name) {
        Iterator<Map.Entry<Integer, String>> iterator = contactList.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if (entry.getValue().equals(name)) {
                System.out.println("Номер с именем " + name + " найден: " + entry.getKey());
                return true;
            }
        }

        System.out.println("Контакт с именем " + name + " не найден");
        return false;
    }

}
