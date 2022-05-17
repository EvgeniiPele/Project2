package lesson2;

import static com.sun.tools.doclint.Entity.sum;

public class TestArray {
    public static final String[][] SUM_ARRAY_VALUES = new String[][]{
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"}

    };
    public static final int SIZE_ARRAY = 4;

    public static void main(String[] args) {
        try {
            int sum = sumArrayValues(SUM_ARRAY_VALUES);
            System.out.println(sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int sumArrayValues(String[][] array) {
        arraySizeValidation(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            String[] row = array[i];
            for (int j = 0; j < row.length; j++) {
                String value = row[i];
                try {
                    sum += Integer.parseInt(value);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }

            }
        }
        return sum;
    }

    private static void arraySizeValidation(String[][] array) {
        if (array.length != SIZE_ARRAY) {
            throw new MyArraySizeException();
        }
        for (String[] row : array) {
            if (row.length != SIZE_ARRAY) {
                throw new MyArraySizeException();
            }
        }
    }
}

