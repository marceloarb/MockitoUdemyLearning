import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FirstMockitoTest {
    //You can only have one RUNNER, but you can have multiples rules.
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    TodoService todoService;
    @InjectMocks
    TodoList todo;

    @Test
    public void testRetrieveTodos(){
        List<String> expected = Arrays.asList("Doctor","Study");
        when(todoService.retrieveTodos("Marcelo")).thenReturn(expected);
        List<String> actual = todo.retrieveTodos("Marcelo");
        assertEquals(expected,actual);
    }
    @Test
    public void testRetrieveEmptyTodo(){
        List<String> expected = Arrays.asList();
        when(todoService.retrieveTodos("Marcelo")).thenReturn(expected);
        List<String> actual = todo.retrieveTodos("Marcelo");
        assertEquals(expected,actual);
    }


}
