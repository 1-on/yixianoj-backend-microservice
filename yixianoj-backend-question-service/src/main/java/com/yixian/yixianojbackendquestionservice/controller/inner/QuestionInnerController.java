package com.yixian.yixianojbackendquestionservice.controller.inner;

import com.yixian.yixianojbackendmodel.model.entity.Question;
import com.yixian.yixianojbackendmodel.model.entity.QuestionSubmit;
import com.yixian.yixianojbackendquestionservice.service.QuestionService;
import com.yixian.yixianojbackendquestionservice.service.QuestionSubmitService;
import com.yixian.yixianojbackendserviceclient.service.QuestionFeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * 该服务仅内部调用，不是给前端的
 */
@RestController
@RequestMapping("/inner")
public class QuestionInnerController implements QuestionFeignClient {

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionSubmitService questionSubmitService;


    @Override
    @GetMapping("/get/id")
    public Question getQuestionById(@RequestParam("questionId") long questionId) {
        return questionService.getById(questionId);
    }

    @Override
    @GetMapping("/question_submit/get/id")
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionId") long questionId) {
        return questionSubmitService.getById(questionId);
    }

    @Override
    @PostMapping("/question_submit/update")
    public boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit) {
        return questionSubmitService.updateById(questionSubmit);
    }
}
