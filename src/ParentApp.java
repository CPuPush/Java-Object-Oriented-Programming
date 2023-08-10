public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "okt";
        child.doIt();
        System.out.println(child.name);

        // konfersi ke parent
//        Parent parent = new Child();
        Parent parent = (Parent) child;
        parent.doIt();
        System.out.println(parent.name);

    }
}
/*
? 15 ada di data.Product
 */