package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class Tbkd {
    private short dcpDepend;
    private boolean fMarkDelete;
    private boolean fTextOverflow;
    private boolean fUnk;
    private short itxbxs;

    public Tbkd(byte[] bArr, int i10) {
        boolean z10;
        boolean z11;
        this.itxbxs = LittleEndian.getShort(bArr, i10);
        this.dcpDepend = LittleEndian.getShort(bArr, i10 + 2);
        short s4 = LittleEndian.getShort(bArr, i10 + 4);
        if ((s4 & 32) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.fMarkDelete = z10;
        if ((s4 & 16) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.fUnk = z11;
        this.fTextOverflow = (s4 & 8) != 0;
    }

    public static int getSize() {
        return 6;
    }

    public int getTxbxIndex() {
        return this.itxbxs;
    }
}
