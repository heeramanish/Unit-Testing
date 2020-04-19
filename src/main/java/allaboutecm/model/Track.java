package allaboutecm.model;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import static org.apache.commons.lang3.Validate.*;


/**
 * Represents a track released in an album by ECM records.
 *
 *
 */
public class Track extends Entity {
    private String trackName;
    private Double trackLength;
    private String trackGenre;
    private String trackStyle;
    private String trackReleaseFormat;
    private String trackReview;
    private Double trackRating;

    public Double getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(Double trackLength) {
        notNull(trackLength);
        this.trackLength = trackLength;
    }

    public String getTrackGenre() {
        return trackGenre;
    }

    public void setTrackGenre(String trackGenre) {
        notNull(trackGenre);
        this.trackGenre = trackGenre;
    }

    public String getTrackStyle() {
        return trackStyle;
    }

    public void setTrackStyle(String trackStyle) {
        notNull(trackStyle);
        this.trackStyle = trackStyle;
    }

    public String getTrackReleaseFormat() {
        return trackReleaseFormat;
    }

    public void setTrackReleaseFormat(String trackReleaseFormat) {
        notNull(trackReleaseFormat);
        this.trackReleaseFormat = trackReleaseFormat;
    }

    public String getTrackReview() {
        return trackReview;
    }

    public void setTrackReview(String trackReview) {
        notNull(trackReview);
        this.trackReview = trackReview;
    }

    public Double getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(Double trackRating) {
        notNull(trackRating);
        this.trackRating = trackRating;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        notNull(trackName);
        this.trackName = trackName;
    }
}
