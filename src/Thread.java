import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Thread extends java.lang.Thread {

    private int i;
    private String imageFileType;
    private String imageSaveLocation;
    private ArrayList<String> textFilePath;

    public Thread(Parameters parameters, int i) {

        this.i = i;
        imageFileType = parameters.imageFileType;
        imageSaveLocation = parameters.imageSaveLocation;
        textFilePath = parameters.textFilePath;
    }

    @Override
    public void run() {
        String data = FileReader.readFile(textFilePath.get(i));
        BufferedImage image = ImageCreator.createImage(data);
        ImageWriter.writeImage(image, imageFileType, imageSaveLocation, textFilePath.get(i));
    }

    public static void handleThreading(String[] args) {

        Parameters parameters = ArgumentsParser.parseArguments(args);

        for(int i = 0; i < parameters.textFilePath.size(); i++) {
            Thread thread = new Thread(parameters, i);
            thread.start();
        }
    }

}