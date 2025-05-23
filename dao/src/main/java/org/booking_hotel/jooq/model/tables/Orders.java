/*
 * This file is generated by jOOQ.
 */
package org.booking_hotel.jooq.model.tables;


import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Collection;

import org.booking_hotel.jooq.model.Keys;
import org.booking_hotel.jooq.model.Public;
import org.booking_hotel.jooq.model.tables.records.OrderRecord;
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
public class Orders extends TableImpl<OrderRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.orders</code>
     */
    public static final Orders ORDERS = new Orders();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderRecord> getRecordType() {
        return OrderRecord.class;
    }

    /**
     * The column <code>public.orders.id_</code>.
     */
    public final TableField<OrderRecord, Long> ID = createField(DSL.name("id_"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.orders.created_at_</code>.
     */
    public final TableField<OrderRecord, OffsetDateTime> CREATED_AT = createField(DSL.name("created_at_"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column <code>public.orders.updated_at_</code>.
     */
    public final TableField<OrderRecord, OffsetDateTime> UPDATED_AT = createField(DSL.name("updated_at_"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column <code>public.orders.removed_</code>.
     */
    public final TableField<OrderRecord, Boolean> REMOVED = createField(DSL.name("removed_"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.orders.from_date_</code>.
     */
    public final TableField<OrderRecord, LocalDate> FROM_DATE = createField(DSL.name("from_date_"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>public.orders.to_data_</code>.
     */
    public final TableField<OrderRecord, LocalDate> TO_DATA = createField(DSL.name("to_data_"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>public.orders.hotel_id_</code>.
     */
    public final TableField<OrderRecord, Long> HOTEL_ID = createField(DSL.name("hotel_id_"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.orders.user_id_</code>.
     */
    public final TableField<OrderRecord, Long> USER_ID = createField(DSL.name("user_id_"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.orders.room_type_id_</code>.
     */
    public final TableField<OrderRecord, Long> ROOM_TYPE_ID = createField(DSL.name("room_type_id_"), SQLDataType.BIGINT.nullable(false), this, "");

    private Orders(Name alias, Table<OrderRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Orders(Name alias, Table<OrderRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.orders</code> table reference
     */
    public Orders(String alias) {
        this(DSL.name(alias), ORDERS);
    }

    /**
     * Create an aliased <code>public.orders</code> table reference
     */
    public Orders(Name alias) {
        this(alias, ORDERS);
    }

    /**
     * Create a <code>public.orders</code> table reference
     */
    public Orders() {
        this(DSL.name("orders"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<OrderRecord, Long> getIdentity() {
        return (Identity<OrderRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<OrderRecord> getPrimaryKey() {
        return Keys.ORDERS_PKEY;
    }

    @Override
    public Orders as(String alias) {
        return new Orders(DSL.name(alias), this);
    }

    @Override
    public Orders as(Name alias) {
        return new Orders(alias, this);
    }

    @Override
    public Orders as(Table<?> alias) {
        return new Orders(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Orders rename(String name) {
        return new Orders(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Orders rename(Name name) {
        return new Orders(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Orders rename(Table<?> name) {
        return new Orders(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Orders where(Condition condition) {
        return new Orders(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Orders where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Orders where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Orders where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Orders where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Orders where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Orders where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Orders where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Orders whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Orders whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
