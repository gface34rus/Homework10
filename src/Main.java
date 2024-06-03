import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println();
        System.out.println("Задачча 2");
        String nameInUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + nameInUpperCase);
        System.out.println();
        System.out.println("Задача 3");
        String fullNameForTask3 = "Иванов Семён Семёнович";
        String trueFullName = fullNameForTask3.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + trueFullName);
    }
}