package allaboutecm.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrackUnitTest {

    private Track track;
    private Double trackLength;
    private String trackGenre;
    private String trackStyle;
    private String trackReleaseFormat;
    private String trackReview;
    private Double trackRating;

    @BeforeEach
    public void setUp() {
        track = new Track();
    }

    @Test
    @DisplayName("Track name cannot be null")
    public void trackNameCannotBeNull() {
        assertThrows(NullPointerException.class, () -> track.setTrackName(null));
    }

    @Test
    @DisplayName("Track length cannot be null")
    public void trackLengthCannotBeNull() {
        assertThrows(NullPointerException.class, () -> track.setTrackLength(null));
    }

    @Test
    @DisplayName("Track genre cannot be null")
    public void trackGenreCannotBeNull() {
        assertThrows(NullPointerException.class, () -> track.setTrackGenre(null));
    }

    @Test
    @DisplayName("Track style cannot be null")
    public void trackStyleCannotBeNull() {
        assertThrows(NullPointerException.class, () -> track.setTrackStyle(null));
    }

    @Test
    @DisplayName("Track release format cannot be null")
    public void trackReleaseFormatCannotBeNull() {
        assertThrows(NullPointerException.class, () -> track.setTrackReleaseFormat(null));
    }

    @Test
    @DisplayName("Track release review cannot be null")
    public void trackReviewCannotBeNull() {
        assertThrows(NullPointerException.class, () -> track.setTrackReview(null));
    }

    @Test
    @DisplayName("Track rating format cannot be null")
    public void trackRatingCannotBeNull() {
        assertThrows(NullPointerException.class, () -> track.setTrackRating(null));
    }
}