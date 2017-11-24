package com.welife.portal.pojo;

import com.welife.pojo.WeProduct;
import org.apache.commons.lang3.StringUtils;


public class ProductInfo extends WeProduct{

	private String[] images;

	public void setImages(String[] images) {
		this.images = images;
	}

	public String[] getImages() {
		String image = getImg();
		if(!StringUtils.isBlank(image)){
			images = image.split(",");
			return images;
		}

		return null;
	}
}
