package dev.luismiguel2050.todolists.repository;

import dev.luismiguel2050.todolists.model.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoListRepository extends JpaRepository<ToDoList,Long> {
}
