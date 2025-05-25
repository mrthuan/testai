package lib.zj.office.fc.hssf.usermodel;

import java.util.HashSet;
import java.util.Iterator;
import lib.zj.office.fc.hssf.record.ExtendedFormatRecord;
import lib.zj.office.fc.hssf.record.FontRecord;
import lib.zj.office.fc.hssf.record.common.UnicodeString;
import lib.zj.office.fc.ss.usermodel.ICell;
import lib.zj.office.fc.ss.usermodel.IRow;

/* loaded from: classes3.dex */
public class HSSFOptimiser {
    public static void optimiseCellStyles(HSSFWorkbook hSSFWorkbook) {
        int numExFormats = hSSFWorkbook.getWorkbook().getNumExFormats();
        short[] sArr = new short[numExFormats];
        boolean[] zArr = new boolean[numExFormats];
        for (int i10 = 0; i10 < numExFormats; i10++) {
            sArr[i10] = (short) i10;
            zArr[i10] = false;
        }
        ExtendedFormatRecord[] extendedFormatRecordArr = new ExtendedFormatRecord[numExFormats];
        for (int i11 = 0; i11 < numExFormats; i11++) {
            extendedFormatRecordArr[i11] = hSSFWorkbook.getWorkbook().getExFormatAt(i11);
        }
        for (int i12 = 21; i12 < numExFormats; i12++) {
            int i13 = -1;
            for (int i14 = 0; i14 < i12 && i13 == -1; i14++) {
                if (hSSFWorkbook.getWorkbook().getExFormatAt(i14).equals(extendedFormatRecordArr[i12])) {
                    i13 = i14;
                }
            }
            if (i13 != -1) {
                sArr[i12] = (short) i13;
                zArr[i12] = true;
            }
        }
        for (int i15 = 21; i15 < numExFormats; i15++) {
            short s4 = sArr[i15];
            short s10 = s4;
            for (int i16 = 0; i16 < s4; i16++) {
                if (zArr[i16]) {
                    s10 = (short) (s10 - 1);
                }
            }
            sArr[i15] = s10;
        }
        for (int i17 = 21; i17 < numExFormats; i17++) {
            if (zArr[i17]) {
                hSSFWorkbook.getWorkbook().removeExFormatRecord(extendedFormatRecordArr[i17]);
            }
        }
        for (int i18 = 0; i18 < hSSFWorkbook.getNumberOfSheets(); i18++) {
            Iterator<IRow> rowIterator = hSSFWorkbook.getSheetAt(i18).rowIterator();
            while (rowIterator.hasNext()) {
                Iterator<ICell> cellIterator = ((HSSFRow) rowIterator.next()).cellIterator();
                while (cellIterator.hasNext()) {
                    HSSFCell hSSFCell = (HSSFCell) cellIterator.next();
                    hSSFCell.setCellStyle(hSSFWorkbook.getCellStyleAt(sArr[hSSFCell.getCellValueRecord().getXFIndex()]));
                }
            }
        }
    }

    public static void optimiseFonts(HSSFWorkbook hSSFWorkbook) {
        int numberOfFontRecords = hSSFWorkbook.getWorkbook().getNumberOfFontRecords() + 1;
        short[] sArr = new short[numberOfFontRecords];
        boolean[] zArr = new boolean[numberOfFontRecords];
        for (int i10 = 0; i10 < numberOfFontRecords; i10++) {
            sArr[i10] = (short) i10;
            zArr[i10] = false;
        }
        FontRecord[] fontRecordArr = new FontRecord[numberOfFontRecords];
        for (int i11 = 0; i11 < numberOfFontRecords; i11++) {
            if (i11 != 4) {
                fontRecordArr[i11] = hSSFWorkbook.getWorkbook().getFontRecordAt(i11);
            }
        }
        for (int i12 = 5; i12 < numberOfFontRecords; i12++) {
            int i13 = -1;
            for (int i14 = 0; i14 < i12 && i13 == -1; i14++) {
                if (i14 != 4 && hSSFWorkbook.getWorkbook().getFontRecordAt(i14).sameProperties(fontRecordArr[i12])) {
                    i13 = i14;
                }
            }
            if (i13 != -1) {
                sArr[i12] = (short) i13;
                zArr[i12] = true;
            }
        }
        for (int i15 = 5; i15 < numberOfFontRecords; i15++) {
            short s4 = sArr[i15];
            short s10 = s4;
            for (int i16 = 0; i16 < s4; i16++) {
                if (zArr[i16]) {
                    s10 = (short) (s10 - 1);
                }
            }
            sArr[i15] = s10;
        }
        for (int i17 = 5; i17 < numberOfFontRecords; i17++) {
            if (zArr[i17]) {
                hSSFWorkbook.getWorkbook().removeFontRecord(fontRecordArr[i17]);
            }
        }
        hSSFWorkbook.resetFontCache();
        for (int i18 = 0; i18 < hSSFWorkbook.getWorkbook().getNumExFormats(); i18++) {
            ExtendedFormatRecord exFormatAt = hSSFWorkbook.getWorkbook().getExFormatAt(i18);
            exFormatAt.setFontIndex(sArr[exFormatAt.getFontIndex()]);
        }
        HashSet hashSet = new HashSet();
        for (int i19 = 0; i19 < hSSFWorkbook.getNumberOfSheets(); i19++) {
            Iterator<IRow> rowIterator = hSSFWorkbook.getSheetAt(i19).rowIterator();
            while (rowIterator.hasNext()) {
                Iterator<ICell> cellIterator = ((HSSFRow) rowIterator.next()).cellIterator();
                while (cellIterator.hasNext()) {
                    HSSFCell hSSFCell = (HSSFCell) cellIterator.next();
                    if (hSSFCell.getCellType() == 1) {
                        UnicodeString rawUnicodeString = hSSFCell.getRichStringCellValue().getRawUnicodeString();
                        if (!hashSet.contains(rawUnicodeString)) {
                            for (short s11 = 5; s11 < numberOfFontRecords; s11 = (short) (s11 + 1)) {
                                short s12 = sArr[s11];
                                if (s11 != s12) {
                                    rawUnicodeString.swapFontUse(s11, s12);
                                }
                            }
                            hashSet.add(rawUnicodeString);
                        }
                    }
                }
            }
        }
    }
}
