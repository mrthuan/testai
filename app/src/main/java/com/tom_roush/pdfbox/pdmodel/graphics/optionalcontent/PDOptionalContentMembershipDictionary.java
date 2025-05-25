package com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class PDOptionalContentMembershipDictionary extends PDPropertyList {
    public PDOptionalContentMembershipDictionary() {
        this.dict.setItem(COSName.TYPE, (COSBase) COSName.OCMD);
    }

    public List<PDPropertyList> getOCGs() {
        ArrayList arrayList = new ArrayList();
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.OCGS);
        if (dictionaryObject instanceof COSDictionary) {
            arrayList.add(PDPropertyList.create((COSDictionary) dictionaryObject));
        } else if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                COSBase object = cOSArray.getObject(i10);
                if (object instanceof COSDictionary) {
                    arrayList.add(PDPropertyList.create((COSDictionary) object));
                }
            }
        }
        return arrayList;
    }

    public COSName getVisibilityPolicy() {
        return this.dict.getCOSName(COSName.P, COSName.ANY_ON);
    }

    public void setOCGs(List<PDPropertyList> list) {
        COSArray cOSArray = new COSArray();
        for (PDPropertyList pDPropertyList : list) {
            cOSArray.add(pDPropertyList);
        }
        this.dict.setItem(COSName.OCGS, (COSBase) cOSArray);
    }

    public void setVisibilityPolicy(COSName cOSName) {
        this.dict.setItem(COSName.P, (COSBase) cOSName);
    }

    public PDOptionalContentMembershipDictionary(COSDictionary cOSDictionary) {
        super(cOSDictionary);
        COSBase item = cOSDictionary.getItem(COSName.TYPE);
        COSName cOSName = COSName.OCMD;
        if (item.equals(cOSName)) {
            return;
        }
        throw new IllegalArgumentException("Provided dictionary is not of type '" + cOSName + OperatorName.SHOW_TEXT_LINE);
    }
}
