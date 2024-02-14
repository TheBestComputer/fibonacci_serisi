
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonaccinin eleman sayisi (Lutfen 2 den buyuk sayi giriniz) : ");
        n = scanner.nextInt();
        int total = 0, dongu = 0, i = 0, j = 1,dongu2 = 0;
        System.out.print("0 1 ");
        while(dongu2 < (n-2)){
            if(dongu == 0){
                total = i + j;
                System.out.print(total + " ");
                dongu++;
                dongu2++;
            }
            else{
                j = j + total;
                System.out.print(j + " ");
                i = total;
                dongu--;
                dongu2++;
            }
        }
    }
}
