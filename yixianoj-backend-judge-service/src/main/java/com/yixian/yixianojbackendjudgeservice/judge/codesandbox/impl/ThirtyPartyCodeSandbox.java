package com.yixian.yixianojbackendjudgeservice.judge.codesandbox.impl;


import com.yixian.yixianojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.yixian.yixianojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.yixian.yixianojbackendmodel.model.codesandbox.ExecuteCodeResponse;

public class ThirtyPartyCodeSandbox implements CodeSandbox {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
