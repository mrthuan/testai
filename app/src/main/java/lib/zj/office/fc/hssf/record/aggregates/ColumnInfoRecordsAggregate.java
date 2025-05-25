package lib.zj.office.fc.hssf.record.aggregates;

import androidx.appcompat.view.menu.d;
import b.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lib.zj.office.fc.hssf.model.RecordStream;
import lib.zj.office.fc.hssf.record.ColumnInfoRecord;
import lib.zj.office.fc.hssf.record.aggregates.RecordAggregate;

/* loaded from: classes3.dex */
public final class ColumnInfoRecordsAggregate extends RecordAggregate {
    private final List records;

    /* loaded from: classes3.dex */
    public static final class CIRComparator implements Comparator {
        public static final Comparator instance = new CIRComparator();

        private CIRComparator() {
        }

        public static int compareColInfos(ColumnInfoRecord columnInfoRecord, ColumnInfoRecord columnInfoRecord2) {
            return columnInfoRecord.getFirstColumn() - columnInfoRecord2.getFirstColumn();
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return compareColInfos((ColumnInfoRecord) obj, (ColumnInfoRecord) obj2);
        }
    }

    public ColumnInfoRecordsAggregate() {
        this.records = new ArrayList();
    }

    private void attemptMergeColInfoRecords(int i10) {
        int size = this.records.size();
        if (i10 >= 0 && i10 < size) {
            ColumnInfoRecord colInfo = getColInfo(i10);
            int i11 = i10 + 1;
            if (i11 < size && mergeColInfoRecords(colInfo, getColInfo(i11))) {
                this.records.remove(i11);
            }
            if (i10 > 0 && mergeColInfoRecords(getColInfo(i10 - 1), colInfo)) {
                this.records.remove(i10);
                return;
            }
            return;
        }
        StringBuilder e10 = d.e("colInfoIx ", i10, " is out of range (0..");
        e10.append(size - 1);
        e10.append(")");
        throw new IllegalArgumentException(e10.toString());
    }

    private static ColumnInfoRecord copyColInfo(ColumnInfoRecord columnInfoRecord) {
        return (ColumnInfoRecord) columnInfoRecord.clone();
    }

    private int findColInfoIdx(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                while (i11 < this.records.size()) {
                    ColumnInfoRecord colInfo = getColInfo(i11);
                    if (colInfo.containsColumn(i10)) {
                        return i11;
                    }
                    if (colInfo.getFirstColumn() <= i10) {
                        i11++;
                    } else {
                        return -1;
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(a.c("fromIdx parameter out of range: ", i11));
        }
        throw new IllegalArgumentException(a.c("column parameter out of range: ", i10));
    }

    private int findEndOfColumnOutlineGroup(int i10) {
        ColumnInfoRecord columnInfoRecord = (ColumnInfoRecord) this.records.get(i10);
        int outlineLevel = columnInfoRecord.getOutlineLevel();
        while (i10 < this.records.size() - 1) {
            int i11 = i10 + 1;
            ColumnInfoRecord columnInfoRecord2 = (ColumnInfoRecord) this.records.get(i11);
            if (!columnInfoRecord.isAdjacentBefore(columnInfoRecord2) || columnInfoRecord2.getOutlineLevel() < outlineLevel) {
                break;
            }
            columnInfoRecord = columnInfoRecord2;
            i10 = i11;
        }
        return i10;
    }

    private int findStartOfColumnOutlineGroup(int i10) {
        ColumnInfoRecord columnInfoRecord = (ColumnInfoRecord) this.records.get(i10);
        int outlineLevel = columnInfoRecord.getOutlineLevel();
        while (i10 != 0) {
            ColumnInfoRecord columnInfoRecord2 = (ColumnInfoRecord) this.records.get(i10 - 1);
            if (!columnInfoRecord2.isAdjacentBefore(columnInfoRecord) || columnInfoRecord2.getOutlineLevel() < outlineLevel) {
                break;
            }
            i10--;
            columnInfoRecord = columnInfoRecord2;
        }
        return i10;
    }

    private boolean isColumnGroupCollapsed(int i10) {
        int findEndOfColumnOutlineGroup = findEndOfColumnOutlineGroup(i10);
        int i11 = findEndOfColumnOutlineGroup + 1;
        if (i11 >= this.records.size()) {
            return false;
        }
        ColumnInfoRecord colInfo = getColInfo(i11);
        if (!getColInfo(findEndOfColumnOutlineGroup).isAdjacentBefore(colInfo)) {
            return false;
        }
        return colInfo.getCollapsed();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isColumnGroupHiddenByParent(int r5) {
        /*
            r4 = this;
            int r0 = r4.findEndOfColumnOutlineGroup(r5)
            java.util.List r1 = r4.records
            int r1 = r1.size()
            r2 = 0
            if (r0 >= r1) goto L26
            int r1 = r0 + 1
            lib.zj.office.fc.hssf.record.ColumnInfoRecord r1 = r4.getColInfo(r1)
            lib.zj.office.fc.hssf.record.ColumnInfoRecord r0 = r4.getColInfo(r0)
            boolean r0 = r0.isAdjacentBefore(r1)
            if (r0 == 0) goto L26
            int r0 = r1.getOutlineLevel()
            boolean r1 = r1.getHidden()
            goto L28
        L26:
            r0 = r2
            r1 = r0
        L28:
            int r5 = r4.findStartOfColumnOutlineGroup(r5)
            if (r5 <= 0) goto L47
            int r3 = r5 + (-1)
            lib.zj.office.fc.hssf.record.ColumnInfoRecord r3 = r4.getColInfo(r3)
            lib.zj.office.fc.hssf.record.ColumnInfoRecord r5 = r4.getColInfo(r5)
            boolean r5 = r3.isAdjacentBefore(r5)
            if (r5 == 0) goto L47
            int r2 = r3.getOutlineLevel()
            boolean r5 = r3.getHidden()
            goto L48
        L47:
            r5 = r2
        L48:
            if (r0 <= r2) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hssf.record.aggregates.ColumnInfoRecordsAggregate.isColumnGroupHiddenByParent(int):boolean");
    }

    private static boolean mergeColInfoRecords(ColumnInfoRecord columnInfoRecord, ColumnInfoRecord columnInfoRecord2) {
        if (columnInfoRecord.isAdjacentBefore(columnInfoRecord2) && columnInfoRecord.formatMatches(columnInfoRecord2)) {
            columnInfoRecord.setLastColumn(columnInfoRecord2.getLastColumn());
            return true;
        }
        return false;
    }

    private static void setColumnInfoFields(ColumnInfoRecord columnInfoRecord, Short sh2, Integer num, Integer num2, Boolean bool, Boolean bool2) {
        if (sh2 != null) {
            columnInfoRecord.setXFIndex(sh2.shortValue());
        }
        if (num != null) {
            columnInfoRecord.setColumnWidth(num.intValue());
        }
        if (num2 != null) {
            columnInfoRecord.setOutlineLevel(num2.shortValue());
        }
        if (bool != null) {
            columnInfoRecord.setHidden(bool.booleanValue());
        }
        if (bool2 != null) {
            columnInfoRecord.setCollapsed(bool2.booleanValue());
        }
    }

    private int setGroupHidden(int i10, int i11, boolean z10) {
        ColumnInfoRecord colInfo = getColInfo(i10);
        while (i10 < this.records.size()) {
            colInfo.setHidden(z10);
            i10++;
            if (i10 < this.records.size()) {
                ColumnInfoRecord colInfo2 = getColInfo(i10);
                if (!colInfo.isAdjacentBefore(colInfo2) || colInfo2.getOutlineLevel() < i11) {
                    break;
                }
                colInfo = colInfo2;
            }
        }
        return colInfo.getLastColumn();
    }

    public Object clone() {
        ColumnInfoRecordsAggregate columnInfoRecordsAggregate = new ColumnInfoRecordsAggregate();
        for (int i10 = 0; i10 < this.records.size(); i10++) {
            columnInfoRecordsAggregate.records.add(((ColumnInfoRecord) this.records.get(i10)).clone());
        }
        return columnInfoRecordsAggregate;
    }

    public void collapseColumn(int i10) {
        int findColInfoIdx = findColInfoIdx(i10, 0);
        if (findColInfoIdx == -1) {
            return;
        }
        int findStartOfColumnOutlineGroup = findStartOfColumnOutlineGroup(findColInfoIdx);
        setColumn(setGroupHidden(findStartOfColumnOutlineGroup, getColInfo(findStartOfColumnOutlineGroup).getOutlineLevel(), true) + 1, null, null, null, null, Boolean.TRUE);
    }

    public void expandColumn(int i10) {
        int findColInfoIdx = findColInfoIdx(i10, 0);
        if (findColInfoIdx == -1 || !isColumnGroupCollapsed(findColInfoIdx)) {
            return;
        }
        int findEndOfColumnOutlineGroup = findEndOfColumnOutlineGroup(findColInfoIdx);
        ColumnInfoRecord colInfo = getColInfo(findEndOfColumnOutlineGroup);
        if (!isColumnGroupHiddenByParent(findColInfoIdx)) {
            int outlineLevel = colInfo.getOutlineLevel();
            for (int findStartOfColumnOutlineGroup = findStartOfColumnOutlineGroup(findColInfoIdx); findStartOfColumnOutlineGroup <= findEndOfColumnOutlineGroup; findStartOfColumnOutlineGroup++) {
                ColumnInfoRecord colInfo2 = getColInfo(findStartOfColumnOutlineGroup);
                if (outlineLevel == colInfo2.getOutlineLevel()) {
                    colInfo2.setHidden(false);
                }
            }
        }
        setColumn(colInfo.getLastColumn() + 1, null, null, null, null, Boolean.FALSE);
    }

    public ColumnInfoRecord findColumnInfo(int i10) {
        int size = this.records.size();
        for (int i11 = 0; i11 < size; i11++) {
            ColumnInfoRecord colInfo = getColInfo(i11);
            if (colInfo.containsColumn(i10)) {
                return colInfo;
            }
        }
        return null;
    }

    public ColumnInfoRecord getColInfo(int i10) {
        return (ColumnInfoRecord) this.records.get(i10);
    }

    public int getMaxOutlineLevel() {
        int size = this.records.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = Math.max(getColInfo(i11).getOutlineLevel(), i10);
        }
        return i10;
    }

    public int getNumColumns() {
        return this.records.size();
    }

    public void groupColumnRange(int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        while (i10 <= i11) {
            int findColInfoIdx = findColInfoIdx(i10, i15);
            if (findColInfoIdx != -1) {
                int outlineLevel = getColInfo(findColInfoIdx).getOutlineLevel();
                if (z10) {
                    i14 = outlineLevel + 1;
                } else {
                    i14 = outlineLevel - 1;
                }
                i13 = Math.min(7, Math.max(0, i14));
                i12 = Math.max(0, findColInfoIdx - 1);
            } else {
                i12 = i15;
                i13 = 1;
            }
            setColumn(i10, null, null, Integer.valueOf(i13), null, null);
            i10++;
            i15 = i12;
        }
    }

    public void insertColumn(ColumnInfoRecord columnInfoRecord) {
        this.records.add(columnInfoRecord);
        Collections.sort(this.records, CIRComparator.instance);
    }

    public void setColumn(int i10, Short sh2, Integer num, Integer num2, Boolean bool, Boolean bool2) {
        ColumnInfoRecord columnInfoRecord;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        int i11 = 0;
        while (i11 < this.records.size()) {
            columnInfoRecord = (ColumnInfoRecord) this.records.get(i11);
            if (columnInfoRecord.containsColumn(i10)) {
                break;
            } else if (columnInfoRecord.getFirstColumn() > i10) {
                break;
            } else {
                i11++;
            }
        }
        columnInfoRecord = null;
        ColumnInfoRecord columnInfoRecord2 = columnInfoRecord;
        if (columnInfoRecord2 == null) {
            ColumnInfoRecord columnInfoRecord3 = new ColumnInfoRecord();
            columnInfoRecord3.setFirstColumn(i10);
            columnInfoRecord3.setLastColumn(i10);
            setColumnInfoFields(columnInfoRecord3, sh2, num, num2, bool, bool2);
            insertColumn(i11, columnInfoRecord3);
            attemptMergeColInfoRecords(i11);
            return;
        }
        if (sh2 != null && columnInfoRecord2.getXFIndex() != sh2.shortValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (num != null && columnInfoRecord2.getColumnWidth() != num.shortValue()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (num2 != null && columnInfoRecord2.getOutlineLevel() != num2.intValue()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (bool != null && columnInfoRecord2.getHidden() != bool.booleanValue()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (bool2 != null && columnInfoRecord2.getCollapsed() != bool2.booleanValue()) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z10 || z11 || z12 || z13 || z14) {
            z15 = true;
        }
        if (!z15) {
            return;
        }
        if (columnInfoRecord2.getFirstColumn() == i10 && columnInfoRecord2.getLastColumn() == i10) {
            setColumnInfoFields(columnInfoRecord2, sh2, num, num2, bool, bool2);
            attemptMergeColInfoRecords(i11);
        } else if (columnInfoRecord2.getFirstColumn() != i10 && columnInfoRecord2.getLastColumn() != i10) {
            ColumnInfoRecord copyColInfo = copyColInfo(columnInfoRecord2);
            ColumnInfoRecord copyColInfo2 = copyColInfo(columnInfoRecord2);
            int lastColumn = columnInfoRecord2.getLastColumn();
            columnInfoRecord2.setLastColumn(i10 - 1);
            copyColInfo.setFirstColumn(i10);
            copyColInfo.setLastColumn(i10);
            setColumnInfoFields(copyColInfo, sh2, num, num2, bool, bool2);
            int i12 = i11 + 1;
            insertColumn(i12, copyColInfo);
            copyColInfo2.setFirstColumn(i10 + 1);
            copyColInfo2.setLastColumn(lastColumn);
            insertColumn(i12 + 1, copyColInfo2);
        } else {
            if (columnInfoRecord2.getFirstColumn() == i10) {
                columnInfoRecord2.setFirstColumn(i10 + 1);
            } else {
                columnInfoRecord2.setLastColumn(i10 - 1);
                i11++;
            }
            ColumnInfoRecord copyColInfo3 = copyColInfo(columnInfoRecord2);
            copyColInfo3.setFirstColumn(i10);
            copyColInfo3.setLastColumn(i10);
            setColumnInfoFields(copyColInfo3, sh2, num, num2, bool, bool2);
            insertColumn(i11, copyColInfo3);
            attemptMergeColInfoRecords(i11);
        }
    }

    @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate
    public void visitContainedRecords(RecordAggregate.RecordVisitor recordVisitor) {
        int size = this.records.size();
        if (size < 1) {
            return;
        }
        ColumnInfoRecord columnInfoRecord = null;
        int i10 = 0;
        while (i10 < size) {
            ColumnInfoRecord columnInfoRecord2 = (ColumnInfoRecord) this.records.get(i10);
            recordVisitor.visitRecord(columnInfoRecord2);
            if (columnInfoRecord != null && CIRComparator.compareColInfos(columnInfoRecord, columnInfoRecord2) > 0) {
                throw new RuntimeException("Column info records are out of order");
            }
            i10++;
            columnInfoRecord = columnInfoRecord2;
        }
    }

    public ColumnInfoRecordsAggregate(RecordStream recordStream) {
        this();
        ColumnInfoRecord columnInfoRecord = null;
        boolean z10 = true;
        while (recordStream.peekNextClass() == ColumnInfoRecord.class) {
            ColumnInfoRecord columnInfoRecord2 = (ColumnInfoRecord) recordStream.getNext();
            this.records.add(columnInfoRecord2);
            if (columnInfoRecord != null && CIRComparator.compareColInfos(columnInfoRecord, columnInfoRecord2) > 0) {
                z10 = false;
            }
            columnInfoRecord = columnInfoRecord2;
        }
        if (this.records.size() < 1) {
            throw new RuntimeException("No column info records found");
        }
        if (z10) {
            return;
        }
        Collections.sort(this.records, CIRComparator.instance);
    }

    private void insertColumn(int i10, ColumnInfoRecord columnInfoRecord) {
        this.records.add(i10, columnInfoRecord);
    }
}
