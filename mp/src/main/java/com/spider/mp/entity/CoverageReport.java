package com.spider.mp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("diff_coverage_report")
public class CoverageReport implements Serializable {
    @TableId
    private Long id;
    private String jobRecordUuid;
    private String requestStatus;
    private String giturl;
    private String nowVersion;
    private String baseVersion;
    private String diffmethod;
    private Integer type;
    private String reportUrl;
    private Double lineCoverage;
    private Double branchCoverage;
    private String errMsg;
    private Date createTime;
    private Date updateTime;
    private String subModule;
    @TableField("`from`")
    private Integer from;
    private String nowLocalPath;
    private String baseLocalPath;
    private String logFile;

}
