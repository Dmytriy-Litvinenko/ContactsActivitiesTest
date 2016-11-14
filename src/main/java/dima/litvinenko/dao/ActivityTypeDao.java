package dima.litvinenko.dao;

import dima.litvinenko.model.ActivityType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityTypeDao extends JpaRepository<ActivityType, Integer> {
}
