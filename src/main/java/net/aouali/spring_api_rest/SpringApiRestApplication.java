package net.aouali.spring_api_rest;

import net.aouali.spring_api_rest.entity.Book;
import net.aouali.spring_api_rest.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringApiRestApplication {
    private final BookRepository bookRepository;

    public SpringApiRestApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringApiRestApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() throws Exception {
        return (String[] args) -> {

            Book book1 = new Book("Orgueil et Préjugés", "Jane Austen", "Un classique de la littérature anglaise.");
            Book book2 = new Book("Harry Potter à l'école des sorciers", "J.K. Rowling", "Le premier livre de la série Harry Potter.");
            Book book3 = new Book("Cent ans de solitude", "Gabriel García Márquez", "Un chef-d'œuvre de la littérature latino-américaine.");
            Book book4 = new Book("Le Seigneur des Anneaux : La Communauté de l'Anneau", "J.R.R. Tolkien", "Le début de la célèbre trilogie fantasy.");

            this.bookRepository.save(book1);
            this.bookRepository.save(book2);
            this.bookRepository.save(book3);
            this.bookRepository.save(book4);
        };
    }

}
