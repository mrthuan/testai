package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionFactory;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionJavaScript;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class FDFJavaScript implements COSObjectable {
    private final COSDictionary dictionary;

    public FDFJavaScript() {
        this.dictionary = new COSDictionary();
    }

    public String getAfter() {
        COSBase dictionaryObject = this.dictionary.getDictionaryObject(COSName.AFTER);
        if (dictionaryObject instanceof COSString) {
            return ((COSString) dictionaryObject).getString();
        }
        if (dictionaryObject instanceof COSStream) {
            return ((COSStream) dictionaryObject).toTextString();
        }
        return null;
    }

    public String getBefore() {
        COSBase dictionaryObject = this.dictionary.getDictionaryObject(COSName.BEFORE);
        if (dictionaryObject instanceof COSString) {
            return ((COSString) dictionaryObject).getString();
        }
        if (dictionaryObject instanceof COSStream) {
            return ((COSStream) dictionaryObject).toTextString();
        }
        return null;
    }

    public Map<String, PDActionJavaScript> getDoc() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        COSArray cOSArray = (COSArray) this.dictionary.getDictionaryObject(COSName.DOC);
        if (cOSArray == null) {
            return null;
        }
        for (int i10 = 0; i10 < cOSArray.size(); i10++) {
            PDActionFactory.createAction((COSDictionary) cOSArray.getObject(i10));
        }
        return linkedHashMap;
    }

    public void setAfter(String str) {
        this.dictionary.setItem(COSName.AFTER, (COSBase) new COSString(str));
    }

    public void setBefore(String str) {
        this.dictionary.setItem(COSName.BEFORE, (COSBase) new COSString(str));
    }

    public void setDoc(Map<String, PDActionJavaScript> map) {
        COSArray cOSArray = new COSArray();
        for (Map.Entry<String, PDActionJavaScript> entry : map.entrySet()) {
            cOSArray.add((COSBase) new COSString(entry.getKey()));
            cOSArray.add(entry.getValue());
        }
        this.dictionary.setItem(COSName.DOC, (COSBase) cOSArray);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dictionary;
    }

    public FDFJavaScript(COSDictionary cOSDictionary) {
        this.dictionary = cOSDictionary;
    }
}
