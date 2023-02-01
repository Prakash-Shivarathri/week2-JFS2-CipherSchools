import java.util.InputMismatchException;
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
        }catch(InputMismatchException ime){
            System.out.println("IME Detechted");

        }
        catch(ArithmeticException ae){
            System.out.println("AE Detected");

        }
        catch(Exception e){
            System.out.println("Ouch! Exception Deteched!"+e.getMessage());
            e.printStackTrace();
        }
        finally{
            System.out.println("The Division is"+result);
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
