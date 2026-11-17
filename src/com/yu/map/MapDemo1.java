package com.yu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapDemo1 {
    static void main() {
        //创建Map集合
        Map<String, String> m = new HashMap<>();

        //添加元素
        m.put("杨过", "小龙女");
        m.put("郭靖", "黄蓉");
        m.put("唐钰", "瞿丹丹");

        //利用Map对象的keySet()方法去获取每一个键值，利用单列集合去存取它
        Set<String> keys = m.keySet();

        //再利用增强for或者迭代器或者lambda表达式调用Map对象的get()方法获取值
        /*for (String key : keys) {
            //System.out.println(key);
            //利用get(key)去获取对应的值
            String value = m.get(key);
            System.out.println(key + "=" +value);
        }*/

        //迭代器(map集合中没有迭代器，需要到已创建的set集合对象调用)
        /*Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = m.get(key);
            System.out.println(key + "=" + value);

        }*/

        keys.forEach(key -> {
            String value = m.get(key);
            System.out.println(key + "=" + value);
        });
    }
}
