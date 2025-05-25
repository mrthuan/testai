package lib.zj.office.fc.hssf.model;

import a6.h;
import androidx.activity.f;
import b.a;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import lib.zj.office.fc.ddf.EscherBSERecord;
import lib.zj.office.fc.ddf.EscherBoolProperty;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherDgRecord;
import lib.zj.office.fc.ddf.EscherDggRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherRGBProperty;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.ddf.EscherSplitMenuColorsRecord;
import lib.zj.office.fc.hssf.formula.EvaluationWorkbook;
import lib.zj.office.fc.hssf.formula.FormulaShifter;
import lib.zj.office.fc.hssf.formula.ptg.Area3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.NameXPtg;
import lib.zj.office.fc.hssf.formula.ptg.OperandPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.formula.ptg.Ref3DPtg;
import lib.zj.office.fc.hssf.formula.udf.UDFFinder;
import lib.zj.office.fc.hssf.record.BOFRecord;
import lib.zj.office.fc.hssf.record.BackupRecord;
import lib.zj.office.fc.hssf.record.BookBoolRecord;
import lib.zj.office.fc.hssf.record.BoundSheetRecord;
import lib.zj.office.fc.hssf.record.CodepageRecord;
import lib.zj.office.fc.hssf.record.CountryRecord;
import lib.zj.office.fc.hssf.record.DSFRecord;
import lib.zj.office.fc.hssf.record.DateWindow1904Record;
import lib.zj.office.fc.hssf.record.DrawingGroupRecord;
import lib.zj.office.fc.hssf.record.EOFRecord;
import lib.zj.office.fc.hssf.record.EscherAggregate;
import lib.zj.office.fc.hssf.record.ExtSSTRecord;
import lib.zj.office.fc.hssf.record.ExtendedFormatRecord;
import lib.zj.office.fc.hssf.record.FileSharingRecord;
import lib.zj.office.fc.hssf.record.FnGroupCountRecord;
import lib.zj.office.fc.hssf.record.FontRecord;
import lib.zj.office.fc.hssf.record.FormatRecord;
import lib.zj.office.fc.hssf.record.HideObjRecord;
import lib.zj.office.fc.hssf.record.HyperlinkRecord;
import lib.zj.office.fc.hssf.record.InterfaceEndRecord;
import lib.zj.office.fc.hssf.record.InterfaceHdrRecord;
import lib.zj.office.fc.hssf.record.MMSRecord;
import lib.zj.office.fc.hssf.record.NameCommentRecord;
import lib.zj.office.fc.hssf.record.NameRecord;
import lib.zj.office.fc.hssf.record.PaletteRecord;
import lib.zj.office.fc.hssf.record.PasswordRecord;
import lib.zj.office.fc.hssf.record.PasswordRev4Record;
import lib.zj.office.fc.hssf.record.PrecisionRecord;
import lib.zj.office.fc.hssf.record.ProtectRecord;
import lib.zj.office.fc.hssf.record.ProtectionRev4Record;
import lib.zj.office.fc.hssf.record.RecalcIdRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RefreshAllRecord;
import lib.zj.office.fc.hssf.record.SSTRecord;
import lib.zj.office.fc.hssf.record.StyleRecord;
import lib.zj.office.fc.hssf.record.TabIdRecord;
import lib.zj.office.fc.hssf.record.UseSelFSRecord;
import lib.zj.office.fc.hssf.record.WindowOneRecord;
import lib.zj.office.fc.hssf.record.WindowProtectRecord;
import lib.zj.office.fc.hssf.record.WriteAccessRecord;
import lib.zj.office.fc.hssf.record.WriteProtectRecord;
import lib.zj.office.fc.hssf.record.common.UnicodeString;
import lib.zj.office.fc.hssf.usermodel.HSSFFont;
import lib.zj.office.fc.ss.usermodel.BuiltinFormats;
import lib.zj.office.fc.ss.usermodel.IFont;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;
import lib.zj.office.system.AbortReaderError;
import lib.zj.office.system.b;

@Internal
/* loaded from: classes3.dex */
public final class InternalWorkbook {
    private static final short CODEPAGE = 1200;
    private static final int MAX_SENSITIVE_SHEET_NAME_LEN = 31;
    private DrawingManager2 drawingManager;
    private FileSharingRecord fileShare;
    private LinkTable linkTable;
    protected SSTRecord sst;
    private WindowOneRecord windowOne;
    private WriteAccessRecord writeAccess;
    private WriteProtectRecord writeProtect;
    private static final POILogger log = POILogFactory.getLogger(InternalWorkbook.class);
    private static final int DEBUG = POILogger.DEBUG;
    private final WorkbookRecordList records = new WorkbookRecordList();
    private final List<BoundSheetRecord> boundsheets = new ArrayList();
    private final List<FormatRecord> formats = new ArrayList();
    private final List<HyperlinkRecord> hyperlinks = new ArrayList();
    private int numxfs = 0;
    private int numfonts = 0;
    private int maxformatid = -1;
    private boolean uses1904datewindowing = false;
    private List<EscherBSERecord> escherBSERecords = new ArrayList();
    private final Map<String, NameCommentRecord> commentRecords = new LinkedHashMap();

    private InternalWorkbook() {
    }

    private void checkSheets(int i10) {
        if (this.boundsheets.size() <= i10) {
            if (this.boundsheets.size() + 1 > i10) {
                BoundSheetRecord createBoundSheet = createBoundSheet(i10);
                WorkbookRecordList workbookRecordList = this.records;
                workbookRecordList.add(workbookRecordList.getBspos() + 1, createBoundSheet);
                WorkbookRecordList workbookRecordList2 = this.records;
                workbookRecordList2.setBspos(workbookRecordList2.getBspos() + 1);
                this.boundsheets.add(createBoundSheet);
                getOrCreateLinkTable().checkExternSheet(i10);
                fixTabIdRecord();
                return;
            }
            throw new RuntimeException("Sheet number out of bounds!");
        } else if (this.records.getTabpos() > 0) {
            WorkbookRecordList workbookRecordList3 = this.records;
            if (((TabIdRecord) workbookRecordList3.get(workbookRecordList3.getTabpos()))._tabids.length < this.boundsheets.size()) {
                fixTabIdRecord();
            }
        }
    }

    private static BOFRecord createBOF() {
        BOFRecord bOFRecord = new BOFRecord();
        bOFRecord.setVersion(BOFRecord.VERSION);
        bOFRecord.setType(5);
        bOFRecord.setBuild(BOFRecord.BUILD);
        bOFRecord.setBuildYear(BOFRecord.BUILD_YEAR);
        bOFRecord.setHistoryBitMask(65);
        bOFRecord.setRequiredVersion(6);
        return bOFRecord;
    }

    private static BackupRecord createBackup() {
        BackupRecord backupRecord = new BackupRecord();
        backupRecord.setBackup((short) 0);
        return backupRecord;
    }

    private static BookBoolRecord createBookBool() {
        BookBoolRecord bookBoolRecord = new BookBoolRecord();
        bookBoolRecord.setSaveLinkValues((short) 0);
        return bookBoolRecord;
    }

    private static BoundSheetRecord createBoundSheet(int i10) {
        return new BoundSheetRecord("Sheet" + (i10 + 1));
    }

    private static CodepageRecord createCodepage() {
        CodepageRecord codepageRecord = new CodepageRecord();
        codepageRecord.setCodepage((short) 1200);
        return codepageRecord;
    }

    private static CountryRecord createCountry() {
        CountryRecord countryRecord = new CountryRecord();
        countryRecord.setDefaultCountry((short) 1);
        if (Locale.getDefault().toString().equals("ru_RU")) {
            countryRecord.setCurrentCountry((short) 7);
        } else {
            countryRecord.setCurrentCountry((short) 1);
        }
        return countryRecord;
    }

    private static DSFRecord createDSF() {
        return new DSFRecord(false);
    }

    private static DateWindow1904Record createDateWindow1904() {
        DateWindow1904Record dateWindow1904Record = new DateWindow1904Record();
        dateWindow1904Record.setWindowing((short) 0);
        return dateWindow1904Record;
    }

    private static ExtendedFormatRecord createExtendedFormat(int i10) {
        ExtendedFormatRecord extendedFormatRecord = new ExtendedFormatRecord();
        switch (i10) {
            case 0:
                h.m(extendedFormatRecord, (short) 0, (short) 0, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) 0, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 1:
                h.m(extendedFormatRecord, (short) 1, (short) 0, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -3072, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 2:
                h.m(extendedFormatRecord, (short) 1, (short) 0, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -3072, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 3:
                h.m(extendedFormatRecord, (short) 2, (short) 0, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -3072, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 4:
                h.m(extendedFormatRecord, (short) 2, (short) 0, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -3072, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 5:
                h.m(extendedFormatRecord, (short) 0, (short) 0, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -3072, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 6:
                h.m(extendedFormatRecord, (short) 0, (short) 0, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -3072, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 7:
                h.m(extendedFormatRecord, (short) 0, (short) 0, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -3072, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 8:
                h.m(extendedFormatRecord, (short) 0, (short) 0, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -3072, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 9:
                h.m(extendedFormatRecord, (short) 0, (short) 0, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -3072, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 10:
                h.m(extendedFormatRecord, (short) 0, (short) 0, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -3072, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 11:
                h.m(extendedFormatRecord, (short) 0, (short) 0, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -3072, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 12:
                h.m(extendedFormatRecord, (short) 0, (short) 0, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -3072, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 13:
                h.m(extendedFormatRecord, (short) 0, (short) 0, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -3072, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 14:
                h.m(extendedFormatRecord, (short) 0, (short) 0, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -3072, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 15:
                h.m(extendedFormatRecord, (short) 0, (short) 0, (short) 1, (short) 32);
                f.r(extendedFormatRecord, (short) 0, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 16:
                h.m(extendedFormatRecord, (short) 1, (short) 43, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -2048, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 17:
                h.m(extendedFormatRecord, (short) 1, (short) 41, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -2048, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 18:
                h.m(extendedFormatRecord, (short) 1, (short) 44, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -2048, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 19:
                h.m(extendedFormatRecord, (short) 1, (short) 42, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -2048, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 20:
                h.m(extendedFormatRecord, (short) 1, (short) 9, (short) -11, (short) 32);
                f.r(extendedFormatRecord, (short) -2048, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 21:
                h.m(extendedFormatRecord, (short) 5, (short) 0, (short) 1, (short) 32);
                f.r(extendedFormatRecord, (short) 2048, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 22:
                h.m(extendedFormatRecord, (short) 6, (short) 0, (short) 1, (short) 32);
                f.r(extendedFormatRecord, (short) 23552, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 23:
                h.m(extendedFormatRecord, (short) 0, (short) 49, (short) 1, (short) 32);
                f.r(extendedFormatRecord, (short) 23552, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 24:
                h.m(extendedFormatRecord, (short) 0, (short) 8, (short) 1, (short) 32);
                f.r(extendedFormatRecord, (short) 23552, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
            case 25:
                h.m(extendedFormatRecord, (short) 6, (short) 8, (short) 1, (short) 32);
                f.r(extendedFormatRecord, (short) 23552, (short) 0, (short) 0, (short) 0);
                extendedFormatRecord.setFillPaletteOptions((short) 8384);
                break;
        }
        return extendedFormatRecord;
    }

    private static ExtSSTRecord createExtendedSST() {
        ExtSSTRecord extSSTRecord = new ExtSSTRecord();
        extSSTRecord.setNumStringsPerBucket((short) 8);
        return extSSTRecord;
    }

    private static FnGroupCountRecord createFnGroupCount() {
        FnGroupCountRecord fnGroupCountRecord = new FnGroupCountRecord();
        fnGroupCountRecord.setCount((short) 14);
        return fnGroupCountRecord;
    }

    private static FontRecord createFont() {
        FontRecord fontRecord = new FontRecord();
        fontRecord.setFontHeight((short) 200);
        fontRecord.setAttributes((short) 0);
        fontRecord.setColorPaletteIndex(IFont.COLOR_NORMAL);
        fontRecord.setBoldWeight((short) 400);
        fontRecord.setFontName(HSSFFont.FONT_ARIAL);
        return fontRecord;
    }

    private static FormatRecord createFormat(int i10) {
        switch (i10) {
            case 0:
                return new FormatRecord(5, BuiltinFormats.getBuiltinFormat(5));
            case 1:
                return new FormatRecord(6, BuiltinFormats.getBuiltinFormat(6));
            case 2:
                return new FormatRecord(7, BuiltinFormats.getBuiltinFormat(7));
            case 3:
                return new FormatRecord(8, BuiltinFormats.getBuiltinFormat(8));
            case 4:
                return new FormatRecord(42, BuiltinFormats.getBuiltinFormat(42));
            case 5:
                return new FormatRecord(41, BuiltinFormats.getBuiltinFormat(41));
            case 6:
                return new FormatRecord(44, BuiltinFormats.getBuiltinFormat(44));
            case 7:
                return new FormatRecord(43, BuiltinFormats.getBuiltinFormat(43));
            default:
                throw new IllegalArgumentException(a.c("Unexpected id ", i10));
        }
    }

    private static HideObjRecord createHideObj() {
        HideObjRecord hideObjRecord = new HideObjRecord();
        hideObjRecord.setHideObj((short) 0);
        return hideObjRecord;
    }

    private static MMSRecord createMMS() {
        MMSRecord mMSRecord = new MMSRecord();
        mMSRecord.setAddMenuCount((byte) 0);
        mMSRecord.setDelMenuCount((byte) 0);
        return mMSRecord;
    }

    private static PaletteRecord createPalette() {
        return new PaletteRecord();
    }

    private static PasswordRecord createPassword() {
        return new PasswordRecord(0);
    }

    private static PasswordRev4Record createPasswordRev4() {
        return new PasswordRev4Record(0);
    }

    private static PrecisionRecord createPrecision() {
        PrecisionRecord precisionRecord = new PrecisionRecord();
        precisionRecord.setFullPrecision(true);
        return precisionRecord;
    }

    private static ProtectRecord createProtect() {
        return new ProtectRecord(false);
    }

    private static ProtectionRev4Record createProtectionRev4() {
        return new ProtectionRev4Record(false);
    }

    private static RefreshAllRecord createRefreshAll() {
        return new RefreshAllRecord(false);
    }

    private static StyleRecord createStyle(int i10) {
        StyleRecord styleRecord = new StyleRecord();
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                styleRecord.setXFIndex(20);
                                styleRecord.setBuiltinStyle(5);
                                styleRecord.setOutlineStyleLevel(-1);
                            }
                        } else {
                            styleRecord.setXFIndex(0);
                            styleRecord.setBuiltinStyle(0);
                            styleRecord.setOutlineStyleLevel(-1);
                        }
                    } else {
                        styleRecord.setXFIndex(19);
                        styleRecord.setBuiltinStyle(7);
                        styleRecord.setOutlineStyleLevel(-1);
                    }
                } else {
                    styleRecord.setXFIndex(18);
                    styleRecord.setBuiltinStyle(4);
                    styleRecord.setOutlineStyleLevel(-1);
                }
            } else {
                styleRecord.setXFIndex(17);
                styleRecord.setBuiltinStyle(6);
                styleRecord.setOutlineStyleLevel(-1);
            }
        } else {
            styleRecord.setXFIndex(16);
            styleRecord.setBuiltinStyle(3);
            styleRecord.setOutlineStyleLevel(-1);
        }
        return styleRecord;
    }

    private static TabIdRecord createTabId() {
        return new TabIdRecord();
    }

    private static UseSelFSRecord createUseSelFS() {
        return new UseSelFSRecord(false);
    }

    private static WindowOneRecord createWindowOne() {
        WindowOneRecord windowOneRecord = new WindowOneRecord();
        windowOneRecord.setHorizontalHold((short) 360);
        windowOneRecord.setVerticalHold(EscherProperties.BLIP__PICTURELINE);
        windowOneRecord.setWidth((short) 14940);
        windowOneRecord.setHeight((short) 9150);
        windowOneRecord.setOptions((short) 56);
        windowOneRecord.setActiveSheetIndex(0);
        windowOneRecord.setFirstVisibleTab(0);
        windowOneRecord.setNumSelectedTabs((short) 1);
        windowOneRecord.setTabWidthRatio((short) 600);
        return windowOneRecord;
    }

    private static WindowProtectRecord createWindowProtect() {
        return new WindowProtectRecord(false);
    }

    public static InternalWorkbook createWorkbook(List<Record> list) {
        return createWorkbook(list, null);
    }

    private static WriteAccessRecord createWriteAccess() {
        WriteAccessRecord writeAccessRecord = new WriteAccessRecord();
        try {
            writeAccessRecord.setUsername(System.getProperty("user.name"));
        } catch (AccessControlException unused) {
            writeAccessRecord.setUsername("POI");
        }
        return writeAccessRecord;
    }

    private void fixTabIdRecord() {
        WorkbookRecordList workbookRecordList = this.records;
        TabIdRecord tabIdRecord = (TabIdRecord) workbookRecordList.get(workbookRecordList.getTabpos());
        int size = this.boundsheets.size();
        short[] sArr = new short[size];
        for (short s4 = 0; s4 < size; s4 = (short) (s4 + 1)) {
            sArr[s4] = s4;
        }
        tabIdRecord.setTabIdArray(sArr);
    }

    private BoundSheetRecord getBoundSheetRec(int i10) {
        return this.boundsheets.get(i10);
    }

    private LinkTable getOrCreateLinkTable() {
        if (this.linkTable == null) {
            this.linkTable = new LinkTable((short) getNumSheets(), this.records);
        }
        return this.linkTable;
    }

    public int addBSERecord(EscherBSERecord escherBSERecord) {
        EscherContainerRecord escherContainerRecord;
        createDrawingGroup();
        this.escherBSERecords.add(escherBSERecord);
        EscherContainerRecord escherContainerRecord2 = (EscherContainerRecord) ((DrawingGroupRecord) getRecords().get(findFirstRecordLocBySid(DrawingGroupRecord.sid))).getEscherRecord(0);
        if (escherContainerRecord2.getChild(1).getRecordId() == -4095) {
            escherContainerRecord = (EscherContainerRecord) escherContainerRecord2.getChild(1);
        } else {
            EscherContainerRecord escherContainerRecord3 = new EscherContainerRecord();
            escherContainerRecord3.setRecordId(EscherContainerRecord.BSTORE_CONTAINER);
            List<EscherRecord> childRecords = escherContainerRecord2.getChildRecords();
            childRecords.add(1, escherContainerRecord3);
            escherContainerRecord2.setChildRecords(childRecords);
            escherContainerRecord = escherContainerRecord3;
        }
        escherContainerRecord.setOptions((short) ((this.escherBSERecords.size() << 4) | 15));
        escherContainerRecord.addChildRecord(escherBSERecord);
        return this.escherBSERecords.size();
    }

    public NameRecord addName(NameRecord nameRecord) {
        getOrCreateLinkTable().addName(nameRecord);
        return nameRecord;
    }

    public int addSSTString(UnicodeString unicodeString) {
        POILogger pOILogger = log;
        if (pOILogger.check(POILogger.DEBUG)) {
            pOILogger.log(DEBUG, "insert to sst string='", unicodeString);
        }
        if (this.sst == null) {
            insertSST();
        }
        return this.sst.addString(unicodeString);
    }

    public short checkExternSheet(int i10) {
        return (short) getOrCreateLinkTable().checkExternSheet(i10);
    }

    public void cloneDrawings(InternalSheet internalSheet) {
        EscherContainerRecord escherContainer;
        EscherSimpleProperty escherSimpleProperty;
        findDrawingGroup();
        DrawingManager2 drawingManager2 = this.drawingManager;
        if (drawingManager2 == null || internalSheet.aggregateDrawingRecords(drawingManager2, false) == -1 || (escherContainer = ((EscherAggregate) internalSheet.findFirstRecordBySid(EscherAggregate.sid)).getEscherContainer()) == null) {
            return;
        }
        EscherDggRecord dgg = this.drawingManager.getDgg();
        short findNewDrawingGroupId = this.drawingManager.findNewDrawingGroupId();
        dgg.addCluster(findNewDrawingGroupId, 0);
        dgg.setDrawingsSaved(dgg.getDrawingsSaved() + 1);
        Iterator<EscherRecord> childIterator = escherContainer.getChildIterator();
        EscherDgRecord escherDgRecord = null;
        while (childIterator.hasNext()) {
            EscherRecord next = childIterator.next();
            if (next instanceof EscherDgRecord) {
                EscherDgRecord escherDgRecord2 = (EscherDgRecord) next;
                escherDgRecord2.setOptions((short) (findNewDrawingGroupId << 4));
                escherDgRecord = escherDgRecord2;
            } else if (next instanceof EscherContainerRecord) {
                Iterator<EscherRecord> it = ((EscherContainerRecord) next).getChildRecords().iterator();
                while (it.hasNext()) {
                    for (EscherRecord escherRecord : ((EscherContainerRecord) it.next()).getChildRecords()) {
                        short recordId = escherRecord.getRecordId();
                        if (recordId == -4086) {
                            int allocateShapeId = this.drawingManager.allocateShapeId(findNewDrawingGroupId, escherDgRecord);
                            escherDgRecord.setNumShapes(escherDgRecord.getNumShapes() - 1);
                            ((EscherSpRecord) escherRecord).setShapeId(allocateShapeId);
                        } else if (recordId == -4085 && (escherSimpleProperty = (EscherSimpleProperty) ((EscherOptRecord) escherRecord).lookup(260)) != null) {
                            EscherBSERecord bSERecord = getBSERecord(escherSimpleProperty.getPropertyValue());
                            bSERecord.setRef(bSERecord.getRef() + 1);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NameRecord cloneFilter(int i10, int i11) {
        NameRecord nameRecord = getNameRecord(i10);
        short checkExternSheet = checkExternSheet(i11);
        Ptg[] nameDefinition = nameRecord.getNameDefinition();
        for (int i12 = 0; i12 < nameDefinition.length; i12++) {
            Object[] objArr = nameDefinition[i12];
            if (objArr instanceof Area3DPtg) {
                Area3DPtg area3DPtg = (Area3DPtg) ((OperandPtg) objArr).copy();
                area3DPtg.setExternSheetIndex(checkExternSheet);
                nameDefinition[i12] = area3DPtg;
            } else if (objArr instanceof Ref3DPtg) {
                Ref3DPtg ref3DPtg = (Ref3DPtg) ((OperandPtg) objArr).copy();
                ref3DPtg.setExternSheetIndex(checkExternSheet);
                nameDefinition[i12] = ref3DPtg;
            }
        }
        NameRecord createBuiltInName = createBuiltInName((byte) 13, i11 + 1);
        createBuiltInName.setNameDefinition(nameDefinition);
        createBuiltInName.setHidden(true);
        return createBuiltInName;
    }

    public NameRecord createBuiltInName(byte b10, int i10) {
        if (i10 >= 0 && i10 + 1 <= 32767) {
            NameRecord nameRecord = new NameRecord(b10, i10);
            if (!this.linkTable.nameAlreadyExists(nameRecord)) {
                addName(nameRecord);
                return nameRecord;
            }
            throw new RuntimeException(f.k("Builtin (", b10, ") already exists for sheet (", i10, ")"));
        }
        throw new IllegalArgumentException(a0.a.g("Sheet number [", i10, "]is not valid "));
    }

    public ExtendedFormatRecord createCellXF() {
        ExtendedFormatRecord createExtendedFormat = createExtendedFormat();
        WorkbookRecordList workbookRecordList = this.records;
        workbookRecordList.add(workbookRecordList.getXfpos() + 1, createExtendedFormat);
        WorkbookRecordList workbookRecordList2 = this.records;
        workbookRecordList2.setXfpos(workbookRecordList2.getXfpos() + 1);
        this.numxfs++;
        return createExtendedFormat;
    }

    public void createDrawingGroup() {
        EscherContainerRecord escherContainerRecord;
        if (this.drawingManager == null) {
            EscherContainerRecord escherContainerRecord2 = new EscherContainerRecord();
            EscherDggRecord escherDggRecord = new EscherDggRecord();
            EscherOptRecord escherOptRecord = new EscherOptRecord();
            EscherSplitMenuColorsRecord escherSplitMenuColorsRecord = new EscherSplitMenuColorsRecord();
            escherContainerRecord2.setRecordId(EscherContainerRecord.DGG_CONTAINER);
            escherContainerRecord2.setOptions((short) 15);
            escherDggRecord.setRecordId(EscherDggRecord.RECORD_ID);
            escherDggRecord.setOptions((short) 0);
            escherDggRecord.setShapeIdMax(1024);
            escherDggRecord.setNumShapesSaved(0);
            escherDggRecord.setDrawingsSaved(0);
            escherDggRecord.setFileIdClusters(new EscherDggRecord.FileIdCluster[0]);
            this.drawingManager = new DrawingManager2(escherDggRecord);
            if (this.escherBSERecords.size() > 0) {
                escherContainerRecord = new EscherContainerRecord();
                escherContainerRecord.setRecordId(EscherContainerRecord.BSTORE_CONTAINER);
                escherContainerRecord.setOptions((short) (15 | (this.escherBSERecords.size() << 4)));
                for (EscherBSERecord escherBSERecord : this.escherBSERecords) {
                    escherContainerRecord.addChildRecord(escherBSERecord);
                }
            } else {
                escherContainerRecord = null;
            }
            escherOptRecord.setRecordId(EscherOptRecord.RECORD_ID);
            escherOptRecord.setOptions((short) 51);
            escherOptRecord.addEscherProperty(new EscherBoolProperty(EscherProperties.TEXT__SIZE_TEXT_TO_FIT_SHAPE, 524296));
            escherOptRecord.addEscherProperty(new EscherRGBProperty(EscherProperties.FILL__FILLCOLOR, 134217793));
            escherOptRecord.addEscherProperty(new EscherRGBProperty(EscherProperties.LINESTYLE__COLOR, 134217792));
            escherSplitMenuColorsRecord.setRecordId(EscherSplitMenuColorsRecord.RECORD_ID);
            escherSplitMenuColorsRecord.setOptions((short) 64);
            escherSplitMenuColorsRecord.setColor1(134217741);
            escherSplitMenuColorsRecord.setColor2(134217740);
            escherSplitMenuColorsRecord.setColor3(134217751);
            escherSplitMenuColorsRecord.setColor4(268435703);
            escherContainerRecord2.addChildRecord(escherDggRecord);
            if (escherContainerRecord != null) {
                escherContainerRecord2.addChildRecord(escherContainerRecord);
            }
            escherContainerRecord2.addChildRecord(escherOptRecord);
            escherContainerRecord2.addChildRecord(escherSplitMenuColorsRecord);
            int findFirstRecordLocBySid = findFirstRecordLocBySid(DrawingGroupRecord.sid);
            if (findFirstRecordLocBySid == -1) {
                DrawingGroupRecord drawingGroupRecord = new DrawingGroupRecord();
                drawingGroupRecord.addEscherRecord(escherContainerRecord2);
                getRecords().add(findFirstRecordLocBySid(CountryRecord.sid) + 1, drawingGroupRecord);
                return;
            }
            DrawingGroupRecord drawingGroupRecord2 = new DrawingGroupRecord();
            drawingGroupRecord2.addEscherRecord(escherContainerRecord2);
            getRecords().set(findFirstRecordLocBySid, drawingGroupRecord2);
        }
    }

    public NameRecord createName() {
        return addName(new NameRecord());
    }

    public FontRecord createNewFont() {
        FontRecord createFont = createFont();
        WorkbookRecordList workbookRecordList = this.records;
        workbookRecordList.add(workbookRecordList.getFontpos() + 1, createFont);
        WorkbookRecordList workbookRecordList2 = this.records;
        workbookRecordList2.setFontpos(workbookRecordList2.getFontpos() + 1);
        this.numfonts++;
        return createFont;
    }

    public StyleRecord createStyleRecord(int i10) {
        StyleRecord styleRecord = new StyleRecord();
        styleRecord.setXFIndex(i10);
        int i11 = -1;
        for (int xfpos = this.records.getXfpos(); xfpos < this.records.size() && i11 == -1; xfpos++) {
            Record record = this.records.get(xfpos);
            if (!(record instanceof ExtendedFormatRecord) && !(record instanceof StyleRecord)) {
                i11 = xfpos;
            }
        }
        if (i11 != -1) {
            this.records.add(i11, styleRecord);
            return styleRecord;
        }
        throw new IllegalStateException("No XF Records found!");
    }

    public boolean doesContainsSheetName(String str, int i10) {
        if (str.length() > 31) {
            str = str.substring(0, 31);
        }
        for (int i11 = 0; i11 < this.boundsheets.size(); i11++) {
            BoundSheetRecord boundSheetRec = getBoundSheetRec(i11);
            if (i10 != i11) {
                String sheetname = boundSheetRec.getSheetname();
                if (sheetname.length() > 31) {
                    sheetname = sheetname.substring(0, 31);
                }
                if (str.equalsIgnoreCase(sheetname)) {
                    return true;
                }
            }
        }
        return false;
    }

    public DrawingManager2 findDrawingGroup() {
        DrawingManager2 drawingManager2 = this.drawingManager;
        if (drawingManager2 != null) {
            return drawingManager2;
        }
        Iterator<Record> it = this.records.iterator();
        while (true) {
            EscherDggRecord escherDggRecord = null;
            if (it.hasNext()) {
                Record next = it.next();
                if (next instanceof DrawingGroupRecord) {
                    DrawingGroupRecord drawingGroupRecord = (DrawingGroupRecord) next;
                    drawingGroupRecord.processChildRecords();
                    EscherContainerRecord escherContainer = drawingGroupRecord.getEscherContainer();
                    if (escherContainer == null) {
                        continue;
                    } else {
                        Iterator<EscherRecord> childIterator = escherContainer.getChildIterator();
                        EscherContainerRecord escherContainerRecord = null;
                        while (childIterator.hasNext()) {
                            EscherRecord next2 = childIterator.next();
                            if (next2 instanceof EscherDggRecord) {
                                escherDggRecord = (EscherDggRecord) next2;
                            } else if (next2.getRecordId() == -4095) {
                                escherContainerRecord = (EscherContainerRecord) next2;
                            }
                        }
                        if (escherDggRecord != null) {
                            this.drawingManager = new DrawingManager2(escherDggRecord);
                            if (escherContainerRecord != null) {
                                for (EscherRecord escherRecord : escherContainerRecord.getChildRecords()) {
                                    if (escherRecord instanceof EscherBSERecord) {
                                        this.escherBSERecords.add((EscherBSERecord) escherRecord);
                                    }
                                }
                            }
                            return this.drawingManager;
                        }
                    }
                }
            } else {
                int findFirstRecordLocBySid = findFirstRecordLocBySid(DrawingGroupRecord.sid);
                if (findFirstRecordLocBySid != -1) {
                    EscherContainerRecord escherContainerRecord2 = null;
                    for (EscherRecord escherRecord2 : ((DrawingGroupRecord) this.records.get(findFirstRecordLocBySid)).getEscherRecords()) {
                        if (escherRecord2 instanceof EscherDggRecord) {
                            escherDggRecord = (EscherDggRecord) escherRecord2;
                        } else if (escherRecord2.getRecordId() == -4095) {
                            escherContainerRecord2 = (EscherContainerRecord) escherRecord2;
                        }
                    }
                    if (escherDggRecord != null) {
                        this.drawingManager = new DrawingManager2(escherDggRecord);
                        if (escherContainerRecord2 != null) {
                            for (EscherRecord escherRecord3 : escherContainerRecord2.getChildRecords()) {
                                if (escherRecord3 instanceof EscherBSERecord) {
                                    this.escherBSERecords.add((EscherBSERecord) escherRecord3);
                                }
                            }
                        }
                    }
                }
                return this.drawingManager;
            }
        }
    }

    public Record findFirstRecordBySid(short s4) {
        Iterator<Record> it = this.records.iterator();
        while (it.hasNext()) {
            Record next = it.next();
            if (next.getSid() == s4) {
                return next;
            }
        }
        return null;
    }

    public int findFirstRecordLocBySid(short s4) {
        Iterator<Record> it = this.records.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().getSid() == s4) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public Record findNextRecordBySid(short s4, int i10) {
        Iterator<Record> it = this.records.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Record next = it.next();
            if (next.getSid() == s4) {
                int i12 = i11 + 1;
                if (i11 == i10) {
                    return next;
                }
                i11 = i12;
            }
        }
        return null;
    }

    public String findSheetNameFromExternSheet(int i10) {
        int indexToInternalSheet = this.linkTable.getIndexToInternalSheet(i10);
        if (indexToInternalSheet < 0 || indexToInternalSheet >= this.boundsheets.size()) {
            return "";
        }
        return getSheetName(indexToInternalSheet);
    }

    public EscherBSERecord getBSERecord(int i10) {
        int i11 = i10 - 1;
        if (i11 >= 0 && i11 < this.escherBSERecords.size()) {
            return this.escherBSERecords.get(i11);
        }
        return null;
    }

    public BackupRecord getBackupRecord() {
        WorkbookRecordList workbookRecordList = this.records;
        return (BackupRecord) workbookRecordList.get(workbookRecordList.getBackuppos());
    }

    public PaletteRecord getCustomPalette() {
        int palettepos = this.records.getPalettepos();
        if (palettepos != -1) {
            Record record = this.records.get(palettepos);
            if (record instanceof PaletteRecord) {
                return (PaletteRecord) record;
            }
            throw new RuntimeException("InternalError: Expected PaletteRecord but got a '" + record + OperatorName.SHOW_TEXT_LINE);
        }
        PaletteRecord createPalette = createPalette();
        this.records.add(1, createPalette);
        this.records.setPalettepos(1);
        return createPalette;
    }

    public DrawingManager2 getDrawingManager() {
        return this.drawingManager;
    }

    public ExtendedFormatRecord getExFormatAt(int i10) {
        Record record = this.records.get((this.records.getXfpos() - (this.numxfs - 1)) + i10);
        if (record instanceof ExtendedFormatRecord) {
            return (ExtendedFormatRecord) record;
        }
        return null;
    }

    public EvaluationWorkbook.ExternalName getExternalName(int i10, int i11) {
        String resolveNameXText = this.linkTable.resolveNameXText(i10, i11);
        if (resolveNameXText == null) {
            return null;
        }
        return new EvaluationWorkbook.ExternalName(resolveNameXText, i11, this.linkTable.resolveNameXIx(i10, i11));
    }

    public EvaluationWorkbook.ExternalSheet getExternalSheet(int i10) {
        String[] externalBookAndSheetName = this.linkTable.getExternalBookAndSheetName(i10);
        if (externalBookAndSheetName == null) {
            return null;
        }
        return new EvaluationWorkbook.ExternalSheet(externalBookAndSheetName[0], externalBookAndSheetName[1]);
    }

    public int getExternalSheetIndex(String str, String str2) {
        return getOrCreateLinkTable().getExternalSheetIndex(str, str2);
    }

    public FileSharingRecord getFileSharing() {
        if (this.fileShare == null) {
            this.fileShare = new FileSharingRecord();
            int i10 = 0;
            while (i10 < this.records.size() && !(this.records.get(i10) instanceof WriteAccessRecord)) {
                i10++;
            }
            this.records.add(i10 + 1, this.fileShare);
        }
        return this.fileShare;
    }

    public int getFontIndex(FontRecord fontRecord) {
        for (int i10 = 0; i10 <= this.numfonts; i10++) {
            WorkbookRecordList workbookRecordList = this.records;
            if (((FontRecord) workbookRecordList.get((workbookRecordList.getFontpos() - (this.numfonts - 1)) + i10)) == fontRecord) {
                if (i10 > 3) {
                    return i10 + 1;
                }
                return i10;
            }
        }
        throw new IllegalArgumentException("Could not find that font!");
    }

    public FontRecord getFontRecordAt(int i10) {
        int i11;
        if (i10 > 4) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 <= this.numfonts - 1) {
            WorkbookRecordList workbookRecordList = this.records;
            return (FontRecord) workbookRecordList.get((workbookRecordList.getFontpos() - (this.numfonts - 1)) + i11);
        }
        throw new ArrayIndexOutOfBoundsException("There are only " + this.numfonts + " font records, you asked for " + i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        return (short) r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public short getFormat(java.lang.String r4, boolean r5) {
        /*
            r3 = this;
            java.util.List<lib.zj.office.fc.hssf.record.FormatRecord> r0 = r3.formats
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            lib.zj.office.fc.hssf.record.FormatRecord r1 = (lib.zj.office.fc.hssf.record.FormatRecord) r1
            java.lang.String r2 = r1.getFormatString()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            int r4 = r1.getIndexCode()
        L20:
            short r4 = (short) r4
            return r4
        L22:
            if (r5 == 0) goto L29
            int r4 = r3.createFormat(r4)
            goto L20
        L29:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hssf.model.InternalWorkbook.getFormat(java.lang.String, boolean):short");
    }

    public List<FormatRecord> getFormats() {
        return this.formats;
    }

    public List<HyperlinkRecord> getHyperlinks() {
        return this.hyperlinks;
    }

    public NameCommentRecord getNameCommentRecord(NameRecord nameRecord) {
        return this.commentRecords.get(nameRecord.getNameText());
    }

    public NameRecord getNameRecord(int i10) {
        return this.linkTable.getNameRecord(i10);
    }

    public NameXPtg getNameXPtg(String str, UDFFinder uDFFinder) {
        LinkTable orCreateLinkTable = getOrCreateLinkTable();
        NameXPtg nameXPtg = orCreateLinkTable.getNameXPtg(str);
        if (nameXPtg == null && uDFFinder.findFunction(str) != null) {
            return orCreateLinkTable.addNameXPtg(str);
        }
        return nameXPtg;
    }

    public int getNumExFormats() {
        POILogger pOILogger = log;
        if (pOILogger.check(POILogger.DEBUG)) {
            pOILogger.log(DEBUG, "getXF=", Integer.valueOf(this.numxfs));
        }
        return this.numxfs;
    }

    public int getNumNames() {
        LinkTable linkTable = this.linkTable;
        if (linkTable == null) {
            return 0;
        }
        return linkTable.getNumNames();
    }

    public int getNumRecords() {
        return this.records.size();
    }

    public int getNumSheets() {
        POILogger pOILogger = log;
        if (pOILogger.check(POILogger.DEBUG)) {
            pOILogger.log(DEBUG, "getNumSheets=", Integer.valueOf(this.boundsheets.size()));
        }
        return this.boundsheets.size();
    }

    public int getNumberOfFontRecords() {
        return this.numfonts;
    }

    public RecalcIdRecord getRecalcId() {
        RecalcIdRecord recalcIdRecord = (RecalcIdRecord) findFirstRecordBySid((short) 449);
        if (recalcIdRecord == null) {
            RecalcIdRecord recalcIdRecord2 = new RecalcIdRecord();
            this.records.add(findFirstRecordLocBySid(CountryRecord.sid) + 1, recalcIdRecord2);
            return recalcIdRecord2;
        }
        return recalcIdRecord;
    }

    public List<Record> getRecords() {
        return this.records.getRecords();
    }

    public UnicodeString getSSTString(int i10) {
        if (this.sst == null) {
            insertSST();
        }
        UnicodeString string = this.sst.getString(i10);
        POILogger pOILogger = log;
        if (pOILogger.check(POILogger.DEBUG)) {
            pOILogger.log(DEBUG, "Returning SST for index=", Integer.valueOf(i10), " String= ", string);
        }
        return string;
    }

    public int getSSTUniqueStringSize() {
        return this.sst.getNumUniqueStrings();
    }

    public int getSheetIndex(String str) {
        for (int i10 = 0; i10 < this.boundsheets.size(); i10++) {
            if (getSheetName(i10).equalsIgnoreCase(str)) {
                return i10;
            }
        }
        return -1;
    }

    public int getSheetIndexFromExternSheetIndex(int i10) {
        return this.linkTable.getSheetIndexFromExternSheetIndex(i10);
    }

    public String getSheetName(int i10) {
        return getBoundSheetRec(i10).getSheetname();
    }

    public int getSize() {
        int recordSize;
        SSTRecord sSTRecord = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.records.size(); i11++) {
            Record record = this.records.get(i11);
            if (record instanceof SSTRecord) {
                sSTRecord = (SSTRecord) record;
            }
            if (record.getSid() == 255 && sSTRecord != null) {
                recordSize = sSTRecord.calcExtSSTRecordSize();
            } else {
                recordSize = record.getRecordSize();
            }
            i10 = recordSize + i10;
        }
        return i10;
    }

    public NameRecord getSpecificBuiltinRecord(byte b10, int i10) {
        return getOrCreateLinkTable().getSpecificBuiltinRecord(b10, i10);
    }

    public StyleRecord getStyleRecord(int i10) {
        for (int xfpos = this.records.getXfpos(); xfpos < this.records.size(); xfpos++) {
            Record record = this.records.get(xfpos);
            if (!(record instanceof ExtendedFormatRecord) && (record instanceof StyleRecord)) {
                StyleRecord styleRecord = (StyleRecord) record;
                if (styleRecord.getXFIndex() == i10) {
                    return styleRecord;
                }
            }
        }
        return null;
    }

    public WindowOneRecord getWindowOne() {
        return this.windowOne;
    }

    public WriteAccessRecord getWriteAccess() {
        if (this.writeAccess == null) {
            this.writeAccess = createWriteAccess();
            int i10 = 0;
            while (i10 < this.records.size() && !(this.records.get(i10) instanceof InterfaceEndRecord)) {
                i10++;
            }
            this.records.add(i10 + 1, this.writeAccess);
        }
        return this.writeAccess;
    }

    public WriteProtectRecord getWriteProtect() {
        if (this.writeProtect == null) {
            this.writeProtect = new WriteProtectRecord();
            int i10 = 0;
            while (i10 < this.records.size() && !(this.records.get(i10) instanceof BOFRecord)) {
                i10++;
            }
            this.records.add(i10 + 1, this.writeProtect);
        }
        return this.writeProtect;
    }

    public void insertSST() {
        POILogger pOILogger = log;
        if (pOILogger.check(POILogger.DEBUG)) {
            pOILogger.log(DEBUG, "creating new SST via insertSST!");
        }
        this.sst = new SSTRecord();
        WorkbookRecordList workbookRecordList = this.records;
        workbookRecordList.add(workbookRecordList.size() - 1, createExtendedSST());
        WorkbookRecordList workbookRecordList2 = this.records;
        workbookRecordList2.add(workbookRecordList2.size() - 2, this.sst);
    }

    public boolean isSheetHidden(int i10) {
        return getBoundSheetRec(i10).isHidden();
    }

    public boolean isSheetVeryHidden(int i10) {
        return getBoundSheetRec(i10).isVeryHidden();
    }

    public boolean isUsing1904DateWindowing() {
        return this.uses1904datewindowing;
    }

    public boolean isWriteProtected() {
        if (this.fileShare == null || getFileSharing().getReadOnly() != 1) {
            return false;
        }
        return true;
    }

    public void removeBuiltinRecord(byte b10, int i10) {
        this.linkTable.removeBuiltinRecord(b10, i10);
    }

    public void removeExFormatRecord(ExtendedFormatRecord extendedFormatRecord) {
        this.records.remove(extendedFormatRecord);
        this.numxfs--;
    }

    public void removeFontRecord(FontRecord fontRecord) {
        this.records.remove(fontRecord);
        this.numfonts--;
    }

    public void removeName(int i10) {
        if (this.linkTable.getNumNames() > i10) {
            this.records.remove(findFirstRecordLocBySid((short) 24) + i10);
            this.linkTable.removeName(i10);
        }
    }

    public void removeSheet(int i10) {
        if (this.boundsheets.size() > i10) {
            WorkbookRecordList workbookRecordList = this.records;
            workbookRecordList.remove((workbookRecordList.getBspos() - (this.boundsheets.size() - 1)) + i10);
            this.boundsheets.remove(i10);
            fixTabIdRecord();
        }
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < getNumNames(); i12++) {
            NameRecord nameRecord = getNameRecord(i12);
            if (nameRecord.getSheetNumber() == i11) {
                nameRecord.setSheetNumber(0);
            } else if (nameRecord.getSheetNumber() > i11) {
                nameRecord.setSheetNumber(nameRecord.getSheetNumber() - 1);
            }
        }
    }

    public String resolveNameXText(int i10, int i11) {
        return this.linkTable.resolveNameXText(i10, i11);
    }

    public int serialize(int i10, byte[] bArr) {
        int serialize;
        POILogger pOILogger = log;
        if (pOILogger.check(POILogger.DEBUG)) {
            pOILogger.log(DEBUG, "Serializing Workbook with offsets");
        }
        SSTRecord sSTRecord = null;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        for (int i13 = 0; i13 < this.records.size(); i13++) {
            Record record = this.records.get(i13);
            if (record instanceof SSTRecord) {
                sSTRecord = (SSTRecord) record;
                i12 = i11;
            }
            if (record.getSid() == 255 && sSTRecord != null) {
                record = sSTRecord.createExtSSTRecord(i12 + i10);
            }
            if (record instanceof BoundSheetRecord) {
                if (!z10) {
                    serialize = 0;
                    for (int i14 = 0; i14 < this.boundsheets.size(); i14++) {
                        serialize += getBoundSheetRec(i14).serialize(i11 + i10 + serialize, bArr);
                    }
                    z10 = true;
                } else {
                    serialize = 0;
                }
            } else {
                serialize = record.serialize(i11 + i10, bArr);
            }
            i11 += serialize;
        }
        POILogger pOILogger2 = log;
        if (pOILogger2.check(POILogger.DEBUG)) {
            pOILogger2.log(DEBUG, "Exiting serialize workbook");
        }
        return i11;
    }

    public void setSheetBof(int i10, int i11) {
        POILogger pOILogger = log;
        if (pOILogger.check(POILogger.DEBUG)) {
            pOILogger.log(DEBUG, "setting bof for sheetnum =", Integer.valueOf(i10), " at pos=", Integer.valueOf(i11));
        }
        checkSheets(i10);
        getBoundSheetRec(i10).setPositionOfBof(i11);
    }

    public void setSheetHidden(int i10, boolean z10) {
        getBoundSheetRec(i10).setHidden(z10);
    }

    public void setSheetName(int i10, String str) {
        checkSheets(i10);
        if (str.length() > 31) {
            str = str.substring(0, 31);
        }
        this.boundsheets.get(i10).setSheetname(str);
    }

    public void setSheetOrder(String str, int i10) {
        int sheetIndex = getSheetIndex(str);
        List<BoundSheetRecord> list = this.boundsheets;
        list.add(i10, list.remove(sheetIndex));
    }

    public void unwriteProtectWorkbook() {
        this.records.remove(this.fileShare);
        this.records.remove(this.writeProtect);
        this.fileShare = null;
        this.writeProtect = null;
    }

    public void updateNameCommentRecordCache(NameCommentRecord nameCommentRecord) {
        if (this.commentRecords.containsValue(nameCommentRecord)) {
            Iterator<Map.Entry<String, NameCommentRecord>> it = this.commentRecords.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, NameCommentRecord> next = it.next();
                if (next.getValue().equals(nameCommentRecord)) {
                    this.commentRecords.remove(next.getKey());
                    break;
                }
            }
        }
        this.commentRecords.put(nameCommentRecord.getNameText(), nameCommentRecord);
    }

    public void updateNamesAfterCellShift(FormulaShifter formulaShifter) {
        for (int i10 = 0; i10 < getNumNames(); i10++) {
            NameRecord nameRecord = getNameRecord(i10);
            Ptg[] nameDefinition = nameRecord.getNameDefinition();
            if (formulaShifter.adjustFormula(nameDefinition, nameRecord.getSheetNumber())) {
                nameRecord.setNameDefinition(nameDefinition);
            }
        }
    }

    public void writeProtectWorkbook(String str, String str2) {
        FileSharingRecord fileSharing = getFileSharing();
        WriteAccessRecord writeAccess = getWriteAccess();
        getWriteProtect();
        fileSharing.setReadOnly((short) 1);
        fileSharing.setPassword(FileSharingRecord.hashPassword(str));
        fileSharing.setUsername(str2);
        writeAccess.setUsername(str2);
    }

    public static InternalWorkbook createWorkbook(List<Record> list, b bVar) {
        InternalWorkbook internalWorkbook = new InternalWorkbook();
        ArrayList arrayList = new ArrayList(list.size() / 3);
        internalWorkbook.records.setRecords(arrayList);
        int i10 = 0;
        while (true) {
            if (i10 < list.size()) {
                if (bVar != null && bVar.isAborted()) {
                    throw new AbortReaderError("abort Reader");
                }
                Record record = list.get(i10);
                if (record.getSid() == 10) {
                    arrayList.add(record);
                } else {
                    switch (record.getSid()) {
                        case 18:
                            internalWorkbook.records.setProtpos(i10);
                            break;
                        case 23:
                            throw new RuntimeException("Extern sheet is part of LinkTable");
                        case 24:
                        case 430:
                            LinkTable linkTable = new LinkTable(list, i10, internalWorkbook.records, internalWorkbook.commentRecords);
                            internalWorkbook.linkTable = linkTable;
                            i10 += linkTable.getRecordCount() - 1;
                            continue;
                            i10++;
                        case 34:
                            internalWorkbook.uses1904datewindowing = ((DateWindow1904Record) record).getWindowing() == 1;
                            break;
                        case 49:
                            internalWorkbook.records.setFontpos(i10);
                            internalWorkbook.numfonts++;
                            break;
                        case 61:
                            internalWorkbook.windowOne = (WindowOneRecord) record;
                            break;
                        case 64:
                            internalWorkbook.records.setBackuppos(i10);
                            break;
                        case 91:
                            internalWorkbook.fileShare = (FileSharingRecord) record;
                            break;
                        case 92:
                            internalWorkbook.writeAccess = (WriteAccessRecord) record;
                            break;
                        case ShapeTypes.FLOW_CHART_DECISION /* 133 */:
                            internalWorkbook.boundsheets.add((BoundSheetRecord) record);
                            internalWorkbook.records.setBspos(i10);
                            break;
                        case ShapeTypes.FLOW_CHART_INPUT_OUTPUT /* 134 */:
                            internalWorkbook.writeProtect = (WriteProtectRecord) record;
                            break;
                        case ShapeTypes.FLOW_CHART_SUMMING_JUNCTION /* 146 */:
                            internalWorkbook.records.setPalettepos(i10);
                            break;
                        case 224:
                            internalWorkbook.records.setXfpos(i10);
                            internalWorkbook.numxfs++;
                            break;
                        case 252:
                            internalWorkbook.sst = (SSTRecord) record;
                            break;
                        case 317:
                            internalWorkbook.records.setTabpos(i10);
                            break;
                        case 1054:
                            FormatRecord formatRecord = (FormatRecord) record;
                            internalWorkbook.formats.add(formatRecord);
                            internalWorkbook.maxformatid = internalWorkbook.maxformatid >= formatRecord.getIndexCode() ? internalWorkbook.maxformatid : formatRecord.getIndexCode();
                            break;
                        case 2196:
                            NameCommentRecord nameCommentRecord = (NameCommentRecord) record;
                            internalWorkbook.commentRecords.put(nameCommentRecord.getNameText(), nameCommentRecord);
                            break;
                    }
                    arrayList.add(record);
                    i10++;
                }
            }
        }
        while (i10 < list.size()) {
            if (bVar != null && bVar.isAborted()) {
                throw new AbortReaderError("abort Reader");
            }
            Record record2 = list.get(i10);
            if (record2.getSid() == 440) {
                internalWorkbook.hyperlinks.add((HyperlinkRecord) record2);
            }
            i10++;
        }
        if (internalWorkbook.windowOne == null) {
            internalWorkbook.windowOne = createWindowOne();
        }
        return internalWorkbook;
    }

    public void setSheetHidden(int i10, int i11) {
        boolean z10;
        BoundSheetRecord boundSheetRec = getBoundSheetRec(i10);
        boolean z11 = false;
        if (i11 == 0) {
            z10 = false;
        } else {
            z10 = true;
            if (i11 == 1) {
                z10 = false;
                z11 = true;
            } else if (i11 != 2) {
                throw new IllegalArgumentException(a0.a.g("Invalid hidden flag ", i11, " given, must be 0, 1 or 2"));
            }
        }
        boundSheetRec.setHidden(z11);
        boundSheetRec.setVeryHidden(z10);
    }

    public static InternalWorkbook createWorkbook() {
        POILogger pOILogger = log;
        if (pOILogger.check(POILogger.DEBUG)) {
            pOILogger.log(DEBUG, "creating new workbook from scratch");
        }
        InternalWorkbook internalWorkbook = new InternalWorkbook();
        ArrayList arrayList = new ArrayList(30);
        internalWorkbook.records.setRecords(arrayList);
        List<FormatRecord> list = internalWorkbook.formats;
        arrayList.add(createBOF());
        arrayList.add(new InterfaceHdrRecord(1200));
        arrayList.add(createMMS());
        arrayList.add(InterfaceEndRecord.instance);
        arrayList.add(createWriteAccess());
        arrayList.add(createCodepage());
        arrayList.add(createDSF());
        arrayList.add(createTabId());
        internalWorkbook.records.setTabpos(arrayList.size() - 1);
        arrayList.add(createFnGroupCount());
        arrayList.add(createWindowProtect());
        arrayList.add(createProtect());
        internalWorkbook.records.setProtpos(arrayList.size() - 1);
        arrayList.add(createPassword());
        arrayList.add(createProtectionRev4());
        arrayList.add(createPasswordRev4());
        WindowOneRecord createWindowOne = createWindowOne();
        internalWorkbook.windowOne = createWindowOne;
        arrayList.add(createWindowOne);
        arrayList.add(createBackup());
        internalWorkbook.records.setBackuppos(arrayList.size() - 1);
        arrayList.add(createHideObj());
        arrayList.add(createDateWindow1904());
        arrayList.add(createPrecision());
        arrayList.add(createRefreshAll());
        arrayList.add(createBookBool());
        arrayList.add(createFont());
        arrayList.add(createFont());
        arrayList.add(createFont());
        arrayList.add(createFont());
        internalWorkbook.records.setFontpos(arrayList.size() - 1);
        internalWorkbook.numfonts = 4;
        for (int i10 = 0; i10 <= 7; i10++) {
            FormatRecord createFormat = createFormat(i10);
            internalWorkbook.maxformatid = internalWorkbook.maxformatid >= createFormat.getIndexCode() ? internalWorkbook.maxformatid : createFormat.getIndexCode();
            list.add(createFormat);
            arrayList.add(createFormat);
        }
        for (int i11 = 0; i11 < 21; i11++) {
            arrayList.add(createExtendedFormat(i11));
            internalWorkbook.numxfs++;
        }
        internalWorkbook.records.setXfpos(arrayList.size() - 1);
        for (int i12 = 0; i12 < 6; i12++) {
            arrayList.add(createStyle(i12));
        }
        arrayList.add(createUseSelFS());
        BoundSheetRecord createBoundSheet = createBoundSheet(0);
        arrayList.add(createBoundSheet);
        internalWorkbook.boundsheets.add(createBoundSheet);
        internalWorkbook.records.setBspos(arrayList.size() - 1);
        arrayList.add(createCountry());
        internalWorkbook.getOrCreateLinkTable().checkExternSheet(0);
        SSTRecord sSTRecord = new SSTRecord();
        internalWorkbook.sst = sSTRecord;
        arrayList.add(sSTRecord);
        arrayList.add(createExtendedSST());
        arrayList.add(EOFRecord.instance);
        POILogger pOILogger2 = log;
        if (pOILogger2.check(POILogger.DEBUG)) {
            pOILogger2.log(DEBUG, "exit create new workbook from scratch");
        }
        return internalWorkbook;
    }

    public int createFormat(String str) {
        int i10 = this.maxformatid;
        int i11 = i10 >= 164 ? i10 + 1 : 164;
        this.maxformatid = i11;
        FormatRecord formatRecord = new FormatRecord(i11, str);
        int i12 = 0;
        while (i12 < this.records.size() && this.records.get(i12).getSid() != 1054) {
            i12++;
        }
        int size = this.formats.size() + i12;
        this.formats.add(formatRecord);
        this.records.add(size, formatRecord);
        return this.maxformatid;
    }

    private static ExtendedFormatRecord createExtendedFormat() {
        ExtendedFormatRecord extendedFormatRecord = new ExtendedFormatRecord();
        extendedFormatRecord.setFontIndex((short) 0);
        extendedFormatRecord.setFormatIndex((short) 0);
        extendedFormatRecord.setCellOptions((short) 1);
        extendedFormatRecord.setAlignmentOptions((short) 32);
        extendedFormatRecord.setIndentionOptions((short) 0);
        extendedFormatRecord.setBorderOptions((short) 0);
        extendedFormatRecord.setPaletteOptions((short) 0);
        extendedFormatRecord.setAdtlPaletteOptions((short) 0);
        extendedFormatRecord.setFillPaletteOptions((short) 8384);
        extendedFormatRecord.setTopBorderPaletteIdx((short) 8);
        extendedFormatRecord.setBottomBorderPaletteIdx((short) 8);
        extendedFormatRecord.setLeftBorderPaletteIdx((short) 8);
        extendedFormatRecord.setRightBorderPaletteIdx((short) 8);
        return extendedFormatRecord;
    }
}
