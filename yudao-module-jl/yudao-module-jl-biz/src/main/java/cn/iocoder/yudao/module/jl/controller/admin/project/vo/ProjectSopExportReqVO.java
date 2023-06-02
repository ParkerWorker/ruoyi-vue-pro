package cn.iocoder.yudao.module.jl.controller.admin.project.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 项目中的实验名目的操作SOP Excel 导出 Request VO，参数和 ProjectSopPageReqVO 是一致的")
@Data
public class ProjectSopExportReqVO {

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

    @Schema(description = "实验名目 id", example = "15560")
    private Long projectCategoryId;

    @Schema(description = "原始实验名目 id", example = "21140")
    private Long categoryId;

    @Schema(description = "操作步骤的内容")
    private String content;

    @Schema(description = "步骤序号")
    private Integer step;

    @Schema(description = "注意事项")
    private String mark;

    @Schema(description = "依赖项(json数组多个)")
    private String dependIds;

}
