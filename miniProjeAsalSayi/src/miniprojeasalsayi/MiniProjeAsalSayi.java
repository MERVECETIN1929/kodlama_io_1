package miniprojeasalsayi;

public class MiniProjeAsalSayi {

    public static void main(String[] args) {
        int number=-2;
        boolean asalMı=true;
        if(number<1){
            System.out.println("geçersiz sayı");
            return;
        }
        if(number==1){
            System.out.println("sayı asal değildir");
            return;
        }
        for(int i=2;i<number/2;i++){
            if(number%i==0){
                asalMı=false;
            }
        }
        if(asalMı){
            System.out.println("sayı asaldır");
        }
        else{
            System.out.println("sayı asal değildir");
        }
    }

}
