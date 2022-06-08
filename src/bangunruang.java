import java.util.Scanner;

public class bangunruang {

	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		while(true) {
			System.out.println("Bangun Ruang : ");
			System.out.println("1. Kubus");
			System.out.println("2. Balok");
			System.out.println("3. Prisma Segitiga");
			System.out.println("4. Tabung");
			System.out.println("5. Keluar");
			System.out.print("Pilihan Anda (1/2/3/4/5) : ");
			int pilihan = keyboard.nextInt();
			
			if (pilihan == 1) {
				System.out.print("Panjang Sisi Kubus = ");
				float s = keyboard.nextFloat();
				float v = s*s*s;
				System.out.println("Volume Kubus Adalah = "+v + " cm3" );
			}
			else if (pilihan==2) {
				float panjang,lebar,tinggi,volume;
				System.out.print("Masukkan panjang : ");
		        panjang = keyboard.nextFloat();
		        System.out.print("Masukkan lebar : ");
		        lebar = keyboard.nextFloat();
		        System.out.print("Masukkan tinggi : ");
		        tinggi = keyboard.nextFloat();
		        volume = panjang*lebar*tinggi;
		        System.out.println("Volume Balok : " + volume + " cm3");
			}
			else if (pilihan==3) {
				int alas;
			    int tinggisegitiga;
			    int tinggi;
			    double volume;
			    
			    System.out.print("Masukkan alas = ");
				alas = keyboard.nextInt();

				System.out.print("Masukkan tinggi segitiga = ");
				tinggisegitiga = keyboard.nextInt();

				System.out.print("Masukkan tinggi = ");
				tinggi = keyboard.nextInt();
				volume = 0.5*alas*tinggisegitiga*tinggi;
				System.out.println("Volume prisma segitiga = "+ volume);
			    }
			else if (pilihan==4) {
				float phi = 3.14f;
		        float r;
		        float tinggi;
		        float volume;
		        System.out.print("Masukkan jari-jari tabung : ");
		        r = keyboard.nextFloat();
		        System.out.print("Masukkan tinggi tabung : ");
		        tinggi = keyboard.nextFloat();
		        volume = phi*r*r*tinggi;
		        System.out.println("Volume Tabung : " + volume + " cm3");
			}
			else if (pilihan==5) break;
			String yn ;
			
			System.out.print("Back to menu ? (y/n) = ");
			keyboard.nextLine();
			yn = keyboard.nextLine();
			
			if (yn.equals("n")) break;
			else if (yn.equals("y")) continue;
			}
		}
	}
		
			
			
		
	
