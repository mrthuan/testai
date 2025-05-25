package lib.zj.office.fc.hssf.record.crypto;

import b.a;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.poifs.crypt.Decryptor;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutputStream;

/* loaded from: classes3.dex */
public final class Biff8EncryptionKey {
    private static final int KEY_DIGEST_LENGTH = 5;
    private static final int PASSWORD_HASH_NUMBER_OF_BYTES_USED = 5;
    private static final ThreadLocal<String> _userPasswordTLS = new ThreadLocal<>();
    private final byte[] _keyDigest;

    public Biff8EncryptionKey(byte[] bArr) {
        if (bArr.length == 5) {
            this._keyDigest = bArr;
            return;
        }
        throw new IllegalArgumentException("Expected 5 byte key digest, but got " + HexDump.toHex(bArr));
    }

    private static void check16Bytes(byte[] bArr, String str) {
        if (bArr.length == 16) {
            return;
        }
        StringBuilder g10 = a.g("Expected 16 byte ", str, ", but got ");
        g10.append(HexDump.toHex(bArr));
        throw new IllegalArgumentException(g10.toString());
    }

    public static Biff8EncryptionKey create(byte[] bArr) {
        return new Biff8EncryptionKey(createKeyDigest(Decryptor.DEFAULT_PASSWORD, bArr));
    }

    public static byte[] createKeyDigest(String str, byte[] bArr) {
        check16Bytes(bArr, "docId");
        int min = Math.min(str.length(), 16);
        byte[] bArr2 = new byte[min * 2];
        for (int i10 = 0; i10 < min; i10++) {
            char charAt = str.charAt(i10);
            int i11 = i10 * 2;
            bArr2[i11 + 0] = (byte) ((charAt << 0) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            bArr2[i11 + 1] = (byte) ((charAt << '\b') & FunctionEval.FunctionID.EXTERNAL_FUNC);
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr2);
            byte[] digest = messageDigest.digest();
            messageDigest.reset();
            for (int i12 = 0; i12 < 16; i12++) {
                messageDigest.update(digest, 0, 5);
                messageDigest.update(bArr, 0, bArr.length);
            }
            byte[] bArr3 = new byte[5];
            System.arraycopy(messageDigest.digest(), 0, bArr3, 0, 5);
            return bArr3;
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String getCurrentUserPassword() {
        return _userPasswordTLS.get();
    }

    public static void setCurrentUserPassword(String str) {
        _userPasswordTLS.set(str);
    }

    private static byte[] xor(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    public RC4 createRC4(int i10) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(this._keyDigest);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4);
            new LittleEndianOutputStream(byteArrayOutputStream).writeInt(i10);
            messageDigest.update(byteArrayOutputStream.toByteArray());
            return new RC4(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean validate(byte[] bArr, byte[] bArr2) {
        check16Bytes(bArr, "saltData");
        check16Bytes(bArr2, "saltHash");
        RC4 createRC4 = createRC4(0);
        byte[] bArr3 = (byte[]) bArr.clone();
        createRC4.encrypt(bArr3);
        byte[] bArr4 = (byte[]) bArr2.clone();
        createRC4.encrypt(bArr4);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr3);
            return Arrays.equals(bArr4, messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static Biff8EncryptionKey create(String str, byte[] bArr) {
        return new Biff8EncryptionKey(createKeyDigest(str, bArr));
    }
}
