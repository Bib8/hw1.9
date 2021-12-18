package com.company;

        public class Book {
        private String bookName;
        private String bookAuthor;
        private int yearPublic;

    public Book(String bookName, String bookAuthor, int yearPublic) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearPublic = yearPublic;
    }

            public String getBookName() {
                return bookName;
            }

            public String getBookAuthor() {
                return bookAuthor;
            }

            public int getYearPublic() {
                return yearPublic;
            }

            public void setYearPublic(int yearPublic) {
                this.yearPublic = yearPublic;
            }
        }
