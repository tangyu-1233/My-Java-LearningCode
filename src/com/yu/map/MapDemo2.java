package com.yu.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    static void main() {
        //创建Map集合
        Map<String, String> m = new HashMap<>();

        //添加元素
        m.put("杨过", "小龙女");
        m.put("郭靖", "黄蓉");
        m.put("唐钰", "瞿丹丹");

        //通过键值对对象遍历
        //通过Map.entrySet()方法获取所有的键值对对象，利用单列集合去存取它
        Set<Map.Entry<String,String>> entries = m.entrySet();
        //遍历entries集合，去获取每一个键值对对象
        /*for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }*/

        /*Iterator<Map.Entry<String, String>> it = entries.iterator();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }*/

        entries.forEach(entry -> {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        });
    }
}
