package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDMarkedContent;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class PDStructureElement extends PDStructureNode {
    public static final String TYPE = "StructElem";

    public PDStructureElement(String str, PDStructureNode pDStructureNode) {
        super(TYPE);
        setStructureType(str);
        setParent(pDStructureNode);
    }

    private Map<String, Object> getRoleMap() {
        PDStructureTreeRoot structureTreeRoot = getStructureTreeRoot();
        if (structureTreeRoot != null) {
            return structureTreeRoot.getRoleMap();
        }
        return null;
    }

    private PDStructureTreeRoot getStructureTreeRoot() {
        PDStructureNode parent = getParent();
        while (parent instanceof PDStructureElement) {
            parent = ((PDStructureElement) parent).getParent();
        }
        if (parent instanceof PDStructureTreeRoot) {
            return (PDStructureTreeRoot) parent;
        }
        return null;
    }

    public void addAttribute(PDAttributeObject pDAttributeObject) {
        COSArray cOSArray;
        COSName cOSName = COSName.A;
        pDAttributeObject.setStructureElement(this);
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSArray) {
            cOSArray = (COSArray) dictionaryObject;
        } else {
            COSArray cOSArray2 = new COSArray();
            if (dictionaryObject != null) {
                cOSArray2.add(dictionaryObject);
                cOSArray2.add((COSBase) COSInteger.get(0L));
            }
            cOSArray = cOSArray2;
        }
        getCOSObject().setItem(cOSName, (COSBase) cOSArray);
        cOSArray.add(pDAttributeObject);
        cOSArray.add((COSBase) COSInteger.get(getRevisionNumber()));
    }

    public void addClassName(String str) {
        COSArray cOSArray;
        if (str == null) {
            return;
        }
        COSName cOSName = COSName.C;
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSArray) {
            cOSArray = (COSArray) dictionaryObject;
        } else {
            COSArray cOSArray2 = new COSArray();
            if (dictionaryObject != null) {
                cOSArray2.add(dictionaryObject);
                cOSArray2.add((COSBase) COSInteger.get(0L));
            }
            cOSArray = cOSArray2;
        }
        getCOSObject().setItem(cOSName, (COSBase) cOSArray);
        cOSArray.add((COSBase) COSName.getPDFName(str));
        cOSArray.add((COSBase) COSInteger.get(getRevisionNumber()));
    }

    public void appendKid(PDMarkedContent pDMarkedContent) {
        if (pDMarkedContent == null) {
            return;
        }
        appendKid(COSInteger.get(pDMarkedContent.getMCID()));
    }

    public void attributeChanged(PDAttributeObject pDAttributeObject) {
        COSName cOSName = COSName.A;
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                if (cOSArray.getObject(i10).equals(pDAttributeObject.getCOSObject())) {
                    int i11 = i10 + 1;
                    if (cOSArray.get(i11) instanceof COSInteger) {
                        cOSArray.set(i11, (COSBase) COSInteger.get(getRevisionNumber()));
                    }
                }
            }
            return;
        }
        COSArray cOSArray2 = new COSArray();
        cOSArray2.add(dictionaryObject);
        cOSArray2.add((COSBase) COSInteger.get(getRevisionNumber()));
        getCOSObject().setItem(cOSName, (COSBase) cOSArray2);
    }

    public String getActualText() {
        return getCOSObject().getString(COSName.ACTUAL_TEXT);
    }

    public String getAlternateDescription() {
        return getCOSObject().getString(COSName.ALT);
    }

    public Revisions<PDAttributeObject> getAttributes() {
        Revisions<PDAttributeObject> revisions = new Revisions<>();
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.A);
        if (dictionaryObject instanceof COSArray) {
            Iterator<COSBase> it = ((COSArray) dictionaryObject).iterator();
            PDAttributeObject pDAttributeObject = null;
            while (it.hasNext()) {
                COSBase next = it.next();
                if (next instanceof COSObject) {
                    next = ((COSObject) next).getObject();
                }
                if (next instanceof COSDictionary) {
                    pDAttributeObject = PDAttributeObject.create((COSDictionary) next);
                    pDAttributeObject.setStructureElement(this);
                    revisions.addObject(pDAttributeObject, 0);
                } else if (next instanceof COSInteger) {
                    revisions.setRevisionNumber(pDAttributeObject, ((COSNumber) next).intValue());
                }
            }
        }
        if (dictionaryObject instanceof COSDictionary) {
            PDAttributeObject create = PDAttributeObject.create((COSDictionary) dictionaryObject);
            create.setStructureElement(this);
            revisions.addObject(create, 0);
        }
        return revisions;
    }

    public Revisions<String> getClassNames() {
        COSName cOSName = COSName.C;
        Revisions<String> revisions = new Revisions<>();
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSName) {
            revisions.addObject(((COSName) dictionaryObject).getName(), 0);
        }
        if (dictionaryObject instanceof COSArray) {
            Iterator<COSBase> it = ((COSArray) dictionaryObject).iterator();
            String str = null;
            while (it.hasNext()) {
                COSBase next = it.next();
                if (next instanceof COSObject) {
                    next = ((COSObject) next).getObject();
                }
                if (next instanceof COSName) {
                    str = ((COSName) next).getName();
                    revisions.addObject(str, 0);
                } else if (next instanceof COSInteger) {
                    revisions.setRevisionNumber(str, ((COSInteger) next).intValue());
                }
            }
        }
        return revisions;
    }

    public String getElementIdentifier() {
        return getCOSObject().getString(COSName.ID);
    }

    public String getExpandedForm() {
        return getCOSObject().getString(COSName.E);
    }

    public String getLanguage() {
        return getCOSObject().getString(COSName.LANG);
    }

    public PDPage getPage() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.PG);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDPage((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public PDStructureNode getParent() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.P);
        if (dictionaryObject instanceof COSDictionary) {
            return PDStructureNode.create((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public int getRevisionNumber() {
        return getCOSObject().getInt(COSName.R, 0);
    }

    public String getStandardStructureType() {
        String structureType = getStructureType();
        if (getRoleMap().containsKey(structureType)) {
            Object obj = getRoleMap().get(structureType);
            if (obj instanceof String) {
                return (String) obj;
            }
            return structureType;
        }
        return structureType;
    }

    public String getStructureType() {
        return getCOSObject().getNameAsString(COSName.S);
    }

    public String getTitle() {
        return getCOSObject().getString(COSName.T);
    }

    public void incrementRevisionNumber() {
        setRevisionNumber(getRevisionNumber() + 1);
    }

    public void insertBefore(COSInteger cOSInteger, Object obj) {
        insertBefore((COSBase) cOSInteger, obj);
    }

    public void removeAttribute(PDAttributeObject pDAttributeObject) {
        COSName cOSName = COSName.A;
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            cOSArray.remove(pDAttributeObject.getCOSObject());
            if (cOSArray.size() == 2 && cOSArray.getInt(1) == 0) {
                getCOSObject().setItem(cOSName, cOSArray.getObject(0));
            }
        } else {
            if (dictionaryObject instanceof COSObject) {
                dictionaryObject = ((COSObject) dictionaryObject).getObject();
            }
            if (pDAttributeObject.getCOSObject().equals(dictionaryObject)) {
                getCOSObject().setItem(cOSName, (COSBase) null);
            }
        }
        pDAttributeObject.setStructureElement(null);
    }

    public void removeClassName(String str) {
        if (str == null) {
            return;
        }
        COSName cOSName = COSName.C;
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(cOSName);
        COSName pDFName = COSName.getPDFName(str);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            cOSArray.remove(pDFName);
            if (cOSArray.size() == 2 && cOSArray.getInt(1) == 0) {
                getCOSObject().setItem(cOSName, cOSArray.getObject(0));
                return;
            }
            return;
        }
        if (dictionaryObject instanceof COSObject) {
            dictionaryObject = ((COSObject) dictionaryObject).getObject();
        }
        if (pDFName.equals(dictionaryObject)) {
            getCOSObject().setItem(cOSName, (COSBase) null);
        }
    }

    public void removeKid(COSInteger cOSInteger) {
        removeKid((COSBase) cOSInteger);
    }

    public void setActualText(String str) {
        getCOSObject().setString(COSName.ACTUAL_TEXT, str);
    }

    public void setAlternateDescription(String str) {
        getCOSObject().setString(COSName.ALT, str);
    }

    public void setAttributes(Revisions<PDAttributeObject> revisions) {
        COSName cOSName = COSName.A;
        if (revisions.size() == 1 && revisions.getRevisionNumber(0) == 0) {
            PDAttributeObject object = revisions.getObject(0);
            object.setStructureElement(this);
            getCOSObject().setItem(cOSName, object);
            return;
        }
        COSArray cOSArray = new COSArray();
        for (int i10 = 0; i10 < revisions.size(); i10++) {
            PDAttributeObject object2 = revisions.getObject(i10);
            object2.setStructureElement(this);
            int revisionNumber = revisions.getRevisionNumber(i10);
            if (revisionNumber >= 0) {
                cOSArray.add(object2);
                cOSArray.add((COSBase) COSInteger.get(revisionNumber));
            } else {
                throw new IllegalArgumentException("The revision number shall be > -1");
            }
        }
        getCOSObject().setItem(cOSName, (COSBase) cOSArray);
    }

    public void setClassNames(Revisions<String> revisions) {
        if (revisions == null) {
            return;
        }
        COSName cOSName = COSName.C;
        if (revisions.size() == 1 && revisions.getRevisionNumber(0) == 0) {
            getCOSObject().setName(cOSName, revisions.getObject(0));
            return;
        }
        COSArray cOSArray = new COSArray();
        for (int i10 = 0; i10 < revisions.size(); i10++) {
            String object = revisions.getObject(i10);
            int revisionNumber = revisions.getRevisionNumber(i10);
            if (revisionNumber >= 0) {
                cOSArray.add((COSBase) COSName.getPDFName(object));
                cOSArray.add((COSBase) COSInteger.get(revisionNumber));
            } else {
                throw new IllegalArgumentException("The revision number shall be > -1");
            }
        }
        getCOSObject().setItem(cOSName, (COSBase) cOSArray);
    }

    public void setElementIdentifier(String str) {
        getCOSObject().setString(COSName.ID, str);
    }

    public void setExpandedForm(String str) {
        getCOSObject().setString(COSName.E, str);
    }

    public void setLanguage(String str) {
        getCOSObject().setString(COSName.LANG, str);
    }

    public void setPage(PDPage pDPage) {
        getCOSObject().setItem(COSName.PG, pDPage);
    }

    public final void setParent(PDStructureNode pDStructureNode) {
        getCOSObject().setItem(COSName.P, pDStructureNode);
    }

    public void setRevisionNumber(int i10) {
        if (i10 >= 0) {
            getCOSObject().setInt(COSName.R, i10);
            return;
        }
        throw new IllegalArgumentException("The revision number shall be > -1");
    }

    public final void setStructureType(String str) {
        getCOSObject().setName(COSName.S, str);
    }

    public void setTitle(String str) {
        getCOSObject().setString(COSName.T, str);
    }

    public void appendKid(PDMarkedContentReference pDMarkedContentReference) {
        appendObjectableKid(pDMarkedContentReference);
    }

    public void insertBefore(PDMarkedContentReference pDMarkedContentReference, Object obj) {
        insertObjectableBefore(pDMarkedContentReference, obj);
    }

    public void removeKid(PDMarkedContentReference pDMarkedContentReference) {
        removeObjectableKid(pDMarkedContentReference);
    }

    public void appendKid(PDObjectReference pDObjectReference) {
        appendObjectableKid(pDObjectReference);
    }

    public void insertBefore(PDObjectReference pDObjectReference, Object obj) {
        insertObjectableBefore(pDObjectReference, obj);
    }

    public void removeKid(PDObjectReference pDObjectReference) {
        removeObjectableKid(pDObjectReference);
    }

    public PDStructureElement(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
