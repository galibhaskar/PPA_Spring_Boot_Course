public class File {
    private String name;

    private int sizeInBytes;

    // shared memory across all objects
    // static variables are initialized when classes are loaded.
    // static variables can be accessed with or without object(using class name)
    private static int count = 0;

    private final FileMetaData fileMetaData;

    public File(String name, int sz, FileMetaData fileMetaData) {
        // this refers to the current instance
        this.fileMetaData = fileMetaData;

//        if(n == null || n.isEmpty())
//            throw new RuntimeException("invalid name");

        this.name = name;

        if(sz<0)
            throw new RuntimeException("illegal size");

        this.sizeInBytes = sz;
    }

    // static method -> can be accessed with or without object(using class name)
    // can access only static variables, because multiple objects have multiple non-static variable values
    // so our static method called using class name, we cannot say which non-static variable value to use

    // But non-static methods can update both non-static and static variables.
    public static int getCount() {
        return count;
    }

    // data encapsulation -> data-hiding -> getters and setters.

    // getter
    public String getName() {
        return this.name;
    }

    public int getSizeInBytes()
    {
        return sizeInBytes;
    }

    // setters
    public void setName(String n)
    {
        if(n == null || n.isEmpty())
            System.out.println("invalid name");

        name = n;
    }

    public void setSizeInBytes(int sz)
    {
        if(sz<0)
            System.out.println("invalid size");

        sizeInBytes = sz;
    }

    public FileMetaData getFileMetaData() {
        return fileMetaData;
    }
}
