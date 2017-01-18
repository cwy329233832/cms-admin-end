/**
 * This class is generated by jOOQ
 */
package diamond.cms.server.model.jooq.tables.interfaces;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ICPageView extends Serializable {

    /**
     * Setter for <code>cms.c_page_view.id</code>.
     */
    public void setId(String value);

    /**
     * Getter for <code>cms.c_page_view.id</code>.
     */
    @NotNull
    @Size(max = 40)
    public String getId();

    /**
     * Setter for <code>cms.c_page_view.name</code>.
     */
    public void setName(String value);

    /**
     * Getter for <code>cms.c_page_view.name</code>.
     */
    @Size(max = 40)
    public String getName();

    /**
     * Setter for <code>cms.c_page_view.path</code>.
     */
    public void setPath(String value);

    /**
     * Getter for <code>cms.c_page_view.path</code>.
     */
    @Size(max = 255)
    public String getPath();

    /**
     * Setter for <code>cms.c_page_view.params</code>.
     */
    public void setParams(String value);

    /**
     * Getter for <code>cms.c_page_view.params</code>.
     */
    @Size(max = 300)
    public String getParams();

    /**
     * Setter for <code>cms.c_page_view.full_path</code>.
     */
    public void setFullPath(String value);

    /**
     * Getter for <code>cms.c_page_view.full_path</code>.
     */
    @Size(max = 300)
    public String getFullPath();

    /**
     * Setter for <code>cms.c_page_view.query</code>.
     */
    public void setQuery(String value);

    /**
     * Getter for <code>cms.c_page_view.query</code>.
     */
    @Size(max = 45)
    public String getQuery();

    /**
     * Setter for <code>cms.c_page_view.create_time</code>.
     */
    public void setCreateTime(Timestamp value);

    /**
     * Getter for <code>cms.c_page_view.create_time</code>.
     */
    public Timestamp getCreateTime();

    /**
     * Setter for <code>cms.c_page_view.ip</code>.
     */
    public void setIp(String value);

    /**
     * Getter for <code>cms.c_page_view.ip</code>.
     */
    @Size(max = 45)
    public String getIp();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ICPageView
     */
    public void from(diamond.cms.server.model.jooq.tables.interfaces.ICPageView from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ICPageView
     */
    public <E extends diamond.cms.server.model.jooq.tables.interfaces.ICPageView> E into(E into);
}
