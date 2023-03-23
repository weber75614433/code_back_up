package com.weber.backup.table.product;


import com.weber.backup.table.material.TableMaterial;
import lombok.Data;

import java.util.UUID;

@Data
public class tableProduct extends TableMaterial {
    private UUID manufacture;
    private UUID order;
    private String serialNumber;
    private String warranty;
}
