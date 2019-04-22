package com.julio.sample.domain;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("user")
public class User {

    @PrimaryKey
    private UserKey key;

    @Column("name")
    private String name;

    @Column("domain")
    private String domain;

    public User() {
    }

    public User(UserKey key, String name, String domain) {
        this.key = key;
        this.name = name;
        this.domain = domain;
    }

    public UserKey getKey() {
        return key;
    }

    public void setKey(UserKey key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
