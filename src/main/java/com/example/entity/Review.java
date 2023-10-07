package com.example.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ToString
@Table(name = "review")
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Review {

    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )

    @Id
    Long id;

    @Column(name = "description", nullable = false, unique = true, length = 12)
    String desc;

    @ManyToOne
    @JoinColumn(name = "book_id")
    Book book;


}
