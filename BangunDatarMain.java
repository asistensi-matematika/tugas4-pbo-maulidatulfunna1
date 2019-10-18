package pbo;
import java.util.Scanner;

public class BangunDatarMain {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BangunDatar b1 = new BangunDatar();
        System.out.println(" Pilih bangun datar yang diinginkan"
                + "\n1. Persegi\n2. Lingkaran\n3. Segitiga");
              
        System.out.print("Masukkan pilihan anda\t : ");
        int pil = in.nextInt();
        switch(pil){
            case 1:{
                System.out.print("Masukkan panjang sisi\t :");
                double sisi = in.nextDouble();
                Persegi P1 = new Persegi(sisi);
                P1.view();
                break;  }
            case 2 :{
                System.out.print("Masukkaan jari-jari\t : ");
                double jari2 = in.nextDouble();
                Lingkaran L1 = new Lingkaran(jari2);
                L1.view();
                break;}
            case 3 : {
                System.out.println(" \nPilih segitiga yang diinginkan"
                                    + "\n1. segitiga siku-siku\n2. segitiga sama sisi");
                System.out.print(" masukkan pilihan anda : ");
                int pilih = in.nextInt();
                switch(pilih){
                    case 1 :{
                        System.out.print("masukkan alas : ");
                        double a =in.nextDouble();
                        System.out.print(" masukkan tinggi ");
                        double t = in.nextDouble();
                        Segitigasiku2 siku = new Segitigasiku2(a,t);
                        siku.view();
                        break; }
                    case 2:{
                        System.out.print(" masukkan sisi : ");
                        double sisi = in.nextDouble();
                        Segitigasamasisi ss = new Segitigasamasisi(sisi);
                        ss.view();
                        break;}
                } }} } }
