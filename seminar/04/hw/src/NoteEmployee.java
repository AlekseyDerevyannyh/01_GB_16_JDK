import java.util.*;

public class NoteEmployee implements List<Employee> {

    private Employee[] employees;
    private int index = 0;
    private int initialCapacity = 100;

    public NoteEmployee(int capacity) {
        this.employees = new Employee[capacity];
    }

    public NoteEmployee() {
        this.employees = new Employee[initialCapacity];
    }

    public List<Employee> getEmployeeByExperience(int workingYear) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getExperience() == workingYear) {
                    result.add(employee);
                }
            }
        }
        return result;
    }

    public Map<String, String> getPhoneByName(String name) {
        Map<String, String> result = new HashMap<>();
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getName().equals(name)) {
                    result.put(employee.getPhone(), employee.getName());
                }
            }
        }
        return result;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getId() == id) {
                    return employee;
                }
            }
        }
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Employee> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Employee employee) {
        employees[this.index++] = employee;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Employee> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Employee> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Employee get(int index) {
        return null;
    }

    @Override
    public Employee set(int index, Employee element) {
        return null;
    }

    @Override
    public void add(int index, Employee element) {

    }

    @Override
    public Employee remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Employee> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Employee> listIterator(int index) {
        return null;
    }

    @Override
    public List<Employee> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        return "NoteEmployee{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }
}
