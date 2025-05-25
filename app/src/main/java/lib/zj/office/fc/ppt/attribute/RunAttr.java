package lib.zj.office.fc.ppt.attribute;

import android.graphics.Color;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.play.core.assetpacks.b1;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import ei.d;
import ii.e;
import java.util.Date;
import java.util.Iterator;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.ppt.reader.HyperlinkReader;
import lib.zj.office.fc.ppt.reader.ReaderKit;
import lib.zj.office.fc.xls.Reader.SchemeColorUtil;
import lib.zj.office.ss.util.format.NumericFormatter;
import yh.a;
import zh.b;
import zh.c;
import zh.f;
import zh.i;
import zh.j;
import zh.m;
import zh.n;

/* loaded from: classes3.dex */
public class RunAttr {
    private static RunAttr kit = new RunAttr();
    private int maxFontSize = 0;
    private boolean slide;
    private boolean table;

    private int getRunPropColor(d dVar, Element element) {
        int i10;
        if (element.attributeValue("indexed") != null) {
            i10 = dVar.i(Integer.parseInt(element.attributeValue("indexed")));
        } else if (element.attributeValue("theme") != null) {
            i10 = SchemeColorUtil.getThemeColor(dVar, Integer.parseInt(element.attributeValue("theme")));
        } else if (element.attributeValue("rgb") != null) {
            i10 = (int) Long.parseLong(element.attributeValue("rgb"), 16);
        } else {
            i10 = -1;
        }
        if (element.attributeValue("tint") != null) {
            double parseDouble = Double.parseDouble(element.attributeValue("tint"));
            return Color.rgb(b1.o(parseDouble, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(parseDouble, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(parseDouble, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
        }
        return i10;
    }

    public static RunAttr instance() {
        return kit;
    }

    private void setFontBold(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 4)) {
                boolean z10 = true;
                int b10 = ((c) fVar).b((short) 4, true);
                if (b10 != Integer.MIN_VALUE) {
                    if (b10 != 1) {
                        z10 = false;
                    }
                    b.v(fVar2, z10);
                    return;
                }
                throw null;
            }
        }
    }

    private void setFontColor(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 3)) {
                b.w(fVar2, b.f(null, fVar));
            }
        }
    }

    private void setFontDoubleStrike(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 7)) {
                int i10 = 1;
                int b10 = ((c) fVar).b((short) 7, true);
                if (b10 != Integer.MIN_VALUE) {
                    if (b10 != 1) {
                        i10 = 0;
                    }
                    ((c) fVar2).e(i10, (short) 7);
                    return;
                }
                throw null;
            }
        }
    }

    private void setFontItalic(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 5)) {
                boolean z10 = true;
                int b10 = ((c) fVar).b((short) 5, true);
                if (b10 != Integer.MIN_VALUE) {
                    if (b10 != 1) {
                        z10 = false;
                    }
                    b.x(fVar2, z10);
                    return;
                }
                throw null;
            }
        }
    }

    private void setFontRtl(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 17)) {
                int i10 = 1;
                int b10 = ((c) fVar).b((short) 17, true);
                if (b10 != Integer.MIN_VALUE) {
                    if (b10 != 1) {
                        i10 = 0;
                    }
                    ((c) fVar2).e(i10, (short) 17);
                    return;
                }
                throw null;
            }
        }
    }

    private void setFontScript(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 10)) {
                int b10 = ((c) fVar).b((short) 10, true);
                if (b10 != Integer.MIN_VALUE) {
                    b.y(fVar2, b10);
                    return;
                }
                throw null;
            }
        }
    }

    private void setFontSize(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 1)) {
                b.z(fVar2, b.g(null, fVar));
            }
        }
    }

    private void setFontStrike(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 6)) {
                boolean z10 = true;
                int b10 = ((c) fVar).b((short) 6, true);
                if (b10 != Integer.MIN_VALUE) {
                    if (b10 != 1) {
                        z10 = false;
                    }
                    b.A(fVar2, z10);
                    return;
                }
                throw null;
            }
        }
    }

    private void setFontTypeface(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 2)) {
                int b10 = ((c) fVar).b((short) 2, true);
                if (b10 != Integer.MIN_VALUE) {
                    ((c) fVar2).e(b10, (short) 2);
                    return;
                }
                throw null;
            }
        }
    }

    private void setFontUnderline(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 8)) {
                b.B(fVar2, b.h(null, fVar));
                if (b.u(fVar, (short) 9)) {
                    b.C(fVar2, b.i(null, fVar));
                } else if (b.u(fVar, (short) 3)) {
                    b.C(fVar2, b.f(null, fVar));
                }
            }
        }
    }

    private void setHyperlinkID(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 12)) {
                b.D(fVar2, b.j(fVar));
            }
        }
    }

    public void dispose() {
        this.maxFontSize = 0;
    }

    public int getColor(d dVar, Element element) {
        int parseInt;
        String attributeValue;
        if (element.element("srgbClr") != null) {
            parseInt = (int) Long.parseLong(element.element("srgbClr").attributeValue("val"), 16);
        } else if (element.element("schemeClr") != null) {
            Element element2 = element.element("schemeClr");
            int intValue = SchemeColorUtil.getSchemeColor(dVar).get(element2.attributeValue("val")).intValue();
            if (element2.element("tint") != null) {
                double parseInt2 = Integer.parseInt(element2.element("tint").attributeValue("val")) / 100000.0d;
                intValue = Color.rgb(b1.o(parseInt2, Color.red(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(parseInt2, Color.green(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(parseInt2, Color.blue(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            } else if (element2.element("lumOff") != null) {
                double parseInt3 = Integer.parseInt(element2.element("lumOff").attributeValue("val")) / 100000.0d;
                intValue = Color.rgb(b1.o(parseInt3, Color.red(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(parseInt3, Color.green(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(parseInt3, Color.blue(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            } else if (element2.element("lumMod") != null) {
                double parseInt4 = (Integer.parseInt(element2.element("lumMod").attributeValue("val")) / 100000.0d) - 1.0d;
                intValue = Color.rgb(b1.o(parseInt4, Color.red(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(parseInt4, Color.green(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(parseInt4, Color.blue(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            } else if (element2.element("shade") != null) {
                double d10 = (-Integer.parseInt(element2.element("shade").attributeValue("val"))) / 200000.0d;
                intValue = Color.rgb(b1.o(d10, Color.red(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(d10, Color.green(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(d10, Color.blue(intValue) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            }
            if (element2.element("alpha") != null && (attributeValue = element2.element("alpha").attributeValue("val")) != null) {
                return (intValue & 16777215) | (((int) ((Integer.parseInt(attributeValue) / 100000.0f) * 255.0f)) << 24);
            }
            return intValue;
        } else if (element.element("sysClr") != null) {
            parseInt = Integer.parseInt(element.element("sysClr").attributeValue("lastClr"), 16);
        } else {
            return -1;
        }
        return parseInt | (-16777216);
    }

    public int getMaxFontSize() {
        return this.maxFontSize;
    }

    public boolean isSlide() {
        return this.slide;
    }

    public boolean isTable() {
        return this.table;
    }

    public int processRun(th.b bVar, j jVar, Element element, f fVar, int i10, int i11, int i12) {
        String str;
        String replace;
        int length;
        String str2;
        Element element2;
        int i13 = i10;
        this.maxFontSize = 0;
        Element element3 = element.element("pPr");
        String str3 = "r";
        if (element.elements("r").size() == 0 && element.elements("fld").size() == 0 && element.elements("br").size() == 0) {
            i iVar = new i("\n");
            if (element3 != null) {
                element3 = element3.element("rPr");
            }
            if (element3 == null) {
                element2 = element.element("endParaRPr");
            } else {
                element2 = element3;
            }
            setRunAttribute(bVar, element2, iVar.c, fVar, i11, i12, true);
            b bVar2 = b.f32374b;
            f fVar2 = jVar.c;
            f fVar3 = iVar.c;
            bVar2.getClass();
            setMaxFontSize(b.g(fVar2, fVar3));
            iVar.f32371a = i13;
            int i14 = i13 + 1;
            iVar.f32372b = i14;
            jVar.e(iVar);
            return i14;
        }
        Iterator elementIterator = element.elementIterator();
        i iVar2 = null;
        while (elementIterator.hasNext()) {
            Element element4 = (Element) elementIterator.next();
            String name = element4.getName();
            if (name.equals(str3) || name.equals("fld") || name.equals("br")) {
                if (name.equals("fld") && element4.attributeValue("type") != null && element4.attributeValue("type").contains("datetime")) {
                    NumericFormatter numericFormatter = NumericFormatter.f20969b;
                    Date date = new Date(System.currentTimeMillis());
                    numericFormatter.getClass();
                    str = NumericFormatter.d("yyyy/m/d", date);
                } else {
                    Element element5 = element4.element("t");
                    if (name.equals("br")) {
                        str = String.valueOf((char) 11);
                    } else if (element5 != null) {
                        str = element5.getText();
                    } else {
                        str = null;
                    }
                }
                if (str != null && (length = (replace = str.replace((char) 160, ' ')).length()) > 0) {
                    i iVar3 = new i(replace);
                    str2 = str3;
                    setRunAttribute(bVar, element4.element("rPr"), iVar3.c, fVar, i11, i12, "\n".equals(replace));
                    b bVar3 = b.f32374b;
                    f fVar4 = jVar.c;
                    f fVar5 = iVar3.c;
                    bVar3.getClass();
                    setMaxFontSize(b.g(fVar4, fVar5));
                    iVar3.f32371a = i13;
                    i13 += length;
                    iVar3.f32372b = i13;
                    jVar.e(iVar3);
                    iVar2 = iVar3;
                    str3 = str2;
                }
            }
            str2 = str3;
            str3 = str2;
        }
        if (iVar2 != null) {
            iVar2.e(iVar2.getText() + "\n");
            return i13 + 1;
        }
        return i13;
    }

    public void resetMaxFontSize() {
        this.maxFontSize = 0;
    }

    public void setMaxFontSize(int i10) {
        if (i10 > this.maxFontSize) {
            this.maxFontSize = i10;
        }
    }

    public void setRunAttribute(ei.c cVar, a aVar, f fVar, f fVar2) {
        if (aVar != null) {
            d dVar = cVar.f16601a;
            b.f32374b.getClass();
            b.z(fVar, (int) (aVar.f32142b + 0.5d));
            b.w(fVar, dVar.i(aVar.f32144e));
            b.v(fVar, aVar.f32143d);
            b.x(fVar, aVar.c);
            b.B(fVar, aVar.f32146g);
            b.A(fVar, aVar.f32147h);
        } else if (fVar2 != null) {
            setFontSize(fVar2, fVar);
            setFontColor(fVar2, fVar);
            setFontBold(fVar2, fVar);
            setFontRtl(fVar2, fVar);
            setFontItalic(fVar2, fVar);
            setFontUnderline(fVar2, fVar);
            setFontStrike(fVar2, fVar);
            setFontDoubleStrike(fVar2, fVar);
            setFontScript(fVar2, fVar);
            setHyperlinkID(fVar2, fVar);
        }
    }

    public void setSlide(boolean z10) {
        this.slide = z10;
    }

    public void setTable(boolean z10) {
        this.table = z10;
    }

    public void setRunAttribute(th.b bVar, Element element, f fVar, f fVar2, int i10, int i11, boolean z10) {
        c cVar;
        int a10;
        Integer num;
        int parseInt;
        Element element2;
        if (element != null) {
            if (element.attribute("sz") != null) {
                String attributeValue = element.attributeValue("sz");
                if (attributeValue != null && attributeValue.length() > 0) {
                    b.f32374b.getClass();
                    b.z(fVar, (int) (Float.parseFloat(attributeValue) / 100.0f));
                }
            } else {
                setFontSize(fVar2, fVar);
            }
            if (!z10) {
                Element element3 = element.element("latin");
                if (element3 == null && element.element("ea") == null) {
                    setFontTypeface(fVar2, fVar);
                } else {
                    if (element3 == null) {
                        element3 = element.element("ea");
                    }
                    String attributeValue2 = element3.attributeValue("typeface");
                    if (attributeValue2 != null && (a10 = w1.f.b().a(attributeValue2)) >= 0) {
                        b.f32374b.getClass();
                        ((c) fVar).e(a10, (short) 2);
                    }
                }
                Element element4 = element.element("solidFill");
                if (element4 != null) {
                    num = Integer.valueOf(ReaderKit.instance().getColor(bVar, element4));
                    b bVar2 = b.f32374b;
                    int intValue = num.intValue();
                    bVar2.getClass();
                    b.w(fVar, intValue);
                } else {
                    Element element5 = element.element("gradFill");
                    if (element5 != null) {
                        Element element6 = element5.element("gsLst");
                        if (element6 != null) {
                            num = Integer.valueOf(ReaderKit.instance().getColor(bVar, element6.element(OperatorName.SET_GRAPHICS_STATE_PARAMS)));
                            b bVar3 = b.f32374b;
                            int intValue2 = num.intValue();
                            bVar3.getClass();
                            b.w(fVar, intValue2);
                        }
                    } else {
                        setFontColor(fVar2, fVar);
                    }
                    num = null;
                }
                if (element.attribute("b") != null) {
                    String attributeValue3 = element.attributeValue("b");
                    if (attributeValue3 != null && attributeValue3.length() > 0 && Integer.parseInt(attributeValue3) > 0) {
                        b.f32374b.getClass();
                        b.v(fVar, true);
                    }
                } else {
                    setFontBold(fVar2, fVar);
                }
                if (element.attribute("rtl") != null) {
                    b.f32374b.getClass();
                    ((c) fVar).e(1, (short) 17);
                } else {
                    setFontRtl(fVar2, fVar);
                }
                if (element.attribute(OperatorName.SET_FLATNESS) != null) {
                    String attributeValue4 = element.attributeValue(OperatorName.SET_FLATNESS);
                    if (attributeValue4 != null && attributeValue4.length() > 0) {
                        b bVar4 = b.f32374b;
                        boolean z11 = Integer.parseInt(attributeValue4) > 0;
                        bVar4.getClass();
                        b.x(fVar, z11);
                    }
                } else {
                    setFontItalic(fVar2, fVar);
                }
                if (element.attribute("u") != null) {
                    String attributeValue5 = element.attributeValue("u");
                    if (attributeValue5 != null && attributeValue5.length() > 0 && !attributeValue5.equalsIgnoreCase("none")) {
                        b.f32374b.getClass();
                        b.B(fVar, 1);
                        Element element7 = element.element("uFill");
                        if (element7 != null && (element2 = element7.element("solidFill")) != null) {
                            b.C(fVar, ReaderKit.instance().getColor(bVar, element2));
                        } else if (num != null) {
                            b.C(fVar, num.intValue());
                        }
                    }
                } else {
                    setFontUnderline(fVar2, fVar);
                }
                if (element.attribute("strike") != null) {
                    String attributeValue6 = element.attributeValue("strike");
                    if (attributeValue6.equals("dblStrike")) {
                        b.f32374b.getClass();
                        ((c) fVar).e(1, (short) 7);
                    } else if (attributeValue6.equals("sngStrike")) {
                        b.f32374b.getClass();
                        b.A(fVar, true);
                    }
                } else {
                    setFontStrike(fVar2, fVar);
                    setFontDoubleStrike(fVar2, fVar);
                }
                if (element.attribute("baseline") != null) {
                    String attributeValue7 = element.attributeValue("baseline");
                    if (attributeValue7 != null && attributeValue7.length() > 0 && (parseInt = Integer.parseInt(attributeValue7)) != 0) {
                        b bVar5 = b.f32374b;
                        int i12 = parseInt > 0 ? 1 : 2;
                        bVar5.getClass();
                        b.y(fVar, i12);
                    }
                } else {
                    setFontScript(fVar2, fVar);
                }
                Element element8 = element.element("hlinkClick");
                if (element8 != null) {
                    int intValue3 = bVar != null ? ((Integer) bVar.f30021b.get("hlink")).intValue() : -16776961;
                    b.f32374b.getClass();
                    b.w(fVar, intValue3);
                    b.B(fVar, 1);
                    b.C(fVar, intValue3);
                    String attributeValue8 = element8.attributeValue(FacebookMediationAdapter.KEY_ID);
                    if (attributeValue8 != null && attributeValue8.length() > 0) {
                        b.D(fVar, HyperlinkReader.instance().getLinkIndex(attributeValue8));
                    }
                } else {
                    setHyperlinkID(fVar2, fVar);
                }
            }
        } else if (fVar2 != null) {
            setFontSize(fVar2, fVar);
            if (!z10) {
                setFontTypeface(fVar2, fVar);
                setFontColor(fVar2, fVar);
                setFontBold(fVar2, fVar);
                setFontRtl(fVar2, fVar);
                setFontItalic(fVar2, fVar);
                setFontUnderline(fVar2, fVar);
                setFontStrike(fVar2, fVar);
                setFontDoubleStrike(fVar2, fVar);
                setFontScript(fVar2, fVar);
                setHyperlinkID(fVar2, fVar);
            }
        }
        b.f32374b.getClass();
        ((c) fVar).e(i10, (short) 14);
        if (b.u(fVar, (short) 1)) {
            return;
        }
        m a11 = n.f32394b.a(i11);
        if ((a11 == null || (cVar = a11.c) == null || !b.u(cVar, (short) 1)) && !this.table && this.slide) {
            b.z(fVar, 18);
        }
    }

    public void setRunAttribute(ei.c cVar, Element element, f fVar, f fVar2) {
        Element element2;
        if (element == null) {
            if (fVar2 != null) {
                setFontSize(fVar2, fVar);
                setFontColor(fVar2, fVar);
                setFontBold(fVar2, fVar);
                setFontRtl(fVar2, fVar);
                setFontItalic(fVar2, fVar);
                setFontUnderline(fVar2, fVar);
                setFontStrike(fVar2, fVar);
                setFontDoubleStrike(fVar2, fVar);
                setFontScript(fVar2, fVar);
                setHyperlinkID(fVar2, fVar);
                return;
            }
            return;
        }
        if (element.attribute("sz") != null) {
            String attributeValue = element.attributeValue("sz");
            if (attributeValue != null && attributeValue.length() > 0) {
                b.f32374b.getClass();
                b.z(fVar, (int) (Float.parseFloat(attributeValue) / 100.0f));
            }
        } else {
            setFontSize(fVar2, fVar);
        }
        Element element3 = element.element("solidFill");
        if (element3 != null) {
            b bVar = b.f32374b;
            int color = getColor(cVar.f16601a, element3);
            bVar.getClass();
            b.w(fVar, color);
        } else {
            setFontColor(fVar2, fVar);
        }
        if (element.attribute("b") != null) {
            b bVar2 = b.f32374b;
            boolean z10 = Integer.parseInt(element.attributeValue("b")) == 1;
            bVar2.getClass();
            b.v(fVar, z10);
        } else {
            setFontBold(fVar2, fVar);
        }
        if (element.attribute("rtl") != null) {
            b.f32374b.getClass();
            ((c) fVar).e(1, (short) 17);
        } else {
            setFontRtl(fVar2, fVar);
        }
        if (element.attribute(OperatorName.SET_FLATNESS) != null) {
            b bVar3 = b.f32374b;
            boolean z11 = Integer.parseInt(element.attributeValue(OperatorName.SET_FLATNESS)) == 1;
            bVar3.getClass();
            b.x(fVar, z11);
        } else {
            setFontItalic(fVar2, fVar);
        }
        if (element.attributeValue("u") != null && !element.attributeValue("u").equalsIgnoreCase("none")) {
            b.f32374b.getClass();
            b.B(fVar, 1);
            Element element4 = element.element("uFill");
            if (element4 != null && (element2 = element4.element("solidFill")) != null) {
                b.C(fVar, getColor(cVar.f16601a, element2));
            }
        } else {
            setFontUnderline(fVar2, fVar);
        }
        if (element.attribute("strike") != null) {
            String attributeValue2 = element.attributeValue("strike");
            if (attributeValue2.equals("dblStrike")) {
                b.f32374b.getClass();
                ((c) fVar).e(1, (short) 7);
            } else if (attributeValue2.equals("sngStrike")) {
                b.f32374b.getClass();
                b.A(fVar, true);
            }
        } else {
            setFontStrike(fVar2, fVar);
            setFontDoubleStrike(fVar2, fVar);
        }
        if (element.attribute("baseline") != null) {
            String attributeValue3 = element.attributeValue("baseline");
            if (attributeValue3 != null && !attributeValue3.equalsIgnoreCase(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES)) {
                b bVar4 = b.f32374b;
                int i10 = Integer.parseInt(attributeValue3) > 0 ? 1 : 2;
                bVar4.getClass();
                b.y(fVar, i10);
            }
        } else {
            setFontScript(fVar2, fVar);
        }
        Element element5 = element.element("hlinkClick");
        if (element5 != null && element5.attribute(FacebookMediationAdapter.KEY_ID) != null) {
            String attributeValue4 = element5.attributeValue(FacebookMediationAdapter.KEY_ID);
            if (attributeValue4 == null || attributeValue4.length() <= 0) {
                return;
            }
            b.f32374b.getClass();
            b.w(fVar, -16776961);
            b.B(fVar, 1);
            b.C(fVar, -16776961);
            b.D(fVar, HyperlinkReader.instance().getLinkIndex(attributeValue4));
            return;
        }
        setHyperlinkID(fVar2, fVar);
    }

    public void setRunAttribute(d dVar, int i10, Element element, f fVar, f fVar2) {
        if (element == null) {
            if (fVar2 != null) {
                a k10 = dVar.k(i10);
                if (k10 != null) {
                    b.f32374b.getClass();
                    b.z(fVar, (int) k10.f32142b);
                    b.w(fVar, dVar.i(k10.f32144e));
                    b.v(fVar, k10.f32143d);
                    b.x(fVar, k10.c);
                    b.B(fVar, k10.f32146g);
                    b.A(fVar, k10.f32147h);
                    setFontDoubleStrike(fVar2, fVar);
                    b.y(fVar, k10.f32145f);
                    setHyperlinkID(fVar2, fVar);
                    return;
                }
                setFontSize(fVar2, fVar);
                setFontColor(fVar2, fVar);
                setFontBold(fVar2, fVar);
                setFontRtl(fVar2, fVar);
                setFontItalic(fVar2, fVar);
                setFontUnderline(fVar2, fVar);
                setFontStrike(fVar2, fVar);
                setFontDoubleStrike(fVar2, fVar);
                setFontScript(fVar2, fVar);
                setHyperlinkID(fVar2, fVar);
                return;
            }
            return;
        }
        Element element2 = element.element("sz");
        if (element2 != null) {
            String attributeValue = element2.attributeValue("val");
            if (attributeValue != null && attributeValue.length() > 0) {
                b.f32374b.getClass();
                b.z(fVar, (int) Float.parseFloat(attributeValue));
            }
        } else {
            setFontSize(fVar2, fVar);
        }
        Element element3 = element.element("color");
        if (element3 != null) {
            b bVar = b.f32374b;
            int runPropColor = getRunPropColor(dVar, element3);
            bVar.getClass();
            b.w(fVar, runPropColor);
        } else {
            setFontColor(fVar2, fVar);
        }
        if (element.element("b") != null) {
            b.f32374b.getClass();
            b.v(fVar, true);
        } else {
            setFontBold(fVar2, fVar);
        }
        if (element.attribute("rtl") != null) {
            b.f32374b.getClass();
            ((c) fVar).e(1, (short) 17);
        } else {
            setFontRtl(fVar2, fVar);
        }
        if (element.element(OperatorName.SET_FLATNESS) != null) {
            b.f32374b.getClass();
            b.x(fVar, true);
        } else {
            setFontItalic(fVar2, fVar);
        }
        if (element.element("u") != null) {
            b.f32374b.getClass();
            b.B(fVar, 1);
        } else {
            setFontUnderline(fVar2, fVar);
        }
        if (element.element("strike") != null) {
            b.f32374b.getClass();
            b.A(fVar, true);
            setFontDoubleStrike(fVar2, fVar);
        } else {
            setFontStrike(fVar2, fVar);
            setFontDoubleStrike(fVar2, fVar);
        }
        Element element4 = element.element("vertAlign");
        if (element4 != null) {
            String attributeValue2 = element4.attributeValue("val");
            if (attributeValue2.equalsIgnoreCase("superscript")) {
                b.f32374b.getClass();
                b.y(fVar, 1);
            } else if (attributeValue2.equalsIgnoreCase("subscript")) {
                b.f32374b.getClass();
                b.y(fVar, 2);
            } else {
                b.f32374b.getClass();
                b.y(fVar, 0);
            }
        } else {
            setFontScript(fVar2, fVar);
        }
        setHyperlinkID(fVar2, fVar);
    }

    public void setRunAttribute(ei.c cVar, ei.a aVar, f fVar, f fVar2) {
        if (aVar != null) {
            e b10 = aVar.b();
            d dVar = cVar.f16601a;
            a k10 = dVar.k(b10.f18503b);
            b.f32374b.getClass();
            b.z(fVar, (int) (k10.f32142b + 0.5d));
            b.w(fVar, dVar.i(k10.f32144e));
            b.v(fVar, k10.f32143d);
            b.x(fVar, k10.c);
            b.B(fVar, k10.f32146g);
            b.A(fVar, k10.f32147h);
        } else if (fVar2 != null) {
            setFontSize(fVar2, fVar);
            setFontColor(fVar2, fVar);
            setFontBold(fVar2, fVar);
            setFontRtl(fVar2, fVar);
            setFontItalic(fVar2, fVar);
            setFontUnderline(fVar2, fVar);
            setFontStrike(fVar2, fVar);
            setFontDoubleStrike(fVar2, fVar);
            setFontScript(fVar2, fVar);
            setHyperlinkID(fVar2, fVar);
        }
    }
}
