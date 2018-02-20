package com.mobiecode.example.hibernatedemo.services;

import com.mobiecode.example.hibernatedemo.domain.Content;
import com.mobiecode.example.hibernatedemo.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Developer : cheasocheat
 * Created on 2/20/18 10:35
 */
@Service
public class ContentServiceImpl implements ContentService {


    @Autowired
    private ContentRepository repository;

    @Override
    public Boolean saveContent(Content content) {
        return (repository.saveContent(content)) ? true : false;
    }

    @Override
    public Boolean saveContent2(Content content) {
        return (repository.saveContent2(content)) ? true : false;
    }

    @Override
    public List<Content> getListOfContents() {
        return repository.getListOfContents();
    }

    @Override
    public List<Content> getListOfContents2() {
        return repository.getListOfContents2();
    }

    @Override
    public List<Content> getListOfContents3() {
        return repository.getListOfContents3();
    }

    @Override
    public List<Content> getListOfContents4() {
        return repository.getListOfContents4();
    }
}
