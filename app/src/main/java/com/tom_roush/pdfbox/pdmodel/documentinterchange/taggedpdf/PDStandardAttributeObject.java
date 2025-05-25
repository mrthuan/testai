package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDAttributeObject;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDGamma;

/* loaded from: classes2.dex */
public abstract class PDStandardAttributeObject extends PDAttributeObject {
    protected static final float UNSPECIFIED = -1.0f;

    public PDStandardAttributeObject() {
    }

    public String[] getArrayOfString(String str) {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(str);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            String[] strArr = new String[cOSArray.size()];
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                strArr[i10] = ((COSName) cOSArray.getObject(i10)).getName();
            }
            return strArr;
        }
        return null;
    }

    public PDGamma getColor(String str) {
        COSArray cOSArray = (COSArray) getCOSObject().getDictionaryObject(str);
        if (cOSArray != null) {
            return new PDGamma(cOSArray);
        }
        return null;
    }

    public Object getColorOrFourColors(String str) {
        COSArray cOSArray = (COSArray) getCOSObject().getDictionaryObject(str);
        if (cOSArray == null) {
            return null;
        }
        if (cOSArray.size() == 3) {
            return new PDGamma(cOSArray);
        }
        if (cOSArray.size() != 4) {
            return null;
        }
        return new PDFourColours(cOSArray);
    }

    public int getInteger(String str, int i10) {
        return getCOSObject().getInt(str, i10);
    }

    public String getName(String str) {
        return getCOSObject().getNameAsString(str);
    }

    public Object getNameOrArrayOfName(String str, String str2) {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(str);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            String[] strArr = new String[cOSArray.size()];
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                COSBase object = cOSArray.getObject(i10);
                if (object instanceof COSName) {
                    strArr[i10] = ((COSName) object).getName();
                }
            }
            return strArr;
        } else if (dictionaryObject instanceof COSName) {
            return ((COSName) dictionaryObject).getName();
        } else {
            return str2;
        }
    }

    public float getNumber(String str, float f10) {
        return getCOSObject().getFloat(str, f10);
    }

    public Object getNumberOrArrayOfNumber(String str, float f10) {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(str);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            float[] fArr = new float[cOSArray.size()];
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                COSBase object = cOSArray.getObject(i10);
                if (object instanceof COSNumber) {
                    fArr[i10] = ((COSNumber) object).floatValue();
                }
            }
            return fArr;
        } else if (dictionaryObject instanceof COSNumber) {
            return Float.valueOf(((COSNumber) dictionaryObject).floatValue());
        } else {
            if (f10 == UNSPECIFIED) {
                return null;
            }
            return Float.valueOf(f10);
        }
    }

    public Object getNumberOrName(String str, String str2) {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(str);
        if (dictionaryObject instanceof COSNumber) {
            return Float.valueOf(((COSNumber) dictionaryObject).floatValue());
        }
        if (dictionaryObject instanceof COSName) {
            return ((COSName) dictionaryObject).getName();
        }
        return str2;
    }

    public String getString(String str) {
        return getCOSObject().getString(str);
    }

    public boolean isSpecified(String str) {
        if (getCOSObject().getDictionaryObject(str) != null) {
            return true;
        }
        return false;
    }

    public void setArrayOfName(String str, String[] strArr) {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(str);
        COSArray cOSArray = new COSArray();
        for (String str2 : strArr) {
            cOSArray.add((COSBase) COSName.getPDFName(str2));
        }
        getCOSObject().setItem(str, (COSBase) cOSArray);
        potentiallyNotifyChanged(dictionaryObject, getCOSObject().getDictionaryObject(str));
    }

    public void setArrayOfNumber(String str, float[] fArr) {
        COSArray cOSArray = new COSArray();
        for (float f10 : fArr) {
            cOSArray.add((COSBase) new COSFloat(f10));
        }
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(str);
        getCOSObject().setItem(str, (COSBase) cOSArray);
        potentiallyNotifyChanged(dictionaryObject, getCOSObject().getDictionaryObject(str));
    }

    public void setArrayOfString(String str, String[] strArr) {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(str);
        COSArray cOSArray = new COSArray();
        for (String str2 : strArr) {
            cOSArray.add((COSBase) new COSString(str2));
        }
        getCOSObject().setItem(str, (COSBase) cOSArray);
        potentiallyNotifyChanged(dictionaryObject, getCOSObject().getDictionaryObject(str));
    }

    public void setColor(String str, PDGamma pDGamma) {
        COSBase cOSObject;
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(str);
        getCOSObject().setItem(str, pDGamma);
        if (pDGamma == null) {
            cOSObject = null;
        } else {
            cOSObject = pDGamma.getCOSObject();
        }
        potentiallyNotifyChanged(dictionaryObject, cOSObject);
    }

    public void setFourColors(String str, PDFourColours pDFourColours) {
        COSBase cOSObject;
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(str);
        getCOSObject().setItem(str, pDFourColours);
        if (pDFourColours == null) {
            cOSObject = null;
        } else {
            cOSObject = pDFourColours.getCOSObject();
        }
        potentiallyNotifyChanged(dictionaryObject, cOSObject);
    }

    public void setInteger(String str, int i10) {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(str);
        getCOSObject().setInt(str, i10);
        potentiallyNotifyChanged(dictionaryObject, getCOSObject().getDictionaryObject(str));
    }

    public void setName(String str, String str2) {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(str);
        getCOSObject().setName(str, str2);
        potentiallyNotifyChanged(dictionaryObject, getCOSObject().getDictionaryObject(str));
    }

    public void setNumber(String str, float f10) {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(str);
        getCOSObject().setFloat(str, f10);
        potentiallyNotifyChanged(dictionaryObject, getCOSObject().getDictionaryObject(str));
    }

    public void setString(String str, String str2) {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(str);
        getCOSObject().setString(str, str2);
        potentiallyNotifyChanged(dictionaryObject, getCOSObject().getDictionaryObject(str));
    }

    public PDStandardAttributeObject(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public String getName(String str, String str2) {
        return getCOSObject().getNameAsString(str, str2);
    }

    public float getNumber(String str) {
        return getCOSObject().getFloat(str);
    }

    public void setNumber(String str, int i10) {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(str);
        getCOSObject().setInt(str, i10);
        potentiallyNotifyChanged(dictionaryObject, getCOSObject().getDictionaryObject(str));
    }
}
