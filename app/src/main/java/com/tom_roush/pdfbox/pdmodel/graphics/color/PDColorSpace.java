package com.tom_roush.pdfbox.pdmodel.graphics.color;

import android.graphics.Bitmap;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes2.dex */
public abstract class PDColorSpace implements COSObjectable {
    protected COSArray array;

    public static PDColorSpace create(COSBase cOSBase) {
        return create(cOSBase, null);
    }

    private static PDColorSpace createFromCOSObject(COSObject cOSObject, PDResources pDResources) {
        PDColorSpace colorSpace;
        if (pDResources != null && pDResources.getResourceCache() != null && (colorSpace = pDResources.getResourceCache().getColorSpace(cOSObject)) != null) {
            return colorSpace;
        }
        PDColorSpace create = create(cOSObject.getObject(), pDResources);
        if (pDResources != null && pDResources.getResourceCache() != null && create != null) {
            pDResources.getResourceCache().put(cOSObject, create);
        }
        return create;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.array;
    }

    public abstract float[] getDefaultDecode(int i10);

    public abstract PDColor getInitialColor();

    public abstract String getName();

    public abstract int getNumberOfComponents();

    public abstract float[] toRGB(float[] fArr);

    public abstract Bitmap toRGBImage(Bitmap bitmap);

    public static PDColorSpace create(COSBase cOSBase, PDResources pDResources) {
        return create(cOSBase, pDResources, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r4.hasColorSpace(r0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r4.hasColorSpace(r0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
        if (r4.hasColorSpace(r0) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace create(com.tom_roush.pdfbox.cos.COSBase r3, com.tom_roush.pdfbox.pdmodel.PDResources r4, boolean r5) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace.create(com.tom_roush.pdfbox.cos.COSBase, com.tom_roush.pdfbox.pdmodel.PDResources, boolean):com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace");
    }
}
