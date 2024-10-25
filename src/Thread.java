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

        Parameters parameters = new Parameters();

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("--file-type")) {
                parameters.imageFileType = args[i + 1];
            }
            if (args[i].equals("--save-location")) {
                parameters.imageSaveLocation = args[i + 1];
            }
            if (args[i].equals("--file-path")) {
                for (int j = i + 1; j < args.length; j++) {
                    if (args[j].contains("--")) {
                        break;
                    } else {
                        parameters.textFilePath.add(args[j]);
                    }
                }
            }
        }

        for(int i = 0; i < parameters.textFilePath.size(); i++) {
            Thread thread = new Thread(parameters, i);
            thread.start();
        }
    }

}