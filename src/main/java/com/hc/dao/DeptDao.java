package com.hc.dao;

import com.hc.bean.Dept;

import java.util.List;

/**
 * @类名: DeptDao
 * @作者: 梁云亮
 * @生产日期 2020/2/2 12:04
 * @功能描述:
 */
public interface DeptDao {
    int insert(Dept dept);

    int update(Dept dept);

    int delete(Integer deptno);

    Dept selectByDeptno(Integer deptno);

    List<Dept> selectAll();
}
