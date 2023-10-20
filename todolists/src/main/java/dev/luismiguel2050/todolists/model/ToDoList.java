package dev.luismiguel2050.todolists.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "lists")
public class ToDoList {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "list")
    private List<Task> taskList;
}
