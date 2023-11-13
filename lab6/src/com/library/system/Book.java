package com.library.system;

public class Book {
    private int yearPublished;

    public Book(int yearPublished) {
        this.yearPublished = (yearPublished < 1455 || yearPublished > 2023) ? 2023 : yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        if(yearPublished <= 2023 && yearPublished >= 1455) {
            this.yearPublished = yearPublished;
        }
    }
}
