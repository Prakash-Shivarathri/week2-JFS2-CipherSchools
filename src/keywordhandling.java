import java.util.Scanner;
public class keywordhandling {
    int n1,n2, result;
    Scanner sc = new Scanner(System.in);

    void calculation() {
        try {
            System.out.println("Enter First Number");
            n1 = sc.nextInt();

            System.out.println("Enter Second Number");
            n2 = sc.nextInt();

            result = n1 / n2;
        } catch(ArithmeticException ae){

        }
        catch(Exception e){
            System.out.println("Ouch! Exception Deteched!");
        }

        System.out.println("The Division is "+result);
    }
    public static void main(String[] args){
        keywordhandling obj = new keywordhandling();
        obj.calculation();
    }
}
/* Keyword to handle exception
  try
  catch
  finally
  throw
  thrown
*/
