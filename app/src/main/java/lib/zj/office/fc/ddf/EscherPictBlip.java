package lib.zj.office.fc.ddf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;
import lib.zj.office.java.awt.Dimension;
import lib.zj.office.java.awt.Rectangle;

/* loaded from: classes3.dex */
public final class EscherPictBlip extends EscherBlipRecord {
    private static final int HEADER_SIZE = 8;
    public static final short RECORD_ID_EMF = -4070;
    public static final short RECORD_ID_PICT = -4068;
    public static final short RECORD_ID_WMF = -4069;
    private static final POILogger log = POILogFactory.getLogger(EscherPictBlip.class);
    private byte[] field_1_UID;
    private int field_2_cb;
    private int field_3_rcBounds_x1;
    private int field_3_rcBounds_x2;
    private int field_3_rcBounds_y1;
    private int field_3_rcBounds_y2;
    private int field_4_ptSize_h;
    private int field_4_ptSize_w;
    private int field_5_cbSave;
    private byte field_6_fCompression;
    private byte field_7_fFilter;
    private byte[] raw_pictureData;

    private static byte[] inflatePictureData(byte[] bArr) {
        try {
            InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[4096];
            while (true) {
                int read = inflaterInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e10) {
            log.log(POILogger.INFO, (Object) "Possibly corrupt compression or non-compressed data", (Throwable) e10);
            return bArr;
        }
    }

    @Override // lib.zj.office.fc.ddf.EscherBlipRecord, lib.zj.office.fc.ddf.EscherRecord
    public int fillFields(byte[] bArr, int i10, EscherRecordFactory escherRecordFactory) {
        int readHeader = readHeader(bArr, i10);
        int i11 = i10 + 8;
        byte[] bArr2 = new byte[16];
        this.field_1_UID = bArr2;
        System.arraycopy(bArr, i11, bArr2, 0, 16);
        int i12 = i11 + 16;
        this.field_2_cb = LittleEndian.getInt(bArr, i12);
        int i13 = i12 + 4;
        this.field_3_rcBounds_x1 = LittleEndian.getInt(bArr, i13);
        int i14 = i13 + 4;
        this.field_3_rcBounds_y1 = LittleEndian.getInt(bArr, i14);
        int i15 = i14 + 4;
        this.field_3_rcBounds_x2 = LittleEndian.getInt(bArr, i15);
        int i16 = i15 + 4;
        this.field_3_rcBounds_y2 = LittleEndian.getInt(bArr, i16);
        int i17 = i16 + 4;
        this.field_4_ptSize_w = LittleEndian.getInt(bArr, i17);
        int i18 = i17 + 4;
        this.field_4_ptSize_h = LittleEndian.getInt(bArr, i18);
        int i19 = i18 + 4;
        int i20 = LittleEndian.getInt(bArr, i19);
        this.field_5_cbSave = i20;
        int i21 = i19 + 4;
        this.field_6_fCompression = bArr[i21];
        int i22 = i21 + 1;
        this.field_7_fFilter = bArr[i22];
        byte[] bArr3 = new byte[i20];
        this.raw_pictureData = bArr3;
        System.arraycopy(bArr, i22 + 1, bArr3, 0, i20);
        if (this.field_6_fCompression == 0) {
            this.field_pictureData = inflatePictureData(this.raw_pictureData);
        } else {
            this.field_pictureData = this.raw_pictureData;
        }
        return readHeader + 8;
    }

    public Rectangle getBounds() {
        int i10 = this.field_3_rcBounds_x1;
        int i11 = this.field_3_rcBounds_y1;
        return new Rectangle(i10, i11, this.field_3_rcBounds_x2 - i10, this.field_3_rcBounds_y2 - i11);
    }

    public int getCompressedSize() {
        return this.field_5_cbSave;
    }

    @Override // lib.zj.office.fc.ddf.EscherBlipRecord, lib.zj.office.fc.ddf.EscherRecord
    public int getRecordSize() {
        return this.raw_pictureData.length + 58;
    }

    public Dimension getSizeEMU() {
        return new Dimension(this.field_4_ptSize_w, this.field_4_ptSize_h);
    }

    public byte[] getUID() {
        return this.field_1_UID;
    }

    public int getUncompressedSize() {
        return this.field_2_cb;
    }

    public boolean isCompressed() {
        if (this.field_6_fCompression == 0) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.ddf.EscherBlipRecord, lib.zj.office.fc.ddf.EscherRecord
    public int serialize(int i10, byte[] bArr, EscherSerializationListener escherSerializationListener) {
        escherSerializationListener.beforeRecordSerialize(i10, getRecordId(), this);
        LittleEndian.putShort(bArr, i10, getOptions());
        int i11 = i10 + 2;
        LittleEndian.putShort(bArr, i11, getRecordId());
        LittleEndian.putInt(bArr, getRecordSize() - 8);
        int i12 = i11 + 2 + 4;
        System.arraycopy(this.field_1_UID, 0, bArr, i12, 16);
        int i13 = i12 + 16;
        LittleEndian.putInt(bArr, i13, this.field_2_cb);
        int i14 = i13 + 4;
        LittleEndian.putInt(bArr, i14, this.field_3_rcBounds_x1);
        int i15 = i14 + 4;
        LittleEndian.putInt(bArr, i15, this.field_3_rcBounds_y1);
        int i16 = i15 + 4;
        LittleEndian.putInt(bArr, i16, this.field_3_rcBounds_x2);
        int i17 = i16 + 4;
        LittleEndian.putInt(bArr, i17, this.field_3_rcBounds_y2);
        int i18 = i17 + 4;
        LittleEndian.putInt(bArr, i18, this.field_4_ptSize_w);
        int i19 = i18 + 4;
        LittleEndian.putInt(bArr, i19, this.field_4_ptSize_h);
        int i20 = i19 + 4;
        LittleEndian.putInt(bArr, i20, this.field_5_cbSave);
        int i21 = i20 + 4;
        bArr[i21] = this.field_6_fCompression;
        int i22 = i21 + 1;
        bArr[i22] = this.field_7_fFilter;
        byte[] bArr2 = this.raw_pictureData;
        System.arraycopy(bArr2, 0, bArr, i22 + 1, bArr2.length);
        escherSerializationListener.afterRecordSerialize(getRecordSize() + i10, getRecordId(), getRecordSize(), this);
        return this.raw_pictureData.length + 25;
    }

    public void setBounds(Rectangle rectangle) {
        int i10 = rectangle.f20688x;
        this.field_3_rcBounds_x1 = i10;
        int i11 = rectangle.f20689y;
        this.field_3_rcBounds_y1 = i11;
        this.field_3_rcBounds_x2 = i10 + rectangle.width;
        this.field_3_rcBounds_y2 = i11 + rectangle.height;
    }

    public void setCompressed(boolean z10) {
        byte b10;
        if (z10) {
            b10 = 0;
        } else {
            b10 = -2;
        }
        this.field_6_fCompression = b10;
    }

    public void setCompressedSize(int i10) {
        this.field_5_cbSave = i10;
    }

    public void setSizeEMU(Dimension dimension) {
        this.field_4_ptSize_w = dimension.width;
        this.field_4_ptSize_h = dimension.height;
    }

    public void setUID(byte[] bArr) {
        this.field_1_UID = bArr;
    }

    public void setUncompressedSize(int i10) {
        this.field_2_cb = i10;
    }

    @Override // lib.zj.office.fc.ddf.EscherBlipRecord
    public String toString() {
        String hex = HexDump.toHex(this.field_pictureData, 32);
        return EscherPictBlip.class.getName() + ":\n  RecordId: 0x" + HexDump.toHex(getRecordId()) + "\n  Options: 0x" + HexDump.toHex(getOptions()) + "\n  UID: 0x" + HexDump.toHex(this.field_1_UID) + "\n  Uncompressed Size: " + HexDump.toHex(this.field_2_cb) + "\n  Bounds: " + getBounds() + "\n  Size in EMU: " + getSizeEMU() + "\n  Compressed Size: " + HexDump.toHex(this.field_5_cbSave) + "\n  Compression: " + HexDump.toHex(this.field_6_fCompression) + "\n  Filter: " + HexDump.toHex(this.field_7_fFilter) + "\n  Extra Data:\n" + hex;
    }
}
