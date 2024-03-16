package com.tokensTool.pandoraNext.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Yangyang
 * @create 2023-11-18 10:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class systemSetting {
    /**
     * 绑定IP和端口
     */
    private String bing;
    /**
     * 请求的超时时间
     */
    private Integer timeout;
    /**
     * 部署服务流量走代理
     */
    private String proxy_url;
    /**
     * GPT中创建的对话分享
     */
    private Boolean public_share;
    /**
     * 访问网站密码
     */
    private String site_password;
    /**
     * 重载服务密码
     */
    private String setup_password;
    /**
     * 白名单（null则不限制，为空数组[]则限制所有账号）
     */
    private String whitelist;

    /**
     * pandoraNext验证license_id
     */
    private String license_id;

    /**
     * tokensTool登录Username
     */
    private String loginUsername;

    /**
     * tokensTool密码Password
     */
    private String loginPassword;

    /**
     * tokensTool 验证信息
     */
    private validation validation;

    /**
     * tokensTool 更新token网址
     * 为"default"则调用本机的，不为“default"则自定义
     */
    private String autoToken_url;

    /**
     * 是否开启拿tokensTool的后台token
     */
    private Boolean isGetToken;
    /**
     * tokensTool 拿到getTokenPassword
     * 为"getTokenPassword" 默认：123456
     * 默认拿getTokenPassword
     */
    private String getTokenPassword;

    /**
     * tokensTool 更新containerName(容器名)
     * 通过容器名实现开启，关闭，重新启动容器
     */
    private String containerName;


    /**
     * PandoraNext tls证书
     */
    private tls tls;

    /**
     * PandoraNext config.json位置
     */
    private String configPosition;

    /**
     * PandoraNext 接口地址添加前缀
     */
    private String isolated_conv_title;

    /**
     * PandoraNext 会话标题
     */
    private String proxy_api_prefix;

    /**
     * 禁用注册账号功能，true或false
     */
    private Boolean disable_signup;

    /**
     * 在proxy模式使用gpt-4模型调用/backend-api/conversation接口是否自动打码，使用消耗为4+10。
     */
    private Boolean auto_conv_arkose;

    /**
     * 在proxy模式是否使用PandoraNext的文件代理服务，避免官方文件服务的墙。
     */
    private Boolean proxy_file_service;

    /**
     * 配置自定义的DoH主机名，建议使用IP形式。默认在+8区使用223.6.6.6，其余地区使用1.1.1.1。
     */
    private String custom_doh_host;

    /**
     * 自动刷新session的开关
     */
    private Boolean auto_updateSession;

    /**
     * 自动刷新session的时间 (天为单位)
     */
    private Integer auto_updateTime;

    /**
     * 自动刷新session的个数 （个）
     */
    private Integer auto_updateNumber;

    /**
     * PadoraNext的公网访问地址
     */
    private String pandoraNext_outUrl;

    /**
     * oneAPi的公网访问地址
     */
    private String oneAPi_outUrl;

    /**
     * oneApi访问令牌
     */
    private String oneAPi_intoToken;
}
