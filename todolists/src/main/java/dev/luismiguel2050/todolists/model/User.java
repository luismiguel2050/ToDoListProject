package dev.luismiguel2050.todolists.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;

    private String password;
    @Column(unique = true)
    private String username;

    
    @OneToMany(mappedBy = "user")
    private List<ToDoList> toDoListList;

    @Override
    public String toString(){
        return "User{" +
                "username='" + username + "'";
    }
}
