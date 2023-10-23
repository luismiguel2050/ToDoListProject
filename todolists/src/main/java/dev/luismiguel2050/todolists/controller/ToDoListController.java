package dev.luismiguel2050.todolists.controller;

import dev.luismiguel2050.todolists.model.ToDoList;
import dev.luismiguel2050.todolists.service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoListController {
    @Autowired
    private ToDoListService toDoListService;

    @PostMapping("/newList")
    public ToDoList createList(@RequestBody ToDoList list){
        return toDoListService.createList(list);
    }

}
