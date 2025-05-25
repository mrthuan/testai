package lib.zj.office.fc.hssf.model;

import a6.h;
import androidx.activity.f;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hssf.formula.ptg.ErrPtg;
import lib.zj.office.fc.hssf.formula.ptg.NameXPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.record.CRNCountRecord;
import lib.zj.office.fc.hssf.record.CRNRecord;
import lib.zj.office.fc.hssf.record.CountryRecord;
import lib.zj.office.fc.hssf.record.ExternSheetRecord;
import lib.zj.office.fc.hssf.record.ExternalNameRecord;
import lib.zj.office.fc.hssf.record.NameCommentRecord;
import lib.zj.office.fc.hssf.record.NameRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.SupBookRecord;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LinkTable {
    private final List<NameRecord> _definedNames;
    private final ExternSheetRecord _externSheetRecord;
    private ExternalBookBlock[] _externalBookBlocks;
    private final int _recordCount;
    private final WorkbookRecordList _workbookRecordList;

    /* loaded from: classes3.dex */
    public static final class CRNBlock {
        private final CRNCountRecord _countRecord;
        private final CRNRecord[] _crns;

        public CRNBlock(RecordStream recordStream) {
            CRNCountRecord cRNCountRecord = (CRNCountRecord) recordStream.getNext();
            this._countRecord = cRNCountRecord;
            int numberOfCRNs = cRNCountRecord.getNumberOfCRNs();
            CRNRecord[] cRNRecordArr = new CRNRecord[numberOfCRNs];
            for (int i10 = 0; i10 < numberOfCRNs; i10++) {
                cRNRecordArr[i10] = (CRNRecord) recordStream.getNext();
            }
            this._crns = cRNRecordArr;
        }

        public CRNRecord[] getCrns() {
            return (CRNRecord[]) this._crns.clone();
        }
    }

    public LinkTable(List list, int i10, WorkbookRecordList workbookRecordList, Map<String, NameCommentRecord> map) {
        this._workbookRecordList = workbookRecordList;
        RecordStream recordStream = new RecordStream(list, i10);
        ArrayList arrayList = new ArrayList();
        while (recordStream.peekNextClass() == SupBookRecord.class) {
            arrayList.add(new ExternalBookBlock(recordStream));
        }
        ExternalBookBlock[] externalBookBlockArr = new ExternalBookBlock[arrayList.size()];
        this._externalBookBlocks = externalBookBlockArr;
        arrayList.toArray(externalBookBlockArr);
        arrayList.clear();
        if (this._externalBookBlocks.length > 0) {
            if (recordStream.peekNextClass() != ExternSheetRecord.class) {
                this._externSheetRecord = null;
            } else {
                this._externSheetRecord = readExtSheetRecord(recordStream);
            }
        } else {
            this._externSheetRecord = null;
        }
        this._definedNames = new ArrayList();
        while (true) {
            Class<? extends Record> peekNextClass = recordStream.peekNextClass();
            if (peekNextClass == NameRecord.class) {
                this._definedNames.add((NameRecord) recordStream.getNext());
            } else if (peekNextClass == NameCommentRecord.class) {
                NameCommentRecord nameCommentRecord = (NameCommentRecord) recordStream.getNext();
                map.put(nameCommentRecord.getNameText(), nameCommentRecord);
            } else {
                int countRead = recordStream.getCountRead();
                this._recordCount = countRead;
                this._workbookRecordList.getRecords().addAll(list.subList(i10, countRead + i10));
                return;
            }
        }
    }

    private int findFirstRecordLocBySid(short s4) {
        Iterator<Record> it = this._workbookRecordList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().getSid() == s4) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private int findRefIndexFromExtBookIndex(int i10) {
        return this._externSheetRecord.findRefIndexFromExtBookIndex(i10);
    }

    private static int getSheetIndex(String[] strArr, String str) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals(str)) {
                return i10;
            }
        }
        throw new RuntimeException(h.d("External workbook does not contain sheet '", str, OperatorName.SHOW_TEXT_LINE));
    }

    private static boolean isDuplicatedNames(NameRecord nameRecord, NameRecord nameRecord2) {
        if (nameRecord2.getNameText().equalsIgnoreCase(nameRecord.getNameText()) && isSameSheetNames(nameRecord, nameRecord2)) {
            return true;
        }
        return false;
    }

    private static boolean isSameSheetNames(NameRecord nameRecord, NameRecord nameRecord2) {
        if (nameRecord2.getSheetNumber() == nameRecord.getSheetNumber()) {
            return true;
        }
        return false;
    }

    private static ExternSheetRecord readExtSheetRecord(RecordStream recordStream) {
        ArrayList arrayList = new ArrayList(2);
        while (recordStream.peekNextClass() == ExternSheetRecord.class) {
            arrayList.add((ExternSheetRecord) recordStream.getNext());
        }
        int size = arrayList.size();
        if (size >= 1) {
            if (size == 1) {
                return (ExternSheetRecord) arrayList.get(0);
            }
            ExternSheetRecord[] externSheetRecordArr = new ExternSheetRecord[size];
            arrayList.toArray(externSheetRecordArr);
            return ExternSheetRecord.combine(externSheetRecordArr);
        }
        throw new RuntimeException("Expected an EXTERNSHEET record but got (" + recordStream.peekNextClass().getName() + ")");
    }

    public void addName(NameRecord nameRecord) {
        this._definedNames.add(nameRecord);
        int findFirstRecordLocBySid = findFirstRecordLocBySid((short) 23);
        if (findFirstRecordLocBySid == -1) {
            findFirstRecordLocBySid = findFirstRecordLocBySid(SupBookRecord.sid);
        }
        if (findFirstRecordLocBySid == -1) {
            findFirstRecordLocBySid = findFirstRecordLocBySid(CountryRecord.sid);
        }
        this._workbookRecordList.add(findFirstRecordLocBySid + this._definedNames.size(), nameRecord);
    }

    public NameXPtg addNameXPtg(String str) {
        ExternalBookBlock externalBookBlock;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ExternalBookBlock[] externalBookBlockArr = this._externalBookBlocks;
            if (i11 < externalBookBlockArr.length) {
                if (externalBookBlockArr[i11].getExternalBookRecord().isAddInFunctions()) {
                    externalBookBlock = this._externalBookBlocks[i11];
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                externalBookBlock = null;
                break;
            }
        }
        if (externalBookBlock == null) {
            externalBookBlock = new ExternalBookBlock();
            ExternalBookBlock[] externalBookBlockArr2 = this._externalBookBlocks;
            int length = externalBookBlockArr2.length + 1;
            ExternalBookBlock[] externalBookBlockArr3 = new ExternalBookBlock[length];
            System.arraycopy(externalBookBlockArr2, 0, externalBookBlockArr3, 0, externalBookBlockArr2.length);
            externalBookBlockArr3[length - 1] = externalBookBlock;
            this._externalBookBlocks = externalBookBlockArr3;
            i11 = externalBookBlockArr3.length - 1;
            this._workbookRecordList.add(findFirstRecordLocBySid((short) 23), externalBookBlock.getExternalBookRecord());
            this._externSheetRecord.addRef(this._externalBookBlocks.length - 1, -2, -2);
        }
        ExternalNameRecord externalNameRecord = new ExternalNameRecord();
        externalNameRecord.setText(str);
        externalNameRecord.setParsedExpression(new Ptg[]{ErrPtg.REF_INVALID});
        int addExternalName = externalBookBlock.addExternalName(externalNameRecord);
        Iterator<Record> it = this._workbookRecordList.iterator();
        while (it.hasNext()) {
            Record next = it.next();
            if ((next instanceof SupBookRecord) && ((SupBookRecord) next).isAddInFunctions()) {
                break;
            }
            i10++;
        }
        this._workbookRecordList.add(i10 + externalBookBlock.getNumberOfNames(), externalNameRecord);
        return new NameXPtg(this._externSheetRecord.getRefIxForSheet(i11, -2), addExternalName);
    }

    public int checkExternSheet(int i10) {
        int i11 = 0;
        while (true) {
            ExternalBookBlock[] externalBookBlockArr = this._externalBookBlocks;
            if (i11 < externalBookBlockArr.length) {
                if (externalBookBlockArr[i11].getExternalBookRecord().isInternalReferences()) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            int refIxForSheet = this._externSheetRecord.getRefIxForSheet(i11, i10);
            if (refIxForSheet >= 0) {
                return refIxForSheet;
            }
            return this._externSheetRecord.addRef(i11, i10, i10);
        }
        throw new RuntimeException("Could not find 'internal references' EXTERNALBOOK");
    }

    public String[] getExternalBookAndSheetName(int i10) {
        SupBookRecord externalBookRecord = this._externalBookBlocks[this._externSheetRecord.getExtbookIndexFromRefIndex(i10)].getExternalBookRecord();
        String str = null;
        if (!externalBookRecord.isExternalReferences()) {
            return null;
        }
        int firstSheetIndexFromRefIndex = this._externSheetRecord.getFirstSheetIndexFromRefIndex(i10);
        if (firstSheetIndexFromRefIndex >= 0) {
            str = externalBookRecord.getSheetNames()[firstSheetIndexFromRefIndex];
        }
        return new String[]{externalBookRecord.getURL(), str};
    }

    public int getExternalSheetIndex(String str, String str2) {
        SupBookRecord supBookRecord;
        int i10 = 0;
        while (true) {
            ExternalBookBlock[] externalBookBlockArr = this._externalBookBlocks;
            if (i10 < externalBookBlockArr.length) {
                supBookRecord = externalBookBlockArr[i10].getExternalBookRecord();
                if (supBookRecord.isExternalReferences() && str.equals(supBookRecord.getURL())) {
                    break;
                }
                i10++;
            } else {
                supBookRecord = null;
                i10 = -1;
                break;
            }
        }
        if (supBookRecord != null) {
            int sheetIndex = getSheetIndex(supBookRecord.getSheetNames(), str2);
            int refIxForSheet = this._externSheetRecord.getRefIxForSheet(i10, sheetIndex);
            if (refIxForSheet >= 0) {
                return refIxForSheet;
            }
            throw new RuntimeException(f.k("ExternSheetRecord does not contain combination (", i10, ", ", sheetIndex, ")"));
        }
        throw new RuntimeException(h.d("No external workbook with name '", str, OperatorName.SHOW_TEXT_LINE));
    }

    public int getIndexToInternalSheet(int i10) {
        return this._externSheetRecord.getFirstSheetIndexFromRefIndex(i10);
    }

    public NameRecord getNameRecord(int i10) {
        return this._definedNames.get(i10);
    }

    public NameXPtg getNameXPtg(String str) {
        int findRefIndexFromExtBookIndex;
        int i10 = 0;
        while (true) {
            ExternalBookBlock[] externalBookBlockArr = this._externalBookBlocks;
            if (i10 < externalBookBlockArr.length) {
                int indexOfName = externalBookBlockArr[i10].getIndexOfName(str);
                if (indexOfName >= 0 && (findRefIndexFromExtBookIndex = findRefIndexFromExtBookIndex(i10)) >= 0) {
                    return new NameXPtg(findRefIndexFromExtBookIndex, indexOfName);
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public int getNumNames() {
        return this._definedNames.size();
    }

    public int getRecordCount() {
        return this._recordCount;
    }

    public int getSheetIndexFromExternSheetIndex(int i10) {
        if (i10 >= this._externSheetRecord.getNumOfRefs()) {
            return -1;
        }
        return this._externSheetRecord.getFirstSheetIndexFromRefIndex(i10);
    }

    public NameRecord getSpecificBuiltinRecord(byte b10, int i10) {
        for (NameRecord nameRecord : this._definedNames) {
            if (nameRecord.getBuiltInName() == b10 && nameRecord.getSheetNumber() == i10) {
                return nameRecord;
            }
        }
        return null;
    }

    public boolean nameAlreadyExists(NameRecord nameRecord) {
        for (int numNames = getNumNames() - 1; numNames >= 0; numNames--) {
            NameRecord nameRecord2 = getNameRecord(numNames);
            if (nameRecord2 != nameRecord && isDuplicatedNames(nameRecord, nameRecord2)) {
                return true;
            }
        }
        return false;
    }

    public void removeBuiltinRecord(byte b10, int i10) {
        NameRecord specificBuiltinRecord = getSpecificBuiltinRecord(b10, i10);
        if (specificBuiltinRecord != null) {
            this._definedNames.remove(specificBuiltinRecord);
        }
    }

    public void removeName(int i10) {
        this._definedNames.remove(i10);
    }

    public int resolveNameXIx(int i10, int i11) {
        return this._externalBookBlocks[this._externSheetRecord.getExtbookIndexFromRefIndex(i10)].getNameIx(i11);
    }

    public String resolveNameXText(int i10, int i11) {
        return this._externalBookBlocks[this._externSheetRecord.getExtbookIndexFromRefIndex(i10)].getNameText(i11);
    }

    /* loaded from: classes3.dex */
    public static final class ExternalBookBlock {
        private final CRNBlock[] _crnBlocks;
        private final SupBookRecord _externalBookRecord;
        private ExternalNameRecord[] _externalNameRecords;

        public ExternalBookBlock(RecordStream recordStream) {
            this._externalBookRecord = (SupBookRecord) recordStream.getNext();
            ArrayList arrayList = new ArrayList();
            while (recordStream.peekNextClass() == ExternalNameRecord.class) {
                arrayList.add(recordStream.getNext());
            }
            ExternalNameRecord[] externalNameRecordArr = new ExternalNameRecord[arrayList.size()];
            this._externalNameRecords = externalNameRecordArr;
            arrayList.toArray(externalNameRecordArr);
            arrayList.clear();
            while (recordStream.peekNextClass() == CRNCountRecord.class) {
                arrayList.add(new CRNBlock(recordStream));
            }
            CRNBlock[] cRNBlockArr = new CRNBlock[arrayList.size()];
            this._crnBlocks = cRNBlockArr;
            arrayList.toArray(cRNBlockArr);
        }

        public int addExternalName(ExternalNameRecord externalNameRecord) {
            ExternalNameRecord[] externalNameRecordArr = this._externalNameRecords;
            int length = externalNameRecordArr.length + 1;
            ExternalNameRecord[] externalNameRecordArr2 = new ExternalNameRecord[length];
            System.arraycopy(externalNameRecordArr, 0, externalNameRecordArr2, 0, externalNameRecordArr.length);
            externalNameRecordArr2[length - 1] = externalNameRecord;
            this._externalNameRecords = externalNameRecordArr2;
            return externalNameRecordArr2.length - 1;
        }

        public SupBookRecord getExternalBookRecord() {
            return this._externalBookRecord;
        }

        public int getIndexOfName(String str) {
            int i10 = 0;
            while (true) {
                ExternalNameRecord[] externalNameRecordArr = this._externalNameRecords;
                if (i10 < externalNameRecordArr.length) {
                    if (externalNameRecordArr[i10].getText().equalsIgnoreCase(str)) {
                        return i10;
                    }
                    i10++;
                } else {
                    return -1;
                }
            }
        }

        public int getNameIx(int i10) {
            return this._externalNameRecords[i10].getIx();
        }

        public String getNameText(int i10) {
            return this._externalNameRecords[i10].getText();
        }

        public int getNumberOfNames() {
            return this._externalNameRecords.length;
        }

        public ExternalBookBlock(int i10) {
            this._externalBookRecord = SupBookRecord.createInternalReferences((short) i10);
            this._externalNameRecords = new ExternalNameRecord[0];
            this._crnBlocks = new CRNBlock[0];
        }

        public ExternalBookBlock() {
            this._externalBookRecord = SupBookRecord.createAddInFunctions();
            this._externalNameRecords = new ExternalNameRecord[0];
            this._crnBlocks = new CRNBlock[0];
        }
    }

    public LinkTable(int i10, WorkbookRecordList workbookRecordList) {
        this._workbookRecordList = workbookRecordList;
        this._definedNames = new ArrayList();
        this._externalBookBlocks = new ExternalBookBlock[]{new ExternalBookBlock(i10)};
        ExternSheetRecord externSheetRecord = new ExternSheetRecord();
        this._externSheetRecord = externSheetRecord;
        this._recordCount = 2;
        Record externalBookRecord = this._externalBookBlocks[0].getExternalBookRecord();
        int findFirstRecordLocBySid = findFirstRecordLocBySid(CountryRecord.sid);
        if (findFirstRecordLocBySid >= 0) {
            int i11 = findFirstRecordLocBySid + 1;
            workbookRecordList.add(i11, externSheetRecord);
            workbookRecordList.add(i11, externalBookRecord);
            return;
        }
        throw new RuntimeException("CountryRecord not found");
    }
}
