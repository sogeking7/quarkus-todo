/*
 * This file is generated by jOOQ.
 */
package org.booking_hotel.jooq.model.tables;


import java.time.OffsetDateTime;
import java.util.Collection;

import org.booking_hotel.jooq.model.Keys;
import org.booking_hotel.jooq.model.Public;
import org.booking_hotel.jooq.model.enums.FacilityTypes;
import org.booking_hotel.jooq.model.tables.records.FacilityRecord;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Facilities extends TableImpl<FacilityRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.facilities</code>
     */
    public static final Facilities FACILITIES = new Facilities();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FacilityRecord> getRecordType() {
        return FacilityRecord.class;
    }

    /**
     * The column <code>public.facilities.id_</code>.
     */
    public final TableField<FacilityRecord, Long> ID = createField(DSL.name("id_"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.facilities.created_at_</code>.
     */
    public final TableField<FacilityRecord, OffsetDateTime> CREATED_AT = createField(DSL.name("created_at_"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column <code>public.facilities.updated_at_</code>.
     */
    public final TableField<FacilityRecord, OffsetDateTime> UPDATED_AT = createField(DSL.name("updated_at_"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column <code>public.facilities.removed_</code>.
     */
    public final TableField<FacilityRecord, Boolean> REMOVED = createField(DSL.name("removed_"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.facilities.name_</code>.
     */
    public final TableField<FacilityRecord, String> NAME = createField(DSL.name("name_"), SQLDataType.VARCHAR(1000).nullable(false), this, "");

    /**
     * The column <code>public.facilities.icon_ref_</code>.
     */
    public final TableField<FacilityRecord, String> ICON_REF = createField(DSL.name("icon_ref_"), SQLDataType.VARCHAR(1000).nullable(false), this, "");

    /**
     * The column <code>public.facilities.type_</code>.
     */
    public final TableField<FacilityRecord, FacilityTypes> TYPE = createField(DSL.name("type_"), SQLDataType.VARCHAR.asEnumDataType(FacilityTypes.class), this, "");

    private Facilities(Name alias, Table<FacilityRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Facilities(Name alias, Table<FacilityRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.facilities</code> table reference
     */
    public Facilities(String alias) {
        this(DSL.name(alias), FACILITIES);
    }

    /**
     * Create an aliased <code>public.facilities</code> table reference
     */
    public Facilities(Name alias) {
        this(alias, FACILITIES);
    }

    /**
     * Create a <code>public.facilities</code> table reference
     */
    public Facilities() {
        this(DSL.name("facilities"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<FacilityRecord, Long> getIdentity() {
        return (Identity<FacilityRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FacilityRecord> getPrimaryKey() {
        return Keys.FACILITIES_PKEY;
    }

    @Override
    public Facilities as(String alias) {
        return new Facilities(DSL.name(alias), this);
    }

    @Override
    public Facilities as(Name alias) {
        return new Facilities(alias, this);
    }

    @Override
    public Facilities as(Table<?> alias) {
        return new Facilities(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Facilities rename(String name) {
        return new Facilities(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Facilities rename(Name name) {
        return new Facilities(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Facilities rename(Table<?> name) {
        return new Facilities(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Facilities where(Condition condition) {
        return new Facilities(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Facilities where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Facilities where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Facilities where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Facilities where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Facilities where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Facilities where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Facilities where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Facilities whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Facilities whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
