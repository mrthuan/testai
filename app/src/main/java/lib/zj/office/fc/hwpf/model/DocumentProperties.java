package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.hwpf.model.types.DOPAbstractType;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class DocumentProperties extends DOPAbstractType {
    private byte[] _preserved;

    public DocumentProperties(byte[] bArr, int i10) {
        this(bArr, i10, DOPAbstractType.getSize());
    }

    @Override // lib.zj.office.fc.hwpf.model.types.DOPAbstractType
    public void serialize(byte[] bArr, int i10) {
        super.serialize(bArr, i10);
    }

    public DocumentProperties(byte[] bArr, int i10, int i11) {
        super.fillFields(bArr, i10);
        int size = DOPAbstractType.getSize();
        if (i11 != size) {
            this._preserved = LittleEndian.getByteArray(bArr, i10 + size, i11 - size);
        } else {
            this._preserved = new byte[0];
        }
    }
}
