package tabletennistable;

import org.hamcrest.core.IsCollectionContaining;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LeagueTest {
    @Test
    public void testAddPlayer() {
        // Given
        League league = new League();

        // When
        league.addPlayer("Bob");

        // Then
        List<LeagueRow> rows = league.getRows();
        Assert.assertEquals(1, rows.size());
        List<String> firstRowPlayers = rows.get(0).getPlayers();
        Assert.assertEquals(1, firstRowPlayers.size());
        Assert.assertThat(firstRowPlayers, IsCollectionContaining.hasItem("Bob"));
    }


        @Test
        public void testGetRowsWithZeroPlayers()
        {
            // Given
            League league = new League();


            // When

            List<LeagueRow> rows = league.getRows();

            // Then

            Assert.assertEquals(0, rows.size());
        }
    @Test
    public void testGetRowsWithOnePlayers()
    {
        // Given
        League league = new League();


        // When
        league.addPlayer("Bob");

        List<LeagueRow> rows = league.getRows();


        // Then
        Assert.assertEquals(1, rows.size());
    }




}
