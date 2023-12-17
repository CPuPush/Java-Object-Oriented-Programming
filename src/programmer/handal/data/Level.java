package programmer.handal.data;

public enum Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;
    //constructor
    Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
/*
! 32. Enum Class
 * Saat kita membuat aplikasi, kadang kita akan bertemu dengan jenis data yang nilainya terbatas
 * misal, gender, ada male dan female, atau tipe customer, ada standard, premium atau VIP dan lain lain
 * Dalam kasus seperti ini, kita bisa menggunakan enum class yang berisikan nilai terbatas yang sudah ditentukan
 * Saat membuat enum class, secara otomatis dia akan meng-extends class java.lang.Enum, oleh karena itu class enum tidak bisa extends class lain, namun masih tetap bisa implements interface
 ? Enum Members
 * Sama seperti class biasanya, di class enum pun kita bisa menambahkan members (field, method, dan constructor)
 * Khusus constructor, kita tidak bisa membuat public constructor, karena memang tujuan enum bukan untuk di instansiasi secara bebeas
 * ketika dibuat constructor dan getternya maka harus dibuat opsi si enumnya
? 33 ada di error => ValidationException

* */