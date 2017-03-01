package com.move.tools.java;

import java.util.Collection;

/**
 * Created by MECHREV on 2017/1/6.
 * 集合的工具类
 */
public class CollectionsUtil {

    /**
     * 判断一个集合是不是为空
     *
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection<?> collection) {
        if (collection == null || collection.size() == 0) {
            return true;
        }
        return false;
    }

}
