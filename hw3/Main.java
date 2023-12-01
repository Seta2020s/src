import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroup group1 = new StudentGroup("Group A");
        StudentGroup group2 = new StudentGroup("Group B");
        StudentGroup group3 = new StudentGroup("Group C");

        List<StudentGroup> groupsInStream1 = new ArrayList<>();
        groupsInStream1.add(group1);
        groupsInStream1.add(group2);

        List<StudentGroup> groupsInStream2 = new ArrayList<>();
        groupsInStream2.add(group3);

        Stream stream1 = new Stream(groupsInStream1);
        Stream stream2 = new Stream(groupsInStream2);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        System.out.println("Unsorted Streams:");
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getStudentGroups().size() + " groups");
        }

        StreamService.sortStreams(streams);

        System.out.println("\nSorted Streams:");
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getStudentGroups().size() + " groups");
        }
    }
}
