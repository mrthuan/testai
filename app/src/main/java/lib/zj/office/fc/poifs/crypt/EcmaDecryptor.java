package lib.zj.office.fc.poifs.crypt;

import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.SecretKeySpec;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.poifs.filesystem.DirectoryNode;
import lib.zj.office.fc.poifs.filesystem.DocumentInputStream;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class EcmaDecryptor extends Decryptor {
    private final EncryptionInfo info;
    private byte[] passwordHash;

    public EcmaDecryptor(EncryptionInfo encryptionInfo) {
        this.info = encryptionInfo;
    }

    private byte[] generateKey(int i10) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(this.passwordHash);
        byte[] bArr = new byte[4];
        LittleEndian.putInt(bArr, i10);
        byte[] digest = messageDigest.digest(bArr);
        int keySize = this.info.getHeader().getKeySize() / 8;
        byte[] bArr2 = new byte[64];
        Arrays.fill(bArr2, (byte) Field.AUTONUM);
        for (int i11 = 0; i11 < digest.length; i11++) {
            bArr2[i11] = (byte) (bArr2[i11] ^ digest[i11]);
        }
        messageDigest.reset();
        byte[] digest2 = messageDigest.digest(bArr2);
        Arrays.fill(bArr2, (byte) Field.BIDIOUTLINE);
        for (int i12 = 0; i12 < digest.length; i12++) {
            bArr2[i12] = (byte) (bArr2[i12] ^ digest[i12]);
        }
        messageDigest.reset();
        byte[] digest3 = messageDigest.digest(bArr2);
        byte[] bArr3 = new byte[digest2.length + digest3.length];
        System.arraycopy(digest2, 0, bArr3, 0, digest2.length);
        System.arraycopy(digest3, 0, bArr3, digest2.length, digest3.length);
        return truncateOrPad(bArr3, keySize);
    }

    private Cipher getCipher() {
        byte[] generateKey = generateKey(0);
        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
        cipher.init(2, new SecretKeySpec(generateKey, "AES"));
        return cipher;
    }

    private byte[] truncateOrPad(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(i10, bArr.length));
        if (i10 > bArr.length) {
            for (int length = bArr.length; length < i10; length++) {
                bArr2[length] = 0;
            }
        }
        return bArr2;
    }

    @Override // lib.zj.office.fc.poifs.crypt.Decryptor
    public InputStream getDataStream(DirectoryNode directoryNode) {
        DocumentInputStream createDocumentInputStream = directoryNode.createDocumentInputStream("EncryptedPackage");
        createDocumentInputStream.readLong();
        return new CipherInputStream(createDocumentInputStream, getCipher());
    }

    @Override // lib.zj.office.fc.poifs.crypt.Decryptor
    public boolean verifyPassword(String str) {
        this.passwordHash = hashPassword(this.info, str);
        Cipher cipher = getCipher();
        byte[] digest = MessageDigest.getInstance("SHA-1").digest(cipher.doFinal(this.info.getVerifier().getVerifier()));
        return Arrays.equals(digest, truncateOrPad(cipher.doFinal(this.info.getVerifier().getVerifierHash()), digest.length));
    }
}
