package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class FDFTemplate implements COSObjectable {
    private final COSDictionary template;

    public FDFTemplate() {
        this.template = new COSDictionary();
    }

    public List<FDFField> getFields() {
        COSArray cOSArray = (COSArray) this.template.getDictionaryObject(COSName.FIELDS);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                arrayList.add(new FDFField((COSDictionary) cOSArray.getObject(i10)));
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public FDFNamedPageReference getTemplateReference() {
        COSDictionary cOSDictionary = (COSDictionary) this.template.getDictionaryObject(COSName.TREF);
        if (cOSDictionary != null) {
            return new FDFNamedPageReference(cOSDictionary);
        }
        return null;
    }

    public void setFields(List<FDFField> list) {
        this.template.setItem(COSName.FIELDS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setRename(boolean z10) {
        this.template.setBoolean(COSName.RENAME, z10);
    }

    public void setTemplateReference(FDFNamedPageReference fDFNamedPageReference) {
        this.template.setItem(COSName.TREF, fDFNamedPageReference);
    }

    public boolean shouldRename() {
        return this.template.getBoolean(COSName.RENAME, false);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.template;
    }

    public FDFTemplate(COSDictionary cOSDictionary) {
        this.template = cOSDictionary;
    }
}
