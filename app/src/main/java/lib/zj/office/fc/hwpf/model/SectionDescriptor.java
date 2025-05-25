package lib.zj.office.fc.hwpf.model;

import a6.h;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class SectionDescriptor {
    private int fcMpr;
    private int fcSepx;

    /* renamed from: fn  reason: collision with root package name */
    private short f20676fn;
    private short fnMpr;

    public SectionDescriptor() {
    }

    public boolean equals(Object obj) {
        SectionDescriptor sectionDescriptor = (SectionDescriptor) obj;
        if (sectionDescriptor.f20676fn == this.f20676fn && sectionDescriptor.fnMpr == this.fnMpr) {
            return true;
        }
        return false;
    }

    public int getFc() {
        return this.fcSepx;
    }

    public void setFc(int i10) {
        this.fcSepx = i10;
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[12];
        LittleEndian.putShort(bArr, 0, this.f20676fn);
        LittleEndian.putInt(bArr, 2, this.fcSepx);
        LittleEndian.putShort(bArr, 6, this.fnMpr);
        LittleEndian.putInt(bArr, 8, this.fcMpr);
        return bArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[SED] (fn: ");
        sb2.append((int) this.f20676fn);
        sb2.append("; fcSepx: ");
        sb2.append(this.fcSepx);
        sb2.append("; fnMpr: ");
        sb2.append((int) this.fnMpr);
        sb2.append("; fcMpr: ");
        return h.g(sb2, this.fcMpr, ")");
    }

    public SectionDescriptor(byte[] bArr, int i10) {
        this.f20676fn = LittleEndian.getShort(bArr, i10);
        int i11 = i10 + 2;
        this.fcSepx = LittleEndian.getInt(bArr, i11);
        int i12 = i11 + 4;
        this.fnMpr = LittleEndian.getShort(bArr, i12);
        this.fcMpr = LittleEndian.getInt(bArr, i12 + 2);
    }
}
