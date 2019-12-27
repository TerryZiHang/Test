package  org.szh.test.optimization;

public class GoldenStrategy implements Strategy{

	@Override
	public double compute(long money) {
		System.out.println("黄金会员，八折优惠");
		return money * 0.8;
	}

	@Override
	public int getType() {
		return Rank.GOLDEN_VIP.getCode();
	}

}
