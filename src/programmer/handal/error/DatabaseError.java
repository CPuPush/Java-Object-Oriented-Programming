package programmer.handal.error;

public class DatabaseError extends Error{
    public DatabaseError(String message){
        super(message);
    }
}
/*
! 35 Error
* Error adalah jenis exception yang terakhir
* Error adalah sebuah class di Java, yang tidak direkomendasikan untuk di TryCatch
* biasanya error terjadi ketika ada masalah serius dan sangat tidak direkomendasikan untuk di try catch
* Artinya, direkomendasikan untuk mematikan aplikasi
* Contohm misal jika diawal aplikasi kita tidak bisa terkoneksi ke database, direkomendasikan untuk membuat exception jenis Error dan menghentikan aplikasi
todo =>  untuk kasus yang fatal saja

? 36 ada di app StacktraceElementApp

!
* */