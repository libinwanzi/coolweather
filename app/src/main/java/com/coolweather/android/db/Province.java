package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by BenLee on 2018/10/14.
 */

public class Province extends DataSupport {

    private int id;

    private String ProvinceName;

    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return ProvinceName;
    }

    public void setProvinceName(String provinceName) {
        this.ProvinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
