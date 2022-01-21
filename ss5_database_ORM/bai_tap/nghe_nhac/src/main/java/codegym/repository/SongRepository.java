package codegym.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
import codegym.model.Song;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class SongRepository implements ISongRepository {
        private static SessionFactory sessionFactory;

        private  static EntityManager entityManager;

        static {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        }

        @Override
    public List<Song> findAll() {
            String queryStr = "select c from Song as c";
            TypedQuery<Song> query = entityManager.createQuery(queryStr,Song.class);
        return query.getResultList();
    }


    @Override
    public Song getById(int id) {
        String queryStr = "select c from Song as c where c.id = :id";
        TypedQuery<Song> query = entityManager.createQuery(queryStr,Song.class);
        query.setParameter("id",id);
            return query.getSingleResult();
    }

    @Override
    public void update(Song song) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Song song1 = getById(song.getId());
            song1.setName(song.getName());
            song1.setSingle(song.getSingle());
            song1.setListening(song.getListening());
            session.saveOrUpdate(song1);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
        public void save(Song song) {
            Session session = null;
            Transaction transaction = null;
            try {
                session = sessionFactory.openSession();
                transaction = session.beginTransaction();
                session.save(song);
                session.saveOrUpdate(song);
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                if (transaction != null) {
                    transaction.rollback();
                }
            } finally {
                if (session != null) {
                    session.close();
                }
            }
        }



    @Override
    public void delete(int id) {
            Song song = new SongRepository().getById(id);
        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.remove(song);
        entityTransaction.commit();
        }
}
