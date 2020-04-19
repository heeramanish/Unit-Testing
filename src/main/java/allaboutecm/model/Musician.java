package allaboutecm.model;

import com.google.common.collect.Sets;

import java.net.URL;
import java.util.Objects;
import java.util.Set;

import static org.apache.commons.lang3.Validate.*;

/**
 * An artist that has been featured in (at least) one ECM record.
 *
 * See {@https://www.ecmrecords.com/artists/1435045745}
 */
public class Musician extends Entity {
    private String name;

    private URL musicianUrl;

    private URL musicianWebsite;

    private Set<Album> albums;

    public Musician(String name) {

        notNull(name);
        this.name = name;
        this.musicianUrl = null;

        albums = Sets.newLinkedHashSet();
    }

    public String getName()
    {
        return name;
    }

    public URL getMusicianWebsite() {
        return musicianWebsite;
    }

    public void setMusicianWebsite(URL musicianWebsite) {
        notNull(musicianWebsite);
        this.musicianWebsite = musicianWebsite;
    }

    public void setName(String name)
    {
        notNull(name);
        notBlank(name);
        this.name = name;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) throws Exception
    {
        notEmpty(albums);
        this.albums = albums;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musician that = (Musician) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }

    public URL getMusicianUrl()
    {
        return musicianUrl;
    }

    public void setMusicianUrl(URL musicianUrl)
    {
        notNull(musicianUrl);
        this.musicianUrl = musicianUrl;
    }
}
