package org.example.booklibrary.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "library_users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;
}