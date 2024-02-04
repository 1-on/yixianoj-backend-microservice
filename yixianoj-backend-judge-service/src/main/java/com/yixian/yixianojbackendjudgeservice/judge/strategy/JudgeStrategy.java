package com.yixian.yixianojbackendjudgeservice.judge.strategy;


import com.yixian.yixianojbackendmodel.model.codesandbox.JudgeInfo;

public interface JudgeStrategy {
    /**
     * 执行判题
     *
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
