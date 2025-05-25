package lib.zj.office.fc.fs.storage;

import a6.h;
import java.io.IOException;
import java.io.InputStream;
import lib.zj.office.fc.fs.filesystem.BlockSize;
import lib.zj.office.fc.fs.filesystem.CFBConstants;
import lib.zj.office.fc.util.HexDump;

/* loaded from: classes3.dex */
public final class HeaderBlock {
    public static final int _bat_array_offset = 76;
    public static final int _bat_count_offset = 44;
    public static final int _max_bats_in_header = 109;
    public static final int _property_start_offset = 48;
    public static final int _sbat_block_count_offset = 64;
    public static final int _sbat_start_offset = 60;
    public static final long _signature = -2226271756974174256L;
    public static final int _signature_offset = 0;
    public static final int _xbat_count_offset = 72;
    public static final int _xbat_start_offset = 68;
    private int _bat_count;
    private byte[] _data;
    private int _property_start;
    private int _sbat_count;
    private int _sbat_start;
    private int _xbat_count;
    private int _xbat_start;
    private BlockSize bigBlockSize;

    public HeaderBlock(InputStream inputStream) {
        byte[] bArr = new byte[512];
        this._data = bArr;
        inputStream.read(bArr);
        long j10 = LittleEndian.getLong(this._data, 0);
        if (j10 == -2226271756974174256L) {
            byte[] bArr2 = this._data;
            byte b10 = bArr2[30];
            if (b10 == 12) {
                this.bigBlockSize = CFBConstants.LARGER_BIG_BLOCK_SIZE_DETAILS;
            } else if (b10 == 9) {
                this.bigBlockSize = CFBConstants.SMALLER_BIG_BLOCK_SIZE_DETAILS;
            } else {
                throw new IOException(h.g(new StringBuilder("Unsupported blocksize  (2^"), this._data[30], "). Expected 2^9 or 2^12."));
            }
            this._bat_count = LittleEndian.getInt(bArr2, 44);
            this._property_start = LittleEndian.getInt(this._data, 48);
            this._sbat_start = LittleEndian.getInt(this._data, 60);
            this._sbat_count = LittleEndian.getInt(this._data, 64);
            this._xbat_start = LittleEndian.getInt(this._data, 68);
            this._xbat_count = LittleEndian.getInt(this._data, 72);
            return;
        }
        throw new IOException("Invalid header signature; read " + longToHex(j10) + ", expected " + longToHex(-2226271756974174256L));
    }

    private String longToHex(long j10) {
        return new String(HexDump.longToHex(j10));
    }

    public int[] getBATArray() {
        int min = Math.min(this._bat_count, 109);
        int[] iArr = new int[min];
        int i10 = 76;
        for (int i11 = 0; i11 < min; i11++) {
            iArr[i11] = LittleEndian.getInt(this._data, i10);
            i10 += 4;
        }
        return iArr;
    }

    public int getBATCount() {
        return this._bat_count;
    }

    public BlockSize getBigBlockSize() {
        return this.bigBlockSize;
    }

    public int getPropertyStart() {
        return this._property_start;
    }

    public int getSBATCount() {
        return this._sbat_count;
    }

    public int getSBATStart() {
        return this._sbat_start;
    }

    public int getXBATCount() {
        return this._xbat_count;
    }

    public int getXBATIndex() {
        return this._xbat_start;
    }

    public void setBATCount(int i10) {
        this._bat_count = i10;
    }

    public void setPropertyStart(int i10) {
        this._property_start = i10;
    }

    public void setSBATBlockCount(int i10) {
        this._sbat_count = i10;
    }

    public void setSBATStart(int i10) {
        this._sbat_start = i10;
    }

    public void dispose() {
    }
}
