# TodoApp
This is Todo application where I have performed crud operation like get , post , put, delete api and with the help of this crud operation .
## Language and Framwork
 * Java
 * SpringBoot
## Data Flow
## Controller
### TodoController
  * @GetMapping("todos")
  * @GetMapping("todo/done")
  * @GetMapping("todos/{todoId}")
  * @GetMapping("todo/undone")
  * @PostMapping("todo")
  * @PutMapping("todo/{todoId}/{status}")
  * @DeleteMapping("todo")
### Service
 ## TodoService
  * getAllTodos()
  * getAllDoneTodos()
  * getUndoneTodos()
  * updateTodoStatus
  * addTodo
  * removeTodo
  * getTodoById
  * removeTodo()
### Model
 * Todo
### Repository
 * TodoRepo()
## Data Structure 
 * List 
 * ArrayList
## Project Summary
To-do App is for  practice Spring boot , APis and createTodo update todo and delete todo and get Todo by id in springboot.
