package com.nomantech.math;

public interface Vector<T extends Number> {

	public T norm();
	public T dot(Vector<T> v);
	public Vector<T> cross(Vector<T> v);
	
	public Vector<T> subtract(Vector<T> v);
	public Vector<T> add(Vector<T> v);
	
	public void scale(T t);
	
}
