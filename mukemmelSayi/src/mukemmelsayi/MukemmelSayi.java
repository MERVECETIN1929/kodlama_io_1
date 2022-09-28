package mukemmelsayi;

public class MukemmelSayi {

    public static void main(String[] args) {
        int number=5;
        int bölümToplam=0;
        for(int i=1;i<(number/2)+1;i++){
            if(number%i==0){
                bölümToplam+=i;
            }
        }
        if(bölümToplam==number){
        System.out.println("sayı mükemmel sayıdir");
        }
        else{
            System.out.println("sayı mükemmel sayı değildir");
        }
    }

}
