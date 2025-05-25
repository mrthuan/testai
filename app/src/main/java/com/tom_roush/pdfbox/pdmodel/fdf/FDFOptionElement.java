package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes2.dex */
public class FDFOptionElement implements COSObjectable {
    private final COSArray option;

    public FDFOptionElement() {
        COSArray cOSArray = new COSArray();
        this.option = cOSArray;
        cOSArray.add((COSBase) new COSString(""));
        cOSArray.add((COSBase) new COSString(""));
    }

    public COSArray getCOSArray() {
        return this.option;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.option;
    }

    public String getDefaultAppearanceString() {
        return ((COSString) this.option.getObject(1)).getString();
    }

    public String getOption() {
        return ((COSString) this.option.getObject(0)).getString();
    }

    public void setDefaultAppearanceString(String str) {
        this.option.set(1, (COSBase) new COSString(str));
    }

    public void setOption(String str) {
        this.option.set(0, (COSBase) new COSString(str));
    }

    public FDFOptionElement(COSArray cOSArray) {
        this.option = cOSArray;
    }
}
