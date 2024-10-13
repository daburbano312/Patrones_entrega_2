package com.mycompany.auth;

class UserAdapter extends LegacyUser {
    private Employee employee;

    public UserAdapter(Employee employee, String password) {
        super(employee.getName(), password);
        this.employee = employee;
    }

    @Override
    public String getUsername() {
        return employee.getName();
    }
}
