package stringsdemo;

public class StringsDemo {
    
    public static void main(String[] args) {
        String mesaj = "    bugün hava çok güzel.    ";
//        
//        System.out.println(mesaj.length());
//        System.out.println("5. eleman: " + mesaj.charAt(4));
//        System.out.println(mesaj.concat("yaşasın"));
//        System.out.println(mesaj.startsWith("b"));
//        System.out.println(mesaj.endsWith("."));
//        char[] karakterler=new char[5];
//        char[]deneme={'0','2','1'};
//      
//        mesaj.getChars(0, 5, karakterler, 0);
//        System.out.println(karakterler);
//        System.out.println(deneme);
//        System.out.println(mesaj.lastIndexOf("ü"));

        System.out.println(mesaj.replace(' ', '-'));
        System.out.println(mesaj.substring(2,7));
        for(String kelime: mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
    
}
