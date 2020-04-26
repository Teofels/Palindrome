import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Palindrome {

    public static void isPalindrome(String target){

        String clearTarget = target.replaceAll("\\W", "").toLowerCase();

        String reverseTarget = new StringBuilder(clearTarget).reverse().toString();

        if (clearTarget.equals(reverseTarget)){
            System.out.println("Введенная строка - палиндром");
        }
        else{
            System.out.println("Введенная строка НЕ палиндром");
        }
    }


    public static void main(String[] args) {

        System.out.println("Запуск программы. Чтобы завершить выполнение введите: exit");

        try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in)))
        {
            String target;

            while(!(target=br.readLine()).equals("exit")){
                isPalindrome(target);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Завершение программы.");
        }
    }
}
