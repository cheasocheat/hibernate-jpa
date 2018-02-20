package com.mobiecode.example.hibernatedemo.repository;

import com.mobiecode.example.hibernatedemo.domain.Content;

import java.util.List;

/**
 * Developer : cheasocheat
 * Created on 2/20/18 10:36
 */
public interface ContentRepository {
    Boolean saveContent(Content content);
    Boolean saveContent2(Content content);
    List<Content> getListOfContents();
    List<Content> getListOfContents2();
    List<Content> getListOfContents3();
    List<Content> getListOfContents4();
}
