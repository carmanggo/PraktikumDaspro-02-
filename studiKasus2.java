import java.util.Scanner;

/**
 * studiKasus2
 */
public class studiKasus2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPendanaan;

        System.out.print("Nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis kegiatan: ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Jumlah dokumen: ");
        jumlahDokumen = sc.nextInt();

        if (jumlahDokumen == 4) {
            
            if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("Mandiri")) {

                    System.out.print("Peringkat 1/2/3. 0 jika bukan juara: ");
                    peringkatJuara = sc.nextInt();

                    if (peringkatJuara >=1 && peringkatJuara <=3) {
                        System.out.println("Dokumen lengkap dan mendapat juara" +peringkatJuara);
                        System.out.println("Mendapat dana penghargaan");
                    } else {
                        System.out.println("Tidak mendapat juara");
                        System.out.println("Tidak mendapat dana penghargaan");
                    }
            } else if (jenisKegiatan. equalsIgnoreCase("PKM")) {
                System.out.print("Status pendanaan (Angka 1 = lolos, 0 = tidak lolos): ");
                statusPendanaan = sc.nextInt();

                if (statusPendanaan == 1) {
                    System.out.println("Lolos pendanaan" +statusPendanaan);
                } else {
                    System.out.println("Tidak lolos pendanaan" +statusPendanaan);
                }

            } else {
                System.out.println("Kegiatan diluar kategori");
                System.out.println("Tidak memperoleh dana penghargaan");
            }

        } else {
           System.out.print("Dokumen tidak lengkap (kurang" + (4 - jumlahDokumen) + "dokumen).");
           System.out.println("Dana penghargaan tidak diberikan.");
        }

        sc.close();
    }
}