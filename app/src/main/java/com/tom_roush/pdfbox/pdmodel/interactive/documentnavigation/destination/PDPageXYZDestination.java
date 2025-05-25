package com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSNumber;

/* loaded from: classes2.dex */
public class PDPageXYZDestination extends PDPageDestination {
    protected static final String TYPE = "XYZ";

    public PDPageXYZDestination() {
        this.array.growToSize(5);
        this.array.setName(1, TYPE);
    }

    public int getLeft() {
        return this.array.getInt(2);
    }

    public int getTop() {
        return this.array.getInt(3);
    }

    public float getZoom() {
        COSBase object = this.array.getObject(4);
        if (object instanceof COSNumber) {
            return ((COSNumber) object).floatValue();
        }
        return -1.0f;
    }

    public void setLeft(int i10) {
        this.array.growToSize(3);
        if (i10 == -1) {
            this.array.set(2, (COSBase) null);
        } else {
            this.array.setInt(2, i10);
        }
    }

    public void setTop(int i10) {
        this.array.growToSize(4);
        if (i10 == -1) {
            this.array.set(3, (COSBase) null);
        } else {
            this.array.setInt(3, i10);
        }
    }

    public void setZoom(float f10) {
        this.array.growToSize(5);
        if (f10 == -1.0f) {
            this.array.set(4, (COSBase) null);
        } else {
            this.array.set(4, (COSBase) new COSFloat(f10));
        }
    }

    public PDPageXYZDestination(COSArray cOSArray) {
        super(cOSArray);
    }
}
