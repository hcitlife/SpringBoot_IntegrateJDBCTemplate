package com.hc.dao.impl;

import com.hc.bean.Dept;
import com.hc.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @类名: DeptDao
 * @作者: 梁云亮
 * @生产日期 2020/2/2 10:33
 * @功能描述:
 */

@Repository
public class DeptDaoImpl implements DeptDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Dept dept){
        String sql = "insert into tb_dept values (?,?,?)";
        int res = jdbcTemplate.update(sql, dept.getDeptno(),dept.getDname(),dept.getLoc());
        return res;
    }

    @Override
    public int update(Dept dept){
        String sql = "update tb_dept set dname = ?, loc = ? where deptno = ?";
        int res = jdbcTemplate.update(sql, dept.getDname(), dept.getLoc(), dept.getDeptno());
        return res;
    }

    @Override
    public int delete(Integer deptno){
        String sql = "delete from tb_dept where deptno = ?";
        int res = jdbcTemplate.update(sql, deptno);
        return res;
    }

    @Override
    public Dept selectByDeptno(Integer deptno){
        String sql = "select * from tb_dept where deptno = ?";
        List<Dept> res = jdbcTemplate.query(sql, new Object[]{deptno}, new BeanPropertyRowMapper<>(Dept.class));
        if(res != null && res.size()>0){
            return res.get(0);
        }else {
            return null;
        }
    }

    @Override
    public List<Dept> selectAll(){
        String sql = "select * from tb_dept";
        List<Dept> res = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Dept.class));
        return res;
    }
}
