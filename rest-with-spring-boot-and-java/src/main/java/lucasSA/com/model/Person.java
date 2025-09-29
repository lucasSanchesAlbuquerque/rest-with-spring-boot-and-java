package lucasSA.com.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "person")
public class Person implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 80)
    private String name;

    @Column(name = "last_name", nullable = false, length = 80)
    private String LastName;

    @Column(nullable = false, length = 100)
    private String adrees;

    public Person() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAdrees() {
        return adrees;
    }

    public void setAdrees(String adrees) {
        this.adrees = adrees;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(LastName, person.LastName) && Objects.equals(adrees, person.adrees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, LastName, adrees);
    }
}
