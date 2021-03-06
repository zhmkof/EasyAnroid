package com.soyoungboy.base.bean;

import java.io.Serializable;

import com.soyoungboy.base.util.GsonImpl;

/**
 * @类名: BaseBean
 * @描述: TODO(BaseBean 所有Bean都需要继承该类,继承自该类的bean都以实现序列化)
 * @作者: 王富彬
 */
public class BaseBean implements Serializable {
	private static final long serialVersionUID = 1L;

	public <T> T getBeanFromJson(String response, Class<T> T) {
		T t = GsonImpl.get().toObject(response, T);
		return t;
	}
}
