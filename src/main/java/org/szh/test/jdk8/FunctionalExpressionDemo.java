package org.szh.test.jdk8;

import java.util.function.Supplier;

/**
 * 函数式编程 
 * Consumer<T>： 消费型接口，表示一个接受单个输入参数并返回没有结果的操作。对类型为T的对象应用操作。接口方法： void
 * accept(T t) 
 * Supplier<T>： 供给型接口，类似一个供应商，返回一个类型为T的对象。接口方法： T get() 
 * Function<T, R>： 函数型接口，表示一个接受一个参数并产生结果的函数。接口方法： R apply(T t) 
 * Predicate<T>： 断言型接口，确定类型为T的对象是否满足某约束，并返回boolean 值。接口方法： boolean test(T t)
 * 
 * @author Terry
 * @date 2019年12月27日
 * @description
 */
public class FunctionalExpressionDemo {

	public static void main(String[] args) {
		// supplier生产数据函数式接口
		int[] arr = { 10, 1, 15, 84, 2 };
		int maxValue = getMax(() -> {
			int max = arr[0];
			for (int i : arr) {
				if (i > max) {
					max = i;
				}
			}
			return max;
		});
		System.out.println(maxValue);
	}

	public static int getMax(Supplier<Integer> base) {
		return base.get();
	}
}
