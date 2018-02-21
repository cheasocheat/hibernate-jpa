package com.mobiecode.example.hibernatedemo.repository;

import com.mobiecode.example.hibernatedemo.domain.Content;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Developer : cheasocheat
 * Created on 2/20/18 10:36
 */
@Repository
public class ContentRepositoryImpl implements ContentRepository {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Boolean saveContent(Content content) {
        Long id = null;
        Session session = sessionFactory.openSession();
        Transaction trx = null;

        try {
            sessionFactory.openSession().save(content);
            trx = session.beginTransaction();
            id = (Long) session.save(content);
            trx.commit();
        } catch (HibernateException e) {
            if (trx!=null) trx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return id > 0 ? true : false;

    }

    @Override
    public Boolean saveContent2(Content content) {
//        Long id = null;
//        sessionFactory.openSession().beginTransaction();
//        id = (Long) sessionFactory.openSession().save(content);
//        sessionFactory.openSession().getTransaction().commit();

//        return id > 0 ? true : false;
        return null;
    }

    @Override
    public List<Content> getListOfContents() {
        Criteria criteria = sessionFactory.openSession().createCriteria(Content.class);
       // cr.add(Restrictions.eq("con_id", 1));
        return criteria.list();
    }

    @Override
    public List<Content> getListOfContents2() {
        Session session = sessionFactory.openSession();
        Transaction trx = null;
        List<Content> lstContents = null;

        try{
            trx = session.beginTransaction();
            lstContents = session.createQuery("FROM Content").list();
            trx.commit();
        }catch (HibernateException e){
            if (trx!=null) trx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return lstContents;
    }

    @Override
    public List<Content> getListOfContents3() {
        Session session = sessionFactory.openSession();
        Transaction trx = null;
        List<Content> lstContents = null;

        try{
            trx = session.beginTransaction();
            String sql = "SELECT * FROM tb_content";
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity(Content.class);
            lstContents = query.list();
            trx.commit();
        }catch (HibernateException e){
            if (trx!=null) trx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return lstContents;
    }

    @Override
    public List<Content> getListOfContents4() {
        return null;
    }

}
