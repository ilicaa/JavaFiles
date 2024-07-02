public class Main {
    public static void main(String[] args) {
        rectangle rect1 = new rectangle(10.00, 20.00);

        System.out.println("Height: " + rect1.getHeight() + ", Width: " + rect1.getWidth() + ", Area: " + rect1.area() + ", Perimeter: " + rect1.perimeter());

        rect1.setHeight(20.00);
        rect1.setWidth(40.00);

        System.out.println("Height: " + rect1.getHeight() + ", Width: " + rect1.getWidth() + ", Area: " + rect1.area() + ", Perimeter: " + rect1.perimeter());
    }
}