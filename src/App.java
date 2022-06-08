import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        
        ArrayList<Anggota> anggota = new ArrayList<Anggota>();
        anggota.add(new Anggota("Susi", "14588469", 1000000));
        anggota.add(new Anggota("Budi", "15489288", 1000000));
        Scanner keyboard = new Scanner(System.in);
        
        while(true) {
            Anggota susiAccount = anggota.get(0);
            System.out.println(susiAccount);
            System.out.println("---Selamat Datang Susi---");
            System.out.println("---Menu---");
            System.out.println("1. Transfer");
            System.out.println("2. Cek Mutasi");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda = ");
            int pilihan = keyboard.nextInt();
            
            if(pilihan == 1) {
                System.out.print("Masukkan No Rekening Tujuan : ");
                String rek = keyboard.next();
                System.out.print("Masukkan Jumlah Transfer : ");
                int jumlahTransfer = keyboard.nextInt();
                boolean found = false;
                for(Anggota i : anggota) {
                    if (i.norek.equals(rek)) {
                        found = true;
                        int retval = susiAccount.transfer(i, jumlahTransfer);
                        if(retval == -1) System.out.println("[ERROR] Transfer Nilai Negatif");
                        else if(retval == 0) System.out.println("[ERROR] Saldo tidak mencukupi");
                        else System.out.println("[SUCCESS] Rp." + jumlahTransfer + " Telah di transfer ke rekening " + i.norek);
                    }
                }
                if(!found) System.out.println("No. Rekening Tidak Ditemukan!");
            }
            
            if(pilihan == 2) {
                for(int i = 0; i < susiAccount.mutasi.size(); i++) {
                    System.out.println(i + 1 + ". " + susiAccount.mutasi.get(i));
                }
            }
            if(pilihan == 3)
                break;
        }
        keyboard.close();
    }
}
		
			
			
		
	
