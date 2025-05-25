package lib.zj.office.fc.xls;

import di.a;
import di.e;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.model.InternalSheet;
import lib.zj.office.fc.hssf.model.InternalWorkbook;
import lib.zj.office.fc.hssf.model.RecordStream;
import lib.zj.office.fc.hssf.record.BoolErrRecord;
import lib.zj.office.fc.hssf.record.CellValueRecordInterface;
import lib.zj.office.fc.hssf.record.NumberRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RecordFactory;
import lib.zj.office.fc.poifs.filesystem.DirectoryNode;
import lib.zj.office.fc.poifs.filesystem.POIFSFileSystem;
import lib.zj.office.system.AbortReaderError;
import lib.zj.office.system.f;

/* loaded from: classes3.dex */
public class XLSReader extends SSReader {
    private String filePath;

    public XLSReader(f fVar, String str) {
        this.control = fVar;
        this.filePath = str;
    }

    private void checkAbortReader() {
        if (!this.abortReader) {
            return;
        }
        throw new AbortReaderError("abort Reader");
    }

    private boolean search_Cell(CellValueRecordInterface cellValueRecordInterface, String str) {
        short l10 = (short) a.l(cellValueRecordInterface);
        if (l10 != 0) {
            if (l10 != 4) {
                if (l10 != 5) {
                    return false;
                }
                return ErrorEval.getText(((BoolErrRecord) cellValueRecordInterface).getErrorValue()).toLowerCase().contains(str);
            }
            return String.valueOf(((BoolErrRecord) cellValueRecordInterface).getBooleanValue()).toLowerCase().contains(str);
        }
        return String.valueOf(((NumberRecord) cellValueRecordInterface).getValue()).contains(str);
    }

    private boolean search_Sheet(InternalSheet internalSheet, String str) {
        Iterator<CellValueRecordInterface> cellValueIterator = internalSheet.getCellValueIterator();
        while (cellValueIterator.hasNext()) {
            checkAbortReader();
            if (search_Cell(cellValueIterator.next(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public void dispose() {
        super.dispose();
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public Object getModel() {
        return new e(new FileInputStream(this.filePath), this);
    }

    @Override // lib.zj.office.system.b
    public boolean searchContent(File file, String str) {
        try {
            String lowerCase = str.toLowerCase();
            DirectoryNode root = new POIFSFileSystem(new FileInputStream(file.getAbsolutePath())).getRoot();
            List<Record> createRecords = RecordFactory.createRecords(root.createDocumentInputStream(e.v(root)), this);
            InternalWorkbook createWorkbook = InternalWorkbook.createWorkbook(createRecords, this);
            int numSheets = createWorkbook.getNumSheets();
            int i10 = 0;
            while (i10 < numSheets) {
                int i11 = i10 + 1;
                if (createWorkbook.getSheetName(i10).toLowerCase().contains(lowerCase)) {
                    return true;
                }
                i10 = i11;
            }
            int sSTUniqueStringSize = createWorkbook.getSSTUniqueStringSize();
            for (int i12 = 0; i12 < sSTUniqueStringSize; i12++) {
                checkAbortReader();
                if (createWorkbook.getSSTString(i12).getString().toLowerCase().contains(lowerCase)) {
                    return true;
                }
            }
            RecordStream recordStream = new RecordStream(createRecords, createWorkbook.getNumRecords());
            while (recordStream.hasNext()) {
                if (search_Sheet(InternalSheet.createSheet(recordStream, this), lowerCase)) {
                    return true;
                }
            }
            for (int i13 = 0; i13 < createWorkbook.getNumNames(); i13++) {
                if (createWorkbook.getNameRecord(i13).getNameText().toLowerCase().contains(lowerCase)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
