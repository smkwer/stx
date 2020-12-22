package com.stx.domain;

/**
 * 罚金表
 *
 * @author ChengXing
 * @Date Created in 11:07 2020/12/22
 * @Description stx
 */
public class Fine {
    private Integer fid;
    private Double fine;
    private String reason;
    private Integer id;

    public Fine() {
    }

    public Fine(Integer fid, Double fine, String reason, Integer id) {
        this.fid = fid;
        this.fine = fine;
        this.reason = reason;
        this.id = id;
    }

    public Fine(Double fine, String reason, Integer id) {
        this.fine = fine;
        this.reason = reason;
        this.id = id;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Double getFine() {
        return fine;
    }

    public void setFine(Double fine) {
        this.fine = fine;
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
        return "Fine{" +
                "fid=" + fid +
                ", fine=" + fine +
                ", reason='" + reason + '\'' +
                ", id=" + id +
                '}';
    }
}
