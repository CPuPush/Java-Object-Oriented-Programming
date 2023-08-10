package programmer.handal.app;

import programmer.handal.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();
//        category.ID = "indi";//error, untuk mengaksesnya kita harus melalui method setter()
        category.setId("indihome");
        category.setId(null);
        System.out.println(category.getId());
        //maka id tidak akan pernah bisa di set ke null karena validation yang digunakan
    }
}
