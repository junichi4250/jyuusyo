package iii;

import java.util.HashMap;
import java.util.Map;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String address = "福岡県福岡市博多区住吉2－2－2";
		Map<String, Integer> list = new HashMap<String, Integer>();
		list.put("福岡県", 1);
		list.put("鹿児島県", 2);

		Integer prefecture = null;

		// キーから値を取得
		for (String key : list.keySet()) {
			 if (address.indexOf(key) != -1) {
				 prefecture = list.get(key);
				 address = address.substring(key.length());
				 break;
			 }
		}
		System.out.println(prefecture);

		System.out.println(address);
	}

}
