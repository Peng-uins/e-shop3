package edu.nf.eshop.entity;

import lombok.Data;

/**
 * @author 0.0
 */
@Data
public class Users {
    private Integer uId;
    private String password;

    public Users() {
    }

    public Users(Integer uId, String password) {
        this.uId = uId;
        this.password = password;
    }
}
