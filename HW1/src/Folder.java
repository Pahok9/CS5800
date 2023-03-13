import java.util.ArrayList;
import java.util.List;

class Folder {
    private String folderName;
    List<File> file = new ArrayList<>();
    List<Folder> subFolder = new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public Folder(String folderName, List<File> file) {
        this.folderName = folderName;
        this.file = file;
    }

    public Folder(String folderName, List<File> file, List<Folder> subFolder) {
        this.folderName = folderName;
        this.file = file;
        this.subFolder = subFolder;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public void addFile(File file) {
        this.file.add(file);
    }

    public void removeFile(File file) {
        this.file.remove(file);
    }

    public void addSubFolder(Folder subFolder) {
        this.subFolder.add(subFolder);
    }

    public void removeSubFolder(Folder subFolder) {
        this.subFolder.remove(subFolder);
    }

    public void print() {
        System.out.println("Folder: " + folderName);
        System.out.println("File(s): ");
        for (File f: file) {
            System.out.println("+ " + f.getFileName());
        }
        System.out.println("SubFolders: ");
        for (Folder f: subFolder) {
            f.print();
        }
    }
}

class File {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void print() {
        System.out.println("File" + fileName);
    }
}
