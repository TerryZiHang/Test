package org.szh.test.optimization;

/**
 * 策略模式：去除if-else,优化代码
 * 
 * @author Terry
 *
 */
public class StrategyDemo {
	
	public static double getResult(long money, int type) {
		
		if(money < 1000) {
			return money;
		}
		Strategy strategy = StrategyFactory.getInstance().get(type);
		
		if(strategy == null) {
			throw new IllegalArgumentException("未创建");
		}
		return strategy.compute(money);
	}
	
	public static void main(String[] args) {
		long money = 1500;
		
		int type = 3;
		
		System.out.println(getResult(money, type));
	}

}
