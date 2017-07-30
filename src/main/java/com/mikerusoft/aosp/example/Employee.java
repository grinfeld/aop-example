package com.mikerusoft.aosp.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Grinfeld Mikhail
 * @since 7/30/2017.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Loggable
public class Employee {
    private String name;

    public void throwException(){
        throw new RuntimeException("Dummy Exception");
    }
}
