package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class Revisions<T> {
    private List<T> objects;
    private List<Integer> revisionNumbers;

    private List<T> getObjects() {
        if (this.objects == null) {
            this.objects = new ArrayList();
        }
        return this.objects;
    }

    private List<Integer> getRevisionNumbers() {
        if (this.revisionNumbers == null) {
            this.revisionNumbers = new ArrayList();
        }
        return this.revisionNumbers;
    }

    public void addObject(T t4, int i10) {
        getObjects().add(t4);
        getRevisionNumbers().add(Integer.valueOf(i10));
    }

    public T getObject(int i10) {
        return getObjects().get(i10);
    }

    public int getRevisionNumber(int i10) {
        return getRevisionNumbers().get(i10).intValue();
    }

    public void setRevisionNumber(T t4, int i10) {
        int indexOf = getObjects().indexOf(t4);
        if (indexOf > -1) {
            getRevisionNumbers().set(indexOf, Integer.valueOf(i10));
        }
    }

    public int size() {
        return getObjects().size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < getObjects().size(); i10++) {
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append("object=");
            sb2.append(getObjects().get(i10));
            sb2.append(", revisionNumber=");
            sb2.append(getRevisionNumber(i10));
        }
        return sb2.toString();
    }
}
