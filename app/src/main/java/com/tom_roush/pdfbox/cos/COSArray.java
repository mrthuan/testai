package com.tom_roush.pdfbox.cos;

import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class COSArray extends COSBase implements Iterable<COSBase>, COSUpdateInfo {
    private boolean needToBeUpdated;
    private final List<COSBase> objects = new ArrayList();

    @Override // com.tom_roush.pdfbox.cos.COSBase
    public Object accept(ICOSVisitor iCOSVisitor) {
        return iCOSVisitor.visitFromArray(this);
    }

    public void add(COSBase cOSBase) {
        this.objects.add(cOSBase);
    }

    public void addAll(Collection<COSBase> collection) {
        this.objects.addAll(collection);
    }

    public void clear() {
        this.objects.clear();
    }

    public COSBase get(int i10) {
        return this.objects.get(i10);
    }

    public int getInt(int i10) {
        return getInt(i10, -1);
    }

    public String getName(int i10) {
        return getName(i10, null);
    }

    public COSBase getObject(int i10) {
        COSBase cOSBase = this.objects.get(i10);
        if (cOSBase instanceof COSObject) {
            cOSBase = ((COSObject) cOSBase).getObject();
        }
        if (cOSBase instanceof COSNull) {
            return null;
        }
        return cOSBase;
    }

    public String getString(int i10) {
        return getString(i10, null);
    }

    public void growToSize(int i10) {
        growToSize(i10, null);
    }

    public int indexOf(COSBase cOSBase) {
        for (int i10 = 0; i10 < size(); i10++) {
            if (get(i10).equals(cOSBase)) {
                return i10;
            }
        }
        return -1;
    }

    public int indexOfObject(COSBase cOSBase) {
        for (int i10 = 0; i10 < size(); i10++) {
            COSBase cOSBase2 = get(i10);
            if (!cOSBase2.equals(cOSBase)) {
                if ((cOSBase2 instanceof COSObject) && ((COSObject) cOSBase2).getObject().equals(cOSBase)) {
                    return i10;
                }
            } else {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.tom_roush.pdfbox.cos.COSUpdateInfo
    public boolean isNeedToBeUpdated() {
        return this.needToBeUpdated;
    }

    @Override // java.lang.Iterable
    public Iterator<COSBase> iterator() {
        return this.objects.iterator();
    }

    public COSBase remove(int i10) {
        return this.objects.remove(i10);
    }

    public void removeAll(Collection<COSBase> collection) {
        this.objects.removeAll(collection);
    }

    public boolean removeObject(COSBase cOSBase) {
        boolean remove = remove(cOSBase);
        if (!remove) {
            for (int i10 = 0; i10 < size(); i10++) {
                COSBase cOSBase2 = get(i10);
                if ((cOSBase2 instanceof COSObject) && ((COSObject) cOSBase2).getObject().equals(cOSBase)) {
                    return remove(cOSBase2);
                }
            }
        }
        return remove;
    }

    public void retainAll(Collection<COSBase> collection) {
        this.objects.retainAll(collection);
    }

    public void set(int i10, COSBase cOSBase) {
        this.objects.set(i10, cOSBase);
    }

    public void setFloatArray(float[] fArr) {
        clear();
        for (float f10 : fArr) {
            add((COSBase) new COSFloat(f10));
        }
    }

    public void setInt(int i10, int i11) {
        set(i10, (COSBase) COSInteger.get(i11));
    }

    public void setName(int i10, String str) {
        set(i10, (COSBase) COSName.getPDFName(str));
    }

    @Override // com.tom_roush.pdfbox.cos.COSUpdateInfo
    public void setNeedToBeUpdated(boolean z10) {
        this.needToBeUpdated = z10;
    }

    public void setString(int i10, String str) {
        if (str != null) {
            set(i10, (COSBase) new COSString(str));
        } else {
            set(i10, (COSBase) null);
        }
    }

    public int size() {
        return this.objects.size();
    }

    public float[] toFloatArray() {
        float f10;
        float[] fArr = new float[size()];
        for (int i10 = 0; i10 < size(); i10++) {
            COSBase object = getObject(i10);
            if (object instanceof COSNumber) {
                f10 = ((COSNumber) object).floatValue();
            } else {
                f10 = 0.0f;
            }
            fArr[i10] = f10;
        }
        return fArr;
    }

    public List<? extends COSBase> toList() {
        return new ArrayList(this.objects);
    }

    public String toString() {
        return "COSArray{" + this.objects + "}";
    }

    public void add(COSObjectable cOSObjectable) {
        this.objects.add(cOSObjectable.getCOSObject());
    }

    public void addAll(COSArray cOSArray) {
        if (cOSArray != null) {
            this.objects.addAll(cOSArray.objects);
        }
    }

    public int getInt(int i10, int i11) {
        if (i10 < size()) {
            COSBase cOSBase = this.objects.get(i10);
            return cOSBase instanceof COSNumber ? ((COSNumber) cOSBase).intValue() : i11;
        }
        return i11;
    }

    public String getName(int i10, String str) {
        if (i10 < size()) {
            COSBase cOSBase = this.objects.get(i10);
            return cOSBase instanceof COSName ? ((COSName) cOSBase).getName() : str;
        }
        return str;
    }

    public String getString(int i10, String str) {
        if (i10 < size()) {
            COSBase cOSBase = this.objects.get(i10);
            return cOSBase instanceof COSString ? ((COSString) cOSBase).getString() : str;
        }
        return str;
    }

    public void growToSize(int i10, COSBase cOSBase) {
        while (size() < i10) {
            add(cOSBase);
        }
    }

    public boolean remove(COSBase cOSBase) {
        return this.objects.remove(cOSBase);
    }

    public void set(int i10, int i11) {
        this.objects.set(i10, COSInteger.get(i11));
    }

    public void add(int i10, COSBase cOSBase) {
        this.objects.add(i10, cOSBase);
    }

    public void addAll(int i10, Collection<COSBase> collection) {
        this.objects.addAll(i10, collection);
    }

    public void set(int i10, COSObjectable cOSObjectable) {
        this.objects.set(i10, cOSObjectable != null ? cOSObjectable.getCOSObject() : null);
    }
}
