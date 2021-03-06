# Course Section 3

## Testing non-functional code

### Functional Harness

#### System Configuration

**In File:** `src/test/org/learnwithllew/testinglegacycodecourse/exercise2/ValidateDevelopmentEnvironment.java`
* [ ] Validate environment
    * [ ] Run the test
    * [ ] Fix the test

**In File:** `src/test/java/org/learnwithllew/testinglegacycodecourse/exercise2/SystemConfigurationTests.java`

* [ ] Write a Poke test for `SystemConfiguration.initialiseSystem()`
    * Confirmation: Passing test with no verification
* [ ] Capture the global variable `rpm`
    * Confirmation: Your approval shows the ending value of rpm
* [ ] Capture all global variables 
    * Confirmation: Your approval shows the ending values of all 10 global variables
* [ ] Capture all starting state of global variables as well
    * Confirmation: Your approval shows the starting and ending values
* [ ] Write a second test, that does the same as the first test
    * Confirmation: Both tests pass when run separately
* [ ] Make and use a function to set the global variables and use it.
    * Hint: `setAllGlobals(....)`
    * Confirmation: Tests pass when run together AND individually
* [ ] Make a function to write the code to set the global variables
    * Hint: Like this, but writing out the actual values of the globals:
        ```java
        String generateCodeToSetGlobals()
        {
            return "setAllGlobals(4000, 0.01, 0, 0, 0, 1, 2, 3, true, 3.2);";
        }
        ```
    * Confirmation: You can copy the Java code from standard output into your IDE, and it compiles
* [ ] Retro

#### Adding Logging
**In File:** `src/test/java/org/learnwithllew/testinglegacycodecourse/exercise2/LoggingTests.java`  
* [ ] Write a Poke test for `Services.initialiseServices()`
    * Confirmation: Passing test with no verification
* [ ] Log all REST calls
    * Confirmation: You can see all 5 calls and results
* [ ] Turn on SECURE
    * Confirmation: Your tests no longer work
* [ ] Make a test seam to log if testing
    * Hint: Turn Services.TESTING to true and add fakes to your production code
    * Confirmation: Tests work
* [ ] Allow multiple tests
    * Hint: `logger.setLength(0);`
    * Confirmation: Tests pass when run together AND individually
* [ ] Retro

#### Files

* [ ] Retro

#### Database

* [ ] Retro

#### Date and Time
**In File:** `src/test/java/org/learnwithllew/testinglegacycodecourse/exercise2/InconsistentTest.java`

* [ ] Poke-test print() in Inconsistent.java
    * Confirmation: Failing test because of date and time
* [ ] Scrub Inconsistent.print() for time
    * Hint: `Approvals.verify("text", new Options(new RegExScrubber("", "[replacement]")));`
    * Hint: `\d` matches a digit
    * Hint: `[a-z]` matches lower-case letter
    * Hint: `\d{3}` matches 3 digits 
    * Confirmation: Passing test with scrubbed date
* [ ] Peel Inconsistent.print() to pass in time
* [ ] Retro

#### Random
**In File:** `src/test/java/org/learnwithllew/testinglegacycodecourse/exercise2/InconsistentTest.java`
* [ ] Poke-test getId() in Inconsistent.java
* [ ] Make getId() testable
* [ ] Make consistent with a test seam
    * Confirmation: test work when run 2 times 
* [ ] Extract testable function that takes a seed
    * Confirmation: working test without the test seam
* [ ] Extract Testable function that takes a number
    * Confirmation: you can reason out what the result will be before running it.
* [ ] Retro

#### Side Effects
**In File:** `src/test/java/org/learnwithllew/testinglegacycodecourse/exercise2/SideEffectsTests.java`
* [ ] Poke-test SideEffects.print()
* [ ] Peel SideEffects.print() to return a string
* [ ] Peel/slice SideEffects.print() to take a PrintStream
* [ ] Peel/slice SideEffects.print() to take an Action1<String>

### Missing Inputs
**In File:** `src/test/java/org/learnwithllew/testinglegacycodecourse/exercise2/MissingInputsTests.java`
* [ ] Poke-test new MissingInputs().getCategory()
* [ ] Get it to 100% coverage
* [ ] Peel to pass in missing inputs 

### Reduce to functional
**In File:** `src/test/java/org/learnwithllew/testinglegacycodecourse/exercise2/LoopTests.java`
* [ ] Poke-test Loop.square()
* [ ] Separate a loop
    * [ ] Turn it into two loops - one does the calculation, the other saves it to the file
    * [ ] Peel the method

### Wrapping Up

* [ ] Retro
