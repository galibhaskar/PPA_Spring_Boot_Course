import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        // final variable -> the reference or value cannot be changed.
        // immutable reference
        final File f = new File("filename.txt",20,
                    new FileMetaData(new Date(), new Date()));

        // if you want to make the final object immutable, recursively make it immutable by
        // making internal variables final.

        System.out.println(f.getName());
    }
}
