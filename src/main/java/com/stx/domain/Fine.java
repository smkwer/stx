package com.stx.domain;

/**
 * @author ZhangGuojun
 * @Aythor :张国军
 * @Date ：Created in 20:00 2020/12/8
 * @Description : my_app
 **/

//
// CREATE TABLE fine(
// f_id INT PRIMARY KEY AUTO_INCREMENT,
// amount DOUBLE ,
// fine DOUBLE,
// fid INT
//)

public class Fine {
    int f_id;
    double amount;
    double fine;
    int fid;

    public Fine() {
    }

    public Fine(int f_id, double amount, double fine, int fid) {
        this.f_id = f_id;
        this.amount = amount;
        this.fine = fine;
        this.fid = fid;
    }

    public int getF_id() {
        return f_id;
    }

    public void setF_id(int f_id) {
        this.f_id = f_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }
}
