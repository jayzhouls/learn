package com.billow.job.pojo.po;

import com.billow.jpa.base.pojo.BasePage;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 自动任务信息日志数据库模型<br>
 * <p>
 * 对应的表名：sys_schedule_job_log
 *
 * @author billow<br>
 * @version 2.0
 * @Mail lyongtao123@126.com<br>
 * @date 2017-12-08 15:46:02
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "sys_schedule_job_log")
public class ScheduleJobLogPo extends BasePage implements Serializable {

    // 主键id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // 创建人
    @CreatedBy
    private String creatorCode;
    // 更新人
    private String updaterCode;
    // 创建时间
    @CreatedDate
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss.SSS")
    private Date createTime;
    // 更新时间
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss.SSS")
    private Date updateTime;
    // 有效标志
    private Boolean validInd;

    // 日志id,唯一
    private String logId;

    // 任务名称
    private String jobName;

    // 任务分组
    private String jobGroup;

    // 自动任务id
    private Long jobId;

    @Lob
    @Type(type = "text")
    // 错误信息
    private String info;

    // 是否执行成功
    private Boolean isSuccess;

    // 执行时间
    private String runTime;
}