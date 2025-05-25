package com.tom_roush.pdfbox.pdmodel.encryption;

import androidx.appcompat.view.menu.d;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.util.Charsets;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: classes2.dex */
public abstract class SecurityHandler {
    private static final byte[] AES_SALT = {115, Field.SECTION, 108, Field.ADVANCE};
    private static final int DEFAULT_KEY_LENGTH = 40;
    private SecureRandom customSecureRandom;
    private boolean decryptMetadata;
    protected byte[] encryptionKey;
    private COSName streamFilterName;
    private COSName stringFilterName;
    private boolean useAES;
    protected int keyLength = 40;
    private final RC4Cipher rc4 = new RC4Cipher();
    private final Set<COSBase> objects = Collections.newSetFromMap(new IdentityHashMap());
    private ProtectionPolicy protectionPolicy = null;
    private AccessPermission currentAccessPermission = null;

    private byte[] calcFinalKey(long j10, long j11) {
        byte[] bArr = this.encryptionKey;
        int length = bArr.length + 5;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[length - 5] = (byte) (j10 & 255);
        bArr2[length - 4] = (byte) ((j10 >> 8) & 255);
        bArr2[length - 3] = (byte) ((j10 >> 16) & 255);
        bArr2[length - 2] = (byte) (j11 & 255);
        bArr2[length - 1] = (byte) ((j11 >> 8) & 255);
        MessageDigest md5 = MessageDigests.getMD5();
        md5.update(bArr2);
        if (this.useAES) {
            md5.update(AES_SALT);
        }
        byte[] digest = md5.digest();
        int min = Math.min(length, 16);
        byte[] bArr3 = new byte[min];
        System.arraycopy(digest, 0, bArr3, 0, min);
        return bArr3;
    }

    private Cipher createCipher(byte[] bArr, byte[] bArr2, boolean z10) {
        int i10;
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        if (z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        cipher.init(i10, secretKeySpec, ivParameterSpec);
        return cipher;
    }

    private void decryptArray(COSArray cOSArray, long j10, long j11) {
        for (int i10 = 0; i10 < cOSArray.size(); i10++) {
            decrypt(cOSArray.get(i10), j10, j11);
        }
    }

    private void decryptDictionary(COSDictionary cOSDictionary, long j10, long j11) {
        boolean z10;
        if (cOSDictionary.getItem(COSName.CF) != null) {
            return;
        }
        COSBase dictionaryObject = cOSDictionary.getDictionaryObject(COSName.TYPE);
        if (!COSName.SIG.equals(dictionaryObject) && !COSName.DOC_TIME_STAMP.equals(dictionaryObject) && (!(cOSDictionary.getDictionaryObject(COSName.CONTENTS) instanceof COSString) || !(cOSDictionary.getDictionaryObject(COSName.BYTERANGE) instanceof COSArray))) {
            z10 = false;
        } else {
            z10 = true;
        }
        for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
            if (!z10 || !COSName.CONTENTS.equals(entry.getKey())) {
                COSBase value = entry.getValue();
                if ((value instanceof COSString) || (value instanceof COSArray) || (value instanceof COSDictionary)) {
                    decrypt(value, j10, j11);
                }
            }
        }
    }

    private void decryptString(COSString cOSString, long j10, long j11) {
        if (COSName.IDENTITY.equals(this.stringFilterName)) {
            return;
        }
        InputStream byteArrayInputStream = new ByteArrayInputStream(cOSString.getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encryptData(j10, j11, byteArrayInputStream, byteArrayOutputStream, true);
            cOSString.setValue(byteArrayOutputStream.toByteArray());
        } catch (IOException e10) {
            int length = cOSString.getBytes().length;
            e10.getMessage();
        }
    }

    private void encryptData(long j10, long j11, InputStream inputStream, OutputStream outputStream, boolean z10) {
        if (this.useAES && this.encryptionKey.length == 32) {
            encryptDataAES256(inputStream, outputStream, z10);
        } else {
            byte[] calcFinalKey = calcFinalKey(j10, j11);
            if (this.useAES) {
                encryptDataAESother(calcFinalKey, inputStream, outputStream, z10);
            } else {
                encryptDataRC4(calcFinalKey, inputStream, outputStream);
            }
        }
        outputStream.flush();
    }

    private void encryptDataAES256(InputStream inputStream, OutputStream outputStream, boolean z10) {
        byte[] bArr = new byte[16];
        if (!prepareAESInitializationVector(z10, bArr, inputStream, outputStream)) {
            return;
        }
        try {
            CipherInputStream cipherInputStream = new CipherInputStream(inputStream, createCipher(this.encryptionKey, bArr, z10));
            try {
                try {
                    IOUtils.copy(cipherInputStream, outputStream);
                } catch (IOException e10) {
                    if (!(e10.getCause() instanceof GeneralSecurityException)) {
                        throw e10;
                    }
                }
            } finally {
                cipherInputStream.close();
            }
        } catch (GeneralSecurityException e11) {
            throw new IOException(e11);
        }
    }

    private void encryptDataAESother(byte[] bArr, InputStream inputStream, OutputStream outputStream, boolean z10) {
        byte[] bArr2 = new byte[16];
        if (!prepareAESInitializationVector(z10, bArr2, inputStream, outputStream)) {
            return;
        }
        try {
            Cipher createCipher = createCipher(bArr, bArr2, z10);
            byte[] bArr3 = new byte[256];
            while (true) {
                int read = inputStream.read(bArr3);
                if (read != -1) {
                    byte[] update = createCipher.update(bArr3, 0, read);
                    if (update != null) {
                        outputStream.write(update);
                    }
                } else {
                    outputStream.write(createCipher.doFinal());
                    return;
                }
            }
        } catch (GeneralSecurityException e10) {
            throw new IOException(e10);
        }
    }

    private SecureRandom getSecureRandom() {
        SecureRandom secureRandom = this.customSecureRandom;
        if (secureRandom != null) {
            return secureRandom;
        }
        return new SecureRandom();
    }

    private boolean prepareAESInitializationVector(boolean z10, byte[] bArr, InputStream inputStream, OutputStream outputStream) {
        if (z10) {
            int populateBuffer = (int) IOUtils.populateBuffer(inputStream, bArr);
            if (populateBuffer == 0) {
                return false;
            }
            if (populateBuffer != bArr.length) {
                StringBuilder e10 = d.e("AES initialization vector not fully read: only ", populateBuffer, " bytes read instead of ");
                e10.append(bArr.length);
                throw new IOException(e10.toString());
            }
            return true;
        }
        getSecureRandom().nextBytes(bArr);
        outputStream.write(bArr);
        return true;
    }

    public int computeVersionNumber() {
        int i10 = this.keyLength;
        if (i10 == 40) {
            return 1;
        }
        if (i10 == 128 && this.protectionPolicy.isPreferAES()) {
            return 4;
        }
        if (this.keyLength == 256) {
            return 5;
        }
        return 2;
    }

    public void decrypt(COSBase cOSBase, long j10, long j11) {
        boolean z10 = cOSBase instanceof COSString;
        if (!z10 && !(cOSBase instanceof COSDictionary) && !(cOSBase instanceof COSArray)) {
            return;
        }
        if (z10) {
            if (this.objects.contains(cOSBase)) {
                return;
            }
            this.objects.add(cOSBase);
            decryptString((COSString) cOSBase, j10, j11);
        } else if (cOSBase instanceof COSStream) {
            if (this.objects.contains(cOSBase)) {
                return;
            }
            this.objects.add(cOSBase);
            decryptStream((COSStream) cOSBase, j10, j11);
        } else if (cOSBase instanceof COSDictionary) {
            decryptDictionary((COSDictionary) cOSBase, j10, j11);
        } else if (cOSBase instanceof COSArray) {
            decryptArray((COSArray) cOSBase, j10, j11);
        }
    }

    public void decryptStream(COSStream cOSStream, long j10, long j11) {
        if (COSName.IDENTITY.equals(this.streamFilterName)) {
            return;
        }
        COSName cOSName = cOSStream.getCOSName(COSName.TYPE);
        if ((!this.decryptMetadata && COSName.METADATA.equals(cOSName)) || COSName.XREF.equals(cOSName)) {
            return;
        }
        if (COSName.METADATA.equals(cOSName)) {
            InputStream createRawInputStream = cOSStream.createRawInputStream();
            byte[] bArr = new byte[10];
            IOUtils.populateBuffer(createRawInputStream, bArr);
            createRawInputStream.close();
            if (Arrays.equals(bArr, "<?xpacket ".getBytes(Charsets.ISO_8859_1))) {
                return;
            }
        }
        decryptDictionary(cOSStream, j10, j11);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(IOUtils.toByteArray(cOSStream.createRawInputStream()));
        OutputStream createRawOutputStream = cOSStream.createRawOutputStream();
        try {
            try {
                encryptData(j10, j11, byteArrayInputStream, createRawOutputStream, true);
            } catch (IOException e10) {
                throw e10;
            }
        } finally {
            createRawOutputStream.close();
        }
    }

    public void encryptDataRC4(byte[] bArr, InputStream inputStream, OutputStream outputStream) {
        this.rc4.setKey(bArr);
        this.rc4.write(inputStream, outputStream);
    }

    public void encryptStream(COSStream cOSStream, long j10, int i10) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(IOUtils.toByteArray(cOSStream.createRawInputStream()));
        OutputStream createRawOutputStream = cOSStream.createRawOutputStream();
        try {
            encryptData(j10, i10, byteArrayInputStream, createRawOutputStream, false);
        } finally {
            createRawOutputStream.close();
        }
    }

    public void encryptString(COSString cOSString, long j10, int i10) {
        InputStream byteArrayInputStream = new ByteArrayInputStream(cOSString.getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encryptData(j10, i10, byteArrayInputStream, byteArrayOutputStream, false);
        cOSString.setValue(byteArrayOutputStream.toByteArray());
    }

    public AccessPermission getCurrentAccessPermission() {
        return this.currentAccessPermission;
    }

    public byte[] getEncryptionKey() {
        return this.encryptionKey;
    }

    public int getKeyLength() {
        return this.keyLength;
    }

    public ProtectionPolicy getProtectionPolicy() {
        return this.protectionPolicy;
    }

    public boolean hasProtectionPolicy() {
        if (this.protectionPolicy != null) {
            return true;
        }
        return false;
    }

    public boolean isAES() {
        return this.useAES;
    }

    public abstract void prepareDocumentForEncryption(PDDocument pDDocument);

    public abstract void prepareForDecryption(PDEncryption pDEncryption, COSArray cOSArray, DecryptionMaterial decryptionMaterial);

    public void setAES(boolean z10) {
        this.useAES = z10;
    }

    public void setCurrentAccessPermission(AccessPermission accessPermission) {
        this.currentAccessPermission = accessPermission;
    }

    public void setCustomSecureRandom(SecureRandom secureRandom) {
        this.customSecureRandom = secureRandom;
    }

    public void setDecryptMetadata(boolean z10) {
        this.decryptMetadata = z10;
    }

    public void setEncryptionKey(byte[] bArr) {
        this.encryptionKey = bArr;
    }

    public void setKeyLength(int i10) {
        this.keyLength = i10;
    }

    public void setProtectionPolicy(ProtectionPolicy protectionPolicy) {
        this.protectionPolicy = protectionPolicy;
    }

    public void setStreamFilterName(COSName cOSName) {
        this.streamFilterName = cOSName;
    }

    public void setStringFilterName(COSName cOSName) {
        this.stringFilterName = cOSName;
    }

    public void encryptDataRC4(byte[] bArr, byte[] bArr2, OutputStream outputStream) {
        this.rc4.setKey(bArr);
        this.rc4.write(bArr2, outputStream);
    }
}
