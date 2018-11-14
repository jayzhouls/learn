package com.billow.product.pojo.vo;


import com.billow.product.pojo.po.ProductImagePo;

import java.io.InputStream;
import java.io.Serializable;

public class ProductImageVo extends ProductImagePo implements Serializable {

    // 图片上传流
    private InputStream inputStream;
    // 图片路径
    private String imagePath;

    public String getImagePath() {
        return imagePath;
    }

    public ProductImageVo setImagePath(String imagePath) {
        this.imagePath = imagePath;
        return this;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public ProductImageVo setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
        return this;
    }
}