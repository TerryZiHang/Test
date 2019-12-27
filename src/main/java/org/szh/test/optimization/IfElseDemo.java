package org.szh.test.optimization;

/**
 * if-else实例
 * 
 * @author Terry
 *
 */
public class IfElseDemo {
	
	/**
	 * 使用if-else
	 * 
	 * @param money
	 * @param type
	 * @return
	 */
	public static double getResult(long money, int type) {

	    double result = money;

	    if (money >= 1000) {
	        if (type == Rank.SILVER_VIP.getCode()) {

	            System.out.println("白银会员 优惠50元");
	            result = money - 50;
	        } else if (type == Rank.GOLDEN_VIP.getCode()) {

	            System.out.println("黄金会员 8折");
	            result = money * 0.8;
	        } else if (type == Rank.PLATINUM_VIP.getCode()) {

	            System.out.println("白金会员 优惠50元，再打7折");
	            result = (money - 50) * 0.7;
	        } else {
	            System.out.println("普通会员 不打折");
	            result = money;
	        }
	    }

	    return result;
	}
	
}
