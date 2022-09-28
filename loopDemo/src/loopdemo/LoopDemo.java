
package loopdemo;


public class LoopDemo {

    
    public static void main(String[] args) {
      // for
      
      for(int i=1;i<10;i++){
          System.out.println(i);
      }
        System.out.println("for döngüsü bitti");
      // while
      int i=0;
      while(i<10){
          System.out.println(i);
          i++;
      }
      System.out.println("while döngüsü bitti");
      
      // do while 
      int j=20;
      do{
          System.out.println(j);
          j++;
      }while(j<10);
        System.out.println("do while döngüsü bitti");
    
    }
    
}
