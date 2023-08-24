package programmer.handal.app;

import programmer.handal.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("setter company");
        System.out.println(company.getName());
        //? harus buat dulu outer classnya baru instantiate inner classnya
        Company.Employee employee = company.new Employee();
        employee.setName("setter employee");
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
