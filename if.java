package HelloWorld;

public class Main {
	public static void main(String[] args) {
        int number = (int)(Math.random() * 2 );
        if (number == 1) {
            System.out.println("引数が1なら真");
        } else if (number == 0) {
        	System.out.println("引数が0なら偽");
        } else {
        	System.out.println("miss");
        }
    }
}
