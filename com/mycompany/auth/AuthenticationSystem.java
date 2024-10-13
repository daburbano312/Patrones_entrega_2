package com.mycompany.auth;

public class AuthenticationSystem {
    public static void main(String[] args) {

        OrganizationStructure company = new OrganizationStructure("Mi Empresa");

        OrganizationStructure hrDepartment = new OrganizationStructure("Recursos Humanos");
        OrganizationStructure itDepartment = new OrganizationStructure("TI");

        Employee andres = new Employee("Andres Mendez", "Gerente RRHH");
        Employee camilo = new Employee("Camilo Pataroy", "Desarrollador");

        hrDepartment.add(andres);
        itDepartment.add(camilo);

        company.add(hrDepartment);
        company.add(itDepartment);


        System.out.println("Estructura Organizacional:");
        company.display(0);


        UserAdapter andresAdapter = new UserAdapter(andres, "password123");
        System.out.println("\nAutenticación de usuario:");
        System.out.println("Usuario: " + andresAdapter.getUsername());
        System.out.println("Autenticación exitosa: " + andresAdapter.checkUserNameAndPassword("password123"));
    }
}
