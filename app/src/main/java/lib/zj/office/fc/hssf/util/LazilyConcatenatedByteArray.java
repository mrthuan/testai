package lib.zj.office.fc.hssf.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class LazilyConcatenatedByteArray {
    private final List<byte[]> arrays = new ArrayList(1);

    public void clear() {
        this.arrays.clear();
    }

    public void concatenate(byte[] bArr) {
        if (bArr != null) {
            this.arrays.add(bArr);
            return;
        }
        throw new IllegalArgumentException("array cannot be null");
    }

    public byte[] toArray() {
        if (this.arrays.isEmpty()) {
            return null;
        }
        if (this.arrays.size() > 1) {
            int i10 = 0;
            for (byte[] bArr : this.arrays) {
                i10 += bArr.length;
            }
            byte[] bArr2 = new byte[i10];
            int i11 = 0;
            for (byte[] bArr3 : this.arrays) {
                System.arraycopy(bArr3, 0, bArr2, i11, bArr3.length);
                i11 += bArr3.length;
            }
            this.arrays.clear();
            this.arrays.add(bArr2);
        }
        return this.arrays.get(0);
    }
}
