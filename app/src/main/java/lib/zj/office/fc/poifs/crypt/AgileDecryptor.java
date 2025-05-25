package lib.zj.office.fc.poifs.crypt;

import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import lib.zj.office.fc.EncryptedDocumentException;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import lib.zj.office.fc.poifs.filesystem.DirectoryNode;
import lib.zj.office.fc.poifs.filesystem.DocumentInputStream;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class AgileDecryptor extends Decryptor {
    private final EncryptionInfo _info;
    private SecretKey _secretKey;
    private static final byte[] kVerifierInputBlock = {-2, -89, -46, 118, 59, Field.MERGESEQ, -98, 121};
    private static final byte[] kHashedVerifierBlock = {-41, -86, 15, 109, 48, 97, Field.AUTONUMOUT, 78};
    private static final byte[] kCryptoKeyBlock = {20, 110, 11, -25, -85, -84, -48, -42};

    /* loaded from: classes3.dex */
    public class ChunkedCipherInputStream extends InputStream {
        private byte[] _chunk;
        private Cipher _cipher;
        private int _lastIndex = 0;
        private long _pos = 0;
        private final long _size;
        private final DocumentInputStream _stream;

        public ChunkedCipherInputStream(DocumentInputStream documentInputStream, long j10) {
            this._size = j10;
            this._stream = documentInputStream;
            this._cipher = AgileDecryptor.this.getCipher(AgileDecryptor.this._info.getHeader().getAlgorithm(), AgileDecryptor.this._info.getHeader().getCipherMode(), AgileDecryptor.this._secretKey, AgileDecryptor.this._info.getHeader().getKeySalt());
        }

        private byte[] nextChunk() {
            int i10 = (int) (this._pos >> 12);
            byte[] bArr = new byte[4];
            LittleEndian.putInt(bArr, i10);
            AgileDecryptor agileDecryptor = AgileDecryptor.this;
            this._cipher.init(2, AgileDecryptor.this._secretKey, new IvParameterSpec(agileDecryptor.generateIv(agileDecryptor._info.getHeader().getAlgorithm(), AgileDecryptor.this._info.getHeader().getKeySalt(), bArr)));
            int i11 = this._lastIndex;
            if (i11 != i10) {
                this._stream.skip((i10 - i11) << 12);
            }
            byte[] bArr2 = new byte[Math.min(this._stream.available(), 4096)];
            this._stream.readFully(bArr2);
            this._lastIndex = i10 + 1;
            return this._cipher.doFinal(bArr2);
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) (this._size - this._pos);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this._stream.close();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read() {
            byte[] bArr = new byte[1];
            if (read(bArr) == 1) {
                return bArr[0];
            }
            return -1;
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            long j11 = this._pos;
            long min = Math.min(available(), j10);
            long j12 = this._pos;
            if (((j11 ^ (j12 + min)) & (-4096)) != 0) {
                this._chunk = null;
            }
            this._pos = j12 + min;
            return min;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) {
            return read(bArr, 0, bArr.length);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int i12 = 0;
            while (i11 > 0) {
                if (this._chunk == null) {
                    try {
                        this._chunk = nextChunk();
                    } catch (GeneralSecurityException unused) {
                        throw new EncryptedDocumentException("Cannot process encrypted office files!");
                    }
                }
                int min = Math.min(available(), Math.min((int) (4096 - (this._pos & 4095)), i11));
                System.arraycopy(this._chunk, (int) (this._pos & 4095), bArr, i10, min);
                i10 += min;
                i11 -= min;
                long j10 = this._pos + min;
                this._pos = j10;
                if ((j10 & 4095) == 0) {
                    this._chunk = null;
                }
                i12 += min;
            }
            return i12;
        }
    }

    public AgileDecryptor(EncryptionInfo encryptionInfo) {
        this._info = encryptionInfo;
    }

    private byte[] generateKey(byte[] bArr, byte[] bArr2) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(bArr);
        return getBlock(this._info.getVerifier().getAlgorithm(), messageDigest.digest(bArr2));
    }

    private byte[] getBlock(int i10, byte[] bArr) {
        int blockSize = Decryptor.getBlockSize(i10);
        byte[] bArr2 = new byte[blockSize];
        Arrays.fill(bArr2, (byte) Field.AUTONUM);
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(blockSize, bArr.length));
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Cipher getCipher(int i10, int i11, SecretKey secretKey, byte[] bArr) {
        String str;
        String str2 = null;
        if (i10 != 26126 && i10 != 26127 && i10 != 26128) {
            str = null;
        } else {
            str = "AES";
        }
        if (i11 == 2) {
            str2 = "CBC";
        } else if (i11 == 3) {
            str2 = "CFB";
        }
        Cipher cipher = Cipher.getInstance(str + PackagingURIHelper.FORWARD_SLASH_STRING + str2 + "/NoPadding");
        cipher.init(2, secretKey, new IvParameterSpec(bArr));
        return cipher;
    }

    public byte[] generateIv(int i10, byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            return getBlock(i10, bArr);
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(bArr);
        return getBlock(i10, messageDigest.digest(bArr2));
    }

    @Override // lib.zj.office.fc.poifs.crypt.Decryptor
    public InputStream getDataStream(DirectoryNode directoryNode) {
        DocumentInputStream createDocumentInputStream = directoryNode.createDocumentInputStream("EncryptedPackage");
        return new ChunkedCipherInputStream(createDocumentInputStream, createDocumentInputStream.readLong());
    }

    @Override // lib.zj.office.fc.poifs.crypt.Decryptor
    public boolean verifyPassword(String str) {
        EncryptionVerifier verifier = this._info.getVerifier();
        int algorithm = verifier.getAlgorithm();
        int cipherMode = verifier.getCipherMode();
        byte[] hashPassword = hashPassword(this._info, str);
        byte[] doFinal = getCipher(algorithm, cipherMode, new SecretKeySpec(generateKey(hashPassword, kVerifierInputBlock), "AES"), generateIv(algorithm, verifier.getSalt(), null)).doFinal(verifier.getVerifier());
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        int length = verifier.getSalt().length;
        byte[] bArr = new byte[length];
        System.arraycopy(doFinal, 0, bArr, 0, length);
        byte[] digest = messageDigest.digest(bArr);
        byte[] doFinal2 = getCipher(algorithm, cipherMode, new SecretKeySpec(generateKey(hashPassword, kHashedVerifierBlock), "AES"), generateIv(algorithm, verifier.getSalt(), null)).doFinal(verifier.getVerifierHash());
        int length2 = digest.length;
        byte[] bArr2 = new byte[length2];
        System.arraycopy(doFinal2, 0, bArr2, 0, length2);
        if (!Arrays.equals(bArr2, digest)) {
            return false;
        }
        byte[] doFinal3 = getCipher(algorithm, cipherMode, new SecretKeySpec(generateKey(hashPassword, kCryptoKeyBlock), "AES"), generateIv(algorithm, verifier.getSalt(), null)).doFinal(verifier.getEncryptedKey());
        int keySize = this._info.getHeader().getKeySize() / 8;
        byte[] bArr3 = new byte[keySize];
        System.arraycopy(doFinal3, 0, bArr3, 0, keySize);
        this._secretKey = new SecretKeySpec(bArr3, "AES");
        return true;
    }
}
