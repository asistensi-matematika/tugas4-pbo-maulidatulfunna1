package pbo;
public class BangunDatar {
   protected String jenis;
   public void view(){
       System.out.print("Nama Bangun Datarnya adalah ");
   }}
class Persegi extends BangunDatar{
       protected double sisi; 
     
       public Persegi(double sisi){
           this.sisi = sisi; }  
       public double luasPersegi(){
           double luaspersegi = sisi*sisi;
           return luaspersegi;
            }
       public double kelPersegi(){
           double kelpersegi = 4*sisi;
           return kelpersegi;
       }
       public void view(){
           super.view();
           System.out.println("Persegi");
           System.out.println(" luas persegi adalah = " +luasPersegi());
           System.out.println(" keliling persegi adalah = " + kelPersegi());
       }}
   class Segitiga extends BangunDatar{
       protected double alas;
       protected double tinggi;
       
       public Segitiga(double a){
           this.alas = a; }
       public Segitiga( double a, double t){
           this.alas = a;
           this.tinggi =t; }
       public double luasSegitiga(){
           double luassegitiga = 0.5*alas*tinggi;
           return luassegitiga;
       }
       public void view(){
           super.view();
           System.out.println("Segitiga"); }
        } 
   class Segitigasiku2 extends Segitiga{
       public Segitigasiku2(double a, double t){
            super(a,t);
        }
        public double sisiMiring(){
            double c = Math.sqrt(Math.pow(alas,2) + (Math.pow(tinggi,2)));
            return c;
        }
        public double kelSegitigasiku(){
            double kelsegitigasiku = alas+tinggi+sisiMiring();
            return kelsegitigasiku;
        }
        public void view(){
            super.view();
            System.out.println("Jenis Segitiga adalah : segitiga siku-siku" + "\nLuasnya = "
                                + luasSegitiga() + "\nkeliling segitiga = " + kelSegitigasiku());
        } }
        class Segitigasamasisi extends Segitiga{
            public Segitigasamasisi(double sisi){
                super(sisi); }
            public double luassegitigassisi(){
                double luas = 0.25*alas*alas*Math.sqrt(3);
                return luas;
            }
            public double kelilingsama(){
                return alas*3; }
            public void view(){
                super.view();
                System.out.println(" Jenis segitiga adalah : segitiga sama sisi " + "\nluasnya = "
                                    + luassegitigassisi() + "\nkelilingnya = " + kelilingsama());
            }}
         class Lingkaran extends BangunDatar{
             protected double jari2;
             public Lingkaran(double r){
                 this.jari2 = r;
             }
             public double luasL(){
                 double luas = Math.PI*Math.pow(jari2,2);
                 return luas; }
             public double kelilingL(){
                 double kelL = 2*Math.PI*jari2;
                 return kelL; }
             public void view(){
                 super.view();
                 System.out.println("Lingkaran");
                 System.out.println("Luas lingkaran = " + luasL());
                 System.out.println(" keliling lingkaran = " + kelilingL());
             } }
        
    
