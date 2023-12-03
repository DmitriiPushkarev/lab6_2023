package ru.pushkarev.MySpringBoot2Dbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.pushkarev.MySpringBoot2Dbase.entity.Lesson;
import ru.pushkarev.MySpringBoot2Dbase.service.LessonService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LessonController {
    @Autowired
    private LessonService lessonService;

    @GetMapping("/lessons")
    public List<Lesson> allLessons(){
        return lessonService.getAllLessons();
    }

    @GetMapping("/lessons/{id}")
    public Lesson getLesson(@PathVariable("id") int id){
        return lessonService.getLesson(id);
    }

    @PostMapping ("/lessons")
    public Lesson saveLesson(@RequestBody Lesson lesson){
        return lessonService.saveLesson(lesson);
    }

    @PutMapping("/lessons")
    public Lesson updateLesson(@RequestBody Lesson lesson){
        lessonService.saveLesson(lesson);
        return lesson;
    }

    @DeleteMapping("/lessons/{id}")
    public Lesson deleteLesson(@PathVariable("id") int id){
        return lessonService.getLesson(id);
    }
}
