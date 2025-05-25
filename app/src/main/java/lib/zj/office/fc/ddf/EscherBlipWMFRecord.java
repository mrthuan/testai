package lib.zj.office.fc.ddf;

import b.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.RecordFormatException;

/* loaded from: classes3.dex */
public class EscherBlipWMFRecord extends EscherBlipRecord {
    private static final int HEADER_SIZE = 8;
    public static final String RECORD_DESCRIPTION = "msofbtBlip";
    private byte field_10_compressionFlag;
    private byte field_11_filter;
    private byte[] field_12_data;
    private byte[] field_1_secondaryUID;
    private int field_2_cacheOfSize;
    private int field_3_boundaryTop;
    private int field_4_boundaryLeft;
    private int field_5_boundaryWidth;
    private int field_6_boundaryHeight;
    private int field_7_width;
    private int field_8_height;
    private int field_9_cacheOfSavedSize;

    public static byte[] compress(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
        for (byte b10 : bArr) {
            try {
                deflaterOutputStream.write(b10);
            } catch (IOException e10) {
                throw new RecordFormatException(e10.toString());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] decompress(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10 + 50, bArr2, 0, i11);
        InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr2));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int read = inflaterInputStream.read();
                if (read != -1) {
                    byteArrayOutputStream.write(read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            } catch (IOException e10) {
                throw new RecordFormatException(e10.toString());
            }
        }
    }

    @Override // lib.zj.office.fc.ddf.EscherBlipRecord, lib.zj.office.fc.ddf.EscherRecord
    public int fillFields(byte[] bArr, int i10, EscherRecordFactory escherRecordFactory) {
        int readHeader = readHeader(bArr, i10);
        int i11 = i10 + 8;
        byte[] bArr2 = new byte[16];
        this.field_1_secondaryUID = bArr2;
        System.arraycopy(bArr, i11 + 0, bArr2, 0, 16);
        this.field_2_cacheOfSize = LittleEndian.getInt(bArr, i11 + 16);
        this.field_3_boundaryTop = LittleEndian.getInt(bArr, i11 + 20);
        this.field_4_boundaryLeft = LittleEndian.getInt(bArr, i11 + 24);
        this.field_5_boundaryWidth = LittleEndian.getInt(bArr, i11 + 28);
        this.field_6_boundaryHeight = LittleEndian.getInt(bArr, i11 + 32);
        this.field_7_width = LittleEndian.getInt(bArr, i11 + 36);
        this.field_8_height = LittleEndian.getInt(bArr, i11 + 40);
        this.field_9_cacheOfSavedSize = LittleEndian.getInt(bArr, i11 + 44);
        this.field_10_compressionFlag = bArr[i11 + 48];
        this.field_11_filter = bArr[i11 + 49];
        int i12 = readHeader - 50;
        byte[] bArr3 = new byte[i12];
        this.field_12_data = bArr3;
        System.arraycopy(bArr, i11 + 50, bArr3, 0, i12);
        return 50 + i12 + 8;
    }

    public int getBoundaryHeight() {
        return this.field_6_boundaryHeight;
    }

    public int getBoundaryLeft() {
        return this.field_4_boundaryLeft;
    }

    public int getBoundaryTop() {
        return this.field_3_boundaryTop;
    }

    public int getBoundaryWidth() {
        return this.field_5_boundaryWidth;
    }

    public int getCacheOfSavedSize() {
        return this.field_9_cacheOfSavedSize;
    }

    public int getCacheOfSize() {
        return this.field_2_cacheOfSize;
    }

    public byte getCompressionFlag() {
        return this.field_10_compressionFlag;
    }

    public byte[] getData() {
        return this.field_12_data;
    }

    public byte getFilter() {
        return this.field_11_filter;
    }

    public int getHeight() {
        return this.field_8_height;
    }

    @Override // lib.zj.office.fc.ddf.EscherBlipRecord, lib.zj.office.fc.ddf.EscherRecord
    public String getRecordName() {
        return "Blip";
    }

    @Override // lib.zj.office.fc.ddf.EscherBlipRecord, lib.zj.office.fc.ddf.EscherRecord
    public int getRecordSize() {
        return this.field_12_data.length + 58;
    }

    public byte[] getSecondaryUID() {
        return this.field_1_secondaryUID;
    }

    public int getWidth() {
        return this.field_7_width;
    }

    @Override // lib.zj.office.fc.ddf.EscherBlipRecord, lib.zj.office.fc.ddf.EscherRecord
    public int serialize(int i10, byte[] bArr, EscherSerializationListener escherSerializationListener) {
        escherSerializationListener.beforeRecordSerialize(i10, getRecordId(), this);
        LittleEndian.putShort(bArr, i10, getOptions());
        LittleEndian.putShort(bArr, i10 + 2, getRecordId());
        LittleEndian.putInt(bArr, i10 + 4, this.field_12_data.length + 36);
        int i11 = i10 + 8;
        System.arraycopy(this.field_1_secondaryUID, 0, bArr, i11, 16);
        int i12 = i11 + 16;
        LittleEndian.putInt(bArr, i12, this.field_2_cacheOfSize);
        int i13 = i12 + 4;
        LittleEndian.putInt(bArr, i13, this.field_3_boundaryTop);
        int i14 = i13 + 4;
        LittleEndian.putInt(bArr, i14, this.field_4_boundaryLeft);
        int i15 = i14 + 4;
        LittleEndian.putInt(bArr, i15, this.field_5_boundaryWidth);
        int i16 = i15 + 4;
        LittleEndian.putInt(bArr, i16, this.field_6_boundaryHeight);
        int i17 = i16 + 4;
        LittleEndian.putInt(bArr, i17, this.field_7_width);
        int i18 = i17 + 4;
        LittleEndian.putInt(bArr, i18, this.field_8_height);
        int i19 = i18 + 4;
        LittleEndian.putInt(bArr, i19, this.field_9_cacheOfSavedSize);
        int i20 = i19 + 4;
        int i21 = i20 + 1;
        bArr[i20] = this.field_10_compressionFlag;
        int i22 = i21 + 1;
        bArr[i21] = this.field_11_filter;
        byte[] bArr2 = this.field_12_data;
        System.arraycopy(bArr2, 0, bArr, i22, bArr2.length);
        int length = i22 + this.field_12_data.length;
        int i23 = length - i10;
        escherSerializationListener.afterRecordSerialize(length, getRecordId(), i23, this);
        return i23;
    }

    public void setBoundaryHeight(int i10) {
        this.field_6_boundaryHeight = i10;
    }

    public void setBoundaryLeft(int i10) {
        this.field_4_boundaryLeft = i10;
    }

    public void setBoundaryTop(int i10) {
        this.field_3_boundaryTop = i10;
    }

    public void setBoundaryWidth(int i10) {
        this.field_5_boundaryWidth = i10;
    }

    public void setCacheOfSavedSize(int i10) {
        this.field_9_cacheOfSavedSize = i10;
    }

    public void setCacheOfSize(int i10) {
        this.field_2_cacheOfSize = i10;
    }

    public void setCompressionFlag(byte b10) {
        this.field_10_compressionFlag = b10;
    }

    public void setData(byte[] bArr) {
        this.field_12_data = bArr;
    }

    public void setFilter(byte b10) {
        this.field_11_filter = b10;
    }

    public void setHeight(int i10) {
        this.field_8_height = i10;
    }

    public void setSecondaryUID(byte[] bArr) {
        this.field_1_secondaryUID = bArr;
    }

    public void setWidth(int i10) {
        this.field_7_width = i10;
    }

    @Override // lib.zj.office.fc.ddf.EscherBlipRecord
    public String toString() {
        String obj;
        String property = System.getProperty("line.separator");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HexDump.dump(this.field_12_data, 0L, byteArrayOutputStream, 0);
            obj = byteArrayOutputStream.toString();
        } catch (Exception e10) {
            obj = e10.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append(":");
        sb2.append(property);
        sb2.append("  RecordId: 0x");
        sb2.append(HexDump.toHex(getRecordId()));
        sb2.append(property);
        sb2.append("  Options: 0x");
        sb2.append(HexDump.toHex(getOptions()));
        sb2.append(property);
        sb2.append("  Secondary UID: ");
        sb2.append(HexDump.toHex(this.field_1_secondaryUID));
        sb2.append(property);
        sb2.append("  CacheOfSize: ");
        a.k(sb2, this.field_2_cacheOfSize, property, "  BoundaryTop: ");
        a.k(sb2, this.field_3_boundaryTop, property, "  BoundaryLeft: ");
        a.k(sb2, this.field_4_boundaryLeft, property, "  BoundaryWidth: ");
        a.k(sb2, this.field_5_boundaryWidth, property, "  BoundaryHeight: ");
        a.k(sb2, this.field_6_boundaryHeight, property, "  X: ");
        a.k(sb2, this.field_7_width, property, "  Y: ");
        a.k(sb2, this.field_8_height, property, "  CacheOfSavedSize: ");
        a.k(sb2, this.field_9_cacheOfSavedSize, property, "  CompressionFlag: ");
        a.k(sb2, this.field_10_compressionFlag, property, "  Filter: ");
        sb2.append((int) this.field_11_filter);
        sb2.append(property);
        sb2.append("  Data:");
        sb2.append(property);
        sb2.append(obj);
        return sb2.toString();
    }
}
