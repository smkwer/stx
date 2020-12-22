package com.stx.domain;

/**
 * 奖金表
 *
 * @author ChengXing
 * @Date Created in 10:11 2020/12/22
 * @Description stx
 */
public class Bonus {
    private Integer bid;
    /**
     * 金额
     */
    private Double amount;
    private String reason;
    /**
     * 教师外键
     */
    private Integer id;

    public Bonus() {
    }

    public Bonus(Integer bid, Double amount, String reason) {
        this.bid = bid;
        this.amount = amount;
        this.reason = reason;
    }

    public Bonus(Double amount, String reason, Integer id) {
        this.amount = amount;
        this.reason = reason;
        this.id = id;
    }

    public Bonus(Integer bid, Double amount, String reason, Integer id) {
        this.bid = bid;
        this.amount = amount;
        this.reason = reason;
        this.id = id;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Bonus{" +
                "bid=" + bid +
                ", amount=" + amount +
                ", reason='" + reason + '\'' +
                ", id=" + id +
                '}';
    }
}
