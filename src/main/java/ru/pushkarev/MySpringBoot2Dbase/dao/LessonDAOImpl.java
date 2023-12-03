package ru.pushkarev.MySpringBoot2Dbase.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.pushkarev.MySpringBoot2Dbase.entity.Lesson;

import java.util.List;

@Slf4j
@Repository
public class LessonDAOImpl implements LessonDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Lesson> getAllLessons() {
        Query query = entityManager.createQuery("from Lesson");
        List<Lesson> allLessons = query.getResultList();
        log.info("getAllLessons" + allLessons);
        return allLessons;
    }

    @Override
    public Lesson saveLesson(Lesson Lesson) {
        return entityManager.merge(Lesson);
    }

    @Override
    public Lesson getLesson(int id) {
        return entityManager.find(Lesson.class, id);
    }

    @Override
    public void deleteLesson(int id) {
        Query query = entityManager.createQuery("delete from Lesson " +
                " where id =:LessondId");
        query.setParameter("LessondId", id);
        query.executeUpdate();
    }
}
