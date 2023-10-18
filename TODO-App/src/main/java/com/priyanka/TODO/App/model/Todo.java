package com.priyanka.TODO.App.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {

    private Integer todoId;
    private String todoName;
    private boolean isTodoDoneStatus;

}
