package additionstepdef;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class addclass {
    private int number1;
    private int number2;
    private int result;

    @Given("I have entered {int} and {int}")
    public void iHaveEnteredNumbers(int num1, int num2) {
        this.number1 = num1;
        this.number2 = num2;
    }

    @When("I add them")
    public void iAddThem() {
        this.result = number1 + number2;
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int expectedSum) {
        Assert.assertEquals(result, expectedSum, "correct sum result");
    }
}
