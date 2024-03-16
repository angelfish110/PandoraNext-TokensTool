package com.tokensTool.pandoraNext.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Yangyang
 * @create 2023-12-10 11:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class poolToken {
    /**
     * pool_token 专属名（文件唯一）
     */
    private String poolName;

    /**
     * pool_token 值
     */
    private String poolToken;

    /**
     * pool_token 的分享token名数组
     */
    private List<String> shareTokens;

    /**
     * pool_token 注册时间
     */
    private String poolTime;

    /**
     * token 检查checkPool是否过期
     */
    private boolean checkPool;

    /**
     * 是否添加到oneApi里面
     */
    private boolean intoOneApi;

    /**
     * 接入oneApi自定义PandoraNext模型
     */
    private String poolOneApi_models;

    /**
     * 模型重定向
     */
    private String poolModel_mapping;

    /**
     * 接入oneApi自定义PandoraNext地址
     */
    private String oneApi_pandoraUrl;

    /**
     * 接入oneApi的组别
     */
    private String groupChecked;

    /**
     * 接入oneApi的优先级
     */
    private Integer priority;
}
