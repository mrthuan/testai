package com.tom_roush.pdfbox.pdmodel.fdf;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.fontbox.ttf.NamingTable;
import com.tom_roush.harmony.awt.AWTColor;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderEffectDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import com.tom_roush.pdfbox.util.DateConverter;
import java.io.IOException;
import java.util.Calendar;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import lib.zj.office.fc.ss.util.CellUtil;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/* loaded from: classes2.dex */
public abstract class FDFAnnotation implements COSObjectable {
    private static final int FLAG_HIDDEN = 2;
    private static final int FLAG_INVISIBLE = 1;
    private static final int FLAG_LOCKED = 128;
    private static final int FLAG_LOCKED_CONTENTS = 512;
    private static final int FLAG_NO_ROTATE = 16;
    private static final int FLAG_NO_VIEW = 32;
    private static final int FLAG_NO_ZOOM = 8;
    private static final int FLAG_PRINTED = 4;
    private static final int FLAG_READ_ONLY = 64;
    private static final int FLAG_TOGGLE_NO_VIEW = 256;
    protected COSDictionary annot;

    public FDFAnnotation() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.annot = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.ANNOT);
    }

    public static FDFAnnotation create(COSDictionary cOSDictionary) {
        if (cOSDictionary != null) {
            String nameAsString = cOSDictionary.getNameAsString(COSName.SUBTYPE);
            if ("Text".equals(nameAsString)) {
                return new FDFAnnotationText(cOSDictionary);
            }
            if ("Caret".equals(nameAsString)) {
                return new FDFAnnotationCaret(cOSDictionary);
            }
            if ("FreeText".equals(nameAsString)) {
                return new FDFAnnotationFreeText(cOSDictionary);
            }
            if ("FileAttachment".equals(nameAsString)) {
                return new FDFAnnotationFileAttachment(cOSDictionary);
            }
            if ("Highlight".equals(nameAsString)) {
                return new FDFAnnotationHighlight(cOSDictionary);
            }
            if ("Ink".equals(nameAsString)) {
                return new FDFAnnotationInk(cOSDictionary);
            }
            if ("Line".equals(nameAsString)) {
                return new FDFAnnotationLine(cOSDictionary);
            }
            if ("Link".equals(nameAsString)) {
                return new FDFAnnotationLink(cOSDictionary);
            }
            if ("Circle".equals(nameAsString)) {
                return new FDFAnnotationCircle(cOSDictionary);
            }
            if ("Square".equals(nameAsString)) {
                return new FDFAnnotationSquare(cOSDictionary);
            }
            if ("Polygon".equals(nameAsString)) {
                return new FDFAnnotationPolygon(cOSDictionary);
            }
            if (FDFAnnotationPolyline.SUBTYPE.equals(nameAsString)) {
                return new FDFAnnotationPolyline(cOSDictionary);
            }
            if ("Sound".equals(nameAsString)) {
                return new FDFAnnotationSound(cOSDictionary);
            }
            if ("Squiggly".equals(nameAsString)) {
                return new FDFAnnotationSquiggly(cOSDictionary);
            }
            if ("Stamp".equals(nameAsString)) {
                return new FDFAnnotationStamp(cOSDictionary);
            }
            if ("StrikeOut".equals(nameAsString)) {
                return new FDFAnnotationStrikeOut(cOSDictionary);
            }
            if ("Underline".equals(nameAsString)) {
                return new FDFAnnotationUnderline(cOSDictionary);
            }
        }
        return null;
    }

    private String richContentsToString(Node node, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node item = childNodes.item(i10);
            if (item instanceof Element) {
                sb2.append(richContentsToString(item, false));
            } else if (item instanceof CDATASection) {
                sb2.append("<![CDATA[");
                sb2.append(((CDATASection) item).getData());
                sb2.append("]]>");
            } else if (item instanceof Text) {
                String data = ((Text) item).getData();
                if (data != null) {
                    data = data.replace("&", "&amp;").replace("<", "&lt;");
                }
                sb2.append(data);
            }
        }
        if (z10) {
            return sb2.toString();
        }
        NamedNodeMap attributes = node.getAttributes();
        StringBuilder sb3 = new StringBuilder();
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            Node item2 = attributes.item(i11);
            String nodeValue = item2.getNodeValue();
            if (nodeValue != null) {
                nodeValue = nodeValue.replace(OperatorName.SHOW_TEXT_LINE_AND_SPACE, "&quot;");
            }
            sb3.append(String.format(" %s=\"%s\"", item2.getNodeName(), nodeValue));
        }
        return String.format("<%s%s>%s</%s>", node.getNodeName(), sb3.toString(), sb2.toString(), node.getNodeName());
    }

    public PDBorderEffectDictionary getBorderEffect() {
        COSDictionary cOSDictionary = (COSDictionary) this.annot.getDictionaryObject(COSName.BE);
        if (cOSDictionary != null) {
            return new PDBorderEffectDictionary(cOSDictionary);
        }
        return null;
    }

    public PDBorderStyleDictionary getBorderStyle() {
        COSDictionary cOSDictionary = (COSDictionary) this.annot.getDictionaryObject(COSName.BS);
        if (cOSDictionary != null) {
            return new PDBorderStyleDictionary(cOSDictionary);
        }
        return null;
    }

    public AWTColor getColor() {
        COSArray cOSArray = (COSArray) this.annot.getDictionaryObject(COSName.C);
        if (cOSArray != null) {
            float[] floatArray = cOSArray.toFloatArray();
            if (floatArray.length >= 3) {
                return new AWTColor(floatArray[0], floatArray[1], floatArray[2]);
            }
        }
        return null;
    }

    public String getContents() {
        return this.annot.getString(COSName.CONTENTS);
    }

    public Calendar getCreationDate() {
        return this.annot.getDate(COSName.CREATION_DATE);
    }

    public String getDate() {
        return this.annot.getString(COSName.M);
    }

    public String getIntent() {
        return this.annot.getNameAsString(COSName.IT);
    }

    public String getName() {
        return this.annot.getString(COSName.NM);
    }

    public float getOpacity() {
        return this.annot.getFloat(COSName.CA, 1.0f);
    }

    public Integer getPage() {
        COSNumber cOSNumber = (COSNumber) this.annot.getDictionaryObject(COSName.PAGE);
        if (cOSNumber != null) {
            return Integer.valueOf(cOSNumber.intValue());
        }
        return null;
    }

    public PDRectangle getRectangle() {
        COSArray cOSArray = (COSArray) this.annot.getDictionaryObject(COSName.RECT);
        if (cOSArray != null) {
            return new PDRectangle(cOSArray);
        }
        return null;
    }

    public String getRichContents() {
        return getStringOrStream(this.annot.getDictionaryObject(COSName.RC));
    }

    public final String getStringOrStream(COSBase cOSBase) {
        if (cOSBase == null) {
            return "";
        }
        if (cOSBase instanceof COSString) {
            return ((COSString) cOSBase).getString();
        }
        if (!(cOSBase instanceof COSStream)) {
            return "";
        }
        return ((COSStream) cOSBase).toTextString();
    }

    public String getSubject() {
        return this.annot.getString(COSName.SUBJ);
    }

    public String getTitle() {
        return this.annot.getString(COSName.T);
    }

    public boolean isHidden() {
        return this.annot.getFlag(COSName.F, 2);
    }

    public boolean isInvisible() {
        return this.annot.getFlag(COSName.F, 1);
    }

    public boolean isLocked() {
        return this.annot.getFlag(COSName.F, 128);
    }

    public boolean isLockedContents() {
        return this.annot.getFlag(COSName.F, 512);
    }

    public boolean isNoRotate() {
        return this.annot.getFlag(COSName.F, 16);
    }

    public boolean isNoView() {
        return this.annot.getFlag(COSName.F, 32);
    }

    public boolean isNoZoom() {
        return this.annot.getFlag(COSName.F, 8);
    }

    public boolean isPrinted() {
        return this.annot.getFlag(COSName.F, 4);
    }

    public boolean isReadOnly() {
        return this.annot.getFlag(COSName.F, 64);
    }

    public boolean isToggleNoView() {
        return this.annot.getFlag(COSName.F, 256);
    }

    public final void setBorderEffect(PDBorderEffectDictionary pDBorderEffectDictionary) {
        this.annot.setItem(COSName.BE, pDBorderEffectDictionary);
    }

    public final void setBorderStyle(PDBorderStyleDictionary pDBorderStyleDictionary) {
        this.annot.setItem(COSName.BS, pDBorderStyleDictionary);
    }

    public final void setColor(AWTColor aWTColor) {
        COSArray cOSArray = null;
        if (aWTColor != null) {
            float[] rGBColorComponents = aWTColor.getRGBColorComponents(null);
            cOSArray = new COSArray();
            cOSArray.setFloatArray(rGBColorComponents);
        }
        this.annot.setItem(COSName.C, (COSBase) cOSArray);
    }

    public final void setContents(String str) {
        this.annot.setString(COSName.CONTENTS, str);
    }

    public final void setCreationDate(Calendar calendar) {
        this.annot.setDate(COSName.CREATION_DATE, calendar);
    }

    public final void setDate(String str) {
        this.annot.setString(COSName.M, str);
    }

    public final void setHidden(boolean z10) {
        this.annot.setFlag(COSName.F, 2, z10);
    }

    public final void setIntent(String str) {
        this.annot.setName(COSName.IT, str);
    }

    public final void setInvisible(boolean z10) {
        this.annot.setFlag(COSName.F, 1, z10);
    }

    public final void setLocked(boolean z10) {
        this.annot.setFlag(COSName.F, 128, z10);
    }

    public void setLockedContents(boolean z10) {
        this.annot.setFlag(COSName.F, 512, z10);
    }

    public final void setName(String str) {
        this.annot.setString(COSName.NM, str);
    }

    public final void setNoRotate(boolean z10) {
        this.annot.setFlag(COSName.F, 16, z10);
    }

    public final void setNoView(boolean z10) {
        this.annot.setFlag(COSName.F, 32, z10);
    }

    public final void setNoZoom(boolean z10) {
        this.annot.setFlag(COSName.F, 8, z10);
    }

    public final void setOpacity(float f10) {
        this.annot.setFloat(COSName.CA, f10);
    }

    public final void setPage(int i10) {
        this.annot.setInt(COSName.PAGE, i10);
    }

    public final void setPrinted(boolean z10) {
        this.annot.setFlag(COSName.F, 4, z10);
    }

    public final void setReadOnly(boolean z10) {
        this.annot.setFlag(COSName.F, 64, z10);
    }

    public final void setRectangle(PDRectangle pDRectangle) {
        this.annot.setItem(COSName.RECT, pDRectangle);
    }

    public final void setRichContents(String str) {
        this.annot.setItem(COSName.RC, (COSBase) new COSString(str));
    }

    public final void setSubject(String str) {
        this.annot.setString(COSName.SUBJ, str);
    }

    public final void setTitle(String str) {
        this.annot.setString(COSName.T, str);
    }

    public final void setToggleNoView(boolean z10) {
        this.annot.setFlag(COSName.F, 256, z10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.annot;
    }

    public FDFAnnotation(COSDictionary cOSDictionary) {
        this.annot = cOSDictionary;
    }

    public FDFAnnotation(Element element) {
        this();
        String[] split;
        String attribute = element.getAttribute("page");
        if (attribute != null && !attribute.isEmpty()) {
            setPage(Integer.parseInt(attribute));
            String attribute2 = element.getAttribute("color");
            if (attribute2 != null && attribute2.length() == 7 && attribute2.charAt(0) == '#') {
                setColor(new AWTColor(Integer.parseInt(attribute2.substring(1, 7), 16)));
            }
            setDate(element.getAttribute("date"));
            String attribute3 = element.getAttribute("flags");
            if (attribute3 != null) {
                for (String str : attribute3.split(",")) {
                    if (str.equals("invisible")) {
                        setInvisible(true);
                    } else if (str.equals(CellUtil.HIDDEN)) {
                        setHidden(true);
                    } else if (str.equals(PDWindowsLaunchParams.OPERATION_PRINT)) {
                        setPrinted(true);
                    } else if (str.equals("nozoom")) {
                        setNoZoom(true);
                    } else if (str.equals("norotate")) {
                        setNoRotate(true);
                    } else if (str.equals("noview")) {
                        setNoView(true);
                    } else if (str.equals("readonly")) {
                        setReadOnly(true);
                    } else if (str.equals(CellUtil.LOCKED)) {
                        setLocked(true);
                    } else if (str.equals("togglenoview")) {
                        setToggleNoView(true);
                    }
                }
            }
            setName(element.getAttribute(NamingTable.TAG));
            String attribute4 = element.getAttribute("rect");
            if (attribute4 != null) {
                String[] split2 = attribute4.split(",");
                if (split2.length == 4) {
                    float[] fArr = new float[4];
                    for (int i10 = 0; i10 < 4; i10++) {
                        fArr[i10] = Float.parseFloat(split2[i10]);
                    }
                    COSArray cOSArray = new COSArray();
                    cOSArray.setFloatArray(fArr);
                    setRectangle(new PDRectangle(cOSArray));
                    setTitle(element.getAttribute(InMobiNetworkValues.TITLE));
                    setCreationDate(DateConverter.toCalendar(element.getAttribute("creationdate")));
                    String attribute5 = element.getAttribute("opacity");
                    if (attribute5 != null && !attribute5.isEmpty()) {
                        setOpacity(Float.parseFloat(attribute5));
                    }
                    setSubject(element.getAttribute("subject"));
                    String attribute6 = element.getAttribute("intent");
                    setIntent(attribute6.isEmpty() ? element.getAttribute("IT") : attribute6);
                    XPath newXPath = XPathFactory.newInstance().newXPath();
                    try {
                        setContents(newXPath.evaluate("contents[1]", element));
                    } catch (XPathExpressionException unused) {
                    }
                    try {
                        Node node = (Node) newXPath.evaluate("contents-richtext[1]", element, XPathConstants.NODE);
                        if (node != null) {
                            setRichContents(richContentsToString(node, true));
                            setContents(node.getTextContent().trim());
                        }
                    } catch (XPathExpressionException unused2) {
                    }
                    PDBorderStyleDictionary pDBorderStyleDictionary = new PDBorderStyleDictionary();
                    String attribute7 = element.getAttribute(InMobiNetworkValues.WIDTH);
                    if (attribute7 != null && !attribute7.isEmpty()) {
                        pDBorderStyleDictionary.setWidth(Float.parseFloat(attribute7));
                    }
                    if (pDBorderStyleDictionary.getWidth() > 0.0f) {
                        String attribute8 = element.getAttribute("style");
                        if (attribute8 != null && !attribute8.isEmpty()) {
                            if (attribute8.equals("dash")) {
                                pDBorderStyleDictionary.setStyle("D");
                            } else if (attribute8.equals("bevelled")) {
                                pDBorderStyleDictionary.setStyle("B");
                            } else if (attribute8.equals("inset")) {
                                pDBorderStyleDictionary.setStyle("I");
                            } else if (attribute8.equals("underline")) {
                                pDBorderStyleDictionary.setStyle(PDBorderStyleDictionary.STYLE_UNDERLINE);
                            } else if (attribute8.equals("cloudy")) {
                                pDBorderStyleDictionary.setStyle("S");
                                PDBorderEffectDictionary pDBorderEffectDictionary = new PDBorderEffectDictionary();
                                pDBorderEffectDictionary.setStyle("C");
                                String attribute9 = element.getAttribute("intensity");
                                if (attribute9 != null && !attribute9.isEmpty()) {
                                    pDBorderEffectDictionary.setIntensity(Float.parseFloat(element.getAttribute("intensity")));
                                }
                                setBorderEffect(pDBorderEffectDictionary);
                            } else {
                                pDBorderStyleDictionary.setStyle("S");
                            }
                        }
                        String attribute10 = element.getAttribute("dashes");
                        if (attribute10 != null && !attribute10.isEmpty()) {
                            String[] split3 = attribute10.split(",");
                            COSArray cOSArray2 = new COSArray();
                            for (String str2 : split3) {
                                cOSArray2.add((COSBase) COSNumber.get(str2));
                            }
                            pDBorderStyleDictionary.setDashStyle(cOSArray2);
                        }
                        setBorderStyle(pDBorderStyleDictionary);
                        return;
                    }
                    return;
                }
                throw new IOException("Error: wrong amount of numbers in attribute 'rect'");
            }
            throw new IOException("Error: missing attribute 'rect'");
        }
        throw new IOException("Error: missing required attribute 'page'");
    }
}
