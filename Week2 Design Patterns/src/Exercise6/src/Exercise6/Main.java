package Exercise6;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // The first time display() is called, the image is loaded from the server
        image1.display();
        System.out.println();

        // Subsequent calls to display() do not reload the image from the server
        image1.display();
        System.out.println();

        // The image2 is loaded only when display() is called for the first time
        image2.display();
        System.out.println();

        // Image2 is now cached, so it should not reload from the server
        image2.display();
    }
}
