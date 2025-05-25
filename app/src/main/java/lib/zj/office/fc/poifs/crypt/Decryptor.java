package lib.zj.office.fc.poifs.crypt;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import lib.zj.office.fc.EncryptedDocumentException;
import lib.zj.office.fc.codec.CharEncoding;
import lib.zj.office.fc.poifs.filesystem.DirectoryNode;
import lib.zj.office.fc.poifs.filesystem.NPOIFSFileSystem;
import lib.zj.office.fc.poifs.filesystem.POIFSFileSystem;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public abstract class Decryptor {
    public static final String DEFAULT_PASSWORD = "VelvetSweatshop";

    public static int getBlockSize(int i10) {
        switch (i10) {
            case EncryptionHeader.ALGORITHM_AES_128 /* 26126 */:
                return 16;
            case EncryptionHeader.ALGORITHM_AES_192 /* 26127 */:
                return 24;
            case EncryptionHeader.ALGORITHM_AES_256 /* 26128 */:
                return 32;
            default:
                throw new EncryptedDocumentException("Cannot process encrypted office files!");
        }
    }

    public static Decryptor getInstance(EncryptionInfo encryptionInfo) {
        int versionMajor = encryptionInfo.getVersionMajor();
        int versionMinor = encryptionInfo.getVersionMinor();
        if (versionMajor == 4 && versionMinor == 4) {
            return new AgileDecryptor(encryptionInfo);
        }
        if (versionMinor == 2 && (versionMajor == 3 || versionMajor == 4)) {
            return new EcmaDecryptor(encryptionInfo);
        }
        throw new EncryptedDocumentException("Cannot process encrypted office files!");
    }

    public abstract InputStream getDataStream(DirectoryNode directoryNode);

    public InputStream getDataStream(NPOIFSFileSystem nPOIFSFileSystem) {
        return getDataStream(nPOIFSFileSystem.getRoot());
    }

    public byte[] hashPassword(EncryptionInfo encryptionInfo, String str) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        try {
            byte[] bytes = str.getBytes(CharEncoding.UTF_16LE);
            messageDigest.update(encryptionInfo.getVerifier().getSalt());
            byte[] digest = messageDigest.digest(bytes);
            byte[] bArr = new byte[4];
            for (int i10 = 0; i10 < encryptionInfo.getVerifier().getSpinCount(); i10++) {
                messageDigest.reset();
                LittleEndian.putInt(bArr, i10);
                messageDigest.update(bArr);
                digest = messageDigest.digest(digest);
            }
            return digest;
        } catch (UnsupportedEncodingException unused) {
            throw new EncryptedDocumentException("Cannot process encrypted office files!");
        }
    }

    public abstract boolean verifyPassword(String str);

    public InputStream getDataStream(POIFSFileSystem pOIFSFileSystem) {
        return getDataStream(pOIFSFileSystem.getRoot());
    }
}
