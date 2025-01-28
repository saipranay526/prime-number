import java.util.Scanner;
public class Primecheck {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int num = scanner.nextInt();
        if (num==1){
            System.out.println("not a prime number");
        }else{
            for(int i=2;i<=num;i++){
                if (num%i==0){
                    System.out.println("prime number");
                }else{
                    System.out.println("not a prime number");
                }
            }
        }
        scanner.close();
    }
    
}