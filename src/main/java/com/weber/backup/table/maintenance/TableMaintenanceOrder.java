package com.weber.backup.table.maintenance;


import com.weber.backup.table.TableCustom;
import com.weber.backup.table.TableOrder;
import lombok.Data;

import java.util.Date;

@Data
public class TableMaintenanceOrder extends TableOrder {
    private TableCustom custom;
    private Date receiptDate;

}
