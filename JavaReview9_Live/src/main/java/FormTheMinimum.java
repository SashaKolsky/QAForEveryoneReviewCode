import java.util.Arrays;

// https://www.codewars.com/kata/5ac6932b2f317b96980000ca
public class FormTheMinimum {

    public static int minValue(int[] values){

        // Algorithm:
        // 1. sort array
        //      Текущей элемент сравниваем со следующим, меняем местами если следующий меньше текущего
        // 2. remove duplicates
        // 3. return as single number

        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] > values[j]) {
                    int tempI = values[i];
                    values[i] = values[j];
                    values[j] = tempI;
                }
            }
        }

        // 2. remove duplicates
        String valuesDedupedStr = "";
        for (int i = 0; i < values.length; i++) {
            if (!valuesDedupedStr.contains("" + values[i])) {
                valuesDedupedStr += values[i];
            }
        }

        // 3. return as single number
        return Integer.valueOf(valuesDedupedStr);
    }

}
