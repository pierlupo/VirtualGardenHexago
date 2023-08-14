package com.domain.model;

public class User {
        private int id;
        private final String username;
        private final String password;  // NOTE: Ne stockez jamais de mot de passe en clair en production!

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(int id, String username, String password) {
            this.id = id;
            this.username = username;
            this.password = password;
        }

        public int getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
}
