package org.szh.test.optimization;

public class PlatinumStrategy implements Strategy	{

	@Override
	public double compute(long money) {
		System.out.println("白金会员，优惠50，再打七折");
		return (money-50) * 0.7;
	}

	@Override
	public int getType() {
		return Rank.PLATINUM_VIP.getCode();
	}

}
