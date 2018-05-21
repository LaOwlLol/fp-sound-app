import setup.MixerService;

import java.io.PrintStream;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

    public static void main(String[] args) {
        PrintMixers(System.out);
    }

    private static void PrintMixers(PrintStream out) {
        out.println("Mixers:");
        MixerService.ListMixers().forEach(out::println);
    }
}
