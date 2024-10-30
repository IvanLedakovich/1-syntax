public class Main {

    public static void main(String[] args) {
        Help.help(args[0]);
        Parameters parameters = ArgumentsParser.parseArguments(args);
        for (int i = 0; i < parameters.getAllTextFilePaths().size(); i++) {
            Thread.startANewThread(parameters.getImageFileType(), parameters.getImageSaveLocation(), parameters.getSingleTextFilePath(i));
        }
    }
}

