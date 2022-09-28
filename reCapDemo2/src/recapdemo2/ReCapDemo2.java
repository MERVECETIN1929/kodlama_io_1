package recapdemo2;

public class ReCapDemo2 {

    public static void main(String[] args) {
        double[] myList={9.50,1.80,2.50,6.90,8.70};
        double total=0;
        double max=myList[0];
        for(double number:myList){
            if(number>max){
                max=number;
            }
            total+=number;
            System.out.println(number);
        }
        System.out.println("toplam : "+ total);
        System.out.println("en büyük sayı: "+max);
    }

}
