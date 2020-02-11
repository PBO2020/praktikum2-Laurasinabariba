package mesinkopi;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Mesinkopi {

    String pilihan;
    String nama_kopi;
    String asal_kopi;
    String jenis_kopi;

    ArrayList<kopi> kopi = new ArrayList<kopi>();
    Scanner snb = new Scanner(System.in);
    kopi lora = new kopi();

    public static void main(String[] args) {
        Mesinkopi robusta = new Mesinkopi();
        robusta.menu();
    }

    void menu() {
        int pilihan;
        System.out.println("======================");
        System.out.println(" >> SELAMAT DATANG << ");
        System.out.println(" 1. Jenis kopi ");
        System.out.println(" 2. Toping Kopi");
        System.out.println(" 3. Keluar ");
        System.out.println("======================");
        System.out.println("pilihan : ");
        pilihan = snb.nextInt();
        switch (pilihan) {
            case 1:
                jeniskopi();
                break;
            case 2:
                topping();
                break;
            case 3:
                System.out.println(">>TERIMAKASIH<<");
        }

    }

    void jeniskopi() {
        for (int i = 0; i < kopi.size(); i++) {
            int l = i + 1;
            System.out.println("Menu Kopi Adalah" + l + ";" + lora.getNama_kopi() + "Berasal dari " + lora.getAsal_kopi());
        }
        try {
            kopi satu = new kopi();
            satu.setNama_kopi("Robusta");
            satu.setAsal_kopi("Eropa");
            kopi.add(satu);

            kopi dua = new kopi();
            dua.setNama_kopi("Arabika");
            dua.setAsal_kopi("Timur Tengah");
            kopi.add(dua);

            kopi tiga = new kopi();
            tiga.setNama_kopi("Flores");
            tiga.setAsal_kopi("Asia");
            kopi.add(tiga);

            for (int j = 0; j < kopi.size(); j++) {
                int k = j + 1;
                String l = null;
                System.out.println("\n Menu kopi kamu adalah :  " + l + "" + lora.getNama_kopi() + "Berasal dari" + lora.getAsal_kopi());
            }
            System.out.println("\n Pilihan menu Kopi :");
            pilihan = snb.next();
            switch (pilihan) {
                case "1":
                    System.out.println("\n Pesanan anda adalah  kopi" + kopi.get(0).getNama_kopi() + "Berasal Dari : " + kopi.get(0).getAsal_kopi());
                    lanjut();
                    break;
                case "2":
                    System.out.println("\n Pesanan anda adalah  kopi" + kopi.get(1).getNama_kopi() + "Berasal Dari : " + kopi.get(1).getAsal_kopi());
                    lanjut();
                    break;
                case "3":
                    System.out.println("\n Pesanan anda adalah  kopi" + kopi.get(2).getNama_kopi() + "Berasal Dari : " + kopi.get(2).getAsal_kopi());
                    lanjut();
                    break;
            }

        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("maaf pilihan berupa angka");
        }}
    
         void topping() {
        try {
            kopi empat = new kopi();
            empat.setToping_kopi("Boba");
            kopi.add(empat);

            kopi lima = new kopi();
            lima.setToping_kopi("Seres");
            kopi.add(lima);

            kopi enam = new kopi();
            enam.setToping_kopi("cream");
            kopi.add(enam);
            for (int i = 3; i < kopi.size(); i++) {
                int j = i + 1;
                System.out.println("\nMenu Topping " + j + " : " + kopi.get(i ));
            }
            System.out.print("\nPilih Menu Topping :");
            pilihan = snb.next();
            switch (pilihan) {
                case "4":
                    System.out.println("\n Pesanan anda adalah  kopi" + kopi.get(4).getNama_kopi() + "Berasal Dari : " + kopi.get(4).getAsal_kopi());
                    lanjut();
                    break;
                case "5":
                    System.out.println("\n Pesanan anda adalah  kopi" + kopi.get(5).getNama_kopi() + "Berasal Dari : " + kopi.get(5).getAsal_kopi());
                    lanjut();
                    break;
                case "6":
                    System.out.println("\n Pesanan anda adalah  kopi" + kopi.get(6).getNama_kopi() + "Berasal Dari : " + kopi.get(6).getAsal_kopi());
                    lanjut();
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("Mohon maaf , pilihan berupa angka");
        }
    }

    public void lanjut() {
        System.out.println("\n apakah ingin lanjut ? (y/t)");
        String pilih = new Scanner(System.in).nextLine();
        switch (pilih) {
            case "y":
                break;
            case "t":
                System.out.println(">>TERIMAKASI<<");
        }
    }

    
}
