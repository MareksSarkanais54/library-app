package lv.autentica.library.repositories;

import lv.autentica.library.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRep extends JpaRepository<Author, Long>{
}
