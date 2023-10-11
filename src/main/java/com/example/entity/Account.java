package com.example.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.List;

@Getter
@Setter
@Table(name = "account")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Account {
//    @SequenceGenerator(
//            name="account_sequence",
//            sequenceName="account_sequence",
//            allocationSize = 1
//    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
//            generator = "account_sequence"
    )

    @Id
    Long id;

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;

    @Column(name = "is_active", columnDefinition = "boolean default true")
    boolean isActive;

    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    User user;

    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(name="account_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="role_id", referencedColumnName = "id")
    )
    List<Role> roles;

    @Override
    public String toString() {
        return "Account{" +
                "isActive=" + isActive +
                '}';
    }
}
