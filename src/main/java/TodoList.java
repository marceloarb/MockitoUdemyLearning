import java.util.List;

public class TodoList {
    private static TodoService todoService;

     TodoList(TodoService todoService){
        this.todoService = todoService;
    }



    public List<String> retrieveTodos(String list) {
        List<String> allTodo = todoService.retrieveTodos(list);
        return allTodo;
    }
}
