import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.FilmManager;

public class FilmManagerTest {

    // @BeforeEach
    //  public void setup() {
    //   manager.addFilm("film1");
    //   manager.addFilm("film2");
    //   manager.addFilm("film3");
    //   manager.addFilm("film4");
    //   manager.addFilm("film5");
    //   manager.addFilm("film6");
    //   manager.addFilm("film7");
    //}

    @Test
    public void shouldAddFilms() {
        FilmManager manager = new FilmManager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");

        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldAdd1Film() {
        FilmManager manager = new FilmManager();

        manager.addFilm("film1");

        String[] expected = {"film1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldAdd0Film() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFindLast() {
        FilmManager manager = new FilmManager();

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");

        String[] expected = {"film7", "film6", "film5", "film4", "film3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFindAllLast() {
        FilmManager manager = new FilmManager(7);

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");

        String[] expected = {"film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFind2Last() {
        FilmManager manager = new FilmManager(2);

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");

        String[] expected = {"film7", "film6"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFindNoLast() {
        FilmManager manager = new FilmManager();


        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

}





