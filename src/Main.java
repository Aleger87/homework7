public class Main {
    public static void main(String[] args) {
        task1();
        String fullName = "Ivanov Ivan Ivanovich";
        task2(fullName);
        fullName = "Иванов Семён Семёнович";
        task3(fullName);
        fullName = "Степанов Сергей Геннадьевич";
        task4(fullName);
        //task5();
        //task6();
        //task7();
    }


    /*
    Представим, что мы работаем в небольшой компании.
    Данные сотрудников хранятся в неструктурированном формате, и бухгалтерия попросила написать программу,
    в которой можно работать с Ф. И. О. сотрудников.
    Напишите четыре строки:
    первая с именем firstName — для хранения имени;
    вторая с именем middleName — для хранения отчества;
    третья с именем lastName — для хранения фамилии;
    четвертая с именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
    Выведите в консоль фразу: “ФИО сотрудника — ….”
    В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
    * */
        private static void task1 (){
            System.out.println("Задание 1");
            String lastName = "Ivanov";
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("ФИО сотрудника - " + fullName);
        }

        /*
        Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны
        Ф.И.О. сотрудников, полностью написанные заглавными буквами (верхним регистром).
        Напишите программу, которая изменит написание
        Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
        В качестве строки с исходными данными используйте строку fullName.
        Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
        * */

        private static void task2 (String fullName){
            System.out.println("Задание 2");
            System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        }

        /*
        *Система, в которой мы работаем, не принимает символ “ё”.
        Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
        * */
        private static void task3 (String fullName){
            System.out.println("Задание 3");
            System.out.println(fullName.replace('ё', 'е'));
        }


        /*
        К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
        В качестве исходных данных используйте:
        Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
        строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
        переменная firstName — для хранения имени;
        переменная middleName — для хранения отчества;
        переменная lastName — для хранения фамилии.
        Решите задание с помощью метода substring().  String s1 = s.substring(2, 4);
        Подсказка - Определить индексы символов помогут методы indexOf() и lastIndexOf().
        Результат программы выведите в формате:
        “Имя сотрудника — …”
        “Фамилия сотрудника — …”
        “Отчество сотрудника — ...”
        * */
        private static void task4 (String fullName) {
            System.out.println("Вариант 1");
            String[] arr = fullName.split(" ");
            String lastName = arr[0];
            String firstName = arr[1];
            String middleName = arr[2];
            System.out.println("Имя сотрудника - " + firstName + "\nФамилия сотрудника - " + lastName + "\nОтчество сотрудника - " +middleName);
            System.out.println("Вариант 2");
            int a = fullName.indexOf(' ');
            int b = fullName.lastIndexOf(' ');
            lastName = fullName.substring(0,a);
            firstName = fullName.substring(a,b);
            middleName = fullName.substring(b,fullName.length());


            System.out.println("Имя сотрудника - " + firstName + "\nФамилия сотрудника - " + lastName + "\nОтчество сотрудника - " +middleName);

        }

}