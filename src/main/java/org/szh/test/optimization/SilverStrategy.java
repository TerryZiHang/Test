package org.szh.test.optimization;

public class SilverStrategy implements Strategy{

	@Override
	public double compute(long money) {
		System.out.println("白银会员，优惠50元");
		return money - 50;
	}

	@Override
	public int getType() {
		return Rank.SILVER_VIP.getCode();
	}

}
