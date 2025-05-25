package com.tom_roush.pdfbox.pdfwriter;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSObjectKey;
import lib.zj.office.fc.hpsf.Variant;

/* loaded from: classes2.dex */
public class COSWriterXRefEntry implements Comparable<COSWriterXRefEntry> {
    private static final COSWriterXRefEntry NULLENTRY;
    private boolean free = false;
    private COSObjectKey key;
    private COSBase object;
    private long offset;

    static {
        COSWriterXRefEntry cOSWriterXRefEntry = new COSWriterXRefEntry(0L, null, new COSObjectKey(0L, Variant.VT_ILLEGAL));
        NULLENTRY = cOSWriterXRefEntry;
        cOSWriterXRefEntry.setFree(true);
    }

    public COSWriterXRefEntry(long j10, COSBase cOSBase, COSObjectKey cOSObjectKey) {
        setOffset(j10);
        setObject(cOSBase);
        setKey(cOSObjectKey);
    }

    public static COSWriterXRefEntry getNullEntry() {
        return NULLENTRY;
    }

    private void setKey(COSObjectKey cOSObjectKey) {
        this.key = cOSObjectKey;
    }

    private void setObject(COSBase cOSBase) {
        this.object = cOSBase;
    }

    public COSObjectKey getKey() {
        return this.key;
    }

    public COSBase getObject() {
        return this.object;
    }

    public long getOffset() {
        return this.offset;
    }

    public boolean isFree() {
        return this.free;
    }

    public void setFree(boolean z10) {
        this.free = z10;
    }

    public final void setOffset(long j10) {
        this.offset = j10;
    }

    @Override // java.lang.Comparable
    public int compareTo(COSWriterXRefEntry cOSWriterXRefEntry) {
        if (cOSWriterXRefEntry == null || getKey().getNumber() < cOSWriterXRefEntry.getKey().getNumber()) {
            return -1;
        }
        return getKey().getNumber() > cOSWriterXRefEntry.getKey().getNumber() ? 1 : 0;
    }
}
