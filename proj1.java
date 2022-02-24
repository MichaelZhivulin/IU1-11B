import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;
public class main {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int value = 500;
        int bot = 0;
        int top = 1000;
        while(true){
            System.out.println("Is number more than " + value + " 1 - yes, 0 - no");
            int x = scan.nextInt();
            if(x == 1){
                bot = value;
                value = bot + (top - bot)/2;
            }
            else{
                top = value;
                value = bot + (top - bot)/2;
            }
            if(top - bot == 1)
            {
                value = bot + 1;
                break;
            }
        }
        System.out.println("Ur number is " + value);
    }
}