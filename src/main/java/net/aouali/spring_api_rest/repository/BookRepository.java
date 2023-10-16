package net.aouali.spring_api_rest.repository;

import net.aouali.spring_api_rest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingOrDescriptionContaining(String keyword1, String keyword2);
}
