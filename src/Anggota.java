import java.util.ArrayList;

public class Anggota {
        String nama;
        String norek;
        ArrayList<Integer> mutasi;
        int saldo;
        Anggota(String nama, String norek, int saldo) {
            this.mutasi = new ArrayList<Integer>();
            this.nama = nama;
            this.norek = norek;
            this.saldo = saldo;
        }
        int transfer(Anggota anggota, int val) {
            int transferred = val;
            if (val < 0)
                return -1; // transfer negatif
            if(this.saldo < val)
                return 0; // jumlah transfer lebih besar dari saldo
             
            this.saldo -= transferred;
            anggota.saldo += transferred;
            this.mutasi.add(-transferred);
            anggota.mutasi.add(transferred);
            return 1;
        }
        public String toString() {
            String tmp =  "Nama: " + this.nama + "\nNo. Rekening: " + this.norek + "\nSaldo: " + this.saldo + "\nMutasi: ";
            for(int i = 0; i < this.mutasi.size(); i++) {
                if(i > 0)
                    tmp += "        ";
                tmp += (i + 1) + ". " + this.mutasi.get(i) + "\n";
            }
            return tmp;
        }
    };

