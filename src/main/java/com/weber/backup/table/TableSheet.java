package com.weber.backup.table;

import lombok.Data;

import java.util.UUID;

@Data
public class TableSheet extends TableOrder{
    private UUID operator;
}
