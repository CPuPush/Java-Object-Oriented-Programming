public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getCorner() + " <= parent");

        Rectangle rectangle = new Rectangle();
        int getCor = rectangle.getCorner();
        int getCorPar = rectangle.getParentCorner();
        System.out.println(getCor);
        System.out.println(getCorPar);
    }
}
