package ulanganharian;

public class soal7 {
    public static void main(String[] args){
//        int[] array = {2,3,1,5,3};
//        System.out.println(array);
        
        int[] angka={2,3,1,5,3};
        int a = 0;
        for(int i =0; i<angka.length; i++){
            if(angka[i] == 3){
            a += 1;
        }
        }
        System.out.println("Angka yang sama adalah " + a);
    }
}
