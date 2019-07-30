package com.example.mybatis_plus_generator.entity;

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
public class BankCard implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 开户行
     */
    private String bank;

    /**
     * 银行卡号
     */
    private String bankCar;

    /**
     * 卡类型（银行名称）
     */
    private String carType;

    /**
     * 创建时间
     */
    private Integer createdTime;

    /**
     * 持卡人
     */
    private String name;

    private Integer userId;

    private Integer cardTypeId;


}
