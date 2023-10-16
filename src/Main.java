import java.util.Arrays;
import java.util.Scanner;

// Задание: Поиск наиболее похожего слова в массиве на данное

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку: ");
        String sentence = scanner.nextLine();
        System.out.println("введите искомое слово: ");
        String word = scanner.nextLine();
        String[] sentenceArray = sentence.split(" ");
        System.out.print("Ответ: ");
        System.out.println(searchWord(sentenceArray, word));
    }

    public static String searchWord(String[] sentenceArray, String word) {
        for (int j = 1; j < word.length(); ++j) {
            String startLetter = word.substring(j);
            String endLetter = word.substring(0, word.length() - 1);
            for (int i = 0; i < sentenceArray.length; i++) {
                if (sentenceArray[i].contains(word)) {
                    return sentenceArray[i];
                } else if (sentenceArray[i].contains(startLetter)) {
                    return sentenceArray[i];
                } else if (sentenceArray[i].contains(endLetter)) {
                    return sentenceArray[i];
                }
            }
        }
        return "Похожее слово отсутствует";

    }
}