package Chapter14;

import java.util.Scanner;

public class Task22 {
    //.- -... -.-.   -.. . ..-. abc def-пример выполнения
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
        };

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----"};

        //вводим предложение, которое хотим  перевести
        System.out.println("Please enter what you want to converts: ");
        String sentence = input.nextLine().toLowerCase();

        //создаем пустую переменную,куда будем записывать переведенные буквы
        String str = "";

//МОЖНО ЛИ КАК ТО ЗАДАТЬ if (sentence.contains("w") или [a-z])?????

        if (sentence.contains(".") || sentence.contains("-")) {
            //разделяем предложение по словам и записываем в массив
            String[] words = sentence.split("   ");
            //прогоняем каждое слово
            for (String word : words) {
                //разделяем каждое слово на буквы
                String[] letters = word.split(" ");
                //прогоняем каждую букву
                for (String letter : letters) {
                    //ищем совпадает ли буква хоть с чем-то в морзе
                    for (int j = 0; j < morse.length; j++) {
                        //если совпадает тогда добавляем в нашу переменную (только из английского алфавита,
                        // используя тот же индекс,что и морзе)
                        if (morse[j].equals(letter)) {
                            str += english[j];
                        }
                    }
                }
                //добавляем пробел после пройденного слова
                str += " ";
            }
            //выводим итог
            System.out.println("Translated variant: " + str);

        } else {
            //разделяем предложение на массив символов чар
            char[] chars = sentence.toCharArray();
            //цикл по длине всего массива chars(по каждому сомволу
            for (int i = 0; i < chars.length; i++) {
                //выполняем поиск по массиву english
                for (int j = 0; j < english.length; j++) {
                    //если символ массива chars равен символу массива english, то обращаемся к массиву morse
                    // по индексу массива english, где было найдено совпадение и записываем его в переменную str
                    if (english[j] == chars[i]) {
                        str += morse[j] + " ";
                    }
                }
                //добавляем тройной пробел между словами, соответственно требованию задания
                if (chars[i] == ' ')
                    str = str + "   ";
            }
            //выводим результат
            System.out.println(str);
        }
    }
}
