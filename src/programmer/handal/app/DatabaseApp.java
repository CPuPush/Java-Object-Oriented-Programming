package programmer.handal.app;

import programmer.handal.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("dash",null);
        System.out.println("sukses");
    }

    public static void connectDatabase(String username, String password){
        if(username == null || password == null){
            throw new DatabaseError("Tidak bisa connect Database");
        }
    }
}
