package allaboutecm.model;

import java.util.Objects;

import static org.apache.commons.lang3.Validate.notBlank;
import static org.apache.commons.lang3.Validate.notNull;

public class MusicalInstrument extends Entity {
    private String name;

    /*
     * Parameterised Constructor for MusicalInstrument Class
     *
     * @param name
     *
     */
    public MusicalInstrument(String name) {
        notNull(name);
        this.name = name;
    }

    /*
     * Accessor Method for name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /*
     * Mutator Method for name
     *
     * @param name
     */
    public void setName(String name) {
        notNull(name, "Musical Instrument Cannot Be Null or Empty");
        this.name = name;
    }

    /*
     * Method for checking if the MusicalInstrument exists
     *
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicalInstrument that = (MusicalInstrument) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
