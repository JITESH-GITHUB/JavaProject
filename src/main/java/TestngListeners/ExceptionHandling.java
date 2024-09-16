package TestngListeners;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a=10,b=2,c;
        try {
            c=a/b;
            System.out.println(c);
            System.out.println("fghyu");
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Hello!!");
        }
        System.out.println("hii");
        System.out.println("hii");
    }
}
