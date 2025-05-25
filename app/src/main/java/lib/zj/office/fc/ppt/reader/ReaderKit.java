package lib.zj.office.fc.ppt.reader;

import a0.a;
import a6.h;
import android.graphics.Color;
import com.google.android.play.core.assetpacks.b1;
import com.tom_roush.fontbox.ttf.NamingTable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject;
import lh.g;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.ss.util.CellUtil;
import lib.zj.office.java.awt.Rectangle;
import th.b;

/* loaded from: classes3.dex */
public class ReaderKit {
    private static ReaderKit kit = new ReaderKit();

    public static ReaderKit instance() {
        return kit;
    }

    private int processColorAttribute(Element element, int i10, boolean z10) {
        String attributeValue;
        if (element.element("tint") != null) {
            if (z10) {
                double parseInt = 1.0d - (Integer.parseInt(element.element("tint").attributeValue("val")) / 100000.0d);
                i10 = Color.rgb(b1.o(parseInt, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(parseInt, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(parseInt, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            } else {
                double parseInt2 = Integer.parseInt(element.element("tint").attributeValue("val")) / 100000.0d;
                i10 = Color.rgb(b1.o(parseInt2, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(parseInt2, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(parseInt2, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            }
        } else if (element.element("lumOff") != null) {
            double parseInt3 = Integer.parseInt(element.element("lumOff").attributeValue("val")) / 100000.0d;
            i10 = Color.rgb(b1.o(parseInt3, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(parseInt3, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(parseInt3, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
        } else if (element.element("lumMod") != null) {
            double parseInt4 = (Integer.parseInt(element.element("lumMod").attributeValue("val")) / 100000.0d) - 1.0d;
            i10 = Color.rgb(b1.o(parseInt4, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(parseInt4, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(parseInt4, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
        } else if (element.element("shade") != null) {
            double d10 = (-Integer.parseInt(element.element("shade").attributeValue("val"))) / 200000.0d;
            i10 = Color.rgb(b1.o(d10, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(d10, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(d10, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
        }
        if (element.element("alpha") != null && (attributeValue = element.element("alpha").attributeValue("val")) != null) {
            return (i10 & 16777215) | (((int) ((Integer.parseInt(attributeValue) / 100000.0f) * 255.0f)) << 24);
        }
        return i10;
    }

    public float[] getAnchorFitZoom(Element element) {
        float f10;
        float f11;
        float f12;
        float f13;
        String attributeValue;
        int parseInt;
        String attributeValue2;
        int parseInt2;
        String attributeValue3;
        int parseInt3;
        String attributeValue4;
        int parseInt4;
        float[] fArr = {1.0f, 1.0f};
        if (element != null) {
            Element element2 = element.element("ext");
            if (element2 != null) {
                if (element2.attribute("cx") != null && (attributeValue4 = element2.attributeValue("cx")) != null && attributeValue4.length() > 0) {
                    if (isDecimal(attributeValue4)) {
                        parseInt4 = Integer.parseInt(attributeValue4);
                    } else {
                        parseInt4 = Integer.parseInt(attributeValue4, 16);
                    }
                    f11 = parseInt4;
                } else {
                    f11 = 0.0f;
                }
                if (element2.attributeValue("cy") != null && (attributeValue3 = element2.attributeValue("cy")) != null && attributeValue3.length() > 0) {
                    if (isDecimal(attributeValue3)) {
                        parseInt3 = Integer.parseInt(attributeValue3);
                    } else {
                        parseInt3 = Integer.parseInt(attributeValue3, 16);
                    }
                    f10 = parseInt3;
                } else {
                    f10 = 0.0f;
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            Element element3 = element.element("chExt");
            if (element3 != null) {
                if (element3.attribute("cx") != null && (attributeValue2 = element3.attributeValue("cx")) != null && attributeValue2.length() > 0) {
                    if (isDecimal(attributeValue2)) {
                        parseInt2 = Integer.parseInt(attributeValue2);
                    } else {
                        parseInt2 = Integer.parseInt(attributeValue2, 16);
                    }
                    f13 = parseInt2;
                } else {
                    f13 = 0.0f;
                }
                if (element3.attributeValue("cy") != null && (attributeValue = element3.attributeValue("cy")) != null && attributeValue.length() > 0) {
                    if (isDecimal(attributeValue)) {
                        parseInt = Integer.parseInt(attributeValue);
                    } else {
                        parseInt = Integer.parseInt(attributeValue, 16);
                    }
                    f12 = parseInt;
                } else {
                    f12 = 0.0f;
                }
            } else {
                f12 = 0.0f;
                f13 = 0.0f;
            }
            if (f13 != 0.0f && f12 != 0.0f) {
                fArr[0] = f11 / f13;
                fArr[1] = f10 / f12;
            }
        }
        return fArr;
    }

    public Rectangle getChildShapeAnchor(Element element, float f10, float f11) {
        String attributeValue;
        String attributeValue2;
        String attributeValue3;
        String attributeValue4;
        if (element != null) {
            Rectangle rectangle = new Rectangle();
            Element element2 = element.element("chOff");
            if (element2 != null) {
                if (element2.attribute("x") != null && (attributeValue4 = element2.attributeValue("x")) != null && attributeValue4.length() > 0) {
                    if (isDecimal(attributeValue4)) {
                        rectangle.f20688x = (int) a.a((float) Long.parseLong(attributeValue4), f10, 96.0f, 914400.0f);
                    } else {
                        rectangle.f20688x = (int) a.a((float) Long.parseLong(attributeValue4, 16), f10, 96.0f, 914400.0f);
                    }
                }
                if (element2.attribute(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT) != null && (attributeValue3 = element2.attributeValue(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT)) != null && attributeValue3.length() > 0) {
                    if (isDecimal(attributeValue3)) {
                        rectangle.f20689y = (int) a.a((float) Long.parseLong(attributeValue3), f11, 96.0f, 914400.0f);
                    } else {
                        rectangle.f20689y = (int) a.a((float) Long.parseLong(attributeValue3, 16), f11, 96.0f, 914400.0f);
                    }
                }
            }
            Element element3 = element.element("chExt");
            if (element3 != null) {
                if (element3.attribute("cx") != null && (attributeValue2 = element3.attributeValue("cx")) != null && attributeValue2.length() > 0) {
                    if (isDecimal(attributeValue2)) {
                        rectangle.width = (int) a.a((float) Long.parseLong(attributeValue2), f10, 96.0f, 914400.0f);
                    } else {
                        rectangle.width = (int) a.a((float) Long.parseLong(attributeValue2, 16), f10, 96.0f, 914400.0f);
                    }
                }
                if (element3.attributeValue("cy") != null && (attributeValue = element3.attributeValue("cy")) != null && attributeValue.length() > 0) {
                    if (isDecimal(attributeValue)) {
                        rectangle.height = (int) a.a((float) Long.parseLong(attributeValue), f11, 96.0f, 914400.0f);
                    } else {
                        rectangle.height = (int) a.a((float) Long.parseLong(attributeValue, 16), f11, 96.0f, 914400.0f);
                    }
                }
            }
            return rectangle;
        }
        return null;
    }

    public int getColor(b bVar, Element element) {
        return getColor(bVar, element, false);
    }

    public String getNotes(Element element) {
        Element element2;
        Element element3 = element.element("cSld");
        if (element3 != null && (element2 = element3.element("spTree")) != null) {
            for (Element element4 : element2.elements("sp")) {
                if ("body".equals(getPlaceholderType(element4))) {
                    Element element5 = element4.element("txBody");
                    String str = "";
                    if (element5 != null) {
                        for (Element element6 : element5.elements("p")) {
                            for (Element element7 : element6.elements("r")) {
                                Element element8 = element7.element("t");
                                if (element8 != null) {
                                    str = h.c(str, element8.getText());
                                }
                            }
                            str = str + '\n';
                        }
                    }
                    String trim = str.trim();
                    if (trim.length() > 0) {
                        return trim;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public int getPlaceholderIdx(Element element) {
        Element element2;
        Element element3;
        Element element4;
        if (element != null) {
            String name = element.getName();
            if (name.equals("sp")) {
                element2 = element.element("nvSpPr");
            } else if (name.equals("pic")) {
                element2 = element.element("nvPicPr");
            } else if (name.equals("graphicFrame")) {
                element2 = element.element("nvGraphicFramePr");
            } else if (name.equals("grpSp")) {
                element2 = element.element("nvGrpSpPr");
            } else {
                element2 = null;
            }
            if (element2 != null && (element3 = element2.element("nvPr")) != null && (element4 = element3.element("ph")) != null && element4.attributeValue("idx") != null) {
                return (int) Double.parseDouble(element4.attributeValue("idx"));
            }
            return -1;
        }
        return -1;
    }

    public String getPlaceholderName(Element element) {
        Element element2;
        Element element3;
        if (element != null) {
            String name = element.getName();
            if (name.equals("sp")) {
                element2 = element.element("nvSpPr");
            } else if (name.equals("pic")) {
                element2 = element.element("nvPicPr");
            } else if (name.equals("graphicFrame")) {
                element2 = element.element("nvGraphicFramePr");
            } else if (name.equals("grpSp")) {
                element2 = element.element("nvGrpSpPr");
            } else {
                element2 = null;
            }
            if (element2 != null && (element3 = element2.element("cNvPr")) != null && element3.attribute(NamingTable.TAG) != null) {
                return element3.attributeValue(NamingTable.TAG);
            }
        }
        return null;
    }

    public String getPlaceholderType(Element element) {
        Element element2;
        Element element3;
        Element element4;
        if (element != null) {
            String name = element.getName();
            if (name.equals("sp")) {
                element2 = element.element("nvSpPr");
            } else if (name.equals("pic")) {
                element2 = element.element("nvPicPr");
            } else if (name.equals("graphicFrame")) {
                element2 = element.element("nvGraphicFramePr");
            } else if (name.equals("grpSp")) {
                element2 = element.element("nvGrpSpPr");
            } else {
                element2 = null;
            }
            if (element2 != null && (element3 = element2.element("nvPr")) != null && (element4 = element3.element("ph")) != null && element4.attribute("type") != null) {
                return element4.attributeValue("type");
            }
        }
        return null;
    }

    public Rectangle getShapeAnchor(Element element, float f10, float f11) {
        String attributeValue;
        String attributeValue2;
        String attributeValue3;
        String attributeValue4;
        if (element != null) {
            Rectangle rectangle = new Rectangle();
            Element element2 = element.element(PDPrintFieldAttributeObject.CHECKED_STATE_OFF);
            if (element2 != null) {
                if (element2.attribute("x") != null && (attributeValue4 = element2.attributeValue("x")) != null && attributeValue4.length() > 0) {
                    if (isDecimal(attributeValue4)) {
                        rectangle.f20688x = (int) a.a((float) Long.parseLong(attributeValue4), f10, 96.0f, 914400.0f);
                    } else {
                        rectangle.f20688x = (int) a.a((float) Long.parseLong(attributeValue4, 16), f10, 96.0f, 914400.0f);
                    }
                }
                if (element2.attribute(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT) != null && (attributeValue3 = element2.attributeValue(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT)) != null && attributeValue3.length() > 0) {
                    if (isDecimal(attributeValue3)) {
                        rectangle.f20689y = (int) a.a((float) Long.parseLong(attributeValue3), f11, 96.0f, 914400.0f);
                    } else {
                        rectangle.f20689y = (int) a.a((float) Long.parseLong(attributeValue3, 16), f11, 96.0f, 914400.0f);
                    }
                }
            }
            Element element3 = element.element("ext");
            if (element3 != null) {
                if (element3.attribute("cx") != null && (attributeValue2 = element3.attributeValue("cx")) != null && attributeValue2.length() > 0) {
                    if (isDecimal(attributeValue2)) {
                        rectangle.width = (int) a.a((float) Long.parseLong(attributeValue2), f10, 96.0f, 914400.0f);
                    } else {
                        rectangle.width = (int) a.a((float) Long.parseLong(attributeValue2, 16), f10, 96.0f, 914400.0f);
                    }
                }
                if (element3.attributeValue("cy") != null && (attributeValue = element3.attributeValue("cy")) != null && attributeValue.length() > 0) {
                    if (isDecimal(attributeValue)) {
                        rectangle.height = (int) a.a((float) Long.parseLong(attributeValue), f11, 96.0f, 914400.0f);
                    } else {
                        rectangle.height = (int) a.a((float) Long.parseLong(attributeValue, 16), f11, 96.0f, 914400.0f);
                    }
                }
            }
            String attributeValue5 = element.attributeValue("rot");
            if (attributeValue5 != null && attributeValue5.length() > 0) {
                try {
                    float parseFloat = Float.parseFloat(attributeValue5) / 60000.0f;
                    if (Math.abs(parseFloat) > 1.0f) {
                        mi.a.k(rectangle, parseFloat);
                        return rectangle;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return rectangle;
        }
        return null;
    }

    public boolean isDecimal(String str) {
        for (int i10 = 0; i10 < 12; i10++) {
            if (str.indexOf("abcdefABCDEF".charAt(i10)) > -1) {
                return false;
            }
        }
        return true;
    }

    public boolean isHidden(Element element) {
        Element element2;
        Element element3;
        String name = element.getName();
        if (name.equals("sp")) {
            element2 = element.element("nvSpPr");
        } else if (name.equals("pic")) {
            element2 = element.element("nvPicPr");
        } else if (name.equals("graphicFrame")) {
            element2 = element.element("nvGraphicFramePr");
        } else if (name.equals("grpSp")) {
            element2 = element.element("nvGrpSpPr");
        } else {
            element2 = null;
        }
        if (element2 != null && (element3 = element2.element("cNvPr")) != null && element3.attribute(CellUtil.HIDDEN) != null && Integer.parseInt(element3.attributeValue(CellUtil.HIDDEN)) > 0) {
            return true;
        }
        return false;
    }

    public boolean isUserDrawn(Element element) {
        Element element2;
        Element element3;
        String attributeValue;
        String name = element.getName();
        if (name.equals("sp")) {
            element2 = element.element("nvSpPr");
        } else if (name.equals("pic")) {
            element2 = element.element("nvPicPr");
        } else if (name.equals("graphicFrame")) {
            element2 = element.element("nvGraphicFramePr");
        } else if (name.equals("grpSp")) {
            element2 = element.element("nvGrpSpPr");
        } else {
            element2 = null;
        }
        if (element2 != null && (element3 = element2.element("nvPr")) != null) {
            if (element3.element("ph") == null) {
                return true;
            }
            if (element3.attribute("userDrawn") != null && (attributeValue = element3.attributeValue("userDrawn")) != null && attributeValue.length() > 0 && Integer.parseInt(attributeValue) > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void processRotation(Element element, g gVar) {
        if (element != null) {
            processRotation(gVar, element.element("xfrm"));
        }
    }

    public int getColor(b bVar, Element element, boolean z10) {
        if (element != null) {
            Element element2 = element.element("srgbClr");
            if (element2 != null && element2.attribute("val") != null) {
                String attributeValue = element2.attributeValue("val");
                if (attributeValue != null && attributeValue.length() > 0) {
                    try {
                        return processColorAttribute(element2, Color.parseColor("#".concat(attributeValue)), z10);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return -16777216;
                    }
                }
            } else {
                Element element3 = element.element("scrgbClr");
                if (element3 != null) {
                    return processColorAttribute(element3, b1.X((Integer.parseInt(element3.attributeValue("r")) * FunctionEval.FunctionID.EXTERNAL_FUNC) / 100, (Integer.parseInt(element3.attributeValue(OperatorName.NON_STROKING_GRAY)) * FunctionEval.FunctionID.EXTERNAL_FUNC) / 100, (Integer.parseInt(element3.attributeValue("b")) * FunctionEval.FunctionID.EXTERNAL_FUNC) / 100), z10);
                }
                Element element4 = element.element("schemeClr");
                if (element4 != null && element4.attribute("val") != null) {
                    String attributeValue2 = element4.attributeValue("val");
                    if (attributeValue2 != null && attributeValue2.length() > 0) {
                        return processColorAttribute(element4, bVar != null ? ((Integer) bVar.f30021b.get(attributeValue2)).intValue() : -1, z10);
                    }
                } else {
                    Element element5 = element.element("sysClr");
                    if (element5 != null) {
                        String attributeValue3 = element5.attributeValue("lastClr");
                        if (attributeValue3 != null && attributeValue3.length() > 0) {
                            try {
                                return Color.parseColor("#".concat(attributeValue3));
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return -16777216;
                            }
                        }
                    } else {
                        Element element6 = element.element("prstClr");
                        if (element6 != null) {
                            String attributeValue4 = element6.attributeValue("val");
                            if (attributeValue4.contains("gray")) {
                                return -7829368;
                            }
                            if (attributeValue4.contains("white")) {
                                return -1;
                            }
                            if (attributeValue4.contains("red")) {
                                return -65536;
                            }
                            if (attributeValue4.contains("green")) {
                                return -16711936;
                            }
                            if (attributeValue4.contains("blue")) {
                                return -16776961;
                            }
                            if (attributeValue4.contains("yellow")) {
                                return -256;
                            }
                            return attributeValue4.contains("cyan") ? -16711681 : -16777216;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public void processRotation(g gVar, Element element) {
        String attributeValue;
        String attributeValue2;
        String attributeValue3;
        if (element != null) {
            if (element.attribute("flipH") != null && (attributeValue3 = element.attributeValue("flipH")) != null && attributeValue3.length() > 0 && Integer.parseInt(attributeValue3) == 1) {
                gVar.h();
            }
            if (element.attribute("flipV") != null && (attributeValue2 = element.attributeValue("flipV")) != null && attributeValue2.length() > 0 && Integer.parseInt(attributeValue2) == 1) {
                gVar.k();
            }
            if (element.attribute("rot") == null || (attributeValue = element.attributeValue("rot")) == null || attributeValue.length() <= 0) {
                return;
            }
            gVar.j(Float.parseFloat(attributeValue) / 60000.0f);
        }
    }
}
