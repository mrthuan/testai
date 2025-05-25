package lib.zj.office.fc.hssf.record;

import a0.d;
import androidx.activity.r;
import java.io.ByteArrayOutputStream;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.LittleEndianOutputStream;

/* loaded from: classes3.dex */
public abstract class SubRecord {
    public static SubRecord createSubRecord(LittleEndianInput littleEndianInput, int i10) {
        int readUShort = littleEndianInput.readUShort();
        int readUShort2 = littleEndianInput.readUShort();
        if (readUShort != 0) {
            if (readUShort != 6) {
                if (readUShort != 9) {
                    if (readUShort != 19) {
                        if (readUShort != 21) {
                            if (readUShort != 12) {
                                if (readUShort != 13) {
                                    return new UnknownSubRecord(littleEndianInput, readUShort, readUShort2);
                                }
                                return new NoteStructureSubRecord(littleEndianInput, readUShort2);
                            }
                            return new FtCblsSubRecord(littleEndianInput, readUShort2);
                        }
                        return new CommonObjectDataSubRecord(littleEndianInput, readUShort2);
                    }
                    return new LbsDataSubRecord(littleEndianInput, readUShort2, i10);
                }
                return new EmbeddedObjectRefSubRecord(littleEndianInput, readUShort2);
            }
            return new GroupMarkerSubRecord(littleEndianInput, readUShort2);
        }
        return new EndSubRecord(littleEndianInput, readUShort2);
    }

    public abstract Object clone();

    public abstract int getDataSize();

    public boolean isTerminating() {
        return false;
    }

    public abstract void serialize(LittleEndianOutput littleEndianOutput);

    public byte[] serialize() {
        int dataSize = getDataSize() + 4;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(dataSize);
        serialize(new LittleEndianOutputStream(byteArrayOutputStream));
        if (byteArrayOutputStream.size() == dataSize) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new RuntimeException("write size mismatch");
    }

    /* loaded from: classes3.dex */
    public static final class UnknownSubRecord extends SubRecord {
        private final byte[] _data;
        private final int _sid;

        public UnknownSubRecord(LittleEndianInput littleEndianInput, int i10, int i11) {
            this._sid = i10;
            byte[] bArr = new byte[i11];
            littleEndianInput.readFully(bArr);
            this._data = bArr;
        }

        @Override // lib.zj.office.fc.hssf.record.SubRecord
        public int getDataSize() {
            return this._data.length;
        }

        @Override // lib.zj.office.fc.hssf.record.SubRecord
        public void serialize(LittleEndianOutput littleEndianOutput) {
            littleEndianOutput.writeShort(this._sid);
            littleEndianOutput.writeShort(this._data.length);
            littleEndianOutput.write(this._data);
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer(64);
            d.h(UnknownSubRecord.class, stringBuffer, " [sid=");
            r.j(this._sid, stringBuffer, " size=");
            stringBuffer.append(this._data.length);
            stringBuffer.append(" : ");
            stringBuffer.append(HexDump.toHex(this._data));
            stringBuffer.append("]\n");
            return stringBuffer.toString();
        }

        @Override // lib.zj.office.fc.hssf.record.SubRecord
        public Object clone() {
            return this;
        }
    }
}
