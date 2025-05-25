package lib.zj.office.fc.hssf.record;

import a0.a;
import androidx.activity.f;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import lib.zj.office.fc.hssf.record.crypto.Biff8DecryptingStream;
import lib.zj.office.fc.hssf.record.crypto.Biff8EncryptionKey;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianInputStream;

/* loaded from: classes3.dex */
public final class RecordInputStream implements LittleEndianInput {
    private static final int DATA_LEN_NEEDS_TO_BE_READ = -1;
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final int INVALID_SID_VALUE = -1;
    public static final short MAX_RECORD_DATA_SIZE = 8224;
    private final BiffHeaderInput _bhi;
    private int _currentDataLength;
    private int _currentDataOffset;
    private int _currentSid;
    private final LittleEndianInput _dataInput;
    private int _nextSid;

    /* loaded from: classes3.dex */
    public static final class LeftoverDataException extends RuntimeException {
        public LeftoverDataException(int i10, int i11) {
            super("Initialisation of record 0x" + Integer.toHexString(i10).toUpperCase() + " left " + i11 + " bytes remaining still to be read.");
        }
    }

    /* loaded from: classes3.dex */
    public static final class SimpleHeaderInput implements BiffHeaderInput {
        private final LittleEndianInput _lei;

        public SimpleHeaderInput(InputStream inputStream) {
            this._lei = RecordInputStream.getLEI(inputStream);
        }

        @Override // lib.zj.office.fc.hssf.record.BiffHeaderInput
        public int available() {
            return this._lei.available();
        }

        @Override // lib.zj.office.fc.hssf.record.BiffHeaderInput
        public int readDataSize() {
            return this._lei.readUShort();
        }

        @Override // lib.zj.office.fc.hssf.record.BiffHeaderInput
        public int readRecordSID() {
            return this._lei.readUShort();
        }
    }

    public RecordInputStream(InputStream inputStream) {
        this(inputStream, null, 0);
    }

    private void checkRecordPosition(int i10) {
        int remaining = remaining();
        if (remaining >= i10) {
            return;
        }
        if (remaining == 0 && isContinueNext()) {
            nextRecord();
            return;
        }
        throw new RecordFormatException(f.k("Not enough data (", remaining, ") to read requested (", i10, ") bytes"));
    }

    public static LittleEndianInput getLEI(InputStream inputStream) {
        if (inputStream instanceof LittleEndianInput) {
            return (LittleEndianInput) inputStream;
        }
        return new LittleEndianInputStream(inputStream);
    }

    private boolean isContinueNext() {
        int i10 = this._currentDataLength;
        if (i10 != -1 && this._currentDataOffset != i10) {
            throw new IllegalStateException("Should never be called before end of current record");
        }
        if (!hasNextRecord() || this._nextSid != 60) {
            return false;
        }
        return true;
    }

    private int readNextSid() {
        if (this._bhi.available() < 4) {
            return -1;
        }
        int readRecordSID = this._bhi.readRecordSID();
        if (readRecordSID != -1) {
            this._currentDataLength = -1;
            return readRecordSID;
        }
        throw new RecordFormatException(a.g("Found invalid sid (", readRecordSID, ")"));
    }

    private String readStringCommon(int i10, boolean z10) {
        int readShort;
        int readShort2;
        if (i10 >= 0 && i10 <= 1048576) {
            char[] cArr = new char[i10];
            int i11 = 0;
            while (true) {
                int remaining = remaining();
                if (!z10) {
                    remaining /= 2;
                }
                if (i10 - i11 <= remaining) {
                    while (i11 < i10) {
                        if (z10) {
                            readShort = readUByte();
                        } else {
                            readShort = readShort();
                        }
                        cArr[i11] = (char) readShort;
                        i11++;
                    }
                    return new String(cArr);
                }
                while (remaining > 0) {
                    if (z10) {
                        readShort2 = readUByte();
                    } else {
                        readShort2 = readShort();
                    }
                    cArr[i11] = (char) readShort2;
                    i11++;
                    remaining--;
                }
                if (isContinueNext()) {
                    if (remaining() == 0) {
                        nextRecord();
                        if (readByte() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        throw new RecordFormatException("Odd number of bytes(" + remaining() + ") left behind");
                    }
                } else {
                    throw new RecordFormatException("Expected to find a ContinueRecord in order to read remaining " + (i10 - i11) + " of " + i10 + " chars");
                }
            }
        } else {
            throw new IllegalArgumentException(a.g("Bad requested string length (", i10, ")"));
        }
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int available() {
        return remaining();
    }

    public int getNextSid() {
        return this._nextSid;
    }

    public short getSid() {
        return (short) this._currentSid;
    }

    public boolean hasNextRecord() {
        int i10 = this._currentDataLength;
        if (i10 != -1 && i10 != this._currentDataOffset) {
            throw new LeftoverDataException(this._currentSid, remaining());
        }
        if (i10 != -1) {
            this._nextSid = readNextSid();
        }
        if (this._nextSid != -1) {
            return true;
        }
        return false;
    }

    public void nextRecord() {
        int i10 = this._nextSid;
        if (i10 != -1) {
            if (this._currentDataLength == -1) {
                this._currentSid = i10;
                this._currentDataOffset = 0;
                int readDataSize = this._bhi.readDataSize();
                this._currentDataLength = readDataSize;
                if (readDataSize <= 8224) {
                    return;
                }
                throw new RecordFormatException("The content of an excel record cannot exceed 8224 bytes");
            }
            throw new IllegalStateException("Cannot call nextRecord() without checking hasNextRecord() first");
        }
        throw new IllegalStateException("EOF - next record not available");
    }

    public int read(byte[] bArr, int i10, int i11) {
        int min = Math.min(i11, remaining());
        if (min == 0) {
            return 0;
        }
        readFully(bArr, i10, min);
        return min;
    }

    public byte[] readAllContinuedRemainder() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16448);
        while (true) {
            byte[] readRemainder = readRemainder();
            byteArrayOutputStream.write(readRemainder, 0, readRemainder.length);
            if (!isContinueNext()) {
                return byteArrayOutputStream.toByteArray();
            }
            nextRecord();
        }
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public byte readByte() {
        checkRecordPosition(1);
        this._currentDataOffset++;
        return this._dataInput.readByte();
    }

    public String readCompressedUnicode(int i10) {
        return readStringCommon(i10, true);
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public double readDouble() {
        double longBitsToDouble = Double.longBitsToDouble(readLong());
        Double.isNaN(longBitsToDouble);
        return longBitsToDouble;
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int readInt() {
        checkRecordPosition(4);
        this._currentDataOffset += 4;
        return this._dataInput.readInt();
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public long readLong() {
        checkRecordPosition(8);
        this._currentDataOffset += 8;
        return this._dataInput.readLong();
    }

    public byte[] readRemainder() {
        int remaining = remaining();
        if (remaining == 0) {
            return EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[remaining];
        readFully(bArr);
        return bArr;
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public short readShort() {
        checkRecordPosition(2);
        this._currentDataOffset += 2;
        return this._dataInput.readShort();
    }

    public String readString() {
        boolean z10;
        int readUShort = readUShort();
        if (readByte() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return readStringCommon(readUShort, z10);
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int readUByte() {
        return readByte() & 255;
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int readUShort() {
        checkRecordPosition(2);
        this._currentDataOffset += 2;
        return this._dataInput.readUShort();
    }

    public String readUnicodeLEString(int i10) {
        return readStringCommon(i10, false);
    }

    public int remaining() {
        int i10 = this._currentDataLength;
        if (i10 == -1) {
            return 0;
        }
        return i10 - this._currentDataOffset;
    }

    public RecordInputStream(InputStream inputStream, Biff8EncryptionKey biff8EncryptionKey, int i10) {
        if (biff8EncryptionKey == null) {
            this._dataInput = getLEI(inputStream);
            this._bhi = new SimpleHeaderInput(inputStream);
        } else {
            Biff8DecryptingStream biff8DecryptingStream = new Biff8DecryptingStream(inputStream, i10, biff8EncryptionKey);
            this._bhi = biff8DecryptingStream;
            this._dataInput = biff8DecryptingStream;
        }
        this._nextSid = readNextSid();
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public void readFully(byte[] bArr, int i10, int i11) {
        checkRecordPosition(i11);
        this._dataInput.readFully(bArr, i10, i11);
        this._currentDataOffset += i11;
    }
}
