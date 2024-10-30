import java.util.ArrayList;
import java.util.List;

public class ArgumentsParser {

    public static Parameters parseArguments(String[] args) {

        Parameters parameters = new Parameters();

        for (int i = 0; i < args.length; i++) {
            if (args[i].equalsIgnoreCase("--file-type")) {
                parameters.setImageFileType(args[i + 1]);
            }
            if (args[i].equalsIgnoreCase("--save-location")) {
                parameters.setImageSaveLocation(args[i + 1]);
            }
            if (args[i].equalsIgnoreCase("--file-path")) {
                parameters.setTextFilePaths(parseFilePaths(args, i));
            }
        }

        return parameters;
    }

    private static List<String> parseFilePaths(String[] args, int i) {
        List<String> textFilePaths = new ArrayList<String>();

        for (int j = i + 1; j < args.length; j++) {
            if (args[j].contains("--")) {
                break;
            } else {
                textFilePaths.add(args[j]);
            }
        }
        return textFilePaths;
    }
}
