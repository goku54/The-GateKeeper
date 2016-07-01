/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package the.register;

import java.io.File;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author user
 */
public class Excels {
    
    public Excels(){}
    
   void fillData(JTable table, File file) 
   {

        try 
        {

            WritableWorkbook workbook1 = Workbook.createWorkbook(file);
            WritableSheet sheet1 = workbook1.createSheet("First Sheet", 1); 
            TableModel model = table.getModel();

            for (int i = 0; i < model.getColumnCount(); i++) 
            {
                Label column = new Label(i, 0, model.getColumnName(i));
                sheet1.addCell(column);
            }
            int j = 0;
            for (int i = 0; i < model.getRowCount(); i++) 
            {
                for (j = 0; j < model.getColumnCount(); j++) 
                {
                    Label row = new Label(j, i + 1, 
                            model.getValueAt(i, j).toString());
                    sheet1.addCell(row);
                }
            }
            workbook1.write();
            workbook1.close();
        } 
        catch (IOException | WriteException ex) {
        }

   }  // System.out.print("Write to file"+file);
}
