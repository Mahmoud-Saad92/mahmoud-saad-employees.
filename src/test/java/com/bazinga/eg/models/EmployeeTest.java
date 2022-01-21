package com.bazinga.eg.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void equalTest() {
        Employee firstEmp =
                Employee
                        .builder()
                        .id(1L)
                        .DateFrom(LocalDate.of(2017, 10, 1))
                        .DateTo(LocalDate.of(2019, 9, 30))
                        .build();

        Employee secondEmp =
                Employee
                        .builder()
                        .id(1L)
                        .DateFrom(LocalDate.of(2015, 8, 1))
                        .DateTo(LocalDate.of(2018, 3, 15))
                        .build();

        assertEquals(firstEmp, secondEmp, "equal");
    }

    @Test
    public void notEqualTest() {
        Employee firstEmp =
                Employee
                        .builder()
                        .id(1L)
                        .DateFrom(LocalDate.of(2017, 10, 1))
                        .DateTo(LocalDate.of(2019, 9, 30))
                        .build();

        Employee secondEmp =
                Employee
                        .builder()
                        .id(2L)
                        .DateFrom(LocalDate.of(2017, 10, 1))
                        .DateTo(LocalDate.of(2019, 9, 30))
                        .build();

        assertNotEquals(firstEmp, secondEmp, "not equal");
    }
}
