package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInputStream;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.util.Vector;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class PDCIDFont implements COSObjectable, PDFontLike, PDVectorFont {
    private float averageWidth;
    private float defaultWidth;
    protected final COSDictionary dict;
    private PDFontDescriptor fontDescriptor;
    protected final PDType0Font parent;
    private Map<Integer, Float> widths;
    private final Map<Integer, Float> verticalDisplacementY = new HashMap();
    private final Map<Integer, Vector> positionVectors = new HashMap();
    private float[] dw2 = {880.0f, -1000.0f};

    public PDCIDFont(COSDictionary cOSDictionary, PDType0Font pDType0Font) {
        this.dict = cOSDictionary;
        this.parent = pDType0Font;
        readWidths();
        readVerticalDisplacements();
    }

    private Vector getDefaultPositionVector(int i10) {
        return new Vector(getWidthForCID(i10) / 2.0f, this.dw2[0]);
    }

    private float getDefaultWidth() {
        if (this.defaultWidth == 0.0f) {
            COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.DW);
            if (dictionaryObject instanceof COSNumber) {
                this.defaultWidth = ((COSNumber) dictionaryObject).floatValue();
            } else {
                this.defaultWidth = 1000.0f;
            }
        }
        return this.defaultWidth;
    }

    private float getWidthForCID(int i10) {
        Float f10 = this.widths.get(Integer.valueOf(i10));
        if (f10 == null) {
            f10 = Float.valueOf(getDefaultWidth());
        }
        return f10.floatValue();
    }

    private void readVerticalDisplacements() {
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.DW2);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            COSBase object = cOSArray.getObject(0);
            COSBase object2 = cOSArray.getObject(1);
            if ((object instanceof COSNumber) && (object2 instanceof COSNumber)) {
                this.dw2[0] = ((COSNumber) object).floatValue();
                this.dw2[1] = ((COSNumber) object2).floatValue();
            }
        }
        COSBase dictionaryObject2 = this.dict.getDictionaryObject(COSName.W2);
        if (dictionaryObject2 instanceof COSArray) {
            COSArray cOSArray2 = (COSArray) dictionaryObject2;
            int i10 = 0;
            while (i10 < cOSArray2.size()) {
                COSNumber cOSNumber = (COSNumber) cOSArray2.getObject(i10);
                int i11 = i10 + 1;
                COSBase object3 = cOSArray2.getObject(i11);
                if (object3 instanceof COSArray) {
                    COSArray cOSArray3 = (COSArray) object3;
                    int i12 = 0;
                    while (i12 < cOSArray3.size()) {
                        int intValue = (i12 / 3) + cOSNumber.intValue();
                        int i13 = i12 + 1;
                        int i14 = i13 + 1;
                        this.verticalDisplacementY.put(Integer.valueOf(intValue), Float.valueOf(((COSNumber) cOSArray3.getObject(i12)).floatValue()));
                        this.positionVectors.put(Integer.valueOf(intValue), new Vector(((COSNumber) cOSArray3.getObject(i13)).floatValue(), ((COSNumber) cOSArray3.getObject(i14)).floatValue()));
                        i12 = i14 + 1;
                    }
                } else {
                    int intValue2 = ((COSNumber) object3).intValue();
                    int i15 = i11 + 1;
                    COSNumber cOSNumber2 = (COSNumber) cOSArray2.getObject(i15);
                    int i16 = i15 + 1;
                    COSNumber cOSNumber3 = (COSNumber) cOSArray2.getObject(i16);
                    i11 = i16 + 1;
                    COSNumber cOSNumber4 = (COSNumber) cOSArray2.getObject(i11);
                    for (int intValue3 = cOSNumber.intValue(); intValue3 <= intValue2; intValue3++) {
                        this.verticalDisplacementY.put(Integer.valueOf(intValue3), Float.valueOf(cOSNumber2.floatValue()));
                        this.positionVectors.put(Integer.valueOf(intValue3), new Vector(cOSNumber3.floatValue(), cOSNumber4.floatValue()));
                    }
                }
                i10 = i11 + 1;
            }
        }
    }

    private void readWidths() {
        this.widths = new HashMap();
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.W);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            int size = cOSArray.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                COSBase object = cOSArray.getObject(i10);
                if (!(object instanceof COSNumber)) {
                    Objects.toString(object);
                    i10 = i11;
                } else {
                    COSNumber cOSNumber = (COSNumber) object;
                    int i12 = i11 + 1;
                    COSBase object2 = cOSArray.getObject(i11);
                    if (object2 instanceof COSArray) {
                        COSArray cOSArray2 = (COSArray) object2;
                        int intValue = cOSNumber.intValue();
                        int size2 = cOSArray2.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            COSBase object3 = cOSArray2.getObject(i13);
                            if (object3 instanceof COSNumber) {
                                this.widths.put(Integer.valueOf(intValue + i13), Float.valueOf(((COSNumber) object3).floatValue()));
                            } else {
                                Objects.toString(object3);
                            }
                        }
                        i10 = i12;
                    } else {
                        int i14 = i12 + 1;
                        COSBase object4 = cOSArray.getObject(i12);
                        if ((object2 instanceof COSNumber) && (object4 instanceof COSNumber)) {
                            int intValue2 = ((COSNumber) object2).intValue();
                            float floatValue = ((COSNumber) object4).floatValue();
                            for (int intValue3 = cOSNumber.intValue(); intValue3 <= intValue2; intValue3++) {
                                this.widths.put(Integer.valueOf(intValue3), Float.valueOf(floatValue));
                            }
                        } else {
                            Objects.toString(object2);
                            Objects.toString(object4);
                        }
                        i10 = i14;
                    }
                }
            }
        }
    }

    public abstract int codeToCID(int i10);

    public abstract int codeToGID(int i10);

    public abstract byte[] encode(int i10);

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getAverageFontWidth() {
        float f10;
        if (this.averageWidth == 0.0f) {
            Map<Integer, Float> map = this.widths;
            int i10 = 0;
            if (map != null) {
                f10 = 0.0f;
                for (Float f11 : map.values()) {
                    if (f11.floatValue() > 0.0f) {
                        f10 += f11.floatValue();
                        i10++;
                    }
                }
            } else {
                f10 = 0.0f;
            }
            if (i10 != 0) {
                this.averageWidth = f10 / i10;
            }
            float f12 = this.averageWidth;
            if (f12 <= 0.0f || Float.isNaN(f12)) {
                this.averageWidth = getDefaultWidth();
            }
        }
        return this.averageWidth;
    }

    public String getBaseFont() {
        return this.dict.getNameAsString(COSName.BASE_FONT);
    }

    public PDCIDSystemInfo getCIDSystemInfo() {
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.CIDSYSTEMINFO);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDCIDSystemInfo((COSDictionary) dictionaryObject);
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public PDFontDescriptor getFontDescriptor() {
        COSDictionary cOSDictionary;
        if (this.fontDescriptor == null && (cOSDictionary = (COSDictionary) this.dict.getDictionaryObject(COSName.FONT_DESC)) != null) {
            this.fontDescriptor = new PDFontDescriptor(cOSDictionary);
        }
        return this.fontDescriptor;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public String getName() {
        return getBaseFont();
    }

    public final PDType0Font getParent() {
        return this.parent;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public Vector getPositionVector(int i10) {
        int codeToCID = codeToCID(i10);
        Vector vector = this.positionVectors.get(Integer.valueOf(codeToCID));
        if (vector == null) {
            return getDefaultPositionVector(codeToCID);
        }
        return vector;
    }

    public float getVerticalDisplacementVectorY(int i10) {
        Float f10 = this.verticalDisplacementY.get(Integer.valueOf(codeToCID(i10)));
        if (f10 == null) {
            f10 = Float.valueOf(this.dw2[1]);
        }
        return f10.floatValue();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidth(int i10) {
        return getWidthForCID(codeToCID(i10));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean hasExplicitWidth(int i10) {
        if (this.widths.get(Integer.valueOf(codeToCID(i10))) != null) {
            return true;
        }
        return false;
    }

    public final int[] readCIDToGIDMap() {
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.CID_TO_GID_MAP);
        if (dictionaryObject instanceof COSStream) {
            COSInputStream createInputStream = ((COSStream) dictionaryObject).createInputStream();
            byte[] byteArray = IOUtils.toByteArray(createInputStream);
            IOUtils.closeQuietly(createInputStream);
            int length = byteArray.length / 2;
            int[] iArr = new int[length];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                iArr[i11] = ((byteArray[i10] & 255) << 8) | (byteArray[i10 + 1] & 255);
                i10 += 2;
            }
            return iArr;
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dict;
    }
}
