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
 */
public class Track extends Entity {
    private String trackName;
    private Double trackLength;


    public Double getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(Double trackLength) {
        notNull(trackLength);
        this.trackLength = trackLength;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        notNull(trackName);
        this.trackName = trackName;
    }
}
