package lib.zj.office.fc.ppt.reader;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import lh.l;
import lh.m;
import lh.n;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.ZipPackage;
import lib.zj.office.fc.ppt.attribute.ParaAttr;
import lib.zj.office.fc.ppt.attribute.RunAttr;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.system.f;
import uh.a;
import uh.b;
import uh.c;
import zh.j;

/* loaded from: classes3.dex */
public class TableReader {
    public static final int DEFAULT_CELL_HEIGHT = 40;
    public static final int DEFAULT_CELL_WIDTH = 100;
    private static TableReader kit = new TableReader();

    private b getTableCellBorders(c cVar, int i10, int i11, m mVar) {
        if (cVar == null) {
            return null;
        }
        boolean z10 = mVar.f20636p;
        if (z10 && mVar.f20638r) {
            return getTableCellBorders_FirstRowFirstColumn(cVar, i10, i11, mVar);
        }
        if (z10 && !mVar.f20638r) {
            return getTableCellBorders_FirstRow(cVar, i10, i11, mVar);
        }
        if (!z10 && mVar.f20638r) {
            return getTableCellBorders_FirstColumn(cVar, i10, i11, mVar);
        }
        if (z10 || mVar.f20638r) {
            return null;
        }
        return getTableCellBorders_NotFirstRowFirstColumn(cVar, i10, i11, mVar);
    }

    private b getTableCellBorders_FirstColumn(c cVar, int i10, int i11, m mVar) {
        b bVar;
        if (mVar.f20637q && i10 == mVar.f20634n - 1) {
            bVar = cVar.f30381g;
        } else if (i11 == 0) {
            bVar = cVar.f30378d;
        } else if (mVar.f20639s && i11 == mVar.f20635o - 1) {
            bVar = cVar.f30379e;
        } else if (mVar.f20640t) {
            if (i10 % 2 == 0) {
                bVar = cVar.f30377b;
            } else {
                if (mVar.f20641u && i11 % 2 != 0) {
                    bVar = cVar.c;
                }
                bVar = null;
            }
        } else {
            if (mVar.f20641u && i11 % 2 != 0) {
                bVar = cVar.c;
            }
            bVar = null;
        }
        if (bVar == null) {
            return cVar.f30376a;
        }
        return bVar;
    }

    private b getTableCellBorders_FirstRow(c cVar, int i10, int i11, m mVar) {
        b bVar;
        if (i10 == 0) {
            bVar = cVar.f30380f;
        } else if (mVar.f20637q && i10 == mVar.f20634n - 1) {
            bVar = cVar.f30381g;
        } else if (mVar.f20639s && i11 == mVar.f20635o - 1) {
            bVar = cVar.f30379e;
        } else if (mVar.f20640t) {
            if (i10 % 2 != 0) {
                bVar = cVar.f30377b;
            } else {
                if (mVar.f20641u && i11 % 2 == 0) {
                    bVar = cVar.c;
                }
                bVar = null;
            }
        } else {
            if (mVar.f20641u && i11 % 2 == 0) {
                bVar = cVar.c;
            }
            bVar = null;
        }
        if (bVar == null) {
            return cVar.f30376a;
        }
        return bVar;
    }

    private b getTableCellBorders_FirstRowFirstColumn(c cVar, int i10, int i11, m mVar) {
        b bVar;
        if (i10 == 0) {
            bVar = cVar.f30380f;
        } else if (mVar.f20637q && i10 == mVar.f20634n - 1) {
            bVar = cVar.f30381g;
        } else if (i11 == 0) {
            bVar = cVar.f30378d;
        } else if (mVar.f20639s && i11 == mVar.f20635o - 1) {
            bVar = cVar.f30379e;
        } else if (mVar.f20640t) {
            if (i10 % 2 != 0) {
                bVar = cVar.f30377b;
            } else {
                if (mVar.f20641u && i11 % 2 != 0) {
                    bVar = cVar.c;
                }
                bVar = null;
            }
        } else {
            if (mVar.f20641u && i11 % 2 != 0) {
                bVar = cVar.c;
            }
            bVar = null;
        }
        if (bVar == null) {
            return cVar.f30376a;
        }
        return bVar;
    }

    private b getTableCellBorders_NotFirstRowFirstColumn(c cVar, int i10, int i11, m mVar) {
        b bVar;
        if (mVar.f20637q && i10 == mVar.f20634n - 1) {
            bVar = cVar.f30381g;
        } else if (mVar.f20639s && i11 == mVar.f20635o - 1) {
            bVar = cVar.f30379e;
        } else if (mVar.f20640t) {
            if (i10 % 2 == 0) {
                bVar = cVar.f30377b;
            } else {
                if (mVar.f20641u && i11 % 2 == 0) {
                    bVar = cVar.c;
                }
                bVar = null;
            }
        } else {
            if (mVar.f20641u && i11 % 2 == 0) {
                bVar = cVar.c;
            }
            bVar = null;
        }
        if (bVar == null) {
            return cVar.f30376a;
        }
        return bVar;
    }

    private int getTableCellBottomBorderColor(ZipPackage zipPackage, PackagePart packagePart, th.b bVar, c cVar, b bVar2) {
        Element element;
        Element element2;
        try {
            a aVar = bVar2.f30374a;
            if (aVar == null) {
                element2 = cVar.f30376a.f30374a.f30373d;
            } else {
                Element element3 = aVar.f30373d;
                if (element3 == null) {
                    element2 = cVar.f30376a.f30374a.f30373d;
                } else {
                    element = element3;
                    return BackgroundReader.instance().getBackgroundColor(zipPackage, packagePart, bVar, element, true);
                }
            }
            element = element2;
            return BackgroundReader.instance().getBackgroundColor(zipPackage, packagePart, bVar, element, true);
        } catch (Exception unused) {
            return -16777216;
        }
    }

    private eh.b getTableCellFill(f fVar, ZipPackage zipPackage, PackagePart packagePart, th.b bVar, c cVar, b bVar2) {
        try {
            Element element = bVar2.f30375b;
            if (element == null) {
                element = cVar.f30376a.f30375b;
            }
            return BackgroundReader.instance().processBackground(fVar, zipPackage, packagePart, bVar, element, true);
        } catch (Exception unused) {
            return null;
        }
    }

    private int getTableCellLeftBorderColor(ZipPackage zipPackage, PackagePart packagePart, th.b bVar, c cVar, b bVar2) {
        Element element;
        Element element2;
        try {
            a aVar = bVar2.f30374a;
            if (aVar == null) {
                element2 = cVar.f30376a.f30374a.f30371a;
            } else {
                Element element3 = aVar.f30371a;
                if (element3 == null) {
                    element2 = cVar.f30376a.f30374a.f30371a;
                } else {
                    element = element3;
                    return BackgroundReader.instance().getBackgroundColor(zipPackage, packagePart, bVar, element, true);
                }
            }
            element = element2;
            return BackgroundReader.instance().getBackgroundColor(zipPackage, packagePart, bVar, element, true);
        } catch (Exception unused) {
            return -16777216;
        }
    }

    private int getTableCellRightBorderColor(ZipPackage zipPackage, PackagePart packagePart, th.b bVar, c cVar, b bVar2) {
        Element element;
        Element element2;
        try {
            a aVar = bVar2.f30374a;
            if (aVar == null) {
                element2 = cVar.f30376a.f30374a.c;
            } else {
                Element element3 = aVar.c;
                if (element3 == null) {
                    element2 = cVar.f30376a.f30374a.c;
                } else {
                    element = element3;
                    return BackgroundReader.instance().getBackgroundColor(zipPackage, packagePart, bVar, element, true);
                }
            }
            element = element2;
            return BackgroundReader.instance().getBackgroundColor(zipPackage, packagePart, bVar, element, true);
        } catch (Exception unused) {
            return -16777216;
        }
    }

    private int getTableCellTopBorderColor(ZipPackage zipPackage, PackagePart packagePart, th.b bVar, c cVar, b bVar2) {
        Element element;
        Element element2;
        try {
            a aVar = bVar2.f30374a;
            if (aVar == null) {
                element2 = cVar.f30376a.f30374a.f30372b;
            } else {
                Element element3 = aVar.f30372b;
                if (element3 == null) {
                    element2 = cVar.f30376a.f30374a.f30372b;
                } else {
                    element = element3;
                    return BackgroundReader.instance().getBackgroundColor(zipPackage, packagePart, bVar, element, true);
                }
            }
            element = element2;
            return BackgroundReader.instance().getBackgroundColor(zipPackage, packagePart, bVar, element, true);
        } catch (Exception unused) {
            return -16777216;
        }
    }

    public static TableReader instance() {
        return kit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private gh.b processLine(f fVar, ZipPackage zipPackage, PackagePart packagePart, th.b bVar, c cVar, Element element, int i10) {
        int i11;
        eh.b processBackground;
        int i12 = 1;
        boolean z10 = 0;
        if (element != null) {
            try {
                if (element.element("noFill") == null) {
                    if (element.attributeValue(OperatorName.SET_LINE_WIDTH) != null) {
                        i11 = Math.round((Integer.parseInt(element.attributeValue(OperatorName.SET_LINE_WIDTH)) * 96.0f) / 914400.0f);
                    } else {
                        i11 = 1;
                    }
                    Element element2 = element.element("prstDash");
                    if (element2 == null || "solid".equalsIgnoreCase(element2.attributeValue("val"))) {
                        i12 = 0;
                    }
                    processBackground = BackgroundReader.instance().processBackground(fVar, zipPackage, packagePart, bVar, element);
                    z10 = i12;
                    i12 = i11;
                    gh.b bVar2 = new gh.b();
                    bVar2.f17807b = processBackground;
                    bVar2.f17806a = i12;
                    bVar2.c = z10;
                    return bVar2;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        processBackground = new eh.b();
        processBackground.f16571d = i10;
        gh.b bVar22 = new gh.b();
        bVar22.f17807b = processBackground;
        bVar22.f17806a = i12;
        bVar22.c = z10;
        return bVar22;
    }

    private void processTable(f fVar, ZipPackage zipPackage, PackagePart packagePart, th.b bVar, List<Element> list, Rectangle rectangle, m mVar, int[] iArr, int[] iArr2, c cVar) {
        int i10;
        Iterator<Element> it;
        Element element;
        lib.zj.office.java.awt.a aVar;
        Element element2;
        l lVar;
        b bVar2;
        Rectangle rectangle2 = rectangle;
        Iterator<Element> it2 = list.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            int i12 = 0;
            for (Element element3 : it2.next().elements("tc")) {
                if (element3.attribute("hMerge") == null && element3.attribute("vMerge") == null) {
                    l lVar2 = new l();
                    lib.zj.office.java.awt.a aVar2 = new lib.zj.office.java.awt.a(rectangle2.f20688x, rectangle2.f20689y);
                    for (int i13 = 0; i13 < i12; i13++) {
                        aVar2.f20690a += iArr[i13];
                    }
                    for (int i14 = 0; i14 < i11; i14++) {
                        aVar2.f20691b += iArr2[i14];
                    }
                    int i15 = iArr[i12];
                    int i16 = iArr2[i11];
                    if (element3.attribute("rowSpan") != null) {
                        int parseInt = Integer.parseInt(element3.attributeValue("rowSpan"));
                        for (int i17 = 1; i17 < parseInt; i17++) {
                            i16 += iArr2[i11 + i17];
                        }
                    }
                    if (element3.attribute("gridSpan") != null) {
                        int parseInt2 = Integer.parseInt(element3.attributeValue("gridSpan"));
                        for (int i18 = 1; i18 < parseInt2; i18++) {
                            i15 += iArr[i12 + i18];
                        }
                    }
                    aVar2.c = i15;
                    aVar2.f20692d = i16;
                    lVar2.f20631f = aVar2;
                    b tableCellBorders = getTableCellBorders(cVar, i11, i12, mVar);
                    Element element4 = element3.element("tcPr");
                    if (element4 != null) {
                        element = element4;
                        bVar2 = tableCellBorders;
                        aVar = aVar2;
                        it = it2;
                        lVar = lVar2;
                        element2 = element3;
                        i10 = i12;
                        lVar.f20627a = processLine(fVar, zipPackage, packagePart, bVar, cVar, element4.element("lnL"), getTableCellLeftBorderColor(zipPackage, packagePart, bVar, cVar, bVar2));
                        lVar.f20628b = processLine(fVar, zipPackage, packagePart, bVar, cVar, element.element("lnR"), getTableCellRightBorderColor(zipPackage, packagePart, bVar, cVar, bVar2));
                        lVar.c = processLine(fVar, zipPackage, packagePart, bVar, cVar, element.element("lnT"), getTableCellTopBorderColor(zipPackage, packagePart, bVar, cVar, bVar2));
                        lVar.f20629d = processLine(fVar, zipPackage, packagePart, bVar, cVar, element.element("lnB"), getTableCellBottomBorderColor(zipPackage, packagePart, bVar, cVar, bVar2));
                    } else {
                        element = element4;
                        aVar = aVar2;
                        element2 = element3;
                        i10 = i12;
                        it = it2;
                        lVar = lVar2;
                        if (tableCellBorders != null) {
                            bVar2 = tableCellBorders;
                            lVar.f20627a = processLine(fVar, zipPackage, packagePart, bVar, cVar, null, getTableCellLeftBorderColor(zipPackage, packagePart, bVar, cVar, tableCellBorders));
                            lVar.f20628b = processLine(fVar, zipPackage, packagePart, bVar, cVar, null, getTableCellRightBorderColor(zipPackage, packagePart, bVar, cVar, bVar2));
                            lVar.c = processLine(fVar, zipPackage, packagePart, bVar, cVar, null, getTableCellTopBorderColor(zipPackage, packagePart, bVar, cVar, bVar2));
                            lVar.f20629d = processLine(fVar, zipPackage, packagePart, bVar, cVar, null, getTableCellBottomBorderColor(zipPackage, packagePart, bVar, cVar, bVar2));
                        } else {
                            bVar2 = tableCellBorders;
                            gh.b processLine = processLine(fVar, zipPackage, packagePart, bVar, cVar, null, -16777216);
                            lVar.f20627a = processLine;
                            lVar.f20628b = processLine;
                            lVar.c = processLine;
                            lVar.f20629d = processLine;
                        }
                    }
                    eh.b processBackground = BackgroundReader.instance().processBackground(fVar, zipPackage, packagePart, bVar, element);
                    b bVar3 = bVar2;
                    if (processBackground == null && bVar3 != null) {
                        processBackground = getTableCellFill(fVar, zipPackage, packagePart, bVar, cVar, bVar3);
                    }
                    lVar.f20632g = processBackground;
                    n nVar = new n();
                    Rectangle rectangle3 = new Rectangle((int) aVar.f20690a, (int) aVar.f20691b, (int) aVar.c, (int) aVar.f20692d);
                    nVar.f20604e = rectangle3;
                    processCellSection(fVar, bVar, nVar, rectangle3, element2, (cVar == null || !(bVar3 == null || bVar3.c == null)) ? bVar3 : cVar.f30376a);
                    lVar.f20630e = nVar;
                    mVar.f20633m[(iArr.length * i11) + i10] = lVar;
                } else {
                    i10 = i12;
                    it = it2;
                }
                i12 = i10 + 1;
                rectangle2 = rectangle;
                it2 = it;
            }
            i11++;
            rectangle2 = rectangle;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [uh.c] */
    public m getTable(f fVar, ZipPackage zipPackage, PackagePart packagePart, th.c cVar, th.b bVar, Element element, Rectangle rectangle) {
        int i10;
        int i11;
        RunAttr.instance().setTable(true);
        Element element2 = element.element("tblGrid");
        m mVar = null;
        if (element2 != null) {
            List<Element> elements = element2.elements("gridCol");
            int size = elements.size();
            int[] iArr = new int[size];
            int i12 = 0;
            for (Element element3 : elements) {
                int parseInt = (int) ((Integer.parseInt(element3.attributeValue(OperatorName.SET_LINE_WIDTH)) * 96.0f) / 914400.0f);
                if (parseInt > 0) {
                    i11 = i12 + 1;
                    iArr[i12] = parseInt;
                } else {
                    i11 = i12 + 1;
                    iArr[i12] = 133;
                }
                i12 = i11;
            }
            List<Element> elements2 = element.elements("tr");
            int size2 = elements2.size();
            int[] iArr2 = new int[size2];
            int i13 = 0;
            for (Element element4 : elements2) {
                int parseInt2 = (int) ((Integer.parseInt(element4.attributeValue("h")) * 96.0f) / 914400.0f);
                if (parseInt2 > 0) {
                    i10 = i13 + 1;
                    iArr2[i13] = parseInt2;
                } else {
                    i10 = i13 + 1;
                    iArr2[i13] = 53;
                }
                i13 = i10;
            }
            m mVar2 = new m(size2, size);
            Element element5 = element.element("tblPr");
            Element element6 = element5.element("tableStyleId");
            if (element6 != null) {
                if (cVar != null) {
                    String text = element6.getText();
                    HashMap hashMap = cVar.f30032f;
                    if (hashMap != null && text != null) {
                        mVar = (c) hashMap.get(text);
                    }
                }
                mVar2.f20636p = "1".equalsIgnoreCase(element5.attributeValue("firstRow"));
                mVar2.f20637q = "1".equalsIgnoreCase(element5.attributeValue("lastRow"));
                mVar2.f20638r = "1".equalsIgnoreCase(element5.attributeValue("firstCol"));
                mVar2.f20639s = "1".equalsIgnoreCase(element5.attributeValue("lastCol"));
                mVar2.f20640t = "1".equalsIgnoreCase(element5.attributeValue("bandRow"));
                mVar2.f20641u = "1".equalsIgnoreCase(element5.attributeValue("bandCol"));
            }
            processTable(fVar, zipPackage, packagePart, bVar, elements2, rectangle, mVar2, iArr, iArr2, mVar);
            mVar = mVar2;
        }
        RunAttr.instance().setTable(false);
        return mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f4, code lost:
        if (r8.equals("dist") != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void processCellSection(lib.zj.office.system.f r18, th.b r19, lh.n r20, lib.zj.office.java.awt.Rectangle r21, lib.zj.office.fc.dom4j.Element r22, uh.b r23) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.ppt.reader.TableReader.processCellSection(lib.zj.office.system.f, th.b, lh.n, lib.zj.office.java.awt.Rectangle, lib.zj.office.fc.dom4j.Element, uh.b):void");
    }

    public int processParagraph(f fVar, th.b bVar, zh.l lVar, Element element, b bVar2) {
        int i10;
        zh.f fVar2;
        Element element2;
        String attributeValue;
        Element element3 = element.element("bodyPr");
        if (element3 != null && (element2 = element3.element("normAutofit")) != null && element2.attribute("lnSpcReduction") != null && (attributeValue = element2.attributeValue("lnSpcReduction")) != null && attributeValue.length() > 0) {
            i10 = Integer.parseInt(attributeValue);
        } else {
            i10 = 0;
        }
        List elements = element.elements("p");
        int i11 = 0;
        for (int i12 = 0; i12 < elements.size(); i12++) {
            Element element4 = (Element) elements.get(i12);
            j jVar = new j();
            jVar.f32371a = i11;
            ParaAttr.instance().setParaAttribute(fVar, element4.element("pPr"), jVar.c, null, -1, -1, i10, true, false);
            if (bVar2 != null) {
                fVar2 = bVar2.c;
            } else {
                fVar2 = null;
            }
            i11 = RunAttr.instance().processRun(bVar, jVar, element4, fVar2, i11, 100, -1);
            ParaAttr.instance().processParaWithPct(element4.element("pPr"), jVar.c);
            if (i12 == 0) {
                zh.b bVar3 = zh.b.f32374b;
                zh.f fVar3 = jVar.c;
                bVar3.getClass();
                zh.b.M(fVar3, 0);
            } else if (i12 == elements.size() - 1) {
                zh.b bVar4 = zh.b.f32374b;
                zh.f fVar4 = jVar.c;
                bVar4.getClass();
                zh.b.L(fVar4, 0);
            }
            jVar.f32372b = i11;
            lVar.e(jVar);
        }
        return i11;
    }
}
