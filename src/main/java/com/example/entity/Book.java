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
@Table(name = "book")
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Book {

    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )

    @Id
    Long id;

    @Column(name = "name", nullable = false, unique = true, length = 12)
    String name;

    @Column(name = "author", nullable = false)
    String author;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
    List<Review> reviews;

}
