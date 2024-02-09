package quizzes.quiz2.q13;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super{
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}
