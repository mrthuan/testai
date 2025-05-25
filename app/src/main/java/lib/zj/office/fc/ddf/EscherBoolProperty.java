package lib.zj.office.fc.ddf;

/* loaded from: classes3.dex */
public class EscherBoolProperty extends EscherSimpleProperty {
    public EscherBoolProperty(short s4, int i10) {
        super(s4, i10);
    }

    public boolean isFalse() {
        if (this.propertyValue == 0) {
            return true;
        }
        return false;
    }

    public boolean isTrue() {
        if (this.propertyValue != 0) {
            return true;
        }
        return false;
    }
}
