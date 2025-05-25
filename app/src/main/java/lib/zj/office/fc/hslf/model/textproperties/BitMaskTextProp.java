package lib.zj.office.fc.hslf.model.textproperties;

/* loaded from: classes3.dex */
public class BitMaskTextProp extends TextProp {
    private int[] subPropMasks;
    private boolean[] subPropMatches;
    private String[] subPropNames;

    public BitMaskTextProp(int i10, int i11, String str, String[] strArr) {
        super(i10, i11, "bitmask");
        this.subPropNames = strArr;
        this.propName = str;
        this.subPropMasks = new int[strArr.length];
        this.subPropMatches = new boolean[strArr.length];
        int i12 = 0;
        while (true) {
            int[] iArr = this.subPropMasks;
            if (i12 < iArr.length) {
                iArr[i12] = 1 << i12;
                i12++;
            } else {
                return;
            }
        }
    }

    @Override // lib.zj.office.fc.hslf.model.textproperties.TextProp
    public Object clone() {
        BitMaskTextProp bitMaskTextProp = (BitMaskTextProp) super.clone();
        bitMaskTextProp.subPropMatches = new boolean[this.subPropMatches.length];
        return bitMaskTextProp;
    }

    public boolean[] getSubPropMatches() {
        return this.subPropMatches;
    }

    public String[] getSubPropNames() {
        return this.subPropNames;
    }

    public boolean getSubValue(int i10) {
        return this.subPropMatches[i10];
    }

    @Override // lib.zj.office.fc.hslf.model.textproperties.TextProp
    public int getWriteMask() {
        return this.dataValue;
    }

    public void setSubValue(boolean z10, int i10) {
        boolean[] zArr = this.subPropMatches;
        if (zArr[i10] == z10) {
            return;
        }
        if (z10) {
            this.dataValue += this.subPropMasks[i10];
        } else {
            this.dataValue -= this.subPropMasks[i10];
        }
        zArr[i10] = z10;
    }

    @Override // lib.zj.office.fc.hslf.model.textproperties.TextProp
    public void setValue(int i10) {
        this.dataValue = i10;
        int i11 = 0;
        while (true) {
            boolean[] zArr = this.subPropMatches;
            if (i11 < zArr.length) {
                zArr[i11] = false;
                if ((this.dataValue & this.subPropMasks[i11]) != 0) {
                    zArr[i11] = true;
                }
                i11++;
            } else {
                return;
            }
        }
    }
}
