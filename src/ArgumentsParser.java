public class ArgumentsParser {

    public static Parameters parseArguments(String[] args) {

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
        return parameters;
    }

}
