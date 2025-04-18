/*
 * This file is generated by jOOQ.
 */
package org.todo.jooq.model;


import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.QOM.ForeignKeyRule;
import org.todo.jooq.model.tables.FlywaySchemaHistory;
import org.todo.jooq.model.tables.Todos;
import org.todo.jooq.model.tables.Users;
import org.todo.jooq.model.tables.records.FlywaySchemaHistoryRecord;
import org.todo.jooq.model.tables.records.TodoRecord;
import org.todo.jooq.model.tables.records.UserRecord;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, DSL.name("flyway_schema_history_pk"), new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
    public static final UniqueKey<TodoRecord> TODOS_PKEY = Internal.createUniqueKey(Todos.TODOS, DSL.name("todos_pkey"), new TableField[] { Todos.TODOS.ID }, true);
    public static final UniqueKey<UserRecord> USERS_EMAIL__KEY = Internal.createUniqueKey(Users.USERS, DSL.name("users_email__key"), new TableField[] { Users.USERS.EMAIL }, true);
    public static final UniqueKey<UserRecord> USERS_PKEY = Internal.createUniqueKey(Users.USERS, DSL.name("users_pkey"), new TableField[] { Users.USERS.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<TodoRecord, UserRecord> FK_USER = Internal.createForeignKey(Todos.TODOS, DSL.name("fk_user"), new TableField[] { Todos.TODOS.USER_ID }, Keys.USERS_PKEY, new TableField[] { Users.USERS.ID }, true, ForeignKeyRule.CASCADE, ForeignKeyRule.NO_ACTION);
}
