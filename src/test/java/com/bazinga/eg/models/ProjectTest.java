package com.bazinga.eg.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ProjectTest {

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
                        .id(2L)
                        .DateFrom(LocalDate.of(2015, 8, 1))
                        .DateTo(LocalDate.of(2018, 3, 15))
                        .build();

        Set<Employee> employees = new HashSet<>();
        employees.add(firstEmp);
        employees.add(secondEmp);

        Project firstProject =
                Project
                        .builder()
                        .id(1L)
                        .employees(employees)
                        .build();

        Project secondProject =
                Project
                        .builder()
                        .id(1L)
                        .build();

        assertEquals(firstProject, secondProject, "equal");
    }

    @Test
    public void notEqualTest() {

        Project firstProject =
                Project
                        .builder()
                        .id(1L)
                        .build();

        Project secondProject =
                Project
                        .builder()
                        .id(2L)
                        .build();

        assertNotEquals(firstProject, secondProject, "not equal");
    }

    @Test
    public void employeesSetTypeTest() {
        Project project =
                Project
                        .builder()
                        .id(1L)
                        .build();

        assertEquals(HashSet.class.getName(), project.getEmployees().getClass().getName());
    }
}
