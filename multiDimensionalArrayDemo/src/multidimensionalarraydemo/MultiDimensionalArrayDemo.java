package multidimensionalarraydemo;

public class MultiDimensionalArrayDemo {

    public static void main(String[] args) {
        String [] [] sehirlers={{"İstanbul","Bilecik","Bursa"},{"Ankara","Konya","Kayseri"},{"Diyarbakır","Şanlıurfa","Gaziantep"}};
        for(String[] sehirler:sehirlers){
            System.out.println("---------------");
            for(String sehir:sehirler){
                System.out.println(sehir);
            }
        }
        
    }

}
