package programmer.handal.data;

public class Company {
    private String name;
    // getter
    public String getName() {
        return name;
    }
    // setter
    public void setName(String name) {
        this.name = name;
    }
    //
    public class Employee {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        // mengakses Outer Class
        public String getCompany(){
            return "hai company " + Company.this.getName();
//            return "hai company " + Company.this.name;
        }
    }
}
/*
!28. Inner Class
* Di java, kita bisa membuat class didalam class, atau disebut dengan inner class
* salah satu kasus kita membuat inner class biasanya ketika kita butuh membuat beberapa class yang saling terhubung dimana sebuah class tidak bisa dibuat tanpa class lain
* Misal kita perlu membuat class Employee, dimana membutuhkan class company, maka kita bisa membuat class employee sebagai inner class company
* cara membuat inner class, cukup membuatnya di dalam block class outer classnya
? Keuntungan mengakses Outer class
 * Keuntungan saat kita membuat inner class adalah kemampuan untuk mengakses outer classnya
 * Inner class bisa membaca semua private member yang ada di outer classnya
 * Untuk mengakses object outer classnya, kita bisa menggunakan nama class outernya diikuti dengan kata kunci this, misal Company.this
 * Dan untuk mengakses super class outer classnya, kita bisa menggunakan nama class outernya dikuti dengan kata kunci super, misal Company.super
? lanjutan runner ada di CompanyApp

? 29. ada di HelloWorld

 * */