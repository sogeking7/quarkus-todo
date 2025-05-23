/*
 * This file is generated by jOOQ.
 */
package org.booking_hotel.jooq.model.tables.records;


import java.time.OffsetDateTime;

import org.booking_hotel.jooq.model.tables.RoomTypes;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class RoomTypeRecord extends UpdatableRecordImpl<RoomTypeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.room_types.id_</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.room_types.id_</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.room_types.created_at_</code>.
     */
    public void setCreatedAt(OffsetDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.room_types.created_at_</code>.
     */
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(1);
    }

    /**
     * Setter for <code>public.room_types.updated_at_</code>.
     */
    public void setUpdatedAt(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.room_types.updated_at_</code>.
     */
    public OffsetDateTime getUpdatedAt() {
        return (OffsetDateTime) get(2);
    }

    /**
     * Setter for <code>public.room_types.removed_</code>.
     */
    public void setRemoved(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.room_types.removed_</code>.
     */
    public Boolean getRemoved() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>public.room_types.hotel_id_</code>.
     */
    public void setHotelId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.room_types.hotel_id_</code>.
     */
    public Long getHotelId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.room_types.bed_type_id_</code>.
     */
    public void setBedTypeId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.room_types.bed_type_id_</code>.
     */
    public Long getBedTypeId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.room_types.name_</code>.
     */
    public void setName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.room_types.name_</code>.
     */
    public String getName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.room_types.count_</code>.
     */
    public void setCount(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.room_types.count_</code>.
     */
    public Integer getCount() {
        return (Integer) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoomTypeRecord
     */
    public RoomTypeRecord() {
        super(RoomTypes.ROOM_TYPES);
    }

    /**
     * Create a detached, initialised RoomTypeRecord
     */
    public RoomTypeRecord(Long id_, OffsetDateTime createdAt_, OffsetDateTime updatedAt_, Boolean removed_, Long hotelId_, Long bedTypeId_, String name_, Integer count_) {
        super(RoomTypes.ROOM_TYPES);

        setId(id_);
        setCreatedAt(createdAt_);
        setUpdatedAt(updatedAt_);
        setRemoved(removed_);
        setHotelId(hotelId_);
        setBedTypeId(bedTypeId_);
        setName(name_);
        setCount(count_);
        resetTouchedOnNotNull();
    }
}
