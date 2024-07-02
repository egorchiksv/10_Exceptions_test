import java.io.IOError;
import java.io.IOException;

public class Counter implements AutoCloseable{
    private int count;
    private boolean closed = false;
    public void add() throws IOException{
        if (closed){
            throw new IOException();
        }
        count++;
    }

    public String toString(){
        return String.valueOf(count);
    }

    public void close() throws Exception {
        closed = true;
    }
}
