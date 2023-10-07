package com.example.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import java.util.List;

@Getter
@Setter
@Component
@ToString
@Table(name = "account")
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

    @Column(name = "username", nullable = false, unique = true, length = 12)
    String username;

    @Column(name = "password", nullable = false)
    String password;

    @Column(name = "is_active", columnDefinition = "boolean default true")
    boolean isActive;

//    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
//    Role role;

    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(name="account_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="role_id", referencedColumnName = "id")
    )
    List<Role> roles;

}
