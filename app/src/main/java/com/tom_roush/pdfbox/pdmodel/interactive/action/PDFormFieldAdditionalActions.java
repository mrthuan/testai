package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes2.dex */
public class PDFormFieldAdditionalActions implements COSObjectable {
    private final COSDictionary actions;

    public PDFormFieldAdditionalActions() {
        this.actions = new COSDictionary();
    }

    public PDAction getC() {
        COSDictionary cOSDictionary = (COSDictionary) this.actions.getDictionaryObject(COSName.C);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getF() {
        COSDictionary cOSDictionary = (COSDictionary) this.actions.getDictionaryObject(COSName.F);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getK() {
        COSDictionary cOSDictionary = (COSDictionary) this.actions.getDictionaryObject(COSName.K);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getV() {
        COSDictionary cOSDictionary = (COSDictionary) this.actions.getDictionaryObject(COSName.V);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public void setC(PDAction pDAction) {
        this.actions.setItem(COSName.C, pDAction);
    }

    public void setF(PDAction pDAction) {
        this.actions.setItem(COSName.F, pDAction);
    }

    public void setK(PDAction pDAction) {
        this.actions.setItem(COSName.K, pDAction);
    }

    public void setV(PDAction pDAction) {
        this.actions.setItem(COSName.V, pDAction);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.actions;
    }

    public PDFormFieldAdditionalActions(COSDictionary cOSDictionary) {
        this.actions = cOSDictionary;
    }
}
