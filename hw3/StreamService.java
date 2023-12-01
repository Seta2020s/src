import java.util.Collections;
import java.util.List;

public class StreamService {
    public static void sortStreams(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
    }
}