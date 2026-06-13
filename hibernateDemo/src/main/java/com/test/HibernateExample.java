package com.test;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateExample {
    public static void main(String[] args) {
        // Create session factory and session
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Author.class)
                .addAnnotatedClass(Book.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            // Create Author and Books
            Author author = new Author("J.K. Rowling");

            Book book1 = new Book("Harry Potter and the Philosopher's Stone", author);
            Book book2 = new Book("Harry Potter and the Chamber of Secrets", author);

            // Add books to the author's book list
            author.setBooks(Set.of(book1, book2));

            // Start a transaction
            session.beginTransaction();

            // Save the author (this will also save the books due to cascade)
            session.save(author);

            // Commit the transaction
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
