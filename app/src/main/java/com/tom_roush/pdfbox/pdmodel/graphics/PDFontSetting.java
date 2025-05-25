package com.tom_roush.pdfbox.pdmodel.graphics;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.font.PDFontFactory;

/* loaded from: classes2.dex */
public class PDFontSetting implements COSObjectable {
    private COSArray fontSetting;

    public PDFontSetting() {
        this.fontSetting = null;
        COSArray cOSArray = new COSArray();
        this.fontSetting = cOSArray;
        cOSArray.add((COSBase) null);
        this.fontSetting.add((COSBase) new COSFloat(1.0f));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.fontSetting;
    }

    public PDFont getFont() {
        COSBase object = this.fontSetting.getObject(0);
        if (object instanceof COSDictionary) {
            return PDFontFactory.createFont((COSDictionary) object);
        }
        return null;
    }

    public float getFontSize() {
        return ((COSNumber) this.fontSetting.get(1)).floatValue();
    }

    public void setFont(PDFont pDFont) {
        this.fontSetting.set(0, pDFont);
    }

    public void setFontSize(float f10) {
        this.fontSetting.set(1, (COSBase) new COSFloat(f10));
    }

    public PDFontSetting(COSArray cOSArray) {
        this.fontSetting = cOSArray;
    }
}
