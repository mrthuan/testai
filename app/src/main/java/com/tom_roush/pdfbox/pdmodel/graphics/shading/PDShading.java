package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import android.graphics.RectF;
import b.a;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.function.PDFunction;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class PDShading implements COSObjectable {
    public static final int SHADING_TYPE1 = 1;
    public static final int SHADING_TYPE2 = 2;
    public static final int SHADING_TYPE3 = 3;
    public static final int SHADING_TYPE4 = 4;
    public static final int SHADING_TYPE5 = 5;
    public static final int SHADING_TYPE6 = 6;
    public static final int SHADING_TYPE7 = 7;
    private PDRectangle bBox;
    private COSArray background;
    private PDColorSpace colorSpace;
    private final COSDictionary dictionary;
    private PDFunction function;
    private PDFunction[] functionArray;

    public PDShading() {
        this.background = null;
        this.bBox = null;
        this.colorSpace = null;
        this.function = null;
        this.functionArray = null;
        this.dictionary = new COSDictionary();
    }

    public static PDShading create(COSDictionary cOSDictionary) {
        int i10 = cOSDictionary.getInt(COSName.SHADING_TYPE, 0);
        switch (i10) {
            case 1:
                return new PDShadingType1(cOSDictionary);
            case 2:
                return new PDShadingType2(cOSDictionary);
            case 3:
                return new PDShadingType3(cOSDictionary);
            case 4:
                return new PDShadingType4(cOSDictionary);
            case 5:
                return new PDShadingType5(cOSDictionary);
            case 6:
                return new PDShadingType6(cOSDictionary);
            case 7:
                return new PDShadingType7(cOSDictionary);
            default:
                throw new IOException(a.c("Error: Unknown shading type ", i10));
        }
    }

    private PDFunction[] getFunctionsArray() {
        if (this.functionArray == null) {
            COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.FUNCTION);
            if (dictionaryObject instanceof COSDictionary) {
                this.functionArray = r1;
                PDFunction[] pDFunctionArr = {PDFunction.create(dictionaryObject)};
            } else if (dictionaryObject instanceof COSArray) {
                COSArray cOSArray = (COSArray) dictionaryObject;
                int size = cOSArray.size();
                this.functionArray = new PDFunction[size];
                for (int i10 = 0; i10 < size; i10++) {
                    this.functionArray[i10] = PDFunction.create(cOSArray.get(i10));
                }
            } else {
                throw new IOException("mandatory /Function element must be a dictionary or an array");
            }
        }
        return this.functionArray;
    }

    public float[] evalFunction(float f10) {
        return evalFunction(new float[]{f10});
    }

    public boolean getAntiAlias() {
        return this.dictionary.getBoolean(COSName.ANTI_ALIAS, false);
    }

    public PDRectangle getBBox() {
        COSArray cOSArray;
        if (this.bBox == null && (cOSArray = (COSArray) this.dictionary.getDictionaryObject(COSName.BBOX)) != null) {
            this.bBox = new PDRectangle(cOSArray);
        }
        return this.bBox;
    }

    public COSArray getBackground() {
        if (this.background == null) {
            this.background = (COSArray) this.dictionary.getDictionaryObject(COSName.BACKGROUND);
        }
        return this.background;
    }

    public RectF getBounds(AffineTransform affineTransform, Matrix matrix) {
        return null;
    }

    public PDColorSpace getColorSpace() {
        if (this.colorSpace == null) {
            this.colorSpace = PDColorSpace.create(this.dictionary.getDictionaryObject(COSName.CS, COSName.COLORSPACE));
        }
        return this.colorSpace;
    }

    public PDFunction getFunction() {
        COSBase dictionaryObject;
        if (this.function == null && (dictionaryObject = getCOSObject().getDictionaryObject(COSName.FUNCTION)) != null) {
            this.function = PDFunction.create(dictionaryObject);
        }
        return this.function;
    }

    public abstract int getShadingType();

    public String getType() {
        return COSName.SHADING.getName();
    }

    public void setAntiAlias(boolean z10) {
        this.dictionary.setBoolean(COSName.ANTI_ALIAS, z10);
    }

    public void setBBox(PDRectangle pDRectangle) {
        this.bBox = pDRectangle;
        if (pDRectangle == null) {
            this.dictionary.removeItem(COSName.BBOX);
        } else {
            this.dictionary.setItem(COSName.BBOX, (COSBase) pDRectangle.getCOSArray());
        }
    }

    public void setBackground(COSArray cOSArray) {
        this.background = cOSArray;
        this.dictionary.setItem(COSName.BACKGROUND, (COSBase) cOSArray);
    }

    public void setColorSpace(PDColorSpace pDColorSpace) {
        this.colorSpace = pDColorSpace;
        if (pDColorSpace != null) {
            this.dictionary.setItem(COSName.COLORSPACE, pDColorSpace.getCOSObject());
        } else {
            this.dictionary.removeItem(COSName.COLORSPACE);
        }
    }

    public void setFunction(PDFunction pDFunction) {
        this.functionArray = null;
        this.function = pDFunction;
        getCOSObject().setItem(COSName.FUNCTION, pDFunction);
    }

    public void setShadingType(int i10) {
        this.dictionary.setInt(COSName.SHADING_TYPE, i10);
    }

    public float[] evalFunction(float[] fArr) {
        float[] fArr2;
        PDFunction[] functionsArray = getFunctionsArray();
        int length = functionsArray.length;
        if (length == 1) {
            fArr2 = functionsArray[0].eval(fArr);
        } else {
            float[] fArr3 = new float[length];
            for (int i10 = 0; i10 < length; i10++) {
                fArr3[i10] = functionsArray[i10].eval(fArr)[0];
            }
            fArr2 = fArr3;
        }
        for (int i11 = 0; i11 < fArr2.length; i11++) {
            float f10 = fArr2[i11];
            if (f10 < 0.0f) {
                fArr2[i11] = 0.0f;
            } else if (f10 > 1.0f) {
                fArr2[i11] = 1.0f;
            }
        }
        return fArr2;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dictionary;
    }

    public void setFunction(COSArray cOSArray) {
        this.functionArray = null;
        this.function = null;
        getCOSObject().setItem(COSName.FUNCTION, (COSBase) cOSArray);
    }

    public PDShading(COSDictionary cOSDictionary) {
        this.background = null;
        this.bBox = null;
        this.colorSpace = null;
        this.function = null;
        this.functionArray = null;
        this.dictionary = cOSDictionary;
    }
}
