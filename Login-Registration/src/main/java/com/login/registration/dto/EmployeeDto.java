package com.login.registration.dto;

public class EmployeeDto {

    private int employeeid;
    private String employeename;
    private String email;
    private String password;

    public String getEmployeename() {
        return employeename;
    }

    public String getEmail() {
        return email;
    }

    public EmployeeDto() {
    }

    public EmployeeDto(int employeeid, String employeename, String email, String password) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.email = email;
        this.password = password;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }
} //create getters and setters
