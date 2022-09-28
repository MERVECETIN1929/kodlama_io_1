package switchdemo;


public class SwitchDemo {

    
    public static void main(String[] args) {
       char grade ='1';
       // switchin dallanmada karar vereceği değişkeni söylememiz lazım
       switch(grade){
           case 'A':
           case 'B':
               System.out.println("çok iyi geçtiniz");
               break;
               
               
               case 'C':
               System.out.println("ortalama geçtiniz");
               break;
               case 'D':
               System.out.println("fena değil geçtiniz");
               break;
               case 'f':
               System.out.println("kaldınız");
               break;
               default:
                   System.out.println("geçersiz not girişi");
               
       }
    }
    
}
