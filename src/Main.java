public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(70, 100)) {
            System.out.println("Random number: " + r);
            if (r == 100) {
                System.out.println("The number 100 fell out, let's end it there.");
                break;
            }
        }
    }
}
