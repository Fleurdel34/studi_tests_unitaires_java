package studi.test.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import studi.test.app.pojo.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {}

