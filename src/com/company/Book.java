package com.company;

        public class Book {
        private String bookName;
        private Author bookAuthor;
        private int yearPublic;

    public Book(String bookName, Author bookAuthor, int yearPublic) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearPublic = yearPublic;
    }

            public String getBookName() {
                return bookName;
            }

            public Author getBookAuthor() {
                return bookAuthor;
            }

            public int getYearPublic() {
                return yearPublic;
            }

            public void setYearPublic(int yearPublic) {
                this.yearPublic = yearPublic;
            }

            @Override
            public String toString() {
                return "Book{" +
                        "bookName='" + bookName + '\'' +
                        ", bookAuthor=" + bookAuthor +
                        ", yearPublic=" + yearPublic +
                        '}';
            }
        }
