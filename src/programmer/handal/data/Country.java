package programmer.handal.data;

public class Country {
    //? Static dalam inner Class
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class City{
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName(){
            return name;
        }
    }
}
/*
* City tidak bisa lagi object si country karena static
* */
