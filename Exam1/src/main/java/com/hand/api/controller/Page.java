package com.hand.api.controller;

public class Page {
    private int pageSize;
    private int page;
    private String sort = "ASC";

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getPage() {
        return page;
    }

    public String getSort() {
        return sort;
    }
}
