public class Help {

    public static void help(){
        System.out.println(" The program accepts 3 arguments:\n" +
                "   1. Image type (png, jpg, etc.)\n" +
                "   2. Image save destination (e.g. D:\\Games)\n" +
                "   3. Initial .txt files separated by space (e.g. D:\\test.txt D:\\test1.txt etc.)\n" +
                "   The full command could look like this:\n" +
                "   \n" +
                "   java Main \"png\" \"D:\\Games\\" + "\"D:\\test.txt\\" + "\"D:\\test1.txt\\" + "\"D:\\test2.txt\\");
    }
}
