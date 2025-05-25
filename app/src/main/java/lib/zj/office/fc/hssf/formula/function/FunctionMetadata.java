package lib.zj.office.fc.hssf.formula.function;

import a0.d;

/* loaded from: classes3.dex */
public final class FunctionMetadata {
    private static final short FUNCTION_MAX_PARAMS = 30;
    private final int _index;
    private final int _maxParams;
    private final int _minParams;
    private final String _name;
    private final byte[] _parameterClassCodes;
    private final byte _returnClassCode;

    public FunctionMetadata(int i10, String str, int i11, int i12, byte b10, byte[] bArr) {
        this._index = i10;
        this._name = str;
        this._minParams = i11;
        this._maxParams = i12;
        this._returnClassCode = b10;
        this._parameterClassCodes = bArr;
    }

    public int getIndex() {
        return this._index;
    }

    public int getMaxParams() {
        return this._maxParams;
    }

    public int getMinParams() {
        return this._minParams;
    }

    public String getName() {
        return this._name;
    }

    public byte[] getParameterClassCodes() {
        return (byte[]) this._parameterClassCodes.clone();
    }

    public byte getReturnClassCode() {
        return this._returnClassCode;
    }

    public boolean hasFixedArgsLength() {
        if (this._minParams == this._maxParams) {
            return true;
        }
        return false;
    }

    public boolean hasUnlimitedVarags() {
        if (30 == this._maxParams) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        d.h(FunctionMetadata.class, stringBuffer, " [");
        stringBuffer.append(this._index);
        stringBuffer.append(" ");
        stringBuffer.append(this._name);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
