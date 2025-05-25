package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes2.dex */
public class PDAdditionalActions implements COSObjectable {
    private final COSDictionary actions;

    public PDAdditionalActions() {
        this.actions = new COSDictionary();
    }

    public PDAction getF() {
        return PDActionFactory.createAction((COSDictionary) this.actions.getDictionaryObject(COSName.F));
    }

    public void setF(PDAction pDAction) {
        this.actions.setItem(COSName.F, pDAction);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.actions;
    }

    public PDAdditionalActions(COSDictionary cOSDictionary) {
        this.actions = cOSDictionary;
    }
}
