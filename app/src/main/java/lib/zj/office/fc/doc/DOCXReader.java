package lib.zj.office.fc.doc;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.play.core.assetpacks.b1;
import com.tom_roush.fontbox.ttf.NamingTable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams;
import fj.d;
import fj.e;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import lh.g;
import lh.i;
import lh.o;
import lh.p;
import lh.q;
import lh.r;
import lh.s;
import lh.t;
import lib.zj.office.PathHolder;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.ElementHandler;
import lib.zj.office.fc.dom4j.ElementPath;
import lib.zj.office.fc.dom4j.io.SAXReader;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.hssf.record.chart.SeriesTextRecord;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.PackageRelationship;
import lib.zj.office.fc.openxml4j.opc.PackageRelationshipTypes;
import lib.zj.office.fc.openxml4j.opc.ZipPackage;
import lib.zj.office.fc.ppt.reader.ReaderKit;
import lib.zj.office.fc.ppt.reader.ThemeReader;
import lib.zj.office.fc.ss.util.CellUtil;
import lib.zj.office.fc.util.NumberFormatUtil;
import lib.zj.office.fc.xls.Reader.drawing.ChartReader;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.system.AbortReaderError;
import lib.zj.office.system.b;
import lib.zj.office.system.f;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import ug.a;
import zh.c;
import zh.h;
import zh.j;
import zh.l;
import zh.m;
import zh.n;

/* loaded from: classes3.dex */
public class DOCXReader extends b {
    private static final String TAG = "DOCXReader";
    private String filePath;
    private PackagePart hfPart;
    private boolean isProcessHF;
    private boolean isProcessWatermark;
    private boolean needFilterStream;
    private boolean needParseByStream;
    private long offset;
    private PackagePart packagePart;
    private l secElem;
    private int styleID;
    private long textboxIndex;
    private Map<String, Integer> themeColor;
    private e wpdoc;
    private ZipPackage zipPackage;
    private long lastSectionOffset = 0;
    private Element sectionMarginElement = null;
    private final Map<String, Integer> styleStrID = new HashMap();
    private final Map<String, Integer> tableStyle = new HashMap();
    Hashtable<String, String> bulletNumbersID = new Hashtable<>();
    private List<g> relativeType = new ArrayList();
    private Map<g, int[]> relativeValue = new HashMap();

    public DOCXReader(f fVar, String str, boolean z10, boolean z11) {
        this.needParseByStream = false;
        this.needFilterStream = false;
        this.control = fVar;
        this.filePath = str;
        this.needParseByStream = z10;
        this.needFilterStream = z11;
    }

    private i addPicture(Element element, Rectangle rectangle, Element element2) {
        Element element3;
        String attributeValue;
        PackagePart packagePart;
        PackagePart packagePart2;
        i iVar = null;
        if (element != null && rectangle != null && (element3 = element.element("blipFill")) != null) {
            kh.b A = b.b.A(element3);
            Element element4 = element3.element("blip");
            if (element4 != null && (attributeValue = element4.attributeValue("embed")) != null) {
                if (this.isProcessHF && (packagePart2 = this.hfPart) != null) {
                    packagePart = this.zipPackage.getPart(packagePart2.getRelationship(attributeValue).getTargetURI());
                } else {
                    PackagePart packagePart3 = this.packagePart;
                    if (packagePart3 != null && packagePart3.getRelationship(attributeValue) != null) {
                        packagePart = this.zipPackage.getPart(this.packagePart.getRelationship(attributeValue).getTargetURI());
                    } else {
                        packagePart = null;
                    }
                }
                if (packagePart != null) {
                    iVar = new i();
                    try {
                        ReaderKit.instance().processRotation(iVar, element2);
                        iVar.f20623m = this.control.o().g().d(packagePart);
                    } catch (Exception e10) {
                        f fVar = this.control;
                        if (fVar != null && fVar.o() != null) {
                            this.control.o().c().a(false, e10);
                        }
                    }
                    iVar.f20625o = A;
                    iVar.f20604e = rectangle;
                }
            }
        }
        return iVar;
    }

    private zh.i addShape(lh.b bVar, j jVar) {
        f fVar;
        if (bVar != null && jVar != null && (fVar = this.control) != null && fVar.o() != null) {
            zh.i iVar = new zh.i(String.valueOf(1));
            long j10 = this.offset;
            iVar.f32371a = j10;
            long j11 = j10 + 1;
            this.offset = j11;
            iVar.f32372b = j11;
            jVar.e(iVar);
            zh.b bVar2 = zh.b.f32374b;
            zh.f fVar2 = iVar.c;
            int d10 = this.control.o().h().d(bVar);
            bVar2.getClass();
            zh.b.S(fVar2, d10);
            return iVar;
        }
        return null;
    }

    private int convertedNumberFormat(String str) {
        if ("decimal".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("upperRoman".equalsIgnoreCase(str)) {
            return 1;
        }
        if ("lowerRoman".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("upperLetter".equalsIgnoreCase(str)) {
            return 3;
        }
        if ("lowerLetter".equalsIgnoreCase(str)) {
            return 4;
        }
        if ("chineseCountingThousand".equalsIgnoreCase(str)) {
            return 39;
        }
        if ("chineseLegalSimplified".equalsIgnoreCase(str)) {
            return 38;
        }
        if ("ideographTraditional".equalsIgnoreCase(str)) {
            return 30;
        }
        if ("ideographZodiac".equalsIgnoreCase(str)) {
            return 31;
        }
        if ("ordinal".equalsIgnoreCase(str)) {
            return 5;
        }
        if ("cardinalText".equalsIgnoreCase(str)) {
            return 6;
        }
        if ("ordinalText".equalsIgnoreCase(str)) {
            return 7;
        }
        if (!"decimalZero".equalsIgnoreCase(str)) {
            return 0;
        }
        return 22;
    }

    private InputStream filterInputStream(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                byteArrayOutputStream.write(filterText(readLine).getBytes());
                byteArrayOutputStream.write(System.lineSeparator().getBytes());
            }
            bufferedReader.close();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    private String filterText(String str) {
        if (str == null) {
            return "";
        }
        return str.replaceAll("\ufffe", "").replaceAll("�", "").replaceAll("\ufeff", "");
    }

    private byte getAlign(String str) {
        if ("left".equalsIgnoreCase(str)) {
            return (byte) 1;
        }
        if ("right".equalsIgnoreCase(str)) {
            return (byte) 3;
        }
        if ("top".equalsIgnoreCase(str)) {
            return (byte) 4;
        }
        if ("bottom".equalsIgnoreCase(str)) {
            return (byte) 5;
        }
        if ("center".equalsIgnoreCase(str)) {
            return (byte) 2;
        }
        if ("inside".equalsIgnoreCase(str)) {
            return (byte) 6;
        }
        if ("outside".equalsIgnoreCase(str)) {
            return (byte) 7;
        }
        return (byte) 0;
    }

    private tg.b getArrowExtendPath(Path path, eh.b bVar, gh.b bVar2, boolean z10, byte b10) {
        tg.b bVar3 = new tg.b();
        bVar3.f30013e = true;
        bVar3.c(path);
        if (bVar != null || z10) {
            if (z10) {
                if (b10 != 5) {
                    if (bVar2 != null) {
                        bVar3.f30011b = bVar2.f17807b;
                    } else if (bVar != null) {
                        bVar3.f30011b = bVar;
                    }
                } else {
                    bVar3.b(bVar2);
                }
            } else if (bVar != null) {
                bVar3.f30011b = bVar;
            }
        }
        return bVar3;
    }

    private int getArrowLength(String str) {
        if ("short".equalsIgnoreCase(str)) {
            return 0;
        }
        if (Constants.LONG.equalsIgnoreCase(str)) {
            return 2;
        }
        return 1;
    }

    private byte getArrowType(String str) {
        if ("block".equalsIgnoreCase(str)) {
            return (byte) 1;
        }
        if ("classic".equalsIgnoreCase(str)) {
            return (byte) 2;
        }
        if ("oval".equalsIgnoreCase(str)) {
            return (byte) 4;
        }
        if ("diamond".equalsIgnoreCase(str)) {
            return (byte) 3;
        }
        if (PDWindowsLaunchParams.OPERATION_OPEN.equalsIgnoreCase(str)) {
            return (byte) 5;
        }
        return (byte) 0;
    }

    private int getArrowWidth(String str) {
        if ("narrow".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("wide".equalsIgnoreCase(str)) {
            return 2;
        }
        return 1;
    }

    private int getAutoShapeType(Element element) {
        int i10;
        String name = element.getName();
        if (name.equals("rect")) {
            i10 = 1;
        } else if (name.equals("roundrect")) {
            i10 = 2;
        } else if (name.equals("oval")) {
            i10 = 3;
        } else if (name.equals("curve")) {
            i10 = 248;
        } else if (name.equals("polyline")) {
            i10 = 249;
        } else if (name.equals("line")) {
            i10 = 247;
        } else {
            i10 = 0;
        }
        if (element.attribute("type") != null) {
            String attributeValue = element.attributeValue("type");
            if (attributeValue != null && attributeValue.length() > 9) {
                return NumberFormatUtil.toInt(attributeValue.substring(9));
            }
            return i10;
        } else if (element.attribute("path") != null) {
            return UnknownRecord.BITMAP_00E9;
        } else {
            return i10;
        }
    }

    private int getColor(String str, boolean z10) {
        if (str == null) {
            if (z10) {
                return -1;
            }
            return -16777216;
        }
        int indexOf = str.indexOf(" ");
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        if (str.charAt(0) == '#') {
            if (str.length() > 6) {
                try {
                    return Color.parseColor(str);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return -16777216;
                }
            } else if (str.length() == 4) {
                StringBuilder sb2 = new StringBuilder("#");
                for (int i10 = 1; i10 < 4; i10++) {
                    sb2.append(str.charAt(i10));
                    sb2.append(str.charAt(i10));
                }
                try {
                    return Color.parseColor(sb2.toString());
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return -16777216;
                }
            }
        }
        if (!str.contains("black") && !str.contains("darken")) {
            if (str.contains("green")) {
                return -16744448;
            }
            if (str.contains("silver")) {
                return -4144960;
            }
            if (str.contains("lime")) {
                return -16711936;
            }
            if (str.contains("gray")) {
                return -8355712;
            }
            if (str.contains("olive")) {
                return -8355840;
            }
            if (str.contains("white")) {
                return -1;
            }
            if (str.contains("yellow")) {
                return -256;
            }
            if (str.contains("maroon")) {
                return -8388608;
            }
            if (str.contains("navy")) {
                return -16777088;
            }
            if (str.contains("red")) {
                return -65536;
            }
            if (str.contains("blue")) {
                return -16776961;
            }
            if (str.contains("purple")) {
                return -8388480;
            }
            if (str.contains("teal")) {
                return -16744320;
            }
            if (str.contains("fuchsia")) {
                return -65281;
            }
            if (str.contains("aqua")) {
                return -16711681;
            }
            if (z10) {
                return -1;
            }
        }
        return -16777216;
    }

    private short getDrawingWrapType(Element element) {
        Element parent;
        if (element != null) {
            if (element.element("wrapNone") != null) {
                String attributeValue = element.attributeValue("behindDoc");
                if (TextUtils.isEmpty(attributeValue) && (parent = element.getParent()) != null) {
                    attributeValue = parent.attributeValue("behindDoc");
                }
                if (!TextUtils.isEmpty(attributeValue)) {
                    if ("1".equalsIgnoreCase(attributeValue)) {
                        return (short) 6;
                    }
                    return (short) 3;
                }
                return (short) -1;
            } else if (element.element("wrapSquare") != null) {
                return (short) 1;
            } else {
                if (element.element("wrapTight") != null) {
                    return (short) 0;
                }
                if (element.element("wrapThrough") != null) {
                    return (short) 4;
                }
                if (element.element("wrapTopAndBottom") != null) {
                    return (short) 5;
                }
                return (short) 2;
            }
        }
        return (short) -1;
    }

    private byte getFillType(String str) {
        if ("gradient".equalsIgnoreCase(str)) {
            return (byte) 7;
        }
        if ("gradientRadial".equalsIgnoreCase(str)) {
            return (byte) 4;
        }
        if ("pattern".equalsIgnoreCase(str)) {
            return (byte) 1;
        }
        if ("tile".equalsIgnoreCase(str)) {
            return (byte) 2;
        }
        if ("frame".equalsIgnoreCase(str)) {
            return (byte) 3;
        }
        return (byte) 0;
    }

    private int getRadialGradientPositionType(Element element) {
        String[] split;
        String attributeValue = element.attributeValue("focusposition");
        if (attributeValue == null || attributeValue.length() <= 0 || (split = attributeValue.split(",")) == null) {
            return 0;
        }
        if (split.length == 2) {
            if (".5".equalsIgnoreCase(split[0]) && ".5".equalsIgnoreCase(split[1])) {
                return 4;
            }
            if ("1".equalsIgnoreCase(split[0]) && "1".equalsIgnoreCase(split[1])) {
                return 3;
            }
            if ("".equalsIgnoreCase(split[0]) && "1".equalsIgnoreCase(split[1])) {
                return 2;
            }
            if (!"1".equalsIgnoreCase(split[0]) || !"".equalsIgnoreCase(split[1])) {
                return 0;
            }
        } else if (split.length != 1 || !"1".equalsIgnoreCase(split[0])) {
            return 0;
        }
        return 1;
    }

    private byte getRelative(String str) {
        if ("margin".equalsIgnoreCase(str)) {
            return (byte) 1;
        }
        if ("page".equalsIgnoreCase(str)) {
            return (byte) 2;
        }
        if ("column".equalsIgnoreCase(str)) {
            return (byte) 0;
        }
        if ("character".equalsIgnoreCase(str)) {
            return (byte) 3;
        }
        if ("leftMargin".equalsIgnoreCase(str)) {
            return (byte) 4;
        }
        if ("rightMargin".equalsIgnoreCase(str)) {
            return (byte) 5;
        }
        if ("insideMargin".equalsIgnoreCase(str)) {
            return (byte) 8;
        }
        if ("outsideMargin".equalsIgnoreCase(str)) {
            return (byte) 9;
        }
        if ("paragraph".equalsIgnoreCase(str)) {
            return (byte) 10;
        }
        if ("line".equalsIgnoreCase(str)) {
            return (byte) 11;
        }
        if ("topMargin".equalsIgnoreCase(str)) {
            return (byte) 6;
        }
        if (!"bottomMargin".equalsIgnoreCase(str)) {
            return (byte) 0;
        }
        return (byte) 7;
    }

    private short getShapeWrapType(Element element) {
        Element element2 = element.element("wrap");
        if (element2 != null) {
            String attributeValue = element2.attributeValue("type");
            if ("none".equalsIgnoreCase(attributeValue)) {
                return (short) 2;
            }
            if ("square".equalsIgnoreCase(attributeValue)) {
                return (short) 1;
            }
            if ("tight".equalsIgnoreCase(attributeValue)) {
                return (short) 0;
            }
            if ("topAndBottom".equalsIgnoreCase(attributeValue)) {
                return (short) 5;
            }
            if ("through".equalsIgnoreCase(attributeValue)) {
                return (short) 4;
            }
        }
        String attributeValue2 = element.attributeValue("style");
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split(";");
            for (int length = split.length - 1; length >= 0; length--) {
                if (split[length].contains("z-index:")) {
                    if (NumberFormatUtil.toInt(split[length].replace("z-index:", "")) > 0) {
                        return (short) 3;
                    }
                    return (short) 6;
                }
            }
            return (short) -1;
        }
        return (short) -1;
    }

    private float getValue(String str) {
        float parseFloat;
        int indexOf = str.indexOf("pt");
        if (indexOf > 0) {
            parseFloat = Float.parseFloat(str.substring(0, indexOf));
        } else {
            int indexOf2 = str.indexOf("in");
            if (indexOf2 > 0) {
                parseFloat = Float.parseFloat(str.substring(0, indexOf2)) * 72.0f;
            } else {
                parseFloat = (Float.parseFloat(str) * 72.0f) / 914400.0f;
            }
        }
        return parseFloat * 1.3333334f;
    }

    private float getValueInPt(String str, float f10) {
        if (str.contains("pt")) {
            return Float.parseFloat(str.substring(0, str.indexOf("pt")));
        }
        if (str.contains("in")) {
            return Float.parseFloat(str.substring(0, str.indexOf("in"))) * 72.0f;
        }
        if (str.contains("mm")) {
            return Float.parseFloat(str.substring(0, str.indexOf("mm"))) * 2.835f;
        }
        return ((Float.parseFloat(str) * f10) * 72.0f) / 914400.0f;
    }

    private boolean hasTextbox2007(Element element) {
        Element element2 = element.element("textbox");
        if (element2 != null) {
            if (element2.element("txbxContent") != null) {
                return true;
            }
        } else if (element.element("textpath") != null) {
            String attributeValue = element.element("textpath").attributeValue("string");
            if (attributeValue != null && attributeValue.length() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean hasTextbox2010(Element element) {
        Element element2 = element.element("txbx");
        if (element2 != null && element2.element("txbxContent") != null) {
            return true;
        }
        return false;
    }

    private void initBodySection(l lVar) {
        this.secElem = lVar;
        lVar.f32371a = 0L;
        lVar.f32372b = this.offset;
        this.wpdoc.h(lVar);
    }

    private void openFile() {
        eh.b bVar;
        ZipPackage zipPackage = new ZipPackage(this.filePath, this.needParseByStream);
        this.zipPackage = zipPackage;
        if (zipPackage.getParts().size() != 0) {
            PackageRelationship relationship = this.zipPackage.getRelationshipsByType(PackageRelationshipTypes.CORE_DOCUMENT).getRelationship(0);
            if (relationship.getTargetURI().toString().equals("/word/document.xml")) {
                this.packagePart = this.zipPackage.getPart(relationship);
                processThemeColor();
                processBulletNumber();
                processStyle();
                this.offset = 0L;
                SAXReader sAXReader = new SAXReader();
                DOCXSaxHandler dOCXSaxHandler = new DOCXSaxHandler();
                sAXReader.addHandler("/document/body/tbl", dOCXSaxHandler);
                sAXReader.addHandler("/document/body/p", dOCXSaxHandler);
                sAXReader.addHandler("/document/body/sdt", dOCXSaxHandler);
                InputStream inputStream = this.packagePart.getInputStream();
                if (this.needFilterStream) {
                    inputStream = filterInputStream(inputStream);
                }
                Document read = sAXReader.read(inputStream);
                Element element = read.getRootElement().element("background");
                if (element != null) {
                    if (element.element("background") != null) {
                        bVar = processBackgroundAndFill(element.element("background"));
                    } else {
                        String attributeValue = element.attributeValue("color");
                        if (attributeValue != null) {
                            eh.b bVar2 = new eh.b();
                            try {
                                bVar2.f16571d = Color.parseColor("#".concat(attributeValue));
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                            bVar = bVar2;
                        } else {
                            bVar = null;
                        }
                    }
                    this.wpdoc.f17305e = bVar;
                }
                processSection(read.getRootElement().element("body"));
                processRelativeShapeSize();
                return;
            }
            throw new Exception("Format error");
        }
        throw new Exception("Format error");
    }

    private Object[] parseWrInfo(Element element, j jVar, byte b10) {
        byte b11;
        Boolean bool = Boolean.FALSE;
        Object[] objArr = {bool, bool, null};
        List<Element> elements = element.elements();
        if (elements != null && !elements.isEmpty()) {
            Element element2 = element.element("rPr");
            for (Element element3 : elements) {
                String name = element3.getName();
                String str = "\n";
                if ("br".equals(name)) {
                    if ("page".equals(element3.attributeValue("type"))) {
                        objArr[0] = Boolean.TRUE;
                        str = String.valueOf('\f');
                    } else {
                        str = String.valueOf((char) 11) + "\n";
                    }
                } else if ("t".equals(name)) {
                    str = element3.getText().replaceAll("——", "--").replaceAll("（", "(").replaceAll("）", ")");
                } else if (!"cr".equals(name)) {
                    str = "";
                }
                int length = str.length();
                if (length > 0) {
                    objArr[1] = Boolean.TRUE;
                    zh.i iVar = new zh.i(str);
                    if (element2 != null) {
                        processRunAttribute(element2, iVar.c);
                    }
                    if (this.isProcessHF && this.hfPart != null) {
                        zh.b bVar = zh.b.f32374b;
                        zh.f fVar = iVar.c;
                        if (b10 > 0) {
                            b11 = b10;
                        } else {
                            b11 = 1;
                        }
                        bVar.getClass();
                        ((c) fVar).e(b11, (short) 15);
                    }
                    objArr[2] = iVar;
                    long j10 = this.offset;
                    iVar.f32371a = j10;
                    long j11 = j10 + length;
                    this.offset = j11;
                    iVar.f32372b = j11;
                    jVar.e(iVar);
                }
            }
        }
        return objArr;
    }

    private void pasePicLink(Element element, zh.i iVar) {
        Element element2;
        String attributeValue;
        URI uri;
        int i10;
        PackagePart packagePart;
        if (element != null && iVar != null && (element2 = element.element("hlinkClick")) != null && (attributeValue = element2.attributeValue(FacebookMediationAdapter.KEY_ID)) != null) {
            if (this.isProcessHF && (packagePart = this.hfPart) != null) {
                uri = packagePart.getRelationship(attributeValue).getTargetURI();
            } else {
                PackagePart packagePart2 = this.packagePart;
                if (packagePart2 != null && packagePart2.getRelationship(attributeValue) != null) {
                    uri = this.packagePart.getRelationship(attributeValue).getTargetURI();
                } else {
                    uri = null;
                }
            }
            if (uri != null) {
                String uri2 = uri.toString();
                if (!TextUtils.isEmpty(uri2)) {
                    if (uri2.contains("mailto:")) {
                        i10 = 3;
                    } else {
                        i10 = 1;
                    }
                    int a10 = this.control.o().d().a(i10, uri2);
                    if (a10 >= 0) {
                        zh.b bVar = zh.b.f32374b;
                        zh.f fVar = iVar.c;
                        bVar.getClass();
                        zh.b.w(fVar, -16776961);
                        zh.b.B(iVar.c, 1);
                        zh.b.C(iVar.c, -16776961);
                        zh.b.D(iVar.c, a10);
                    }
                }
            }
        }
    }

    private void processAlternateContent(Element element, j jVar) {
        Element element2;
        Element element3;
        short s4;
        Element element4;
        Element element5;
        String attributeValue;
        if (element != null && (element2 = element.element("Choice")) != null && (element3 = element2.element("drawing")) != null) {
            Element element6 = element3.element("anchor");
            if (element6 == null) {
                element6 = element3.element("inline");
                s4 = 2;
            } else {
                s4 = -1;
            }
            if (element6 != null) {
                Element element7 = element6.element("docPr");
                if ((element7 == null || (attributeValue = element7.attributeValue(NamingTable.TAG)) == null || (!attributeValue.startsWith("Genko") && !attributeValue.startsWith("Header") && !attributeValue.startsWith("Footer"))) && (element4 = element6.element("graphic")) != null && (element5 = element4.element("graphicData")) != null) {
                    Iterator elementIterator = element5.elementIterator();
                    while (elementIterator.hasNext()) {
                        lh.b processAutoShape2010 = processAutoShape2010(jVar, (Element) elementIterator.next(), null, 1.0f, 1.0f, 0, 0, true);
                        if (processAutoShape2010 != null) {
                            if (processAutoShape2010 instanceof p) {
                                p pVar = (p) processAutoShape2010;
                                r rVar = pVar.D;
                                if (rVar != null) {
                                    if (s4 == -1) {
                                        s4 = getDrawingWrapType(element6);
                                    }
                                    rVar.f20655p = s4;
                                    setShapeWrapType(rVar, s4);
                                }
                                processWrapAndPosition_Drawing(pVar, element6, processAutoShape2010.getBounds());
                            } else if (processAutoShape2010 instanceof i) {
                                s sVar = new s();
                                sVar.v((i) processAutoShape2010);
                                sVar.f20604e = processAutoShape2010.getBounds();
                                processWrapAndPosition_Drawing(sVar, element6, processAutoShape2010.getBounds());
                            }
                        }
                    }
                }
            }
        }
    }

    private void processArrow(p pVar, Element element) {
        Element element2 = element.element("stroke");
        if (element2 != null) {
            byte arrowType = getArrowType(element2.attributeValue("startarrow"));
            if (arrowType > 0) {
                pVar.r(arrowType, getArrowWidth(element2.attributeValue("startarrowwidth")), getArrowLength(element2.attributeValue("startarrowlength")));
            }
            byte arrowType2 = getArrowType(element2.attributeValue("endarrow"));
            if (arrowType2 > 0) {
                pVar.q(arrowType2, getArrowWidth(element2.attributeValue("endarrowwidth")), getArrowLength(element2.attributeValue("endarrowlength")));
            }
        }
    }

    private p processAutoShape(Element element, j jVar, r rVar, float f10, float f11, boolean z10) {
        String[] strArr;
        Float[] fArr;
        DOCXReader dOCXReader;
        Element element2;
        p pVar;
        int i10;
        eh.b bVar;
        gh.b bVar2;
        Path path;
        Path path2;
        PointF pointF;
        Path path3;
        PointF pointF2;
        PointF pointF3;
        Path path4;
        PointF pointF4;
        Path path5;
        PointF pointF5;
        Path path6;
        PointF pointF6;
        Path path7;
        Path path8;
        PointF pointF7;
        Path path9;
        p pVar2;
        int i11;
        String attributeValue;
        if (element == null) {
            return null;
        }
        int autoShapeType = getAutoShapeType(element);
        if (element.attribute("adj") != null && (attributeValue = element.attributeValue("adj")) != null && attributeValue.length() > 0) {
            strArr = attributeValue.split(",");
        } else {
            strArr = null;
        }
        if (strArr != null && strArr.length > 0) {
            fArr = new Float[strArr.length];
            for (int i12 = 0; i12 < strArr.length; i12++) {
                String str = strArr[i12];
                if (str != null && str.length() > 0) {
                    fArr[i12] = Float.valueOf(Float.parseFloat(str) / 21600.0f);
                } else {
                    fArr[i12] = null;
                }
            }
        } else {
            fArr = null;
        }
        eh.b processBackgroundAndFill = processBackgroundAndFill(element);
        gh.b processLine = processLine(element);
        if (autoShapeType != 32 && autoShapeType != 33 && autoShapeType != 34 && autoShapeType != 38) {
            if (autoShapeType == 233) {
                pVar = new p();
                pVar.f20615m = UnknownRecord.BITMAP_00E9;
                processArrow(pVar, element);
                String attributeValue2 = element.attributeValue("path");
                float processPolygonZoom = processPolygonZoom(element, pVar, rVar, f10, f11);
                if (processLine != null) {
                    i11 = processLine.f17806a;
                } else {
                    i11 = 1;
                }
                PathWithArrow createPath = VMLPathParser.instance().createPath(pVar, attributeValue2, Math.round(i11 * processPolygonZoom));
                if (createPath != null) {
                    Path[] polygonPath = createPath.getPolygonPath();
                    if (polygonPath != null) {
                        for (Path path10 : polygonPath) {
                            tg.b bVar3 = new tg.b();
                            bVar3.c(path10);
                            if (processLine != null) {
                                bVar3.b(processLine);
                            }
                            if (processBackgroundAndFill != null) {
                                bVar3.f30011b = processBackgroundAndFill;
                            }
                            pVar.u(bVar3);
                        }
                    }
                    if (createPath.getStartArrow() != null) {
                        pVar.u(getArrowExtendPath(createPath.getStartArrow(), processBackgroundAndFill, processLine, true, pVar.f20621p.c));
                    }
                    if (createPath.getEndArrow() != null) {
                        pVar.u(getArrowExtendPath(createPath.getEndArrow(), processBackgroundAndFill, processLine, true, pVar.f20622q.c));
                    }
                }
            } else if (autoShapeType != 247 && autoShapeType != 248 && autoShapeType != 249) {
                String attributeValue3 = element.attributeValue(FacebookMediationAdapter.KEY_ID);
                if (attributeValue3 != null && attributeValue3.indexOf("WaterMarkObject") > 0) {
                    this.isProcessWatermark = true;
                }
                if (this.isProcessWatermark) {
                    pVar2 = new t();
                } else {
                    pVar2 = new p();
                }
                pVar = pVar2;
                pVar.f20615m = autoShapeType;
                processArrow(pVar, element);
                if (processBackgroundAndFill != null) {
                    pVar.f20603d = processBackgroundAndFill;
                }
                if (processLine != null) {
                    pVar.f20610k = processLine;
                }
                pVar.f20616n = fArr;
            } else {
                pVar = new p();
                pVar.f20615m = autoShapeType;
                processArrow(pVar, element);
                PathHolder pathHolder = new PathHolder();
                if (processLine != null) {
                    i10 = processLine.f17806a;
                } else {
                    i10 = 1;
                }
                if (autoShapeType == 20) {
                    if (processLine != null) {
                        processBackgroundAndFill = processLine.f17807b;
                    }
                    PointF pointF8 = processPoints(element.attributeValue("from"))[0];
                    PointF pointF9 = processPoints(element.attributeValue("to"))[0];
                    if (pVar.t()) {
                        a e10 = ug.b.e(pointF9.x, pointF9.y, pointF8.x, pointF8.y, pVar.f20621p, i10);
                        path7 = e10.f30368a;
                        pointF6 = e10.f30369b;
                    } else {
                        pointF6 = null;
                        path7 = null;
                    }
                    if (pVar.s()) {
                        path8 = path7;
                        a e11 = ug.b.e(pointF8.x, pointF8.y, pointF9.x, pointF9.y, pVar.f20622q, i10);
                        path9 = e11.f30368a;
                        pointF7 = e11.f30369b;
                    } else {
                        path8 = path7;
                        pointF7 = null;
                        path9 = null;
                    }
                    if (pointF6 != null) {
                        pointF8 = ug.b.h(pointF8.x, pointF8.y, pointF6.x, pointF6.y, pVar.f20621p.c);
                    }
                    if (pointF7 != null) {
                        pointF9 = ug.b.h(pointF9.x, pointF9.y, pointF7.x, pointF7.y, pVar.f20622q.c);
                    }
                    pathHolder.moveTo(pointF8.x, pointF8.y);
                    pathHolder.lineTo(pointF9.x, pointF9.y);
                    path = path8;
                    path2 = path9;
                    bVar2 = processLine;
                    dOCXReader = this;
                    element2 = element;
                } else {
                    if (autoShapeType == 248) {
                        PointF pointF10 = processPoints(element.attributeValue("from"))[0];
                        PointF pointF11 = processPoints(element.attributeValue("control1"))[0];
                        PointF pointF12 = processPoints(element.attributeValue("control2"))[0];
                        PointF pointF13 = processPoints(element.attributeValue("to"))[0];
                        if (pVar.t()) {
                            bVar = processBackgroundAndFill;
                            bVar2 = processLine;
                            a d10 = ug.b.d(pointF13.x, pointF13.y, pointF12.x, pointF12.y, pointF11.x, pointF11.y, pointF10.x, pointF10.y, pVar.f20621p, i10);
                            path4 = d10.f30368a;
                            pointF3 = d10.f30369b;
                        } else {
                            bVar = processBackgroundAndFill;
                            bVar2 = processLine;
                            pointF3 = null;
                            path4 = null;
                        }
                        if (pVar.s()) {
                            path5 = path4;
                            pointF4 = pointF12;
                            a d11 = ug.b.d(pointF10.x, pointF10.y, pointF11.x, pointF11.y, pointF12.x, pointF12.y, pointF13.x, pointF13.y, pVar.f20622q, i10);
                            path6 = d11.f30368a;
                            pointF5 = d11.f30369b;
                        } else {
                            pointF4 = pointF12;
                            path5 = path4;
                            pointF5 = null;
                            path6 = null;
                        }
                        if (pointF3 != null) {
                            pointF10 = ug.b.h(pointF10.x, pointF10.y, pointF3.x, pointF3.y, pVar.f20621p.c);
                        }
                        if (pointF5 != null) {
                            pointF13 = ug.b.h(pointF13.x, pointF13.y, pointF5.x, pointF5.y, pVar.f20622q.c);
                        }
                        pathHolder.moveTo(pointF10.x, pointF10.y);
                        PointF pointF14 = pointF4;
                        pathHolder.cubicTo(pointF11.x, pointF11.y, pointF14.x, pointF14.y, pointF13.x, pointF13.y);
                        dOCXReader = this;
                        element2 = element;
                        path = path5;
                        path2 = path6;
                    } else {
                        bVar = processBackgroundAndFill;
                        bVar2 = processLine;
                        if (autoShapeType == 249) {
                            element2 = element;
                            dOCXReader = this;
                            PointF[] processPoints = dOCXReader.processPoints(element2.attributeValue("points"));
                            int length = processPoints.length;
                            if (pVar.t()) {
                                PointF pointF15 = processPoints[1];
                                float f12 = pointF15.x;
                                float f13 = pointF15.y;
                                PointF pointF16 = processPoints[0];
                                a e12 = ug.b.e(f12, f13, pointF16.x, pointF16.y, pVar.f20621p, i10);
                                path3 = e12.f30368a;
                                pointF = e12.f30369b;
                            } else {
                                pointF = null;
                                path3 = null;
                            }
                            if (pVar.s()) {
                                PointF pointF17 = processPoints[length - 2];
                                float f14 = pointF17.x;
                                float f15 = pointF17.y;
                                PointF pointF18 = processPoints[length - 1];
                                a e13 = ug.b.e(f14, f15, pointF18.x, pointF18.y, pVar.f20622q, i10);
                                Path path11 = e13.f30368a;
                                pointF2 = e13.f30369b;
                                path2 = path11;
                            } else {
                                pointF2 = null;
                                path2 = null;
                            }
                            if (pointF != null) {
                                PointF pointF19 = processPoints[0];
                                processPoints[0] = ug.b.h(pointF19.x, pointF19.y, pointF.x, pointF.y, pVar.f20621p.c);
                            }
                            if (pointF2 != null) {
                                int i13 = length - 1;
                                PointF pointF20 = processPoints[i13];
                                processPoints[i13] = ug.b.h(pointF20.x, pointF20.y, pointF2.x, pointF2.y, pVar.f20622q.c);
                            }
                            PointF pointF21 = processPoints[0];
                            pathHolder.moveTo(pointF21.x, pointF21.y);
                            for (int i14 = 1; i14 < processPoints.length; i14++) {
                                PointF pointF22 = processPoints[i14];
                                pathHolder.lineTo(pointF22.x, pointF22.y);
                            }
                            path = path3;
                        } else {
                            dOCXReader = this;
                            element2 = element;
                            processBackgroundAndFill = bVar;
                            path = null;
                            path2 = null;
                        }
                    }
                    processBackgroundAndFill = bVar;
                }
                tg.b bVar4 = new tg.b();
                bVar4.c(pathHolder);
                gh.b bVar5 = bVar2;
                if (bVar2 != null) {
                    bVar4.b(bVar5);
                }
                if (processBackgroundAndFill != null) {
                    bVar4.f30011b = processBackgroundAndFill;
                }
                pVar.u(bVar4);
                if (path != null) {
                    pVar.u(getArrowExtendPath(path, processBackgroundAndFill, bVar5, true, pVar.f20621p.c));
                }
                if (path2 != null) {
                    pVar.u(getArrowExtendPath(path2, processBackgroundAndFill, bVar5, true, pVar.f20622q.c));
                }
            }
            dOCXReader = this;
            element2 = element;
        } else {
            dOCXReader = this;
            element2 = element;
            pVar = new p();
            pVar.f20615m = autoShapeType;
            pVar.f20610k = processLine;
            dOCXReader.processArrow(pVar, element2);
            if (pVar.f20615m == 33 && fArr == null) {
                pVar.f20616n = new Float[]{Float.valueOf(1.0f)};
            } else {
                pVar.f20616n = fArr;
            }
        }
        pVar.f20617o = true;
        if (rVar == null) {
            pVar.A = getShapeWrapType(element);
        } else {
            pVar.A = rVar.f20655p;
        }
        processAutoShapeStyle(element, pVar, rVar, f10, f11);
        dOCXReader.processRotation(pVar);
        if (dOCXReader.isProcessWatermark) {
            dOCXReader.processWatermark((t) pVar, element2);
            dOCXReader.isProcessWatermark = false;
        }
        if (rVar == null) {
            dOCXReader.addShape(pVar, jVar);
        } else {
            rVar.q(pVar);
        }
        return pVar;
    }

    private lh.b processAutoShape2010(j jVar, Element element, r rVar, float f10, float f11, int i10, int i11, boolean z10) {
        return processAutoShape2010(this.packagePart, jVar, element, rVar, f10, f11, i10, i11, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0181 A[LOOP:0: B:70:0x017b->B:72:0x0181, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void processAutoShapeForPict(lib.zj.office.fc.dom4j.Element r19, zh.j r20, lh.r r21, float r22, float r23) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.doc.DOCXReader.processAutoShapeForPict(lib.zj.office.fc.dom4j.Element, zh.j, lh.r, float, float):void");
    }

    private Rectangle processAutoShapeStyle(Element element, lh.b bVar, lh.f fVar, float f10, float f11) {
        String attributeValue;
        String attributeValue2;
        String[] strArr;
        float f12;
        String str;
        String str2;
        String substring;
        float valueInPt;
        float valueInPt2;
        float f13 = f10;
        float f14 = f11;
        if (element != null && bVar != null && element.attribute("style") != null && element.attribute("style") != null && (attributeValue = element.attributeValue("style")) != null) {
            String[] split = attributeValue.split(";");
            char c = 0;
            float f15 = 0.0f;
            int i10 = 0;
            float f16 = 0.0f;
            float f17 = 0.0f;
            float f18 = 0.0f;
            while (i10 < split.length) {
                String[] split2 = split[i10].split(":");
                if (split2 != null && (str = split2[c]) != null && split2[1] != null && !"position".equalsIgnoreCase(str)) {
                    if ("left".equalsIgnoreCase(split2[c])) {
                        valueInPt2 = getValueInPt(split2[1], f13);
                    } else {
                        if ("top".equalsIgnoreCase(split2[c])) {
                            valueInPt = getValueInPt(split2[1], f14);
                        } else if (!"text-align".equalsIgnoreCase(split2[c])) {
                            if ("margin-left".equalsIgnoreCase(split2[c])) {
                                valueInPt2 = getValueInPt(split2[1], 1.0f);
                            } else if ("margin-top".equalsIgnoreCase(split2[c])) {
                                valueInPt = getValueInPt(split2[1], 1.0f);
                            } else {
                                if (InMobiNetworkValues.WIDTH.equalsIgnoreCase(split2[c])) {
                                    f18 = getValueInPt(split2[1], f13);
                                } else if (InMobiNetworkValues.HEIGHT.equalsIgnoreCase(split2[c])) {
                                    f15 = getValueInPt(split2[1], f14);
                                } else if ("mso-width-percent".equalsIgnoreCase(split2[c])) {
                                    if (!this.relativeType.contains(bVar)) {
                                        int[] iArr = new int[4];
                                        iArr[c] = (int) Float.parseFloat(split2[1]);
                                        this.relativeType.add(bVar);
                                        this.relativeValue.put(bVar, iArr);
                                    } else {
                                        this.relativeValue.get(bVar)[c] = (int) Float.parseFloat(split2[1]);
                                    }
                                } else if ("mso-height-percent".equalsIgnoreCase(split2[c])) {
                                    if (!this.relativeType.contains(bVar)) {
                                        int[] iArr2 = new int[4];
                                        iArr2[2] = (int) Float.parseFloat(split2[1]);
                                        this.relativeType.add(bVar);
                                        this.relativeValue.put(bVar, iArr2);
                                    } else {
                                        this.relativeValue.get(bVar)[2] = (int) Float.parseFloat(split2[1]);
                                    }
                                } else if ("flip".equalsIgnoreCase(split2[0])) {
                                    if ("x".equalsIgnoreCase(split2[1])) {
                                        bVar.f20605f = true;
                                    } else if (OperatorName.CURVE_TO_REPLICATE_FINAL_POINT.equalsIgnoreCase(split2[1])) {
                                        bVar.f20606g = true;
                                    }
                                } else if (CellUtil.ROTATION.equalsIgnoreCase(split2[0])) {
                                    if (split2[1].indexOf("fd") > 0) {
                                        split2[1] = split2[1].substring(0, str2.length() - 2);
                                        bVar.f20607h = NumberFormatUtil.toInt(substring) / 60000;
                                    } else {
                                        bVar.f20607h = NumberFormatUtil.toInt(split2[1]);
                                    }
                                } else if (!"mso-width-relative".equalsIgnoreCase(split2[0]) && !"mso-height-relative".equalsIgnoreCase(split2[0])) {
                                    if (fVar == null && bVar.getType() != 7 && "mso-position-horizontal".equalsIgnoreCase(split2[0])) {
                                        ((p) bVar).f20650v = getAlign(split2[1]);
                                    } else if (fVar == null && bVar.getType() != 7 && "mso-left-percent".equalsIgnoreCase(split2[0])) {
                                        p pVar = (p) bVar;
                                        pVar.f20649u = NumberFormatUtil.toInt(split2[1]);
                                        pVar.f20647s = (byte) 1;
                                    } else {
                                        strArr = split;
                                        if (fVar == null && bVar.getType() != 7) {
                                            f12 = f15;
                                            if ("mso-position-horizontal-relative".equalsIgnoreCase(split2[0])) {
                                                if ("margin".equalsIgnoreCase(split2[1])) {
                                                    ((p) bVar).f20648t = (byte) 1;
                                                } else if ("page".equalsIgnoreCase(split2[1])) {
                                                    ((p) bVar).f20648t = (byte) 2;
                                                } else if ("left-margin-area".equalsIgnoreCase(split2[1])) {
                                                    ((p) bVar).f20648t = (byte) 4;
                                                } else if ("right-margin-area".equalsIgnoreCase(split2[1])) {
                                                    ((p) bVar).f20648t = (byte) 5;
                                                } else if ("inner-margin-area".equalsIgnoreCase(split2[1])) {
                                                    ((p) bVar).f20648t = (byte) 8;
                                                } else if ("outer-margin-area".equalsIgnoreCase(split2[1])) {
                                                    ((p) bVar).f20648t = (byte) 9;
                                                } else if ("text".equalsIgnoreCase(split2[1])) {
                                                    ((p) bVar).f20648t = (byte) 0;
                                                } else if ("char".equalsIgnoreCase(split2[1])) {
                                                    ((p) bVar).f20648t = (byte) 3;
                                                }
                                                f15 = f12;
                                                i10++;
                                                f13 = f10;
                                                f14 = f11;
                                                split = strArr;
                                                c = 0;
                                            }
                                        } else {
                                            f12 = f15;
                                        }
                                        if (fVar == null && bVar.getType() != 7 && "mso-position-vertical".equalsIgnoreCase(split2[0])) {
                                            ((p) bVar).f20654z = getAlign(split2[1]);
                                        } else if (fVar == null && bVar.getType() != 7 && "mso-top-percent".equalsIgnoreCase(split2[0])) {
                                            p pVar2 = (p) bVar;
                                            pVar2.f20653y = NumberFormatUtil.toInt(split2[1]);
                                            pVar2.f20651w = (byte) 1;
                                        } else if (fVar == null && bVar.getType() != 7 && "mso-position-vertical-relative".equalsIgnoreCase(split2[0])) {
                                            if ("line".equalsIgnoreCase(split2[1])) {
                                                ((p) bVar).f20652x = (byte) 11;
                                            } else if ("text".equalsIgnoreCase(split2[1])) {
                                                ((p) bVar).f20652x = (byte) 10;
                                            } else if ("margin".equalsIgnoreCase(split2[1])) {
                                                ((p) bVar).f20652x = (byte) 1;
                                            } else if ("page".equalsIgnoreCase(split2[1])) {
                                                ((p) bVar).f20652x = (byte) 2;
                                            } else if ("top-margin-area".equalsIgnoreCase(split2[1])) {
                                                ((p) bVar).f20652x = (byte) 6;
                                            } else if ("bottom-margin-area".equalsIgnoreCase(split2[1])) {
                                                ((p) bVar).f20652x = (byte) 7;
                                            } else if ("inner-margin-area".equalsIgnoreCase(split2[1])) {
                                                ((p) bVar).f20652x = (byte) 8;
                                            } else if ("outer-margin-area".equalsIgnoreCase(split2[1])) {
                                                ((p) bVar).f20652x = (byte) 9;
                                            }
                                        }
                                        f15 = f12;
                                        i10++;
                                        f13 = f10;
                                        f14 = f11;
                                        split = strArr;
                                        c = 0;
                                    }
                                }
                                strArr = split;
                                i10++;
                                f13 = f10;
                                f14 = f11;
                                split = strArr;
                                c = 0;
                            }
                        }
                        f17 += valueInPt;
                        strArr = split;
                        i10++;
                        f13 = f10;
                        f14 = f11;
                        split = strArr;
                        c = 0;
                    }
                    f16 += valueInPt2;
                    strArr = split;
                    i10++;
                    f13 = f10;
                    f14 = f11;
                    split = strArr;
                    c = 0;
                }
                strArr = split;
                f12 = f15;
                f15 = f12;
                i10++;
                f13 = f10;
                f14 = f11;
                split = strArr;
                c = 0;
            }
            Rectangle rectangle = new Rectangle();
            rectangle.f20688x = (int) (f16 * 1.3333334f);
            rectangle.f20689y = (int) (f17 * 1.3333334f);
            rectangle.width = (int) (f18 * 1.3333334f);
            rectangle.height = (int) (f15 * 1.3333334f);
            if (bVar.getType() != 7 && ((p) bVar).D == null) {
                processGrpSpRect(fVar, rectangle);
            }
            if (bVar instanceof p) {
                p pVar3 = (p) bVar;
                if (pVar3.f20615m == 233 && (attributeValue2 = element.attributeValue("coordsize")) != null && attributeValue2.length() > 0) {
                    String[] split3 = attributeValue2.split(",");
                    Matrix matrix = new Matrix();
                    matrix.postScale(rectangle.width / NumberFormatUtil.toInt(split3[0]), rectangle.height / NumberFormatUtil.toInt(split3[1]));
                    Iterator it = pVar3.f20612r.iterator();
                    while (it.hasNext()) {
                        ((tg.b) it.next()).a().transform(matrix);
                    }
                }
            }
            bVar.f20604e = rectangle;
            return rectangle;
        }
        return null;
    }

    private eh.b processBackgroundAndFill(Element element) {
        boolean z10;
        byte b10;
        String attributeValue;
        String attributeValue2;
        PackagePart part;
        int i10;
        int i11;
        PackagePart packagePart;
        String attributeValue3;
        if (element.attribute("filled") != null && (attributeValue3 = element.attributeValue("filled")) != null && attributeValue3.length() > 0 && (attributeValue3.equals("f") || attributeValue3.equals("false"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        eh.b bVar = null;
        if (z10) {
            Element element2 = element.element("fill");
            int i12 = -1;
            if (element2 != null && element2.attribute(FacebookMediationAdapter.KEY_ID) != null && (attributeValue2 = element2.attributeValue(FacebookMediationAdapter.KEY_ID)) != null && attributeValue2.length() > 0) {
                if (this.isProcessHF && (packagePart = this.hfPart) != null) {
                    part = this.zipPackage.getPart(packagePart.getRelationship(attributeValue2).getTargetURI());
                } else {
                    part = this.zipPackage.getPart(this.packagePart.getRelationship(attributeValue2).getTargetURI());
                }
                if (part != null) {
                    bVar = new eh.b();
                    byte fillType = getFillType(element2.attributeValue("type"));
                    try {
                        if (fillType == 2) {
                            bVar.c = (byte) 2;
                            bVar.c(new eh.g(this.control.o().g().j(this.control.o().g().d(part)), 0, 1.0f, 1.0f));
                        } else if (fillType == 1) {
                            String attributeValue4 = element.attributeValue("fillcolor");
                            if (attributeValue4 != null && attributeValue4.length() > 0) {
                                i10 = getColor(attributeValue4, false);
                            } else {
                                i10 = -1;
                            }
                            String attributeValue5 = element2.attributeValue("color2");
                            if (attributeValue5 != null) {
                                i11 = getColor(attributeValue5, true);
                            } else {
                                i11 = -1;
                            }
                            bVar.c = (byte) 1;
                            bVar.c(new eh.e(this.control.o().g().j(this.control.o().g().d(part)), i11, i10));
                        } else {
                            bVar.c = (byte) 3;
                            bVar.f16572e = this.control.o().g().d(part);
                        }
                    } catch (Exception e10) {
                        this.control.o().c().a(false, e10);
                    }
                }
            }
            if (bVar == null) {
                bVar = new eh.b();
                if (element2 != null) {
                    b10 = getFillType(element2.attributeValue("type"));
                } else {
                    b10 = 0;
                }
                if (element2 != null && b10 != 0) {
                    eh.c readGradient = readGradient(element, element2, b10);
                    bVar.c = b10;
                    bVar.c(readGradient);
                } else {
                    bVar.c = (byte) 0;
                    String attributeValue6 = element.attributeValue("fillcolor");
                    if (attributeValue6 != null && attributeValue6.length() > 0) {
                        i12 = getColor(attributeValue6, true);
                    }
                    if (element2 != null && (attributeValue = element2.attributeValue("opacity")) != null) {
                        float parseFloat = Float.parseFloat(attributeValue);
                        if (parseFloat > 1.0f) {
                            parseFloat /= 65536.0f;
                        }
                        i12 = (((byte) (parseFloat * 255.0f)) << 24) | (16777215 & i12);
                    }
                    bVar.f16571d = i12;
                }
            }
        }
        return bVar;
    }

    private void processBorder(Element element, gh.a aVar) {
        String attributeValue = element.attributeValue("color");
        if (attributeValue != null && !"auto".equals(attributeValue)) {
            try {
                Color.parseColor("#".concat(attributeValue));
                aVar.getClass();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            aVar.getClass();
        }
        String attributeValue2 = element.attributeValue("space");
        if (attributeValue2 == null) {
            aVar.getClass();
            return;
        }
        NumberFormatUtil.toInt(attributeValue2);
        aVar.getClass();
    }

    private void processBulletNumber() {
        PackagePart part;
        Element element;
        String attributeValue;
        Integer num;
        PackageRelationship relationship = this.packagePart.getRelationshipsByType(PackageRelationshipTypes.BULLET_NUMBER_PART).getRelationship(0);
        if (relationship != null && (part = this.zipPackage.getPart(relationship.getTargetURI())) != null) {
            SAXReader sAXReader = new SAXReader();
            InputStream inputStream = part.getInputStream();
            Element rootElement = sAXReader.read(inputStream).getRootElement();
            for (Element element2 : rootElement.elements("num")) {
                Element element3 = element2.element("abstractNumId");
                if (element3 != null) {
                    this.bulletNumbersID.put(element2.attributeValue("numId"), element3.attributeValue("val"));
                }
            }
            for (Element element4 : rootElement.elements("abstractNum")) {
                hh.a aVar = new hh.a();
                String attributeValue2 = element4.attributeValue("abstractNumId");
                if (attributeValue2 != null) {
                    aVar.f18332a = NumberFormatUtil.toInt(attributeValue2);
                }
                List elements = element4.elements("lvl");
                int size = elements.size();
                hh.b[] bVarArr = new hh.b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    hh.b bVar = new hh.b();
                    bVarArr[i10] = bVar;
                    processListLevel(bVar, (Element) elements.get(i10));
                }
                aVar.c = bVarArr;
                if (size == 0 && (element = element4.element("numStyleLink")) != null && (attributeValue = element.attributeValue("val")) != null && (num = this.styleStrID.get(attributeValue)) != null) {
                    aVar.f18333b = num.shortValue();
                    m a10 = n.f32394b.a(num.intValue());
                    zh.b bVar2 = zh.b.f32374b;
                    c cVar = a10.c;
                    bVar2.getClass();
                    int s4 = zh.b.s(cVar);
                    if (s4 >= 0) {
                        a10.c.e(NumberFormatUtil.toInt(this.bulletNumbersID.get(String.valueOf(s4))), SeriesTextRecord.sid);
                    }
                }
                a2.a e10 = this.control.o().e();
                Integer valueOf = Integer.valueOf(aVar.f18332a);
                if (!((AtomicBoolean) e10.c).get()) {
                    ((LinkedHashMap) e10.f26b).put(valueOf, aVar);
                }
                ((LinkedHashMap) e10.f26b).size();
            }
            inputStream.close();
        }
    }

    private int processCell(Element element, fj.c cVar, int i10, boolean z10, String str) {
        int i11;
        fj.a aVar = new fj.a();
        aVar.f32371a = this.offset;
        zh.b bVar = zh.b.f32374b;
        zh.f fVar = cVar.c;
        bVar.getClass();
        int b10 = ((c) fVar).b((short) 12296, true);
        int i12 = 0;
        if (b10 == Integer.MIN_VALUE) {
            i11 = 0;
        } else {
            i11 = b10;
        }
        Element element2 = element.element("tcPr");
        if (element2 != null) {
            i12 = processCellAttribute(element2, aVar.c, cVar.f17300f, i10, i11);
        }
        processParagraphs_Table(aVar, element.elements(), 1);
        aVar.f32372b = this.offset;
        zh.e eVar = cVar.f17299e;
        eVar.a(aVar);
        if (z10 && this.tableStyle.containsKey(str)) {
            ((c) aVar.c).e(this.tableStyle.get(str).intValue(), (short) 8202);
        }
        if (i12 > 0) {
            for (int i13 = 1; i13 < i12; i13++) {
                eVar.a(new fj.a());
            }
        }
        return i12;
    }

    private int processCellAttribute(Element element, zh.f fVar, d dVar, int i10, int i11) {
        int i12;
        Element element2 = element.element("gridSpan");
        if (element2 != null) {
            i12 = NumberFormatUtil.toInt(element2.attributeValue("val"));
        } else {
            i12 = 1;
        }
        Element element3 = element.element("shd");
        if (element3 != null) {
            String attributeValue = element3.attributeValue("fill");
            if (!TextUtils.isEmpty(attributeValue)) {
                try {
                    zh.b bVar = zh.b.f32374b;
                    int parseColor = Color.parseColor("#" + attributeValue);
                    bVar.getClass();
                    ((c) fVar).e(parseColor, (short) 8202);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    zh.b bVar2 = zh.b.f32374b;
                    int parseColor2 = Color.parseColor("#ffffff");
                    bVar2.getClass();
                    ((c) fVar).e(parseColor2, (short) 8202);
                }
            }
        }
        setBorderAttribute(fVar, element);
        setCellMar(fVar, element, i11);
        Element element4 = element.element("tcW");
        int i13 = 0;
        if (element4 != null) {
            int i14 = NumberFormatUtil.toInt(element4.attributeValue(OperatorName.SET_LINE_WIDTH));
            for (int i15 = i10; i15 < i10 + i12; i15++) {
                i13 += ((Integer) dVar.f17302g.get(Integer.valueOf(i15))).intValue();
            }
            if (i13 > 0) {
                i14 = i13;
            }
            zh.b.f32374b.getClass();
            ((c) fVar).e(i14, (short) 12297);
        } else {
            for (int i16 = i10; i16 < i10 + i12; i16++) {
                i13 += ((Integer) dVar.f17302g.get(Integer.valueOf(i16))).intValue();
            }
            zh.b.f32374b.getClass();
            ((c) fVar).e(i13, (short) 12297);
        }
        Element element5 = element.element("vMerge");
        if (element5 != null) {
            zh.b.f32374b.getClass();
            c cVar = (c) fVar;
            cVar.e(1, (short) 12303);
            if ("restart".equals(element5.attributeValue("val"))) {
                cVar.e(1, (short) 12302);
            }
        }
        Element element6 = element.element("vAlign");
        if (element6 != null) {
            String attributeValue2 = element6.attributeValue("val");
            if ("center".equals(attributeValue2)) {
                zh.b.f32374b.getClass();
                ((c) fVar).e(1, (short) 12304);
            } else if ("bottom".equals(attributeValue2)) {
                zh.b.f32374b.getClass();
                ((c) fVar).e(2, (short) 12304);
            }
        }
        return i12;
    }

    private void processEmbeddedTable(fj.a aVar, Element element) {
        aVar.f17297e.a(processTable2(element, true));
    }

    private Rectangle processGrpSpRect(lh.f fVar, Rectangle rectangle) {
        if (fVar != null) {
            rectangle.f20688x += fVar.f20618m;
            rectangle.f20689y += fVar.f20619n;
        }
        return rectangle;
    }

    private void processHeaderAndFooter(PackageRelationship packageRelationship, boolean z10) {
        long j10;
        short s4;
        if (packageRelationship != null) {
            PackagePart part = this.zipPackage.getPart(packageRelationship.getTargetURI());
            this.hfPart = part;
            if (part != null) {
                this.isProcessHF = true;
                if (z10) {
                    j10 = 1152921504606846976L;
                } else {
                    j10 = 2305843009213693952L;
                }
                this.offset = j10;
                SAXReader sAXReader = new SAXReader();
                InputStream inputStream = this.hfPart.getInputStream();
                List<Element> elements = sAXReader.read(inputStream).getRootElement().elements();
                if (z10) {
                    s4 = 5;
                } else {
                    s4 = 6;
                }
                fj.b bVar = new fj.b(s4);
                bVar.f32371a = this.offset;
                processParagraphs(elements);
                long j11 = this.offset;
                bVar.f32372b = j11;
                this.wpdoc.l(bVar, j11);
                inputStream.close();
                this.isProcessHF = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private zh.i processHyperlinkRun(lib.zj.office.fc.dom4j.Element r14, zh.j r15) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.doc.DOCXReader.processHyperlinkRun(lib.zj.office.fc.dom4j.Element, zh.j):zh.i");
    }

    private gh.b processLine(Element element) {
        int i10;
        int i11;
        String attributeValue = element.attributeValue("stroked");
        if ("f".equalsIgnoreCase(attributeValue) || "false".equalsIgnoreCase(attributeValue)) {
            return null;
        }
        String attributeValue2 = element.attributeValue("type");
        List<Element> elements = element.getParent().elements("shapetype");
        if (attributeValue2 != null && elements != null) {
            for (Element element2 : elements) {
                if (attributeValue2.equals("#" + element2.attributeValue(FacebookMediationAdapter.KEY_ID))) {
                    break;
                }
            }
        }
        element2 = null;
        if (element2 != null) {
            String attributeValue3 = element2.attributeValue("stroked");
            if ("f".equalsIgnoreCase(attributeValue3) || "false".equalsIgnoreCase(attributeValue3)) {
                return null;
            }
        }
        String attributeValue4 = element.attributeValue("strokecolor");
        boolean z10 = false;
        if (attributeValue4 != null && attributeValue4.length() > 0) {
            i10 = getColor(attributeValue4, false);
        } else {
            i10 = -16777216;
        }
        eh.b bVar = new eh.b();
        bVar.f16571d = i10;
        String attributeValue5 = element.attributeValue("strokeweight");
        if (element.attributeValue("strokeweight") != null) {
            if (attributeValue5.indexOf("pt") >= 0) {
                attributeValue5 = attributeValue5.replace("pt", "");
            } else if (attributeValue5.indexOf("mm") >= 0) {
                attributeValue5 = attributeValue5.replace("mm", "");
            } else if (attributeValue5.indexOf(OperatorName.CONCAT) >= 0) {
                attributeValue5 = attributeValue5.replace(OperatorName.CONCAT, "");
            }
            i11 = Math.round(Float.parseFloat(attributeValue5) * 1.3333334f);
        } else {
            i11 = 1;
        }
        if (element.element("stroke") != null && element.element("stroke").attributeValue("dashstyle") != null) {
            z10 = true;
        }
        gh.b bVar2 = new gh.b();
        bVar2.f17807b = bVar;
        bVar2.f17806a = i11;
        bVar2.c = z10;
        return bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
        if (r6 >= 61440) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void processListLevel(hh.b r10, lib.zj.office.fc.dom4j.Element r11) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.doc.DOCXReader.processListLevel(hh.b, lib.zj.office.fc.dom4j.Element):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x032a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void processParaAttribute(lib.zj.office.fc.dom4j.Element r17, zh.f r18, int r19) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.doc.DOCXReader.processParaAttribute(lib.zj.office.fc.dom4j.Element, zh.f, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processParagraph(Element element, int i10, int i11) {
        e eVar;
        j jVar = new j();
        long j10 = this.offset;
        jVar.f32371a = j10;
        processRun(element, jVar, true, i11);
        processParaAttribute(element.element("pPr"), jVar.c, i10);
        long j11 = this.offset;
        jVar.f32372b = j11;
        if (j11 > j10 && (eVar = this.wpdoc) != null) {
            eVar.j(jVar, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processParagraphs(List<Element> list) {
        Iterator<Element> it = list.iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if ("sdt".equals(next.getName()) && (next = next.element("sdtContent")) != null) {
                processParagraphs(next.elements());
            }
            if ("p".equals(next.getName())) {
                processParagraph(next, 0, 0);
            } else if ("tbl".equals(next.getName())) {
                processTable(next);
            }
        }
    }

    private void processParagraphs_Table(fj.a aVar, List<Element> list, int i10) {
        Iterator<Element> it = list.iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if ("sdt".equals(next.getName()) && (next = next.element("sdtContent")) != null) {
                processParagraphs_Table(aVar, next.elements(), i10);
            }
            if ("p".equals(next.getName())) {
                processParagraph(next, i10, 1);
            } else if ("tbl".equals(next.getName())) {
                processEmbeddedTable(aVar, next);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void processPicture(Element element, j jVar) {
        String attributeValue;
        PackagePart part;
        s sVar;
        PackagePart packagePart;
        if (element != null) {
            Element element2 = element.element("imagedata");
            if (element2 == null && (element2 = element.element("rect")) != null) {
                element2 = element2.element("fill");
                element = element2;
            }
            if (element2 != null && (attributeValue = element2.attributeValue(FacebookMediationAdapter.KEY_ID)) != null) {
                if (this.isProcessHF && (packagePart = this.hfPart) != null) {
                    part = this.zipPackage.getPart(packagePart.getRelationship(attributeValue).getTargetURI());
                } else {
                    part = this.zipPackage.getPart(this.packagePart.getRelationship(attributeValue).getTargetURI());
                }
                String attributeValue2 = element.attributeValue("style");
                if (part != null && attributeValue2 != null) {
                    String attributeValue3 = element.attributeValue(FacebookMediationAdapter.KEY_ID);
                    if (attributeValue3 != null && attributeValue3.indexOf("PictureWatermark") > 0) {
                        this.isProcessWatermark = true;
                    }
                    try {
                        int d10 = this.control.o().g().d(part);
                        short shapeWrapType = getShapeWrapType(element);
                        if (this.isProcessWatermark) {
                            t tVar = new t();
                            String attributeValue4 = element2.attributeValue("blacklevel");
                            if (attributeValue4 != null) {
                                tVar.K = Float.parseFloat(attributeValue4) / 100000.0f;
                            }
                            String attributeValue5 = element2.attributeValue("gain");
                            if (attributeValue5 != null) {
                                Float.parseFloat(attributeValue5);
                            }
                            tVar.E = (byte) 1;
                            tVar.J = d10;
                            tVar.A = shapeWrapType;
                            sVar = tVar;
                        } else {
                            kh.b B = b.b.B(element2);
                            i iVar = new i();
                            iVar.f20623m = d10;
                            iVar.f20625o = B;
                            s sVar2 = new s();
                            sVar2.v(iVar);
                            sVar2.A = shapeWrapType;
                            sVar = sVar2;
                        }
                        s sVar3 = sVar;
                        Rectangle processAutoShapeStyle = processAutoShapeStyle(element, sVar3, null, 1000.0f, 1000.0f);
                        if (!this.isProcessWatermark) {
                            i iVar2 = sVar3.E;
                            iVar2.f20604e = processAutoShapeStyle;
                            iVar2.f20603d = processBackgroundAndFill(element);
                            iVar2.f20610k = processLine(element);
                        }
                        addShape(sVar3, jVar);
                        this.isProcessWatermark = false;
                    } catch (Exception e10) {
                        this.control.o().c().a(false, e10);
                    }
                }
            }
        }
    }

    private void processPictureAndDiagram(Element element, j jVar) {
        boolean z10;
        Element element2;
        Element element3;
        Element element4;
        String attributeValue;
        String attributeValue2;
        String attributeValue3;
        String attributeValue4;
        String attributeValue5;
        String attributeValue6;
        String attributeValue7;
        PackagePart packagePart;
        Element element5;
        Element element6 = element.element("inline");
        if (element6 == null) {
            element2 = element.element("anchor");
            z10 = false;
        } else {
            z10 = true;
            element2 = element6;
        }
        if (element2 != null) {
            Element element7 = element2.element("graphic");
            Element element8 = element2.element("docPr");
            if (element7 != null && (element3 = element7.element("graphicData")) != null) {
                Element element9 = element3.element("pic");
                if (element9 != null) {
                    Element element10 = element9.element("spPr");
                    if (element10 != null) {
                        if (element10.element("blipFill") != null && (element5 = element10.element("blipFill").element("blip")) != null && element5.attributeValue("embed") != null) {
                            if (!this.isProcessHF || (packagePart = this.hfPart) == null) {
                                packagePart = this.packagePart;
                            }
                        } else {
                            packagePart = null;
                        }
                        Element element11 = element10.element("xfrm");
                        i addPicture = addPicture(element9, ReaderKit.instance().getShapeAnchor(element11, 1.0f, 1.0f), element11);
                        if (addPicture != null) {
                            f fVar = this.control;
                            ZipPackage zipPackage = this.zipPackage;
                            Map<String, Integer> map = this.themeColor;
                            addPicture.f20603d = t0.j0(fVar, zipPackage, packagePart, element10, map);
                            addPicture.f20610k = com.google.android.play.core.assetpacks.c.r(fVar, zipPackage, packagePart, element10.element("ln"), map);
                            s sVar = new s();
                            sVar.v(addPicture);
                            sVar.f20604e = addPicture.f20604e;
                            if (!z10) {
                                processWrapAndPosition_Drawing(sVar, element2, addPicture.f20604e);
                            } else {
                                sVar.A = (short) 2;
                            }
                            pasePicLink(element8, addShape(sVar, jVar));
                        }
                    }
                } else if (element3.element("chart") != null) {
                    Element element12 = element3.element("chart");
                    if (element12 != null && element12.attribute(FacebookMediationAdapter.KEY_ID) != null) {
                        PackageRelationship relationship = this.packagePart.getRelationship(element12.attributeValue(FacebookMediationAdapter.KEY_ID));
                        if (relationship != null) {
                            try {
                                ui.a read = ChartReader.instance().read(this.control, this.zipPackage, this.zipPackage.getPart(relationship.getTargetURI()), this.themeColor, (byte) 0);
                                if (read != null) {
                                    Rectangle rectangle = new Rectangle();
                                    Element element13 = element2.element("simplePos");
                                    if (element13 != null) {
                                        if (element13.attributeValue("x") != null) {
                                            rectangle.f20688x = (int) ((NumberFormatUtil.toInt(attributeValue6) * 96.0f) / 914400.0f);
                                        }
                                        if (element13.attributeValue(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT) != null) {
                                            rectangle.f20689y = (int) ((NumberFormatUtil.toInt(attributeValue7) * 96.0f) / 914400.0f);
                                        }
                                    }
                                    Element element14 = element2.element("extent");
                                    if (element14 != null) {
                                        if (element14.attributeValue("cx") != null) {
                                            rectangle.width = (int) ((NumberFormatUtil.toInt(attributeValue4) * 96.0f) / 914400.0f);
                                        }
                                        if (element14.attributeValue("cy") != null) {
                                            rectangle.height = (int) ((NumberFormatUtil.toInt(attributeValue5) * 96.0f) / 914400.0f);
                                        }
                                    }
                                    q qVar = new q();
                                    qVar.E = read;
                                    qVar.f20604e = rectangle;
                                    if (!z10) {
                                        processWrapAndPosition_Drawing(qVar, element2, rectangle);
                                    } else {
                                        qVar.A = (short) 2;
                                    }
                                    addShape(qVar, jVar);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                } else if (element3.element("relIds") != null && (element4 = element3.element("relIds")) != null && (attributeValue = element4.attributeValue("dm")) != null) {
                    try {
                        PackageRelationship relationshipByID = this.packagePart.getRelationshipsByType(PackageRelationshipTypes.DIAGRAM_DATA).getRelationshipByID(attributeValue);
                        if (relationshipByID != null) {
                            Rectangle rectangle2 = new Rectangle();
                            Element element15 = element2.element("extent");
                            if (element15 != null) {
                                if (element15.attribute("cx") != null && (attributeValue3 = element15.attributeValue("cx")) != null && attributeValue3.length() > 0) {
                                    rectangle2.width = (int) ((NumberFormatUtil.toInt(attributeValue3) * 96.0f) / 914400.0f);
                                }
                                if (element15.attribute("cy") != null && (attributeValue2 = element15.attributeValue("cy")) != null && attributeValue2.length() > 0) {
                                    rectangle2.height = (int) ((NumberFormatUtil.toInt(attributeValue2) * 96.0f) / 914400.0f);
                                }
                            }
                            processSmart(this.control, this.zipPackage, this.zipPackage.getPart(relationshipByID.getTargetURI()), jVar, element2, rectangle2, z10);
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }

    private PointF[] processPoints(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            String[] split = str.split(",");
            int length = split.length;
            for (int i10 = 0; i10 < length - 1; i10 += 2) {
                arrayList.add(new PointF(getValue(split[i10]), getValue(split[i10 + 1])));
            }
        }
        return (PointF[]) arrayList.toArray(new PointF[arrayList.size()]);
    }

    private float processPolygonZoom(Element element, lh.b bVar, lh.f fVar, float f10, float f11) {
        String attributeValue;
        String attributeValue2;
        String str;
        float parseFloat;
        float parseFloat2;
        float parseFloat3;
        float parseFloat4;
        float parseFloat5;
        if (element != null && bVar != null && element.attribute("style") != null && element.attribute("style") != null && (attributeValue = element.attributeValue("style")) != null) {
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            float f15 = 0.0f;
            for (String str2 : attributeValue.split(";")) {
                String[] split = str2.split(":");
                if (split != null && (str = split[0]) != null && split[1] != null) {
                    if ("left".equalsIgnoreCase(str)) {
                        int indexOf = split[1].indexOf("pt");
                        if (indexOf > 0) {
                            parseFloat4 = Float.parseFloat(split[1].substring(0, indexOf));
                        } else {
                            int indexOf2 = split[1].indexOf("in");
                            if (indexOf2 > 0) {
                                parseFloat5 = Float.parseFloat(split[1].substring(0, indexOf2));
                                parseFloat4 = parseFloat5 * 72.0f;
                            } else {
                                parseFloat4 = ((Float.parseFloat(split[1]) * f10) * 72.0f) / 914400.0f;
                            }
                        }
                        f12 = parseFloat4 + f12;
                    } else if ("top".equalsIgnoreCase(split[0])) {
                        int indexOf3 = split[1].indexOf("pt");
                        if (indexOf3 > 0) {
                            parseFloat3 = Float.parseFloat(split[1].substring(0, indexOf3));
                            f13 = parseFloat3 + f13;
                        } else {
                            int indexOf4 = split[1].indexOf("in");
                            if (indexOf4 > 0) {
                                parseFloat2 = Float.parseFloat(split[1].substring(0, indexOf4));
                                parseFloat3 = parseFloat2 * 72.0f;
                                f13 = parseFloat3 + f13;
                            } else {
                                parseFloat = Float.parseFloat(split[1]) * f11;
                                parseFloat3 = (parseFloat * 72.0f) / 914400.0f;
                                f13 = parseFloat3 + f13;
                            }
                        }
                    } else if ("margin-left".equalsIgnoreCase(split[0])) {
                        int indexOf5 = split[1].indexOf("pt");
                        if (indexOf5 > 0) {
                            parseFloat4 = Float.parseFloat(split[1].substring(0, indexOf5));
                        } else {
                            int indexOf6 = split[1].indexOf("in");
                            if (indexOf6 > 0) {
                                parseFloat5 = Float.parseFloat(split[1].substring(0, indexOf6));
                                parseFloat4 = parseFloat5 * 72.0f;
                            } else {
                                parseFloat4 = (Float.parseFloat(split[1]) * 72.0f) / 914400.0f;
                            }
                        }
                        f12 = parseFloat4 + f12;
                    } else if ("margin-top".equalsIgnoreCase(split[0])) {
                        int indexOf7 = split[1].indexOf("pt");
                        if (indexOf7 > 0) {
                            parseFloat3 = Float.parseFloat(split[1].substring(0, indexOf7));
                            f13 = parseFloat3 + f13;
                        } else {
                            int indexOf8 = split[1].indexOf("in");
                            if (indexOf8 > 0) {
                                parseFloat2 = Float.parseFloat(split[1].substring(0, indexOf8));
                                parseFloat3 = parseFloat2 * 72.0f;
                                f13 = parseFloat3 + f13;
                            } else {
                                parseFloat = Float.parseFloat(split[1]);
                                parseFloat3 = (parseFloat * 72.0f) / 914400.0f;
                                f13 = parseFloat3 + f13;
                            }
                        }
                    } else if (InMobiNetworkValues.WIDTH.equalsIgnoreCase(split[0])) {
                        int indexOf9 = split[1].indexOf("pt");
                        if (indexOf9 > 0) {
                            f14 = Float.parseFloat(split[1].substring(0, indexOf9));
                        } else {
                            int indexOf10 = split[1].indexOf("in");
                            if (indexOf10 > 0) {
                                f14 = Float.parseFloat(split[1].substring(0, indexOf10)) * 72.0f;
                            } else {
                                f14 = ((Float.parseFloat(split[1]) * f10) * 72.0f) / 914400.0f;
                            }
                        }
                    } else if (InMobiNetworkValues.HEIGHT.equalsIgnoreCase(split[0])) {
                        int indexOf11 = split[1].indexOf("pt");
                        if (indexOf11 > 0) {
                            f15 = Float.parseFloat(split[1].substring(0, indexOf11));
                        } else {
                            int indexOf12 = split[1].indexOf("in");
                            if (indexOf12 > 0) {
                                f15 = Float.parseFloat(split[1].substring(0, indexOf12)) * 72.0f;
                            } else {
                                f15 = ((Float.parseFloat(split[1]) * f11) * 72.0f) / 914400.0f;
                            }
                        }
                    }
                }
            }
            Rectangle rectangle = new Rectangle();
            rectangle.f20688x = (int) (f12 * 1.3333334f);
            rectangle.f20689y = (int) (f13 * 1.3333334f);
            rectangle.width = (int) (f14 * 1.3333334f);
            rectangle.height = (int) (f15 * 1.3333334f);
            if (bVar.getType() != 7 && ((p) bVar).D == null) {
                processGrpSpRect(fVar, rectangle);
            }
            if ((bVar instanceof p) && ((p) bVar).f20615m == 233 && (attributeValue2 = element.attributeValue("coordsize")) != null && attributeValue2.length() > 0) {
                String[] split2 = attributeValue2.split(",");
                return Math.min(NumberFormatUtil.toInt(split2[0]) / rectangle.width, NumberFormatUtil.toInt(split2[1]) / rectangle.height);
            }
            return 1.0f;
        }
        return 1.0f;
    }

    private void processRelativeShapeSize() {
        zh.b bVar = zh.b.f32374b;
        zh.f fVar = this.secElem.c;
        bVar.getClass();
        int p10 = zh.b.p(fVar);
        int k10 = zh.b.k(this.secElem.c);
        for (g gVar : this.relativeType) {
            int[] iArr = this.relativeValue.get(gVar);
            Rectangle bounds = gVar.getBounds();
            int i10 = iArr[0];
            if (i10 > 0) {
                bounds.width = (int) (((p10 * 0.06666667f) * i10) / 1000.0f);
            }
            int i11 = iArr[2];
            if (i11 > 0) {
                bounds.height = (int) (((k10 * 0.06666667f) * i11) / 1000.0f);
            }
        }
    }

    private void processRow(Element element, d dVar, boolean z10, String str) {
        fj.c cVar = new fj.c();
        cVar.f32371a = this.offset;
        cVar.f17300f = dVar;
        Element element2 = element.element("trPr");
        if (element2 != null) {
            processRowAttribute(element2, cVar.c);
        }
        int i10 = 0;
        for (Element element3 : element.elements("tc")) {
            i10 += processCell(element3, cVar, i10, z10, str);
        }
        cVar.f32372b = this.offset;
        dVar.f17301f.a(cVar);
    }

    private void processRowAttribute(Element element, zh.f fVar) {
        Element element2 = element.element("trHeight");
        if (element2 != null) {
            zh.b bVar = zh.b.f32374b;
            int i10 = NumberFormatUtil.toInt(element2.attributeValue("val"));
            bVar.getClass();
            ((c) fVar).e(i10, (short) 12296);
        }
    }

    private boolean processRun(Element element, j jVar, boolean z10, int i10) {
        return processRun(element, jVar, (byte) -1, z10, i10);
    }

    private void processRunAttribute(Element element, zh.f fVar) {
        String str;
        int i10;
        String attributeValue;
        boolean z10;
        String attributeValue2;
        boolean z11;
        int a10;
        Element element2 = element.element("szCs");
        Element element3 = element.element("sz");
        if (element2 != null || element3 != null) {
            if (element2 != null) {
                str = element2.attributeValue("val");
            } else {
                str = null;
            }
            if (element3 != null) {
                str = element3.attributeValue("val");
            }
            if (!TextUtils.isEmpty(str)) {
                i10 = (int) Math.ceil(Float.parseFloat(str) / 2.0f);
            } else {
                i10 = 12;
            }
            zh.b.f32374b.getClass();
            zh.b.z(fVar, i10);
        }
        Element element4 = element.element("rFonts");
        int i11 = 2;
        if (element4 != null) {
            String attributeValue3 = element4.attributeValue("hAnsi");
            if (attributeValue3 == null) {
                attributeValue3 = element4.attributeValue("eastAsia");
            }
            if (attributeValue3 != null && (a10 = w1.f.b().a(attributeValue3)) >= 0) {
                zh.b.f32374b.getClass();
                ((c) fVar).e(a10, (short) 2);
            }
        }
        Element element5 = element.element("color");
        if (element5 != null) {
            String attributeValue4 = element5.attributeValue("val");
            if (!"auto".equals(attributeValue4) && !"FFFFFF".equals(attributeValue4)) {
                try {
                    zh.b bVar = zh.b.f32374b;
                    int parseColor = Color.parseColor("#" + attributeValue4);
                    bVar.getClass();
                    zh.b.w(fVar, parseColor);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } else {
                zh.b bVar2 = zh.b.f32374b;
                int parseColor2 = Color.parseColor("#B8B4B4");
                bVar2.getClass();
                zh.b.w(fVar, parseColor2);
            }
        }
        if (element.element("b") != null) {
            zh.b.f32374b.getClass();
            zh.b.v(fVar, true);
        }
        if (element.element("rtl") != null) {
            zh.b.f32374b.getClass();
            ((c) fVar).e(1, (short) 17);
        }
        Element element6 = element.element(OperatorName.SET_FLATNESS);
        int i12 = 0;
        if (element6 != null) {
            String attributeValue5 = element6.attributeValue("val");
            zh.b bVar3 = zh.b.f32374b;
            if (attributeValue5 != null && !"1".equals(attributeValue5)) {
                z11 = false;
            } else {
                z11 = true;
            }
            bVar3.getClass();
            zh.b.x(fVar, z11);
        }
        Element element7 = element.element("u");
        int i13 = -16777216;
        if (element7 != null && (attributeValue2 = element7.attributeValue("val")) != null && !"none".equalsIgnoreCase(attributeValue2)) {
            zh.b.f32374b.getClass();
            zh.b.B(fVar, 1);
            String attributeValue6 = element7.attributeValue("color");
            if (attributeValue6 != null && attributeValue6.equals("auto")) {
                zh.b.C(fVar, -16777216);
            } else if (attributeValue6 != null && attributeValue6.length() > 0) {
                try {
                    zh.b.C(fVar, Color.parseColor("#".concat(attributeValue6)));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        Element element8 = element.element("strike");
        if (element8 != null) {
            zh.b bVar4 = zh.b.f32374b;
            if (!"true".equalsIgnoreCase(element8.attributeValue("val")) && !"1".equals(element8.attributeValue("val"))) {
                z10 = false;
            } else {
                z10 = true;
            }
            bVar4.getClass();
            zh.b.A(fVar, z10);
        }
        Element element9 = element.element("dstrike");
        if (element9 != null) {
            zh.b bVar5 = zh.b.f32374b;
            int i14 = !PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES.equals(element9.attributeValue("val")) ? 1 : 0;
            bVar5.getClass();
            ((c) fVar).e(i14, (short) 7);
        }
        Element element10 = element.element("vertAlign");
        if (element10 != null) {
            String attributeValue7 = element10.attributeValue("val");
            zh.b bVar6 = zh.b.f32374b;
            if (attributeValue7.equals("superscript")) {
                i11 = 1;
            }
            bVar6.getClass();
            zh.b.y(fVar, i11);
        }
        Element element11 = element.element("rStyle");
        if (element11 != null && (attributeValue = element11.attributeValue("val")) != null && attributeValue.length() > 0) {
            Integer num = this.styleStrID.get(attributeValue);
            zh.b bVar7 = zh.b.f32374b;
            if (num != null) {
                i12 = num.intValue();
            }
            bVar7.getClass();
            ((c) fVar).e(i12, (short) 4096);
        }
        Element element12 = element.element("highlight");
        if (element12 != null) {
            zh.b bVar8 = zh.b.f32374b;
            String attributeValue8 = element12.attributeValue("val");
            if ("yellow".equals(attributeValue8)) {
                i13 = -256;
            } else if ("green".equals(attributeValue8)) {
                i13 = -16711936;
            } else if ("cyan".equals(attributeValue8)) {
                i13 = -16711681;
            } else if ("magenta".equals(attributeValue8)) {
                i13 = -65281;
            } else if ("blue".equals(attributeValue8)) {
                i13 = -16776961;
            } else if ("red".equals(attributeValue8)) {
                i13 = -65536;
            } else if ("darkBlue".equals(attributeValue8)) {
                i13 = -16777077;
            } else if ("darkCyan".equals(attributeValue8)) {
                i13 = -16741493;
            } else if ("darkGreen".equals(attributeValue8)) {
                i13 = -16751616;
            } else if ("darkMagenta".equals(attributeValue8)) {
                i13 = -8388480;
            } else if ("darkRed".equals(attributeValue8)) {
                i13 = -7667712;
            } else if ("darkYellow".equals(attributeValue8)) {
                i13 = -8355840;
            } else if ("darkGray".equals(attributeValue8)) {
                i13 = -12303292;
            } else if ("lightGray".equals(attributeValue8)) {
                i13 = -3355444;
            } else if (!"black".equals(attributeValue8)) {
                i13 = -1;
            }
            bVar8.getClass();
            ((c) fVar).e(i13, (short) 11);
        }
    }

    private void processSection(Element element) {
        processSectionAttribute(element.element("sectPr"), true);
    }

    private void processSectionAttribute(Element element, boolean z10) {
        String str;
        String attributeValue;
        h hVar;
        if (element == null) {
            return;
        }
        l lVar = new l();
        lVar.f32371a = this.lastSectionOffset;
        long j10 = this.offset;
        lVar.f32372b = j10;
        this.lastSectionOffset = j10;
        zh.b.f32374b.f32375a.add(lVar);
        if (z10) {
            initBodySection(lVar);
        }
        zh.f fVar = lVar.c;
        Element element2 = element.element("pgSz");
        if (element2 != null) {
            zh.b.K(fVar, NumberFormatUtil.toInt(element2.attributeValue(OperatorName.SET_LINE_WIDTH)));
            zh.b.E(fVar, NumberFormatUtil.toInt(element2.attributeValue("h")));
        }
        Element element3 = element.element("pgMar");
        this.sectionMarginElement = element3;
        if (element3 != null) {
            zh.b.G(fVar, NumberFormatUtil.toInt(element3.attributeValue("left")));
            zh.b.H(fVar, NumberFormatUtil.toInt(element3.attributeValue("right")));
            zh.b.I(fVar, NumberFormatUtil.toInt(element3.attributeValue("top")));
            zh.b.F(fVar, NumberFormatUtil.toInt(element3.attributeValue("bottom")));
            if (element3.attributeValue("header") != null) {
                ((c) fVar).e(NumberFormatUtil.toInt(element3.attributeValue("header")), (short) 8199);
            }
            if (element3.attributeValue("footer") != null) {
                ((c) fVar).e(NumberFormatUtil.toInt(element3.attributeValue("footer")), (short) 8200);
            }
        }
        Element element4 = element.element("pgBorders");
        if (element4 != null) {
            b1 b1Var = new b1();
            "page".equals(element4.attributeValue("offsetFrom"));
            Element element5 = element4.element("top");
            if (element5 != null) {
                processBorder(element5, new gh.a());
            }
            Element element6 = element4.element("left");
            if (element6 != null) {
                processBorder(element6, new gh.a());
            }
            Element element7 = element4.element("right");
            if (element7 != null) {
                processBorder(element7, new gh.a());
            }
            Element element8 = element4.element("bottom");
            if (element8 != null) {
                processBorder(element8, new gh.a());
            }
            lib.zj.office.system.r o10 = this.control.o();
            if (o10.f21073f == null) {
                o10.f21073f = new l.t(8);
            }
            List list = (List) o10.f21073f.f20374a;
            int size = list.size();
            list.add(b1Var);
            ((c) fVar).e(size, (short) 8203);
        }
        Element element9 = element.element("docGrid");
        if (element9 != null) {
            String attributeValue2 = element9.attributeValue("type");
            if (("lines".equals(attributeValue2) || "linesAndChars".equals(attributeValue2) || "snapToChars".equals(attributeValue2)) && (attributeValue = element9.attributeValue("linePitch")) != null && attributeValue.length() > 0) {
                ((c) fVar).e(NumberFormatUtil.toInt(attributeValue), (short) 8204);
                for (int i10 = 0; i10 < this.textboxIndex; i10++) {
                    zh.e eVar = this.wpdoc.f17303b[5];
                    if (eVar != null) {
                        hVar = eVar.d(i10);
                    } else {
                        hVar = null;
                    }
                    zh.f fVar2 = lVar.c;
                    zh.b bVar = zh.b.f32374b;
                    zh.f d10 = hVar.d();
                    bVar.getClass();
                    int b10 = ((c) fVar2).b((short) 8204, true);
                    if (b10 == Integer.MIN_VALUE) {
                        b10 = -1;
                    }
                    ((c) d10).e(b10, (short) 8204);
                }
            }
        }
        long j11 = this.offset;
        List elements = element.elements("headerReference");
        String str2 = "";
        if (elements != null && elements.size() > 0) {
            if (elements.size() == 1) {
                str = ((Element) elements.get(0)).attributeValue(FacebookMediationAdapter.KEY_ID);
            } else {
                Iterator it = elements.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    }
                    Element element10 = (Element) it.next();
                    if ("default".equals(element10.attributeValue("type"))) {
                        str = element10.attributeValue(FacebookMediationAdapter.KEY_ID);
                        break;
                    }
                }
            }
            if (str != null && str.length() > 0) {
                try {
                    PackageRelationship relationshipByID = this.packagePart.getRelationshipsByType(PackageRelationshipTypes.HEADER_PART).getRelationshipByID(str);
                    if (relationshipByID != null) {
                        processHeaderAndFooter(relationshipByID, true);
                    }
                } catch (Exception e10) {
                    this.control.o().c().a(true, e10);
                }
            }
        }
        List elements2 = element.elements("footerReference");
        if (elements2 != null && elements2.size() > 0) {
            if (elements2.size() == 1) {
                str2 = ((Element) elements2.get(0)).attributeValue(FacebookMediationAdapter.KEY_ID);
            } else {
                Iterator it2 = elements2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Element element11 = (Element) it2.next();
                    if ("default".equals(element11.attributeValue("type"))) {
                        str2 = element11.attributeValue(FacebookMediationAdapter.KEY_ID);
                        break;
                    }
                }
            }
            if (str2 != null && str2.length() > 0) {
                try {
                    PackageRelationship relationshipByID2 = this.packagePart.getRelationshipsByType(PackageRelationshipTypes.FOOTER_PART).getRelationshipByID(str2);
                    if (relationshipByID2 != null) {
                        processHeaderAndFooter(relationshipByID2, false);
                    }
                } catch (Exception e11) {
                    this.control.o().c().a(true, e11);
                }
            }
        }
        this.offset = j11;
    }

    private void processSmart(f fVar, ZipPackage zipPackage, PackagePart packagePart, j jVar, Element element, Rectangle rectangle, boolean z10) {
        InputStream inputStream;
        PackagePart packagePart2;
        Element rootElement;
        Element element2;
        short s4;
        Element element3;
        Element element4;
        String attributeValue;
        if (packagePart != null && (inputStream = packagePart.getInputStream()) != null) {
            SAXReader sAXReader = new SAXReader();
            Document read = sAXReader.read(inputStream);
            inputStream.close();
            Element rootElement2 = read.getRootElement();
            eh.b j02 = t0.j0(fVar, zipPackage, packagePart, rootElement2.element("bg"), this.themeColor);
            gh.b r4 = com.google.android.play.core.assetpacks.c.r(fVar, zipPackage, packagePart, rootElement2.element("whole").element("ln"), this.themeColor);
            Element element5 = rootElement2.element("extLst");
            if (element5 != null && (element3 = element5.element("ext")) != null && (element4 = element3.element("dataModelExt")) != null && (attributeValue = element4.attributeValue("relId")) != null) {
                packagePart2 = zipPackage.getPart(this.packagePart.getRelationship(attributeValue).getTargetURI());
            } else {
                packagePart2 = null;
            }
            PackagePart packagePart3 = packagePart2;
            if (packagePart3 == null) {
                return;
            }
            InputStream inputStream2 = packagePart3.getInputStream();
            Document read2 = sAXReader.read(inputStream2);
            inputStream2.close();
            if (read2 != null && (rootElement = read2.getRootElement()) != null && (element2 = rootElement.element("spTree")) != null) {
                r rVar = new r();
                p pVar = new p();
                pVar.D = rVar;
                if (!z10) {
                    processWrapAndPosition_Drawing(pVar, element, rectangle);
                    s4 = getDrawingWrapType(element);
                } else {
                    s4 = 2;
                }
                rVar.f20604e = rectangle;
                pVar.f20603d = j02;
                pVar.f20610k = r4;
                pVar.f20615m = 1;
                if (s4 != 2) {
                    rVar.f20655p = s4;
                    pVar.A = s4;
                } else {
                    rVar.f20655p = (short) 2;
                    pVar.A = (short) 2;
                }
                pVar.f20604e = rectangle;
                Iterator elementIterator = element2.elementIterator();
                while (elementIterator.hasNext()) {
                    processAutoShape2010(packagePart3, jVar, (Element) elementIterator.next(), rVar, 1.0f, 1.0f, 0, 0, false);
                }
                addShape(pVar, jVar);
            }
        }
    }

    private void processStyle() {
        PackagePart part;
        Element element;
        Element element2;
        Element element3;
        String attributeValue;
        Element element4;
        Element element5;
        PackageRelationship relationship = this.packagePart.getRelationshipsByType(PackageRelationshipTypes.STYLE_PART).getRelationship(0);
        if (relationship != null && (part = this.zipPackage.getPart(relationship.getTargetURI())) != null) {
            SAXReader sAXReader = new SAXReader();
            InputStream inputStream = part.getInputStream();
            Element rootElement = sAXReader.read(inputStream).getRootElement();
            List<Element> elements = rootElement.elements("style");
            Element element6 = rootElement.element("docDefaults");
            if (element6 != null) {
                m mVar = new m();
                this.styleStrID.put("docDefaults", Integer.valueOf(this.styleID));
                int i10 = this.styleID;
                mVar.f32392a = i10;
                this.styleID = i10 + 1;
                Element element7 = element6.element("pPrDefault");
                c cVar = mVar.c;
                if (element7 != null && (element5 = element7.element("pPr")) != null) {
                    processParaAttribute(element5, cVar, 0);
                }
                Element element8 = element6.element("rPrDefault");
                if (element8 != null && (element4 = element8.element("rPr")) != null) {
                    processRunAttribute(element4, cVar);
                }
                n.f32394b.f32395a.put(Integer.valueOf(mVar.f32392a), mVar);
            }
            for (Element element9 : elements) {
                if (this.abortReader) {
                    break;
                }
                if ("table".equals(element9.attributeValue("type")) && (element = element9.element("tblStylePr")) != null && "firstRow".equals(element.attributeValue("type")) && (element2 = element.element("tcPr")) != null && (element3 = element2.element("shd")) != null && (attributeValue = element3.attributeValue("fill")) != null) {
                    try {
                        Map<String, Integer> map = this.tableStyle;
                        String attributeValue2 = element9.attributeValue("styleId");
                        map.put(attributeValue2, Integer.valueOf(Color.parseColor("#" + attributeValue)));
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        this.tableStyle.put(element9.attributeValue("styleId"), Integer.valueOf(Color.parseColor("#ffffff")));
                    }
                }
                m mVar2 = new m();
                String attributeValue3 = element9.attributeValue("styleId");
                if (attributeValue3 != null) {
                    Integer num = this.styleStrID.get(attributeValue3);
                    if (num == null) {
                        this.styleStrID.put(attributeValue3, Integer.valueOf(this.styleID));
                        int i11 = this.styleID;
                        mVar2.f32392a = i11;
                        this.styleID = i11 + 1;
                    } else {
                        mVar2.f32392a = num.intValue();
                    }
                }
                element9.attributeValue("type").equals("paragraph");
                Element element10 = element9.element(NamingTable.TAG);
                if (element10 != null) {
                    element10.attributeValue("val");
                }
                Element element11 = element9.element("basedOn");
                if (element11 != null) {
                    String attributeValue4 = element11.attributeValue("val");
                    if (attributeValue4 != null) {
                        Integer num2 = this.styleStrID.get(attributeValue4);
                        if (num2 == null) {
                            this.styleStrID.put(attributeValue4, Integer.valueOf(this.styleID));
                            int i12 = this.styleID;
                            mVar2.f32393b = i12;
                            this.styleID = i12 + 1;
                        } else {
                            mVar2.f32393b = num2.intValue();
                        }
                    }
                } else if ("1".equals(element9.attributeValue("default"))) {
                    mVar2.f32393b = 0;
                }
                Element element12 = element9.element("pPr");
                c cVar2 = mVar2.c;
                if (element12 != null) {
                    processParaAttribute(element12, cVar2, 0);
                }
                Element element13 = element9.element("rPr");
                if (element13 != null) {
                    processRunAttribute(element13, cVar2);
                }
                n.f32394b.f32395a.put(Integer.valueOf(mVar2.f32392a), mVar2);
            }
            inputStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processTable(Element element) {
        processTable2(element, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r1 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private fj.d processTable2(lib.zj.office.fc.dom4j.Element r10, boolean r11) {
        /*
            r9 = this;
            fj.d r0 = new fj.d
            r0.<init>()
            long r1 = r9.offset
            r0.f32371a = r1
            java.lang.String r1 = "tblPr"
            lib.zj.office.fc.dom4j.Element r1 = r10.element(r1)
            if (r1 == 0) goto L29
            zh.f r2 = r0.c
            r9.processTableAttribute(r1, r2)
            java.lang.String r2 = "tblStyle"
            lib.zj.office.fc.dom4j.Element r1 = r1.element(r2)
            if (r1 == 0) goto L29
            java.lang.String r2 = "val"
            java.lang.String r1 = r1.attributeValue(r2)
            if (r1 != 0) goto L2b
        L29:
            java.lang.String r1 = ""
        L2b:
            java.lang.String r2 = "tblGrid"
            lib.zj.office.fc.dom4j.Element r2 = r10.element(r2)
            r3 = 0
            if (r2 == 0) goto L65
            java.lang.String r4 = "gridCol"
            java.util.List r2 = r2.elements(r4)
            if (r2 == 0) goto L65
            r4 = r3
        L3e:
            int r5 = r2.size()
            if (r4 >= r5) goto L65
            java.util.HashMap r5 = r0.f17302g
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Object r7 = r2.get(r4)
            lib.zj.office.fc.dom4j.Element r7 = (lib.zj.office.fc.dom4j.Element) r7
            java.lang.String r8 = "w"
            java.lang.String r7 = r7.attributeValue(r8)
            int r7 = lib.zj.office.fc.util.NumberFormatUtil.toInt(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.put(r6, r7)
            int r4 = r4 + 1
            goto L3e
        L65:
            java.lang.String r2 = "tr"
            java.util.List r10 = r10.elements(r2)
            java.util.Iterator r10 = r10.iterator()
            r2 = 1
        L71:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L82
            java.lang.Object r4 = r10.next()
            lib.zj.office.fc.dom4j.Element r4 = (lib.zj.office.fc.dom4j.Element) r4
            r9.processRow(r4, r0, r2, r1)
            r2 = r3
            goto L71
        L82:
            long r1 = r9.offset
            r0.f32372b = r1
            if (r11 != 0) goto L8d
            fj.e r10 = r9.wpdoc
            r10.j(r0, r1)
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.doc.DOCXReader.processTable2(lib.zj.office.fc.dom4j.Element, boolean):fj.d");
    }

    private void processTableAttribute(Element element, zh.f fVar) {
        String attributeValue;
        Element element2 = element.element("jc");
        if (element2 != null) {
            String attributeValue2 = element2.attributeValue("val");
            if ("center".equals(attributeValue2)) {
                zh.b.f32374b.getClass();
                zh.b.N(fVar, 1);
            } else if ("right".equals(attributeValue2)) {
                zh.b.f32374b.getClass();
                zh.b.N(fVar, 2);
            }
        }
        Element element3 = element.element("tblInd");
        if (element3 != null && (attributeValue = element3.attributeValue(OperatorName.SET_LINE_WIDTH)) != null) {
            zh.b bVar = zh.b.f32374b;
            int i10 = NumberFormatUtil.toInt(attributeValue);
            bVar.getClass();
            zh.b.O(fVar, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean processTextbox2007(lib.zj.office.fc.openxml4j.opc.PackagePart r29, lh.p r30, lib.zj.office.fc.dom4j.Element r31) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.doc.DOCXReader.processTextbox2007(lib.zj.office.fc.openxml4j.opc.PackagePart, lh.p, lib.zj.office.fc.dom4j.Element):boolean");
    }

    private boolean processTextbox2010(PackagePart packagePart, p pVar, Element element) {
        Element element2;
        Element element3 = element.element("txbx");
        boolean z10 = false;
        if (element3 == null || (element2 = element3.element("txbxContent")) == null) {
            return false;
        }
        long j10 = this.offset;
        long j11 = this.textboxIndex;
        this.offset = (j11 << 32) + 5764607523034234880L;
        pVar.B = (int) j11;
        l lVar = new l();
        long j12 = this.offset;
        lVar.f32371a = j12;
        this.wpdoc.l(lVar, j12);
        processParagraphs(element2.elements());
        zh.f fVar = lVar.c;
        zh.b.f32374b.getClass();
        zh.b.K(fVar, (int) (pVar.getBounds().width * 15.0f));
        zh.b.E(fVar, (int) (pVar.getBounds().height * 15.0f));
        Element element4 = element.element("bodyPr");
        if (element4 != null) {
            zh.b.I(fVar, processValue(element4.attributeValue("tIns"), false));
            zh.b.F(fVar, processValue(element4.attributeValue("bIns"), false));
            zh.b.G(fVar, processValue(element4.attributeValue("lIns"), true));
            zh.b.H(fVar, processValue(element4.attributeValue("rIns"), true));
            String attributeValue = element4.attributeValue("anchor");
            if ("ctr".equals(attributeValue)) {
                zh.b.J(fVar, (byte) 1);
            } else if ("b".equals(attributeValue)) {
                zh.b.J(fVar, (byte) 2);
            } else if ("t".equals(attributeValue)) {
                zh.b.J(fVar, (byte) 0);
            }
            String attributeValue2 = element4.attributeValue("wrap");
            if (attributeValue2 == null || "square".equalsIgnoreCase(attributeValue2)) {
                z10 = true;
            }
            pVar.C = z10;
            pVar.B = (int) this.textboxIndex;
        }
        lVar.f32372b = this.offset;
        this.textboxIndex++;
        this.offset = j10;
        return true;
    }

    private void processThemeColor() {
        PackageRelationship relationship;
        PackagePart part;
        PackagePart packagePart = this.packagePart;
        if (packagePart != null && (relationship = packagePart.getRelationshipsByType(PackageRelationshipTypes.THEME_PART).getRelationship(0)) != null && (part = this.zipPackage.getPart(relationship.getTargetURI())) != null) {
            Map<String, Integer> themeColorMap = ThemeReader.instance().getThemeColorMap(part);
            this.themeColor = themeColorMap;
            if (themeColorMap != null) {
                themeColorMap.put("bg1", themeColorMap.get("lt1"));
                Map<String, Integer> map = this.themeColor;
                map.put("tx1", map.get("dk1"));
                Map<String, Integer> map2 = this.themeColor;
                map2.put("bg2", map2.get("lt2"));
                Map<String, Integer> map3 = this.themeColor;
                map3.put("tx2", map3.get("dk2"));
            }
        }
    }

    private int processValue(String str, boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = 144;
        } else {
            i10 = 72;
        }
        if (str != null) {
            if (ReaderKit.instance().isDecimal(str)) {
                i11 = NumberFormatUtil.toInt(str);
            } else {
                i11 = NumberFormatUtil.toInt(str, 16);
            }
            return (int) androidx.activity.r.b(i11, 96.0f, 914400.0f, 15.0f);
        }
        return i10;
    }

    private void processWatermark(t tVar, Element element) {
        Element element2 = element.element("textpath");
        if (element2 != null) {
            tVar.E = (byte) 0;
            String attributeValue = element.attributeValue("fillcolor");
            if (attributeValue != null && attributeValue.length() > 0) {
                tVar.I = getColor(attributeValue, false);
            }
            Element element3 = element.element("fill");
            if (element3 != null) {
                tVar.M = Float.parseFloat(element3.attributeValue("opacity")) * 0.2f;
            }
            tVar.F = element2.attributeValue("string");
            for (String str : element2.attributeValue("style").split(";")) {
                String[] split = str.split(":");
                if ("font-size".equalsIgnoreCase(split[0])) {
                    int i10 = NumberFormatUtil.toInt(split[1].replace("pt", ""));
                    if (i10 == 1) {
                        tVar.G = true;
                    } else {
                        tVar.H = i10;
                    }
                }
            }
        }
    }

    private void processWrapAndPosition_Drawing(o oVar, Element element, Rectangle rectangle) {
        if ("1".equalsIgnoreCase(element.attributeValue("behindDoc"))) {
            oVar.A = (short) 6;
        }
        oVar.A = getDrawingWrapType(element);
        Element element2 = null;
        Element element3 = null;
        for (Element element4 : element.elements("AlternateContent")) {
            Element element5 = element4.element("Choice");
            if (element5 != null) {
                if (element5.element("positionH") != null) {
                    element2 = element5.element("positionH");
                }
                if (element5.element("positionV") != null) {
                    element3 = element5.element("positionV");
                }
            }
        }
        if (element2 == null) {
            element2 = element.element("positionH");
        }
        if (element2 != null) {
            oVar.f20648t = getRelative(element2.attributeValue("relativeFrom"));
            if (element2.element("align") != null) {
                oVar.f20650v = getAlign(element2.element("align").getText());
            } else if (element2.element("posOffset") != null) {
                rectangle.translate(Math.round((NumberFormatUtil.toInt(element2.element("posOffset").getText()) * 96.0f) / 914400.0f), 0);
            } else if (element2.element("pctPosHOffset") != null) {
                oVar.f20649u = NumberFormatUtil.toInt(element2.element("pctPosHOffset").getText()) / 100;
                oVar.f20647s = (byte) 1;
            }
        }
        if (element3 == null) {
            element3 = element.element("positionV");
        }
        if (element3 != null) {
            oVar.f20652x = getRelative(element3.attributeValue("relativeFrom"));
            if (element3.element("align") != null) {
                oVar.f20654z = getAlign(element3.element("align").getText());
            } else if (element3.element("posOffset") != null) {
                rectangle.translate(0, Math.round((NumberFormatUtil.toInt(element3.element("posOffset").getText()) * 96.0f) / 914400.0f));
            } else if (element3.element("pctPosVOffset") != null) {
                oVar.f20653y = NumberFormatUtil.toInt(element3.element("pctPosVOffset").getText()) / 100;
                oVar.f20651w = (byte) 1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r3 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private eh.c readGradient(lib.zj.office.fc.dom4j.Element r12, lib.zj.office.fc.dom4j.Element r13, byte r14) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.doc.DOCXReader.readGradient(lib.zj.office.fc.dom4j.Element, lib.zj.office.fc.dom4j.Element, byte):eh.c");
    }

    private void setBorderAttribute(zh.f fVar, Element element) {
        if (fVar != null && element != null) {
            Element element2 = element.element("tcBorders");
            if (element2 != null) {
                Element element3 = element2.element("top");
                if (element3 != null) {
                    String attributeValue = element3.attributeValue("color");
                    if (!TextUtils.isEmpty(attributeValue)) {
                        try {
                            zh.b bVar = zh.b.f32374b;
                            int parseColor = Color.parseColor("#" + attributeValue);
                            bVar.getClass();
                            ((c) fVar).e(parseColor, (short) 12289);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                } else {
                    try {
                        zh.b.f32374b.getClass();
                        ((c) fVar).e(0, (short) 12289);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                Element element4 = element2.element("left");
                if (element4 != null) {
                    String attributeValue2 = element4.attributeValue("color");
                    if (!TextUtils.isEmpty(attributeValue2)) {
                        try {
                            zh.b bVar2 = zh.b.f32374b;
                            int parseColor2 = Color.parseColor("#" + attributeValue2);
                            bVar2.getClass();
                            ((c) fVar).e(parseColor2, (short) 12293);
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                } else {
                    try {
                        zh.b.f32374b.getClass();
                        ((c) fVar).e(0, (short) 12293);
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                }
                Element element5 = element2.element("right");
                if (element5 != null) {
                    String attributeValue3 = element5.attributeValue("color");
                    if (!TextUtils.isEmpty(attributeValue3)) {
                        try {
                            zh.b bVar3 = zh.b.f32374b;
                            int parseColor3 = Color.parseColor("#" + attributeValue3);
                            bVar3.getClass();
                            ((c) fVar).e(parseColor3, (short) 12295);
                        } catch (Exception e14) {
                            e14.printStackTrace();
                        }
                    }
                } else {
                    try {
                        zh.b.f32374b.getClass();
                        ((c) fVar).e(0, (short) 12295);
                    } catch (Exception e15) {
                        e15.printStackTrace();
                    }
                }
                Element element6 = element2.element("bottom");
                if (element6 != null) {
                    String attributeValue4 = element6.attributeValue("color");
                    if (!TextUtils.isEmpty(attributeValue4)) {
                        try {
                            zh.b bVar4 = zh.b.f32374b;
                            int parseColor4 = Color.parseColor("#" + attributeValue4);
                            bVar4.getClass();
                            ((c) fVar).e(parseColor4, (short) 12291);
                            return;
                        } catch (Exception e16) {
                            e16.printStackTrace();
                            return;
                        }
                    }
                    return;
                }
                try {
                    zh.b.f32374b.getClass();
                    ((c) fVar).e(0, (short) 12291);
                    return;
                } catch (Exception e17) {
                    e17.printStackTrace();
                    return;
                }
            }
            try {
                zh.b.f32374b.getClass();
                ((c) fVar).e(0, (short) 12289);
                ((c) fVar).e(0, (short) 12293);
                ((c) fVar).e(0, (short) 12295);
                ((c) fVar).e(0, (short) 12291);
            } catch (Exception e18) {
                e18.printStackTrace();
            }
        }
    }

    private void setCellMar(zh.f fVar, Element element, int i10) {
        if (fVar != null && element != null) {
            if (i10 > 0) {
                zh.b.f32374b.getClass();
                c cVar = (c) fVar;
                cVar.e(0, (short) 12305);
                cVar.e(0, (short) 12306);
            } else {
                zh.b.f32374b.getClass();
                c cVar2 = (c) fVar;
                cVar2.e(4, (short) 12305);
                cVar2.e(4, (short) 12306);
            }
            Element element2 = element.element("tcMar");
            if (element2 != null) {
                Element element3 = element2.element("left");
                if (element3 != null) {
                    String attributeValue = element3.attributeValue(OperatorName.SET_LINE_WIDTH);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        try {
                            zh.b bVar = zh.b.f32374b;
                            int round = Math.round(Float.parseFloat(attributeValue) * 0.05f);
                            bVar.getClass();
                            ((c) fVar).e(round, (short) 12307);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                Element element4 = element2.element("right");
                if (element4 != null) {
                    String attributeValue2 = element4.attributeValue(OperatorName.SET_LINE_WIDTH);
                    if (!TextUtils.isEmpty(attributeValue2)) {
                        try {
                            zh.b bVar2 = zh.b.f32374b;
                            int round2 = Math.round(Float.parseFloat(attributeValue2) * 0.05f);
                            bVar2.getClass();
                            ((c) fVar).e(round2, (short) 12308);
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    private void setShapeWrapType(r rVar, short s4) {
        g[] r4;
        for (g gVar : rVar.r()) {
            if (gVar instanceof o) {
                ((o) gVar).A = s4;
            } else if (gVar instanceof r) {
                setShapeWrapType((r) gVar, s4);
            }
        }
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public void dispose() {
        if (isReaderFinish()) {
            Map<String, Integer> map = this.styleStrID;
            if (map != null) {
                map.clear();
            }
            List<g> list = this.relativeType;
            if (list != null) {
                list.clear();
            }
            Map<g, int[]> map2 = this.relativeValue;
            if (map2 != null) {
                map2.clear();
            }
            Hashtable<String, String> hashtable = this.bulletNumbersID;
            if (hashtable != null) {
                hashtable.clear();
            }
            ZipPackage zipPackage = this.zipPackage;
            if (zipPackage != null) {
                zipPackage.revert();
            }
        }
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public Object getModel() {
        e eVar = this.wpdoc;
        if (eVar != null) {
            return eVar;
        }
        this.wpdoc = new e();
        openFile();
        return this.wpdoc;
    }

    public void processRotation(lh.e eVar) {
        float f10 = eVar.f20607h;
        boolean z10 = eVar.f20605f;
        if (z10) {
            f10 = -f10;
        }
        boolean z11 = eVar.f20606g;
        if (z11) {
            f10 = -f10;
        }
        int i10 = eVar.f20615m;
        if ((i10 == 32 || i10 == 34 || i10 == 38) && ((f10 == 45.0f || f10 == 135.0f || f10 == 225.0f) && !z10 && !z11)) {
            f10 -= 90.0f;
        }
        eVar.f20607h = f10;
    }

    @Override // lib.zj.office.system.b
    public boolean searchContent(File file, String str) {
        ZipPackage zipPackage = new ZipPackage(this.filePath, this.needParseByStream);
        this.zipPackage = zipPackage;
        boolean z10 = false;
        this.packagePart = this.zipPackage.getPart(zipPackage.getRelationshipsByType(PackageRelationshipTypes.CORE_DOCUMENT).getRelationship(0));
        SAXReader sAXReader = new SAXReader();
        InputStream inputStream = this.packagePart.getInputStream();
        Element element = sAXReader.read(inputStream).getRootElement().element("body");
        StringBuilder sb2 = new StringBuilder();
        if (element != null) {
            Iterator it = element.elements("p").iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                for (Element element2 : ((Element) it.next()).elements("r")) {
                    Element element3 = element2.element("t");
                    if (element3 != null) {
                        sb2.append(element3.getText());
                    }
                }
                if (sb2.indexOf(str) >= 0) {
                    z10 = true;
                    break;
                }
                sb2.delete(0, sb2.length());
            }
        }
        this.zipPackage = null;
        this.packagePart = null;
        inputStream.close();
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cc  */
    /* JADX WARN: Type inference failed for: r0v34, types: [lh.p] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [lh.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private lh.b processAutoShape2010(lib.zj.office.fc.openxml4j.opc.PackagePart r21, zh.j r22, lib.zj.office.fc.dom4j.Element r23, lh.r r24, float r25, float r26, int r27, int r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.doc.DOCXReader.processAutoShape2010(lib.zj.office.fc.openxml4j.opc.PackagePart, zh.j, lib.zj.office.fc.dom4j.Element, lh.r, float, float, int, int, boolean):lh.b");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean processRun(lib.zj.office.fc.dom4j.Element r27, zh.j r28, byte r29, boolean r30, int r31) {
        /*
            Method dump skipped, instructions count: 1483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.doc.DOCXReader.processRun(lib.zj.office.fc.dom4j.Element, zh.j, byte, boolean, int):boolean");
    }

    /* loaded from: classes3.dex */
    public class DOCXSaxHandler implements ElementHandler {
        public DOCXSaxHandler() {
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onEnd(ElementPath elementPath) {
            if (!((b) DOCXReader.this).abortReader) {
                Element current = elementPath.getCurrent();
                String name = current.getName();
                current.elements();
                if ("p".equals(name)) {
                    DOCXReader.this.processParagraph(current, 0, 0);
                }
                if ("sdt".equals(current.getName())) {
                    current = current.element("sdtContent");
                    if (current != null) {
                        DOCXReader.this.processParagraphs(current.elements());
                    }
                } else if ("tbl".equals(name)) {
                    DOCXReader.this.processTable(current);
                } else if ("pict".equals(name)) {
                    j jVar = new j();
                    long j10 = DOCXReader.this.offset;
                    jVar.f32371a = DOCXReader.this.offset;
                    DOCXReader.this.processPicture(current, jVar);
                    jVar.f32372b = DOCXReader.this.offset;
                    if (DOCXReader.this.offset > j10) {
                        DOCXReader.this.wpdoc.j(jVar, DOCXReader.this.offset);
                    }
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
