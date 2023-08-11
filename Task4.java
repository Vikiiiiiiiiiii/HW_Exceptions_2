// Разработайте программу, которая выбросит Exception, 
// когда пользователь вводит пустую строку. Пользователю должно показаться 
// сообщение, что пустые строки вводить нельзя.

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ввод данных: ");
        try {
            String result = reader.readLine();
            if(result.equals("")) throw new RuntimeException("Предупреждение!Пустую строку вводить нельзя!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\nЗаписано!");
    }
}