package dev.luismiguel2050.todolists.service;

import dev.luismiguel2050.todolists.model.ToDoList;
import dev.luismiguel2050.todolists.repository.ToDoListRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ToDoListService {

    @Autowired
    private ToDoListRepository listRepository;
    public ToDoList createList(ToDoList list) {
        return listRepository.save(list);
    }
}
