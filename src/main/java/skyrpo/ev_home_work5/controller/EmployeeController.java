package skyrpo.ev_home_work5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import skyrpo.ev_home_work5.exception.EmployeeNotFoundException;
import skyrpo.ev_home_work5.service.EmployeeService;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/employee")
    public String Employee(@RequestParam("number") Integer number) {
        try {
            return employeeService.getEmployee(number);
        } catch (EmployeeNotFoundException e) {
            return "Попробуйте другой номер!";
        }
    }

    @GetMapping(path = "/employee/add")
    public String Employee(@RequestParam String firstname, @RequestParam String lastname) {
        try {
            return employeeService.addArray(firstname, lastname);

        } catch (EmployeeNotFoundException e) {
            return "Ошибка: Дублируются данные сотрудника";
        }

    }

    @GetMapping(path = "/employee/delete")
    public String EmployeeDel(@RequestParam String firstname, @RequestParam String lastname) {
        try {
            return employeeService.deleteArray(firstname, lastname);
        } catch (EmployeeNotFoundException e) {
            return "Ошибка: Данного сотрудника нет, удалять нельзя";
        }
    }

    @GetMapping(path = "/employee/search")
    public String EmployeeSearch(@RequestParam String firstname, @RequestParam String lastname) {
        try {
            return employeeService.searchArray(firstname, lastname);
        } catch (EmployeeNotFoundException e) {
            return "Ошибка: Данного сотрудника нет";
        }
    }
}
