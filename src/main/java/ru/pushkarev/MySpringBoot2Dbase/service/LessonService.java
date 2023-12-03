package ru.pushkarev.MySpringBoot2Dbase.service;

import org.springframework.stereotype.Service;
import ru.pushkarev.MySpringBoot2Dbase.entity.Lesson;

import java.util.List;

@Service
public interface LessonService {
    List<Lesson> getAllLessons();

    Lesson saveLesson(Lesson lesson);

    Lesson getLesson(int id);

    void deleteLesson(int id);
}
