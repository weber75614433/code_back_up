package com.weber.backup.table.material;


import com.weber.backup.table.TableBase;
import lombok.Data;

import java.util.UUID;

@Data
public class TableMaterial extends TableBase {
    private UUID manufacturer;

}
