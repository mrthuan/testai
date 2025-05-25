package lib.zj.office.fc.hslf.model.textproperties;

/* loaded from: classes3.dex */
public class AutoNumberTextProp {
    private int numberingType;
    private int start;

    public AutoNumberTextProp() {
        this.numberingType = -1;
        this.start = 0;
    }

    public int getNumberingType() {
        return this.numberingType;
    }

    public int getStart() {
        return this.start;
    }

    public void setNumberingType(int i10) {
        this.numberingType = i10;
    }

    public void setStart(int i10) {
        this.start = i10;
    }

    public AutoNumberTextProp(int i10, int i11) {
        this.numberingType = i10;
        this.start = i11;
    }

    public void dispose() {
    }
}
