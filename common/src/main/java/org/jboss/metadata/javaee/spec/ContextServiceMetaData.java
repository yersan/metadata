package org.jboss.metadata.javaee.spec;

import org.jboss.metadata.javaee.support.NamedMetaDataWithDescriptions;


public class ContextServiceMetaData extends NamedMetaDataWithDescriptions {

    /**
     * The serialVersionUID
     */
    private static final long serialVersionUID = 3715776477105620363L;

    /**
     * Type of context to be cleared
     */
    private String cleared;

    /**
     * Type of context to be propagated
     */
    private String propagated;

    /**
     * Type of context to be left unchanged
     */
    private String unchanged;

    /**
     * The properties
     */
    private PropertiesMetaData properties;

    public String getCleared() {
        return cleared;
    }

    public void setCleared(String cleared) {
        this.cleared = cleared;
    }

    public String getPropagated() {
        return propagated;
    }

    public void setPropagated(String propagated) {
        this.propagated = propagated;
    }

    public String getUnchanged() {
        return unchanged;
    }

    public void setUnchanged(String unchanged) {
        this.unchanged = unchanged;
    }

    /**
     * Get the properties.
     *
     * @return the properties.
     */
    public PropertiesMetaData getProperties() {
        return properties;
    }

    /**
     * Set the properties.
     *
     * @param properties the properties.
     */
    public void setProperties(PropertiesMetaData properties) {
        this.properties = properties;
    }
}
