package com.example.mybatis_plus_generator.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Jie7968
 * @since 2019-07-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 骑手身份证号码
     */
    private String idcard;

    /**
     * 骑手身份证图片url
     */
    private String idcardPic;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 创建时间
     */
    private Integer createdTime;

    /**
     * 身份，0为普通用户，1为骑手
     */
    private Integer identity;

    /**
     * 是否为新用户，1为是，0为否
     */
    private Integer isNew;

    /**
     * 登录时间
     */
    private Integer loginTime;

    /**
     * 姓名，骑手必填
     */
    private String name;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 微信openid
     */
    private String openId;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户钱包,保留小数点后2位
     */
    private BigDecimal price;

    /**
     * 骑手审核,0为待审核，1为审核通过，2为审核不通过
     */
    private Integer reviewStatus;

    private String salt;

    /**
     * 用户状态，1为正常，0为删除，2为冻结
     */
    private Integer status;

    /**
     * token
     */
    private String token;

    /**
     * 骑手申请驳回理由
     */
    private String turnDown;

    /**
     * 0表示骑手不接单，1表示该骑手接单
     */
    private Integer receive;

    /**
     * 联系方式
     */
    private String phone;


}
