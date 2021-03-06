package com.wnf.expandablelistview;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/3 0003.
 */

public class ChildData implements Serializable {
    private String url;
    private String name;
    private String content;

    public ChildData(String url, String name, String content) {
        this.url = url;
        this.name = name;
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
