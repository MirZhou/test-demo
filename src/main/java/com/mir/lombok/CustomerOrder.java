package com.mir.lombok;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

/**
 * <p>Create time: 2018/12/26 10:56 PM</p>
 *
 * @author 周光兵
 */
@Getter
@Setter
@ToString
public class CustomerOrder {
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy/MM/dd HH/mm/ss")
    private LocalDateTime createTime;
    /**
     * 总金额
     */
    private BigDecimal totalPrice;
    /**
     * 备注
     */
    private String remark;

    public String getCreateTime() {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(createTime);
    }

    public BigDecimal getTotalPrice() {
        return Optional.ofNullable(totalPrice).orElse(BigDecimal.ZERO).setScale(2, RoundingMode.HALF_UP);
    }
}