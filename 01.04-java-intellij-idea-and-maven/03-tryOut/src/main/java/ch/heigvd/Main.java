package ch.heigvd;

import ch.heigvd.commands.Goodbye;
import ch.heigvd.commands.Hello;
import java.util.concurrent.Callable;
import picocli.CommandLine;

@CommandLine.Command(
    name = "hello",
    description = "Print a 'Hello World!' type of message.",
    version = "1.0.0",
    showDefaultValues = true,
    subcommands = {Hello.class, Goodbye.class},
    mixinStandardHelpOptions = true)
public class Main implements Callable<Integer> {

  @CommandLine.Parameters(
      index = "0",
      description = "The name of the user.",
      defaultValue = "World")
  protected String name;

  @Override
  public Integer call() {
    System.out.println("Hello " + name + "!");
    return 0;
  }

  public String getName() {
    return name;
  }

  public static void main(String... args) {
    int exitCode = new CommandLine(new Main()).execute(args);

    System.exit(exitCode);
  }
}
