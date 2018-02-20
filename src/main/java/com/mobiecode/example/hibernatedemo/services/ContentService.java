package com.mobiecode.example.hibernatedemo.services;

import com.mobiecode.example.hibernatedemo.domain.Content;
import java.util.List;

/**
 * Developer : cheasocheat
 * Created on 2/20/18 10:35
 */
public interface ContentService {
    Boolean saveContent(Content content);
    Boolean saveContent2(Content content);
    List<Content> getListOfContents();
    List<Content> getListOfContents2();
    List<Content> getListOfContents3();
    List<Content> getListOfContents4();
}
