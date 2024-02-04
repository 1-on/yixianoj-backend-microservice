package com.yixian.yixianojbackendjudgeservice.judge;


import com.yixian.yixianojbackendmodel.model.entity.QuestionSubmit;

public interface JudgeService {
    /**
     * 判题服务
     *
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(Long questionSubmitId);
}
