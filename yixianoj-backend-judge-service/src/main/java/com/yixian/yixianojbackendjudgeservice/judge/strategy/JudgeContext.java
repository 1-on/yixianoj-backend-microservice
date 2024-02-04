package com.yixian.yixianojbackendjudgeservice.judge.strategy;

import com.yixian.yixianojbackendmodel.model.codesandbox.JudgeInfo;
import com.yixian.yixianojbackendmodel.model.dto.question.JudgeCase;
import com.yixian.yixianojbackendmodel.model.entity.Question;
import com.yixian.yixianojbackendmodel.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文，用于定义在策略中传递的参数
 */
@Data
public class JudgeContext {
    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
