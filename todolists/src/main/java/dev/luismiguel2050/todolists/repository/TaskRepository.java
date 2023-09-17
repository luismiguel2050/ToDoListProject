package dev.luismiguel2050.todolists.repository;

import dev.luismiguel2050.todolists.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
