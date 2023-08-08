package com.board.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchDTO {
    private int page;
    private int recordSize;
    private int pageSize;
    private String keyword;
    private String searchTyoe;

    public SearchDTO(){
        this.page = 1;
        this.recordSize = 20;
        this.pageSize = 5;
    }
    public int getOffset(){
        return (page-1)*recordSize;
    }
}
