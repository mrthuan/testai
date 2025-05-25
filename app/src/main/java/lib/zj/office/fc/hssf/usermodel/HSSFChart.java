package lib.zj.office.fc.hssf.usermodel;

import a0.a;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import di.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.hssf.formula.ptg.Area3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.AreaPtgBase;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.record.BOFRecord;
import lib.zj.office.fc.hssf.record.DimensionsRecord;
import lib.zj.office.fc.hssf.record.EOFRecord;
import lib.zj.office.fc.hssf.record.FooterRecord;
import lib.zj.office.fc.hssf.record.HCenterRecord;
import lib.zj.office.fc.hssf.record.HeaderRecord;
import lib.zj.office.fc.hssf.record.PrintSetupRecord;
import lib.zj.office.fc.hssf.record.ProtectRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RecordBase;
import lib.zj.office.fc.hssf.record.SCLRecord;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.hssf.record.VCenterRecord;
import lib.zj.office.fc.hssf.record.chart.AreaFormatRecord;
import lib.zj.office.fc.hssf.record.chart.AreaRecord;
import lib.zj.office.fc.hssf.record.chart.AxisLineFormatRecord;
import lib.zj.office.fc.hssf.record.chart.AxisOptionsRecord;
import lib.zj.office.fc.hssf.record.chart.AxisParentRecord;
import lib.zj.office.fc.hssf.record.chart.AxisRecord;
import lib.zj.office.fc.hssf.record.chart.AxisUsedRecord;
import lib.zj.office.fc.hssf.record.chart.BarRecord;
import lib.zj.office.fc.hssf.record.chart.BeginRecord;
import lib.zj.office.fc.hssf.record.chart.CategorySeriesAxisRecord;
import lib.zj.office.fc.hssf.record.chart.ChartFormatRecord;
import lib.zj.office.fc.hssf.record.chart.ChartRecord;
import lib.zj.office.fc.hssf.record.chart.ChartTitleFormatRecord;
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
import lib.zj.office.fc.hssf.record.chart.ObjectLinkRecord;
import lib.zj.office.fc.hssf.record.chart.PlotAreaRecord;
import lib.zj.office.fc.hssf.record.chart.PlotGrowthRecord;
import lib.zj.office.fc.hssf.record.chart.SeriesIndexRecord;
import lib.zj.office.fc.hssf.record.chart.SeriesRecord;
import lib.zj.office.fc.hssf.record.chart.SeriesTextRecord;
import lib.zj.office.fc.hssf.record.chart.SeriesToChartGroupRecord;
import lib.zj.office.fc.hssf.record.chart.SheetPropertiesRecord;
import lib.zj.office.fc.hssf.record.chart.TextRecord;
import lib.zj.office.fc.hssf.record.chart.TickRecord;
import lib.zj.office.fc.hssf.record.chart.UnitsRecord;
import lib.zj.office.fc.hssf.record.chart.ValueRangeRecord;
import lib.zj.office.fc.hssf.util.CellRangeAddress;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.util.CellRangeAddressBase;

/* loaded from: classes3.dex */
public final class HSSFChart extends HSSFSimpleShape {
    public static final short OBJECT_TYPE_CHART = 5;
    private ChartRecord chartRecord;
    private Map<SeriesTextRecord, Record> chartSeriesText;
    private ChartTitleFormatRecord chartTitleFormat;
    private LegendRecord legendRecord;
    private AreaFormatRecord marginColorFormat;
    private List<HSSFSeries> series;
    private AreaFormatRecord seriesBackgroundColorFormat;
    private HSSFSheet sheet;
    private HSSFChartType type;
    private List<ValueRangeRecord> valueRanges;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static abstract class HSSFChartType {
        public static final HSSFChartType Area = new AnonymousClass1();
        public static final HSSFChartType Bar = new AnonymousClass2();
        public static final HSSFChartType Line = new AnonymousClass3();
        public static final HSSFChartType Pie = new AnonymousClass4();
        public static final HSSFChartType Scatter = new AnonymousClass5();
        public static final HSSFChartType Unknown = new AnonymousClass6();
        private static final /* synthetic */ HSSFChartType[] $VALUES = $values();

        /* renamed from: lib.zj.office.fc.hssf.usermodel.HSSFChart$HSSFChartType$1  reason: invalid class name */
        /* loaded from: classes3.dex */
        public enum AnonymousClass1 extends HSSFChartType {
            public /* synthetic */ AnonymousClass1() {
                this("Area", 0);
            }

            @Override // lib.zj.office.fc.hssf.usermodel.HSSFChart.HSSFChartType
            public short getSid() {
                return AreaRecord.sid;
            }

            private AnonymousClass1(String str, int i10) {
                super(str, i10, 0);
            }
        }

        /* renamed from: lib.zj.office.fc.hssf.usermodel.HSSFChart$HSSFChartType$2  reason: invalid class name */
        /* loaded from: classes3.dex */
        public enum AnonymousClass2 extends HSSFChartType {
            public /* synthetic */ AnonymousClass2() {
                this("Bar", 1);
            }

            @Override // lib.zj.office.fc.hssf.usermodel.HSSFChart.HSSFChartType
            public short getSid() {
                return BarRecord.sid;
            }

            private AnonymousClass2(String str, int i10) {
                super(str, i10, 0);
            }
        }

        /* renamed from: lib.zj.office.fc.hssf.usermodel.HSSFChart$HSSFChartType$3  reason: invalid class name */
        /* loaded from: classes3.dex */
        public enum AnonymousClass3 extends HSSFChartType {
            public /* synthetic */ AnonymousClass3() {
                this("Line", 2);
            }

            @Override // lib.zj.office.fc.hssf.usermodel.HSSFChart.HSSFChartType
            public short getSid() {
                return (short) 4120;
            }

            private AnonymousClass3(String str, int i10) {
                super(str, i10, 0);
            }
        }

        /* renamed from: lib.zj.office.fc.hssf.usermodel.HSSFChart$HSSFChartType$4  reason: invalid class name */
        /* loaded from: classes3.dex */
        public enum AnonymousClass4 extends HSSFChartType {
            public /* synthetic */ AnonymousClass4() {
                this("Pie", 3);
            }

            @Override // lib.zj.office.fc.hssf.usermodel.HSSFChart.HSSFChartType
            public short getSid() {
                return (short) 4121;
            }

            private AnonymousClass4(String str, int i10) {
                super(str, i10, 0);
            }
        }

        /* renamed from: lib.zj.office.fc.hssf.usermodel.HSSFChart$HSSFChartType$5  reason: invalid class name */
        /* loaded from: classes3.dex */
        public enum AnonymousClass5 extends HSSFChartType {
            public /* synthetic */ AnonymousClass5() {
                this("Scatter", 4);
            }

            @Override // lib.zj.office.fc.hssf.usermodel.HSSFChart.HSSFChartType
            public short getSid() {
                return (short) 4123;
            }

            private AnonymousClass5(String str, int i10) {
                super(str, i10, 0);
            }
        }

        /* renamed from: lib.zj.office.fc.hssf.usermodel.HSSFChart$HSSFChartType$6  reason: invalid class name */
        /* loaded from: classes3.dex */
        public enum AnonymousClass6 extends HSSFChartType {
            public /* synthetic */ AnonymousClass6() {
                this(OpenTypeScript.UNKNOWN, 5);
            }

            @Override // lib.zj.office.fc.hssf.usermodel.HSSFChart.HSSFChartType
            public short getSid() {
                return (short) 0;
            }

            private AnonymousClass6(String str, int i10) {
                super(str, i10, 0);
            }
        }

        private static /* synthetic */ HSSFChartType[] $values() {
            return new HSSFChartType[]{Area, Bar, Line, Pie, Scatter, Unknown};
        }

        public /* synthetic */ HSSFChartType(String str, int i10, int i11) {
            this(str, i10);
        }

        public static HSSFChartType valueOf(String str) {
            return (HSSFChartType) Enum.valueOf(HSSFChartType.class, str);
        }

        public static HSSFChartType[] values() {
            return (HSSFChartType[]) $VALUES.clone();
        }

        public abstract short getSid();

        private HSSFChartType(String str, int i10) {
        }
    }

    /* loaded from: classes3.dex */
    public class HSSFSeries {
        private AreaFormatRecord areaFormatRecord;
        private LinkedDataRecord dataCategoryLabels;
        private LinkedDataRecord dataName;
        private LinkedDataRecord dataSecondaryCategoryLabels;
        private LinkedDataRecord dataValues;
        private DataLabelExtensionRecord dleRec;
        private SeriesRecord series;
        private SeriesTextRecord seriesTitleText;
        private TextRecord textRecord;

        public HSSFSeries(SeriesRecord seriesRecord) {
            this.series = seriesRecord;
        }

        private CellRangeAddressBase getCellRange(LinkedDataRecord linkedDataRecord) {
            Ptg[] formulaOfLink;
            if (linkedDataRecord == null) {
                return null;
            }
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            for (Ptg ptg : linkedDataRecord.getFormulaOfLink()) {
                if (ptg instanceof AreaPtgBase) {
                    AreaPtgBase areaPtgBase = (AreaPtgBase) ptg;
                    i10 = areaPtgBase.getFirstRow();
                    i11 = areaPtgBase.getLastRow();
                    i12 = areaPtgBase.getFirstColumn();
                    i13 = areaPtgBase.getLastColumn();
                }
            }
            return new CellRangeAddress(i10, i11, i12, i13);
        }

        private Integer setVerticalCellRange(LinkedDataRecord linkedDataRecord, CellRangeAddressBase cellRangeAddressBase) {
            Ptg[] formulaOfLink;
            if (linkedDataRecord == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int lastRow = (cellRangeAddressBase.getLastRow() - cellRangeAddressBase.getFirstRow()) + 1;
            int lastColumn = (cellRangeAddressBase.getLastColumn() - cellRangeAddressBase.getFirstColumn()) + 1;
            for (Ptg ptg : linkedDataRecord.getFormulaOfLink()) {
                if (ptg instanceof AreaPtgBase) {
                    AreaPtgBase areaPtgBase = (AreaPtgBase) ptg;
                    areaPtgBase.setFirstRow(cellRangeAddressBase.getFirstRow());
                    areaPtgBase.setLastRow(cellRangeAddressBase.getLastRow());
                    areaPtgBase.setFirstColumn(cellRangeAddressBase.getFirstColumn());
                    areaPtgBase.setLastColumn(cellRangeAddressBase.getLastColumn());
                    arrayList.add(areaPtgBase);
                }
            }
            linkedDataRecord.setFormulaOfLink((Ptg[]) arrayList.toArray(new Ptg[arrayList.size()]));
            return Integer.valueOf(lastRow * lastColumn);
        }

        public AreaFormatRecord getAreaFormat() {
            return this.areaFormatRecord;
        }

        public CellRangeAddressBase getCategoryLabelsCellRange() {
            return getCellRange(this.dataCategoryLabels);
        }

        public LinkedDataRecord getDataCategoryLabels() {
            return this.dataCategoryLabels;
        }

        public DataLabelExtensionRecord getDataLabelExtensionRecord() {
            return this.dleRec;
        }

        public LinkedDataRecord getDataName() {
            return this.dataName;
        }

        public LinkedDataRecord getDataSecondaryCategoryLabels() {
            return this.dataSecondaryCategoryLabels;
        }

        public LinkedDataRecord getDataValues() {
            return this.dataValues;
        }

        public short getNumValues() {
            return this.series.getNumValues();
        }

        public SeriesRecord getSeries() {
            return this.series;
        }

        public SeriesTextRecord getSeriesTextRecord() {
            return this.seriesTitleText;
        }

        public String getSeriesTitle() {
            SeriesTextRecord seriesTextRecord = this.seriesTitleText;
            if (seriesTextRecord != null) {
                return seriesTextRecord.getText();
            }
            return null;
        }

        public TextRecord getTextRecord() {
            return this.textRecord;
        }

        public short getValueType() {
            return this.series.getValuesDataType();
        }

        public CellRangeAddressBase getValuesCellRange() {
            return getCellRange(this.dataValues);
        }

        public void insertData(LinkedDataRecord linkedDataRecord) {
            byte linkType = linkedDataRecord.getLinkType();
            if (linkType != 0) {
                if (linkType != 1) {
                    if (linkType != 2) {
                        if (linkType == 3) {
                            this.dataSecondaryCategoryLabels = linkedDataRecord;
                            return;
                        }
                        return;
                    }
                    this.dataCategoryLabels = linkedDataRecord;
                    return;
                }
                this.dataValues = linkedDataRecord;
                return;
            }
            this.dataName = linkedDataRecord;
        }

        public void setAreaFormat(AreaFormatRecord areaFormatRecord) {
            this.areaFormatRecord = areaFormatRecord;
        }

        public void setCategoryLabelsCellRange(CellRangeAddressBase cellRangeAddressBase) {
            Integer verticalCellRange = setVerticalCellRange(this.dataCategoryLabels, cellRangeAddressBase);
            if (verticalCellRange == null) {
                return;
            }
            this.series.setNumCategories((short) verticalCellRange.intValue());
        }

        public void setDataLabelExtensionRecord(DataLabelExtensionRecord dataLabelExtensionRecord) {
            this.dleRec = dataLabelExtensionRecord;
        }

        public void setSeriesTitle(String str) {
            SeriesTextRecord seriesTextRecord = this.seriesTitleText;
            if (seriesTextRecord != null) {
                seriesTextRecord.setText(str);
                return;
            }
            throw new IllegalStateException("No series title found to change");
        }

        public void setSeriesTitleText(SeriesTextRecord seriesTextRecord) {
            this.seriesTitleText = seriesTextRecord;
        }

        public void setTextRecord(TextRecord textRecord) {
            this.textRecord = textRecord;
        }

        public void setValuesCellRange(CellRangeAddressBase cellRangeAddressBase) {
            Integer verticalCellRange = setVerticalCellRange(this.dataValues, cellRangeAddressBase);
            if (verticalCellRange == null) {
                return;
            }
            this.series.setNumValues((short) verticalCellRange.intValue());
        }
    }

    public HSSFChart(e eVar, EscherContainerRecord escherContainerRecord, HSSFShape hSSFShape, HSSFAnchor hSSFAnchor) {
        super(escherContainerRecord, hSSFShape, hSSFAnchor);
        this.chartSeriesText = new HashMap();
        this.valueRanges = new ArrayList();
        this.type = HSSFChartType.Unknown;
        this.series = new ArrayList();
        if (escherContainerRecord != null && eVar != null) {
            processLineWidth();
            processLine(escherContainerRecord, eVar);
            processSimpleBackground(escherContainerRecord, eVar);
            processRotationAndFlip(escherContainerRecord);
        }
        setShapeType(5);
    }

    public static void convertRecordsToChart(List<Record> list, HSSFChart hSSFChart) {
        if (hSSFChart != null && list != null) {
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                Record record = list.get(i10);
                if (record instanceof ChartRecord) {
                    hSSFChart.setChartRecord((ChartRecord) record);
                } else if (record instanceof LegendRecord) {
                    hSSFChart.legendRecord = (LegendRecord) record;
                } else if (record.getSid() == 4106) {
                    if (hSSFChart.getSeries().length == 0) {
                        hSSFChart.marginColorFormat = (AreaFormatRecord) record;
                    } else {
                        hSSFChart.seriesBackgroundColorFormat = (AreaFormatRecord) record;
                    }
                } else if (record instanceof SeriesRecord) {
                    i10 = convetRecordsToSeriesByPostion(list, hSSFChart, i10);
                } else if (record instanceof TextRecord) {
                    i10 = convetRecordsToText(list, hSSFChart, i10);
                } else if (record instanceof DataLabelExtensionRecord) {
                    ((HSSFSeries) a.f(hSSFChart.series, -1)).setDataLabelExtensionRecord((DataLabelExtensionRecord) record);
                } else if (record instanceof ChartTitleFormatRecord) {
                    hSSFChart.chartTitleFormat = (ChartTitleFormatRecord) record;
                } else if (record instanceof ValueRangeRecord) {
                    hSSFChart.valueRanges.add((ValueRangeRecord) record);
                } else if (record.getSid() != 4161) {
                    HSSFChartType[] values = HSSFChartType.values();
                    int length = values.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            break;
                        }
                        HSSFChartType hSSFChartType = values[i11];
                        if (hSSFChartType != HSSFChartType.Unknown && record.getSid() == hSSFChartType.getSid()) {
                            hSSFChart.type = hSSFChartType;
                            break;
                        }
                        i11++;
                    }
                }
                i10++;
            }
        }
    }

    private static int convetRecordsToSeriesByPostion(List<Record> list, HSSFChart hSSFChart, int i10) {
        if (i10 < list.size() && list.get(i10).getSid() == 4099) {
            Objects.requireNonNull(hSSFChart);
            hSSFChart.series.add(new HSSFSeries((SeriesRecord) list.get(i10)));
            int i11 = i10 + 1;
            if (list.get(i11) instanceof BeginRecord) {
                i11++;
                int i12 = 1;
                while (i11 <= list.size() && i12 > 0) {
                    Record record = list.get(i11);
                    if (record instanceof LinkedDataRecord) {
                        LinkedDataRecord linkedDataRecord = (LinkedDataRecord) record;
                        if (hSSFChart.series.size() > 0) {
                            List<HSSFSeries> list2 = hSSFChart.series;
                            list2.get(list2.size() - 1).insertData(linkedDataRecord);
                        }
                    } else if (record instanceof SeriesTextRecord) {
                        SeriesTextRecord seriesTextRecord = (SeriesTextRecord) record;
                        if (hSSFChart.series.size() > 0) {
                            List<HSSFSeries> list3 = hSSFChart.series;
                            list3.get(list3.size() - 1).seriesTitleText = seriesTextRecord;
                        }
                    } else if (record.getSid() == 4106) {
                        List<HSSFSeries> list4 = hSSFChart.series;
                        list4.get(list4.size() - 1).setAreaFormat((AreaFormatRecord) record);
                    } else if (record instanceof BeginRecord) {
                        i12++;
                    } else if (record instanceof EndRecord) {
                        i12--;
                    }
                    i11++;
                }
            }
            return i11 - 1;
        }
        return -1;
    }

    private static int convetRecordsToText(List<Record> list, HSSFChart hSSFChart, int i10) {
        SeriesTextRecord seriesTextRecord;
        if (i10 < list.size() && list.get(i10).getSid() == 4133) {
            TextRecord textRecord = (TextRecord) list.get(i10);
            int i11 = i10 + 1;
            ObjectLinkRecord objectLinkRecord = null;
            if (list.get(i11) instanceof BeginRecord) {
                i11++;
                int i12 = 1;
                seriesTextRecord = null;
                while (i11 <= list.size() && i12 > 0) {
                    Record record = list.get(i11);
                    if (record instanceof SeriesTextRecord) {
                        seriesTextRecord = (SeriesTextRecord) list.get(i11);
                    } else if (record instanceof ObjectLinkRecord) {
                        objectLinkRecord = (ObjectLinkRecord) record;
                    } else if (record instanceof BeginRecord) {
                        i12++;
                    } else if (record instanceof EndRecord) {
                        i12--;
                    }
                    i11++;
                }
            } else {
                seriesTextRecord = null;
            }
            if (textRecord.getWidth() > 0 && textRecord.getHeight() > 0 && objectLinkRecord != null && hSSFChart.series.size() > 0) {
                if (seriesTextRecord != null) {
                    hSSFChart.chartSeriesText.put(seriesTextRecord, objectLinkRecord);
                } else if (hSSFChart.series.size() > hSSFChart.chartSeriesText.size()) {
                    Map<SeriesTextRecord, Record> map = hSSFChart.chartSeriesText;
                    map.put(hSSFChart.series.get(map.size()).getSeriesTextRecord(), objectLinkRecord);
                }
            }
            return i11 - 1;
        }
        return -1;
    }

    private TextRecord createAllTextRecord() {
        TextRecord textRecord = new TextRecord();
        textRecord.setHorizontalAlignment((byte) 2);
        textRecord.setVerticalAlignment((byte) 2);
        textRecord.setDisplayMode((short) 1);
        textRecord.setRgbColor(0);
        textRecord.setX(-37);
        textRecord.setY(-60);
        textRecord.setWidth(0);
        textRecord.setHeight(0);
        textRecord.setAutoColor(true);
        textRecord.setShowKey(false);
        textRecord.setShowValue(true);
        textRecord.setVertical(false);
        textRecord.setAutoGeneratedText(true);
        textRecord.setGenerated(true);
        textRecord.setAutoLabelDeleted(false);
        textRecord.setAutoBackground(true);
        textRecord.setRotation((short) 0);
        textRecord.setShowCategoryLabelAsPercentage(false);
        textRecord.setShowValueAsPercentage(false);
        textRecord.setShowBubbleSizes(false);
        textRecord.setShowLabel(false);
        textRecord.setIndexOfColorValue((short) 77);
        textRecord.setDataLabelPlacement((short) 0);
        textRecord.setTextRotation((short) 0);
        return textRecord;
    }

    private AreaFormatRecord createAreaFormatRecord1() {
        AreaFormatRecord areaFormatRecord = new AreaFormatRecord();
        areaFormatRecord.setForegroundColor(16777215);
        areaFormatRecord.setBackgroundColor(0);
        areaFormatRecord.setPattern((short) 1);
        areaFormatRecord.setAutomatic(true);
        areaFormatRecord.setInvert(false);
        areaFormatRecord.setForecolorIndex((short) 78);
        areaFormatRecord.setBackcolorIndex((short) 77);
        return areaFormatRecord;
    }

    private AreaFormatRecord createAreaFormatRecord2() {
        AreaFormatRecord areaFormatRecord = new AreaFormatRecord();
        areaFormatRecord.setForegroundColor(12632256);
        areaFormatRecord.setBackgroundColor(0);
        areaFormatRecord.setPattern((short) 1);
        areaFormatRecord.setAutomatic(false);
        areaFormatRecord.setInvert(false);
        areaFormatRecord.setForecolorIndex((short) 22);
        areaFormatRecord.setBackcolorIndex((short) 79);
        return areaFormatRecord;
    }

    private AxisLineFormatRecord createAxisLineFormatRecord(short s4) {
        AxisLineFormatRecord axisLineFormatRecord = new AxisLineFormatRecord();
        axisLineFormatRecord.setAxisType(s4);
        return axisLineFormatRecord;
    }

    private AxisOptionsRecord createAxisOptionsRecord() {
        AxisOptionsRecord axisOptionsRecord = new AxisOptionsRecord();
        axisOptionsRecord.setMinimumCategory((short) -28644);
        axisOptionsRecord.setMaximumCategory((short) -28715);
        axisOptionsRecord.setMajorUnitValue((short) 2);
        axisOptionsRecord.setMajorUnit((short) 0);
        axisOptionsRecord.setMinorUnitValue((short) 1);
        axisOptionsRecord.setMinorUnit((short) 0);
        axisOptionsRecord.setBaseUnit((short) 0);
        axisOptionsRecord.setCrossingPoint((short) -28644);
        axisOptionsRecord.setDefaultMinimum(true);
        axisOptionsRecord.setDefaultMaximum(true);
        axisOptionsRecord.setDefaultMajor(true);
        axisOptionsRecord.setDefaultMinorUnit(true);
        axisOptionsRecord.setIsDate(true);
        axisOptionsRecord.setDefaultBase(true);
        axisOptionsRecord.setDefaultCross(true);
        axisOptionsRecord.setDefaultDateSettings(true);
        return axisOptionsRecord;
    }

    private AxisParentRecord createAxisParentRecord() {
        AxisParentRecord axisParentRecord = new AxisParentRecord();
        axisParentRecord.setAxisType((short) 0);
        axisParentRecord.setX(479);
        axisParentRecord.setY(221);
        axisParentRecord.setWidth(2995);
        axisParentRecord.setHeight(2902);
        return axisParentRecord;
    }

    private AxisRecord createAxisRecord(short s4) {
        AxisRecord axisRecord = new AxisRecord();
        axisRecord.setAxisType(s4);
        return axisRecord;
    }

    private void createAxisRecords(List<Record> list) {
        list.add(createAxisParentRecord());
        list.add(createBeginRecord());
        list.add(createAxisRecord((short) 0));
        list.add(createBeginRecord());
        list.add(createCategorySeriesAxisRecord());
        list.add(createAxisOptionsRecord());
        list.add(createTickRecord1());
        list.add(createEndRecord());
        list.add(createAxisRecord((short) 1));
        list.add(createBeginRecord());
        list.add(createValueRangeRecord());
        list.add(createTickRecord2());
        list.add(createAxisLineFormatRecord((short) 1));
        list.add(createLineFormatRecord(false));
        list.add(createEndRecord());
        list.add(createPlotAreaRecord());
        list.add(createFrameRecord2());
        list.add(createBeginRecord());
        list.add(createLineFormatRecord2());
        list.add(createAreaFormatRecord2());
        list.add(createEndRecord());
        list.add(createChartFormatRecord());
        list.add(createBeginRecord());
        list.add(createBarRecord());
        list.add(createLegendRecord());
        list.add(createBeginRecord());
        list.add(createTextRecord());
        list.add(createBeginRecord());
        list.add(createLinkedDataRecord());
        list.add(createEndRecord());
        list.add(createEndRecord());
        list.add(createEndRecord());
        list.add(createEndRecord());
    }

    private AxisUsedRecord createAxisUsedRecord(short s4) {
        AxisUsedRecord axisUsedRecord = new AxisUsedRecord();
        axisUsedRecord.setNumAxis(s4);
        return axisUsedRecord;
    }

    private BOFRecord createBOFRecord() {
        BOFRecord bOFRecord = new BOFRecord();
        bOFRecord.setVersion(OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD);
        bOFRecord.setType(20);
        bOFRecord.setBuild(7422);
        bOFRecord.setBuildYear(1997);
        bOFRecord.setHistoryBitMask(16585);
        bOFRecord.setRequiredVersion(106);
        return bOFRecord;
    }

    private BarRecord createBarRecord() {
        BarRecord barRecord = new BarRecord();
        barRecord.setBarSpace((short) 0);
        barRecord.setCategorySpace((short) 150);
        barRecord.setHorizontal(false);
        barRecord.setStacked(false);
        barRecord.setDisplayAsPercentage(false);
        barRecord.setShadow(false);
        return barRecord;
    }

    private BeginRecord createBeginRecord() {
        return new BeginRecord();
    }

    private LinkedDataRecord createCategoriesLinkedDataRecord() {
        LinkedDataRecord linkedDataRecord = new LinkedDataRecord();
        linkedDataRecord.setLinkType((byte) 2);
        linkedDataRecord.setReferenceType((byte) 2);
        linkedDataRecord.setCustomNumberFormat(false);
        linkedDataRecord.setIndexNumberFmtRecord((short) 0);
        linkedDataRecord.setFormulaOfLink(new Ptg[]{new Area3DPtg(0, 31, 1, 1, false, false, false, false, 0)});
        return linkedDataRecord;
    }

    private CategorySeriesAxisRecord createCategorySeriesAxisRecord() {
        CategorySeriesAxisRecord categorySeriesAxisRecord = new CategorySeriesAxisRecord();
        categorySeriesAxisRecord.setCrossingPoint((short) 1);
        categorySeriesAxisRecord.setLabelFrequency((short) 1);
        categorySeriesAxisRecord.setTickMarkFrequency((short) 1);
        categorySeriesAxisRecord.setValueAxisCrossing(true);
        categorySeriesAxisRecord.setCrossesFarRight(false);
        categorySeriesAxisRecord.setReversed(false);
        return categorySeriesAxisRecord;
    }

    private ChartFormatRecord createChartFormatRecord() {
        ChartFormatRecord chartFormatRecord = new ChartFormatRecord();
        chartFormatRecord.setXPosition(0);
        chartFormatRecord.setYPosition(0);
        chartFormatRecord.setWidth(0);
        chartFormatRecord.setHeight(0);
        chartFormatRecord.setVaryDisplayPattern(false);
        return chartFormatRecord;
    }

    private ChartRecord createChartRecord(int i10, int i11, int i12, int i13) {
        ChartRecord chartRecord = new ChartRecord();
        chartRecord.setX(i10);
        chartRecord.setY(i11);
        chartRecord.setWidth(i12);
        chartRecord.setHeight(i13);
        return chartRecord;
    }

    private DataFormatRecord createDataFormatRecord() {
        DataFormatRecord dataFormatRecord = new DataFormatRecord();
        dataFormatRecord.setPointNumber((short) -1);
        dataFormatRecord.setSeriesIndex((short) 0);
        dataFormatRecord.setSeriesNumber((short) 0);
        dataFormatRecord.setUseExcel4Colors(false);
        return dataFormatRecord;
    }

    private DefaultDataLabelTextPropertiesRecord createDefaultTextRecord(short s4) {
        DefaultDataLabelTextPropertiesRecord defaultDataLabelTextPropertiesRecord = new DefaultDataLabelTextPropertiesRecord();
        defaultDataLabelTextPropertiesRecord.setCategoryDataType(s4);
        return defaultDataLabelTextPropertiesRecord;
    }

    private DimensionsRecord createDimensionsRecord() {
        DimensionsRecord dimensionsRecord = new DimensionsRecord();
        dimensionsRecord.setFirstRow(0);
        dimensionsRecord.setLastRow(31);
        dimensionsRecord.setFirstCol((short) 0);
        dimensionsRecord.setLastCol((short) 1);
        return dimensionsRecord;
    }

    private LinkedDataRecord createDirectLinkRecord() {
        LinkedDataRecord linkedDataRecord = new LinkedDataRecord();
        linkedDataRecord.setLinkType((byte) 0);
        linkedDataRecord.setReferenceType((byte) 1);
        linkedDataRecord.setCustomNumberFormat(false);
        linkedDataRecord.setIndexNumberFmtRecord((short) 0);
        linkedDataRecord.setFormulaOfLink(null);
        return linkedDataRecord;
    }

    private EndRecord createEndRecord() {
        return new EndRecord();
    }

    private FontBasisRecord createFontBasisRecord1() {
        FontBasisRecord fontBasisRecord = new FontBasisRecord();
        fontBasisRecord.setXBasis((short) 9120);
        fontBasisRecord.setYBasis((short) 5640);
        fontBasisRecord.setHeightBasis((short) 200);
        fontBasisRecord.setScale((short) 0);
        fontBasisRecord.setIndexToFontTable((short) 5);
        return fontBasisRecord;
    }

    private FontBasisRecord createFontBasisRecord2() {
        FontBasisRecord createFontBasisRecord1 = createFontBasisRecord1();
        createFontBasisRecord1.setIndexToFontTable((short) 6);
        return createFontBasisRecord1;
    }

    private FontIndexRecord createFontIndexRecord(int i10) {
        FontIndexRecord fontIndexRecord = new FontIndexRecord();
        fontIndexRecord.setFontIndex((short) i10);
        return fontIndexRecord;
    }

    private FrameRecord createFrameRecord1() {
        FrameRecord frameRecord = new FrameRecord();
        frameRecord.setBorderType((short) 0);
        frameRecord.setAutoSize(false);
        frameRecord.setAutoPosition(true);
        return frameRecord;
    }

    private FrameRecord createFrameRecord2() {
        FrameRecord frameRecord = new FrameRecord();
        frameRecord.setBorderType((short) 0);
        frameRecord.setAutoSize(true);
        frameRecord.setAutoPosition(true);
        return frameRecord;
    }

    private HCenterRecord createHCenterRecord() {
        HCenterRecord hCenterRecord = new HCenterRecord();
        hCenterRecord.setHCenter(false);
        return hCenterRecord;
    }

    private LegendRecord createLegendRecord() {
        LegendRecord legendRecord = new LegendRecord();
        legendRecord.setXAxisUpperLeft(3542);
        legendRecord.setYAxisUpperLeft(1566);
        legendRecord.setXSize(437);
        legendRecord.setYSize(213);
        legendRecord.setType((byte) 3);
        legendRecord.setSpacing((byte) 1);
        legendRecord.setAutoPosition(true);
        legendRecord.setAutoSeries(true);
        legendRecord.setAutoXPositioning(true);
        legendRecord.setAutoYPositioning(true);
        legendRecord.setVertical(true);
        legendRecord.setDataTable(false);
        return legendRecord;
    }

    private LineFormatRecord createLineFormatRecord(boolean z10) {
        LineFormatRecord lineFormatRecord = new LineFormatRecord();
        lineFormatRecord.setLineColor(0);
        lineFormatRecord.setLinePattern((short) 0);
        lineFormatRecord.setWeight((short) -1);
        lineFormatRecord.setAuto(true);
        lineFormatRecord.setDrawTicks(z10);
        lineFormatRecord.setColourPaletteIndex((short) 77);
        return lineFormatRecord;
    }

    private LineFormatRecord createLineFormatRecord2() {
        LineFormatRecord lineFormatRecord = new LineFormatRecord();
        lineFormatRecord.setLineColor(8421504);
        lineFormatRecord.setLinePattern((short) 0);
        lineFormatRecord.setWeight((short) 0);
        lineFormatRecord.setAuto(false);
        lineFormatRecord.setDrawTicks(false);
        lineFormatRecord.setUnknown(false);
        lineFormatRecord.setColourPaletteIndex((short) 23);
        return lineFormatRecord;
    }

    private LinkedDataRecord createLinkedDataRecord() {
        LinkedDataRecord linkedDataRecord = new LinkedDataRecord();
        linkedDataRecord.setLinkType((byte) 0);
        linkedDataRecord.setReferenceType((byte) 1);
        linkedDataRecord.setCustomNumberFormat(false);
        linkedDataRecord.setIndexNumberFmtRecord((short) 0);
        linkedDataRecord.setFormulaOfLink(null);
        return linkedDataRecord;
    }

    private UnknownRecord createMSDrawingObjectRecord() {
        return new UnknownRecord(236, new byte[]{15, 0, 2, -16, -64, 0, 0, 0, 16, 0, 8, -16, 8, 0, 0, 0, 2, 0, 0, 0, 2, 4, 0, 0, 15, 0, 3, -16, -88, 0, 0, 0, 15, 0, 4, -16, Field.DATA, 0, 0, 0, 1, 0, 9, -16, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 10, -16, 8, 0, 0, 0, 0, 4, 0, 0, 5, 0, 0, 0, 15, 0, 4, -16, 112, 0, 0, 0, -110, 12, 10, -16, 8, 0, 0, 0, 2, 4, 0, 0, 0, 10, 0, 0, -109, 0, 11, -16, Field.AUTONUM, 0, 0, 0, Byte.MAX_VALUE, 0, 4, 1, 4, 1, -65, 0, 8, 0, 8, 0, -127, 1, 78, 0, 0, 8, -125, 1, 77, 0, 0, 8, -65, 1, 16, 0, 17, 0, -64, 1, 77, 0, 0, 8, -1, 1, 8, 0, 8, 0, Field.BARCODE, 2, 0, 0, 2, 0, -65, 3, 0, 0, 8, 0, 0, 0, 16, -16, 18, 0, 0, 0, 0, 0, 4, 0, -64, 2, 10, 0, -12, 0, 14, 0, 102, 1, 32, 0, -23, 0, 0, 0, 17, -16, 0, 0, 0, 0});
    }

    private UnknownRecord createOBJRecord() {
        return new UnknownRecord(93, new byte[]{21, 0, 18, 0, 5, 0, 2, 0, 17, 96, 0, 0, 0, 0, -72, 3, -121, 3, 0, 0, 0, 0, 0, 0, 0, 0});
    }

    private PlotAreaRecord createPlotAreaRecord() {
        return new PlotAreaRecord();
    }

    private PlotGrowthRecord createPlotGrowthRecord(int i10, int i11) {
        PlotGrowthRecord plotGrowthRecord = new PlotGrowthRecord();
        plotGrowthRecord.setHorizontalScale(i10);
        plotGrowthRecord.setVerticalScale(i11);
        return plotGrowthRecord;
    }

    private PrintSetupRecord createPrintSetupRecord() {
        PrintSetupRecord printSetupRecord = new PrintSetupRecord();
        printSetupRecord.setPaperSize((short) 0);
        printSetupRecord.setScale((short) 18);
        printSetupRecord.setPageStart((short) 1);
        printSetupRecord.setFitWidth((short) 1);
        printSetupRecord.setFitHeight((short) 1);
        printSetupRecord.setLeftToRight(false);
        printSetupRecord.setLandscape(false);
        printSetupRecord.setValidSettings(true);
        printSetupRecord.setNoColor(false);
        printSetupRecord.setDraft(false);
        printSetupRecord.setNotes(false);
        printSetupRecord.setNoOrientation(false);
        printSetupRecord.setUsePage(false);
        printSetupRecord.setHResolution((short) 0);
        printSetupRecord.setVResolution((short) 0);
        printSetupRecord.setHeaderMargin(0.5d);
        printSetupRecord.setFooterMargin(0.5d);
        printSetupRecord.setCopies((short) 15);
        return printSetupRecord;
    }

    private SCLRecord createSCLRecord(short s4, short s10) {
        SCLRecord sCLRecord = new SCLRecord();
        sCLRecord.setDenominator(s10);
        sCLRecord.setNumerator(s4);
        return sCLRecord;
    }

    private SeriesIndexRecord createSeriesIndexRecord(int i10) {
        SeriesIndexRecord seriesIndexRecord = new SeriesIndexRecord();
        seriesIndexRecord.setIndex((short) i10);
        return seriesIndexRecord;
    }

    private SeriesRecord createSeriesRecord() {
        SeriesRecord seriesRecord = new SeriesRecord();
        seriesRecord.setCategoryDataType((short) 1);
        seriesRecord.setValuesDataType((short) 1);
        seriesRecord.setNumCategories((short) 32);
        seriesRecord.setNumValues((short) 31);
        seriesRecord.setBubbleSeriesType((short) 1);
        seriesRecord.setNumBubbleValues((short) 0);
        return seriesRecord;
    }

    private SeriesToChartGroupRecord createSeriesToChartGroupRecord() {
        return new SeriesToChartGroupRecord();
    }

    private SheetPropertiesRecord createSheetPropsRecord() {
        SheetPropertiesRecord sheetPropertiesRecord = new SheetPropertiesRecord();
        sheetPropertiesRecord.setChartTypeManuallyFormatted(false);
        sheetPropertiesRecord.setPlotVisibleOnly(true);
        sheetPropertiesRecord.setDoNotSizeWithWindow(false);
        sheetPropertiesRecord.setDefaultPlotDimensions(true);
        sheetPropertiesRecord.setAutoPlotArea(false);
        return sheetPropertiesRecord;
    }

    private TextRecord createTextRecord() {
        TextRecord textRecord = new TextRecord();
        textRecord.setHorizontalAlignment((byte) 2);
        textRecord.setVerticalAlignment((byte) 2);
        textRecord.setDisplayMode((short) 1);
        textRecord.setRgbColor(0);
        textRecord.setX(-37);
        textRecord.setY(-60);
        textRecord.setWidth(0);
        textRecord.setHeight(0);
        textRecord.setAutoColor(true);
        textRecord.setShowKey(false);
        textRecord.setShowValue(false);
        textRecord.setVertical(false);
        textRecord.setAutoGeneratedText(true);
        textRecord.setGenerated(true);
        textRecord.setAutoLabelDeleted(false);
        textRecord.setAutoBackground(true);
        textRecord.setRotation((short) 0);
        textRecord.setShowCategoryLabelAsPercentage(false);
        textRecord.setShowValueAsPercentage(false);
        textRecord.setShowBubbleSizes(false);
        textRecord.setShowLabel(false);
        textRecord.setIndexOfColorValue((short) 77);
        textRecord.setDataLabelPlacement((short) 0);
        textRecord.setTextRotation((short) 0);
        return textRecord;
    }

    private TickRecord createTickRecord1() {
        TickRecord tickRecord = new TickRecord();
        tickRecord.setMajorTickType((byte) 2);
        tickRecord.setMinorTickType((byte) 0);
        tickRecord.setLabelPosition((byte) 3);
        tickRecord.setBackground((byte) 1);
        tickRecord.setLabelColorRgb(0);
        tickRecord.setZero1(0);
        tickRecord.setZero2(0);
        tickRecord.setZero3((short) 45);
        tickRecord.setAutorotate(true);
        tickRecord.setAutoTextBackground(true);
        tickRecord.setRotation((short) 0);
        tickRecord.setAutorotate(true);
        tickRecord.setTickColor((short) 77);
        return tickRecord;
    }

    private TickRecord createTickRecord2() {
        TickRecord createTickRecord1 = createTickRecord1();
        createTickRecord1.setZero3((short) 0);
        return createTickRecord1;
    }

    private LinkedDataRecord createTitleLinkedDataRecord() {
        LinkedDataRecord linkedDataRecord = new LinkedDataRecord();
        linkedDataRecord.setLinkType((byte) 0);
        linkedDataRecord.setReferenceType((byte) 1);
        linkedDataRecord.setCustomNumberFormat(false);
        linkedDataRecord.setIndexNumberFmtRecord((short) 0);
        linkedDataRecord.setFormulaOfLink(null);
        return linkedDataRecord;
    }

    private UnitsRecord createUnitsRecord() {
        UnitsRecord unitsRecord = new UnitsRecord();
        unitsRecord.setUnits((short) 0);
        return unitsRecord;
    }

    private TextRecord createUnknownTextRecord() {
        TextRecord textRecord = new TextRecord();
        textRecord.setHorizontalAlignment((byte) 2);
        textRecord.setVerticalAlignment((byte) 2);
        textRecord.setDisplayMode((short) 1);
        textRecord.setRgbColor(0);
        textRecord.setX(-37);
        textRecord.setY(-60);
        textRecord.setWidth(0);
        textRecord.setHeight(0);
        textRecord.setAutoColor(true);
        textRecord.setShowKey(false);
        textRecord.setShowValue(false);
        textRecord.setVertical(false);
        textRecord.setAutoGeneratedText(true);
        textRecord.setGenerated(true);
        textRecord.setAutoLabelDeleted(false);
        textRecord.setAutoBackground(true);
        textRecord.setRotation((short) 0);
        textRecord.setShowCategoryLabelAsPercentage(false);
        textRecord.setShowValueAsPercentage(false);
        textRecord.setShowBubbleSizes(false);
        textRecord.setShowLabel(false);
        textRecord.setIndexOfColorValue((short) 77);
        textRecord.setDataLabelPlacement((short) 11088);
        textRecord.setTextRotation((short) 0);
        return textRecord;
    }

    private VCenterRecord createVCenterRecord() {
        VCenterRecord vCenterRecord = new VCenterRecord();
        vCenterRecord.setVCenter(false);
        return vCenterRecord;
    }

    private ValueRangeRecord createValueRangeRecord() {
        ValueRangeRecord valueRangeRecord = new ValueRangeRecord();
        valueRangeRecord.setMinimumAxisValue(0.0d);
        valueRangeRecord.setMaximumAxisValue(0.0d);
        valueRangeRecord.setMajorIncrement(0.0d);
        valueRangeRecord.setMinorIncrement(0.0d);
        valueRangeRecord.setCategoryAxisCross(0.0d);
        valueRangeRecord.setAutomaticMinimum(true);
        valueRangeRecord.setAutomaticMaximum(true);
        valueRangeRecord.setAutomaticMajor(true);
        valueRangeRecord.setAutomaticMinor(true);
        valueRangeRecord.setAutomaticCategoryCrossing(true);
        valueRangeRecord.setLogarithmicScale(false);
        valueRangeRecord.setValuesInReverse(false);
        valueRangeRecord.setCrossCategoryAxisAtMaximum(false);
        valueRangeRecord.setReserved(true);
        return valueRangeRecord;
    }

    private LinkedDataRecord createValuesLinkedDataRecord() {
        LinkedDataRecord linkedDataRecord = new LinkedDataRecord();
        linkedDataRecord.setLinkType((byte) 1);
        linkedDataRecord.setReferenceType((byte) 2);
        linkedDataRecord.setCustomNumberFormat(false);
        linkedDataRecord.setIndexNumberFmtRecord((short) 0);
        linkedDataRecord.setFormulaOfLink(new Ptg[]{new Area3DPtg(0, 31, 0, 0, false, false, false, false, 0)});
        return linkedDataRecord;
    }

    public static HSSFChart[] getSheetCharts(HSSFSheet hSSFSheet) {
        ArrayList arrayList = new ArrayList();
        HSSFChart hSSFChart = null;
        HSSFSeries hSSFSeries = null;
        for (RecordBase recordBase : hSSFSheet.getSheet().getRecords()) {
            if (recordBase instanceof ChartRecord) {
                hSSFChart = new HSSFChart(null, null, null, null);
                hSSFChart.setChartRecord((ChartRecord) recordBase);
                arrayList.add(hSSFChart);
                hSSFSeries = null;
            } else if (recordBase instanceof LegendRecord) {
                hSSFChart.legendRecord = (LegendRecord) recordBase;
            } else if (recordBase instanceof SeriesRecord) {
                Objects.requireNonNull(hSSFChart);
                hSSFSeries = new HSSFSeries((SeriesRecord) recordBase);
                hSSFChart.series.add(hSSFSeries);
            } else if (recordBase instanceof ChartTitleFormatRecord) {
                hSSFChart.chartTitleFormat = (ChartTitleFormatRecord) recordBase;
            } else if (recordBase instanceof SeriesTextRecord) {
                SeriesTextRecord seriesTextRecord = (SeriesTextRecord) recordBase;
                if (hSSFChart.legendRecord == null && hSSFChart.series.size() > 0) {
                    ((HSSFSeries) a.f(hSSFChart.series, -1)).seriesTitleText = seriesTextRecord;
                }
            } else if (recordBase instanceof LinkedDataRecord) {
                LinkedDataRecord linkedDataRecord = (LinkedDataRecord) recordBase;
                if (hSSFSeries != null) {
                    hSSFSeries.insertData(linkedDataRecord);
                }
            } else if (recordBase instanceof ValueRangeRecord) {
                hSSFChart.valueRanges.add((ValueRangeRecord) recordBase);
            } else if ((recordBase instanceof Record) && hSSFChart != null) {
                Record record = (Record) recordBase;
                HSSFChartType[] values = HSSFChartType.values();
                int length = values.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    HSSFChartType hSSFChartType = values[i10];
                    if (hSSFChartType != HSSFChartType.Unknown && record.getSid() == hSSFChartType.getSid()) {
                        hSSFChart.type = hSSFChartType;
                        break;
                    }
                    i10++;
                }
            }
        }
        return (HSSFChart[]) arrayList.toArray(new HSSFChart[arrayList.size()]);
    }

    public void createBarChart(HSSFWorkbook hSSFWorkbook, HSSFSheet hSSFSheet) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(createMSDrawingObjectRecord());
        arrayList.add(createOBJRecord());
        arrayList.add(createBOFRecord());
        arrayList.add(new HeaderRecord(""));
        arrayList.add(new FooterRecord(""));
        arrayList.add(createHCenterRecord());
        arrayList.add(createVCenterRecord());
        arrayList.add(createPrintSetupRecord());
        arrayList.add(createFontBasisRecord1());
        arrayList.add(createFontBasisRecord2());
        arrayList.add(new ProtectRecord(false));
        arrayList.add(createUnitsRecord());
        arrayList.add(createChartRecord(0, 0, 30434904, 19031616));
        arrayList.add(createBeginRecord());
        arrayList.add(createSCLRecord((short) 1, (short) 1));
        arrayList.add(createPlotGrowthRecord(65536, 65536));
        arrayList.add(createFrameRecord1());
        arrayList.add(createBeginRecord());
        arrayList.add(createLineFormatRecord(true));
        arrayList.add(createAreaFormatRecord1());
        arrayList.add(createEndRecord());
        arrayList.add(createSeriesRecord());
        arrayList.add(createBeginRecord());
        arrayList.add(createTitleLinkedDataRecord());
        arrayList.add(createValuesLinkedDataRecord());
        arrayList.add(createCategoriesLinkedDataRecord());
        arrayList.add(createDataFormatRecord());
        arrayList.add(createSeriesToChartGroupRecord());
        arrayList.add(createEndRecord());
        arrayList.add(createSheetPropsRecord());
        arrayList.add(createDefaultTextRecord((short) 2));
        arrayList.add(createAllTextRecord());
        arrayList.add(createBeginRecord());
        arrayList.add(createFontIndexRecord(5));
        arrayList.add(createDirectLinkRecord());
        arrayList.add(createEndRecord());
        arrayList.add(createDefaultTextRecord((short) 3));
        arrayList.add(createUnknownTextRecord());
        arrayList.add(createBeginRecord());
        arrayList.add(createFontIndexRecord(6));
        arrayList.add(createDirectLinkRecord());
        arrayList.add(createEndRecord());
        arrayList.add(createAxisUsedRecord((short) 1));
        createAxisRecords(arrayList);
        arrayList.add(createEndRecord());
        arrayList.add(createDimensionsRecord());
        arrayList.add(createSeriesIndexRecord(2));
        arrayList.add(createSeriesIndexRecord(1));
        arrayList.add(createSeriesIndexRecord(3));
        arrayList.add(EOFRecord.instance);
        hSSFSheet.insertChartRecords(arrayList);
        hSSFWorkbook.insertChartRecord();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14, types: [lib.zj.office.fc.hssf.record.chart.DataFormatRecord] */
    /* JADX WARN: Type inference failed for: r5v20, types: [lib.zj.office.fc.hssf.record.chart.SeriesRecord] */
    /* JADX WARN: Type inference failed for: r5v21, types: [lib.zj.office.fc.hssf.record.chart.EndRecord] */
    /* JADX WARN: Type inference failed for: r5v23, types: [lib.zj.office.fc.hssf.record.chart.BeginRecord] */
    /* JADX WARN: Type inference failed for: r5v8, types: [lib.zj.office.fc.hssf.record.Record] */
    public HSSFSeries createSeries() {
        SeriesTextRecord seriesTextRecord;
        ArrayList arrayList = new ArrayList();
        List<RecordBase> records = this.sheet.getSheet().getRecords();
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        for (RecordBase recordBase : records) {
            i10++;
            if (recordBase instanceof BeginRecord) {
                i11++;
            } else if (recordBase instanceof EndRecord) {
                i11--;
                if (i13 == i11) {
                    if (!z10) {
                        arrayList.add(recordBase);
                        i15 = i10;
                        i13 = -1;
                        z10 = true;
                    } else {
                        i15 = i10;
                        i13 = -1;
                    }
                }
                if (i16 == i11) {
                    break;
                }
            }
            if (recordBase instanceof ChartRecord) {
                if (recordBase == this.chartRecord) {
                    i14 = i10;
                    i16 = i11;
                }
            } else if ((recordBase instanceof SeriesRecord) && i14 != -1) {
                i12++;
                i13 = i11;
            }
            if (i13 != -1 && !z10) {
                arrayList.add(recordBase);
            }
        }
        if (i15 == -1) {
            return null;
        }
        int i17 = i15 + 1;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        HSSFSeries hSSFSeries = null;
        while (it.hasNext()) {
            RecordBase recordBase2 = (RecordBase) it.next();
            if (recordBase2 instanceof BeginRecord) {
                hSSFSeries = hSSFSeries;
                seriesTextRecord = new BeginRecord();
            } else if (recordBase2 instanceof EndRecord) {
                hSSFSeries = hSSFSeries;
                seriesTextRecord = new EndRecord();
            } else if (recordBase2 instanceof SeriesRecord) {
                ?? r52 = (SeriesRecord) ((SeriesRecord) recordBase2).clone();
                hSSFSeries = new HSSFSeries(r52);
                seriesTextRecord = r52;
            } else if (recordBase2 instanceof LinkedDataRecord) {
                LinkedDataRecord linkedDataRecord = (LinkedDataRecord) ((LinkedDataRecord) recordBase2).clone();
                hSSFSeries = hSSFSeries;
                seriesTextRecord = linkedDataRecord;
                if (hSSFSeries != null) {
                    hSSFSeries.insertData(linkedDataRecord);
                    hSSFSeries = hSSFSeries;
                    seriesTextRecord = linkedDataRecord;
                }
            } else if (recordBase2 instanceof DataFormatRecord) {
                ?? r53 = (DataFormatRecord) ((DataFormatRecord) recordBase2).clone();
                short s4 = (short) i12;
                r53.setSeriesIndex(s4);
                r53.setSeriesNumber(s4);
                hSSFSeries = hSSFSeries;
                seriesTextRecord = r53;
            } else if (recordBase2 instanceof SeriesTextRecord) {
                SeriesTextRecord seriesTextRecord2 = (SeriesTextRecord) ((SeriesTextRecord) recordBase2).clone();
                hSSFSeries = hSSFSeries;
                seriesTextRecord = seriesTextRecord2;
                if (hSSFSeries != null) {
                    hSSFSeries.setSeriesTitleText(seriesTextRecord2);
                    hSSFSeries = hSSFSeries;
                    seriesTextRecord = seriesTextRecord2;
                }
            } else if (recordBase2 instanceof Record) {
                hSSFSeries = hSSFSeries;
                seriesTextRecord = (Record) ((Record) recordBase2).clone();
            } else {
                seriesTextRecord = null;
                hSSFSeries = hSSFSeries;
            }
            if (seriesTextRecord != null) {
                arrayList2.add(seriesTextRecord);
            }
        }
        if (hSSFSeries == null) {
            return null;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            records.add(i17, (RecordBase) it2.next());
            i17++;
        }
        return hSSFSeries;
    }

    public int getChartHeight() {
        return this.chartRecord.getHeight();
    }

    public ChartRecord getChartRecord() {
        return this.chartRecord;
    }

    public ChartTitleFormatRecord getChartTitleFormat() {
        return this.chartTitleFormat;
    }

    public int getChartWidth() {
        return this.chartRecord.getWidth();
    }

    public int getChartX() {
        return this.chartRecord.getX();
    }

    public int getChartY() {
        return this.chartRecord.getY();
    }

    public LegendRecord getLegendRecord() {
        return this.legendRecord;
    }

    public AreaFormatRecord getMarginColorFormat() {
        return this.marginColorFormat;
    }

    public HSSFSeries[] getSeries() {
        List<HSSFSeries> list = this.series;
        return (HSSFSeries[]) list.toArray(new HSSFSeries[list.size()]);
    }

    public AreaFormatRecord getSeriesBackgroundColorFormat() {
        return this.seriesBackgroundColorFormat;
    }

    public Map<SeriesTextRecord, Record> getSeriesText() {
        return this.chartSeriesText;
    }

    public HSSFChartType getType() {
        return this.type;
    }

    public List<ValueRangeRecord> getValueRangeRecord() {
        return this.valueRanges;
    }

    public void removeSeries(HSSFSeries hSSFSeries) {
        this.series.remove(hSSFSeries);
    }

    public void setChartHeight(int i10) {
        this.chartRecord.setHeight(i10);
    }

    public void setChartRecord(ChartRecord chartRecord) {
        this.chartRecord = chartRecord;
    }

    public void setChartWidth(int i10) {
        this.chartRecord.setWidth(i10);
    }

    public void setChartX(int i10) {
        this.chartRecord.setX(i10);
    }

    public void setChartY(int i10) {
        this.chartRecord.setY(i10);
    }

    public void setValueRange(int i10, Double d10, Double d11, Double d12, Double d13) {
        ValueRangeRecord valueRangeRecord = this.valueRanges.get(i10);
        if (valueRangeRecord == null) {
            return;
        }
        if (d10 != null) {
            valueRangeRecord.setAutomaticMinimum(d10.isNaN());
            valueRangeRecord.setMinimumAxisValue(d10.doubleValue());
        }
        if (d11 != null) {
            valueRangeRecord.setAutomaticMaximum(d11.isNaN());
            valueRangeRecord.setMaximumAxisValue(d11.doubleValue());
        }
        if (d12 != null) {
            valueRangeRecord.setAutomaticMajor(d12.isNaN());
            valueRangeRecord.setMajorIncrement(d12.doubleValue());
        }
        if (d13 != null) {
            valueRangeRecord.setAutomaticMinor(d13.isNaN());
            valueRangeRecord.setMinorIncrement(d13.doubleValue());
        }
    }
}
