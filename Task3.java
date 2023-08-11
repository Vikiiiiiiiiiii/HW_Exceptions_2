// 3. Дан следующий код, исправьте его там, где требуется
/* 
public static void main(String[] args) throws Exception {
    try {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = { 1, 2 };
        abc[3] = 9;
    } catch (Throwable ex) {
        System.out.println("Что-то пошло не так...");
    } catch (NullPointerException ex) {
        System.out.println("Указатель не может указывать на null!");
    } catch (IndexOutOfBoundsException ex) {
        System.out.println("Массив выходит за пределы своего размера!");
    }
 
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
}    

*/ 
// Решение: 

public class Task3 {
    public static void main(String[] args){
        
        try {
            del(90, 3);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;

        }catch (ArithmeticException ex) {
            System.out.println("Делить на ноль нельзя!");
        } catch (NullPointerException e) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception e) {
            System.out.println("Что-то пошло не так...");
        }
       
    }

    public static void del(Integer a, Integer b){
        System.out.println(a / b);
    }
   
    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }
}