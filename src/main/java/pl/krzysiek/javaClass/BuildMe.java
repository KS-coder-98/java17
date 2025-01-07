package pl.krzysiek.javaClass;

import java.time.LocalDate;

/**
 * <p>
 *     <ul>
 *         <li>By making the BuildMe constructor private, you ensure that instances can only be created through the Builder.</li>
 *         <li>Nullifying the template in the build() method ensures that the Builder cannot be reused to modify an already created BuildMe instance, maintaining immutability after the object is built.</li>
 *     </ul>
 * </p>
 */
public class BuildMe {
    private String name;
    private LocalDate date;

    // Private constructor ensures BuildMe instances can only be created via the Builder
    private BuildMe() {
    }

    // Static method to create a new Builder instance
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "BuildMe{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    // Builder class for creating and customizing BuildMe instances
    public static class Builder {
        private BuildMe template = new BuildMe();

        // Private constructor to restrict instantiation outside the enclosing class
        private Builder() {
        }

        public Builder name(String name) {
            template.name = name;
            return this; // Enables chaining of method calls
        }

        public Builder date(LocalDate date) {
            template.date = date;
            return this; // Enables chaining of method calls
        }

        // Finalizes the BuildMe instance and prevents further modification
        public BuildMe build() {
            BuildMe rv = template; // Assign the current template to the return value
            template = null; //don't modify later. Nullify the template to prevent reuse or modification
            return rv; // Return the finalized instance
        }
    }
}
