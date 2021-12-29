package com.ruoyi;

import com.ruoyi.system.mapper.SysDeptMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDao {

    @Autowired
    SysDeptMapper SysDeptMapper;

    @Test
    public void testA(){
        Long l1 = new Long(100);
        SysDeptMapper.selectDeptById(l1);
    }
}
