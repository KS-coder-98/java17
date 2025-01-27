package pl.krzysiek.scope;

/**
 * <table>
 *     <thead>
 *         <tr>
 *             <th>Modyfikator</th>
 *             <th>Ta sama klasa</th>
 *             <th>Ten sam pakiet</th>
 *             <th>Klasy dziedziczące<br>(inne pakiety)</th>
 *             <th>Inne pakiety</th>
 *         </tr>
 *     </thead>
 *     <tbody>
 *         <tr>
 *             <td><strong>private</strong></td>
 *             <td>✔</td>
 *             <td>✘</td>
 *             <td>✘</td>
 *             <td>✘</td>
 *         </tr>
 *         <tr>
 *             <td><strong>default</strong></td>
 *             <td>✔</td>
 *             <td>✔</td>
 *             <td>✘</td>
 *             <td>✘</td>
 *         </tr>
 *         <tr>
 *             <td><strong>protected</strong></td>
 *             <td>✔</td>
 *             <td>✔</td>
 *             <td>✔</td>
 *             <td>✘</td>
 *         </tr>
 *         <tr>
 *             <td><strong>public</strong></td>
 *             <td>✔</td>
 *             <td>✔</td>
 *             <td>✔</td>
 *             <td>✔</td>
 *         </tr>
 *     </tbody>
 * </table>
 */
class ParentClass {
    public String publicField = "Public Field";
    protected String protectedField = "Protected Field";
    String defaultField = "Default Field";
    private String privateField = "Private Field";

    public void showPrivateField() {
        System.out.println(privateField);
    }
}

class ChildClass extends ParentClass {
    public void showFields() {
        System.out.println("Accessing from parent class");
        System.out.println(publicField);
        System.out.println(protectedField);
        System.out.println(defaultField);
//        System.out.println(privateFiled); error
    }
}

public class AccessModifiersExample {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        ChildClass childClass = new ChildClass();

        System.out.println("Accessing fields from AccessModifiersExample");
        System.out.println(parentClass.publicField);
        System.out.println(parentClass.defaultField);
        System.out.println(parentClass.protectedField);
//        System.out.println(parentClass.privateFiled);
        parentClass.showPrivateField();
        childClass.showFields();
    }
}
