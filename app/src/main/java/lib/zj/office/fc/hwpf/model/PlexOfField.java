package lib.zj.office.fc.hwpf.model;

import java.text.MessageFormat;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public class PlexOfField {
    private final FieldDescriptor fld;
    private final GenericPropertyNode propertyNode;

    @Deprecated
    public PlexOfField(int i10, int i11, byte[] bArr) {
        this.propertyNode = new GenericPropertyNode(i10, i11, bArr);
        this.fld = new FieldDescriptor(bArr);
    }

    public int getFcEnd() {
        return this.propertyNode.getEnd();
    }

    public int getFcStart() {
        return this.propertyNode.getStart();
    }

    public FieldDescriptor getFld() {
        return this.fld;
    }

    public String toString() {
        return MessageFormat.format("[{0}, {1}) - FLD - 0x{2}; 0x{3}", Integer.valueOf(getFcStart()), Integer.valueOf(getFcEnd()), Integer.toHexString(this.fld.getBoundaryType() & FunctionEval.FunctionID.EXTERNAL_FUNC), Integer.toHexString(this.fld.getFlt() & 255));
    }

    public PlexOfField(GenericPropertyNode genericPropertyNode) {
        this.propertyNode = genericPropertyNode;
        this.fld = new FieldDescriptor(genericPropertyNode.getBytes());
    }
}
