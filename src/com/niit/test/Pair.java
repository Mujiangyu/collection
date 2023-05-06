package com.niit.test;

public class Pair<T> {
    private T first;
    private T second;

    public Pair() {
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    /**
     * 获取
     * @return first
     */
    public T getFirst() {
        return first;
    }

    /**
     * 设置
     * @param first
     */
    public void setFirst(T first) {
        this.first = first;
    }

    /**
     * 获取
     * @return second
     */
    public T getSecond() {
        return second;
    }

    /**
     * 设置
     * @param second
     */
    public void setSecond(T second) {
        this.second = second;
    }

    public String toString() {
        return "Pair{first = " + first + ", second = " + second + "}";
    }
}
