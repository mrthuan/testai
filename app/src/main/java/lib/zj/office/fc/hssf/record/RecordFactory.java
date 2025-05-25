package lib.zj.office.fc.hssf.record;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hssf.record.chart.AreaFormatRecord;
import lib.zj.office.fc.hssf.record.chart.AreaRecord;
import lib.zj.office.fc.hssf.record.chart.AxisLineFormatRecord;
import lib.zj.office.fc.hssf.record.chart.AxisOptionsRecord;
import lib.zj.office.fc.hssf.record.chart.AxisParentRecord;
import lib.zj.office.fc.hssf.record.chart.AxisRecord;
import lib.zj.office.fc.hssf.record.chart.AxisUsedRecord;
import lib.zj.office.fc.hssf.record.chart.BarRecord;
import lib.zj.office.fc.hssf.record.chart.BeginRecord;
import lib.zj.office.fc.hssf.record.chart.CatLabRecord;
import lib.zj.office.fc.hssf.record.chart.CategorySeriesAxisRecord;
import lib.zj.office.fc.hssf.record.chart.ChartEndBlockRecord;
import lib.zj.office.fc.hssf.record.chart.ChartEndObjectRecord;
import lib.zj.office.fc.hssf.record.chart.ChartFRTInfoRecord;
import lib.zj.office.fc.hssf.record.chart.ChartRecord;
import lib.zj.office.fc.hssf.record.chart.ChartStartBlockRecord;
import lib.zj.office.fc.hssf.record.chart.ChartStartObjectRecord;
import lib.zj.office.fc.hssf.record.chart.ChartTitleFormatRecord;
import lib.zj.office.fc.hssf.record.chart.DatRecord;
import lib.zj.office.fc.hssf.record.chart.DataFormatRecord;
import lib.zj.office.fc.hssf.record.chart.DataLabelExtensionRecord;
import lib.zj.office.fc.hssf.record.chart.DefaultDataLabelTextPropertiesRecord;
import lib.zj.office.fc.hssf.record.chart.EndRecord;
import lib.zj.office.fc.hssf.record.chart.FontBasisRecord;
import lib.zj.office.fc.hssf.record.chart.FontIndexRecord;
import lib.zj.office.fc.hssf.record.chart.FrameRecord;
import lib.zj.office.fc.hssf.record.chart.LegendRecord;
import lib.zj.office.fc.hssf.record.chart.LineFormatRecord;
import lib.zj.office.fc.hssf.record.chart.LinkedDataRecord;
import lib.zj.office.fc.hssf.record.chart.NumberFormatIndexRecord;
import lib.zj.office.fc.hssf.record.chart.ObjectLinkRecord;
import lib.zj.office.fc.hssf.record.chart.PlotAreaRecord;
import lib.zj.office.fc.hssf.record.chart.PlotGrowthRecord;
import lib.zj.office.fc.hssf.record.chart.SeriesLabelsRecord;
import lib.zj.office.fc.hssf.record.chart.SeriesListRecord;
import lib.zj.office.fc.hssf.record.chart.SeriesRecord;
import lib.zj.office.fc.hssf.record.chart.SeriesTextRecord;
import lib.zj.office.fc.hssf.record.chart.SeriesToChartGroupRecord;
import lib.zj.office.fc.hssf.record.chart.SheetPropertiesRecord;
import lib.zj.office.fc.hssf.record.chart.TextRecord;
import lib.zj.office.fc.hssf.record.chart.TickRecord;
import lib.zj.office.fc.hssf.record.chart.UnitsRecord;
import lib.zj.office.fc.hssf.record.chart.ValueRangeRecord;
import lib.zj.office.fc.hssf.record.pivottable.DataItemRecord;
import lib.zj.office.fc.hssf.record.pivottable.ExtendedPivotTableViewFieldsRecord;
import lib.zj.office.fc.hssf.record.pivottable.PageItemRecord;
import lib.zj.office.fc.hssf.record.pivottable.StreamIDRecord;
import lib.zj.office.fc.hssf.record.pivottable.ViewDefinitionRecord;
import lib.zj.office.fc.hssf.record.pivottable.ViewFieldsRecord;
import lib.zj.office.fc.hssf.record.pivottable.ViewSourceRecord;
import lib.zj.office.system.AbortReaderError;
import lib.zj.office.system.b;

/* loaded from: classes3.dex */
public final class RecordFactory {
    private static final Class<?>[] CONSTRUCTOR_ARGS = {RecordInputStream.class};
    private static final int NUM_RECORDS = 512;
    private static short[] _allKnownRecordSIDs;
    private static final Map<Integer, I_RecordCreator> _recordCreatorsById;
    private static final Class<? extends Record>[] recordClasses;

    /* loaded from: classes3.dex */
    public interface I_RecordCreator {
        Record create(RecordInputStream recordInputStream);

        Class<? extends Record> getRecordClass();
    }

    /* loaded from: classes3.dex */
    public static final class ReflectionConstructorRecordCreator implements I_RecordCreator {
        private final Constructor<? extends Record> _c;

        public ReflectionConstructorRecordCreator(Constructor<? extends Record> constructor) {
            this._c = constructor;
        }

        @Override // lib.zj.office.fc.hssf.record.RecordFactory.I_RecordCreator
        public Record create(RecordInputStream recordInputStream) {
            try {
                return this._c.newInstance(recordInputStream);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (IllegalArgumentException e11) {
                throw new RuntimeException(e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException(e12);
            } catch (InvocationTargetException e13) {
                throw new RecordFormatException("Unable to construct record instance", e13.getTargetException());
            }
        }

        @Override // lib.zj.office.fc.hssf.record.RecordFactory.I_RecordCreator
        public Class<? extends Record> getRecordClass() {
            return this._c.getDeclaringClass();
        }
    }

    /* loaded from: classes3.dex */
    public static final class ReflectionMethodRecordCreator implements I_RecordCreator {
        private final Method _m;

        public ReflectionMethodRecordCreator(Method method) {
            this._m = method;
        }

        @Override // lib.zj.office.fc.hssf.record.RecordFactory.I_RecordCreator
        public Record create(RecordInputStream recordInputStream) {
            try {
                return (Record) this._m.invoke(null, recordInputStream);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (IllegalArgumentException e11) {
                throw new RuntimeException(e11);
            } catch (InvocationTargetException e12) {
                throw new RecordFormatException("Unable to construct record instance", e12.getTargetException());
            }
        }

        @Override // lib.zj.office.fc.hssf.record.RecordFactory.I_RecordCreator
        public Class<? extends Record> getRecordClass() {
            return this._m.getDeclaringClass();
        }
    }

    static {
        Class<? extends Record>[] clsArr = {ArrayRecord.class, AutoFilterInfoRecord.class, BackupRecord.class, BlankRecord.class, BOFRecord.class, BookBoolRecord.class, BoolErrRecord.class, BottomMarginRecord.class, BoundSheetRecord.class, CalcCountRecord.class, CalcModeRecord.class, CFHeaderRecord.class, CFRuleRecord.class, ChartRecord.class, ChartTitleFormatRecord.class, CodepageRecord.class, ColumnInfoRecord.class, ContinueRecord.class, CountryRecord.class, CRNCountRecord.class, CRNRecord.class, DateWindow1904Record.class, DBCellRecord.class, DefaultColWidthRecord.class, DefaultRowHeightRecord.class, DeltaRecord.class, DimensionsRecord.class, DrawingGroupRecord.class, DrawingRecord.class, DrawingSelectionRecord.class, DSFRecord.class, DVALRecord.class, DVRecord.class, EOFRecord.class, ExtendedFormatRecord.class, ExternalNameRecord.class, ExternSheetRecord.class, ExtSSTRecord.class, FeatRecord.class, FeatHdrRecord.class, FilePassRecord.class, FileSharingRecord.class, FnGroupCountRecord.class, FontRecord.class, FooterRecord.class, FormatRecord.class, FormulaRecord.class, GridsetRecord.class, GutsRecord.class, HCenterRecord.class, HeaderRecord.class, HeaderFooterRecord.class, HideObjRecord.class, HorizontalPageBreakRecord.class, HyperlinkRecord.class, IndexRecord.class, InterfaceEndRecord.class, InterfaceHdrRecord.class, IterationRecord.class, LabelRecord.class, LabelSSTRecord.class, LeftMarginRecord.class, LegendRecord.class, MergeCellsRecord.class, MMSRecord.class, MulBlankRecord.class, MulRKRecord.class, NameRecord.class, NameCommentRecord.class, NoteRecord.class, NumberRecord.class, ObjectProtectRecord.class, ObjRecord.class, PaletteRecord.class, PaneRecord.class, PasswordRecord.class, PasswordRev4Record.class, PrecisionRecord.class, PrintGridlinesRecord.class, PrintHeadersRecord.class, PrintSetupRecord.class, ProtectionRev4Record.class, ProtectRecord.class, RecalcIdRecord.class, RefModeRecord.class, RefreshAllRecord.class, RightMarginRecord.class, RKRecord.class, RowRecord.class, SaveRecalcRecord.class, ScenarioProtectRecord.class, SelectionRecord.class, SeriesRecord.class, SeriesTextRecord.class, SharedFormulaRecord.class, SSTRecord.class, StringRecord.class, StyleRecord.class, SupBookRecord.class, TabIdRecord.class, TableRecord.class, TableStylesRecord.class, TextObjectRecord.class, TopMarginRecord.class, UncalcedRecord.class, UseSelFSRecord.class, UserSViewBegin.class, UserSViewEnd.class, ValueRangeRecord.class, VCenterRecord.class, VerticalPageBreakRecord.class, WindowOneRecord.class, WindowProtectRecord.class, WindowTwoRecord.class, WriteAccessRecord.class, WriteProtectRecord.class, WSBoolRecord.class, BeginRecord.class, ChartFRTInfoRecord.class, ChartStartBlockRecord.class, ChartEndBlockRecord.class, ChartStartObjectRecord.class, ChartEndObjectRecord.class, CatLabRecord.class, DataFormatRecord.class, EndRecord.class, LinkedDataRecord.class, SeriesToChartGroupRecord.class, AreaFormatRecord.class, AreaRecord.class, AxisLineFormatRecord.class, AxisOptionsRecord.class, AxisParentRecord.class, AxisRecord.class, AxisUsedRecord.class, BarRecord.class, CategorySeriesAxisRecord.class, DatRecord.class, DefaultDataLabelTextPropertiesRecord.class, FontBasisRecord.class, FontIndexRecord.class, FrameRecord.class, LineFormatRecord.class, NumberFormatIndexRecord.class, PlotAreaRecord.class, PlotGrowthRecord.class, SeriesLabelsRecord.class, SeriesListRecord.class, SheetPropertiesRecord.class, TickRecord.class, UnitsRecord.class, DataItemRecord.class, ExtendedPivotTableViewFieldsRecord.class, PageItemRecord.class, StreamIDRecord.class, ViewDefinitionRecord.class, ViewFieldsRecord.class, ViewSourceRecord.class, DataLabelExtensionRecord.class, TextRecord.class, ObjectLinkRecord.class};
        recordClasses = clsArr;
        _recordCreatorsById = recordsToMap(clsArr);
    }

    public static BlankRecord[] convertBlankRecords(MulBlankRecord mulBlankRecord) {
        BlankRecord[] blankRecordArr = new BlankRecord[mulBlankRecord.getNumColumns()];
        for (int i10 = 0; i10 < mulBlankRecord.getNumColumns(); i10++) {
            BlankRecord blankRecord = new BlankRecord();
            blankRecord.setColumn((short) (mulBlankRecord.getFirstColumn() + i10));
            blankRecord.setRow(mulBlankRecord.getRow());
            blankRecord.setXFIndex(mulBlankRecord.getXFAt(i10));
            blankRecordArr[i10] = blankRecord;
        }
        return blankRecordArr;
    }

    public static NumberRecord[] convertRKRecords(MulRKRecord mulRKRecord) {
        NumberRecord[] numberRecordArr = new NumberRecord[mulRKRecord.getNumColumns()];
        for (int i10 = 0; i10 < mulRKRecord.getNumColumns(); i10++) {
            NumberRecord numberRecord = new NumberRecord();
            numberRecord.setColumn((short) (mulRKRecord.getFirstColumn() + i10));
            numberRecord.setRow(mulRKRecord.getRow());
            numberRecord.setXFIndex(mulRKRecord.getXFAt(i10));
            numberRecord.setValue(mulRKRecord.getRKNumberAt(i10));
            numberRecordArr[i10] = numberRecord;
        }
        return numberRecordArr;
    }

    public static NumberRecord convertToNumberRecord(RKRecord rKRecord) {
        NumberRecord numberRecord = new NumberRecord();
        numberRecord.setColumn(rKRecord.getColumn());
        numberRecord.setRow(rKRecord.getRow());
        numberRecord.setXFIndex(rKRecord.getXFIndex());
        numberRecord.setValue(rKRecord.getRKNumber());
        return numberRecord;
    }

    public static Record[] createRecord(RecordInputStream recordInputStream) {
        Record createSingleRecord = createSingleRecord(recordInputStream);
        return createSingleRecord instanceof DBCellRecord ? new Record[]{null} : createSingleRecord instanceof RKRecord ? new Record[]{convertToNumberRecord((RKRecord) createSingleRecord)} : createSingleRecord instanceof MulRKRecord ? convertRKRecords((MulRKRecord) createSingleRecord) : new Record[]{createSingleRecord};
    }

    public static List<Record> createRecords(InputStream inputStream) {
        return createRecords(inputStream, null);
    }

    public static Record createSingleRecord(RecordInputStream recordInputStream) {
        I_RecordCreator i_RecordCreator = _recordCreatorsById.get(Integer.valueOf(recordInputStream.getSid()));
        if (i_RecordCreator == null) {
            return new UnknownRecord(recordInputStream);
        }
        return i_RecordCreator.create(recordInputStream);
    }

    public static short[] getAllKnownRecordSIDs() {
        if (_allKnownRecordSIDs == null) {
            Map<Integer, I_RecordCreator> map = _recordCreatorsById;
            short[] sArr = new short[map.size()];
            int i10 = 0;
            for (Integer num : map.keySet()) {
                sArr[i10] = num.shortValue();
                i10++;
            }
            Arrays.sort(sArr);
            _allKnownRecordSIDs = sArr;
        }
        return (short[]) _allKnownRecordSIDs.clone();
    }

    public static Class<? extends Record> getRecordClass(int i10) {
        I_RecordCreator i_RecordCreator = _recordCreatorsById.get(Integer.valueOf(i10));
        if (i_RecordCreator == null) {
            return null;
        }
        return i_RecordCreator.getRecordClass();
    }

    private static I_RecordCreator getRecordCreator(Class<? extends Record> cls) {
        try {
            try {
                return new ReflectionConstructorRecordCreator(cls.getConstructor(CONSTRUCTOR_ARGS));
            } catch (NoSuchMethodException unused) {
                return new ReflectionMethodRecordCreator(cls.getDeclaredMethod("create", CONSTRUCTOR_ARGS));
            }
        } catch (NoSuchMethodException unused2) {
            throw new RuntimeException("Failed to find constructor or create method for (" + cls.getName() + ").");
        }
    }

    private static Map<Integer, I_RecordCreator> recordsToMap(Class<? extends Record>[] clsArr) {
        short s4;
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet((clsArr.length * 3) / 2);
        for (Class<? extends Record> cls : clsArr) {
            if (Record.class.isAssignableFrom(cls)) {
                if (!Modifier.isAbstract(cls.getModifiers())) {
                    if (hashSet.add(cls)) {
                        try {
                            Integer valueOf = Integer.valueOf(cls.getField("sid").getShort(null));
                            if (!hashMap.containsKey(valueOf)) {
                                hashMap.put(valueOf, getRecordCreator(cls));
                            } else {
                                Class<? extends Record> recordClass = ((I_RecordCreator) hashMap.get(valueOf)).getRecordClass();
                                throw new RuntimeException("duplicate record sid 0x" + Integer.toHexString(s4).toUpperCase() + " for classes (" + cls.getName() + ") and (" + recordClass.getName() + ")");
                            }
                        } catch (Exception unused) {
                            throw new RecordFormatException("Unable to determine record types");
                        }
                    } else {
                        throw new RuntimeException("duplicate record class (" + cls.getName() + ")");
                    }
                } else {
                    throw new RuntimeException("Invalid record class (" + cls.getName() + ") - must not be abstract");
                }
            } else {
                throw new RuntimeException("Invalid record sub-class (" + cls.getName() + ")");
            }
        }
        return hashMap;
    }

    public static List<Record> createRecords(InputStream inputStream, b bVar) {
        ArrayList arrayList = new ArrayList(512);
        RecordFactoryInputStream recordFactoryInputStream = new RecordFactoryInputStream(inputStream, true);
        while (true) {
            Record nextRecord = recordFactoryInputStream.nextRecord();
            if (nextRecord != null) {
                if (bVar != null && bVar.isAborted()) {
                    throw new AbortReaderError("abort Reader");
                }
                arrayList.add(nextRecord);
            } else {
                recordFactoryInputStream.dispose();
                return arrayList;
            }
        }
    }
}
