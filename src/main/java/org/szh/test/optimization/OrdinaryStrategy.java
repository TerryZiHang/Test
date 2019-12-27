package org.szh.test.optimization;

public class OrdinaryStrategy implements Strategy{

	@Override
	public double compute(long money) {
		System.out.println("普通会员，没有优惠");
		return money;
	}

	@Override
	public int getType() {
		return Rank.ORDINARY_VIP.getCode();
	}
}
