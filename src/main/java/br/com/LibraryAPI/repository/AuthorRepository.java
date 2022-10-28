package br.com.LibraryAPI.repository;

import br.com.LibraryAPI.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    public Optional<Author> findByName(String name);

}
