import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bakiye = 1000;
        int miktar;

        System.out.println("Merhaba ATM'ye hoşgeldiniz...");
        System.out.println("Güncel Bakiyeniz : "+bakiye);

        while(bakiye>0){
            System.out.println();
            System.out.println("1-PARA YATIR");
            System.out.println("2-PARA ÇEK");
            System.out.println("3-BAKİYE SORGULA");
            System.out.println("4-ÇIKIŞ YAP");

            System.out.println("lütfen yapmak istediğiniz işlemi seçin : ");
            int secim = input.nextInt();

            if(secim==1){
                System.out.println("Yatırmak istediğiniz miktarı giriniz : ");
                miktar=input.nextInt();
                bakiye+=miktar;
            }
            else if(secim==2){
                System.out.println("Çekmek istediğiniz tutarı giriniz : ");
                miktar =input.nextInt();
                if(miktar>bakiye){
                    System.out.println("yetersiz bakiye");
                }
                else{
                    bakiye-=miktar;
                }
            }
            else if(secim==3){
                System.out.println("Güncel Bakiyeniz : "+bakiye);
            }
            else if(secim==4){
                System.out.println("çıkış yapılıyor");
                break;
            }
            else{
                System.out.println("1-4 arası tuşlama yapın");
            }
        }
    }
}