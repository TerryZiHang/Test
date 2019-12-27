package org.szh.test.optimization;

/**
 * 枚举型：把不确定的变量或者对象的可能值全部列举出来
 * 
 * @author Terry
 *
 */
public enum Rank {
	
	ORDINARY_VIP(0),
	SILVER_VIP(1),
	GOLDEN_VIP(2),
	PLATINUM_VIP(3);
	
	public Integer code;
	
	private Rank(Integer code) {
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
}
