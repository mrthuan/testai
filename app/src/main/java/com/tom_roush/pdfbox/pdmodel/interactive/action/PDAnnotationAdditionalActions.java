package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;

/* loaded from: classes2.dex */
public class PDAnnotationAdditionalActions implements COSObjectable {
    private final COSDictionary actions;

    public PDAnnotationAdditionalActions() {
        this.actions = new COSDictionary();
    }

    public PDAction getBl() {
        COSDictionary cOSDictionary = (COSDictionary) this.actions.getDictionaryObject("Bl");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getD() {
        COSDictionary cOSDictionary = (COSDictionary) this.actions.getDictionaryObject(COSName.D);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getE() {
        COSDictionary cOSDictionary = (COSDictionary) this.actions.getDictionaryObject("E");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getFo() {
        COSDictionary cOSDictionary = (COSDictionary) this.actions.getDictionaryObject("Fo");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getPC() {
        COSDictionary cOSDictionary = (COSDictionary) this.actions.getDictionaryObject("PC");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getPI() {
        COSDictionary cOSDictionary = (COSDictionary) this.actions.getDictionaryObject("PI");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getPO() {
        COSDictionary cOSDictionary = (COSDictionary) this.actions.getDictionaryObject("PO");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getPV() {
        COSDictionary cOSDictionary = (COSDictionary) this.actions.getDictionaryObject("PV");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getU() {
        COSDictionary cOSDictionary = (COSDictionary) this.actions.getDictionaryObject(PDBorderStyleDictionary.STYLE_UNDERLINE);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getX() {
        COSDictionary cOSDictionary = (COSDictionary) this.actions.getDictionaryObject("X");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public void setBl(PDAction pDAction) {
        this.actions.setItem("Bl", pDAction);
    }

    public void setD(PDAction pDAction) {
        this.actions.setItem(COSName.D, pDAction);
    }

    public void setE(PDAction pDAction) {
        this.actions.setItem("E", pDAction);
    }

    public void setFo(PDAction pDAction) {
        this.actions.setItem("Fo", pDAction);
    }

    public void setPC(PDAction pDAction) {
        this.actions.setItem("PC", pDAction);
    }

    public void setPI(PDAction pDAction) {
        this.actions.setItem("PI", pDAction);
    }

    public void setPO(PDAction pDAction) {
        this.actions.setItem("PO", pDAction);
    }

    public void setPV(PDAction pDAction) {
        this.actions.setItem("PV", pDAction);
    }

    public void setU(PDAction pDAction) {
        this.actions.setItem(PDBorderStyleDictionary.STYLE_UNDERLINE, pDAction);
    }

    public void setX(PDAction pDAction) {
        this.actions.setItem("X", pDAction);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.actions;
    }

    public PDAnnotationAdditionalActions(COSDictionary cOSDictionary) {
        this.actions = cOSDictionary;
    }
}
