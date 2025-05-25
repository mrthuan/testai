package lib.zj.office.fc.hpsf;

/* loaded from: classes3.dex */
public abstract class VariantTypeException extends HPSFException {
    private Object value;
    private long variantType;

    public VariantTypeException(long j10, Object obj, String str) {
        super(str);
        this.variantType = j10;
        this.value = obj;
    }

    public Object getValue() {
        return this.value;
    }

    public long getVariantType() {
        return this.variantType;
    }
}
