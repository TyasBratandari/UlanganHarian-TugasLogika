public class soal7{
    static boolean cari(int bilangan[],int ukuran){
        for(int i = 0; i < (ukuran - 1); i++){
            for(int j = (i + 1); j < ukuran; j++ ){
                if(bilangan[i] == bilangan[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] bilangan = {4, 1, 8, 7, 2};
        int ukuran = bilangan.length;

        if(cari(bilangan, ukuran)){
            System.out.println("ADA");
        }else{
            System.out.println("TIDAK ADA");
        }
    }
}