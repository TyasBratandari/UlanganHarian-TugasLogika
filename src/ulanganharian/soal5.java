package ulanganharian;

public class soal5 {
    public static void main(String[] args){
        int angka1 = 2, angka2=3, angka3 =4, maks;
        
        for(int i=0; i<1; i++){
            if (angka1>angka2 && angka1>angka3) {
            maks = angka1;
        } else if (angka2>angka1 && angka2>angka3){
            maks = angka2;
        } else{
            maks = angka3;
        }
        System.out.println("Angka maksimum= "+maks);
        }
        
    }
    
}
