package com.net.library.pojo;

public class BookWarehouse {
    private int id;
    private String ISBN;
    private String bookName;
    private String type;
    private String publishingHouse;
    private String author;
    private String shelf;//位置
    private String url;
    private String number; //上架数量
    private String numberJar;//仓库量
    private String status;//状态
    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public BookWarehouse() {
    }

    public BookWarehouse(int id, String ISBN, String bookName, String type, String publishingHouse, String author, String shelf, String url, String number, String numberJar, String status, String delFlag) {
        this.id = id;
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.type = type;
        this.publishingHouse = publishingHouse;
        this.author = author;
        this.shelf = shelf;
        this.url = url;
        this.number = number;
        this.numberJar = numberJar;
        this.status = status;
        this.delFlag = delFlag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumberJar() {
        return numberJar;
    }

    public void setNumberJar(String numberJar) {
        this.numberJar = numberJar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}
