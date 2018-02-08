/**
 * Copyright (c) 2014-2018  墨博云舟 All Rights Reserved.
 */
package com.yb.common.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * MyMapper:
 *
 * @author yangbo
 * @version 1.00
 * @since 2018/1/29 0029 15:03
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
