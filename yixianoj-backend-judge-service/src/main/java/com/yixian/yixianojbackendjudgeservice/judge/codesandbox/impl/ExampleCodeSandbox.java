package com.yixian.yixianojbackendjudgeservice.judge.codesandbox.impl;


import com.yixian.yixianojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.yixian.yixianojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.yixian.yixianojbackendmodel.model.codesandbox.ExecuteCodeResponse;
import com.yixian.yixianojbackendmodel.model.codesandbox.JudgeInfo;
import com.yixian.yixianojbackendmodel.model.enums.JudgeInfoMessageEnum;
import com.yixian.yixianojbackendmodel.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

/**
 * 示例代码沙箱
 */
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
