package dima.litvinenko.dao;

import dima.litvinenko.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityDao extends JpaRepository<Activity, Integer> {
}