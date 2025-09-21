package pages;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
        LinkedList<String> linkedListToDo = new LinkedList<String>();

        public pages.LinkedListExample addTask (String value){
            linkedListToDo.add(value);
            System.out.println("Добавили новую задачу в список: " + value);
            return this;
        }

        public pages.LinkedListExample removeTask (String value){
            linkedListToDo.remove(value);
            System.out.println("Удалили задачу из списка: " + value);
            return this;
        }

    public boolean findTask (String value) {
        Iterator<String> iterator = linkedListToDo.iterator();
        if (!iterator.hasNext()) {
            return false;
        }
            do {
                String task = iterator.next();
                if (task.equals(value)) {
                    System.out.println("Нужная задача найдена: " + value);
                    return true;
                }

            } while (iterator.hasNext());
        System.out.println("Задача - " + value + " - не найдена: ");
        return false;
    }


}
