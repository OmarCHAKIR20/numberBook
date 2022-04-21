package iir4.g2.number.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iir4.g2.number.book.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
