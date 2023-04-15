import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz : ");
        n = input.nextInt();
        int nTemp= n/2+1;
        for(int i=1;i<=nTemp;i++){
            for (int k=1; k<=(nTemp-i);k++){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=nTemp-1;0<=i;i--){
            for (int k=(nTemp-i-1); 0<=k;k--){
                System.out.print(" ");
            }
            for (int j=(2*i-2); 0<=j;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}















