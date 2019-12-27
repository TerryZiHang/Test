package org.szh.test.optimization;

/**
 * 策略接口
 * 
 * @author Terry Zi
 *
 */
public interface Strategy {
	
	double compute(long money);
	
	int getType();

}
