The purpose of the example is to show how to generate DDL at build time 
JPA 2.1 has nice schema-generation feature which Hibernate can't handel naturally
Using custom ConnectorProvider.class you can avoid creation connection or 
throwing exception. Both cases are not good.