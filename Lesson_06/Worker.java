package Lesson_06;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        String res = String.format("id: %d fn: %s ln: %s s: %d", id, firstName, lastName, salary);
        return res;
    }
}
