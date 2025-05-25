package lib.zj.office.fc.ddf;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes3.dex */
public class EscherRGBProperty extends EscherSimpleProperty {
    public EscherRGBProperty(short s4, int i10) {
        super(s4, i10);
    }

    public byte getBlue() {
        return (byte) ((this.propertyValue >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC);
    }

    public byte getGreen() {
        return (byte) ((this.propertyValue >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
    }

    public byte getRed() {
        return (byte) (this.propertyValue & FunctionEval.FunctionID.EXTERNAL_FUNC);
    }

    public int getRgbColor() {
        return this.propertyValue;
    }
}
