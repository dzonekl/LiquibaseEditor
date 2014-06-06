LiquidBaseEditor
================

An Editor for LiquidBase DB Change Log

![alt tag](https://raw.githubusercontent.com/dzonekl/LiquidBaseEditor/master/assets/editor-sc.png)
*A cool DB Change Log editor - EMF Generated*

Here is an example of the generated DB Change log, modelled after the liquidbase quick start: 
http://www.liquibase.org/quickstart.html

```XML
<?xml version="1.0" encoding="UTF-8"?>
<dbchangelog:databaseChangeLog xmlns:dbchangelog="http://www.liquibase.org/xml/ns/dbchangelog">
  <dbchangelog:changeSet author="bob" id="1">
    <dbchangelog:createTable catalogName="" tableName="department">
      <dbchangelog:column name="id" type="int" valueSequenceNext="Value Sequence Next&#x9;"><dbchangelog:constraints nullable="false" primaryKey="true"/></dbchangelog:column>
    </dbchangelog:createTable>
  </dbchangelog:changeSet>
</dbchangelog:databaseChangeLog>
```
*Notice it misses the xsi:schemaLocation="http://www.liquibase.org/xml/ns/dbchangelog
         http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-3.1.xsd"*


# Compile and build

1. plugins/ directory contains the Eclipse projects. So checkout this GIT repo from an Eclipse IDE and import the 
plugins in Your Eclipse workspace. Eclipse IDE can be downloaded from http://download.eclipse.org. The Modeling version will also contain the required dependencies. 

2. Eclipse IDE will automatically compile your projects and if all dependencies are resolved, you should not see any errors in the "Problems" view. 

3. Navigate the org.liquidbase.product project and look for a file named: liquidbase.product

4. Open this file. It should look like this: 













