package ch.noseryoung.uk.domainModels.role;

import ch.noseryoung.uk.domainModels.authority.Authority;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Set;

// This is an example class on a domain model could be built
// These annotations show hibernate that this is an entity
@Entity
// This annotation defines this entity as it's own table with it's given name
// We can also not define it's name, but then it'd take the name of the class itself and that wouldn't be best practice
@Table(name = "role")
public class Role {

    // Regular attributes
    // The primary key, this annotation defines that this is a primary key:
    @Id
    // This annotation makes sure that our id gets generated
    @GeneratedValue(generator = "system-uuid")
    // With this annotation we define the generator for our uuid
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    // And lastly this annotation ensures when it will get generated
    @Generated(GenerationTime.ALWAYS)
    // This annotation simply defines that this attribute has it's own column and how that column is called
    @Column(name = "id")
    private String id;

    // In this example the name has not been defined, if you do this hibernate will plainly use the name of the variable itself
    // The nullable parameter defines if this attribute can be null in the database
    @Column(nullable = false)
    private String name;

    // Example of a foreign key
    // This annotation defines the relationship between the two entities
    // The fetch type is also definable, default is eager
    @ManyToMany(fetch = FetchType.EAGER)
    // This annotation defines the table between the two entities
    // This annotation is only necessary in many to many relations
    // Firstly we define the name of the table
    // Secondly we define the foreign key which leads to this entity
    // Lastly we define the foreign key which leads to the other entity we possess a relation to
    // In many to many relations the data type is preferred to be a Set for performance, in one to many and many to one
    // relations the preferred data type are lists.
    @JoinTable(
            name = "role_authority",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "authority_id")
    )
    private Set<Authority> authorities;

    // Standard empty constructor
    public Role() {
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public Role setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Role setName(String name) {
        this.name = name;
        return this;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public Role setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
        return this;
    }

}
