package lib.zj.office.fc.xls.Reader.drawing;

import android.graphics.Color;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.play.core.assetpacks.b1;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
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
import ui.c;
import ui.e;

/* loaded from: classes3.dex */
public class ChartReader {
    private static final short AxisPosition_Bottom = 0;
    private static final short AxisPosition_Left = 1;
    private static final short AxisPosition_Right = 2;
    private static final short AxisPosition_Top = 3;
    private Element chart;
    private boolean hasMaxX;
    private boolean hasMaxY;
    private boolean hasMinX;
    private boolean hasMinY;
    private double maxX;
    private double maxY;
    private double minX;
    private double minY;
    private Map<String, Integer> schemeColor;
    private short type;
    private static final String[] themeIndex = {"accent1", "accent2", "accent3", "accent4", "accent5", "accent6"};
    private static final double[] tints = {-0.25d, 0.0d, 0.4d, 0.6d, 0.8d, -0.5d};
    private static ChartReader reader = new ChartReader();

    private a buildAChart(Element element, float f10, byte b10) {
        XYMultipleSeriesRenderer buildXYMultipleSeriesRenderer;
        XYMultipleSeriesDataset xYMultipleSeriesDataset;
        a columnBarChart;
        CategorySeries categorySeries;
        float f11;
        Element element2 = element.element("plotArea");
        PointStyle[] pointStyleArr = {PointStyle.DIAMOND, PointStyle.SQUARE, PointStyle.TRIANGLE, PointStyle.X, PointStyle.CIRCLE};
        getChartInfo(element2);
        DefaultRenderer defaultRenderer = null;
        switch (this.type) {
            case 0:
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                buildXYMultipleSeriesRenderer = buildXYMultipleSeriesRenderer(element2, f10, b10);
                xYMultipleSeriesDataset = getXYMultipleSeriesDataset(this.chart, this.type, buildXYMultipleSeriesRenderer);
                ColumnBarChart.Type type = ColumnBarChart.Type.DEFAULT;
                ti.a.a(xYMultipleSeriesDataset, buildXYMultipleSeriesRenderer);
                columnBarChart = new ColumnBarChart(xYMultipleSeriesDataset, buildXYMultipleSeriesRenderer, type);
                defaultRenderer = buildXYMultipleSeriesRenderer;
                categorySeries = null;
                break;
            case 2:
                buildXYMultipleSeriesRenderer = buildXYMultipleSeriesRenderer(element2, f10, b10);
                xYMultipleSeriesDataset = getXYMultipleSeriesDataset(this.chart, this.type, buildXYMultipleSeriesRenderer, pointStyleArr);
                buildXYMultipleSeriesRenderer.setYLabels(10);
                ti.a.a(xYMultipleSeriesDataset, buildXYMultipleSeriesRenderer);
                columnBarChart = new b(xYMultipleSeriesDataset, buildXYMultipleSeriesRenderer);
                defaultRenderer = buildXYMultipleSeriesRenderer;
                categorySeries = null;
                break;
            case 3:
                DefaultRenderer buildDefaultRenderer = buildDefaultRenderer();
                buildDefaultRenderer.setZoomEnabled(true);
                CategorySeries buildCategoryDataset = buildCategoryDataset(this.chart, buildDefaultRenderer);
                if (buildCategoryDataset != null && buildCategoryDataset.getItemCount() == buildDefaultRenderer.getSeriesRendererCount()) {
                    columnBarChart = new c(buildCategoryDataset, buildDefaultRenderer);
                    defaultRenderer = buildDefaultRenderer;
                    categorySeries = buildCategoryDataset;
                    xYMultipleSeriesDataset = null;
                    break;
                } else {
                    throw new IllegalArgumentException("Dataset and renderer should be not null and the dataset number of items should be equal to the number of series renderers");
                }
            case 4:
                buildXYMultipleSeriesRenderer = buildXYMultipleSeriesRenderer(element2, f10, b10);
                xYMultipleSeriesDataset = getXYMultipleSeriesDataset(this.chart, this.type, buildXYMultipleSeriesRenderer, pointStyleArr);
                buildXYMultipleSeriesRenderer.setXLabels(10);
                buildXYMultipleSeriesRenderer.setYLabels(10);
                for (int i10 = 0; i10 < buildXYMultipleSeriesRenderer.getSeriesRendererCount(); i10++) {
                    ((XYSeriesRenderer) buildXYMultipleSeriesRenderer.getSeriesRendererAt(i10)).setFillPoints(true);
                }
                ti.a.a(xYMultipleSeriesDataset, buildXYMultipleSeriesRenderer);
                columnBarChart = new e(xYMultipleSeriesDataset, buildXYMultipleSeriesRenderer);
                defaultRenderer = buildXYMultipleSeriesRenderer;
                categorySeries = null;
                break;
            default:
                categorySeries = null;
                xYMultipleSeriesDataset = null;
                columnBarChart = null;
                break;
        }
        Element element3 = element.element(InMobiNetworkValues.TITLE);
        if (element3 != null) {
            List<fi.c> title = getTitle(element3);
            String str = "";
            if (title != null && title.size() > 0) {
                f11 = 0.0f;
                for (int i11 = 0; i11 < title.size(); i11++) {
                    StringBuilder k10 = a0.a.k(str);
                    k10.append(title.get(i11).f17295a);
                    str = k10.toString();
                    if (title.get(i11).f17296b != null) {
                        f11 = Math.max(f11, (int) title.get(i11).f17296b.f32142b);
                    }
                }
            } else {
                f11 = 0.0f;
            }
            defaultRenderer.setShowChartTitle(true);
            if (f11 == 0.0f) {
                f11 = f10;
            }
            defaultRenderer.setChartTitleTextSize(f11);
            if (str.length() == 0) {
                if (xYMultipleSeriesDataset != null) {
                    if (xYMultipleSeriesDataset.getSeriesCount() == 1) {
                        str = xYMultipleSeriesDataset.getSeriesAt(0).getTitle();
                    } else {
                        str = "Chart Title";
                    }
                } else if (categorySeries != null) {
                    str = categorySeries.getTitle();
                }
            }
            defaultRenderer.setChartTitle(str);
        } else {
            defaultRenderer.setShowChartTitle(false);
        }
        if (element.element("legend") != null) {
            processLegend(element.element("legend"), defaultRenderer, columnBarChart);
        } else {
            defaultRenderer.setShowLegend(false);
        }
        if (columnBarChart != null) {
            columnBarChart.f30382a = this.schemeColor.get("tx1").intValue();
        }
        return columnBarChart;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
        if (r3 != 3) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private lib.zj.office.thirdpart.achartengine.renderers.XYMultipleSeriesRenderer buildXYMultipleSeriesRenderer(lib.zj.office.fc.dom4j.Element r10, float r11, byte r12) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.xls.Reader.drawing.ChartReader.buildXYMultipleSeriesRenderer(lib.zj.office.fc.dom4j.Element, float, byte):lib.zj.office.thirdpart.achartengine.renderers.XYMultipleSeriesRenderer");
    }

    private short getAxisPosition(Element element) {
        String attributeValue;
        if (element != null && (attributeValue = element.attributeValue("val")) != null) {
            if ("b".equalsIgnoreCase(attributeValue)) {
                return (short) 0;
            }
            if (OperatorName.LINE_TO.equalsIgnoreCase(attributeValue)) {
                return (short) 1;
            }
            if ("r".equalsIgnoreCase(attributeValue)) {
                return (short) 2;
            }
            if ("t".equalsIgnoreCase(attributeValue)) {
                return (short) 3;
            }
        }
        return (short) 1;
    }

    private void getChartInfo(Element element) {
        if (element.element("barChart") != null) {
            this.chart = element.element("barChart");
            this.type = (short) 1;
        } else if (element.element("bar3DChart") != null) {
            this.chart = element.element("bar3DChart");
            this.type = (short) 1;
        } else if (element.element("pieChart") != null) {
            this.chart = element.element("pieChart");
            this.type = (short) 3;
        } else if (element.element("pie3DChart") != null) {
            this.chart = element.element("pie3DChart");
            this.type = (short) 3;
        } else if (element.element("ofPieChart") != null) {
            this.chart = element.element("ofPieChart");
            this.type = (short) 3;
        } else if (element.element("lineChart") != null) {
            this.chart = element.element("lineChart");
            this.type = (short) 2;
        } else if (element.element("line3DChart") != null) {
            this.chart = element.element("line3DChart");
            this.type = (short) 2;
        } else if (element.element("scatterChart") != null) {
            this.chart = element.element("scatterChart");
            this.type = (short) 4;
        } else if (element.element("areaChart") != null) {
            this.chart = element.element("areaChart");
            this.type = (short) 0;
        } else if (element.element("area3DChart") != null) {
            this.chart = element.element("area3DChart");
            this.type = (short) 0;
        } else if (element.element("stockChart") != null) {
            this.chart = element.element("stockChart");
            this.type = (short) 5;
        } else if (element.element("surfaceChart") != null) {
            this.chart = element.element("surfaceChart");
            this.type = (short) 6;
        } else if (element.element("surface3DChart") != null) {
            this.chart = element.element("surface3DChart");
            this.type = (short) 6;
        } else if (element.element("doughnutChart") != null) {
            this.chart = element.element("doughnutChart");
            this.type = (short) 7;
        } else if (element.element("bubbleChart") != null) {
            this.chart = element.element("bubbleChart");
            this.type = (short) 4;
        } else if (element.element("radarChart") != null) {
            this.chart = element.element("radarChart");
            this.type = (short) 9;
        }
    }

    private int getColor(Element element) {
        int parseInt;
        double d10;
        if (element.element("srgbClr") != null) {
            String attributeValue = element.element("srgbClr").attributeValue("val");
            if (attributeValue.length() > 6) {
                attributeValue = attributeValue.substring(attributeValue.length() - 6);
            }
            parseInt = Integer.parseInt(attributeValue, 16);
        } else if (element.element("schemeClr") != null) {
            Element element2 = element.element("schemeClr");
            int intValue = this.schemeColor.get(element2.attributeValue("val")).intValue();
            if (element2.element("lumMod") != null) {
                double parseInt2 = Integer.parseInt(element2.element("lumMod").attributeValue("val")) / 100000.0d;
                if (element2.element("lumOff") != null) {
                    d10 = Integer.parseInt(element2.element("lumOff").attributeValue("val")) / 100000.0d;
                } else {
                    d10 = parseInt2 - 1.0d;
                }
                return Color.rgb(b1.o(d10, Color.red(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(d10, Color.green(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(d10, Color.blue(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            }
            return intValue;
        } else if (element.element("sysClr") != null) {
            parseInt = Integer.parseInt(element.element("sysClr").attributeValue("lastClr"), 16);
        } else {
            return -1;
        }
        return parseInt | (-16777216);
    }

    private void getMaxMinValue(Element element, short s4) {
        if (s4 != 0) {
            if (s4 != 1 && s4 != 2) {
                if (s4 != 3) {
                    return;
                }
            } else {
                if (element.element("max") != null) {
                    this.hasMaxY = true;
                    this.maxY = Double.parseDouble(element.element("max").attributeValue("val"));
                }
                if (element.element("min") != null) {
                    this.hasMinY = true;
                    this.minY = Double.parseDouble(element.element("min").attributeValue("val"));
                    return;
                }
                return;
            }
        }
        if (element.element("max") != null) {
            this.hasMaxX = true;
            this.maxX = Double.parseDouble(element.element("max").attributeValue("val"));
        }
        if (element.element("min") != null) {
            this.hasMinX = true;
            this.minX = Double.parseDouble(element.element("min").attributeValue("val"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object getSeries(lib.zj.office.fc.dom4j.Element r10, short r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.xls.Reader.drawing.ChartReader.getSeries(lib.zj.office.fc.dom4j.Element, short):java.lang.Object");
    }

    private String getSeriesTitle(Element element) {
        if (element == null) {
            return null;
        }
        if (element.element("strRef") != null) {
            Element element2 = element.element("strRef").element("strCache");
            if (element2.element("pt") != null) {
                return element2.element("pt").element(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT).getText();
            }
        } else if (element.element(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT) != null) {
            return element.element(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT).getText();
        }
        return null;
    }

    private float getTextSize(Element element) {
        Element element2;
        Element element3;
        Element element4;
        String attributeValue;
        if (element != null && (element2 = element.element("p")) != null && (element3 = element2.element("pPr")) != null && (element4 = element3.element("defRPr")) != null && (attributeValue = element4.attributeValue("sz")) != null && attributeValue.length() > 0) {
            return Integer.parseInt(attributeValue) / 100.0f;
        }
        return 12.0f;
    }

    private List<fi.c> getTitle(Element element) {
        short s4;
        if (element != null && element.element("tx") != null && element.element("tx").element("rich") != null) {
            Element element2 = element.element("tx").element("rich");
            Element element3 = element2.element("bodyPr");
            if (element3 != null) {
                s4 = DrawingReader.getVerticalByString(element3.attributeValue("anchor"));
            } else {
                s4 = -1;
            }
            ArrayList arrayList = new ArrayList();
            for (Element element4 : element2.elements("p")) {
                fi.c textParagraph = DrawingReader.getTextParagraph(element4);
                if (textParagraph != null) {
                    if (s4 > -1) {
                        textParagraph.c.f18494b = s4;
                    }
                    arrayList.add(textParagraph);
                }
            }
            return arrayList;
        }
        return null;
    }

    private XYMultipleSeriesDataset getXYMultipleSeriesDataset(Element element, short s4, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        return getXYMultipleSeriesDataset(element, s4, xYMultipleSeriesRenderer, null);
    }

    public static ChartReader instance() {
        return reader;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void processLegend(lib.zj.office.fc.dom4j.Element r4, lib.zj.office.thirdpart.achartengine.renderers.DefaultRenderer r5, ui.a r6) {
        /*
            r3 = this;
            if (r4 == 0) goto L54
            if (r5 == 0) goto L54
            r0 = 1
            r5.setShowLegend(r0)
            java.lang.String r1 = "legendPos"
            lib.zj.office.fc.dom4j.Element r2 = r4.element(r1)
            if (r2 == 0) goto L39
            lib.zj.office.fc.dom4j.Element r1 = r4.element(r1)
            java.lang.String r2 = "val"
            java.lang.String r1 = r1.attributeValue(r2)
            java.lang.String r2 = "l"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L25
            r0 = 0
            goto L3a
        L25:
            java.lang.String r2 = "t"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L2f
            goto L3a
        L2f:
            java.lang.String r0 = "b"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L39
            r0 = 3
            goto L3a
        L39:
            r0 = 2
        L3a:
            r6.f30383b = r0
            float r6 = r5.getDefaultFontSize()
            java.lang.String r0 = "txPr"
            lib.zj.office.fc.dom4j.Element r1 = r4.element(r0)
            if (r1 == 0) goto L51
            lib.zj.office.fc.dom4j.Element r4 = r4.element(r0)
            float r6 = r3.getTextSize(r4)
        L51:
            r5.setLegendTextSize(r6)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.xls.Reader.drawing.ChartReader.processLegend(lib.zj.office.fc.dom4j.Element, lib.zj.office.thirdpart.achartengine.renderers.DefaultRenderer, ui.a):void");
    }

    private void setSeriesRendererProp(XYMultipleSeriesRenderer xYMultipleSeriesRenderer, Element element, PointStyle[] pointStyleArr) {
        Element element2;
        int parseInt = Integer.parseInt(element.element("order").attributeValue("val"));
        XYSeriesRenderer xYSeriesRenderer = new XYSeriesRenderer();
        String[] strArr = themeIndex;
        int intValue = this.schemeColor.get(strArr[parseInt % strArr.length]).intValue();
        double d10 = tints[parseInt / strArr.length];
        xYSeriesRenderer.setColor(Color.rgb(b1.o(d10, Color.red(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(d10, Color.green(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(d10, Color.blue(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC)));
        int i10 = 1;
        if (pointStyleArr != null && pointStyleArr.length > 0) {
            xYSeriesRenderer.setPointStyle(pointStyleArr[parseInt % (pointStyleArr.length - 1)]);
        }
        xYMultipleSeriesRenderer.addSeriesRenderer(xYSeriesRenderer);
        if (element.element("cat") != null) {
            if (element.element("cat").element("numRef") != null) {
                element2 = element.element("cat").element("numRef").element("numCache");
            } else {
                if (element.element("cat").element("strRef") != null) {
                    element2 = element.element("cat").element("strRef").element("strCache");
                }
                element2 = null;
            }
        } else {
            if (element.element("xVal") != null && element.element("xVal").element("strRef") != null) {
                element2 = element.element("xVal").element("strRef").element("strCache");
            }
            element2 = null;
        }
        if (element2 != null) {
            for (Element element3 : element2.elements("pt")) {
                xYMultipleSeriesRenderer.addXTextLabel(i10, element3.element(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT).getText());
                i10++;
            }
        }
    }

    public CategorySeries buildCategoryDataset(Element element, DefaultRenderer defaultRenderer) {
        CategorySeries categorySeries;
        if (element.element("ser") != null) {
            new CategorySeries("");
            Element element2 = element.element("ser");
            if (element2.element("tx") != null) {
                categorySeries = new CategorySeries(getSeriesTitle(element2.element("tx")));
            } else {
                categorySeries = new CategorySeries("");
            }
            ArrayList arrayList = new ArrayList(10);
            if (element2.element("cat") != null) {
                for (Element element3 : element2.element("cat").element("strRef").element("strCache").elements("pt")) {
                    arrayList.add(element3.element(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT).getText());
                }
            }
            ArrayList arrayList2 = new ArrayList(10);
            if (element2.element("val") != null) {
                for (Element element4 : element2.element("val").element("numRef").element("numCache").elements("pt")) {
                    arrayList2.add(Double.valueOf(Double.parseDouble(element4.element(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT).getText())));
                }
            }
            int i10 = 0;
            if (arrayList.size() > 0 && arrayList.size() == arrayList2.size()) {
                while (i10 < arrayList.size()) {
                    SimpleSeriesRenderer simpleSeriesRenderer = new SimpleSeriesRenderer();
                    String[] strArr = themeIndex;
                    int intValue = this.schemeColor.get(strArr[i10 % strArr.length]).intValue();
                    double d10 = tints[i10 / strArr.length];
                    simpleSeriesRenderer.setColor(Color.rgb(b1.o(d10, Color.red(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(d10, Color.green(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(d10, Color.blue(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC)));
                    defaultRenderer.addSeriesRenderer(simpleSeriesRenderer);
                    categorySeries.add((String) arrayList.get(i10), ((Double) arrayList2.get(i10)).doubleValue());
                    i10++;
                }
            } else {
                while (i10 < arrayList2.size()) {
                    SimpleSeriesRenderer simpleSeriesRenderer2 = new SimpleSeriesRenderer();
                    String[] strArr2 = themeIndex;
                    int intValue2 = this.schemeColor.get(strArr2[i10 % strArr2.length]).intValue();
                    double d11 = tints[i10 / strArr2.length];
                    simpleSeriesRenderer2.setColor(Color.rgb(b1.o(d11, Color.red(intValue2) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(d11, Color.green(intValue2) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(d11, Color.blue(intValue2) & FunctionEval.FunctionID.EXTERNAL_FUNC)));
                    defaultRenderer.addSeriesRenderer(simpleSeriesRenderer2);
                    categorySeries.add(((Double) arrayList2.get(i10)).doubleValue());
                    i10++;
                }
            }
            return categorySeries;
        }
        return null;
    }

    public DefaultRenderer buildDefaultRenderer() {
        DefaultRenderer defaultRenderer = new DefaultRenderer();
        defaultRenderer.setShowGridH(true);
        defaultRenderer.setLabelsColor(this.schemeColor.get("tx1").intValue());
        defaultRenderer.setAxesColor(this.schemeColor.get("tx1").intValue());
        return defaultRenderer;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ui.a read(lib.zj.office.system.f r17, lib.zj.office.fc.openxml4j.opc.ZipPackage r18, lib.zj.office.fc.openxml4j.opc.PackagePart r19, java.util.Map<java.lang.String, java.lang.Integer> r20, byte r21) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.xls.Reader.drawing.ChartReader.read(lib.zj.office.system.f, lib.zj.office.fc.openxml4j.opc.ZipPackage, lib.zj.office.fc.openxml4j.opc.PackagePart, java.util.Map, byte):ui.a");
    }

    private XYMultipleSeriesDataset getXYMultipleSeriesDataset(Element element, short s4, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, PointStyle[] pointStyleArr) {
        XYMultipleSeriesDataset xYMultipleSeriesDataset = new XYMultipleSeriesDataset();
        List elements = element.elements("ser");
        int size = elements.size();
        for (int i10 = 0; i10 < size; i10++) {
            setSeriesRendererProp(xYMultipleSeriesRenderer, (Element) elements.get(i10), pointStyleArr);
            Object series = getSeries((Element) elements.get(i10), s4);
            if (series == null) {
                return null;
            }
            if (series instanceof CategorySeries) {
                xYMultipleSeriesDataset.addSeries(((CategorySeries) series).toXYSeries());
            } else if (series instanceof XYSeries) {
                xYMultipleSeriesDataset.addSeries((XYSeries) series);
            }
            if (!this.hasMaxY) {
                this.maxY = Math.max(this.maxY, xYMultipleSeriesDataset.getSeriesAt(i10).getMaxY());
            }
            if (!this.hasMinY) {
                this.minY = Math.min(this.minY, xYMultipleSeriesDataset.getSeriesAt(i10).getMinY());
            }
        }
        double d10 = 2.147483647E9d;
        double d11 = -2.147483648E9d;
        for (int i11 = 0; i11 < xYMultipleSeriesDataset.getSeriesCount(); i11++) {
            d10 = Math.min(d10, xYMultipleSeriesDataset.getSeriesAt(i11).getMinX());
            d11 = Math.max(d11, xYMultipleSeriesDataset.getSeriesAt(i11).getMaxX());
        }
        if (this.hasMinX) {
            xYMultipleSeriesRenderer.setXAxisMin(this.minX);
        } else if (s4 != 4) {
            xYMultipleSeriesRenderer.setXAxisMin(0.5d);
        } else {
            xYMultipleSeriesRenderer.setXAxisMin(d10);
        }
        if (this.hasMaxX) {
            xYMultipleSeriesRenderer.setXAxisMax(this.maxX);
        } else if (s4 != 4) {
            xYMultipleSeriesRenderer.setXAxisMax(d11 + 0.5d);
        } else {
            xYMultipleSeriesRenderer.setXAxisMax(d11);
        }
        if (Math.abs(this.minY - Double.MAX_VALUE) < 0.10000000149011612d) {
            this.minY = 0.0d;
        }
        if (Math.abs(this.maxY - Double.MIN_VALUE) < 0.10000000149011612d) {
            this.maxY = 0.0d;
        }
        xYMultipleSeriesRenderer.setYAxisMin(this.minY);
        xYMultipleSeriesRenderer.setYAxisMax(this.maxY);
        return xYMultipleSeriesDataset;
    }

    private void dispose() {
    }
}
