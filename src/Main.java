import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner input=new Scanner(System.in);

        int number= random.nextInt(100);
        int selected;
        int right=0;
        int[] guess=new int[5];
        boolean isWin=false;
        boolean isWrong=false;

        while (right < 5){
            System.out.println(number);
            System.out.println("Tahmininizi Giriniz : ");
            selected=input.nextInt();
            if (selected <0 || selected > 100){
                System.out.println("Hatalı Bir seçim yaptınız.0-100 arası bir değer giriniz.");
                if (isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                }else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }
            if (selected == number){
                isWin=true;
                break;
            }else {
                if (selected > number){
                    System.out.println("Gizli Sayıdan büyük bir seçim yaptınız.");
                }else {
                    System.out.println("Gizli Sayıdan küçük bir seçim yaptınız.");
                }
            }
            guess[right]=selected;
            right++;
            System.out.println("Kalan hak : "+(5-right));
        }
        if (isWin){
            System.out.println("Tebrikler!");

        }else {
            System.out.println("Kaybettiniz ! : "+"\n Gizli Sayı : "+ number);
            System.out.println("Tahminleriniz : "+ Arrays.toString(guess));

        }

    }
}
