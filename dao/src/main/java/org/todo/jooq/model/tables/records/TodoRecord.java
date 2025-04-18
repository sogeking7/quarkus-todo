/*
 * This file is generated by jOOQ.
 */
package org.todo.jooq.model.tables.records;


import java.time.OffsetDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.todo.jooq.model.tables.Todos;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class TodoRecord extends UpdatableRecordImpl<TodoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.todos.id_</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.todos.id_</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.todos.title_</code>.
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.todos.title_</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.todos.description_</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.todos.description_</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.todos.created_at_</code>.
     */
    public void setCreatedAt(OffsetDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.todos.created_at_</code>.
     */
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(3);
    }

    /**
     * Setter for <code>public.todos.user_id_</code>.
     */
    public void setUserId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.todos.user_id_</code>.
     */
    public Integer getUserId() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TodoRecord
     */
    public TodoRecord() {
        super(Todos.TODOS);
    }

    /**
     * Create a detached, initialised TodoRecord
     */
    public TodoRecord(Integer id_, String title_, String description_, OffsetDateTime createdAt_, Integer userId_) {
        super(Todos.TODOS);

        setId(id_);
        setTitle(title_);
        setDescription(description_);
        setCreatedAt(createdAt_);
        setUserId(userId_);
        resetTouchedOnNotNull();
    }
}
