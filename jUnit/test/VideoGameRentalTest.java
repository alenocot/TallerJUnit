import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VideoGameRentalTest {

    Ps3Game littleBigPlanet;
    Xbox360Game fable2;
    WiiGame superSmashBrosBrawl;

    @BeforeEach
    void setUp() {
        littleBigPlanet = new Ps3Game("Little Big Planet");
        fable2 = new Xbox360Game("Fable 2");
        superSmashBrosBrawl = new WiiGame("Super Smash Bros. Brawl");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getDaysRented() {
        assertEquals(1, new VideoGameRental(littleBigPlanet,1,false).getDaysRented());
    }

    @Test
    void getVideoGame() {
        assertEquals(littleBigPlanet, new VideoGameRental(littleBigPlanet,1,false).getVideoGame());
    }

    @Test
    void getCharge() {

    }

    @Test
    void getFrequentRenterPoints() {

        VideoGameRental v1 = new VideoGameRental(superSmashBrosBrawl,1,false);
        assertEquals(1,v1.getFrequentRenterPoints());
        VideoGameRental v2 = new VideoGameRental(superSmashBrosBrawl,1,true);
        assertEquals(2,v2.getFrequentRenterPoints());

        VideoGameRental v3 = new VideoGameRental(fable2,1,false);
        assertEquals(2,v3.getFrequentRenterPoints());
        VideoGameRental v4 = new VideoGameRental(fable2,5,true);
        assertEquals(4,v4.getFrequentRenterPoints());

        VideoGameRental v5 = new VideoGameRental(littleBigPlanet,1,false);
        assertEquals(2,v5.getFrequentRenterPoints());
        VideoGameRental v6 = new VideoGameRental(littleBigPlanet,5,true);
        assertEquals(3,v6.getFrequentRenterPoints());


    }

}