package com.jooqmysql.userspoc.repositories;

import com.jooqmysql.userspoc.models.User;
import org.springframework.stereotype.Repository;
import org.jooq.DSLContext;

import java.util.List;

import static com.example.poc.jooq.college.tables.Users.USERS;

@Repository
public class UserRepository {
    private final DSLContext dsl;

    public UserRepository(DSLContext dsl) {
        this.dsl = dsl;
    }

    // Create
    public void createUser(String name, String email) {
        dsl.insertInto(USERS)
                .set(USERS.NAME, name)
                .set(USERS.EMAIL, email)
                .execute();
    }

    // Read
    public List<User> getUsers() {
        return dsl.selectFrom(USERS)
                .fetchInto(User.class);
    }

    // Update
    public void updateUser(Integer id, String name, String email) {
        dsl.update(USERS)
                .set(USERS.NAME, name)
                .set(USERS.EMAIL, email)
                .where(USERS.ID.eq(id))
                .execute();
    }

    // Delete
    public void deleteUser(Integer id) {
        dsl.deleteFrom(USERS)
                .where(USERS.ID.eq(id))
                .execute();
    }
}
