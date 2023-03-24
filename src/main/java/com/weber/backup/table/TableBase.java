package com.weber.backup.table;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class TableBase {
    private UUID uuid;
    private Date createDate;
    private String log;
}
