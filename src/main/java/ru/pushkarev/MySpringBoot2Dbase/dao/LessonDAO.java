package ru.pushkarev.MySpringBoot2Dbase.dao;

import org.springframework.stereotype.Repository;
import ru.pushkarev.MySpringBoot2Dbase.entity.Lesson;

import java.util.List;

@Repository
public interface LessonDAO {
    List<Lesson> getAllLessons();

    Lesson saveLesson(Lesson lesson);

    Lesson getLesson(int id);

    void deleteLesson(int id);
}
