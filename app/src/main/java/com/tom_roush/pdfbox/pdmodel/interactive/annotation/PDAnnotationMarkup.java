package com.tom_roush.pdfbox.pdmodel.interactive.annotation;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDCaretAppearanceHandler;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDFreeTextAppearanceHandler;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDInkAppearanceHandler;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDPolygonAppearanceHandler;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDPolylineAppearanceHandler;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDSoundAppearanceHandler;
import java.lang.reflect.Array;
import java.util.Calendar;

/* loaded from: classes2.dex */
public class PDAnnotationMarkup extends PDAnnotation {
    public static final String IT_FREE_TEXT = "FreeText";
    public static final String IT_FREE_TEXT_CALLOUT = "FreeTextCallout";
    public static final String IT_FREE_TEXT_TYPE_WRITER = "FreeTextTypeWriter";
    public static final String RT_GROUP = "Group";
    public static final String RT_REPLY = "R";
    public static final String SUB_TYPE_CARET = "Caret";
    public static final String SUB_TYPE_FREETEXT = "FreeText";
    public static final String SUB_TYPE_INK = "Ink";
    public static final String SUB_TYPE_POLYGON = "Polygon";
    public static final String SUB_TYPE_POLYLINE = "PolyLine";
    public static final String SUB_TYPE_SOUND = "Sound";
    private PDAppearanceHandler customAppearanceHandler;

    public PDAnnotationMarkup() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation
    public void constructAppearances() {
        constructAppearances(null);
    }

    public PDBorderEffectDictionary getBorderEffect() {
        COSDictionary cOSDictionary = (COSDictionary) getCOSObject().getDictionaryObject(COSName.BE);
        if (cOSDictionary != null) {
            return new PDBorderEffectDictionary(cOSDictionary);
        }
        return null;
    }

    public PDBorderStyleDictionary getBorderStyle() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.BS);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDBorderStyleDictionary((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public float[] getCallout() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.CL);
        if (dictionaryObject instanceof COSArray) {
            return ((COSArray) dictionaryObject).toFloatArray();
        }
        return null;
    }

    public float getConstantOpacity() {
        return getCOSObject().getFloat(COSName.CA, 1.0f);
    }

    public Calendar getCreationDate() {
        return getCOSObject().getDate(COSName.CREATION_DATE);
    }

    public String getDefaultAppearance() {
        return getCOSObject().getString(COSName.DA);
    }

    public String getDefaultStyleString() {
        return getCOSObject().getString(COSName.DS);
    }

    public String getEndPointEndingStyle() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.LE);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            if (cOSArray.size() >= 2) {
                return cOSArray.getName(1, "None");
            }
        }
        return "None";
    }

    public PDExternalDataDictionary getExternalData() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject("ExData");
        if (dictionaryObject instanceof COSDictionary) {
            return new PDExternalDataDictionary((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public PDAnnotation getInReplyTo() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject("IRT");
        if (dictionaryObject instanceof COSDictionary) {
            return PDAnnotation.createAnnotation(dictionaryObject);
        }
        return null;
    }

    public float[][] getInkList() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.INKLIST);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            float[][] fArr = new float[cOSArray.size()];
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                if (cOSArray.getObject(i10) instanceof COSArray) {
                    fArr[i10] = ((COSArray) cOSArray.getObject(i10)).toFloatArray();
                } else {
                    fArr[i10] = new float[0];
                }
            }
            return fArr;
        }
        return (float[][]) Array.newInstance(Float.TYPE, 0, 0);
    }

    public String getIntent() {
        return getCOSObject().getNameAsString(COSName.IT);
    }

    public PDColor getInteriorColor() {
        return getColor(COSName.IC);
    }

    public String getLineEndingStyle() {
        return getCOSObject().getNameAsString(COSName.LE, "None");
    }

    public float[][] getPath() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.PATH);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            float[][] fArr = new float[cOSArray.size()];
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                if (cOSArray.getObject(i10) instanceof COSArray) {
                    fArr[i10] = ((COSArray) cOSArray.getObject(i10)).toFloatArray();
                } else {
                    fArr[i10] = new float[0];
                }
            }
            return fArr;
        }
        return null;
    }

    public PDAnnotationPopup getPopup() {
        COSDictionary cOSDictionary = (COSDictionary) getCOSObject().getDictionaryObject(PDAnnotationPopup.SUB_TYPE);
        if (cOSDictionary != null) {
            return new PDAnnotationPopup(cOSDictionary);
        }
        return null;
    }

    public int getQ() {
        return getCOSObject().getInt(COSName.Q, 0);
    }

    public PDRectangle getRectDifference() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.RD);
        if (dictionaryObject instanceof COSArray) {
            return new PDRectangle((COSArray) dictionaryObject);
        }
        return null;
    }

    public float[] getRectDifferences() {
        COSBase item = getCOSObject().getItem(COSName.RD);
        if (item instanceof COSArray) {
            return ((COSArray) item).toFloatArray();
        }
        return new float[0];
    }

    public String getReplyType() {
        return getCOSObject().getNameAsString(StandardStructureTypes.RT, "R");
    }

    public String getRichContents() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.RC);
        if (dictionaryObject instanceof COSString) {
            return ((COSString) dictionaryObject).getString();
        }
        if (dictionaryObject instanceof COSStream) {
            return ((COSStream) dictionaryObject).toTextString();
        }
        return null;
    }

    public String getStartPointEndingStyle() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.LE);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            if (cOSArray.size() >= 2) {
                return cOSArray.getName(0, "None");
            }
        }
        return "None";
    }

    public String getSubject() {
        return getCOSObject().getString(COSName.SUBJ);
    }

    public String getTitlePopup() {
        return getCOSObject().getString(COSName.T);
    }

    public float[] getVertices() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.VERTICES);
        if (dictionaryObject instanceof COSArray) {
            return ((COSArray) dictionaryObject).toFloatArray();
        }
        return null;
    }

    public void setBorderEffect(PDBorderEffectDictionary pDBorderEffectDictionary) {
        getCOSObject().setItem(COSName.BE, pDBorderEffectDictionary);
    }

    public void setBorderStyle(PDBorderStyleDictionary pDBorderStyleDictionary) {
        getCOSObject().setItem(COSName.BS, pDBorderStyleDictionary);
    }

    public final void setCallout(float[] fArr) {
        COSArray cOSArray = new COSArray();
        cOSArray.setFloatArray(fArr);
        getCOSObject().setItem(COSName.CL, (COSBase) cOSArray);
    }

    public void setConstantOpacity(float f10) {
        getCOSObject().setFloat(COSName.CA, f10);
    }

    public void setCreationDate(Calendar calendar) {
        getCOSObject().setDate(COSName.CREATION_DATE, calendar);
    }

    public void setCustomAppearanceHandler(PDAppearanceHandler pDAppearanceHandler) {
        this.customAppearanceHandler = pDAppearanceHandler;
    }

    public void setDefaultAppearance(String str) {
        getCOSObject().setString(COSName.DA, str);
    }

    public void setDefaultStyleString(String str) {
        getCOSObject().setString(COSName.DS, str);
    }

    public void setEndPointEndingStyle(String str) {
        if (str == null) {
            str = "None";
        }
        COSDictionary cOSObject = getCOSObject();
        COSName cOSName = COSName.LE;
        COSBase dictionaryObject = cOSObject.getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            if (cOSArray.size() >= 2) {
                cOSArray.setName(1, str);
                return;
            }
        }
        COSArray cOSArray2 = new COSArray();
        cOSArray2.add((COSBase) COSName.getPDFName("None"));
        cOSArray2.add((COSBase) COSName.getPDFName(str));
        getCOSObject().setItem(cOSName, (COSBase) cOSArray2);
    }

    public void setExternalData(PDExternalDataDictionary pDExternalDataDictionary) {
        getCOSObject().setItem("ExData", pDExternalDataDictionary);
    }

    public void setInReplyTo(PDAnnotation pDAnnotation) {
        getCOSObject().setItem("IRT", pDAnnotation);
    }

    public void setInkList(float[][] fArr) {
        if (fArr == null) {
            getCOSObject().removeItem(COSName.INKLIST);
            return;
        }
        COSArray cOSArray = new COSArray();
        for (float[] fArr2 : fArr) {
            COSArray cOSArray2 = new COSArray();
            cOSArray2.setFloatArray(fArr2);
            cOSArray.add((COSBase) cOSArray2);
        }
        getCOSObject().setItem(COSName.INKLIST, (COSBase) cOSArray);
    }

    public void setIntent(String str) {
        getCOSObject().setName(COSName.IT, str);
    }

    public void setInteriorColor(PDColor pDColor) {
        getCOSObject().setItem(COSName.IC, (COSBase) pDColor.toCOSArray());
    }

    public final void setLineEndingStyle(String str) {
        getCOSObject().setName(COSName.LE, str);
    }

    public void setPopup(PDAnnotationPopup pDAnnotationPopup) {
        getCOSObject().setItem(PDAnnotationPopup.SUB_TYPE, pDAnnotationPopup);
    }

    public void setQ(int i10) {
        getCOSObject().setInt(COSName.Q, i10);
    }

    public void setRectDifference(PDRectangle pDRectangle) {
        getCOSObject().setItem(COSName.RD, pDRectangle);
    }

    public void setRectDifferences(float f10) {
        setRectDifferences(f10, f10, f10, f10);
    }

    public void setReplyType(String str) {
        getCOSObject().setName(StandardStructureTypes.RT, str);
    }

    public void setRichContents(String str) {
        getCOSObject().setItem(COSName.RC, (COSBase) new COSString(str));
    }

    public void setStartPointEndingStyle(String str) {
        if (str == null) {
            str = "None";
        }
        COSDictionary cOSObject = getCOSObject();
        COSName cOSName = COSName.LE;
        COSBase dictionaryObject = cOSObject.getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            if (cOSArray.size() != 0) {
                cOSArray.setName(0, str);
                return;
            }
        }
        COSArray cOSArray2 = new COSArray();
        cOSArray2.add((COSBase) COSName.getPDFName(str));
        cOSArray2.add((COSBase) COSName.getPDFName("None"));
        getCOSObject().setItem(cOSName, (COSBase) cOSArray2);
    }

    public void setSubject(String str) {
        getCOSObject().setString(COSName.SUBJ, str);
    }

    public void setTitlePopup(String str) {
        getCOSObject().setString(COSName.T, str);
    }

    public void setVertices(float[] fArr) {
        COSArray cOSArray = new COSArray();
        cOSArray.setFloatArray(fArr);
        getCOSObject().setItem(COSName.VERTICES, (COSBase) cOSArray);
    }

    public PDAnnotationMarkup(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation
    public void constructAppearances(PDDocument pDDocument) {
        PDAppearanceHandler pDSoundAppearanceHandler;
        PDAppearanceHandler pDAppearanceHandler = this.customAppearanceHandler;
        if (pDAppearanceHandler == null) {
            if ("Caret".equals(getSubtype())) {
                pDSoundAppearanceHandler = new PDCaretAppearanceHandler(this, pDDocument);
            } else if ("FreeText".equals(getSubtype())) {
                pDSoundAppearanceHandler = new PDFreeTextAppearanceHandler(this, pDDocument);
            } else if ("Ink".equals(getSubtype())) {
                pDSoundAppearanceHandler = new PDInkAppearanceHandler(this, pDDocument);
            } else if ("Polygon".equals(getSubtype())) {
                pDSoundAppearanceHandler = new PDPolygonAppearanceHandler(this, pDDocument);
            } else if (SUB_TYPE_POLYLINE.equals(getSubtype())) {
                pDSoundAppearanceHandler = new PDPolylineAppearanceHandler(this, pDDocument);
            } else {
                pDSoundAppearanceHandler = "Sound".equals(getSubtype()) ? new PDSoundAppearanceHandler(this, pDDocument) : null;
            }
            if (pDSoundAppearanceHandler != null) {
                pDSoundAppearanceHandler.generateAppearanceStreams();
                return;
            }
            return;
        }
        pDAppearanceHandler.generateAppearanceStreams();
    }

    public void setRectDifferences(float f10, float f11, float f12, float f13) {
        COSArray cOSArray = new COSArray();
        cOSArray.add((COSBase) new COSFloat(f10));
        cOSArray.add((COSBase) new COSFloat(f11));
        cOSArray.add((COSBase) new COSFloat(f12));
        cOSArray.add((COSBase) new COSFloat(f13));
        getCOSObject().setItem(COSName.RD, (COSBase) cOSArray);
    }
}
