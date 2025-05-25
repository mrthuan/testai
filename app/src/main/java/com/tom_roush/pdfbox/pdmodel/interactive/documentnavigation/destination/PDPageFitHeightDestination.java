package com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;

/* loaded from: classes2.dex */
public class PDPageFitHeightDestination extends PDPageDestination {
    protected static final String TYPE = "FitV";
    protected static final String TYPE_BOUNDED = "FitBV";

    public PDPageFitHeightDestination() {
        this.array.growToSize(3);
        this.array.setName(1, TYPE);
    }

    public boolean fitBoundingBox() {
        return TYPE_BOUNDED.equals(this.array.getName(1));
    }

    public int getLeft() {
        return this.array.getInt(2);
    }

    public void setFitBoundingBox(boolean z10) {
        this.array.growToSize(2);
        if (z10) {
            this.array.setName(1, TYPE_BOUNDED);
        } else {
            this.array.setName(1, TYPE);
        }
    }

    public void setLeft(int i10) {
        this.array.growToSize(3);
        if (i10 == -1) {
            this.array.set(2, (COSBase) null);
        } else {
            this.array.setInt(2, i10);
        }
    }

    public PDPageFitHeightDestination(COSArray cOSArray) {
        super(cOSArray);
    }
}
