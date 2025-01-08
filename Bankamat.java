import java.util.Scanner;

public class Bankamat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balans = 600000;
        System.out.println("Kodni kiriting ");
        int pin_kod=scanner.nextInt();
        if (pin_kod==5000){
            System.out.println("[+] Amalni bajaring");
            System.out.println("[+] 1- balansini teshkirish");
            System.out.println("[+] 2 - Naqd pul olish");
            System.out.println("[+] 3 - Nomer kiritish");

            int amal = scanner.nextInt();
            if (amal==1){
                System.out.println(balans+"Som bor");
            };
            if (amal==3){
                System.out.println("Nomeringizni kiriting  qoshib yozing");
              int nomer = scanner.nextInt();

                System.out.println(nomer+ " sizning nomeringiz");
            }
            if (amal==2){
                System.out.println("[+] 1-100 ming");
                System.out.println("[+] 2-150 ming ");  
                System.out.println("[+] 3-350 ming");
                int amal_summa = scanner.nextInt();
                if (amal_summa==1){
                    balans=balans-101000;
                    System.out.println("10000 som pulni oling");
                    System.out.println(balans+"som qoldi");
                }
            if (amal_summa==2){
                balans=balans-150000;
                System.out.println(150000 + "som pulni oling");
                System.out.println(balans+ "som qoldi");
            }
            if (amal_summa==3){
                balans=balans-300000;
                System.out.println(300000+ "pulni oling");
                System.out.println(balans + "som qoldi");
            }
            if (amal_summa==4){
                System.out.print ("[+] Summani kiriting");
                int summa= scanner.nextInt();
                int foiz = summa/100;
                int oxirigi_summa= summa+foiz;
                if (oxirigi_summa>balans){
                    System.out.println("[-] mablangiz yetarli emas");
                }

                else {
                    System.out.println(summa+ "Pulni oling");
                    System.out.println(balans-oxirigi_summa+"som qoldi");
                }
            }
            else {
                System.out.println("[-] pin kod hato");
            }

            }

        }
            else {
                System.out.println("[-] Xato pin kod");

            }
    }
}
