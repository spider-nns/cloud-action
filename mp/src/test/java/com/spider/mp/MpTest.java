package com.spider.mp;

import com.spider.mp.entity.CoverageReport;
import com.spider.mp.mapper.CoverageReportMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MpTest {

    @Autowired
    CoverageReportMapper mapper;

    @Test
    public void testSelect() {
        List<CoverageReport> list = mapper.selectList(null);
        assertEquals(3, list.size());
        list.forEach(System.out::println);
    }
}
