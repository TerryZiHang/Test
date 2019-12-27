package org.szh.test.optimization;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 策略+工厂
 * 
 * @author Terry Zi
 *
 */
public class StrategyFactory {

	private Map<Integer, Strategy> map;

	public StrategyFactory() {
		List<Strategy> list = new ArrayList<>();
		list.add(new OrdinaryStrategy());
		list.add(new SilverStrategy());
		list.add(new GoldenStrategy());
		list.add(new PlatinumStrategy());
		// stream 流式转化为map
		map = list.stream().collect(Collectors.toMap(Strategy::getType, (strategy) -> strategy));
		// 相当于
		/*
		 * map = new HashMap<>(); for (Strategy strategy : list) {
		 * map.put(strategy.getType(), strategy); }
		 */
	}

	public Strategy get(Integer type) {
		return map.get(type);
	}

	public static class Holder {
		public static StrategyFactory instance = new StrategyFactory();
	}

	public static StrategyFactory getInstance() {
		return Holder.instance;
	}
}
