package br.com.LibraryAPI.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity @Table(name="Publishers")
@AllArgsConstructor @NoArgsConstructor @Data
public class Publisher {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "publisher", fetch = FetchType.LAZY)
    private List<Book> books;

}
