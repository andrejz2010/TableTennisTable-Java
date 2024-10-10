package test.java;

public class TableTennisTableSteps {

    private TableTennisTable tableTennisTable;

    @Given("the table tennis table is not initialized")
    public void the_table_tennis_table_is_not_initialized() {
        tableTennisTable = new TableTennisTable();
        assertFalse(tableTennisTable.isInitialized());
    }

    @When("I initialize the table tennis table")
    public void i_initialize_the_table_tennis_table() {
        tableTennisTable.initialize();
    }

    @Then("the table tennis table should be ready for use")
    public void the_table_tennis_table_should_be_ready_for_use() {
        assertTrue(tableTennisTable.isInitialized());
    }
}
