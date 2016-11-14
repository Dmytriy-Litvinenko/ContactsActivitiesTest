package dima.litvinenko.dao;

import dima.litvinenko.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactDao extends JpaRepository<Contact, Integer> {
}
