
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "scr/main/java/Steps/glue",
        tags = "@all",
        dryRun = false
//        snippets = SnippetType.UNDERSCORE,
//        name = "^Успешное|Успешная.*"
)


public class RunnerTest {
}
