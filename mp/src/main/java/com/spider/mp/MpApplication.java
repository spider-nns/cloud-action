package com.spider.mp;

import com.spider.mp.entity.CoverageReport;
import com.spider.mp.mapper.CoverageReportMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
@MapperScan(basePackages = {"com.spider.mp.mapper"})
public class MpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpApplication.class, args);
    }

    @Autowired
    CoverageReportMapper mapper;

    @GetMapping("/mp")
    public String mp(){
        List<CoverageReport> list = mapper.selectList(null);
        list.forEach(System.out::println);
        return "mp";
    }
}
