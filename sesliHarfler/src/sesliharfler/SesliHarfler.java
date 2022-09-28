package sesliharfler;

public class SesliHarfler {

    public static void main(String[] args) {
        char harf = ' ';
        switch (harf) {
            case 'a','o','u','ı':
                System.out.println("kalın ünlü harf");
                break;
            case 'e','i','ö','ü':
                System.out.println("ince ünlü harf");
                break;

            default:
                System.out.println("ünlü harf girişi yapılmadı");
        }
    }

}
