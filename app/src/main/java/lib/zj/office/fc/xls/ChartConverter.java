package lib.zj.office.fc.xls;

import com.android.billingclient.api.a0;
import di.c;
import ii.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hssf.formula.EvaluationWorkbook;
import lib.zj.office.fc.hssf.formula.eval.AreaEval;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.ptg.Area3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.MemFuncPtg;
import lib.zj.office.fc.hssf.formula.ptg.NameXPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.formula.ptg.Ref3DPtg;
import lib.zj.office.fc.hssf.model.InternalWorkbook;
import lib.zj.office.fc.hssf.record.FormulaRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.aggregates.FormulaRecordAggregate;
import lib.zj.office.fc.hssf.record.chart.ObjectLinkRecord;
import lib.zj.office.fc.hssf.record.chart.SeriesTextRecord;
import lib.zj.office.fc.hssf.record.chart.ValueRangeRecord;
import lib.zj.office.fc.hssf.usermodel.HSSFCell;
import lib.zj.office.fc.hssf.usermodel.HSSFChart;
import lib.zj.office.fc.hssf.usermodel.HSSFDataFormat;
import lib.zj.office.fc.hssf.usermodel.HSSFFormulaEvaluator;
import lib.zj.office.fc.hssf.usermodel.HSSFName;
import lib.zj.office.ss.util.format.NumericFormatter;
import lib.zj.office.thirdpart.achartengine.chart.ColumnBarChart;
import lib.zj.office.thirdpart.achartengine.chart.PointStyle;
import lib.zj.office.thirdpart.achartengine.model.CategorySeries;
import lib.zj.office.thirdpart.achartengine.model.XYMultipleSeriesDataset;
import lib.zj.office.thirdpart.achartengine.model.XYSeries;
import lib.zj.office.thirdpart.achartengine.renderers.DefaultRenderer;
import lib.zj.office.thirdpart.achartengine.renderers.SimpleSeriesRenderer;
import lib.zj.office.thirdpart.achartengine.renderers.XYMultipleSeriesRenderer;
import lib.zj.office.thirdpart.achartengine.renderers.XYSeriesRenderer;
import ui.a;
import ui.b;
import ui.e;
import zh.l;

/* loaded from: classes3.dex */
public class ChartConverter {
    private static ChartConverter converter = new ChartConverter();
    private a chart;
    private Map<SeriesTextRecord, Record> chartSeriesText;
    double maxY;
    double minY;
    private InternalWorkbook workbook;

    private XYMultipleSeriesRenderer buildXYMultipleSeriesRenderer(c cVar, HSSFChart hSSFChart) {
        return buildXYMultipleSeriesRenderer(cVar, hSSFChart, null);
    }

    private a convertToAChart(c cVar, HSSFChart hSSFChart) {
        XYMultipleSeriesDataset xYMultipleSeriesDataset;
        XYMultipleSeriesDataset xYMultipleSeriesDataset2;
        XYMultipleSeriesDataset xYMultipleSeriesDataset3;
        PointStyle[] pointStyleArr = {PointStyle.DIAMOND, PointStyle.SQUARE, PointStyle.TRIANGLE, PointStyle.X, PointStyle.CIRCLE};
        short chartType = getChartType(hSSFChart);
        if (chartType != 2) {
            if (chartType != 3) {
                if (chartType != 4) {
                    try {
                        XYMultipleSeriesRenderer buildXYMultipleSeriesRenderer = buildXYMultipleSeriesRenderer(cVar, hSSFChart);
                        if (buildXYMultipleSeriesRenderer == null || (xYMultipleSeriesDataset2 = getXYMultipleSeriesDataset(cVar, hSSFChart, buildXYMultipleSeriesRenderer, (short) 1)) == null) {
                            return null;
                        }
                        setChartSettings(buildXYMultipleSeriesRenderer, xYMultipleSeriesDataset2, hSSFChart);
                        ColumnBarChart.Type type = ColumnBarChart.Type.DEFAULT;
                        ti.a.a(xYMultipleSeriesDataset2, buildXYMultipleSeriesRenderer);
                        return new ColumnBarChart(xYMultipleSeriesDataset2, buildXYMultipleSeriesRenderer, type);
                    } catch (Exception unused) {
                        return null;
                    }
                }
                XYMultipleSeriesRenderer buildXYMultipleSeriesRenderer2 = buildXYMultipleSeriesRenderer(cVar, hSSFChart, pointStyleArr);
                if (buildXYMultipleSeriesRenderer2 == null || (xYMultipleSeriesDataset3 = getXYMultipleSeriesDataset(cVar, hSSFChart, buildXYMultipleSeriesRenderer2, (short) 4)) == null) {
                    return null;
                }
                setChartSettings(buildXYMultipleSeriesRenderer2, xYMultipleSeriesDataset3, hSSFChart);
                for (int i10 = 0; i10 < buildXYMultipleSeriesRenderer2.getSeriesRendererCount(); i10++) {
                    ((XYSeriesRenderer) buildXYMultipleSeriesRenderer2.getSeriesRendererAt(i10)).setFillPoints(true);
                }
                ti.a.a(xYMultipleSeriesDataset3, buildXYMultipleSeriesRenderer2);
                return new e(xYMultipleSeriesDataset3, buildXYMultipleSeriesRenderer2);
            }
            DefaultRenderer buildDefaultRenderer = buildDefaultRenderer(cVar, hSSFChart);
            if (buildDefaultRenderer == null) {
                return null;
            }
            buildDefaultRenderer.setZoomEnabled(true);
            CategorySeries buildCategoryDataset = buildCategoryDataset(cVar, hSSFChart);
            if (buildCategoryDataset == null) {
                return null;
            }
            if (buildCategoryDataset.getItemCount() == buildDefaultRenderer.getSeriesRendererCount()) {
                return new ui.c(buildCategoryDataset, buildDefaultRenderer);
            }
            throw new IllegalArgumentException("Dataset and renderer should be not null and the dataset number of items should be equal to the number of series renderers");
        }
        XYMultipleSeriesRenderer buildXYMultipleSeriesRenderer3 = buildXYMultipleSeriesRenderer(cVar, hSSFChart, pointStyleArr);
        if (buildXYMultipleSeriesRenderer3 == null || (xYMultipleSeriesDataset = getXYMultipleSeriesDataset(cVar, hSSFChart, buildXYMultipleSeriesRenderer3, (short) 2)) == null) {
            return null;
        }
        setChartSettings(buildXYMultipleSeriesRenderer3, xYMultipleSeriesDataset, hSSFChart);
        buildXYMultipleSeriesRenderer3.setYLabels(10);
        ti.a.a(xYMultipleSeriesDataset, buildXYMultipleSeriesRenderer3);
        return new b(xYMultipleSeriesDataset, buildXYMultipleSeriesRenderer3);
    }

    private ValueEval evaluate(c cVar, HSSFName hSSFName) {
        di.a aVar;
        short s4;
        int i10 = cVar.f16602b;
        int i11 = cVar.c;
        while (true) {
            if (i10 <= i11) {
                di.b bVar = (di.b) cVar.g(cVar.c);
                int i12 = bVar.f16595b;
                if (i12 > 0) {
                    s4 = (short) (i12 - 1);
                } else {
                    int i13 = bVar.c;
                    if (i13 < HSSFCell.LAST_COLUMN_NUMBER) {
                        s4 = (short) (i13 + 1);
                    } else {
                        s4 = -1;
                    }
                }
                if (s4 >= 0) {
                    di.e eVar = (di.e) cVar.f16601a;
                    aVar = new di.a(cVar, i10, s4);
                    break;
                }
                i10++;
            } else {
                aVar = null;
                break;
            }
        }
        if (aVar == null) {
            return null;
        }
        Ptg[] refersToFormulaDefinition = hSSFName.getRefersToFormulaDefinition();
        aVar.r(2, aVar.f16202i.getRow(), aVar.f16202i.getColumn(), aVar.f16202i.getXFIndex());
        FormulaRecordAggregate formulaRecordAggregate = (FormulaRecordAggregate) aVar.f16202i;
        FormulaRecord formulaRecord = formulaRecordAggregate.getFormulaRecord();
        formulaRecord.setOptions((short) 2);
        formulaRecord.setValue(0.0d);
        if (formulaRecordAggregate.getXFIndex() == 0) {
            formulaRecordAggregate.setXFIndex((short) 15);
        }
        formulaRecordAggregate.setParsedExpression(refersToFormulaDefinition);
        ValueEval evaluateFormulaValueEval = new HSSFFormulaEvaluator((di.e) cVar.f16601a).evaluateFormulaValueEval(aVar);
        a0 a0Var = aVar.f16593g;
        if (a0Var != null) {
            a0Var.e();
        }
        return evaluateFormulaValueEval;
    }

    private String getCategory(ei.c cVar, Area3DPtg area3DPtg, int i10) {
        ei.a e10;
        ei.a e11;
        if (area3DPtg.getFirstColumn() == area3DPtg.getLastColumn()) {
            ei.b g10 = cVar.g(area3DPtg.getFirstRow() + i10);
            if (g10 != null && (e11 = g10.e(area3DPtg.getFirstColumn(), true)) != null) {
                return getFormatContents(cVar, e11);
            }
            return String.valueOf(i10 + 1);
        } else if (area3DPtg.getFirstRow() == area3DPtg.getLastRow()) {
            ei.b g11 = cVar.g(area3DPtg.getFirstRow());
            if (g11 != null && (e10 = g11.e(area3DPtg.getFirstColumn() + i10, true)) != null) {
                return getFormatContents(cVar, e10);
            }
            return String.valueOf(i10 + 1);
        } else {
            return "";
        }
    }

    private double getCellNumericValue(ei.c cVar, ei.a aVar) {
        if (aVar == null || aVar.f16589b != 0) {
            return 0.0d;
        }
        return aVar.f();
    }

    private List<Double> getData(c cVar, Ptg[] ptgArr) {
        ei.c p10;
        ei.c p11;
        double d10;
        ei.c p12;
        double d11;
        double d12;
        if (ptgArr == null || ptgArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Ptg ptg = ptgArr[0];
        double d13 = 0.0d;
        if (ptg instanceof Area3DPtg) {
            Area3DPtg area3DPtg = (Area3DPtg) ptg;
            EvaluationWorkbook.ExternalSheet externalSheet = this.workbook.getExternalSheet(area3DPtg.getExternSheetIndex());
            if (externalSheet == null) {
                p12 = cVar.f16601a.o(this.workbook.getSheetIndexFromExternSheetIndex(area3DPtg.getExternSheetIndex()));
            } else {
                p12 = cVar.f16601a.p(externalSheet.getSheetName());
            }
            if (area3DPtg.getFirstRow() == area3DPtg.getLastRow()) {
                ei.b g10 = p12.g(area3DPtg.getFirstRow());
                for (int firstColumn = area3DPtg.getFirstColumn(); firstColumn <= area3DPtg.getLastColumn(); firstColumn++) {
                    if (g10 != null) {
                        d12 = getCellNumericValue(p12, g10.e(firstColumn, true));
                    } else {
                        d12 = 0.0d;
                    }
                    arrayList.add(Double.valueOf(d12));
                }
            } else if (area3DPtg.getFirstColumn() == area3DPtg.getLastColumn()) {
                for (int firstRow = area3DPtg.getFirstRow(); firstRow <= area3DPtg.getLastRow(); firstRow++) {
                    ei.b g11 = p12.g(firstRow);
                    if (g11 != null) {
                        d11 = getCellNumericValue(p12, g11.e(area3DPtg.getFirstColumn(), true));
                    } else {
                        d11 = 0.0d;
                    }
                    arrayList.add(Double.valueOf(d11));
                }
            }
        } else if (ptg instanceof MemFuncPtg) {
            for (Ptg ptg2 : ptgArr) {
                if (ptg2 instanceof Ref3DPtg) {
                    Ref3DPtg ref3DPtg = (Ref3DPtg) ptg2;
                    EvaluationWorkbook.ExternalSheet externalSheet2 = this.workbook.getExternalSheet(ref3DPtg.getExternSheetIndex());
                    if (externalSheet2 == null) {
                        p11 = cVar.f16601a.o(this.workbook.getSheetIndexFromExternSheetIndex(ref3DPtg.getExternSheetIndex()));
                    } else {
                        p11 = cVar.f16601a.p(externalSheet2.getSheetName());
                    }
                    ei.b g12 = p11.g(ref3DPtg.getRow());
                    if (g12 != null) {
                        d10 = getCellNumericValue(p11, g12.e(ref3DPtg.getColumn(), true));
                    } else {
                        d10 = 0.0d;
                    }
                    arrayList.add(Double.valueOf(d10));
                }
            }
        } else if (ptg instanceof NameXPtg) {
            try {
                ValueEval evaluate = evaluate(cVar, ((di.e) cVar.f16601a).t(((NameXPtg) ptg).getNameIndex()));
                if (evaluate instanceof AreaEval) {
                    AreaEval areaEval = (AreaEval) evaluate;
                    if (areaEval.getFirstRow() == areaEval.getLastRow()) {
                        for (int firstColumn2 = areaEval.getFirstColumn(); firstColumn2 <= areaEval.getLastColumn(); firstColumn2++) {
                            arrayList.add(Double.valueOf(((NumberEval) areaEval.getAbsoluteValue(areaEval.getFirstRow(), firstColumn2)).getNumberValue()));
                        }
                    } else if (areaEval.getFirstColumn() == areaEval.getLastColumn()) {
                        for (int firstRow2 = areaEval.getFirstRow(); firstRow2 <= areaEval.getLastRow(); firstRow2++) {
                            arrayList.add(Double.valueOf(((NumberEval) areaEval.getAbsoluteValue(firstRow2, areaEval.getFirstColumn())).getNumberValue()));
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        } else if (ptgArr.length > 0 && (ptg instanceof Ref3DPtg)) {
            Ref3DPtg ref3DPtg2 = (Ref3DPtg) ptg;
            EvaluationWorkbook.ExternalSheet externalSheet3 = this.workbook.getExternalSheet(ref3DPtg2.getExternSheetIndex());
            if (externalSheet3 == null) {
                p10 = cVar.f16601a.o(this.workbook.getSheetIndexFromExternSheetIndex(ref3DPtg2.getExternSheetIndex()));
            } else {
                p10 = cVar.f16601a.p(externalSheet3.getSheetName());
            }
            ei.b g13 = p10.g(ref3DPtg2.getRow());
            if (g13 != null) {
                d13 = getCellNumericValue(p10, g13.e(ref3DPtg2.getColumn(), true));
            }
            arrayList.add(Double.valueOf(d13));
        }
        return arrayList;
    }

    private String getFormatContents(ei.c cVar, ei.a aVar) {
        boolean z10;
        Object obj;
        ii.e b10 = aVar.b();
        short s4 = aVar.f16589b;
        if (s4 != 0) {
            if (s4 != 1) {
                if (s4 != 4) {
                    return "";
                }
                if (s4 == 4 && (obj = aVar.f16592f) != null) {
                    z10 = ((Boolean) obj).booleanValue();
                } else {
                    z10 = false;
                }
                return String.valueOf(z10);
            }
            Object m10 = cVar.f16601a.m(aVar.i());
            if (m10 instanceof l) {
                return ((l) m10).getText();
            }
            return (String) m10;
        }
        InternalWorkbook internalWorkbook = this.workbook;
        if (b10.f18502a == null) {
            b10.f18502a = new f();
        }
        String formatCode = HSSFDataFormat.getFormatCode(internalWorkbook, b10.f18502a.f18506a);
        NumericFormatter numericFormatter = NumericFormatter.f20969b;
        numericFormatter.getClass();
        short f10 = NumericFormatter.f(formatCode);
        if (f10 == 10) {
            return NumericFormatter.d(formatCode, aVar.c(cVar.f16601a.f16625b));
        }
        return numericFormatter.c(formatCode, aVar.f(), f10);
    }

    private XYMultipleSeriesDataset getXYMultipleSeriesDataset(c cVar, HSSFChart hSSFChart, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, short s4) {
        String str;
        List<Double> list;
        int i10;
        c cVar2 = cVar;
        short s10 = s4;
        XYMultipleSeriesDataset xYMultipleSeriesDataset = new XYMultipleSeriesDataset();
        HSSFChart.HSSFSeries[] series = hSSFChart.getSeries();
        SimpleSeriesRenderer[] seriesRenderers = xYMultipleSeriesRenderer.getSeriesRenderers();
        int length = series.length;
        int i11 = 0;
        while (i11 < length) {
            if (series[i11].getSeriesTitle() != null) {
                str = series[i11].getSeriesTitle();
            } else {
                str = "Series " + (i11 + 1);
            }
            boolean z10 = true;
            if (s10 == 4) {
                list = new ArrayList<>();
                Ptg[] formulaOfLink = series[i11].getDataCategoryLabels().getFormulaOfLink();
                if (formulaOfLink.length > 0) {
                    list = getData(cVar2, formulaOfLink);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size() - 1) {
                            break;
                        }
                        i12++;
                        if (Math.abs(list.get(i12).doubleValue() - list.get(i12).doubleValue()) < 9.999999717180685E-10d) {
                            z10 = false;
                            break;
                        }
                    }
                }
            } else {
                list = null;
            }
            Ptg[] formulaOfLink2 = series[i11].getDataValues().getFormulaOfLink();
            if (formulaOfLink2.length <= 0) {
                xYMultipleSeriesRenderer.removeSeriesRenderer(seriesRenderers[i11]);
                hSSFChart.removeSeries(series[i11]);
            } else {
                List<Double> data = getData(cVar2, formulaOfLink2);
                if (s10 == 4 && z10) {
                    if (list != null && data != null && list.size() == data.size()) {
                        XYSeries xYSeries = new XYSeries(str);
                        int i13 = 0;
                        while (i13 < list.size()) {
                            xYSeries.add(list.get(i13).doubleValue(), data.get(i13).doubleValue());
                            this.minY = Math.min(data.get(i13).doubleValue(), this.minY);
                            this.maxY = Math.max(data.get(i13).doubleValue(), this.maxY);
                            i13++;
                            i11 = i11;
                        }
                        i10 = i11;
                        xYMultipleSeriesDataset.addSeries(xYSeries);
                    }
                } else {
                    i10 = i11;
                    CategorySeries categorySeries = new CategorySeries(str);
                    for (Double d10 : data) {
                        categorySeries.add(d10.doubleValue());
                        this.minY = Math.min(d10.doubleValue(), this.minY);
                        this.maxY = Math.max(d10.doubleValue(), this.maxY);
                    }
                    xYMultipleSeriesDataset.addSeries(categorySeries.toXYSeries());
                }
                i11 = i10 + 1;
                cVar2 = cVar;
                s10 = s4;
            }
            i10 = i11;
            i11 = i10 + 1;
            cVar2 = cVar;
            s10 = s4;
        }
        return xYMultipleSeriesDataset;
    }

    public static ChartConverter instance() {
        return converter;
    }

    private void setChartSettings(XYMultipleSeriesRenderer xYMultipleSeriesRenderer, XYMultipleSeriesDataset xYMultipleSeriesDataset, HSSFChart hSSFChart) {
        ValueRangeRecord valueRangeRecord;
        int i10 = -1;
        for (int i11 = 0; i11 < xYMultipleSeriesDataset.getSeriesCount(); i11++) {
            i10 = Math.max(i10, xYMultipleSeriesDataset.getSeriesAt(i11).getItemCount());
        }
        List<ValueRangeRecord> valueRangeRecord2 = hSSFChart.getValueRangeRecord();
        if (valueRangeRecord2.size() > 0) {
            if (getChartType(hSSFChart) != 4) {
                xYMultipleSeriesRenderer.setXAxisMin(0.5d);
                xYMultipleSeriesRenderer.setXAxisMax(i10 + 0.5d);
                valueRangeRecord = valueRangeRecord2.get(0);
            } else {
                double minX = xYMultipleSeriesDataset.getSeriesAt(0).getMinX();
                double maxX = xYMultipleSeriesDataset.getSeriesAt(0).getMaxX();
                ValueRangeRecord valueRangeRecord3 = valueRangeRecord2.get(0);
                if (!valueRangeRecord3.isAutomaticMinimum()) {
                    minX = valueRangeRecord3.getMinimumAxisValue();
                }
                if (!valueRangeRecord3.isAutomaticMaximum()) {
                    maxX = valueRangeRecord3.getMaximumAxisValue();
                }
                xYMultipleSeriesRenderer.setXAxisMin(minX);
                xYMultipleSeriesRenderer.setXAxisMax(maxX);
                valueRangeRecord = valueRangeRecord2.get(1);
            }
            if (!valueRangeRecord.isAutomaticMinimum()) {
                this.minY = valueRangeRecord.getMinimumAxisValue();
            }
            if (!valueRangeRecord.isAutomaticMaximum()) {
                this.maxY = valueRangeRecord.getMaximumAxisValue();
            }
        } else if (getChartType(hSSFChart) != 4) {
            xYMultipleSeriesRenderer.setXAxisMin(0.5d);
            xYMultipleSeriesRenderer.setXAxisMax(i10 + 0.5d);
        } else {
            double minX2 = xYMultipleSeriesDataset.getSeriesAt(0).getMinX();
            double maxX2 = xYMultipleSeriesDataset.getSeriesAt(0).getMaxX();
            xYMultipleSeriesRenderer.setXAxisMin(minX2);
            xYMultipleSeriesRenderer.setXAxisMax(maxX2);
        }
        xYMultipleSeriesRenderer.setYAxisMin(this.minY);
        xYMultipleSeriesRenderer.setYAxisMax(this.maxY);
    }

    public CategorySeries buildCategoryDataset(ei.c cVar, HSSFChart hSSFChart) {
        CategorySeries categorySeries;
        ei.c p10;
        double d10;
        double d11;
        double d12;
        double d13;
        new CategorySeries("");
        if (hSSFChart.getSeries().length > 0) {
            HSSFChart.HSSFSeries hSSFSeries = hSSFChart.getSeries()[0];
            if (hSSFSeries.getSeriesTitle() != null) {
                categorySeries = new CategorySeries(hSSFSeries.getSeriesTitle());
            } else {
                categorySeries = new CategorySeries("");
            }
            Ptg[] formulaOfLink = hSSFSeries.getDataCategoryLabels().getFormulaOfLink();
            Ptg[] formulaOfLink2 = hSSFSeries.getDataValues().getFormulaOfLink();
            if (formulaOfLink2.length > 0) {
                Ptg ptg = formulaOfLink2[0];
                if (ptg instanceof Area3DPtg) {
                    Area3DPtg area3DPtg = (Area3DPtg) ptg;
                    EvaluationWorkbook.ExternalSheet externalSheet = this.workbook.getExternalSheet(area3DPtg.getExternSheetIndex());
                    if (externalSheet == null) {
                        p10 = cVar.f16601a.o(this.workbook.getSheetIndexFromExternSheetIndex(area3DPtg.getExternSheetIndex()));
                    } else {
                        p10 = cVar.f16601a.p(externalSheet.getSheetName());
                    }
                    if (formulaOfLink.length > 0) {
                        Ptg ptg2 = formulaOfLink[0];
                        if (ptg2 instanceof Area3DPtg) {
                            Area3DPtg area3DPtg2 = (Area3DPtg) ptg2;
                            if (area3DPtg.getFirstColumn() == area3DPtg.getLastColumn()) {
                                for (int firstRow = area3DPtg.getFirstRow(); firstRow <= area3DPtg.getLastRow(); firstRow++) {
                                    String category = getCategory(p10, area3DPtg2, firstRow - area3DPtg.getFirstRow());
                                    ei.b g10 = p10.g(firstRow);
                                    if (g10 != null) {
                                        d13 = getCellNumericValue(p10, g10.e(area3DPtg.getFirstColumn(), true));
                                    } else {
                                        d13 = 0.0d;
                                    }
                                    categorySeries.add(category, d13);
                                }
                            } else if (area3DPtg.getFirstRow() == area3DPtg.getLastRow()) {
                                ei.b g11 = p10.g(area3DPtg.getFirstRow());
                                for (int firstColumn = area3DPtg.getFirstColumn(); firstColumn <= area3DPtg.getLastColumn(); firstColumn++) {
                                    String category2 = getCategory(p10, area3DPtg2, firstColumn - area3DPtg.getFirstColumn());
                                    if (g11 != null) {
                                        d12 = getCellNumericValue(p10, g11.e(firstColumn, true));
                                    } else {
                                        d12 = 0.0d;
                                    }
                                    categorySeries.add(category2, d12);
                                }
                            }
                            return categorySeries;
                        }
                    }
                    if (area3DPtg.getFirstColumn() == area3DPtg.getLastColumn()) {
                        for (int firstRow2 = area3DPtg.getFirstRow(); firstRow2 <= area3DPtg.getLastRow(); firstRow2++) {
                            ei.b g12 = p10.g(firstRow2);
                            if (g12 != null) {
                                d11 = getCellNumericValue(p10, g12.e(area3DPtg.getFirstColumn(), true));
                            } else {
                                d11 = 0.0d;
                            }
                            categorySeries.add(d11);
                        }
                    } else if (area3DPtg.getFirstRow() == area3DPtg.getLastRow()) {
                        ei.b g13 = p10.g(area3DPtg.getFirstRow());
                        for (int firstColumn2 = area3DPtg.getFirstColumn(); firstColumn2 <= area3DPtg.getLastColumn(); firstColumn2++) {
                            if (g13 != null) {
                                d10 = getCellNumericValue(p10, g13.e(firstColumn2, true));
                            } else {
                                d10 = 0.0d;
                            }
                            categorySeries.add(d10);
                        }
                    }
                    return categorySeries;
                }
            }
        }
        return null;
    }

    public DefaultRenderer buildDefaultRenderer(ei.c cVar, HSSFChart hSSFChart) {
        DefaultRenderer defaultRenderer = new DefaultRenderer();
        defaultRenderer.setLabelsTextSize(15.0f);
        defaultRenderer.setLegendTextSize(15.0f);
        defaultRenderer.setShowGridH(true);
        if (hSSFChart.getMarginColorFormat() != null) {
            defaultRenderer.setBackgroundColor(cVar.f16601a.i(hSSFChart.getMarginColorFormat().getForecolorIndex()));
        }
        HSSFChart.HSSFSeries[] series = hSSFChart.getSeries();
        if (series.length > 0) {
            Ptg[] formulaOfLink = series[0].getDataValues().getFormulaOfLink();
            if (formulaOfLink.length > 0) {
                Ptg ptg = formulaOfLink[0];
                if (ptg instanceof Area3DPtg) {
                    Area3DPtg area3DPtg = (Area3DPtg) ptg;
                    if (area3DPtg.getFirstColumn() == area3DPtg.getLastColumn()) {
                        for (int firstRow = area3DPtg.getFirstRow(); firstRow <= area3DPtg.getLastRow(); firstRow++) {
                            SimpleSeriesRenderer simpleSeriesRenderer = new SimpleSeriesRenderer();
                            simpleSeriesRenderer.setColor(cVar.f16601a.i((firstRow - area3DPtg.getFirstRow()) + 24));
                            defaultRenderer.addSeriesRenderer(simpleSeriesRenderer);
                        }
                    } else if (area3DPtg.getFirstRow() == area3DPtg.getLastRow()) {
                        for (int firstColumn = area3DPtg.getFirstColumn(); firstColumn <= area3DPtg.getLastColumn(); firstColumn++) {
                            SimpleSeriesRenderer simpleSeriesRenderer2 = new SimpleSeriesRenderer();
                            simpleSeriesRenderer2.setColor(cVar.f16601a.i((firstColumn - area3DPtg.getFirstColumn()) + 24));
                            defaultRenderer.addSeriesRenderer(simpleSeriesRenderer2);
                        }
                    }
                }
            }
        }
        for (SeriesTextRecord seriesTextRecord : this.chartSeriesText.keySet()) {
            Record record = this.chartSeriesText.get(seriesTextRecord);
            if ((record instanceof ObjectLinkRecord) && ((ObjectLinkRecord) record).getAnchorId() == 1) {
                defaultRenderer.setChartTitle(seriesTextRecord.getText());
            }
        }
        return defaultRenderer;
    }

    public a converter(c cVar, HSSFChart hSSFChart) {
        this.workbook = ((di.e) cVar.f16601a).f16209m;
        this.minY = Double.MAX_VALUE;
        this.maxY = -1.7976931348623157E308d;
        this.chartSeriesText = hSSFChart.getSeriesText();
        a convertToAChart = convertToAChart(cVar, hSSFChart);
        dispose();
        return convertToAChart;
    }

    public a getAChart() {
        return this.chart;
    }

    public short getChartType(HSSFChart hSSFChart) {
        int ordinal = hSSFChart.getType().ordinal();
        if (ordinal == HSSFChart.HSSFChartType.Area.ordinal()) {
            return (short) 0;
        }
        if (ordinal == HSSFChart.HSSFChartType.Bar.ordinal()) {
            return (short) 1;
        }
        if (ordinal == HSSFChart.HSSFChartType.Line.ordinal()) {
            return (short) 2;
        }
        if (ordinal == HSSFChart.HSSFChartType.Pie.ordinal()) {
            return (short) 3;
        }
        if (ordinal == HSSFChart.HSSFChartType.Scatter.ordinal()) {
            return (short) 4;
        }
        return (short) 10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[LOOP:4: B:21:0x0064->B:23:0x0067, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private lib.zj.office.thirdpart.achartengine.renderers.XYMultipleSeriesRenderer buildXYMultipleSeriesRenderer(di.c r12, lib.zj.office.fc.hssf.usermodel.HSSFChart r13, lib.zj.office.thirdpart.achartengine.chart.PointStyle[] r14) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.xls.ChartConverter.buildXYMultipleSeriesRenderer(di.c, lib.zj.office.fc.hssf.usermodel.HSSFChart, lib.zj.office.thirdpart.achartengine.chart.PointStyle[]):lib.zj.office.thirdpart.achartengine.renderers.XYMultipleSeriesRenderer");
    }

    private void dispose() {
    }
}
