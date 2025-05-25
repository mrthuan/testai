package lib.zj.office.fc.util;

import java.io.FileInputStream;
import lib.zj.office.fc.hssf.usermodel.HSSFWorkbook;
import lib.zj.office.fc.poifs.filesystem.POIFSFileSystem;

/* loaded from: classes3.dex */
public class DrawingDump {
    public static void main(String[] strArr) {
        HSSFWorkbook hSSFWorkbook = new HSSFWorkbook(new POIFSFileSystem(new FileInputStream(strArr[0])));
        System.out.println("Drawing group:");
        hSSFWorkbook.dumpDrawingGroupRecords(true);
        for (int i10 = 1; i10 <= hSSFWorkbook.getNumberOfSheets(); i10++) {
            System.out.println("Sheet " + i10 + ":");
            hSSFWorkbook.getSheetAt(i10 + (-1)).dumpDrawingRecords(true);
        }
    }
}
