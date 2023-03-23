package com.weber.backup.table;

import lombok.Data;

import java.util.UUID;

@Data
public class TableOrder extends TableBase{
    private UUID owner;
    private String serialNumber;
}
