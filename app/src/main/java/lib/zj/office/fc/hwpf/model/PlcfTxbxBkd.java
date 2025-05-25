package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class PlcfTxbxBkd {
    private int[] CPs;
    private Tbkd[] tbkds;

    public PlcfTxbxBkd(byte[] bArr, int i10, int i11) {
        int size = Tbkd.getSize();
        int i12 = (i11 - 4) / (size + 4);
        int i13 = (i11 - (i12 * size)) / 4;
        this.CPs = new int[i13];
        this.tbkds = new Tbkd[i12];
        for (int i14 = 0; i14 < i13; i14++) {
            this.CPs[i14] = LittleEndian.getUShort(bArr, i10);
            i10 += 4;
        }
        for (int i15 = 0; i15 < i12; i15++) {
            this.tbkds[i15] = new Tbkd(bArr, i10);
            i10 += size;
        }
    }

    public int getCharPosition(int i10) {
        int[] iArr = this.CPs;
        if (iArr != null && iArr.length > i10) {
            return iArr[i10];
        }
        return -1;
    }

    public int[] getCharPositions() {
        return this.CPs;
    }

    public Tbkd[] getTbkds() {
        return this.tbkds;
    }
}
