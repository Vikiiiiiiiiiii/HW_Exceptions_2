// 2. Если необходимо, исправьте данный код:

// try {
//    int d = 0;
//    double catchedRes1 = intArray[8] / d;
//    System.out.println("catchedRes1 = " + catchedRes1);
// }  catch (ArithmeticException e) {
//    System.out.println("Catching exception: " + e);
// }
 

public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[10];                      // размерность
        System.out.println("Значение: " + array[5]);    // исключение сработает, если мы превысим размерность
        
        try {
            int d = 0;
            double catchedRes1 = array[8] / d;          // деление на ноль
            System.out.println("catchedRes1 = " + catchedRes1);
            } catch (ArithmeticException e) {
                System.out.println("Catching exception: " + e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Catching exception: " + e);
            }
    }
}