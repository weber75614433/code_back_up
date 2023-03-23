package com.weber.backup.table.maintenance;


import com.weber.backup.table.TableSheet;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class TableMaintenanceReport extends TableSheet {
    private UUID product;
    private String issue;
    private Date finishDate;
    private String testList;
    private String testResult;
    private String note;
}
