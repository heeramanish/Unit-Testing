package allaboutecm.model;

public abstract class Entity {
    private Long id;

    /*
     * Accessor Method for id
     *
     * @return id
     */
    public Long getId() {
        return id;
    }

    /*
     * Mutator Method for id
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }
}
