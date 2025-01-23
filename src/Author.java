import java.util.Objects;

public class Author {
    private String name;
    private String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    /**
     * В видеоуроке сказали убирать this, где возможно.
     * В тексте урока сказано, что this нужно применять.
     * Для примера в одном классе убрал, в другом оставил.
     */

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Author forComparison = (Author) obj;
        return this.toString().equalsIgnoreCase(forComparison.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}
