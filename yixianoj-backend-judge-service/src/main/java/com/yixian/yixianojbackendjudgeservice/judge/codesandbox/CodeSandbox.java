package com.yixian.yixianojbackendjudgeservice.judge.codesandbox;


import com.yixian.yixianojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.yixian.yixianojbackendmodel.model.codesandbox.ExecuteCodeResponse;

public interface CodeSandbox {
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
