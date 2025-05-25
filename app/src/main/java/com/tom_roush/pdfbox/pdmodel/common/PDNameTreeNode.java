package com.tom_roush.pdfbox.pdmodel.common;

import a0.a;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class PDNameTreeNode<T extends COSObjectable> implements COSObjectable {
    private final COSDictionary node;
    private PDNameTreeNode<T> parent;

    public PDNameTreeNode() {
        this.node = new COSDictionary();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006a -> B:19:0x0071). Please submit an issue!!! */
    private void calculateLimits() {
        if (isRootNode()) {
            this.node.setItem(COSName.LIMITS, (COSBase) null);
            return;
        }
        List<PDNameTreeNode<T>> kids = getKids();
        if (kids != null && !kids.isEmpty()) {
            setLowerLimit(kids.get(0).getLowerLimit());
            setUpperLimit(((PDNameTreeNode) a.f(kids, -1)).getUpperLimit());
            return;
        }
        try {
            Map<String, T> names = getNames();
            if (names != null && names.size() > 0) {
                Set<String> keySet = names.keySet();
                String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
                setLowerLimit(strArr[0]);
                setUpperLimit(strArr[strArr.length - 1]);
            } else {
                this.node.setItem(COSName.LIMITS, (COSBase) null);
            }
        } catch (IOException unused) {
            this.node.setItem(COSName.LIMITS, (COSBase) null);
        }
    }

    private void setLowerLimit(String str) {
        COSDictionary cOSDictionary = this.node;
        COSName cOSName = COSName.LIMITS;
        COSArray cOSArray = cOSDictionary.getCOSArray(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            cOSArray.add((COSBase) null);
            cOSArray.add((COSBase) null);
            this.node.setItem(cOSName, (COSBase) cOSArray);
        }
        cOSArray.setString(0, str);
    }

    private void setUpperLimit(String str) {
        COSDictionary cOSDictionary = this.node;
        COSName cOSName = COSName.LIMITS;
        COSArray cOSArray = cOSDictionary.getCOSArray(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            cOSArray.add((COSBase) null);
            cOSArray.add((COSBase) null);
            this.node.setItem(cOSName, (COSBase) cOSArray);
        }
        cOSArray.setString(1, str);
    }

    public abstract T convertCOSToPD(COSBase cOSBase);

    public abstract PDNameTreeNode<T> createChildNode(COSDictionary cOSDictionary);

    public List<PDNameTreeNode<T>> getKids() {
        COSArray cOSArray = this.node.getCOSArray(COSName.KIDS);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                arrayList.add(createChildNode((COSDictionary) cOSArray.getObject(i10)));
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public String getLowerLimit() {
        COSArray cOSArray = this.node.getCOSArray(COSName.LIMITS);
        if (cOSArray != null) {
            return cOSArray.getString(0);
        }
        return null;
    }

    public Map<String, T> getNames() {
        COSArray cOSArray = this.node.getCOSArray(COSName.NAMES);
        if (cOSArray != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (cOSArray.size() % 2 != 0) {
                cOSArray.size();
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i11 < cOSArray.size()) {
                    COSBase object = cOSArray.getObject(i10);
                    if (object instanceof COSString) {
                        linkedHashMap.put(((COSString) object).getString(), convertCOSToPD(cOSArray.getObject(i11)));
                        i10 += 2;
                    } else {
                        throw new IOException("Expected string, found " + object + " in name tree at index " + i10);
                    }
                } else {
                    return Collections.unmodifiableMap(linkedHashMap);
                }
            }
        } else {
            return null;
        }
    }

    public PDNameTreeNode<T> getParent() {
        return this.parent;
    }

    public String getUpperLimit() {
        COSArray cOSArray = this.node.getCOSArray(COSName.LIMITS);
        if (cOSArray != null) {
            return cOSArray.getString(1);
        }
        return null;
    }

    public T getValue(String str) {
        Map<String, T> names = getNames();
        if (names != null) {
            return names.get(str);
        }
        List<PDNameTreeNode<T>> kids = getKids();
        T t4 = null;
        if (kids != null) {
            for (int i10 = 0; i10 < kids.size() && t4 == null; i10++) {
                PDNameTreeNode<T> pDNameTreeNode = kids.get(i10);
                String upperLimit = pDNameTreeNode.getUpperLimit();
                String lowerLimit = pDNameTreeNode.getLowerLimit();
                if (upperLimit == null || lowerLimit == null || upperLimit.compareTo(lowerLimit) < 0 || (lowerLimit.compareTo(str) <= 0 && upperLimit.compareTo(str) >= 0)) {
                    t4 = pDNameTreeNode.getValue(str);
                }
            }
        }
        return t4;
    }

    public boolean isRootNode() {
        if (this.parent == null) {
            return true;
        }
        return false;
    }

    public void setKids(List<? extends PDNameTreeNode<T>> list) {
        if (list != null && !list.isEmpty()) {
            for (PDNameTreeNode<T> pDNameTreeNode : list) {
                pDNameTreeNode.setParent(this);
            }
            this.node.setItem(COSName.KIDS, (COSBase) COSArrayList.converterToCOSArray(list));
            if (isRootNode()) {
                this.node.setItem(COSName.NAMES, (COSBase) null);
            }
        } else {
            this.node.setItem(COSName.KIDS, (COSBase) null);
            this.node.setItem(COSName.LIMITS, (COSBase) null);
        }
        calculateLimits();
    }

    public void setNames(Map<String, T> map) {
        if (map == null) {
            this.node.setItem(COSName.NAMES, (COSObjectable) null);
            this.node.setItem(COSName.LIMITS, (COSObjectable) null);
            return;
        }
        COSArray cOSArray = new COSArray();
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            cOSArray.add((COSBase) new COSString(str));
            cOSArray.add(map.get(str));
        }
        this.node.setItem(COSName.NAMES, (COSBase) cOSArray);
        calculateLimits();
    }

    public void setParent(PDNameTreeNode<T> pDNameTreeNode) {
        this.parent = pDNameTreeNode;
        calculateLimits();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.node;
    }

    public PDNameTreeNode(COSDictionary cOSDictionary) {
        this.node = cOSDictionary;
    }
}
