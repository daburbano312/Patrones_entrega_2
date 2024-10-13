package com.mycompany.auth;

interface OrganizationComponent {
    String getName();
    void add(OrganizationComponent component);
    void remove(OrganizationComponent component);
    void display(int depth);
}
