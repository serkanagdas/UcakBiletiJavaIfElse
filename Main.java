import java.util.Scanner;

public class Main {
    public static void main(String []args){

        int type, km, age;
        double total, total2;
        Scanner scn = new Scanner(System.in);

        System.out.print(
                "1. Tek Yön\n" +
                "2. Çift \n" +
                "Lütfen uçuş yönünüzü seçiniz: ");
        type= scn.nextInt();

        System.out.print("Lütfen Yaşınızı Giriniz: ");
        age = scn.nextInt();

        if (type>2) {
            System.out.println("Hatalı Veri Girdiniz!");
           System.exit(1);
        }


        System.out.print("Lütfen kaç km uçacağınızı sadece rakam kullanarak belirtin: ");
        km= scn.nextInt();

        total = (km *0.10);

        if (type==1){
            System.out.println("İndirimsiz bilet fiyatınız: "+ total);
        }
        else if (type == 2){
            System.out.println("İndirimsiz bilet fiyatınız: " +(total*2));
        }

        if (age<=12){
            total=total/2;
        }
        else if (age>12 && age<=24) {
            total=total-((total*10)/100);
        }
        else if (age>=65){
            total=total- (total*30/100);
        }

        if (type==2){
            total=2*total - ((2*total*20)/100);
        }

        System.out.print("İndirimli bilet fiyatınız: "+total);


    }
}
