// 1.Реализуйте метод, который запрашивает у пользователя ввод дробного 
// числа (типа float), и возвращает введенное значение. 
// Ввод текста вместо числа не должно приводить к падению 
// приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.io.*;

public class Task1 {
    public static void main(String[] args){
        number();
    }

    public static void number(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            float result = User(bufferedReader);
            bufferedReader.close();
            System.out.println(result);
        } catch (IOException e){
            System.out.println("Возникла ошибка при работе с файлом");
            return;
        }
    }

    public static float User(BufferedReader bufferedReader){
        System.out.print("Введите число: ");
        float result;
        try {
            result = Float.parseFloat(bufferedReader.readLine());
        } catch (NumberFormatException e){
            System.out.println("Ввели не число! Проверьте!");
            return User(bufferedReader);
        } catch (Exception e){
            System.out.println("Произошла ошибка при получении числа");
            return User(bufferedReader);
        }
        return result;
    }
}