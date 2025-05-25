package com.tom_roush.pdfbox.cos;

import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class UnmodifiableCOSDictionary extends COSDictionary {
    public UnmodifiableCOSDictionary(COSDictionary cOSDictionary) {
        this.items = cOSDictionary.items;
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void addAll(COSDictionary cOSDictionary) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void mergeInto(COSDictionary cOSDictionary) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void removeItem(COSName cOSName) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setBoolean(String str, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setDate(String str, Calendar calendar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setEmbeddedDate(String str, String str2, Calendar calendar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setEmbeddedInt(String str, String str2, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setEmbeddedString(String str, String str2, String str3) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setFlag(COSName cOSName, int i10, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setFloat(String str, float f10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setInt(String str, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setItem(COSName cOSName, COSBase cOSBase) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setLong(String str, long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setName(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary, com.tom_roush.pdfbox.cos.COSUpdateInfo
    public void setNeedToBeUpdated(boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setString(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setBoolean(COSName cOSName, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setDate(COSName cOSName, Calendar calendar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setEmbeddedDate(String str, COSName cOSName, Calendar calendar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setEmbeddedInt(String str, COSName cOSName, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setEmbeddedString(String str, COSName cOSName, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setFloat(COSName cOSName, float f10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setInt(COSName cOSName, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setItem(COSName cOSName, COSObjectable cOSObjectable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setLong(COSName cOSName, long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setName(COSName cOSName, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setString(COSName cOSName, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setItem(String str, COSObjectable cOSObjectable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary
    public void setItem(String str, COSBase cOSBase) {
        throw new UnsupportedOperationException();
    }
}
