package com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList;

/* loaded from: classes2.dex */
public class PDOptionalContentGroup extends PDPropertyList {

    /* loaded from: classes2.dex */
    public enum RenderState {
        ON(COSName.ON),
        OFF(COSName.OFF);
        
        private final COSName name;

        RenderState(COSName cOSName) {
            this.name = cOSName;
        }

        public COSName getName() {
            return this.name;
        }

        public static RenderState valueOf(COSName cOSName) {
            if (cOSName == null) {
                return null;
            }
            return valueOf(cOSName.getName().toUpperCase());
        }
    }

    public PDOptionalContentGroup(String str) {
        this.dict.setItem(COSName.TYPE, (COSBase) COSName.OCG);
        setName(str);
    }

    public String getName() {
        return this.dict.getString(COSName.NAME);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup.RenderState getRenderState(com.tom_roush.pdfbox.rendering.RenderDestination r4) {
        /*
            r3 = this;
            com.tom_roush.pdfbox.cos.COSDictionary r0 = r3.dict
            java.lang.String r1 = "Usage"
            com.tom_roush.pdfbox.cos.COSBase r0 = r0.getDictionaryObject(r1)
            com.tom_roush.pdfbox.cos.COSDictionary r0 = (com.tom_roush.pdfbox.cos.COSDictionary) r0
            r1 = 0
            if (r0 == 0) goto L5c
            com.tom_roush.pdfbox.rendering.RenderDestination r2 = com.tom_roush.pdfbox.rendering.RenderDestination.PRINT
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L29
            java.lang.String r4 = "Print"
            com.tom_roush.pdfbox.cos.COSBase r4 = r0.getDictionaryObject(r4)
            com.tom_roush.pdfbox.cos.COSDictionary r4 = (com.tom_roush.pdfbox.cos.COSDictionary) r4
            if (r4 != 0) goto L20
            goto L45
        L20:
            java.lang.String r2 = "PrintState"
            com.tom_roush.pdfbox.cos.COSBase r4 = r4.getDictionaryObject(r2)
            com.tom_roush.pdfbox.cos.COSName r4 = (com.tom_roush.pdfbox.cos.COSName) r4
            goto L46
        L29:
            com.tom_roush.pdfbox.rendering.RenderDestination r2 = com.tom_roush.pdfbox.rendering.RenderDestination.VIEW
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L45
            java.lang.String r4 = "View"
            com.tom_roush.pdfbox.cos.COSBase r4 = r0.getDictionaryObject(r4)
            com.tom_roush.pdfbox.cos.COSDictionary r4 = (com.tom_roush.pdfbox.cos.COSDictionary) r4
            if (r4 != 0) goto L3c
            goto L45
        L3c:
            java.lang.String r2 = "ViewState"
            com.tom_roush.pdfbox.cos.COSBase r4 = r4.getDictionaryObject(r2)
            com.tom_roush.pdfbox.cos.COSName r4 = (com.tom_roush.pdfbox.cos.COSName) r4
            goto L46
        L45:
            r4 = r1
        L46:
            if (r4 != 0) goto L5d
            java.lang.String r4 = "Export"
            com.tom_roush.pdfbox.cos.COSBase r4 = r0.getDictionaryObject(r4)
            com.tom_roush.pdfbox.cos.COSDictionary r4 = (com.tom_roush.pdfbox.cos.COSDictionary) r4
            if (r4 != 0) goto L53
            goto L5c
        L53:
            java.lang.String r0 = "ExportState"
            com.tom_roush.pdfbox.cos.COSBase r4 = r4.getDictionaryObject(r0)
            com.tom_roush.pdfbox.cos.COSName r4 = (com.tom_roush.pdfbox.cos.COSName) r4
            goto L5d
        L5c:
            r4 = r1
        L5d:
            if (r4 != 0) goto L60
            goto L64
        L60:
            com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup$RenderState r1 = com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup.RenderState.valueOf(r4)
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup.getRenderState(com.tom_roush.pdfbox.rendering.RenderDestination):com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup$RenderState");
    }

    public void setName(String str) {
        this.dict.setString(COSName.NAME, str);
    }

    public String toString() {
        return super.toString() + " (" + getName() + ")";
    }

    public PDOptionalContentGroup(COSDictionary cOSDictionary) {
        super(cOSDictionary);
        COSBase item = cOSDictionary.getItem(COSName.TYPE);
        COSName cOSName = COSName.OCG;
        if (item.equals(cOSName)) {
            return;
        }
        throw new IllegalArgumentException("Provided dictionary is not of type '" + cOSName + OperatorName.SHOW_TEXT_LINE);
    }
}
