package pl.krzysiek.InitializationOfObjects;

/**
 * <p>
 * In Java, when working with constructors in inheritance, it's important to note that any checked exceptions thrown
 * by a constructor of a parent class must also be thrown and declared by the child class constructor. This rule
 * differs from method overriding where a child class can throw fewer exceptions than the parent class method.
 * However, overloaded constructors cannot throw fewer exceptions than the constructor of the parent class.
 * In other words, if the parent class constructor declares a checked exception, the child class constructor must
 * either handle that exception or declare it in its throws clause.
 * </p>
 * <ul>
 *     <li>Checked Exceptions: Exceptions that must be either caught or declared in the method signature</li>
 *     <li>Parent Constructor: If a parent constructor throws a checked exception, the child class must handle or declare it.</li>
 *     <li>Overloaded Constructors: An overloaded constructor cannot throw fewer exceptions than its parent constructor.</li>
 * </ul>
 */
public class ExceptionInConstructor {
    public static void main(String[] args) {
        try {
            // Creating a MySQLConnection object, which calls the constructor of both DatabaseConnection and MySQLConnection
            MySQLConnection mysqlConn = new MySQLConnection();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

// Parent class: DatabaseConnection
class DatabaseConnection {
    // Constructor of the parent class that throws a checked exception
    public DatabaseConnection() throws Exception {
        // Simulate a situation where an exception is thrown
        if (true) {
            throw new Exception("Error while establishing database connection!");
        }
    }
}

// Child class: MySQLConnection that inherits from DatabaseConnection
class MySQLConnection extends DatabaseConnection {
    // Constructor of the child class that declares the same exception
    public MySQLConnection() throws Exception {
        super();  // Call the parent class constructor
        System.out.println("MySQL database connection established.");
    }
}
