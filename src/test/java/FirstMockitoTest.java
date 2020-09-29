import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FirstMockitoTest {
    @Test
    public void testRetrieveTodo(){
        TodoService todoService = mock(TodoService.class);
        List<String> expected = Arrays.asList("Doctor","Study");
        when(todoService.retrieveTodos("Marcelo")).thenReturn(expected);
        TodoList todo = new TodoList(todoService);
        List<String> actual = todo.retrieveTodos("Marcelo");

        assertEquals(expected,actual);
    }


}
