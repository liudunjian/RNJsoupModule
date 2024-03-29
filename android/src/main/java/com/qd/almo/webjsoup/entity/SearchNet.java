package com.qd.almo.webjsoup.entity;

public class SearchNet {

    private String title;
    private SearchNetMu searchNetMu;
    private String detail;

    public SearchNet(String title, SearchNetMu searchNetMu,String detail) {
        this.title = title;
        this.searchNetMu = searchNetMu;
        this.detail = detail;
    }

    public SearchNetMu getSearchNetMu() {
        return searchNetMu;
    }

    public String getTitle() {
        return title;
    }

    public String getDetail() {
        return detail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSearchNetMu(SearchNetMu searchNetMu) {
        this.searchNetMu = searchNetMu;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
