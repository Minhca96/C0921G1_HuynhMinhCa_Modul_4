package codegym.repository;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
import codegym.model.Song;

import javax.persistence.EntityManager;
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
    public void save(Song song) {

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


    }

    @Override
    public void delete(int id) {

    }
}
