import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        float km,kmBasina,acilis=10,minTutar=20,toplamTutar;
        kmBasina=2.20f;
        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen km'yi girin: ");
        km = input.nextFloat();

        toplamTutar = acilis + (km*kmBasina);
        if(toplamTutar < 20){
           toplamTutar = 20;
        }
        System.out.println("Ödenecek toplam tutar : "+toplamTutar);

    }
}
