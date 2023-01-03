package com.azh.core;

import java.util.List;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2023-01-03
 */
public interface HotRing {

    boolean insert(String key, String val);

    boolean remove(String key);

    boolean update(String key, String val);

    Entry search(String key);

    int getFindCnt();

    int getMaxFindCnt();

    int getMinFindCnt();

    /**
     * 计算hash值
     * @param key key
     * @return hash值
     */
    int hashFunction(String key);

    // 测试函数
    void setMinMax(int onecnt);

}
