public class CompositionMain {

    public static void main(String[] args) {
        Folder phpFolder = new Folder("php_demo1");
        Folder sourceFilesFolder = new Folder("Source Files");
        Folder includePathFolder = new Folder("Include Path");
        File remoteFilesFile = new File("Remote Files");

        phpFolder.addSubFolder(sourceFilesFolder);
        phpFolder.addSubFolder(includePathFolder);
        phpFolder.addFile(remoteFilesFile);

        Folder phalconFolder = new Folder(".phalcon");
        Folder appFolder = new Folder("app");
        Folder cacheFolder = new Folder("cache");
        Folder publicFolder = new Folder("public");


        sourceFilesFolder.addSubFolder(phalconFolder);
        sourceFilesFolder.addSubFolder(appFolder);
        sourceFilesFolder.addSubFolder(cacheFolder);
        sourceFilesFolder.addSubFolder(publicFolder);

        Folder configFolder = new Folder("config");
        Folder controllersFolder = new Folder("controllers");
        Folder libraryFolder = new Folder("library");
        Folder migrationsFolder = new Folder("migrations");
        Folder modelsFolder = new Folder("models");
        Folder viewsFolder = new Folder("views");

        appFolder.addSubFolder(configFolder);
        appFolder.addSubFolder(controllersFolder);
        appFolder.addSubFolder(libraryFolder);
        appFolder.addSubFolder(migrationsFolder);
        appFolder.addSubFolder(modelsFolder);
        appFolder.addSubFolder(viewsFolder);

        File htAccess = new File(".htaccess");
        File htRouterFile = new File(".htrouter.php");
        File indexHTMLFile = new File("index.html");

        publicFolder.addFile(htAccess);
        publicFolder.addFile(htRouterFile);
        publicFolder.addFile(indexHTMLFile);

        // Print the file system content
        System.out.println("Before deletion:");
        phpFolder.print();
        System.out.println();

        // Print the file system content again
        System.out.println("After app folder deletion:");
        sourceFilesFolder.removeSubFolder(appFolder);
        phpFolder.print();
        System.out.println();

        System.out.println("After public folder deletion:");
        sourceFilesFolder.removeSubFolder(publicFolder);
        phpFolder.print();
    }

}
