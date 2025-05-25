package com.tom_roush.pdfbox.pdmodel.font;

/* loaded from: classes2.dex */
public final class CIDSystemInfo {
    private final String ordering;
    private final String registry;
    private final int supplement;

    public CIDSystemInfo(String str, String str2, int i10) {
        this.registry = str;
        this.ordering = str2;
        this.supplement = i10;
    }

    public String getOrdering() {
        return this.ordering;
    }

    public String getRegistry() {
        return this.registry;
    }

    public int getSupplement() {
        return this.supplement;
    }

    public String toString() {
        return getRegistry() + "-" + getOrdering() + "-" + getSupplement();
    }
}
