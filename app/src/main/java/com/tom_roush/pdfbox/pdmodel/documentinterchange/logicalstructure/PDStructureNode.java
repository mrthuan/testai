package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class PDStructureNode implements COSObjectable {
    private final COSDictionary dictionary;

    public PDStructureNode(String str) {
        COSDictionary cOSDictionary = new COSDictionary();
        this.dictionary = cOSDictionary;
        cOSDictionary.setName(COSName.TYPE, str);
    }

    public static PDStructureNode create(COSDictionary cOSDictionary) {
        String nameAsString = cOSDictionary.getNameAsString(COSName.TYPE);
        if ("StructTreeRoot".equals(nameAsString)) {
            return new PDStructureTreeRoot(cOSDictionary);
        }
        if (nameAsString != null && !PDStructureElement.TYPE.equals(nameAsString)) {
            throw new IllegalArgumentException("Dictionary must not include a Type entry with a value that is neither StructTreeRoot nor StructElem.");
        }
        return new PDStructureElement(cOSDictionary);
    }

    private COSObjectable createObjectFromDic(COSDictionary cOSDictionary) {
        String nameAsString = cOSDictionary.getNameAsString(COSName.TYPE);
        if (nameAsString != null && !PDStructureElement.TYPE.equals(nameAsString)) {
            if (PDObjectReference.TYPE.equals(nameAsString)) {
                return new PDObjectReference(cOSDictionary);
            }
            if (PDMarkedContentReference.TYPE.equals(nameAsString)) {
                return new PDMarkedContentReference(cOSDictionary);
            }
            return null;
        }
        return new PDStructureElement(cOSDictionary);
    }

    public void appendKid(PDStructureElement pDStructureElement) {
        appendObjectableKid(pDStructureElement);
        pDStructureElement.setParent(this);
    }

    public void appendObjectableKid(COSObjectable cOSObjectable) {
        if (cOSObjectable == null) {
            return;
        }
        appendKid(cOSObjectable.getCOSObject());
    }

    public Object createObject(COSBase cOSBase) {
        COSDictionary cOSDictionary;
        if (cOSBase instanceof COSDictionary) {
            cOSDictionary = (COSDictionary) cOSBase;
        } else {
            if (cOSBase instanceof COSObject) {
                COSBase object = ((COSObject) cOSBase).getObject();
                if (object instanceof COSDictionary) {
                    cOSDictionary = (COSDictionary) object;
                }
            }
            cOSDictionary = null;
        }
        if (cOSDictionary != null) {
            return createObjectFromDic(cOSDictionary);
        }
        if (!(cOSBase instanceof COSInteger)) {
            return null;
        }
        return Integer.valueOf(((COSInteger) cOSBase).intValue());
    }

    public List<Object> getKids() {
        ArrayList arrayList = new ArrayList();
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.K);
        if (dictionaryObject instanceof COSArray) {
            Iterator<COSBase> it = ((COSArray) dictionaryObject).iterator();
            while (it.hasNext()) {
                Object createObject = createObject(it.next());
                if (createObject != null) {
                    arrayList.add(createObject);
                }
            }
        } else {
            Object createObject2 = createObject(dictionaryObject);
            if (createObject2 != null) {
                arrayList.add(createObject2);
            }
        }
        return arrayList;
    }

    public String getType() {
        return getCOSObject().getNameAsString(COSName.TYPE);
    }

    public void insertBefore(PDStructureElement pDStructureElement, Object obj) {
        insertObjectableBefore(pDStructureElement, obj);
    }

    public void insertObjectableBefore(COSObjectable cOSObjectable, Object obj) {
        if (cOSObjectable == null) {
            return;
        }
        insertBefore(cOSObjectable.getCOSObject(), obj);
    }

    public boolean removeKid(PDStructureElement pDStructureElement) {
        boolean removeObjectableKid = removeObjectableKid(pDStructureElement);
        if (removeObjectableKid) {
            pDStructureElement.setParent(null);
        }
        return removeObjectableKid;
    }

    public boolean removeObjectableKid(COSObjectable cOSObjectable) {
        if (cOSObjectable == null) {
            return false;
        }
        return removeKid(cOSObjectable.getCOSObject());
    }

    public void setKids(List<Object> list) {
        getCOSObject().setItem(COSName.K, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dictionary;
    }

    public void insertBefore(COSBase cOSBase, Object obj) {
        COSBase cOSBase2;
        if (cOSBase == null || obj == null) {
            return;
        }
        COSDictionary cOSObject = getCOSObject();
        COSName cOSName = COSName.K;
        COSBase dictionaryObject = cOSObject.getDictionaryObject(cOSName);
        if (dictionaryObject == null) {
            return;
        }
        if (obj instanceof COSObjectable) {
            cOSBase2 = ((COSObjectable) obj).getCOSObject();
        } else {
            cOSBase2 = obj instanceof COSInteger ? (COSBase) obj : null;
        }
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            cOSArray.add(cOSArray.indexOfObject(cOSBase2), cOSBase.getCOSObject());
            return;
        }
        boolean equals = dictionaryObject.equals(cOSBase2);
        if (!equals && (dictionaryObject instanceof COSObject)) {
            equals = ((COSObject) dictionaryObject).getObject().equals(cOSBase2);
        }
        if (equals) {
            COSArray cOSArray2 = new COSArray();
            cOSArray2.add(cOSBase);
            cOSArray2.add(cOSBase2);
            getCOSObject().setItem(cOSName, (COSBase) cOSArray2);
        }
    }

    public void appendKid(COSBase cOSBase) {
        if (cOSBase == null) {
            return;
        }
        COSDictionary cOSObject = getCOSObject();
        COSName cOSName = COSName.K;
        COSBase dictionaryObject = cOSObject.getDictionaryObject(cOSName);
        if (dictionaryObject == null) {
            getCOSObject().setItem(cOSName, cOSBase);
        } else if (dictionaryObject instanceof COSArray) {
            ((COSArray) dictionaryObject).add(cOSBase);
        } else {
            COSArray cOSArray = new COSArray();
            cOSArray.add(dictionaryObject);
            cOSArray.add(cOSBase);
            getCOSObject().setItem(cOSName, (COSBase) cOSArray);
        }
    }

    public boolean removeKid(COSBase cOSBase) {
        if (cOSBase == null) {
            return false;
        }
        COSDictionary cOSObject = getCOSObject();
        COSName cOSName = COSName.K;
        COSBase dictionaryObject = cOSObject.getDictionaryObject(cOSName);
        if (dictionaryObject == null) {
            return false;
        }
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            boolean removeObject = cOSArray.removeObject(cOSBase);
            if (cOSArray.size() == 1) {
                getCOSObject().setItem(cOSName, cOSArray.getObject(0));
            }
            return removeObject;
        }
        boolean equals = dictionaryObject.equals(cOSBase);
        if (!equals && (dictionaryObject instanceof COSObject)) {
            equals = ((COSObject) dictionaryObject).getObject().equals(cOSBase);
        }
        if (equals) {
            getCOSObject().setItem(cOSName, (COSBase) null);
            return true;
        }
        return false;
    }

    public PDStructureNode(COSDictionary cOSDictionary) {
        this.dictionary = cOSDictionary;
    }
}
