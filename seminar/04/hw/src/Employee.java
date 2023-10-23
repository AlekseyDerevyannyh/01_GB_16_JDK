import java.time.LocalDateTime;

public class Employee {
    private static int idCounter = 0;
    private int id;
    private String phone;
    private String name;
    private LocalDateTime dateStartWorking;

    public Employee(String phone, String name, LocalDateTime dateStartWorking) {
        this.id = ++idCounter;
        this.phone = phone;
        this.name = name;
        this.dateStartWorking = dateStartWorking;
    }

    public int getExperience() {
        return LocalDateTime.now().getYear() - dateStartWorking.getYear();
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", dateStartWorking=" + dateStartWorking +
                '}';
    }
}
