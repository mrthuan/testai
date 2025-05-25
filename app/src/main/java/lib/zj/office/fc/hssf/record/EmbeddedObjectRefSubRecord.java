package lib.zj.office.fc.hssf.record;

import a0.a;
import androidx.activity.f;
import java.io.ByteArrayInputStream;
import lib.zj.office.fc.hssf.formula.ptg.Area3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.AreaPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.formula.ptg.Ref3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.RefPtg;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianInputStream;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class EmbeddedObjectRefSubRecord extends SubRecord {
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final short sid = 9;
    private int field_1_unknown_int;
    private Ptg field_2_refPtg;
    private byte[] field_2_unknownFormulaData;
    private boolean field_3_unicode_flag;
    private String field_4_ole_classname;
    private Byte field_4_unknownByte;
    private Integer field_5_stream_id;
    private byte[] field_6_unknown;

    public EmbeddedObjectRefSubRecord() {
        this.field_2_unknownFormulaData = new byte[]{2, 108, 106, 22, 1};
        this.field_6_unknown = EMPTY_BYTE_ARRAY;
        this.field_4_ole_classname = null;
    }

    private int getDataSize(int i10) {
        int i11 = i10 + 2;
        if (this.field_5_stream_id != null) {
            i11 += 4;
        }
        return i11 + this.field_6_unknown.length;
    }

    private int getStreamIDOffset(int i10) {
        int i11 = i10 + 6;
        String str = this.field_4_ole_classname;
        if (str != null) {
            i11 += 3;
            int length = str.length();
            if (length > 0) {
                int i12 = i11 + 1;
                if (this.field_3_unicode_flag) {
                    i11 = i12 + (length * 2);
                } else {
                    i11 = i12 + length;
                }
            }
        }
        if (i11 % 2 != 0) {
            return i11 + 1;
        }
        return i11;
    }

    private static byte[] readRawData(LittleEndianInput littleEndianInput, int i10) {
        if (i10 >= 0) {
            if (i10 == 0) {
                return EMPTY_BYTE_ARRAY;
            }
            byte[] bArr = new byte[i10];
            littleEndianInput.readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException(a.g("Negative size (", i10, ")"));
    }

    private static Ptg readRefPtg(byte[] bArr) {
        LittleEndianInputStream littleEndianInputStream = new LittleEndianInputStream(new ByteArrayInputStream(bArr));
        byte readByte = littleEndianInputStream.readByte();
        if (readByte != 36) {
            if (readByte != 37) {
                if (readByte != 58) {
                    if (readByte != 59) {
                        return null;
                    }
                    return new Area3DPtg(littleEndianInputStream);
                }
                return new Ref3DPtg(littleEndianInputStream);
            }
            return new AreaPtg(littleEndianInputStream);
        }
        return new RefPtg(littleEndianInputStream);
    }

    public String getOLEClassName() {
        return this.field_4_ole_classname;
    }

    public byte[] getObjectData() {
        return this.field_6_unknown;
    }

    public short getSid() {
        return (short) 9;
    }

    public Integer getStreamId() {
        return this.field_5_stream_id;
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        int size;
        int intValue;
        Ptg ptg = this.field_2_refPtg;
        if (ptg == null) {
            size = this.field_2_unknownFormulaData.length;
        } else {
            size = ptg.getSize();
        }
        int streamIDOffset = getStreamIDOffset(size);
        int dataSize = getDataSize(streamIDOffset);
        littleEndianOutput.writeShort(9);
        littleEndianOutput.writeShort(dataSize);
        littleEndianOutput.writeShort(streamIDOffset);
        littleEndianOutput.writeShort(size);
        littleEndianOutput.writeInt(this.field_1_unknown_int);
        Ptg ptg2 = this.field_2_refPtg;
        if (ptg2 == null) {
            littleEndianOutput.write(this.field_2_unknownFormulaData);
        } else {
            ptg2.write(littleEndianOutput);
        }
        int i10 = size + 12;
        if (this.field_4_ole_classname != null) {
            littleEndianOutput.writeByte(3);
            int length = this.field_4_ole_classname.length();
            littleEndianOutput.writeShort(length);
            i10 = i10 + 1 + 2;
            if (length > 0) {
                littleEndianOutput.writeByte(this.field_3_unicode_flag ? 1 : 0);
                int i11 = i10 + 1;
                if (this.field_3_unicode_flag) {
                    StringUtil.putUnicodeLE(this.field_4_ole_classname, littleEndianOutput);
                    i10 = i11 + (length * 2);
                } else {
                    StringUtil.putCompressedUnicode(this.field_4_ole_classname, littleEndianOutput);
                    i10 = i11 + length;
                }
            }
        }
        int i12 = streamIDOffset - (i10 - 6);
        if (i12 != 0) {
            if (i12 == 1) {
                Byte b10 = this.field_4_unknownByte;
                if (b10 == null) {
                    intValue = 0;
                } else {
                    intValue = b10.intValue();
                }
                littleEndianOutput.writeByte(intValue);
            } else {
                throw new IllegalStateException(f.k("Bad padding calculation (", streamIDOffset, ", ", i10, ")"));
            }
        }
        Integer num = this.field_5_stream_id;
        if (num != null) {
            littleEndianOutput.writeInt(num.intValue());
        }
        littleEndianOutput.write(this.field_6_unknown);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[ftPictFmla]\n    .f2unknown     = ");
        stringBuffer.append(HexDump.intToHex(this.field_1_unknown_int));
        stringBuffer.append("\n");
        if (this.field_2_refPtg == null) {
            stringBuffer.append("    .f3unknown     = ");
            stringBuffer.append(HexDump.toHex(this.field_2_unknownFormulaData));
            stringBuffer.append("\n");
        } else {
            stringBuffer.append("    .formula       = ");
            stringBuffer.append(this.field_2_refPtg.toString());
            stringBuffer.append("\n");
        }
        if (this.field_4_ole_classname != null) {
            stringBuffer.append("    .unicodeFlag   = ");
            stringBuffer.append(this.field_3_unicode_flag);
            stringBuffer.append("\n    .oleClassname  = ");
            stringBuffer.append(this.field_4_ole_classname);
            stringBuffer.append("\n");
        }
        if (this.field_4_unknownByte != null) {
            stringBuffer.append("    .f4unknown   = ");
            stringBuffer.append(HexDump.byteToHex(this.field_4_unknownByte.intValue()));
            stringBuffer.append("\n");
        }
        if (this.field_5_stream_id != null) {
            stringBuffer.append("    .streamId      = ");
            stringBuffer.append(HexDump.intToHex(this.field_5_stream_id.intValue()));
            stringBuffer.append("\n");
        }
        if (this.field_6_unknown.length > 0) {
            stringBuffer.append("    .f7unknown     = ");
            stringBuffer.append(HexDump.toHex(this.field_6_unknown));
            stringBuffer.append("\n");
        }
        stringBuffer.append("[/ftPictFmla]");
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public int getDataSize() {
        Ptg ptg = this.field_2_refPtg;
        return getDataSize(getStreamIDOffset(ptg == null ? this.field_2_unknownFormulaData.length : ptg.getSize()));
    }

    public EmbeddedObjectRefSubRecord(LittleEndianInput littleEndianInput, int i10) {
        int i11;
        int i12;
        int readShort = (i10 - 2) - littleEndianInput.readShort();
        int readUShort = littleEndianInput.readUShort();
        this.field_1_unknown_int = littleEndianInput.readInt();
        byte[] readRawData = readRawData(littleEndianInput, readUShort);
        int i13 = ((i11 - 2) - 4) - readUShort;
        Ptg readRefPtg = readRefPtg(readRawData);
        this.field_2_refPtg = readRefPtg;
        if (readRefPtg == null) {
            this.field_2_unknownFormulaData = readRawData;
        } else {
            this.field_2_unknownFormulaData = null;
        }
        int i14 = 0;
        if (i13 >= readShort + 3) {
            if (littleEndianInput.readByte() == 3) {
                int readUShort2 = littleEndianInput.readUShort();
                if (readUShort2 > 0) {
                    boolean z10 = (littleEndianInput.readByte() & 1) != 0;
                    this.field_3_unicode_flag = z10;
                    if (z10) {
                        this.field_4_ole_classname = StringUtil.readUnicodeLE(littleEndianInput, readUShort2);
                        i12 = (readUShort2 * 2) + 4;
                    } else {
                        this.field_4_ole_classname = StringUtil.readCompressedUnicode(littleEndianInput, readUShort2);
                        i12 = readUShort2 + 4;
                    }
                    i14 = i12;
                } else {
                    this.field_4_ole_classname = "";
                    i14 = 3;
                }
            } else {
                throw new RecordFormatException("Expected byte 0x03 here");
            }
        } else {
            this.field_4_ole_classname = null;
        }
        int i15 = i13 - i14;
        if ((i14 + readUShort) % 2 != 0) {
            byte readByte = littleEndianInput.readByte();
            i15--;
            if (this.field_2_refPtg != null && this.field_4_ole_classname == null) {
                this.field_4_unknownByte = Byte.valueOf(readByte);
            }
        }
        int i16 = i15 - readShort;
        if (i16 > 0) {
            System.err.println("Discarding " + i16 + " unexpected padding bytes ");
            readRawData(littleEndianInput, i16);
            i15 -= i16;
        }
        if (readShort >= 4) {
            this.field_5_stream_id = Integer.valueOf(littleEndianInput.readInt());
            i15 -= 4;
        } else {
            this.field_5_stream_id = null;
        }
        this.field_6_unknown = readRawData(littleEndianInput, i15);
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public Object clone() {
        return this;
    }
}
