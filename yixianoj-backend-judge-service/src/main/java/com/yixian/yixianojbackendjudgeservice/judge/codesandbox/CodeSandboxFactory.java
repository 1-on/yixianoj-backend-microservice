package com.yixian.yixianojbackendjudgeservice.judge.codesandbox;


import com.yixian.yixianojbackendjudgeservice.judge.codesandbox.impl.ExampleCodeSandbox;
import com.yixian.yixianojbackendjudgeservice.judge.codesandbox.impl.RemoteCodeSandbox;
import com.yixian.yixianojbackendjudgeservice.judge.codesandbox.impl.ThirtyPartyCodeSandbox;

/**
 * 代码沙箱工厂（根据字符串参数创建指定的代码沙箱实例）
 */
public class CodeSandboxFactory {

    public static CodeSandbox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirtyParty":
                return new ThirtyPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }

}
