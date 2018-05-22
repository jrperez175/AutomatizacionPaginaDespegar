package co.com.bancolombia.certificacion.despegartest.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import org.apache.poi.xssf.usermodel.*;
public class TrabajarConExcel {
	File src;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFCellStyle style;
	Font font;
	XSSFSheet sh1;
	
	public TrabajarConExcel (String rutaExcel){
		try {
			
			src = new File(rutaExcel); // Se define la ruta del archivo el cual se desea crear o escribir 
			fis = new FileInputStream(src);	//Instancia ela archivo de trabajo		
			wb = new XSSFWorkbook(fis); //Instancia una libro
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void Estilo (int sheet, int row, int cell) throws IOException {
		sh1 = wb.getSheetAt(sheet);
		style = wb.createCellStyle();
		font = wb.createFont();
		//style.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		style.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		font.setColor(IndexedColors.RED.getIndex());
        style.setFont(font);
		
		sh1.getRow(row).getCell(cell).setCellStyle(style);
		
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		fout.close();
		
	}
	
	public String leerExcel (int sheet, int row, int cell) {

			// Obtiene la hoja que se desea crear o modificar

			sh1 = wb.getSheetAt(sheet);

			// Obtiene el valor de la fila y celda deseada

			//wb.close();
			
			return sh1.getRow(row).getCell(cell).getStringCellValue();
						
			
	}
			
	
	public void escribirExcel (int sheet, int row, int cell, String value) throws IOException {
		
			sh1 = wb.getSheetAt(sheet);
			
			if (sh1.getRow(row)==null){
				sh1.createRow(row).createCell(cell).setCellValue(value);
			}else {
				sh1.getRow(row).createCell(cell).setCellValue(value);
			}
		

			// Especifico el archivo a guardar 

			FileOutputStream fout = new FileOutputStream(src);

			// Escribo

			wb.write(fout);

			// Cierro el archivo

			fout.close();

		} 
}

