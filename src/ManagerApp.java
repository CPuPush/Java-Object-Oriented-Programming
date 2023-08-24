public class ManagerApp {
    public static void main(String[] args) {
//        ? Inheritance
        Manager manager = new Manager("estes");
//        manager.name = "FORI";
        manager.sayHello("budi");

        VicePresident vicePresident = new VicePresident("dogma");
//        vicePresident.name = "OKTO";
        vicePresident.sayHello("buddha");

//        ?polymorhosm
        Employee employee = new Employee("Tristan");
        employee.sayHello("budi");
    }
}
/*

*/