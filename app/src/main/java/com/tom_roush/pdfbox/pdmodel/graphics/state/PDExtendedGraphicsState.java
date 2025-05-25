package com.tom_roush.pdfbox.pdmodel.graphics.state;

import android.graphics.Paint;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.graphics.PDFontSetting;
import com.tom_roush.pdfbox.pdmodel.graphics.PDLineDashPattern;
import com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode;

/* loaded from: classes2.dex */
public class PDExtendedGraphicsState implements COSObjectable {
    private final COSDictionary dict;

    public PDExtendedGraphicsState() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.dict = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.EXT_G_STATE);
    }

    private float defaultIfNull(Float f10, float f11) {
        if (f10 != null) {
            return f10.floatValue();
        }
        return f11;
    }

    private Float getFloatItem(COSName cOSName) {
        COSBase dictionaryObject = this.dict.getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSNumber) {
            return Float.valueOf(((COSNumber) dictionaryObject).floatValue());
        }
        return null;
    }

    private void setFloatItem(COSName cOSName, Float f10) {
        if (f10 == null) {
            this.dict.removeItem(cOSName);
        } else {
            this.dict.setItem(cOSName, (COSBase) new COSFloat(f10.floatValue()));
        }
    }

    public void copyIntoGraphicsState(PDGraphicsState pDGraphicsState) {
        for (COSName cOSName : this.dict.keySet()) {
            if (cOSName.equals(COSName.LW)) {
                pDGraphicsState.setLineWidth(defaultIfNull(getLineWidth(), 1.0f));
            } else if (cOSName.equals(COSName.LC)) {
                pDGraphicsState.setLineCap(getLineCapStyle());
            } else if (cOSName.equals(COSName.LJ)) {
                pDGraphicsState.setLineJoin(getLineJoinStyle());
            } else if (cOSName.equals(COSName.ML)) {
                pDGraphicsState.setMiterLimit(defaultIfNull(getMiterLimit(), 10.0f));
            } else if (cOSName.equals(COSName.D)) {
                pDGraphicsState.setLineDashPattern(getLineDashPattern());
            } else if (cOSName.equals(COSName.RI)) {
                pDGraphicsState.setRenderingIntent(getRenderingIntent());
            } else if (cOSName.equals(COSName.OPM)) {
                pDGraphicsState.setOverprintMode(defaultIfNull(getOverprintMode(), 0.0f));
            } else if (cOSName.equals(COSName.OP)) {
                pDGraphicsState.setOverprint(getStrokingOverprintControl());
            } else if (cOSName.equals(COSName.OP_NS)) {
                pDGraphicsState.setNonStrokingOverprint(getNonStrokingOverprintControl());
            } else if (cOSName.equals(COSName.FONT)) {
                PDFontSetting fontSetting = getFontSetting();
                if (fontSetting != null) {
                    pDGraphicsState.getTextState().setFont(fontSetting.getFont());
                    pDGraphicsState.getTextState().setFontSize(fontSetting.getFontSize());
                }
            } else if (cOSName.equals(COSName.FL)) {
                pDGraphicsState.setFlatness(defaultIfNull(getFlatnessTolerance(), 1.0f));
            } else if (cOSName.equals(COSName.SM)) {
                pDGraphicsState.setSmoothness(defaultIfNull(getSmoothnessTolerance(), 0.0f));
            } else if (cOSName.equals(COSName.SA)) {
                pDGraphicsState.setStrokeAdjustment(getAutomaticStrokeAdjustment());
            } else if (cOSName.equals(COSName.CA)) {
                pDGraphicsState.setAlphaConstant(defaultIfNull(getStrokingAlphaConstant(), 1.0f));
            } else if (cOSName.equals(COSName.CA_NS)) {
                pDGraphicsState.setNonStrokeAlphaConstant(defaultIfNull(getNonStrokingAlphaConstant(), 1.0f));
            } else if (cOSName.equals(COSName.AIS)) {
                pDGraphicsState.setAlphaSource(getAlphaSourceFlag());
            } else if (cOSName.equals(COSName.TK)) {
                pDGraphicsState.getTextState().setKnockoutFlag(getTextKnockoutFlag());
            } else if (cOSName.equals(COSName.SMASK)) {
                PDSoftMask softMask = getSoftMask();
                if (softMask != null) {
                    softMask.setInitialTransformationMatrix(pDGraphicsState.getCurrentTransformationMatrix().m11clone());
                }
                pDGraphicsState.setSoftMask(softMask);
            } else if (cOSName.equals(COSName.BM)) {
                pDGraphicsState.setBlendMode(getBlendMode());
            } else if (cOSName.equals(COSName.TR)) {
                if (!this.dict.containsKey(COSName.TR2)) {
                    pDGraphicsState.setTransfer(getTransfer());
                }
            } else if (cOSName.equals(COSName.TR2)) {
                pDGraphicsState.setTransfer(getTransfer2());
            }
        }
    }

    public boolean getAlphaSourceFlag() {
        return this.dict.getBoolean(COSName.AIS, false);
    }

    public boolean getAutomaticStrokeAdjustment() {
        return this.dict.getBoolean(COSName.SA, false);
    }

    public BlendMode getBlendMode() {
        return BlendMode.getInstance(this.dict.getDictionaryObject(COSName.BM));
    }

    public Float getFlatnessTolerance() {
        return getFloatItem(COSName.FL);
    }

    public PDFontSetting getFontSetting() {
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.FONT);
        if (dictionaryObject instanceof COSArray) {
            return new PDFontSetting((COSArray) dictionaryObject);
        }
        return null;
    }

    public Paint.Cap getLineCapStyle() {
        int i10 = this.dict.getInt(COSName.LC);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
        return Paint.Cap.BUTT;
    }

    public PDLineDashPattern getLineDashPattern() {
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.D);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            if (cOSArray.size() == 2) {
                COSBase object = cOSArray.getObject(0);
                COSBase object2 = cOSArray.getObject(1);
                if ((object instanceof COSArray) && (object2 instanceof COSNumber)) {
                    return new PDLineDashPattern((COSArray) object, ((COSNumber) object2).intValue());
                }
            }
        }
        return null;
    }

    public Paint.Join getLineJoinStyle() {
        int i10 = this.dict.getInt(COSName.LJ);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }
        return Paint.Join.MITER;
    }

    public Float getLineWidth() {
        return getFloatItem(COSName.LW);
    }

    public Float getMiterLimit() {
        return getFloatItem(COSName.ML);
    }

    public Float getNonStrokingAlphaConstant() {
        return getFloatItem(COSName.CA_NS);
    }

    public boolean getNonStrokingOverprintControl() {
        return this.dict.getBoolean(COSName.OP_NS, getStrokingOverprintControl());
    }

    public Float getOverprintMode() {
        return getFloatItem(COSName.OPM);
    }

    public RenderingIntent getRenderingIntent() {
        String nameAsString = this.dict.getNameAsString("RI");
        if (nameAsString != null) {
            return RenderingIntent.fromString(nameAsString);
        }
        return null;
    }

    public Float getSmoothnessTolerance() {
        return getFloatItem(COSName.SM);
    }

    public PDSoftMask getSoftMask() {
        COSDictionary cOSDictionary = this.dict;
        COSName cOSName = COSName.SMASK;
        if (!cOSDictionary.containsKey(cOSName)) {
            return null;
        }
        return PDSoftMask.create(this.dict.getDictionaryObject(cOSName));
    }

    public Float getStrokingAlphaConstant() {
        return getFloatItem(COSName.CA);
    }

    public boolean getStrokingOverprintControl() {
        return this.dict.getBoolean(COSName.OP, false);
    }

    public boolean getTextKnockoutFlag() {
        return this.dict.getBoolean(COSName.TK, true);
    }

    public COSBase getTransfer() {
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.TR);
        if ((dictionaryObject instanceof COSArray) && ((COSArray) dictionaryObject).size() != 4) {
            return null;
        }
        return dictionaryObject;
    }

    public COSBase getTransfer2() {
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.TR2);
        if ((dictionaryObject instanceof COSArray) && ((COSArray) dictionaryObject).size() != 4) {
            return null;
        }
        return dictionaryObject;
    }

    public void setAlphaSourceFlag(boolean z10) {
        this.dict.setBoolean(COSName.AIS, z10);
    }

    public void setAutomaticStrokeAdjustment(boolean z10) {
        this.dict.setBoolean(COSName.SA, z10);
    }

    public void setBlendMode(BlendMode blendMode) {
        this.dict.setItem(COSName.BM, (COSBase) BlendMode.getCOSName(blendMode));
    }

    public void setFlatnessTolerance(Float f10) {
        setFloatItem(COSName.FL, f10);
    }

    public void setFontSetting(PDFontSetting pDFontSetting) {
        this.dict.setItem(COSName.FONT, pDFontSetting);
    }

    public void setLineCapStyle(int i10) {
        this.dict.setInt(COSName.LC, i10);
    }

    public void setLineDashPattern(PDLineDashPattern pDLineDashPattern) {
        this.dict.setItem(COSName.D, pDLineDashPattern.getCOSObject());
    }

    public void setLineJoinStyle(int i10) {
        this.dict.setInt(COSName.LJ, i10);
    }

    public void setLineWidth(Float f10) {
        setFloatItem(COSName.LW, f10);
    }

    public void setMiterLimit(Float f10) {
        setFloatItem(COSName.ML, f10);
    }

    public void setNonStrokingAlphaConstant(Float f10) {
        setFloatItem(COSName.CA_NS, f10);
    }

    public void setNonStrokingOverprintControl(boolean z10) {
        this.dict.setBoolean(COSName.OP_NS, z10);
    }

    public void setOverprintMode(Float f10) {
        setFloatItem(COSName.OPM, f10);
    }

    public void setRenderingIntent(String str) {
        this.dict.setName("RI", str);
    }

    public void setSmoothnessTolerance(Float f10) {
        setFloatItem(COSName.SM, f10);
    }

    public void setStrokingAlphaConstant(Float f10) {
        setFloatItem(COSName.CA, f10);
    }

    public void setStrokingOverprintControl(boolean z10) {
        this.dict.setBoolean(COSName.OP, z10);
    }

    public void setTextKnockoutFlag(boolean z10) {
        this.dict.setBoolean(COSName.TK, z10);
    }

    public void setTransfer(COSBase cOSBase) {
        this.dict.setItem(COSName.TR, cOSBase);
    }

    public void setTransfer2(COSBase cOSBase) {
        this.dict.setItem(COSName.TR2, cOSBase);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dict;
    }

    public PDExtendedGraphicsState(COSDictionary cOSDictionary) {
        this.dict = cOSDictionary;
    }
}
