public class Main {
    String languages;
    Main(String lang){
        languages = lang;
        System.out.print(languages + " Programming Language ");
    }
    public static void main(String args[]){
        Main main1 = new Main("Java");
        Main main2 = new Main("Python");
        Main main3 = new Main("C");
    }
}