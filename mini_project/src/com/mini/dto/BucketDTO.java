package com.mini.dto;

import java.math.BigDecimal;

public class BucketDTO {
    private String cus_id;
    private String product_no;
    private BigDecimal bucket_count;
    private BigDecimal price;
    private String bucket_no;

    public BucketDTO(String bucket_no, String cus_id, String product_no, BigDecimal bucket_count) {
    	this.bucket_no = bucket_no;
        this.cus_id = cus_id;
        this.product_no = product_no;
        this.bucket_count = bucket_count;
    }
    
    public BucketDTO(String bucket_no, String cus_id, String product_no, BigDecimal bucket_count, BigDecimal price) {
    	this.bucket_no = bucket_no;
        this.cus_id = cus_id;
        this.product_no = product_no;
        this.bucket_count = bucket_count;
        this.price = price;
    }

    public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getCus_id() {
        return cus_id;
    }

    public String getProduct_no() {
        return product_no;
    }

    /* 소수계산..? */
    public BigDecimal getBucket_count() {
        return bucket_count;
    }

    public void setCus_id(String cus_id) {
        this.cus_id = cus_id;
    }

    public void setProduct_no(String product_no) {
        this.product_no = product_no;
    }

    public void setBucket_count(BigDecimal bucket_count) {
        this.bucket_count = bucket_count;
    }

	@Override
	public String toString() {
		return "BucketDTO [ bucket_no=" + bucket_no
				+ ", product_no=" + product_no
				+ ", bucket_count=" + bucket_count
				+ ", cus_id=" + cus_id + "]";
	}


}
