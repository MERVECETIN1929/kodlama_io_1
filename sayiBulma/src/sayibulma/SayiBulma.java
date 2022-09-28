package sayibulma;

public class SayiBulma {

    public static void main(String[] args) {
        int[] sayilar=new int[]{1,2,5,7,1};
        int aranacak=1;
        for(int sayi:sayilar){
            if(sayi==aranacak){
                System.out.println("değer bulundu");
                return;
        }
        
    }
        System.out.println("sayı bulunamadı");
    }
    

}
