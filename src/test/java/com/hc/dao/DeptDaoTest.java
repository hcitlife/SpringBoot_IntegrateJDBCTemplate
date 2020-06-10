package com.hc.dao;

import com.hc.bean.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * @类名: DeptDaoTest
 * @作者: 梁云亮
 * @生产日期 2020/2/2 10:46
 * @功能描述:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//@ComponentScan(basePackages = {"com.hc.dao"})
//@EnableAutoConfiguration
public class DeptDaoTest {

    @Autowired
    private DeptDao deptDao;

    @Test
    public void insert() {
        Dept dept = new Dept(123, "123", "123");
        int res = deptDao.insert(dept);
        System.out.println(res);
    }

    @Test
    public void update() {
        Dept dept = new Dept(123, "abc", "abc");
        int res = deptDao.update(dept);
        System.out.println(res);
    }

    @Test
    public void delete() {
        int res = deptDao.delete(123);
        System.out.println(res);
    }

    @Test
    public void selectByDeptno() {
        Dept dept = deptDao.selectByDeptno(10);
        System.out.println(dept);
    }

    @Test
    public void selectAll() {
        List<Dept> depts = deptDao.selectAll();
        depts.forEach(System.out::println);
    }
}