import java.io.File;
import simpledb.file.*;

public class SimpleDB {
    private FileMgr fm;
    
    public SimpleDB(String dirname, int blocksize, int buffsize) {
        File dbDirectory = new File(dirname);
        fm = new FileMgr(dbDirectory, blocksize);
    }
    
    public FileMgr fileMgr() {
        return fm;
    }
}
