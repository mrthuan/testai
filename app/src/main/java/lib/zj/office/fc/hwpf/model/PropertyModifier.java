package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class PropertyModifier implements Cloneable {
    private static BitField _fComplex = new BitField(1);
    private static BitField _figrpprl = new BitField(65534);
    private static BitField _fisprm = new BitField(254);
    private static BitField _fval = new BitField(65280);
    private short value;

    public PropertyModifier(short s4) {
        this.value = s4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PropertyModifier.class == obj.getClass() && this.value == ((PropertyModifier) obj).value) {
            return true;
        }
        return false;
    }

    public short getIgrpprl() {
        if (isComplex()) {
            return _figrpprl.getShortValue(this.value);
        }
        throw new IllegalStateException("Not complex");
    }

    public short getIsprm() {
        if (!isComplex()) {
            return _fisprm.getShortValue(this.value);
        }
        throw new IllegalStateException("Not simple");
    }

    public short getVal() {
        if (!isComplex()) {
            return _fval.getShortValue(this.value);
        }
        throw new IllegalStateException("Not simple");
    }

    public short getValue() {
        return this.value;
    }

    public int hashCode() {
        return 31 + this.value;
    }

    public boolean isComplex() {
        return _fComplex.isSet(this.value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[PRM] (complex: ");
        sb2.append(isComplex());
        sb2.append("; ");
        if (isComplex()) {
            sb2.append("igrpprl: ");
            sb2.append((int) getIgrpprl());
            sb2.append("; ");
        } else {
            sb2.append("isprm: ");
            sb2.append((int) getIsprm());
            sb2.append("; val: ");
            sb2.append((int) getVal());
            sb2.append("; ");
        }
        sb2.append(")");
        return sb2.toString();
    }

    public PropertyModifier clone() {
        return new PropertyModifier(this.value);
    }
}
