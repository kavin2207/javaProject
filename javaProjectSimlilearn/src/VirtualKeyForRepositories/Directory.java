package VirtualKeyForRepositories;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;

public class Directory {
	// define your own path its a very import step because from there all the file is going to save.
    public static final String pathName = "/Users/abhbhatn/Downloads/Phase1Assesment/src/directory/";
    private ArrayList<File> files = new ArrayList<>();
    Path path = FileSystems.getDefault().getPath(pathName).toAbsolutePath();
    File Dfiles = path.toFile();

    public String getPathName() {
        return pathName;
    }
    public ArrayList<File> ListFiles() { //sort files
        File[] directoryFiles = Dfiles.listFiles();
        files.clear();
        for(File directoryFile : directoryFiles) {
            if(directoryFile.isFile()) {
                files.add(directoryFile);
            }
        }
        Collections.sort(files); //nlogn time complexicity 
        return files;
    }
    public ArrayList<File> getFiles() {
        ListFiles();
        if (files.isEmpty()){
            System.out.println("No files exist");}
        else {
            System.out.println("Existing files: ");
            for (File file : ListFiles()) {
                System.out.println(file.getName());
            }
        }
            return files;
        }



}
