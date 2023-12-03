package ru.pushkarev.MySpringBoot2Dbase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.pushkarev.MySpringBoot2Dbase.dao.LessonDAO;
import ru.pushkarev.MySpringBoot2Dbase.entity.Lesson;

import java.util.List;

@Service
public class LessonServiceImpl implements LessonService{
    @Autowired
    private LessonDAO lessonDAO;

    @Override
    @Transactional
    public List<Lesson> getAllLessons() {
        return lessonDAO.getAllLessons();
    }

    @Override
    @Transactional
    public Lesson saveLesson(Lesson lesson) {
        return lessonDAO.saveLesson(lesson);
    }

    @Override
    @Transactional
    public Lesson getLesson(int id) {
        return lessonDAO.getLesson(id);
    }

    @Override
    @Transactional
    public void deleteLesson(int id) {
        lessonDAO.deleteLesson(id);
    }
}
