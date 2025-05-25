package lib.zj.office.fc.ddf;

/* loaded from: classes3.dex */
public abstract class EscherProperty {
    private short _id;

    public EscherProperty(short s4) {
        this._id = s4;
    }

    public short getId() {
        return this._id;
    }

    public String getName() {
        return EscherProperties.getPropertyName(getPropertyNumber());
    }

    public short getPropertyNumber() {
        return (short) (this._id & 16383);
    }

    public int getPropertySize() {
        return 6;
    }

    public boolean isBlipId() {
        if ((this._id & 16384) != 0) {
            return true;
        }
        return false;
    }

    public boolean isComplex() {
        if ((this._id & Short.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public abstract int serializeComplexPart(byte[] bArr, int i10);

    public abstract int serializeSimplePart(byte[] bArr, int i10);

    public EscherProperty(short s4, boolean z10, boolean z11) {
        this._id = (short) (s4 + (z10 ? (short) 32768 : (short) 0) + (z11 ? 16384 : 0));
    }
}
