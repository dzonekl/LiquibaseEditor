LiquidBaseEditor
================

An Editor for LiquidBase DB Change Log

![alt tag](https://raw.githubusercontent.com/dzonekl/LiquidBaseEditor/master/assets/editor-sc.png)
* A cool DB Change Log editor - EMF Generated*

Here is an example of the generated DB Change log, modelled after the liquidbase quick start: 
http://www.liquibase.org/quickstart.html

'''XML
<?xml version="1.0" encoding="UTF-8"?>
<dbchangelog:databaseChangeLog xmlns:dbchangelog="http://www.liquibase.org/xml/ns/dbchangelog">
  <dbchangelog:changeSet author="bob" id="1">
    <dbchangelog:createTable catalogName="" tableName="department">
      <dbchangelog:column name="id" type="int" valueSequenceNext="Value Sequence Next&#x9;"><dbchangelog:constraints nullable="false" primaryKey="true"/></dbchangelog:column>
    </dbchangelog:createTable>
  </dbchangelog:changeSet>
</dbchangelog:databaseChangeLog>
'''




# Compile and build





