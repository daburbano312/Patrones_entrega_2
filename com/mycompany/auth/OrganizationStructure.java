package com.mycompany.auth;

import java.util.ArrayList;
import java.util.List;

class OrganizationStructure implements OrganizationComponent {
    private String name;
    private List<OrganizationComponent> children = new ArrayList<>();

    public OrganizationStructure(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(OrganizationComponent component) {
        children.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println("-".repeat(depth) + name);
        for (OrganizationComponent component : children) {
            component.display(depth + 2);
        }
    }
}
