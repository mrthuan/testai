package lib.zj.office.fc.hssf.model;

import java.util.List;
import lib.zj.office.fc.hssf.record.DimensionsRecord;
import lib.zj.office.fc.hssf.record.EOFRecord;
import lib.zj.office.fc.hssf.record.GutsRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RecordBase;
import lib.zj.office.fc.hssf.record.aggregates.ColumnInfoRecordsAggregate;
import lib.zj.office.fc.hssf.record.aggregates.ConditionalFormattingTable;
import lib.zj.office.fc.hssf.record.aggregates.DataValidityTable;
import lib.zj.office.fc.hssf.record.aggregates.MergedCellsTable;
import lib.zj.office.fc.hssf.record.aggregates.PageSettingsBlock;
import lib.zj.office.fc.hssf.record.aggregates.WorksheetProtectionBlock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RecordOrderer {
    private RecordOrderer() {
    }

    public static void addNewSheetRecord(List<RecordBase> list, RecordBase recordBase) {
        list.add(findSheetInsertPos(list, recordBase.getClass()), recordBase);
    }

    private static int findDataValidationTableInsertPos(List<RecordBase> list) {
        Record record;
        Record record2;
        int size = list.size() - 1;
        if (list.get(size) instanceof EOFRecord) {
            while (size > 0) {
                size--;
                RecordBase recordBase = list.get(size);
                if (isDVTPriorRecord(recordBase)) {
                    int i10 = size + 1;
                    if (isDVTSubsequentRecord(((Record) list.get(i10)).getSid())) {
                        return i10;
                    }
                    throw new IllegalStateException("Unexpected (" + record.getClass().getName() + ") found after (" + recordBase.getClass().getName() + ")");
                }
                if (!isDVTSubsequentRecord(((Record) recordBase).getSid())) {
                    throw new IllegalStateException("Unexpected (" + record2.getClass().getName() + ") while looking for DV Table insert pos");
                }
            }
            return 0;
        }
        throw new IllegalStateException("Last sheet record should be EOFRecord");
    }

    private static int findInsertPosForNewCondFormatTable(List<RecordBase> list) {
        short sid;
        for (int size = list.size() - 2; size >= 0; size--) {
            RecordBase recordBase = list.get(size);
            if (recordBase instanceof MergedCellsTable) {
                return size + 1;
            }
            if (!(recordBase instanceof DataValidityTable) && ((sid = ((Record) recordBase).getSid()) == 29 || sid == 65 || sid == 153 || sid == 160 || sid == 239 || sid == 351 || sid == 574)) {
                return size + 1;
            }
        }
        throw new RuntimeException("Did not find Window2 record");
    }

    private static int findInsertPosForNewMergedRecordTable(List<RecordBase> list) {
        short sid;
        for (int size = list.size() - 2; size >= 0; size--) {
            RecordBase recordBase = list.get(size);
            if ((recordBase instanceof Record) && ((sid = ((Record) recordBase).getSid()) == 29 || sid == 65 || sid == 153 || sid == 160 || sid == 574)) {
                return size + 1;
            }
        }
        throw new RuntimeException("Did not find Window2 record");
    }

    private static int findSheetInsertPos(List<RecordBase> list, Class<? extends RecordBase> cls) {
        if (cls == DataValidityTable.class) {
            return findDataValidationTableInsertPos(list);
        }
        if (cls == MergedCellsTable.class) {
            return findInsertPosForNewMergedRecordTable(list);
        }
        if (cls == ConditionalFormattingTable.class) {
            return findInsertPosForNewCondFormatTable(list);
        }
        if (cls == GutsRecord.class) {
            return getGutsRecordInsertPos(list);
        }
        if (cls == PageSettingsBlock.class) {
            return getPageBreakRecordInsertPos(list);
        }
        if (cls == WorksheetProtectionBlock.class) {
            return getWorksheetProtectionBlockInsertPos(list);
        }
        throw new RuntimeException("Unexpected record class (" + cls.getName() + ")");
    }

    private static int getDimensionsIndex(List<RecordBase> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10) instanceof DimensionsRecord) {
                return i10;
            }
        }
        throw new RuntimeException("DimensionsRecord not found");
    }

    private static int getGutsRecordInsertPos(List<RecordBase> list) {
        int dimensionsIndex = getDimensionsIndex(list) - 1;
        while (dimensionsIndex > 0) {
            dimensionsIndex--;
            if (isGutsPriorRecord(list.get(dimensionsIndex))) {
                return dimensionsIndex + 1;
            }
        }
        throw new RuntimeException("Did not find insert point for GUTS");
    }

    private static int getPageBreakRecordInsertPos(List<RecordBase> list) {
        int dimensionsIndex = getDimensionsIndex(list) - 1;
        while (dimensionsIndex > 0) {
            dimensionsIndex--;
            if (isPageBreakPriorRecord(list.get(dimensionsIndex))) {
                return dimensionsIndex + 1;
            }
        }
        throw new RuntimeException("Did not find insert point for GUTS");
    }

    private static int getWorksheetProtectionBlockInsertPos(List<RecordBase> list) {
        int dimensionsIndex = getDimensionsIndex(list);
        while (dimensionsIndex > 0) {
            dimensionsIndex--;
            if (!isProtectionSubsequentRecord(list.get(dimensionsIndex))) {
                return dimensionsIndex + 1;
            }
        }
        throw new IllegalStateException("did not find insert pos for protection block");
    }

    private static boolean isDVTPriorRecord(RecordBase recordBase) {
        short sid;
        if ((recordBase instanceof MergedCellsTable) || (recordBase instanceof ConditionalFormattingTable) || (sid = ((Record) recordBase).getSid()) == 29 || sid == 65 || sid == 153 || sid == 160 || sid == 239 || sid == 351 || sid == 440 || sid == 442 || sid == 574 || sid == 2048) {
            return true;
        }
        return false;
    }

    private static boolean isDVTSubsequentRecord(short s4) {
        if (s4 != 10 && s4 != 2146 && s4 != 2151 && s4 != 2152) {
            return false;
        }
        return true;
    }

    public static boolean isEndOfRowBlock(int i10) {
        if (i10 != 10) {
            if (i10 == 61 || i10 == 93 || i10 == 128 || i10 == 176 || i10 == 434 || i10 == 438 || i10 == 574 || i10 == 236 || i10 == 237) {
                return true;
            }
            return PageSettingsBlock.isComponentRecord(i10);
        }
        throw new RuntimeException("Found EOFRecord before WindowTwoRecord was encountered");
    }

    private static boolean isGutsPriorRecord(RecordBase recordBase) {
        if (recordBase instanceof Record) {
            short sid = ((Record) recordBase).getSid();
            if (sid == 34 || sid == 130 || sid == 523 || sid == 2057 || sid == 42 || sid == 43 || sid == 94 || sid == 95) {
                return true;
            }
            switch (sid) {
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }

    private static boolean isPageBreakPriorRecord(Object obj) {
        if (obj instanceof Record) {
            short sid = ((Record) obj).getSid();
            if (sid == 34 || sid == 523 || sid == 549 || sid == 2057 || sid == 42 || sid == 43 || sid == 94 || sid == 95 || sid == 129 || sid == 130) {
                return true;
            }
            switch (sid) {
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }

    private static boolean isProtectionSubsequentRecord(Object obj) {
        if (obj instanceof ColumnInfoRecordsAggregate) {
            return true;
        }
        if (obj instanceof Record) {
            short sid = ((Record) obj).getSid();
            if (sid == 85 || sid == 144) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isRowBlockRecord(int i10) {
        if (i10 == 6 || i10 == 253 || i10 == 513 || i10 == 520 || i10 == 545 || i10 == 566 || i10 == 638 || i10 == 1212) {
            return true;
        }
        switch (i10) {
            case 515:
            case 516:
            case 517:
                return true;
            default:
                return false;
        }
    }
}
