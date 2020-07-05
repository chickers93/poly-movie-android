package model;

import java.util.List;

public class TVRespone {
    private int page;
    private int total_results;
    private int total_pages;
    private List<TV> results;

    public TVRespone() {
    }

    public TVRespone(int page, int total_results, int total_pages, List<TV> results) {
        this.page = page;
        this.total_results = total_results;
        this.total_pages = total_pages;
        this.results = results;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public List<TV> getResults() {
        return results;
    }

    public void setResults(List<TV> results) {
        this.results = results;
    }
}
