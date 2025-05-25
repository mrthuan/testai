package lib.zj.office.fc.hslf.model.textproperties;

/* loaded from: classes3.dex */
public class TextProp implements Cloneable {
    protected int dataValue = 0;
    protected int maskInHeader;
    protected String propName;
    protected int sizeOfDataBlock;

    public TextProp(int i10, int i11, String str) {
        this.sizeOfDataBlock = i10;
        this.maskInHeader = i11;
        this.propName = str;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new InternalError(e10.getMessage());
        }
    }

    public int getMask() {
        return this.maskInHeader;
    }

    public String getName() {
        return this.propName;
    }

    public int getSize() {
        return this.sizeOfDataBlock;
    }

    public int getValue() {
        return this.dataValue;
    }

    public int getWriteMask() {
        return getMask();
    }

    public void setValue(int i10) {
        this.dataValue = i10;
    }

    public void dispose() {
    }
}
