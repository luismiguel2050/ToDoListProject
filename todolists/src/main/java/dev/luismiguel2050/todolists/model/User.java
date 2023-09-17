package dev.luismiguel2050.todolists.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;

    private String firstName;
    private String lastName;
    private String username;
    private String email;
    
    @OneToMany(mappedBy = "user")
    private List<ToDoList> toDoListList;
}
