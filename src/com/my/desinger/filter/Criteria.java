package com.my.desinger.filter;

import java.util.List;

public interface Criteria<T> {

	public List<T> meetCritera(List<T> list);
}
