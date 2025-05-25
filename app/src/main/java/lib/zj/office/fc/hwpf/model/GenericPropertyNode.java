package lib.zj.office.fc.hwpf.model;

import a6.h;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class GenericPropertyNode extends PropertyNode<GenericPropertyNode> {
    public GenericPropertyNode(int i10, int i11, byte[] bArr) {
        super(i10, i11, bArr);
    }

    public byte[] getBytes() {
        return (byte[]) this._buf;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("GenericPropertyNode [");
        sb2.append(getStart());
        sb2.append("; ");
        sb2.append(getEnd());
        sb2.append(") ");
        if (getBytes() != null) {
            str = h.g(new StringBuilder(), getBytes().length, " byte(s)");
        } else {
            str = "null";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
