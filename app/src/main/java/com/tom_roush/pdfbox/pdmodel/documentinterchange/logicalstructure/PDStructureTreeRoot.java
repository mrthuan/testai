package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDStructureElementNameTreeNode;
import com.tom_roush.pdfbox.pdmodel.common.COSDictionaryMap;
import com.tom_roush.pdfbox.pdmodel.common.PDNameTreeNode;
import com.tom_roush.pdfbox.pdmodel.common.PDNumberTreeNode;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class PDStructureTreeRoot extends PDStructureNode {
    private static final String TYPE = "StructTreeRoot";

    public PDStructureTreeRoot() {
        super(TYPE);
    }

    public PDNameTreeNode<PDStructureElement> getIDTree() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.ID_TREE);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDStructureElementNameTreeNode((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public COSBase getK() {
        return getCOSObject().getDictionaryObject(COSName.K);
    }

    @Deprecated
    public COSArray getKArray() {
        COSDictionary cOSObject = getCOSObject();
        COSName cOSName = COSName.K;
        COSBase dictionaryObject = cOSObject.getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSDictionary) {
            COSBase dictionaryObject2 = ((COSDictionary) dictionaryObject).getDictionaryObject(cOSName);
            if (dictionaryObject2 instanceof COSArray) {
                return (COSArray) dictionaryObject2;
            }
            return null;
        } else if (dictionaryObject instanceof COSArray) {
            return (COSArray) dictionaryObject;
        } else {
            return null;
        }
    }

    public PDNumberTreeNode getParentTree() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.PARENT_TREE);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDNumberTreeNode((COSDictionary) dictionaryObject, PDParentTreeValue.class);
        }
        return null;
    }

    public int getParentTreeNextKey() {
        return getCOSObject().getInt(COSName.PARENT_TREE_NEXT_KEY);
    }

    public Map<String, Object> getRoleMap() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.ROLE_MAP);
        if (dictionaryObject instanceof COSDictionary) {
            try {
                return COSDictionaryMap.convertBasicTypesToMap((COSDictionary) dictionaryObject);
            } catch (IOException e10) {
                e10.getMessage();
            }
        }
        return new HashMap();
    }

    public void setIDTree(PDNameTreeNode<PDStructureElement> pDNameTreeNode) {
        getCOSObject().setItem(COSName.ID_TREE, pDNameTreeNode);
    }

    public void setK(COSBase cOSBase) {
        getCOSObject().setItem(COSName.K, cOSBase);
    }

    public void setParentTree(PDNumberTreeNode pDNumberTreeNode) {
        getCOSObject().setItem(COSName.PARENT_TREE, pDNumberTreeNode);
    }

    public void setParentTreeNextKey(int i10) {
        getCOSObject().setInt(COSName.PARENT_TREE_NEXT_KEY, i10);
    }

    public void setRoleMap(Map<String, String> map) {
        COSDictionary cOSDictionary = new COSDictionary();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            cOSDictionary.setName(entry.getKey(), entry.getValue());
        }
        getCOSObject().setItem(COSName.ROLE_MAP, (COSBase) cOSDictionary);
    }

    public PDStructureTreeRoot(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
