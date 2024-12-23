package OOP.Application;

import OOP.Data.Company;

public class CompanyAPP {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Google");
        System.out.println(company.getName());

        Company.Employee employee = company.new Employee();
        employee.setName("Jamal");
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}