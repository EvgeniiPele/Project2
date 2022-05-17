package lesson2;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(int row, int col) {
        super(String.format ("Невозможно получить число из объекта array [%d] [%d]",row, col));
    }
}
