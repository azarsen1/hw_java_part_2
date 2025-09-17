import java.util.ArrayList;

public class ArrayListExample {
        ArrayList<String> arrayList = new ArrayList<String>();

        public ArrayListExample addStudentName (String value){
            arrayList.add(value);
            System.out.println("Добавили студента " + value + "в базу");
            return this;
        }

        public ArrayListExample removeStudentName (String value){
        arrayList.remove(value);
            System.out.println("Удалили студента " + value + " из базы");
        return this;
        }

        public boolean searchStudentName (String value){
        for(int i=0; i<arrayList.size(); i++) {
            if (arrayList.get(i).equals(value)){
                System.out.println("Студент по имени " + value + " найден в базе");
                return true;
            }

        }

            System.out.println("Студент по имени " + value + " не найден в базе");
            return false;

    }

}

