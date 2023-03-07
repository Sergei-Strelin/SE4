package Tasks.Save;

import java.io.IOException;
import java.util.List;
import Tasks.Task;

public interface SaveTasks {
    public void saveTasks(List<Task> tasks) throws IOException;
}