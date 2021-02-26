package konstruktorparameter;
public class Hitung {
    int panjang;
    int lebar;
    int hasil,hasil1,hasil2;
    int Gabungan;
    
    void HitungPersegipanjang(int panjang,int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    int panjang (){
        return panjang;
                
    }   
    int lebar(){
        return lebar;
        
    }
    int Hitung(){
        hasil1 = panjang*lebar;
        System.out.println("Luas Persengi panjang adalah "+ hasil1);
        return hasil1  ;
                  
    }
    void HitungPersegi(int panjang,int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    int Hitung2(){
        hasil2 = panjang*lebar;
        System.out.println("Luas Persegi adalah "+ hasil2);
        return hasil2;
}
}
