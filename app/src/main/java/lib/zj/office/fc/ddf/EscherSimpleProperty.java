package lib.zj.office.fc.ddf;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class EscherSimpleProperty extends EscherProperty {
    protected int propertyValue;

    public EscherSimpleProperty(short s4, int i10) {
        super(s4);
        this.propertyValue = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EscherSimpleProperty)) {
            return false;
        }
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) obj;
        if (this.propertyValue == escherSimpleProperty.propertyValue && getId() == escherSimpleProperty.getId()) {
            return true;
        }
        return false;
    }

    public int getPropertyValue() {
        return this.propertyValue;
    }

    public int hashCode() {
        return this.propertyValue;
    }

    @Override // lib.zj.office.fc.ddf.EscherProperty
    public int serializeComplexPart(byte[] bArr, int i10) {
        return 0;
    }

    @Override // lib.zj.office.fc.ddf.EscherProperty
    public int serializeSimplePart(byte[] bArr, int i10) {
        LittleEndian.putShort(bArr, i10, getId());
        LittleEndian.putInt(bArr, i10 + 2, this.propertyValue);
        return 6;
    }

    public String toString() {
        return "propNum: " + ((int) getPropertyNumber()) + ", RAW: 0x" + HexDump.toHex(getId()) + ", propName: " + EscherProperties.getPropertyName(getPropertyNumber()) + ", complex: " + isComplex() + ", blipId: " + isBlipId() + ", value: " + this.propertyValue + " (0x" + HexDump.toHex(this.propertyValue) + ")";
    }

    public EscherSimpleProperty(short s4, boolean z10, boolean z11, int i10) {
        super(s4, z10, z11);
        this.propertyValue = i10;
    }
}
