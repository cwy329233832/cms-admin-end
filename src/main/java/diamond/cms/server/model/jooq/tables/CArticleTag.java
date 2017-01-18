/**
 * This class is generated by jOOQ
 */
package diamond.cms.server.model.jooq.tables;


import diamond.cms.server.model.jooq.Cms;
import diamond.cms.server.model.jooq.Keys;
import diamond.cms.server.model.jooq.tables.records.CArticleTagRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class CArticleTag extends TableImpl<CArticleTagRecord> {

    private static final long serialVersionUID = -2030140216;

    /**
     * The reference instance of <code>cms.c_article_tag</code>
     */
    public static final CArticleTag C_ARTICLE_TAG = new CArticleTag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CArticleTagRecord> getRecordType() {
        return CArticleTagRecord.class;
    }

    /**
     * The column <code>cms.c_article_tag.article_id</code>.
     */
    public final TableField<CArticleTagRecord, String> ARTICLE_ID = createField("article_id", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

    /**
     * The column <code>cms.c_article_tag.tag_id</code>.
     */
    public final TableField<CArticleTagRecord, String> TAG_ID = createField("tag_id", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

    /**
     * Create a <code>cms.c_article_tag</code> table reference
     */
    public CArticleTag() {
        this("c_article_tag", null);
    }

    /**
     * Create an aliased <code>cms.c_article_tag</code> table reference
     */
    public CArticleTag(String alias) {
        this(alias, C_ARTICLE_TAG);
    }

    private CArticleTag(String alias, Table<CArticleTagRecord> aliased) {
        this(alias, aliased, null);
    }

    private CArticleTag(String alias, Table<CArticleTagRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Cms.CMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CArticleTagRecord> getPrimaryKey() {
        return Keys.KEY_C_ARTICLE_TAG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CArticleTagRecord>> getKeys() {
        return Arrays.<UniqueKey<CArticleTagRecord>>asList(Keys.KEY_C_ARTICLE_TAG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CArticleTag as(String alias) {
        return new CArticleTag(alias, this);
    }

    /**
     * Rename this table
     */
    public CArticleTag rename(String name) {
        return new CArticleTag(name, null);
    }
}
