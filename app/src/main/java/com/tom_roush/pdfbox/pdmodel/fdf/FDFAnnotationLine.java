package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.fontbox.ttf.HeaderTable;
import com.tom_roush.harmony.awt.AWTColor;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSName;
import java.io.IOException;
import org.w3c.dom.Element;

/* loaded from: classes2.dex */
public class FDFAnnotationLine extends FDFAnnotation {
    public static final String SUBTYPE = "Line";

    public FDFAnnotationLine() {
        this.annot.setName(COSName.SUBTYPE, "Line");
    }

    public boolean getCaption() {
        return this.annot.getBoolean(COSName.CAP, false);
    }

    public float getCaptionHorizontalOffset() {
        COSArray cOSArray = (COSArray) this.annot.getDictionaryObject(COSName.CO);
        if (cOSArray != null) {
            return cOSArray.toFloatArray()[0];
        }
        return 0.0f;
    }

    public String getCaptionStyle() {
        return this.annot.getString(COSName.CP);
    }

    public float getCaptionVerticalOffset() {
        COSArray cOSArray = (COSArray) this.annot.getDictionaryObject(COSName.CO);
        if (cOSArray != null) {
            return cOSArray.toFloatArray()[1];
        }
        return 0.0f;
    }

    public String getEndPointEndingStyle() {
        COSArray cOSArray = (COSArray) this.annot.getDictionaryObject(COSName.LE);
        if (cOSArray != null) {
            return cOSArray.getName(1);
        }
        return "None";
    }

    public AWTColor getInteriorColor() {
        COSArray cOSArray = (COSArray) this.annot.getDictionaryObject(COSName.IC);
        if (cOSArray != null) {
            float[] floatArray = cOSArray.toFloatArray();
            if (floatArray.length >= 3) {
                return new AWTColor(floatArray[0], floatArray[1], floatArray[2]);
            }
        }
        return null;
    }

    public float getLeaderExtend() {
        return this.annot.getFloat(COSName.LLE);
    }

    public float getLeaderLength() {
        return this.annot.getFloat(COSName.LL);
    }

    public float getLeaderOffset() {
        return this.annot.getFloat(COSName.LLO);
    }

    public float[] getLine() {
        COSArray cOSArray = (COSArray) this.annot.getDictionaryObject(COSName.L);
        if (cOSArray != null) {
            return cOSArray.toFloatArray();
        }
        return null;
    }

    public String getStartPointEndingStyle() {
        COSArray cOSArray = (COSArray) this.annot.getDictionaryObject(COSName.LE);
        if (cOSArray != null) {
            return cOSArray.getName(0);
        }
        return "None";
    }

    public void setCaption(boolean z10) {
        this.annot.setBoolean(COSName.CAP, z10);
    }

    public void setCaptionHorizontalOffset(float f10) {
        COSDictionary cOSDictionary = this.annot;
        COSName cOSName = COSName.CO;
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            COSArray cOSArray2 = new COSArray();
            cOSArray2.setFloatArray(new float[]{f10, 0.0f});
            this.annot.setItem(cOSName, (COSBase) cOSArray2);
            return;
        }
        cOSArray.set(0, (COSBase) new COSFloat(f10));
    }

    public void setCaptionStyle(String str) {
        this.annot.setString(COSName.CP, str);
    }

    public void setCaptionVerticalOffset(float f10) {
        COSDictionary cOSDictionary = this.annot;
        COSName cOSName = COSName.CO;
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            COSArray cOSArray2 = new COSArray();
            cOSArray2.setFloatArray(new float[]{0.0f, f10});
            this.annot.setItem(cOSName, (COSBase) cOSArray2);
            return;
        }
        cOSArray.set(1, (COSBase) new COSFloat(f10));
    }

    public void setEndPointEndingStyle(String str) {
        if (str == null) {
            str = "None";
        }
        COSDictionary cOSDictionary = this.annot;
        COSName cOSName = COSName.LE;
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            COSArray cOSArray2 = new COSArray();
            cOSArray2.add((COSBase) COSName.getPDFName("None"));
            cOSArray2.add((COSBase) COSName.getPDFName(str));
            this.annot.setItem(cOSName, (COSBase) cOSArray2);
            return;
        }
        cOSArray.setName(1, str);
    }

    public void setInteriorColor(AWTColor aWTColor) {
        COSArray cOSArray = null;
        if (aWTColor != null) {
            float[] rGBColorComponents = aWTColor.getRGBColorComponents(null);
            cOSArray = new COSArray();
            cOSArray.setFloatArray(rGBColorComponents);
        }
        this.annot.setItem(COSName.IC, (COSBase) cOSArray);
    }

    public void setLeaderExtend(float f10) {
        this.annot.setFloat(COSName.LLE, f10);
    }

    public void setLeaderLength(float f10) {
        this.annot.setFloat(COSName.LL, f10);
    }

    public void setLeaderOffset(float f10) {
        this.annot.setFloat(COSName.LLO, f10);
    }

    public void setLine(float[] fArr) {
        COSArray cOSArray = new COSArray();
        cOSArray.setFloatArray(fArr);
        this.annot.setItem(COSName.L, (COSBase) cOSArray);
    }

    public void setStartPointEndingStyle(String str) {
        if (str == null) {
            str = "None";
        }
        COSDictionary cOSDictionary = this.annot;
        COSName cOSName = COSName.LE;
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            COSArray cOSArray2 = new COSArray();
            cOSArray2.add((COSBase) COSName.getPDFName(str));
            cOSArray2.add((COSBase) COSName.getPDFName("None"));
            this.annot.setItem(cOSName, (COSBase) cOSArray2);
            return;
        }
        cOSArray.setName(0, str);
    }

    public FDFAnnotationLine(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public FDFAnnotationLine(Element element) {
        super(element);
        this.annot.setName(COSName.SUBTYPE, "Line");
        String attribute = element.getAttribute("start");
        if (attribute != null && !attribute.isEmpty()) {
            String attribute2 = element.getAttribute("end");
            if (attribute2 != null && !attribute2.isEmpty()) {
                String[] split = (attribute + "," + attribute2).split(",");
                if (split.length == 4) {
                    float[] fArr = new float[4];
                    for (int i10 = 0; i10 < 4; i10++) {
                        fArr[i10] = Float.parseFloat(split[i10]);
                    }
                    setLine(fArr);
                    String attribute3 = element.getAttribute("leaderLength");
                    if (attribute3 != null && !attribute3.isEmpty()) {
                        setLeaderLength(Float.parseFloat(attribute3));
                    }
                    String attribute4 = element.getAttribute("leaderExtend");
                    if (attribute4 != null && !attribute4.isEmpty()) {
                        setLeaderExtend(Float.parseFloat(attribute4));
                    }
                    String attribute5 = element.getAttribute("leaderOffset");
                    if (attribute5 != null && !attribute5.isEmpty()) {
                        setLeaderOffset(Float.parseFloat(attribute5));
                    }
                    String attribute6 = element.getAttribute(HeaderTable.TAG);
                    if (attribute6 != null && !attribute6.isEmpty()) {
                        setStartPointEndingStyle(attribute6);
                    }
                    String attribute7 = element.getAttribute("tail");
                    if (attribute7 != null && !attribute7.isEmpty()) {
                        setEndPointEndingStyle(attribute7);
                    }
                    String attribute8 = element.getAttribute("interior-color");
                    if (attribute8 != null && attribute8.length() == 7 && attribute8.charAt(0) == '#') {
                        setInteriorColor(new AWTColor(Integer.parseInt(attribute8.substring(1, 7), 16)));
                    }
                    String attribute9 = element.getAttribute("caption");
                    if (attribute9 != null && !attribute9.isEmpty()) {
                        setCaption("yes".equals(attribute9));
                    }
                    String attribute10 = element.getAttribute("caption-offset-h");
                    if (attribute10 != null && !attribute10.isEmpty()) {
                        setCaptionHorizontalOffset(Float.parseFloat(attribute10));
                    }
                    String attribute11 = element.getAttribute("caption-offset-v");
                    if (attribute11 != null && !attribute11.isEmpty()) {
                        setCaptionVerticalOffset(Float.parseFloat(attribute11));
                    }
                    String attribute12 = element.getAttribute("caption-style");
                    if (attribute12 == null || attribute12.isEmpty()) {
                        return;
                    }
                    setCaptionStyle(attribute12);
                    return;
                }
                throw new IOException("Error: wrong amount of line coordinates");
            }
            throw new IOException("Error: missing attribute 'end'");
        }
        throw new IOException("Error: missing attribute 'start'");
    }
}
