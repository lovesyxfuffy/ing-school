package com.ing.school.utls;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by yujingyang on 2018/4/28.
 */
public class CacheUtils {
    private static Map<String, Object> cache = new ConcurrentHashMap<>();

    public static void put(String key, Object value) {
        cache.put(key, value);
    }

    public static <T> T get(String key) {
        return (T) cache.get(key);
    }

    public static void remove(String key) {
        cache.remove(key);
    }

}
