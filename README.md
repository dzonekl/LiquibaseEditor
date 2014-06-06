LiquidBaseEditor 
================
(*Thanks to [EMF](http://www.eclipse.org/emf) this project was created in < 2 hours*)

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
4. Open this file. It should look like below screenshot
5. Finally, there are couple of little icons in the upper-right corner. 
  1. Check all dependencies
  2. Run/Debug the editor
  3. Export the product as an executable. (win32/MacOSX/Linux-GTK). 


![alt tag](https://raw.githubusercontent.com/dzonekl/LiquidBaseEditor/master/assets/product01-sc.png)


# Contributing 

If you managed to complete the Compile and Build stage, then you are ready to contribute. 
Some Ideas: 

* The editor is standard EMF. It has it's known limitations. Form based editing, and producing some imaging like
a nice iconset for the DBChangeLog model would be great... oh and why not add a graphical editor with [Graphiti](http://www.eclipse.org/graphiti/). 

* Host the binaries: Well what to say... Downloading ready cooked binaries of the editor would be cool for adoption. Anyone can host them? (oh en setting up a Jenkins server to auto-build/test/publish would be neat). 

* Run liquidbase from the editor: (I include a plugin with Liquidbase in Eclipse plugin format, meaning liquidbase is exposed to other plugins and can be called programmatically). 

* Manage JDBC Drivers: Woudn't be cool to browse and download JDBC drivers... We could even keep a repo. of jdbc driver URL's somewhere only, read-it, download, inject in the classpath and boom! 

* Support EMF/EDAPT <--> Liquidbase transitions. See more here http://www.eclipse.org/edapt
 

Hope you like it! 
Christophe Bouhier
http://modelmoo.blogspot.com



















