package com.xiaomi.work1.bean;

import lombok.Data;

/**
 * ClassName: Result
 * Package: com.xiaomi.work1.bean
 * Description:返回结果类
 *
 * @Author WangYang
 * @Create 2024/5/24 21:34
 * @Version 1.0
 */
@Data
public class Result<T> {
    private  int code;
    private String message;
    private T data;
}
