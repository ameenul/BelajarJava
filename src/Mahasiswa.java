import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int nilaiX,nilaiY,hasil;
        boolean hasilLogika;
        nilaiX = 0;
        nilaiY=0;
        hasil=0;

        System.out.println("Masukan x: ");
        nilaiX = inp.nextInt();

        System.out.println("Masukan y: ");
        nilaiY = inp.nextInt();

        hasilLogika = nilaiX > nilaiY; 
        System.out.println("Hasil logika = "+hasilLogika);






        

        


       

        
       
       



    }

}
