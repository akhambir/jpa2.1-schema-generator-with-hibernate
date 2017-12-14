package com.akhambir.ddl.ddl_gen;

import javax.persistence.Persistence;

public class DDLGenerator {

    private static final String PERSISTENCE_UNIT = "ddl-gen";

    public static void main(String[] args) {
        Persistence.generateSchema(PERSISTENCE_UNIT, null);
    }
}
