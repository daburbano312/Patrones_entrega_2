package com.mycompany.auth;

class Employee implements OrganizationComponent {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(OrganizationComponent component) {
        // No se puede añadir a un empleado
    }

    @Override
    public void remove(OrganizationComponent component) {
        // No se puede eliminar de un empleado
    }

    @Override
    public void display(int depth) {
        System.out.println("-".repeat(depth) + name + " (" + position + ")");
    }
}
