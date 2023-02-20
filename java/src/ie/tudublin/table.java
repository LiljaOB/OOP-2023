package ie.tudublin;

import processing.data.Table;
import processing.data.TableRow;

//examples of processing imports that are useful

public class table 
{
    Table tableName;

    void createTable()
    {
        tableName = new Table();

        tableName.addColumn("id");
        tableName.addColumn("House");
        tableName.addColumn("Words");
        tableName.addColumn("Crest");

        TableRow newRow = tableName.addRow();

        newRow.setInt("id", tableName.lastRowIndex());
        newRow.setString("House", "Stark");
        newRow.setString("Words", "Winter Is Coming");
        newRow.setString("Crest", "Direwolf");

        //saveTable(tableName, "data/new.csv");
        //Above line saves the table to a file.
    }
}
