package arkadassayilar;

public class ArkadasSayilar {

    public static void main(String[] args) {
        int number1=220;
        int number2=285;
        int number1b=0;
        int number2b=0;
        for(int i=1;i<(number1/2)+1;i++){
            if(number1%i==0){
                number1b+=i;
            }
        }
         for(int i=1;i<(number2/2)+1;i++){
            if(number2%i==0){
                number2b+=i;
            }
        }
         if(number1==number2b&&number2==number1b){
             System.out.println("sayıları arkadaş sayılardır");
             
         }
         else{
             System.out.println("sayılar arkadaş değildir");
         }
    }

}
