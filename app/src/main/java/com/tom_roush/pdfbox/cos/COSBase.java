package com.tom_roush.pdfbox.cos;

import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes2.dex */
public abstract class COSBase implements COSObjectable {
    private boolean direct;

    public abstract Object accept(ICOSVisitor iCOSVisitor);

    public boolean isDirect() {
        return this.direct;
    }

    public void setDirect(boolean z10) {
        this.direct = z10;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this;
    }
}
