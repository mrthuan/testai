package com.tom_roush.pdfbox.cos;

import a6.h;

/* loaded from: classes2.dex */
public class COSObjectKey implements Comparable<COSObjectKey> {
    private int generation;
    private final long number;

    public COSObjectKey(COSObject cOSObject) {
        this(cOSObject.getObjectNumber(), cOSObject.getGenerationNumber());
    }

    public boolean equals(Object obj) {
        COSObjectKey cOSObjectKey;
        if (obj instanceof COSObjectKey) {
            cOSObjectKey = (COSObjectKey) obj;
        } else {
            cOSObjectKey = null;
        }
        if (cOSObjectKey != null && cOSObjectKey.getNumber() == getNumber() && cOSObjectKey.getGeneration() == getGeneration()) {
            return true;
        }
        return false;
    }

    public void fixGeneration(int i10) {
        this.generation = i10;
    }

    public int getGeneration() {
        return this.generation;
    }

    public long getNumber() {
        return this.number;
    }

    public int hashCode() {
        return Long.valueOf((this.number << 4) + this.generation).hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.number);
        sb2.append(" ");
        return h.g(sb2, this.generation, " R");
    }

    public COSObjectKey(long j10, int i10) {
        this.number = j10;
        this.generation = i10;
    }

    @Override // java.lang.Comparable
    public int compareTo(COSObjectKey cOSObjectKey) {
        if (getNumber() < cOSObjectKey.getNumber()) {
            return -1;
        }
        if (getNumber() > cOSObjectKey.getNumber()) {
            return 1;
        }
        if (getGeneration() < cOSObjectKey.getGeneration()) {
            return -1;
        }
        return getGeneration() > cOSObjectKey.getGeneration() ? 1 : 0;
    }
}
