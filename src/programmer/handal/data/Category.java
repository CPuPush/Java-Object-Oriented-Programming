package programmer.handal.data;

public class Category {
    private String id;
    private boolean expensive;

    // getter for id
    public String getId(){
        return id;
    }
    // setter for id
    public void setId(String id){
        if(id != null){
            this.id = id;
        }
    }
    // getter for expensive
    public boolean isExpensive() {
        return this.expensive;
    }
    // setter for expensive
    public void setExpensive(boolean expensive){
        this.expensive = expensive;
    }
}
/*
! 19. Getter and Setter
? Encapsulation
* Encapsulation artinya memastikan data sensitif sebuah object tersebunyi dari akses luar
* Hal ini bertujuan agar kita menjaga agar data sebuah object tetap baik dan valid
* untuk mencapai ini, biasanya kita akan membuat semua field menggunakan access modifier private, sehingga tidak bisa diakses atau diubah dari luar
* Agar bisa diubah, kita akan menyediakan method untuk mengubah dan mendapatkan field tersebut
? Getter dan Setter
* Di java, proses encapsulation sudah dibuat standarisasinya, dimana kita bisa menggunakan Getter dan Setter method
* Getter adalah function yang dibuat untuk mengambil data field
* Setter dan function untuk mengubah data field
* biasanya programmer java membuat field itu private dan membuat public setter dan getter untuk mengubah datanya
? naming convention
tipedata    gettermethod    Settermethod
*boolean     isXxx()        setXxx(bool value)
*primitif    getXx()        setXx(primitif value)
*Object      getXx()        setXx(Object value)

todo => jadi untuk kegunaannya adalah supaya tidak ada orang yang langsung mengakses field yang ada di classnya.

* kita dapat menambahkan validation di setter, contohnya jika kita membuat field itu keadaan public maka dapat mengubah field tersebut ke null. dan hal itu sangat tidak bagus.

? Lanjutan ada di CategoryApp

? 20 ada di Car

* */
