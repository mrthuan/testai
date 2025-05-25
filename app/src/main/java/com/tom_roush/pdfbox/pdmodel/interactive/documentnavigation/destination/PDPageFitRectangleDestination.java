package com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;

/* loaded from: classes2.dex */
public class PDPageFitRectangleDestination extends PDPageDestination {
    protected static final String TYPE = "FitR";

    public PDPageFitRectangleDestination() {
        this.array.growToSize(6);
        this.array.setName(1, TYPE);
    }

    public int getBottom() {
        return this.array.getInt(3);
    }

    public int getLeft() {
        return this.array.getInt(2);
    }

    public int getRight() {
        return this.array.getInt(4);
    }

    public int getTop() {
        return this.array.getInt(5);
    }

    public void setBottom(int i10) {
        this.array.growToSize(6);
        if (i10 == -1) {
            this.array.set(3, (COSBase) null);
        } else {
            this.array.setInt(3, i10);
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

    public void setRight(int i10) {
        this.array.growToSize(6);
        if (i10 == -1) {
            this.array.set(4, (COSBase) null);
        } else {
            this.array.setInt(4, i10);
        }
    }

    public void setTop(int i10) {
        this.array.growToSize(6);
        if (i10 == -1) {
            this.array.set(5, (COSBase) null);
        } else {
            this.array.setInt(5, i10);
        }
    }

    public PDPageFitRectangleDestination(COSArray cOSArray) {
        super(cOSArray);
    }
}
