package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.hwpf.model.types.FSPAAbstractType;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class FSPA extends FSPAAbstractType {
    @Deprecated
    public static final int FSPA_SIZE = FSPAAbstractType.getSize();

    public FSPA() {
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[FSPA_SIZE];
        serialize(bArr, 0);
        return bArr;
    }

    public FSPA(byte[] bArr, int i10) {
        fillFields(bArr, i10);
    }
}
