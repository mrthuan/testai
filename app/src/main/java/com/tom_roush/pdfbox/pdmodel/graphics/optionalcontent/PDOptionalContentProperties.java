package com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class PDOptionalContentProperties implements COSObjectable {
    private final COSDictionary dict;

    /* loaded from: classes2.dex */
    public enum BaseState {
        ON(COSName.ON),
        OFF(COSName.OFF),
        UNCHANGED(COSName.UNCHANGED);
        
        private final COSName name;

        BaseState(COSName cOSName) {
            this.name = cOSName;
        }

        public COSName getName() {
            return this.name;
        }

        public static BaseState valueOf(COSName cOSName) {
            if (cOSName == null) {
                return ON;
            }
            return valueOf(cOSName.getName().toUpperCase());
        }
    }

    public PDOptionalContentProperties() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.dict = cOSDictionary;
        cOSDictionary.setItem(COSName.OCGS, (COSBase) new COSArray());
        COSDictionary cOSDictionary2 = new COSDictionary();
        cOSDictionary2.setString(COSName.NAME, "Top");
        cOSDictionary.setItem(COSName.D, (COSBase) cOSDictionary2);
    }

    private COSDictionary getD() {
        COSDictionary cOSDictionary = this.dict;
        COSName cOSName = COSName.D;
        COSBase dictionaryObject = cOSDictionary.getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSDictionary) {
            return (COSDictionary) dictionaryObject;
        }
        COSDictionary cOSDictionary2 = new COSDictionary();
        cOSDictionary2.setString(COSName.NAME, "Top");
        this.dict.setItem(cOSName, (COSBase) cOSDictionary2);
        return cOSDictionary2;
    }

    private COSArray getOCGs() {
        COSDictionary cOSDictionary = this.dict;
        COSName cOSName = COSName.OCGS;
        COSArray cOSArray = cOSDictionary.getCOSArray(cOSName);
        if (cOSArray == null) {
            COSArray cOSArray2 = new COSArray();
            this.dict.setItem(cOSName, (COSBase) cOSArray2);
            return cOSArray2;
        }
        return cOSArray;
    }

    private COSDictionary toDictionary(COSBase cOSBase) {
        if (cOSBase instanceof COSObject) {
            return (COSDictionary) ((COSObject) cOSBase).getObject();
        }
        return (COSDictionary) cOSBase;
    }

    public void addGroup(PDOptionalContentGroup pDOptionalContentGroup) {
        getOCGs().add((COSBase) pDOptionalContentGroup.getCOSObject());
        COSDictionary d10 = getD();
        COSName cOSName = COSName.ORDER;
        COSArray cOSArray = (COSArray) d10.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            getD().setItem(cOSName, (COSBase) cOSArray);
        }
        cOSArray.add(pDOptionalContentGroup);
    }

    public BaseState getBaseState() {
        return BaseState.valueOf((COSName) getD().getItem(COSName.BASE_STATE));
    }

    public PDOptionalContentGroup getGroup(String str) {
        Iterator<COSBase> it = getOCGs().iterator();
        while (it.hasNext()) {
            COSDictionary dictionary = toDictionary(it.next());
            if (dictionary.getString(COSName.NAME).equals(str)) {
                return new PDOptionalContentGroup(dictionary);
            }
        }
        return null;
    }

    public String[] getGroupNames() {
        COSArray cOSArray = this.dict.getCOSArray(COSName.OCGS);
        if (cOSArray == null) {
            return new String[0];
        }
        int size = cOSArray.size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = toDictionary(cOSArray.get(i10)).getString(COSName.NAME);
        }
        return strArr;
    }

    public Collection<PDOptionalContentGroup> getOptionalContentGroups() {
        ArrayList arrayList = new ArrayList();
        Iterator<COSBase> it = getOCGs().iterator();
        while (it.hasNext()) {
            arrayList.add(new PDOptionalContentGroup(toDictionary(it.next())));
        }
        return arrayList;
    }

    public boolean hasGroup(String str) {
        for (String str2 : getGroupNames()) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean isGroupEnabled(String str) {
        Iterator<COSBase> it = getOCGs().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            COSDictionary dictionary = toDictionary(it.next());
            if (str.equals(dictionary.getString(COSName.NAME)) && isGroupEnabled(new PDOptionalContentGroup(dictionary))) {
                z10 = true;
            }
        }
        return z10;
    }

    public void setBaseState(BaseState baseState) {
        getD().setItem(COSName.BASE_STATE, (COSBase) baseState.getName());
    }

    public boolean setGroupEnabled(String str, boolean z10) {
        Iterator<COSBase> it = getOCGs().iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            COSDictionary dictionary = toDictionary(it.next());
            if (str.equals(dictionary.getString(COSName.NAME)) && setGroupEnabled(new PDOptionalContentGroup(dictionary), z10)) {
                z11 = true;
            }
        }
        return z11;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dict;
    }

    public boolean isGroupEnabled(PDOptionalContentGroup pDOptionalContentGroup) {
        boolean z10 = !getBaseState().equals(BaseState.OFF);
        if (pDOptionalContentGroup == null) {
            return z10;
        }
        COSDictionary d10 = getD();
        COSBase dictionaryObject = d10.getDictionaryObject(COSName.ON);
        if (dictionaryObject instanceof COSArray) {
            Iterator<COSBase> it = ((COSArray) dictionaryObject).iterator();
            while (it.hasNext()) {
                if (toDictionary(it.next()) == pDOptionalContentGroup.getCOSObject()) {
                    return true;
                }
            }
        }
        COSBase dictionaryObject2 = d10.getDictionaryObject(COSName.OFF);
        if (dictionaryObject2 instanceof COSArray) {
            Iterator<COSBase> it2 = ((COSArray) dictionaryObject2).iterator();
            while (it2.hasNext()) {
                if (toDictionary(it2.next()) == pDOptionalContentGroup.getCOSObject()) {
                    return false;
                }
            }
        }
        return z10;
    }

    public boolean setGroupEnabled(PDOptionalContentGroup pDOptionalContentGroup, boolean z10) {
        COSArray cOSArray;
        COSArray cOSArray2;
        COSDictionary d10 = getD();
        COSName cOSName = COSName.ON;
        COSBase dictionaryObject = d10.getDictionaryObject(cOSName);
        if (!(dictionaryObject instanceof COSArray)) {
            cOSArray = new COSArray();
            d10.setItem(cOSName, (COSBase) cOSArray);
        } else {
            cOSArray = (COSArray) dictionaryObject;
        }
        COSName cOSName2 = COSName.OFF;
        COSBase dictionaryObject2 = d10.getDictionaryObject(cOSName2);
        if (!(dictionaryObject2 instanceof COSArray)) {
            cOSArray2 = new COSArray();
            d10.setItem(cOSName2, (COSBase) cOSArray2);
        } else {
            cOSArray2 = (COSArray) dictionaryObject2;
        }
        boolean z11 = true;
        if (z10) {
            Iterator<COSBase> it = cOSArray2.iterator();
            while (it.hasNext()) {
                COSBase next = it.next();
                if (toDictionary(next) == pDOptionalContentGroup.getCOSObject()) {
                    cOSArray2.remove(next);
                    cOSArray.add(next);
                    break;
                }
            }
            z11 = false;
        } else {
            Iterator<COSBase> it2 = cOSArray.iterator();
            while (it2.hasNext()) {
                COSBase next2 = it2.next();
                if (toDictionary(next2) == pDOptionalContentGroup.getCOSObject()) {
                    cOSArray.remove(next2);
                    cOSArray2.add(next2);
                    break;
                }
            }
            z11 = false;
        }
        if (!z11) {
            if (z10) {
                cOSArray.add((COSBase) pDOptionalContentGroup.getCOSObject());
            } else {
                cOSArray2.add((COSBase) pDOptionalContentGroup.getCOSObject());
            }
        }
        return z11;
    }

    public PDOptionalContentProperties(COSDictionary cOSDictionary) {
        this.dict = cOSDictionary;
    }
}
