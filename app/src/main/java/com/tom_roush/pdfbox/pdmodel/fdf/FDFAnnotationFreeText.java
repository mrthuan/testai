package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.fontbox.ttf.HeaderTable;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import java.io.IOException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import lib.zj.office.fc.ss.util.CellUtil;
import org.w3c.dom.Element;

/* loaded from: classes2.dex */
public class FDFAnnotationFreeText extends FDFAnnotation {
    public static final String SUBTYPE = "FreeText";

    public FDFAnnotationFreeText() {
        this.annot.setName(COSName.SUBTYPE, "FreeText");
    }

    private void initCallout(Element element) {
        String attribute = element.getAttribute("callout");
        if (attribute != null && !attribute.isEmpty()) {
            String[] split = attribute.split(",");
            float[] fArr = new float[split.length];
            for (int i10 = 0; i10 < split.length; i10++) {
                fArr[i10] = Float.parseFloat(split[i10]);
            }
            setCallout(fArr);
        }
    }

    private void initFringe(Element element) {
        String attribute = element.getAttribute("fringe");
        if (attribute != null && !attribute.isEmpty()) {
            String[] split = attribute.split(",");
            if (split.length == 4) {
                PDRectangle pDRectangle = new PDRectangle();
                pDRectangle.setLowerLeftX(Float.parseFloat(split[0]));
                pDRectangle.setLowerLeftY(Float.parseFloat(split[1]));
                pDRectangle.setUpperRightX(Float.parseFloat(split[2]));
                pDRectangle.setUpperRightY(Float.parseFloat(split[3]));
                setFringe(pDRectangle);
                return;
            }
            throw new IOException("Error: wrong amount of numbers in attribute 'fringe'");
        }
    }

    public float[] getCallout() {
        COSArray cOSArray = (COSArray) this.annot.getDictionaryObject(COSName.CL);
        if (cOSArray != null) {
            return cOSArray.toFloatArray();
        }
        return null;
    }

    public String getDefaultAppearance() {
        return this.annot.getString(COSName.DA);
    }

    public String getDefaultStyle() {
        return this.annot.getString(COSName.DS);
    }

    public PDRectangle getFringe() {
        COSArray cOSArray = (COSArray) this.annot.getDictionaryObject(COSName.RD);
        if (cOSArray != null) {
            return new PDRectangle(cOSArray);
        }
        return null;
    }

    public String getJustification() {
        return "" + this.annot.getInt(COSName.Q, 0);
    }

    public String getLineEndingStyle() {
        return this.annot.getNameAsString(COSName.LE);
    }

    public String getRotation() {
        return this.annot.getString(COSName.ROTATE);
    }

    public void setCallout(float[] fArr) {
        COSArray cOSArray = new COSArray();
        cOSArray.setFloatArray(fArr);
        this.annot.setItem(COSName.CL, (COSBase) cOSArray);
    }

    public final void setDefaultAppearance(String str) {
        this.annot.setString(COSName.DA, str);
    }

    public final void setDefaultStyle(String str) {
        this.annot.setString(COSName.DS, str);
    }

    public final void setFringe(PDRectangle pDRectangle) {
        this.annot.setItem(COSName.RD, pDRectangle);
    }

    public final void setJustification(String str) {
        int i10;
        if ("centered".equals(str)) {
            i10 = 1;
        } else if ("right".equals(str)) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.annot.setInt(COSName.Q, i10);
    }

    public final void setLineEndingStyle(String str) {
        this.annot.setName(COSName.LE, str);
    }

    public final void setRotation(int i10) {
        this.annot.setInt(COSName.ROTATE, i10);
    }

    public FDFAnnotationFreeText(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public FDFAnnotationFreeText(Element element) {
        super(element);
        this.annot.setName(COSName.SUBTYPE, "FreeText");
        setJustification(element.getAttribute("justification"));
        XPath newXPath = XPathFactory.newInstance().newXPath();
        try {
            setDefaultAppearance(newXPath.evaluate("defaultappearance", element));
            setDefaultStyle(newXPath.evaluate("defaultstyle", element));
        } catch (XPathExpressionException unused) {
        }
        initCallout(element);
        String attribute = element.getAttribute(CellUtil.ROTATION);
        if (attribute != null && !attribute.isEmpty()) {
            setRotation(Integer.parseInt(attribute));
        }
        initFringe(element);
        String attribute2 = element.getAttribute(HeaderTable.TAG);
        if (attribute2 == null || attribute2.isEmpty()) {
            return;
        }
        setLineEndingStyle(attribute2);
    }
}
