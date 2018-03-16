package com.lixin.web.bean;

import java.math.BigDecimal;

/**
 * <p>
 * Description
 * </p>
 * <p>
 *
 * @author lengrongfu
 * @create 2017年12月28日下午1:13
 * @see
 *      </P>
 */
public class CommInfoVo {
    // sku
    private Long skuid;
    // 商品名称
    private String name;
    // 商品名称
    private String brandName;
    // 属性
    private String property;
    // 价格
    private BigDecimal profitRetailPrice;
    // 数量
    private Integer quantity;

    // jd skud
    private Long jdSku;

    // 售后服务单id
    private long afsId;

    // 售后状态
    private String afsStatus;
    // 售后描述
    private String statusDescribe;
    // 是否支持售后
    private Boolean isSupportAfs;

    public Long getSkuid() {
        return skuid;
    }

    public void setSkuid(Long skuid) {
        this.skuid = skuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public BigDecimal getProfitRetailPrice() {
        return profitRetailPrice;
    }

    public void setProfitRetailPrice(BigDecimal profitRetailPrice) {
        this.profitRetailPrice = profitRetailPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getJdSku() {
        return jdSku;
    }

    public void setJdSku(Long jdSku) {
        this.jdSku = jdSku;
    }

    public long getAfsId() {
        return afsId;
    }

    public void setAfsId(long afsId) {
        this.afsId = afsId;
    }

    public String getAfsStatus() {
        return afsStatus;
    }

    public void setAfsStatus(String afsStatus) {
        this.afsStatus = afsStatus;
    }

    public String getStatusDescribe() {
        return statusDescribe;
    }

    public void setStatusDescribe(String statusDescribe) {
        this.statusDescribe = statusDescribe;
    }

    public Boolean getSupportAfs() {
        return isSupportAfs;
    }

    public void setSupportAfs(Boolean supportAfs) {
        isSupportAfs = supportAfs;
    }
}
