import setup.MixerService;

import java.io.PrintStream;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

    public static void main(String[] args) {
        MixerService.MixerDetails(MixerService.SystemMixers()).forEach(System.out::println);
        System.out.println("---------------------------------------------------------------");
        MixerService.MixerDetails(MixerService.AppropriateMixers()).forEach(System.out::println);
        System.out.println("---------------------------------------------------------------");
        MixerService.SpeakerPort().ifPresent(line -> System.out.println(MixerService.LineDetails(line)));
        MixerService.LineOutPort().ifPresent(line -> System.out.println(MixerService.LineDetails(line)));
    }


}
