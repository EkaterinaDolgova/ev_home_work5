package skyrpo.ev_home_work5;

public class EmployeeServiceImpl implements EmployeeService {

     static Employee [] employees =
            {new Employee("Петров Петр Петрович", 1, 20000, "Первое имя", "Следующее имя"),
                    new Employee("Петров Петр Петрович", 1, 20000, "Первое имя", "Следующее имя"),
                    new Employee("Иванов Иван Иванович", 2, 30000, "Первое имя", "Следующее имя"),
                    new Employee("Сидоров Степан Геннадьевич", 1, 50000, "Первое имя", "Следующее имя")
            };

    @Override
    public static String getEmployee(Integer number){
        final Employee employee;
        employee = employees[number];
        final String EmployeeDescription = ""
                +employee.getFirstName()+" "
                +employee.getLastName() + " "
                +employee.getFio();
        return EmployeeDescription;

    }


}
