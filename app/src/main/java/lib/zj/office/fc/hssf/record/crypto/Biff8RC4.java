package lib.zj.office.fc.hssf.record.crypto;

import a0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Biff8RC4 {
    private static final int RC4_REKEYING_INTERVAL = 1024;
    private int _currentKeyIndex;
    private final Biff8EncryptionKey _key;
    private int _nextRC4BlockStart;
    private RC4 _rc4;
    private boolean _shouldSkipEncryptionOnCurrentRecord;
    private int _streamPos;

    public Biff8RC4(int i10, Biff8EncryptionKey biff8EncryptionKey) {
        if (i10 < 1024) {
            this._key = biff8EncryptionKey;
            this._streamPos = 0;
            rekeyForNextBlock();
            this._streamPos = i10;
            while (i10 > 0) {
                this._rc4.output();
                i10--;
            }
            this._shouldSkipEncryptionOnCurrentRecord = false;
            return;
        }
        throw new RuntimeException(a.g("initialOffset (", i10, ")>1024 not supported yet"));
    }

    private int getNextRC4Byte() {
        if (this._streamPos >= this._nextRC4BlockStart) {
            rekeyForNextBlock();
        }
        byte output = this._rc4.output();
        this._streamPos++;
        if (this._shouldSkipEncryptionOnCurrentRecord) {
            return 0;
        }
        return output & 255;
    }

    private static boolean isNeverEncryptedRecord(int i10) {
        if (i10 != 47 && i10 != 225 && i10 != 2057) {
            return false;
        }
        return true;
    }

    private void rekeyForNextBlock() {
        int i10 = this._streamPos / 1024;
        this._currentKeyIndex = i10;
        this._rc4 = this._key.createRC4(i10);
        this._nextRC4BlockStart = (this._currentKeyIndex + 1) * 1024;
    }

    public void skipTwoBytes() {
        getNextRC4Byte();
        getNextRC4Byte();
    }

    public void startRecord(int i10) {
        this._shouldSkipEncryptionOnCurrentRecord = isNeverEncryptedRecord(i10);
    }

    public void xor(byte[] bArr, int i10, int i11) {
        int i12 = this._nextRC4BlockStart - this._streamPos;
        if (i11 <= i12) {
            this._rc4.encrypt(bArr, i10, i11);
            this._streamPos += i11;
            return;
        }
        if (i11 > i12) {
            if (i12 > 0) {
                this._rc4.encrypt(bArr, i10, i12);
                this._streamPos += i12;
                i10 += i12;
                i11 -= i12;
            }
            rekeyForNextBlock();
        }
        while (i11 > 1024) {
            this._rc4.encrypt(bArr, i10, 1024);
            this._streamPos += 1024;
            i10 += 1024;
            i11 -= 1024;
            rekeyForNextBlock();
        }
        this._rc4.encrypt(bArr, i10, i11);
        this._streamPos += i11;
    }

    public int xorByte(int i10) {
        return (byte) (i10 ^ getNextRC4Byte());
    }

    public int xorInt(int i10) {
        int nextRC4Byte = getNextRC4Byte();
        int nextRC4Byte2 = getNextRC4Byte();
        return i10 ^ ((((getNextRC4Byte() << 24) + (getNextRC4Byte() << 16)) + (nextRC4Byte2 << 8)) + (nextRC4Byte << 0));
    }

    public long xorLong(long j10) {
        int nextRC4Byte = getNextRC4Byte();
        int nextRC4Byte2 = getNextRC4Byte();
        int nextRC4Byte3 = getNextRC4Byte();
        int nextRC4Byte4 = getNextRC4Byte();
        int nextRC4Byte5 = getNextRC4Byte();
        int nextRC4Byte6 = getNextRC4Byte();
        return j10 ^ ((((((((getNextRC4Byte() << 56) + (getNextRC4Byte() << 48)) + (nextRC4Byte6 << 40)) + (nextRC4Byte5 << 32)) + (nextRC4Byte4 << 24)) + (nextRC4Byte3 << 16)) + (nextRC4Byte2 << 8)) + (nextRC4Byte << 0));
    }

    public int xorShort(int i10) {
        return i10 ^ ((getNextRC4Byte() << 8) + (getNextRC4Byte() << 0));
    }
}
