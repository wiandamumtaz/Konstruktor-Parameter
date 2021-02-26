package konstruktorparameter;
public class Gabungan {

    
    public static void main(String[] args) {
        Hitung hasil = new Hitung ();
        hasil.HitungPersegipanjang(4,5);
        hasil.Hitung();
        
        hasil = new Hitung ();
        hasil.HitungPersegi(7, 5);
        hasil.Hitung2();
    }
    
}
