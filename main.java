import java.util.Scanner;
public class main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        long bot = -1;
        long top = 2_147_483_648L;
        long value = top/2;
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