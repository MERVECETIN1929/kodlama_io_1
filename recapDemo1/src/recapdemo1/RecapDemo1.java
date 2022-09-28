
package recapdemo1;


public class RecapDemo1 {

    
    public static void main(String[] args) {
        //en büyük sayıyı direkt olarak bir değişkene atayarak da çözülebilir.
        int sayi1=-5;
        int sayi2=-6;
        int sayi3=12;
        if(sayi2>sayi1 && sayi2>sayi3 ){
            System.out.println(sayi2);
        }
        else if(sayi1>sayi3 && sayi1>sayi2){
            System.out.println(sayi1);
        }
        else{
            System.out.println(sayi3);
        }
    }
    
}
