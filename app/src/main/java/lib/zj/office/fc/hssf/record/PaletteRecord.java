package lib.zj.office.fc.hssf.record;

import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class PaletteRecord extends StandardRecord {
    public static final short FIRST_COLOR_INDEX = 8;
    public static final byte STANDARD_PALETTE_SIZE = 56;
    public static final short sid = 146;
    private final List<PColor> _colors;

    public PaletteRecord() {
        PColor[] createDefaultPalette = createDefaultPalette();
        this._colors = new ArrayList(createDefaultPalette.length);
        for (PColor pColor : createDefaultPalette) {
            this._colors.add(pColor);
        }
    }

    private static PColor[] createDefaultPalette() {
        return new PColor[]{pc(0, 0, 0), pc(FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC), pc(FunctionEval.FunctionID.EXTERNAL_FUNC, 0, 0), pc(0, FunctionEval.FunctionID.EXTERNAL_FUNC, 0), pc(0, 0, FunctionEval.FunctionID.EXTERNAL_FUNC), pc(FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC, 0), pc(FunctionEval.FunctionID.EXTERNAL_FUNC, 0, FunctionEval.FunctionID.EXTERNAL_FUNC), pc(0, FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC), pc(128, 0, 0), pc(0, 128, 0), pc(0, 0, 128), pc(128, 128, 0), pc(128, 0, 128), pc(0, 128, 128), pc(192, 192, 192), pc(128, 128, 128), pc(153, 153, FunctionEval.FunctionID.EXTERNAL_FUNC), pc(153, 51, 102), pc(FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC, 204), pc(204, FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC), pc(102, 0, 102), pc(FunctionEval.FunctionID.EXTERNAL_FUNC, 128, 128), pc(0, 102, 204), pc(204, 204, FunctionEval.FunctionID.EXTERNAL_FUNC), pc(0, 0, 128), pc(FunctionEval.FunctionID.EXTERNAL_FUNC, 0, FunctionEval.FunctionID.EXTERNAL_FUNC), pc(FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC, 0), pc(0, FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC), pc(128, 0, 128), pc(128, 0, 0), pc(0, 128, 128), pc(0, 0, FunctionEval.FunctionID.EXTERNAL_FUNC), pc(0, 204, FunctionEval.FunctionID.EXTERNAL_FUNC), pc(204, FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC), pc(204, FunctionEval.FunctionID.EXTERNAL_FUNC, 204), pc(FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC, 153), pc(153, 204, FunctionEval.FunctionID.EXTERNAL_FUNC), pc(FunctionEval.FunctionID.EXTERNAL_FUNC, 153, 204), pc(204, 153, FunctionEval.FunctionID.EXTERNAL_FUNC), pc(FunctionEval.FunctionID.EXTERNAL_FUNC, 204, 153), pc(51, 102, FunctionEval.FunctionID.EXTERNAL_FUNC), pc(51, 204, 204), pc(153, 204, 0), pc(FunctionEval.FunctionID.EXTERNAL_FUNC, 204, 0), pc(FunctionEval.FunctionID.EXTERNAL_FUNC, 153, 0), pc(FunctionEval.FunctionID.EXTERNAL_FUNC, 102, 0), pc(102, 102, 153), pc(ShapeTypes.FLOW_CHART_EXTRACT, ShapeTypes.FLOW_CHART_EXTRACT, ShapeTypes.FLOW_CHART_EXTRACT), pc(0, 51, 102), pc(51, 153, 102), pc(0, 51, 0), pc(51, 51, 0), pc(153, 51, 0), pc(153, 51, 102), pc(51, 51, 153), pc(51, 51, 51)};
    }

    private static PColor pc(int i10, int i11, int i12) {
        return new PColor(i10, i11, i12);
    }

    public byte[] getColor(int i10) {
        int i11 = i10 - 8;
        if (i11 >= 0 && i11 < this._colors.size()) {
            return this._colors.get(i11).getTriplet();
        }
        return null;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return (this._colors.size() * 4) + 2;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this._colors.size());
        for (int i10 = 0; i10 < this._colors.size(); i10++) {
            this._colors.get(i10).serialize(littleEndianOutput);
        }
    }

    public void setColor(short s4, byte b10, byte b11, byte b12) {
        int i10 = s4 - 8;
        if (i10 >= 0 && i10 < 56) {
            while (this._colors.size() <= i10) {
                this._colors.add(new PColor(0, 0, 0));
            }
            this._colors.set(i10, new PColor(b10, b11, b12));
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[PALETTE]\n  numcolors     = ");
        stringBuffer.append(this._colors.size());
        stringBuffer.append('\n');
        for (int i10 = 0; i10 < this._colors.size(); i10++) {
            stringBuffer.append("* colornum      = ");
            stringBuffer.append(i10);
            stringBuffer.append('\n');
            stringBuffer.append(this._colors.get(i10).toString());
            stringBuffer.append("/*colornum      = ");
            stringBuffer.append(i10);
            stringBuffer.append('\n');
        }
        stringBuffer.append("[/PALETTE]\n");
        return stringBuffer.toString();
    }

    /* loaded from: classes3.dex */
    public static final class PColor {
        public static final short ENCODED_SIZE = 4;
        private int _blue;
        private int _green;
        private int _red;

        public PColor(int i10, int i11, int i12) {
            this._red = i10;
            this._green = i11;
            this._blue = i12;
        }

        public byte[] getTriplet() {
            return new byte[]{(byte) this._red, (byte) this._green, (byte) this._blue};
        }

        public void serialize(LittleEndianOutput littleEndianOutput) {
            littleEndianOutput.writeByte(this._red);
            littleEndianOutput.writeByte(this._green);
            littleEndianOutput.writeByte(this._blue);
            littleEndianOutput.writeByte(0);
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("  red   = ");
            stringBuffer.append(this._red & FunctionEval.FunctionID.EXTERNAL_FUNC);
            stringBuffer.append("\n  green = ");
            stringBuffer.append(this._green & FunctionEval.FunctionID.EXTERNAL_FUNC);
            stringBuffer.append("\n  blue  = ");
            stringBuffer.append(this._blue & FunctionEval.FunctionID.EXTERNAL_FUNC);
            stringBuffer.append('\n');
            return stringBuffer.toString();
        }

        public PColor(RecordInputStream recordInputStream) {
            this._red = recordInputStream.readByte();
            this._green = recordInputStream.readByte();
            this._blue = recordInputStream.readByte();
            recordInputStream.readByte();
        }
    }

    public PaletteRecord(RecordInputStream recordInputStream) {
        short readShort = recordInputStream.readShort();
        this._colors = new ArrayList(readShort);
        for (int i10 = 0; i10 < readShort; i10++) {
            this._colors.add(new PColor(recordInputStream));
        }
    }
}
