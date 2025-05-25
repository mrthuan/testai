package lib.zj.office.fc.hssf.record.aggregates;

import b.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.hssf.model.RecordStream;
import lib.zj.office.fc.hssf.record.BottomMarginRecord;
import lib.zj.office.fc.hssf.record.ContinueRecord;
import lib.zj.office.fc.hssf.record.FooterRecord;
import lib.zj.office.fc.hssf.record.HCenterRecord;
import lib.zj.office.fc.hssf.record.HeaderFooterRecord;
import lib.zj.office.fc.hssf.record.HeaderRecord;
import lib.zj.office.fc.hssf.record.HorizontalPageBreakRecord;
import lib.zj.office.fc.hssf.record.LeftMarginRecord;
import lib.zj.office.fc.hssf.record.Margin;
import lib.zj.office.fc.hssf.record.PageBreakRecord;
import lib.zj.office.fc.hssf.record.PrintSetupRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RecordBase;
import lib.zj.office.fc.hssf.record.RecordFormatException;
import lib.zj.office.fc.hssf.record.RightMarginRecord;
import lib.zj.office.fc.hssf.record.TopMarginRecord;
import lib.zj.office.fc.hssf.record.UserSViewBegin;
import lib.zj.office.fc.hssf.record.VCenterRecord;
import lib.zj.office.fc.hssf.record.VerticalPageBreakRecord;
import lib.zj.office.fc.hssf.record.aggregates.RecordAggregate;

/* loaded from: classes3.dex */
public final class PageSettingsBlock extends RecordAggregate {
    private Record _bitmap;
    private BottomMarginRecord _bottomMargin;
    private PageBreakRecord _columnBreaksRecord;
    private FooterRecord _footer;
    private HCenterRecord _hCenter;
    private HeaderRecord _header;
    private HeaderFooterRecord _headerFooter;
    private LeftMarginRecord _leftMargin;
    private final List<PLSAggregate> _plsRecords;
    private PrintSetupRecord _printSetup;
    private Record _printSize;
    private RightMarginRecord _rightMargin;
    private PageBreakRecord _rowBreaksRecord;
    private List<HeaderFooterRecord> _sviewHeaderFooters;
    private TopMarginRecord _topMargin;
    private VCenterRecord _vCenter;

    /* loaded from: classes3.dex */
    public static final class PLSAggregate extends RecordAggregate {
        private static final ContinueRecord[] EMPTY_CONTINUE_RECORD_ARRAY = new ContinueRecord[0];
        private final Record _pls;
        private ContinueRecord[] _plsContinues;

        public PLSAggregate(RecordStream recordStream) {
            this._pls = recordStream.getNext();
            if (recordStream.peekNextSid() == 60) {
                ArrayList arrayList = new ArrayList();
                while (recordStream.peekNextSid() == 60) {
                    arrayList.add((ContinueRecord) recordStream.getNext());
                }
                ContinueRecord[] continueRecordArr = new ContinueRecord[arrayList.size()];
                this._plsContinues = continueRecordArr;
                arrayList.toArray(continueRecordArr);
                return;
            }
            this._plsContinues = EMPTY_CONTINUE_RECORD_ARRAY;
        }

        @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate
        public void visitContainedRecords(RecordAggregate.RecordVisitor recordVisitor) {
            recordVisitor.visitRecord(this._pls);
            int i10 = 0;
            while (true) {
                ContinueRecord[] continueRecordArr = this._plsContinues;
                if (i10 < continueRecordArr.length) {
                    recordVisitor.visitRecord(continueRecordArr[i10]);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public PageSettingsBlock(RecordStream recordStream) {
        this._sviewHeaderFooters = new ArrayList();
        this._plsRecords = new ArrayList();
        do {
        } while (readARecord(recordStream));
    }

    private void checkNotPresent(Record record) {
        if (record == null) {
            return;
        }
        throw new RecordFormatException("Duplicate PageSettingsBlock record (sid=0x" + Integer.toHexString(record.getSid()) + ")");
    }

    private static HCenterRecord createHCenter() {
        HCenterRecord hCenterRecord = new HCenterRecord();
        hCenterRecord.setHCenter(false);
        return hCenterRecord;
    }

    private static PrintSetupRecord createPrintSetup() {
        PrintSetupRecord printSetupRecord = new PrintSetupRecord();
        printSetupRecord.setPaperSize((short) 1);
        printSetupRecord.setScale((short) 100);
        printSetupRecord.setPageStart((short) 1);
        printSetupRecord.setFitWidth((short) 1);
        printSetupRecord.setFitHeight((short) 1);
        printSetupRecord.setOptions((short) 2);
        printSetupRecord.setHResolution((short) 300);
        printSetupRecord.setVResolution((short) 300);
        printSetupRecord.setHeaderMargin(0.5d);
        printSetupRecord.setFooterMargin(0.5d);
        printSetupRecord.setCopies((short) 1);
        return printSetupRecord;
    }

    private static VCenterRecord createVCenter() {
        VCenterRecord vCenterRecord = new VCenterRecord();
        vCenterRecord.setVCenter(false);
        return vCenterRecord;
    }

    private PageBreakRecord getColumnBreaksRecord() {
        if (this._columnBreaksRecord == null) {
            this._columnBreaksRecord = new VerticalPageBreakRecord();
        }
        return this._columnBreaksRecord;
    }

    private Margin getMarginRec(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return this._bottomMargin;
                    }
                    throw new IllegalArgumentException(a.c("Unknown margin constant:  ", i10));
                }
                return this._topMargin;
            }
            return this._rightMargin;
        }
        return this._leftMargin;
    }

    private PageBreakRecord getRowBreaksRecord() {
        if (this._rowBreaksRecord == null) {
            this._rowBreaksRecord = new HorizontalPageBreakRecord();
        }
        return this._rowBreaksRecord;
    }

    public static boolean isComponentRecord(int i10) {
        if (i10 == 20 || i10 == 21 || i10 == 26 || i10 == 27 || i10 == 51 || i10 == 77 || i10 == 161 || i10 == 233 || i10 == 2204 || i10 == 131 || i10 == 132) {
            return true;
        }
        switch (i10) {
            case 38:
            case 39:
            case 40:
            case 41:
                return true;
            default:
                return false;
        }
    }

    private boolean readARecord(RecordStream recordStream) {
        int peekNextSid = recordStream.peekNextSid();
        if (peekNextSid != 20) {
            if (peekNextSid != 21) {
                if (peekNextSid != 26) {
                    if (peekNextSid != 27) {
                        if (peekNextSid != 51) {
                            if (peekNextSid != 77) {
                                if (peekNextSid != 161) {
                                    if (peekNextSid != 233) {
                                        if (peekNextSid != 2204) {
                                            if (peekNextSid != 131) {
                                                if (peekNextSid != 132) {
                                                    switch (peekNextSid) {
                                                        case 38:
                                                            checkNotPresent(this._leftMargin);
                                                            this._leftMargin = (LeftMarginRecord) recordStream.getNext();
                                                            return true;
                                                        case 39:
                                                            checkNotPresent(this._rightMargin);
                                                            this._rightMargin = (RightMarginRecord) recordStream.getNext();
                                                            return true;
                                                        case 40:
                                                            checkNotPresent(this._topMargin);
                                                            this._topMargin = (TopMarginRecord) recordStream.getNext();
                                                            return true;
                                                        case 41:
                                                            checkNotPresent(this._bottomMargin);
                                                            this._bottomMargin = (BottomMarginRecord) recordStream.getNext();
                                                            return true;
                                                        default:
                                                            return false;
                                                    }
                                                }
                                                checkNotPresent(this._vCenter);
                                                this._vCenter = (VCenterRecord) recordStream.getNext();
                                                return true;
                                            }
                                            checkNotPresent(this._hCenter);
                                            this._hCenter = (HCenterRecord) recordStream.getNext();
                                            return true;
                                        }
                                        HeaderFooterRecord headerFooterRecord = (HeaderFooterRecord) recordStream.getNext();
                                        if (headerFooterRecord.isCurrentSheet()) {
                                            this._headerFooter = headerFooterRecord;
                                            return true;
                                        }
                                        this._sviewHeaderFooters.add(headerFooterRecord);
                                        return true;
                                    }
                                    checkNotPresent(this._bitmap);
                                    this._bitmap = recordStream.getNext();
                                    return true;
                                }
                                checkNotPresent(this._printSetup);
                                this._printSetup = (PrintSetupRecord) recordStream.getNext();
                                return true;
                            }
                            this._plsRecords.add(new PLSAggregate(recordStream));
                            return true;
                        }
                        checkNotPresent(this._printSize);
                        this._printSize = recordStream.getNext();
                        return true;
                    }
                    checkNotPresent(this._rowBreaksRecord);
                    this._rowBreaksRecord = (PageBreakRecord) recordStream.getNext();
                    return true;
                }
                checkNotPresent(this._columnBreaksRecord);
                this._columnBreaksRecord = (PageBreakRecord) recordStream.getNext();
                return true;
            }
            checkNotPresent(this._footer);
            this._footer = (FooterRecord) recordStream.getNext();
            return true;
        }
        checkNotPresent(this._header);
        this._header = (HeaderRecord) recordStream.getNext();
        return true;
    }

    private static void shiftBreaks(PageBreakRecord pageBreakRecord, int i10, int i11, int i12) {
        boolean z10;
        Iterator<PageBreakRecord.Break> breaksIterator = pageBreakRecord.getBreaksIterator();
        ArrayList arrayList = new ArrayList();
        while (breaksIterator.hasNext()) {
            PageBreakRecord.Break next = breaksIterator.next();
            int i13 = next.main;
            boolean z11 = true;
            if (i13 >= i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i13 > i11) {
                z11 = false;
            }
            if (z10 && z11) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PageBreakRecord.Break r92 = (PageBreakRecord.Break) it.next();
            pageBreakRecord.removeBreak(r92.main);
            pageBreakRecord.addBreak((short) (r92.main + i12), r92.subFrom, r92.subTo);
        }
    }

    private static void visitIfPresent(Record record, RecordAggregate.RecordVisitor recordVisitor) {
        if (record != null) {
            recordVisitor.visitRecord(record);
        }
    }

    public void addLateHeaderFooter(HeaderFooterRecord headerFooterRecord) {
        if (this._headerFooter == null) {
            if (headerFooterRecord.getSid() == 2204) {
                this._headerFooter = headerFooterRecord;
                return;
            }
            throw new RecordFormatException("Unexpected header-footer record sid: 0x" + Integer.toHexString(headerFooterRecord.getSid()));
        }
        throw new IllegalStateException("This page settings block already has a header/footer record");
    }

    public void addLateRecords(RecordStream recordStream) {
        do {
        } while (readARecord(recordStream));
    }

    public int[] getColumnBreaks() {
        return getColumnBreaksRecord().getBreaks();
    }

    public FooterRecord getFooter() {
        return this._footer;
    }

    public HCenterRecord getHCenter() {
        return this._hCenter;
    }

    public HeaderRecord getHeader() {
        return this._header;
    }

    public double getMargin(short s4) {
        Margin marginRec = getMarginRec(s4);
        if (marginRec != null) {
            return marginRec.getMargin();
        }
        if (s4 == 0 || s4 == 1) {
            return 0.75d;
        }
        if (s4 == 2 || s4 == 3) {
            return 1.0d;
        }
        throw new IllegalArgumentException(a.c("Unknown margin constant:  ", s4));
    }

    public int getNumColumnBreaks() {
        return getColumnBreaksRecord().getNumBreaks();
    }

    public int getNumRowBreaks() {
        return getRowBreaksRecord().getNumBreaks();
    }

    public PrintSetupRecord getPrintSetup() {
        return this._printSetup;
    }

    public int[] getRowBreaks() {
        return getRowBreaksRecord().getBreaks();
    }

    public VCenterRecord getVCenter() {
        return this._vCenter;
    }

    public boolean isColumnBroken(int i10) {
        if (getColumnBreaksRecord().getBreak(i10) != null) {
            return true;
        }
        return false;
    }

    public boolean isRowBroken(int i10) {
        if (getRowBreaksRecord().getBreak(i10) != null) {
            return true;
        }
        return false;
    }

    public void positionRecords(List<RecordBase> list) {
        Iterator it = new ArrayList(this._sviewHeaderFooters).iterator();
        while (it.hasNext()) {
            final HeaderFooterRecord headerFooterRecord = (HeaderFooterRecord) it.next();
            for (RecordBase recordBase : list) {
                if (recordBase instanceof CustomViewSettingsRecordAggregate) {
                    final CustomViewSettingsRecordAggregate customViewSettingsRecordAggregate = (CustomViewSettingsRecordAggregate) recordBase;
                    customViewSettingsRecordAggregate.visitContainedRecords(new RecordAggregate.RecordVisitor() { // from class: lib.zj.office.fc.hssf.record.aggregates.PageSettingsBlock.1
                        @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate.RecordVisitor
                        public void visitRecord(Record record) {
                            if (record.getSid() == 426 && Arrays.equals(((UserSViewBegin) record).getGuid(), headerFooterRecord.getGuid())) {
                                customViewSettingsRecordAggregate.append(headerFooterRecord);
                                PageSettingsBlock.this._sviewHeaderFooters.remove(headerFooterRecord);
                            }
                        }
                    });
                }
            }
        }
    }

    public void removeColumnBreak(int i10) {
        getColumnBreaksRecord().removeBreak(i10);
    }

    public void removeRowBreak(int i10) {
        if (getRowBreaksRecord().getBreaks().length >= 1) {
            getRowBreaksRecord().removeBreak((short) i10);
            return;
        }
        throw new IllegalArgumentException("Sheet does not define any row breaks");
    }

    public void setColumnBreak(short s4, short s10, short s11) {
        getColumnBreaksRecord().addBreak(s4, s10, s11);
    }

    public void setFooter(FooterRecord footerRecord) {
        this._footer = footerRecord;
    }

    public void setHeader(HeaderRecord headerRecord) {
        this._header = headerRecord;
    }

    public void setMargin(short s4, double d10) {
        Margin marginRec = getMarginRec(s4);
        BottomMarginRecord bottomMarginRecord = marginRec;
        if (marginRec == null) {
            if (s4 != 0) {
                if (s4 != 1) {
                    if (s4 != 2) {
                        if (s4 == 3) {
                            BottomMarginRecord bottomMarginRecord2 = new BottomMarginRecord();
                            this._bottomMargin = bottomMarginRecord2;
                            bottomMarginRecord = bottomMarginRecord2;
                        } else {
                            throw new IllegalArgumentException(a.c("Unknown margin constant:  ", s4));
                        }
                    } else {
                        TopMarginRecord topMarginRecord = new TopMarginRecord();
                        this._topMargin = topMarginRecord;
                        bottomMarginRecord = topMarginRecord;
                    }
                } else {
                    RightMarginRecord rightMarginRecord = new RightMarginRecord();
                    this._rightMargin = rightMarginRecord;
                    bottomMarginRecord = rightMarginRecord;
                }
            } else {
                LeftMarginRecord leftMarginRecord = new LeftMarginRecord();
                this._leftMargin = leftMarginRecord;
                bottomMarginRecord = leftMarginRecord;
            }
        }
        bottomMarginRecord.setMargin(d10);
    }

    public void setPrintSetup(PrintSetupRecord printSetupRecord) {
        this._printSetup = printSetupRecord;
    }

    public void setRowBreak(int i10, short s4, short s10) {
        getRowBreaksRecord().addBreak((short) i10, s4, s10);
    }

    public void shiftColumnBreaks(short s4, short s10, short s11) {
        shiftBreaks(getColumnBreaksRecord(), s4, s10, s11);
    }

    public void shiftRowBreaks(int i10, int i11, int i12) {
        shiftBreaks(getRowBreaksRecord(), i10, i11, i12);
    }

    @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate
    public void visitContainedRecords(RecordAggregate.RecordVisitor recordVisitor) {
        visitIfPresent(this._rowBreaksRecord, recordVisitor);
        visitIfPresent(this._columnBreaksRecord, recordVisitor);
        HeaderRecord headerRecord = this._header;
        if (headerRecord == null) {
            recordVisitor.visitRecord(new HeaderRecord(""));
        } else {
            recordVisitor.visitRecord(headerRecord);
        }
        FooterRecord footerRecord = this._footer;
        if (footerRecord == null) {
            recordVisitor.visitRecord(new FooterRecord(""));
        } else {
            recordVisitor.visitRecord(footerRecord);
        }
        visitIfPresent(this._hCenter, recordVisitor);
        visitIfPresent(this._vCenter, recordVisitor);
        visitIfPresent(this._leftMargin, recordVisitor);
        visitIfPresent(this._rightMargin, recordVisitor);
        visitIfPresent(this._topMargin, recordVisitor);
        visitIfPresent(this._bottomMargin, recordVisitor);
        for (PLSAggregate pLSAggregate : this._plsRecords) {
            pLSAggregate.visitContainedRecords(recordVisitor);
        }
        visitIfPresent(this._printSetup, recordVisitor);
        visitIfPresent(this._bitmap, recordVisitor);
        visitIfPresent(this._printSize, recordVisitor);
        visitIfPresent(this._headerFooter, recordVisitor);
    }

    private static void visitIfPresent(PageBreakRecord pageBreakRecord, RecordAggregate.RecordVisitor recordVisitor) {
        if (pageBreakRecord == null || pageBreakRecord.isEmpty()) {
            return;
        }
        recordVisitor.visitRecord(pageBreakRecord);
    }

    public PageSettingsBlock() {
        this._sviewHeaderFooters = new ArrayList();
        this._plsRecords = new ArrayList();
        this._rowBreaksRecord = new HorizontalPageBreakRecord();
        this._columnBreaksRecord = new VerticalPageBreakRecord();
        this._header = new HeaderRecord("");
        this._footer = new FooterRecord("");
        this._hCenter = createHCenter();
        this._vCenter = createVCenter();
        this._printSetup = createPrintSetup();
    }
}
