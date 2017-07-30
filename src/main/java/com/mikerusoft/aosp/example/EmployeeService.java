package com.mikerusoft.aosp.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Grinfeld Mikhail
 * @since 7/30/2017.
 */
@NoArgsConstructor
@AllArgsConstructor
@Service
public class EmployeeService {
    @Autowired
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    @Loggable
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
