package com.example.login;

import java.io.Serializable;

public class Badge implements Serializable {

    String url;

    @Override
    public String toString() {
        return "Badge{" +
                "url='" + url + '\'' +
                '}';
    }

    public Badge() {
    }

    public Badge(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
