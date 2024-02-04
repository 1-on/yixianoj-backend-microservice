package com.yixian.yixianojbackendmodel.model.dto.questionsubmit;

import com.yixian.yixianojbackendcommon.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 创建请求
 *
 * @author <a href="https://github.com/1-on">一弦</a>
 * yixianoj-backend
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class QuestionSubmitQueryRequest extends PageRequest implements Serializable {


    /**
     * 编程语言
     */
    private String language;
    /**
     * 用户代码
     */
    private Integer status;

    /**
     * 题目id
     */
    private Long questionId;


    /**
     * 用户ID
     */
    private Long userId;


    private static final long serialVersionUID = 1L;
}