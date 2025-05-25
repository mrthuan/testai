package com.tom_roush.pdfbox.pdmodel.common;

import a0.a;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class PDNumberTreeNode implements COSObjectable {
    private final COSDictionary node;
    private Class<? extends COSObjectable> valueType;

    public PDNumberTreeNode(Class<? extends COSObjectable> cls) {
        this.valueType = null;
        this.node = new COSDictionary();
        this.valueType = cls;
    }

    private void setLowerLimit(Integer num) {
        COSDictionary cOSDictionary = this.node;
        COSName cOSName = COSName.LIMITS;
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            cOSArray.add((COSBase) null);
            cOSArray.add((COSBase) null);
            this.node.setItem(cOSName, (COSBase) cOSArray);
        }
        if (num != null) {
            cOSArray.setInt(0, num.intValue());
        } else {
            cOSArray.set(0, (COSBase) null);
        }
    }

    private void setUpperLimit(Integer num) {
        COSDictionary cOSDictionary = this.node;
        COSName cOSName = COSName.LIMITS;
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            cOSArray.add((COSBase) null);
            cOSArray.add((COSBase) null);
            this.node.setItem(cOSName, (COSBase) cOSArray);
        }
        if (num != null) {
            cOSArray.setInt(1, num.intValue());
        } else {
            cOSArray.set(1, (COSBase) null);
        }
    }

    public COSObjectable convertCOSToPD(COSBase cOSBase) {
        try {
            return this.valueType.getDeclaredConstructor(cOSBase.getClass()).newInstance(cOSBase);
        } catch (Throwable th2) {
            throw new IOException("Error while trying to create value in number tree:" + th2.getMessage(), th2);
        }
    }

    public PDNumberTreeNode createChildNode(COSDictionary cOSDictionary) {
        return new PDNumberTreeNode(cOSDictionary, this.valueType);
    }

    public List<PDNumberTreeNode> getKids() {
        COSArray cOSArray = (COSArray) this.node.getDictionaryObject(COSName.KIDS);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                arrayList.add(createChildNode((COSDictionary) cOSArray.getObject(i10)));
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public Integer getLowerLimit() {
        COSArray cOSArray = (COSArray) this.node.getDictionaryObject(COSName.LIMITS);
        if (cOSArray != null && cOSArray.get(0) != null) {
            return Integer.valueOf(cOSArray.getInt(0));
        }
        return null;
    }

    public Map<Integer, COSObjectable> getNumbers() {
        COSObjectable convertCOSToPD;
        COSBase dictionaryObject = this.node.getDictionaryObject(COSName.NUMS);
        if (!(dictionaryObject instanceof COSArray)) {
            return null;
        }
        COSArray cOSArray = (COSArray) dictionaryObject;
        HashMap hashMap = new HashMap();
        if (cOSArray.size() % 2 != 0) {
            cOSArray.size();
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i11 < cOSArray.size()) {
                COSBase object = cOSArray.getObject(i10);
                if (!(object instanceof COSInteger)) {
                    Objects.toString(object);
                    return null;
                }
                COSBase object2 = cOSArray.getObject(i11);
                Integer valueOf = Integer.valueOf(((COSInteger) object).intValue());
                if (object2 == null) {
                    convertCOSToPD = null;
                } else {
                    convertCOSToPD = convertCOSToPD(object2);
                }
                hashMap.put(valueOf, convertCOSToPD);
                i10 += 2;
            } else {
                return Collections.unmodifiableMap(hashMap);
            }
        }
    }

    public Integer getUpperLimit() {
        COSArray cOSArray = (COSArray) this.node.getDictionaryObject(COSName.LIMITS);
        if (cOSArray != null && cOSArray.get(0) != null) {
            return Integer.valueOf(cOSArray.getInt(1));
        }
        return null;
    }

    public Object getValue(Integer num) {
        Map<Integer, COSObjectable> numbers = getNumbers();
        if (numbers != null) {
            return numbers.get(num);
        }
        List<PDNumberTreeNode> kids = getKids();
        Object obj = null;
        if (kids != null) {
            for (int i10 = 0; i10 < kids.size() && obj == null; i10++) {
                PDNumberTreeNode pDNumberTreeNode = kids.get(i10);
                if (pDNumberTreeNode.getLowerLimit().compareTo(num) <= 0 && pDNumberTreeNode.getUpperLimit().compareTo(num) >= 0) {
                    obj = pDNumberTreeNode.getValue(num);
                }
            }
        }
        return obj;
    }

    public void setKids(List<? extends PDNumberTreeNode> list) {
        if (list != null && !list.isEmpty()) {
            setLowerLimit(list.get(0).getLowerLimit());
            setUpperLimit(((PDNumberTreeNode) a.f(list, -1)).getUpperLimit());
        } else if (this.node.getDictionaryObject(COSName.NUMS) == null) {
            this.node.setItem(COSName.LIMITS, (COSBase) null);
        }
        this.node.setItem(COSName.KIDS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setNumbers(Map<Integer, ? extends COSObjectable> map) {
        Integer num;
        Integer num2 = null;
        if (map == null) {
            this.node.setItem(COSName.NUMS, (COSObjectable) null);
            this.node.setItem(COSName.LIMITS, (COSObjectable) null);
            return;
        }
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        COSArray cOSArray = new COSArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num3 = (Integer) it.next();
            cOSArray.add((COSBase) COSInteger.get(num3.intValue()));
            COSObjectable cOSObjectable = map.get(num3);
            if (cOSObjectable == null) {
                cOSObjectable = COSNull.NULL;
            }
            cOSArray.add(cOSObjectable);
        }
        if (!arrayList.isEmpty()) {
            Integer num4 = (Integer) arrayList.get(0);
            num2 = (Integer) arrayList.get(arrayList.size() - 1);
            num = num4;
        } else {
            num = null;
        }
        setUpperLimit(num2);
        setLowerLimit(num);
        this.node.setItem(COSName.NUMS, (COSBase) cOSArray);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.node;
    }

    public PDNumberTreeNode(COSDictionary cOSDictionary, Class<? extends COSObjectable> cls) {
        this.node = cOSDictionary;
        this.valueType = cls;
    }
}
