package lib.zj.office.fc.poifs.storage;

import a6.h;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import lib.zj.office.fc.poifs.common.POIFSBigBlockSize;
import lib.zj.office.fc.poifs.common.POIFSConstants;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.IOUtils;
import lib.zj.office.fc.util.IntegerField;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.LongField;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;
import lib.zj.office.fc.util.ShortField;

/* loaded from: classes3.dex */
public final class HeaderBlock implements HeaderBlockConstants {
    private static final byte _default_value = -1;
    private static final POILogger _logger = POILogFactory.getLogger(HeaderBlock.class);
    private int _bat_count;
    private final byte[] _data;
    private int _property_start;
    private int _sbat_count;
    private int _sbat_start;
    private int _xbat_count;
    private int _xbat_start;
    private final POIFSBigBlockSize bigBlockSize;

    public HeaderBlock(InputStream inputStream) {
        this(readFirst512(inputStream));
        if (this.bigBlockSize.getBigBlockSize() != 512) {
            IOUtils.readFully(inputStream, new byte[this.bigBlockSize.getBigBlockSize() - 512]);
        }
    }

    private static IOException alertShortRead(int i10, int i11) {
        String str;
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 == 1) {
            str = "";
        } else {
            str = "s";
        }
        String concat = " byte".concat(str);
        return new IOException("Unable to read entire header; " + i10 + concat + " read; expected " + i11 + " bytes");
    }

    private static String longToHex(long j10) {
        return new String(HexDump.longToHex(j10));
    }

    private static byte[] readFirst512(InputStream inputStream) {
        byte[] bArr = new byte[512];
        int readFully = IOUtils.readFully(inputStream, bArr);
        if (readFully == 512) {
            return bArr;
        }
        throw alertShortRead(readFully, 512);
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

    public POIFSBigBlockSize getBigBlockSize() {
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

    public void setBATArray(int[] iArr) {
        int min = Math.min(iArr.length, 109);
        int i10 = 109 - min;
        int i11 = 76;
        for (int i12 = 0; i12 < min; i12++) {
            LittleEndian.putInt(this._data, i11, iArr[i12]);
            i11 += 4;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            LittleEndian.putInt(this._data, i11, -1);
            i11 += 4;
        }
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

    public void setXBATCount(int i10) {
        this._xbat_count = i10;
    }

    public void setXBATStart(int i10) {
        this._xbat_start = i10;
    }

    public void writeData(OutputStream outputStream) {
        new IntegerField(44, this._bat_count, this._data);
        new IntegerField(48, this._property_start, this._data);
        new IntegerField(60, this._sbat_start, this._data);
        new IntegerField(64, this._sbat_count, this._data);
        new IntegerField(68, this._xbat_start, this._data);
        new IntegerField(72, this._xbat_count, this._data);
        outputStream.write(this._data, 0, 512);
        for (int i10 = 512; i10 < this.bigBlockSize.getBigBlockSize(); i10++) {
            outputStream.write(0);
        }
    }

    public HeaderBlock(ByteBuffer byteBuffer) {
        this(IOUtils.toByteArray(byteBuffer, 512));
    }

    private HeaderBlock(byte[] bArr) {
        this._data = bArr;
        long j10 = LittleEndian.getLong(bArr, 0);
        if (j10 == -2226271756974174256L) {
            byte b10 = bArr[30];
            if (b10 == 12) {
                this.bigBlockSize = POIFSConstants.LARGER_BIG_BLOCK_SIZE_DETAILS;
            } else if (b10 == 9) {
                this.bigBlockSize = POIFSConstants.SMALLER_BIG_BLOCK_SIZE_DETAILS;
            } else {
                throw new IOException(h.g(new StringBuilder("Unsupported blocksize  (2^"), bArr[30], "). Expected 2^9 or 2^12."));
            }
            this._bat_count = new IntegerField(44, bArr).get();
            this._property_start = new IntegerField(48, bArr).get();
            this._sbat_start = new IntegerField(60, bArr).get();
            this._sbat_count = new IntegerField(64, bArr).get();
            this._xbat_start = new IntegerField(68, bArr).get();
            this._xbat_count = new IntegerField(72, bArr).get();
            return;
        }
        throw new IOException("Invalid header signature; read " + longToHex(j10) + ", expected " + longToHex(-2226271756974174256L));
    }

    public HeaderBlock(POIFSBigBlockSize pOIFSBigBlockSize) {
        this.bigBlockSize = pOIFSBigBlockSize;
        byte[] bArr = new byte[512];
        this._data = bArr;
        Arrays.fill(bArr, (byte) -1);
        new LongField(0, -2226271756974174256L, bArr);
        new IntegerField(8, 0, bArr);
        new IntegerField(12, 0, bArr);
        new IntegerField(16, 0, bArr);
        new IntegerField(20, 0, bArr);
        new ShortField(24, (short) 59, bArr);
        new ShortField(26, (short) 3, bArr);
        new ShortField(28, (short) -2, bArr);
        new ShortField(30, pOIFSBigBlockSize.getHeaderValue(), bArr);
        new IntegerField(32, 6, bArr);
        new IntegerField(36, 0, bArr);
        new IntegerField(40, 0, bArr);
        new IntegerField(52, 0, bArr);
        new IntegerField(56, 4096, bArr);
        this._bat_count = 0;
        this._sbat_count = 0;
        this._xbat_count = 0;
        this._property_start = -2;
        this._sbat_start = -2;
        this._xbat_start = -2;
    }
}
