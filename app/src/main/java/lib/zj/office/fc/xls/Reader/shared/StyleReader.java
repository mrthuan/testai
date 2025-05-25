package lib.zj.office.fc.xls.Reader.shared;

import android.graphics.Color;
import com.google.android.play.core.assetpacks.b1;
import com.tom_roush.fontbox.ttf.NamingTable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import eh.a;
import eh.b;
import ei.d;
import ii.c;
import ii.e;
import ii.f;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.ElementHandler;
import lib.zj.office.fc.dom4j.ElementPath;
import lib.zj.office.fc.dom4j.io.SAXReader;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.ss.util.CellUtil;
import lib.zj.office.system.AbortReaderError;
import lib.zj.office.system.j;

/* loaded from: classes3.dex */
public class StyleReader {
    private static StyleReader reader = new StyleReader();
    private d book;
    private int borderIndex;
    private Map<Integer, ii.d> cellBorders;
    private int fillIndex;
    private Map<Integer, b> fills;
    private int fontIndex;
    private j iReader;
    private int indexedColor;
    private Map<Integer, f> numFmts;
    private int styleIndex;
    private ji.d tableFormatManager;

    private void dispose() {
        Map<Integer, f> map = this.numFmts;
        if (map != null) {
            map.clear();
        }
        Map<Integer, ii.d> map2 = this.cellBorders;
        if (map2 != null) {
            map2.clear();
        }
        Map<Integer, b> map3 = this.fills;
        if (map3 != null) {
            map3.clear();
        }
    }

    private void getBuiltinNumberFormats() {
        String[] strArr = (String[]) c.f18498a.clone();
        int length = strArr.length;
        this.numFmts = new HashMap(length + 20);
        for (int i10 = 0; i10 < length; i10++) {
            this.numFmts.put(Integer.valueOf(i10), new f(strArr[i10], (short) i10));
        }
    }

    private short getColorIndex(Element element) {
        int i10;
        int parseInt;
        if (element != null) {
            if (element.attribute("theme") != null) {
                int parseInt2 = Integer.parseInt(element.attributeValue("theme"));
                d dVar = this.book;
                synchronized (dVar) {
                    Integer num = (Integer) dVar.f16630h.get(Integer.valueOf(parseInt2));
                    if (num != null) {
                        i10 = num.intValue();
                    } else {
                        i10 = -1;
                    }
                }
                if (element.attribute("tint") != null) {
                    double parseDouble = Double.parseDouble(element.attributeValue("tint"));
                    int i11 = this.book.i(i10);
                    parseInt = this.book.a(Color.rgb(b1.o(parseDouble, Color.red(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(parseDouble, Color.green(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(parseDouble, Color.blue(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC)));
                    i10 = parseInt;
                }
                return (short) i10;
            }
            if (element.attribute("rgb") != null) {
                String attributeValue = element.attributeValue("rgb");
                if (attributeValue.length() > 6) {
                    attributeValue = attributeValue.substring(attributeValue.length() - 6);
                }
                i10 = this.book.a(Integer.parseInt(attributeValue, 16) | (-16777216));
            } else if (element.attribute("indexed") != null && (parseInt = Integer.parseInt(element.attributeValue("indexed"))) != 64) {
                if (parseInt > 64) {
                    i10 = 9;
                }
                i10 = parseInt;
            }
            return (short) i10;
        }
        i10 = 0;
        return (short) i10;
    }

    private static int getRadialCenterType(Element element) {
        if (element != null) {
            String attributeValue = element.attributeValue("left");
            String attributeValue2 = element.attributeValue("top");
            String attributeValue3 = element.attributeValue("right");
            String attributeValue4 = element.attributeValue("bottom");
            if ("1".equalsIgnoreCase(attributeValue) && "1".equalsIgnoreCase(attributeValue3) && "1".equalsIgnoreCase(attributeValue4) && "1".equalsIgnoreCase(attributeValue2)) {
                return 3;
            }
            if ("1".equalsIgnoreCase(attributeValue4) && "1".equalsIgnoreCase(attributeValue2)) {
                return 2;
            }
            if ("1".equalsIgnoreCase(attributeValue) && "1".equalsIgnoreCase(attributeValue3)) {
                return 1;
            }
            if ("0.5".equalsIgnoreCase(attributeValue) && "0.5".equalsIgnoreCase(attributeValue2) && "0.5".equalsIgnoreCase(attributeValue3) && "0.5".equalsIgnoreCase(attributeValue4)) {
                return 4;
            }
            return 0;
        }
        return 0;
    }

    public static StyleReader instance() {
        return reader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ii.d processBorder(Element element) {
        ii.d dVar = new ii.d();
        Element element2 = element.element("left");
        if (element2 != null) {
            dVar.f18499a = new ii.b(element2.attributeValue("style"), getColorIndex(element2.element("color")));
        }
        Element element3 = element.element("top");
        if (element3 != null) {
            dVar.f18500b = new ii.b(element3.attributeValue("style"), getColorIndex(element3.element("color")));
        }
        Element element4 = element.element("right");
        if (element4 != null) {
            dVar.c = new ii.b(element4.attributeValue("style"), getColorIndex(element4.element("color")));
        }
        Element element5 = element.element("bottom");
        if (element5 != null) {
            dVar.f18501d = new ii.b(element5.attributeValue("style"), getColorIndex(element5.element("color")));
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e processCellStyle(Element element) {
        int parseInt;
        int parseInt2;
        int parseInt3;
        e eVar = new e();
        String attributeValue = element.attributeValue("numFmtId");
        int i10 = 0;
        if (attributeValue == null) {
            parseInt = 0;
        } else {
            parseInt = Integer.parseInt(attributeValue);
        }
        if (this.numFmts.get(Integer.valueOf(parseInt)) != null) {
            eVar.f18502a = this.numFmts.get(Integer.valueOf(parseInt));
        }
        String attributeValue2 = element.attributeValue("fontId");
        if (attributeValue2 == null) {
            parseInt2 = 0;
        } else {
            parseInt2 = Integer.parseInt(attributeValue2);
        }
        eVar.f18503b = (short) parseInt2;
        String attributeValue3 = element.attributeValue("fillId");
        if (attributeValue3 == null) {
            parseInt3 = 0;
        } else {
            parseInt3 = Integer.parseInt(attributeValue3);
        }
        eVar.f18505e = this.fills.get(Integer.valueOf(parseInt3));
        String attributeValue4 = element.attributeValue("borderId");
        if (attributeValue4 != null) {
            i10 = Integer.parseInt(attributeValue4);
        }
        eVar.f18504d = this.cellBorders.get(Integer.valueOf(i10));
        Element element2 = element.element(CellUtil.ALIGNMENT);
        if (element2 != null) {
            processCellStyleAlignment(eVar, element2);
        }
        return eVar;
    }

    private void processCellStyleAlignment(e eVar, Element element) {
        boolean z10 = true;
        if (element.attributeValue("vertical") != null) {
            String attributeValue = element.attributeValue("vertical");
            eVar.a();
            if (attributeValue.equalsIgnoreCase("top")) {
                eVar.c.f18494b = (short) 0;
            } else if (attributeValue.equalsIgnoreCase("center")) {
                eVar.c.f18494b = (short) 1;
            } else if (attributeValue.equalsIgnoreCase("bottom")) {
                eVar.c.f18494b = (short) 2;
            } else if (attributeValue.equalsIgnoreCase("justify")) {
                eVar.c.f18494b = (short) 3;
            } else if (attributeValue.equalsIgnoreCase("distributed")) {
                eVar.c.f18494b = (short) 3;
            }
        }
        if (element.attributeValue("horizontal") != null) {
            String attributeValue2 = element.attributeValue("horizontal");
            eVar.a();
            if (attributeValue2 != null && !attributeValue2.equalsIgnoreCase("general")) {
                if (attributeValue2.equalsIgnoreCase("left")) {
                    eVar.c.f18493a = (short) 1;
                } else if (attributeValue2.equalsIgnoreCase("center")) {
                    eVar.c.f18493a = (short) 2;
                } else if (attributeValue2.equalsIgnoreCase("right")) {
                    eVar.c.f18493a = (short) 3;
                } else if (attributeValue2.equalsIgnoreCase("fill")) {
                    eVar.c.f18493a = (short) 4;
                } else if (attributeValue2.equalsIgnoreCase("justify")) {
                    eVar.c.f18493a = (short) 5;
                } else if (attributeValue2.equalsIgnoreCase("distributed")) {
                    eVar.c.f18493a = (short) 5;
                }
            } else {
                eVar.c.f18493a = (short) 0;
            }
        }
        if (element.attributeValue("textRotation") != null) {
            Integer.parseInt(element.attributeValue("textRotation"));
            eVar.a();
            eVar.c.getClass();
        }
        if (element.attributeValue(CellUtil.WRAP_TEXT) != null) {
            String attributeValue3 = element.attributeValue(CellUtil.WRAP_TEXT);
            try {
                try {
                    if (Integer.parseInt(attributeValue3) == 0) {
                        z10 = false;
                    }
                    eVar.a();
                    eVar.c.c = z10;
                } catch (NumberFormatException unused) {
                    boolean parseBoolean = Boolean.parseBoolean(attributeValue3);
                    eVar.a();
                    eVar.c.c = parseBoolean;
                }
            } catch (Exception unused2) {
            }
        }
        if (element.attributeValue("indent") != null) {
            eVar.a();
            eVar.c.f18495d = (short) Integer.parseInt(element.attributeValue("indent"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b processFill(Element element) {
        a fVar;
        Element element2 = element.element("patternFill");
        int i10 = 0;
        if (element2 != null) {
            b bVar = new b();
            if ("none".equalsIgnoreCase(element2.attributeValue("patternType"))) {
                return null;
            }
            Element element3 = element2.element("fgColor");
            if (element3 != null) {
                bVar.f16571d = this.book.i(getColorIndex(element3));
                bVar.c = (byte) 0;
            }
            Element element4 = element2.element("bgColor");
            if (element4 != null) {
                this.book.i(getColorIndex(element4));
            }
            return bVar;
        } else if (element.element("gradientFill") == null) {
            return null;
        } else {
            Element element5 = element.element("gradientFill");
            List elements = element5.elements("stop");
            int[] iArr = new int[elements.size()];
            float[] fArr = new float[elements.size()];
            for (int i11 = 0; i11 < elements.size(); i11++) {
                Element element6 = (Element) elements.get(i11);
                fArr[i11] = Float.parseFloat(element6.attributeValue("position"));
                iArr[i11] = this.book.i(getColorIndex(element6.element("color")));
            }
            b bVar2 = new b();
            if (!"path".equalsIgnoreCase(element5.attributeValue("type"))) {
                bVar2.c = (byte) 7;
                if (element5.attributeValue("degree") != null) {
                    i10 = Integer.parseInt(element5.attributeValue("degree"));
                }
                fVar = new eh.d(i10, iArr, fArr);
            } else {
                bVar2.c = (byte) 4;
                fVar = new eh.f(getRadialCenterType(element5), iArr, fArr);
            }
            bVar2.c(fVar);
            return bVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public yh.a processFont(Element element) {
        double d10;
        boolean parseBoolean;
        boolean parseBoolean2;
        yh.a aVar = new yh.a();
        Element element2 = element.element("fontElement");
        boolean z10 = true;
        if (element2 != null) {
            String attributeValue = element2.attributeValue("val");
            if (attributeValue.equalsIgnoreCase("superscript")) {
                aVar.f32145f = (byte) 1;
            } else if (attributeValue.equalsIgnoreCase("subscript")) {
                aVar.f32145f = (byte) 2;
            } else {
                aVar.f32145f = (byte) 0;
            }
        } else {
            aVar.f32145f = (byte) 0;
        }
        Element element3 = element.element("sz");
        if (element3 != null) {
            d10 = Double.parseDouble(element3.attributeValue("val"));
        } else {
            d10 = 12.0d;
        }
        aVar.f32142b = d10;
        aVar.f32144e = getColorIndex(element.element("color"));
        if (element.element(NamingTable.TAG) != null) {
            aVar.f32141a = element.element(NamingTable.TAG).attributeValue("val");
        }
        Element element4 = element.element("b");
        if (element4 != null) {
            if (element4.attributeValue("val") == null) {
                parseBoolean2 = true;
            } else {
                parseBoolean2 = Boolean.parseBoolean(element4.attributeValue("val"));
            }
            aVar.f32143d = parseBoolean2;
        }
        Element element5 = element.element(OperatorName.SET_FLATNESS);
        if (element5 != null) {
            if (element5.attributeValue("val") == null) {
                parseBoolean = true;
            } else {
                parseBoolean = Boolean.parseBoolean(element5.attributeValue("val"));
            }
            aVar.c = parseBoolean;
        }
        Element element6 = element.element("u");
        if (element6 != null) {
            if (element6.attributeValue("val") != null) {
                String attributeValue2 = element6.attributeValue("val");
                if (attributeValue2.equalsIgnoreCase("none")) {
                    aVar.f32146g = 0;
                } else if (attributeValue2.equalsIgnoreCase("single")) {
                    aVar.f32146g = 1;
                } else if (attributeValue2.equalsIgnoreCase("double")) {
                    aVar.f32146g = 2;
                } else if (attributeValue2.equalsIgnoreCase("singleAccounting")) {
                    aVar.f32146g = 33;
                } else if (attributeValue2.equalsIgnoreCase("doubleAccounting")) {
                    aVar.f32146g = 34;
                }
            } else {
                aVar.f32146g = 1;
            }
        }
        Element element7 = element.element("strike");
        if (element7 != null) {
            if (element7.attributeValue("val") != null) {
                z10 = Boolean.parseBoolean(element7.attributeValue("val"));
            }
            aVar.f32147h = z10;
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int processIndexedColors(Element element) {
        String attributeValue = element.attributeValue("rgb");
        if (attributeValue.length() > 6) {
            attributeValue = attributeValue.substring(attributeValue.length() - 6);
        }
        return Integer.parseInt(attributeValue, 16) | (-16777216);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f processNumberFormat(Element element) {
        return new f(element.attribute("formatCode").getValue(), (short) Integer.parseInt(element.attribute("numFmtId").getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processTableFormat(Element element) {
        if (this.tableFormatManager == null) {
            ji.d dVar = new ji.d();
            this.tableFormatManager = dVar;
            this.book.f16632j = dVar;
        }
        e eVar = new e();
        Element element2 = element.element("numFmt");
        if (element2 != null) {
            eVar.f18502a = processNumberFormat(element2);
        }
        Element element3 = element.element(CellUtil.FONT);
        if (element3 != null) {
            this.book.c(this.fontIndex, processFont(element3));
            int i10 = this.fontIndex;
            this.fontIndex = i10 + 1;
            eVar.f18503b = (short) i10;
        }
        Element element4 = element.element("fill");
        if (element4 != null) {
            eVar.f18505e = processFill(element4);
        }
        Element element5 = element.element("border");
        if (element5 != null) {
            eVar.f18504d = processBorder(element5);
        }
        Element element6 = element.element(CellUtil.ALIGNMENT);
        if (element6 != null) {
            processCellStyleAlignment(eVar, element6);
        }
        HashMap hashMap = this.tableFormatManager.f19273a;
        hashMap.put(Integer.valueOf(hashMap.size()), eVar);
    }

    public void getWorkBookStyle(PackagePart packagePart, d dVar, j jVar) {
        this.book = dVar;
        this.iReader = jVar;
        this.fontIndex = 0;
        this.fillIndex = 0;
        this.borderIndex = 0;
        this.styleIndex = 0;
        this.indexedColor = 0;
        this.fills = new HashMap(5);
        this.cellBorders = new HashMap(5);
        getBuiltinNumberFormats();
        SAXReader sAXReader = new SAXReader();
        try {
            StyleSaxHandler styleSaxHandler = new StyleSaxHandler();
            sAXReader.addHandler("/styleSheet/numFmts/numFmt", styleSaxHandler);
            sAXReader.addHandler("/styleSheet/fonts/font", styleSaxHandler);
            sAXReader.addHandler("/styleSheet/fills/fill", styleSaxHandler);
            sAXReader.addHandler("/styleSheet/borders/border", styleSaxHandler);
            sAXReader.addHandler("/styleSheet/cellXfs/xf", styleSaxHandler);
            sAXReader.addHandler("/styleSheet/colors/indexedColors/rgbColor", styleSaxHandler);
            sAXReader.addHandler("/styleSheet/dxfs/dxf", styleSaxHandler);
            InputStream inputStream = packagePart.getInputStream();
            sAXReader.read(inputStream);
            inputStream.close();
            dispose();
        } finally {
            sAXReader.resetHandlers();
        }
    }

    /* loaded from: classes3.dex */
    public class StyleSaxHandler implements ElementHandler {
        public StyleSaxHandler() {
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onEnd(ElementPath elementPath) {
            if (!StyleReader.this.iReader.isAborted()) {
                Element current = elementPath.getCurrent();
                String name = current.getName();
                if (name.equals("numFmt")) {
                    f processNumberFormat = StyleReader.this.processNumberFormat(current);
                    StyleReader.this.numFmts.put(Integer.valueOf(processNumberFormat.f18506a), processNumberFormat);
                } else if (name.equals(CellUtil.FONT)) {
                    d dVar = StyleReader.this.book;
                    StyleReader styleReader = StyleReader.this;
                    int i10 = styleReader.fontIndex;
                    styleReader.fontIndex = i10 + 1;
                    dVar.c(i10, StyleReader.this.processFont(current));
                } else if (name.equals("fill")) {
                    Map map = StyleReader.this.fills;
                    StyleReader styleReader2 = StyleReader.this;
                    int i11 = styleReader2.fillIndex;
                    styleReader2.fillIndex = i11 + 1;
                    map.put(Integer.valueOf(i11), StyleReader.this.processFill(current));
                } else if (name.equals("border")) {
                    Map map2 = StyleReader.this.cellBorders;
                    StyleReader styleReader3 = StyleReader.this;
                    int i12 = styleReader3.borderIndex;
                    styleReader3.borderIndex = i12 + 1;
                    map2.put(Integer.valueOf(i12), StyleReader.this.processBorder(current));
                } else if (name.equals("xf")) {
                    d dVar2 = StyleReader.this.book;
                    StyleReader styleReader4 = StyleReader.this;
                    int i13 = styleReader4.styleIndex;
                    styleReader4.styleIndex = i13 + 1;
                    e processCellStyle = StyleReader.this.processCellStyle(current);
                    synchronized (dVar2) {
                        dVar2.f16628f.put(Integer.valueOf(i13), processCellStyle);
                    }
                } else if (name.equals("rgbColor")) {
                    d dVar3 = StyleReader.this.book;
                    StyleReader styleReader5 = StyleReader.this;
                    int i14 = styleReader5.indexedColor;
                    styleReader5.indexedColor = i14 + 1;
                    dVar3.b(i14, StyleReader.this.processIndexedColors(current));
                } else if (name.equals("dxf")) {
                    StyleReader.this.processTableFormat(current);
                }
                current.detach();
                return;
            }
            throw new AbortReaderError("abort Reader");
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onStart(ElementPath elementPath) {
        }
    }
}
