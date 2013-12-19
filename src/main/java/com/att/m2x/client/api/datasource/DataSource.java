package com.att.m2x.client.api.datasource;


public class DataSource extends CommonDataSource {

    private String batch;
    private String batch_name;

    public String getBatch() {
        return batch;
    }
    
    public String getBatchName() {
        return batch_name;
    }

}

