package com.yixian.yixianojbackendjudgeservice.judge;

import com.yixian.yixianojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.yixian.yixianojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.yixian.yixianojbackendjudgeservice.judge.strategy.JudgeContext;
import com.yixian.yixianojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.yixian.yixianojbackendmodel.model.codesandbox.JudgeInfo;
import com.yixian.yixianojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

@Service
public class JudgeManager {
    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
