import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 14, 1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 10, 12));
        List<Integer> numsTwo = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0)
                System.out.println(nums.get(i));
        }

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                numsTwo.add(nums.get(i));
            }
        }
        Set<Integer> nums2 = new HashSet<>(numsTwo);
        System.out.println(nums2);
        List<String> strings = new ArrayList<>(List.of("привет","Пока","чижик","привет","назад"));
        Set<String> stringsUpdated = new HashSet<>(strings);
        System.out.println(stringsUpdated);

        List<String> stringsExerciseFour = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String, Integer> wordCounts = new HashMap<>();

        // Подсчитываем количество каждого слова
        for (String word : stringsExerciseFour) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordCounts.values());
    }
}