package com.login.registration.service;

import com.login.registration.dto.EmployeeDto;
import com.login.registration.dto.LoginDTO;
import com.login.registration.payload.LoginMesage;
import com.login.registration.response.LoginResponse;

public interface EmployeeService {
    String addEmployee(EmployeeDto employeeDTO);
    LoginResponse loginEmployee(LoginDTO loginDTO);
}
