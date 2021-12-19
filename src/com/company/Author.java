package com.company;

import java.util.Objects;

public class Author {
    private String authorFirstName;
    private String authorLastName;

    public Author(String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }
    @Override
    public String toString() {
        return getFullName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(getAuthorFirstName(), author.getAuthorFirstName()) && Objects.equals(getAuthorLastName(), author.getAuthorLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthorFirstName(), getAuthorLastName());
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public String getFullName() {
        return authorFirstName + authorLastName;
    }
}
