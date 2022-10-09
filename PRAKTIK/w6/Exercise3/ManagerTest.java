package PRAKTIK.w6.Exercise3;

public class ManagerTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[4];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        staff[2] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[3] = new Employee("Arief Rahman", 2350000, 1, 9, 2002);

        for (int i = 0; i < 4; i++)
            staff[i].raiseSalary(5);

        // Case 2
        System.out.println("Before sorting:");
        for (int i = 0; i < 4; i++)
            staff[i].print();
        System.out.println();

        Sortable.shell_short(staff);

        System.out.println("After sorting:");
        for (int i = 0; i < 4; i++)
            staff[i].print();
    }
}