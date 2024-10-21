public class Main {

    public static void main(String[] args) {
        help(args[0]);
        handleThreading(args);
    }

    public static void help(String arg0){
        if(arg0.equals("--help")){
            Help.help();
            System.exit(0);
        }
    }

    public static void handleThreading(String[] args){
        for(int i = 2; i < args.length; i++) {
            MyThread myThread = new MyThread(args);
            myThread.start();
        }
    }
}

