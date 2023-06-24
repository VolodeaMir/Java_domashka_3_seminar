
// home_work_05
import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

public class home_work_05 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> permutations = generatePermutations(nums);
        System.out.println(permutations);
    }

    private static List<List<Integer>> generatePermutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generate(nums, 0, result);
        return result;
    }

    private static void generate(int[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length - 1) {
            // Добавляем текущую перестановку в результат
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
        } else {
            for (int i = start; i < nums.length; i++) {
                // Меняем местами текущий элемент с каждым элементом справа от него
                swap(nums, start, i);
                // Генерируем перестановки для оставшейся части массива
                generate(nums, start + 1, result);
                // Возвращаем элемент на свое место
                swap(nums, start, i);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
