import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {

        int fiyat ;
        Scanner input = new Scanner(System.in);

        System.out.print("Fiyat Giriniz:");
        fiyat = input.nextInt();

        double tutar;
        tutar = fiyat <= 1000 ? (fiyat + (fiyat*0.18)) : (fiyat + (fiyat*0.08)) ;
        System.out.println("KDV Dahil Fiyat:" + tutar);

        String tutar2 ;
        tutar2 = fiyat <= 1000 ? "KDV Tutarı : %18" : "KDV Tutarı : %8" ;
        System.out.println(tutar2);


    }
}
