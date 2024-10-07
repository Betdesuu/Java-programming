//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // both customer and employee class have some common attributes like id,name,lastName,age
        // so instead of repeating our codes we'll use inheritance
        // First we're gonna create another class to write all the common attributes
        // Then we have to add "extends + name of the new class" next to our class name
        // Okay, if we are done with the steps written above we can create objects in our main class

        Customer customer = new Customer();
        Employee employee = new Employee();

        // now let's try to access the attributes

        customer.name = "Betul"; // Normally, we don't have this attribute in our Customer class, but since we use inheritance, we can access it through the Person class.

        employeeManager emp1 = new employeeManager();
        emp1.List();


    }
}