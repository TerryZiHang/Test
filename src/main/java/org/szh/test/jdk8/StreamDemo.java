package  org.szh.test.jdk8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Terry
 * @date 2019年12月27日
 * @description:
 * Lambda:允许把函数作为一个方法的参数 
 * Stream API:新添加的Stream API
 */
public class StreamDemo {

	public static void main(String[] args) {
		List<Person> list = createData();
		groupData(list);
		filterData(list);
		printData(list);
//		sortData(list);
		sortMoreData(list);
	}

	/**
	 * 过滤集合
	 * 
	 * @param list
	 */
	public static void filterData(List<Person> list) {
		List<Person> persons = list.stream().filter(p -> p.getSex()).collect(Collectors.toList());
		// 遍历
		persons.forEach(item -> System.out.println(item.getName()));
	}

	/**
	 * 从集合中筛选需要的数据打印
	 * 
	 * @param list
	 */
	public static void printData(List<Person> list) {
		// 提取元素组成新的集合
		List<Person> persons = list.stream().map(e -> new Person(e.getName(), e.getSex())).collect(Collectors.toList());
		// 遍历
		persons.forEach(item -> System.out.println(item.getName() + "," + item.getSex()));
	}

	/**
	 * 集合排序(倒序)
	 * 
	 * @param list
	 */
	public static void sortData(List<Person> list) {
		// 倒序
		List<Person> collect = list.stream().sorted((o1, o2) -> o2.getName().compareTo(o1.getName()))
				.collect(Collectors.toList());
		collect.forEach(item -> System.out.println(item.getName()));
	}

	/**
	 * 集合排序(多条件)
	 * 
	 * @param list
	 */
	public static void sortMoreData(List<Person> list) {
		// 正序
		list.sort(Comparator.comparing(Person::getSex).thenComparing(Person::getName));
		list.forEach(item -> System.out.println(item.getSex() + ","+item.getName()));
		// 倒序
		list.sort(Comparator.comparing(Person::getSex).reversed().thenComparing(Person::getName));
		list.forEach(e -> System.out.println(e.getSex() + "," + e.getName()));
	}

	/**
	 * 分组
	 * 
	 * @param list
	 */
	public static void groupData(List<Person> list) {
		Map<Boolean, List<Person>> map = list.stream().collect(Collectors.groupingBy(Person::getSex));
		map.forEach((key, value) -> value.forEach(item -> System.out.println(item.getId() + "," + item.getName())));
	}
	
	private static List<Person> createData() {
		List<Person> list = new ArrayList<>();
		Person person;
		int len = 10;
		for (int i = 0; i < len; i++) {
			person = new Person();
			person.setId(i + "");
			// true 男 false 女
			person.setSex(i % 2 == 0);
			person.setName("张" + i);
			list.add(person);
		}
		return list;
	}

}
