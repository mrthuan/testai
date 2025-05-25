package com.tom_roush.pdfbox.pdmodel.graphics.state;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.function.PDFunction;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDTransparencyGroup;
import com.tom_roush.pdfbox.util.Matrix;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class PDSoftMask implements COSObjectable {
    private Matrix ctm;
    private final COSDictionary dictionary;
    private COSName subType = null;
    private PDTransparencyGroup group = null;
    private COSArray backdropColor = null;
    private PDFunction transferFunction = null;

    public PDSoftMask(COSDictionary cOSDictionary) {
        this.dictionary = cOSDictionary;
    }

    public static PDSoftMask create(COSBase cOSBase) {
        if (cOSBase instanceof COSName) {
            if (COSName.NONE.equals(cOSBase)) {
                return null;
            }
            Objects.toString(cOSBase);
            return null;
        } else if (cOSBase instanceof COSDictionary) {
            return new PDSoftMask((COSDictionary) cOSBase);
        } else {
            Objects.toString(cOSBase);
            return null;
        }
    }

    public COSArray getBackdropColor() {
        if (this.backdropColor == null) {
            this.backdropColor = (COSArray) getCOSObject().getDictionaryObject(COSName.BC);
        }
        return this.backdropColor;
    }

    public PDTransparencyGroup getGroup() {
        COSBase dictionaryObject;
        if (this.group == null && (dictionaryObject = getCOSObject().getDictionaryObject(COSName.G)) != null) {
            PDXObject createXObject = PDXObject.createXObject(dictionaryObject, null);
            if (createXObject instanceof PDTransparencyGroup) {
                this.group = (PDTransparencyGroup) createXObject;
            }
        }
        return this.group;
    }

    public Matrix getInitialTransformationMatrix() {
        return this.ctm;
    }

    public COSName getSubType() {
        if (this.subType == null) {
            this.subType = (COSName) getCOSObject().getDictionaryObject(COSName.S);
        }
        return this.subType;
    }

    public PDFunction getTransferFunction() {
        COSBase dictionaryObject;
        if (this.transferFunction == null && (dictionaryObject = getCOSObject().getDictionaryObject(COSName.TR)) != null) {
            this.transferFunction = PDFunction.create(dictionaryObject);
        }
        return this.transferFunction;
    }

    public void setInitialTransformationMatrix(Matrix matrix) {
        this.ctm = matrix;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dictionary;
    }
}
