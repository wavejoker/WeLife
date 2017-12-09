package com.welife.portal.pojo;

import com.welife.pojo.WeProduct;
import org.apache.commons.lang3.StringUtils;


public class ProductInfo extends WeProduct{

	private String[] imgs;

	public void setImgs(String[] imgs) {
		this.imgs = imgs;
	}

	public String[] getImgs() {
		String img = getImg();
		if(!StringUtils.isBlank(img)){
			imgs = img.split(",");
			return imgs;
		}

		return null;
	}
}
