import java.util.ArrayList;
import java.util.Random;
public class PabrikPensilWarna {
    public static void main(String[] args) {
        ArrayList<Integer> produksiBiru = new ArrayList<>();
        ArrayList<Integer> produksiMerah = new ArrayList<>();
        ArrayList<Integer> produksiHijau = new ArrayList<>();
        ArrayList<Integer> produksiOranye = new ArrayList<>();
        ArrayList<Integer> produksiHitam = new ArrayList<>();
        ArrayList<Integer> produksiUngu = new ArrayList<>();

        int totalProduksi = 20000;
        int jumlahBox = 6;
        int jumlahPensilPerBox = totalProduksi / jumlahBox;

        for (int i = 0; i < totalProduksi; i++) {
            Random random = new Random();
            int warna = random.nextInt(6) + 1;
            switch (warna) {
                case 1:
                    produksiBiru.add(1);
                    break;
                case 2:
                    produksiMerah.add(1);
                    break;
                case 3:
                    produksiHijau.add(1);
                    break;
                case 4:
                    produksiOranye.add(1);
                    break;
                case 5:
                    produksiHitam.add(1);
                    break;
                case 6:
                    produksiUngu.add(1);
                    break;
            }
        }
        int JumlahPensilBiru = produksiBiru.size();
        int JumlahPensilMerah = produksiMerah.size();
        int JumlahPensilHijau = produksiHijau.size();
        int JumlahPensilOranye = produksiOranye.size();
        int JumlahPensilHitam = produksiHitam.size();
        int JumlahPensilUngu = produksiUngu.size();

        int biruMax = 0;
        int biruMin = Integer.MAX_VALUE;
        int merahMax = 0;
        int merahMin = Integer.MAX_VALUE;
        int hijauMax = 0;
        int hijauMin = Integer.MAX_VALUE;
        int oranyeMax = 0;
        int oranyeMin = Integer.MAX_VALUE;
        int hitamMax = 0;
        int hitamMin = Integer.MAX_VALUE;
        int unguMax = 0;
        int unguMin = Integer.MAX_VALUE;

        for (int i=0; i < produksiBiru.size(); i ++){
            if (produksiBiru.get(i) > biruMax){
                biruMax = produksiBiru.get(i);
            }
            if (produksiBiru.get(i)< biruMin){
                biruMin = produksiBiru.get(i);
            }
        }
        for (int i=0; i < produksiMerah.size(); i ++){
            if (produksiMerah.get(i) > merahMax){
                merahMax = produksiMerah.get(i);
            }
            if (produksiMerah.get(i)< merahMin){
                merahMin = produksiMerah.get(i);
            }
        }
        for (int i=0; i < produksiHijau.size(); i ++){
            if (produksiHijau.get(i) > hijauMax){
                hijauMax = produksiHijau.get(i);
            }
            if (produksiHijau.get(i)< hijauMin){
                hijauMin = produksiHijau.get(i);
            }
        }
        for (int i=0; i < produksiOranye.size(); i ++){
            if (produksiOranye.get(i) > oranyeMax){
                oranyeMax = produksiOranye.get(i);
            }
            if (produksiOranye.get(i)< oranyeMin){
                oranyeMin = produksiOranye.get(i);
            }
        }
        for (int i=0; i < produksiHitam.size(); i ++){
            if (produksiHitam.get(i) > hitamMax){
                hitamMax = produksiHitam.get(i);
            }
            if (produksiHitam.get(i)< hitamMin){
                hitamMin = produksiHitam.get(i);
            }
        }
        for (int i=0; i < produksiUngu.size(); i ++){
            if (produksiUngu.get(i) > unguMax){
                unguMax = produksiUngu.get(i);
            }
            if (produksiUngu.get(i)< unguMin){
                unguMin = produksiUngu.get(i);
            }
        }

        System.out.println("Total Produksi Setiap Warna: ");
        System.out.println("Biru: " + JumlahPensilBiru);
        System.out.println("Merah: " + JumlahPensilMerah);
        System.out.println("Hijau: " + JumlahPensilHijau);
        System.out.println("Oranye: " + JumlahPensilOranye);
        System.out.println("Hitam: " + JumlahPensilHitam);
        System.out.println("Ungu: " + JumlahPensilUngu);

        System.out.println("Maksimum produksi pensil biru: " + biruMax);
        System.out.println("Minimum produksi pensil biru: " + biruMin);
        System.out.println("Maksimum produksi pensil merah: " + merahMax);
        System.out.println("Minimum produksi pensil merah: " + merahMin);
        System.out.println("Maksimum produksi pensil hijau: " + hijauMax);
        System.out.println("Minimum produksi pensil hijau: " + hijauMin);
        System.out.println("Maksimum produksi pensil oranye: " + oranyeMax);
        System.out.println("Minimum produksi pensil oranye: " + oranyeMin);
        System.out.println("Maksimum produksi pensil hitam: " + hitamMax);
        System.out.println("Minimum produksi pensil hitam: " + hitamMin);
        System.out.println("Maksimum produksi pensil ungu: " + unguMax);
        System.out.println("Minimum produksi pensil ungu: " + unguMin);
    }
}

