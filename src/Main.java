
import java.io.StreamCorruptedException;
import java.text.CharacterIterator;
import java.util.Arrays;
import java.util.spi.AbstractResourceBundleProvider;

import static java.lang.System.*;


public class Main {
    public static void main(String[] args) {
        String fullName = "Иванов Семён Семёнович";
        task1();
        task2(fullName);
        task3(fullName);
        task4(fullName);
        task5(fullName);
        task6();
        task7();

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
            out.println("Задание 1");
            String lastName = "Ivanov";
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String fullName = lastName + " " + firstName + " " + middleName;
            out.println("ФИО сотрудника - " + fullName);
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
            out.println("Задание 2");
            out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        }

        /*
        *Система, в которой мы работаем, не принимает символ “ё”.
        Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
        * */
        private static void task3 (String fullName){
            out.println("Задание 3");
            out.println(fullName.replace('ё', 'е'));
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
            out.println("Задание 4");
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



        /*
        Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
        Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О. в правильный формат.
        В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“, которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
        Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв — …”
        Подсказка 1
        Метод toCharArray() может быть полезен.
        Подсказка 2
        Для преобразования символа в верхний регистр следует использовать метод Character.toUpperCase(c), где c — символ.
        * */

        private static void task5 (String fullName){
            System.out.println("Задание 5");
            out.println("Вариант 1");
            String str = "";
            fullName = nameToLowerCase(fullName);
            String[] fullNameCorrect = fullName.split(" ");
            for (String word: fullNameCorrect){
                word = correctName(word);
                str = str + word + " ";
            }
            out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + str);


            out.println("Вариант 2 (списано)");
            for (String name : fullNameCorrect){
                out.print(name.replace(name.charAt(0), Character.toUpperCase(name.charAt(0))) + " ");
            }


        }

        private static String correctName (String fullName) {
                String newName = fullName.replace(fullName.substring(0, 1), fullName.toUpperCase().substring(0, 1));
                return newName;
        }
        private static String nameToLowerCase (String fullName){
            return fullName.toLowerCase();
        }


        /*
        Имеется две строки.
        Первая: "135"
        Вторая: "246"
        Соберите из двух строк одну, содержащую данные "123456".
        Использовать сортировку нельзя.
        Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
        Выведите результат в консоль в формате: “Данные строки — ….”
        Подсказка
        Следует использовать StringBuilder.
        * */
        private static void task6(){
                out.println();
                out.println("Задание 6");
                String sb = "1357";
                String sb1 = "2468";
                StringBuilder text = new StringBuilder();
                for (int i = 0; i < sb.length(); i++) {
                    text.append(sb.charAt(i));
                    text.append(sb1.charAt(i));
                }
                out.println(text);
        }

        /*Дана строка из букв английского алфавита "aabccddefgghiijjkk".
        Нужно найти и напечатать буквы, которые дублируются в строке.
        Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
        В итоге в консоль должен быть выведен результат программы: "acdgijk".
        */

        private static void task7(){
            long start = System.nanoTime();

           // худший результат -
            out.println("Вариант 1");
            String text = "aabccddefgghiijjkk";
            String newText = "";
            for (int i = 1; i < text.length(); i++) {
                if(!newText.contains(String.valueOf(text.charAt(i))) && text.charAt(i) == text.charAt(i-1)) {
                    //newText += (String.valueOf(text.charAt(i)));
                    out.print(text.charAt(i));;
                }
            }
            out.println(newText);
            long finish = System.nanoTime();
            long elapsed = finish - start;
            out.println("Прошло времени у Ал 1, нс: " + elapsed);


            // наилучший результат +
            start = System.nanoTime();
            out.println("Вариант 2");
            StringBuilder textNew = new StringBuilder();
            for (int i = 1; i < text.length(); i++) {
                if(!contains(textNew, Character.toString(text.charAt(i))) && text.charAt(i) == text.charAt(i-1)) {
                    textNew.append(text.charAt(i));
                }
            }
            out.println(textNew);
            finish = System.nanoTime();
            elapsed = finish - start;
            out.println("Прошло времени у Ал 2, нс: " + elapsed);


            start = System.nanoTime();
            out.println("Вариант 3");
            String s = "aabccddefgghiijjkk";
            char[] arr = s.toCharArray();
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == arr[i - 1]){
                    out.print(arr[i]);
                    while (i < arr.length && arr[i] == arr[i-1]){
                        i++;
                    }
                }
            }

            out.println();
            finish = System.nanoTime();
            elapsed = finish - start;
            out.println("Прошло времени у Ан, нс: " + elapsed);

            start = System.nanoTime();
            out.println("Вариант 4");
            String str  = "aabccddefgghiijjkk";
            char[] us = str.toCharArray();
            for (int i = 1; i < us.length; i++) {
                if (us[i] == us[i - 1]){
                    out.print(us[i]);
                }
            }
            finish = System.nanoTime();
            elapsed = finish - start;
            out.println();
            out.println("Прошло времени у Ан, нс: " + elapsed);



        }
         private static boolean contains(StringBuilder sb, String findString){
                return sb.indexOf(findString) > -1;
         }



}