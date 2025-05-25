package com.tom_roush.pdfbox.pdmodel.encryption;

import b.a;
import com.adjust.sdk.Constants;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.util.Charsets;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: classes2.dex */
public final class StandardSecurityHandler extends SecurityHandler {
    public static final String FILTER = "Standard";
    public static final Class<?> PROTECTION_POLICY_CLASS = StandardProtectionPolicy.class;
    private static final byte[] ENCRYPT_PADDING = {Field.DATA, -65, 78, Field.GREETINGLINE, 78, 117, -118, Field.SECTION, 100, 0, 78, 86, -1, -6, 1, 8, Field.DDEAUTO, Field.DDEAUTO, 0, -74, -48, 104, Field.USERADDRESS, Byte.MIN_VALUE, Field.GLOSSARY, 12, -87, -2, 100, Field.FORMDROPDOWN, 105, 122};
    private static final String[] HASHES_2B = {Constants.SHA256, "SHA-384", "SHA-512"};

    public StandardSecurityHandler() {
    }

    private byte[] computeEncryptedKeyRev234(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, boolean z10, int i11, int i12) {
        byte[] truncateOrPad = truncateOrPad(bArr);
        MessageDigest md5 = MessageDigests.getMD5();
        md5.update(truncateOrPad);
        md5.update(bArr2);
        md5.update((byte) i10);
        md5.update((byte) (i10 >>> 8));
        md5.update((byte) (i10 >>> 16));
        md5.update((byte) (i10 >>> 24));
        md5.update(bArr3);
        if (i12 == 4 && !z10) {
            md5.update(new byte[]{-1, -1, -1, -1});
        }
        byte[] digest = md5.digest();
        if (i12 == 3 || i12 == 4) {
            for (int i13 = 0; i13 < 50; i13++) {
                md5.update(digest, 0, i11);
                digest = md5.digest();
            }
        }
        byte[] bArr4 = new byte[i11];
        System.arraycopy(digest, 0, bArr4, 0, i11);
        return bArr4;
    }

    private byte[] computeEncryptedKeyRev56(byte[] bArr, boolean z10, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i10) {
        byte[] computeHash2A;
        if (z10) {
            if (bArr4 != null) {
                byte[] bArr6 = new byte[8];
                System.arraycopy(bArr2, 40, bArr6, 0, 8);
                if (i10 == 5) {
                    computeHash2A = computeSHA256(bArr, bArr6, bArr3);
                } else {
                    computeHash2A = computeHash2A(bArr, bArr6, bArr3);
                }
            } else {
                throw new IOException("/Encrypt/OE entry is missing");
            }
        } else if (bArr5 != null) {
            byte[] bArr7 = new byte[8];
            System.arraycopy(bArr3, 40, bArr7, 0, 8);
            if (i10 == 5) {
                computeHash2A = computeSHA256(bArr, bArr7, null);
            } else {
                computeHash2A = computeHash2A(bArr, bArr7, null);
            }
            bArr4 = bArr5;
        } else {
            throw new IOException("/Encrypt/UE entry is missing");
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            cipher.init(2, new SecretKeySpec(computeHash2A, "AES"), new IvParameterSpec(new byte[16]));
            return cipher.doFinal(bArr4);
        } catch (GeneralSecurityException e10) {
            logIfStrongEncryptionMissing();
            throw new IOException(e10);
        }
    }

    private byte[] computeHash2A(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3 == null) {
            bArr3 = new byte[0];
        } else if (bArr3.length >= 48) {
            if (bArr3.length > 48) {
                byte[] bArr4 = new byte[48];
                System.arraycopy(bArr3, 0, bArr4, 0, 48);
                bArr3 = bArr4;
            }
        } else {
            throw new IOException("Bad U length");
        }
        byte[] truncate127 = truncate127(bArr);
        return computeHash2B(concat(truncate127, bArr2, bArr3), truncate127, bArr3);
    }

    private static byte[] computeHash2B(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4;
        try {
            byte[] digest = MessageDigests.getSHA256().digest(bArr);
            byte[] bArr5 = null;
            int i10 = 0;
            while (true) {
                if (i10 >= 64 && (bArr5[bArr5.length - 1] & 255) <= i10 - 32) {
                    break;
                }
                if (bArr3 != null && bArr3.length >= 48) {
                    bArr4 = new byte[(bArr2.length + digest.length + 48) * 64];
                } else {
                    bArr4 = new byte[(bArr2.length + digest.length) * 64];
                }
                int i11 = 0;
                for (int i12 = 0; i12 < 64; i12++) {
                    System.arraycopy(bArr2, 0, bArr4, i11, bArr2.length);
                    int length = i11 + bArr2.length;
                    System.arraycopy(digest, 0, bArr4, length, digest.length);
                    i11 = length + digest.length;
                    if (bArr3 != null && bArr3.length >= 48) {
                        System.arraycopy(bArr3, 0, bArr4, i11, 48);
                        i11 += 48;
                    }
                }
                byte[] bArr6 = new byte[16];
                byte[] bArr7 = new byte[16];
                System.arraycopy(digest, 0, bArr6, 0, 16);
                System.arraycopy(digest, 16, bArr7, 0, 16);
                Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
                cipher.init(1, new SecretKeySpec(bArr6, "AES"), new IvParameterSpec(bArr7));
                byte[] doFinal = cipher.doFinal(bArr4);
                byte[] bArr8 = new byte[16];
                System.arraycopy(doFinal, 0, bArr8, 0, 16);
                i10++;
                bArr5 = doFinal;
                digest = MessageDigest.getInstance(HASHES_2B[new BigInteger(1, bArr8).mod(new BigInteger("3")).intValue()]).digest(doFinal);
            }
            if (digest.length > 32) {
                byte[] bArr9 = new byte[32];
                System.arraycopy(digest, 0, bArr9, 0, 32);
                return bArr9;
            }
            return digest;
        } catch (GeneralSecurityException e10) {
            logIfStrongEncryptionMissing();
            throw new IOException(e10);
        }
    }

    private byte[] computeRC4key(byte[] bArr, int i10, int i11) {
        MessageDigest md5 = MessageDigests.getMD5();
        byte[] digest = md5.digest(truncateOrPad(bArr));
        if (i10 == 3 || i10 == 4) {
            for (int i12 = 0; i12 < 50; i12++) {
                md5.update(digest, 0, i11);
                digest = md5.digest();
            }
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(digest, 0, bArr2, 0, i11);
        return bArr2;
    }

    private int computeRevisionNumber(int i10) {
        AccessPermission permissions = ((StandardProtectionPolicy) getProtectionPolicy()).getPermissions();
        if (i10 < 2 && !permissions.hasAnyRevision3PermissionSet()) {
            return 2;
        }
        if (i10 == 5) {
            return 6;
        }
        if (i10 == 4) {
            return 4;
        }
        if (i10 != 2 && i10 != 3 && !permissions.hasAnyRevision3PermissionSet()) {
            return 4;
        }
        return 3;
    }

    private static byte[] computeSHA256(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        MessageDigest sha256 = MessageDigests.getSHA256();
        sha256.update(bArr);
        sha256.update(bArr2);
        if (bArr3 == null) {
            return sha256.digest();
        }
        return sha256.digest(bArr3);
    }

    private static byte[] concat(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    private byte[] getDocumentIDBytes(COSArray cOSArray) {
        if (cOSArray != null && cOSArray.size() >= 1) {
            return ((COSString) cOSArray.getObject(0)).getBytes();
        }
        return new byte[0];
    }

    private boolean isUserPassword234(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4, int i11, int i12, boolean z10) {
        byte[] computeUserPassword = computeUserPassword(bArr, bArr3, i10, bArr4, i11, i12, z10);
        if (i11 == 2) {
            return Arrays.equals(bArr2, computeUserPassword);
        }
        return Arrays.equals(Arrays.copyOf(bArr2, 16), Arrays.copyOf(computeUserPassword, 16));
    }

    private boolean isUserPassword56(byte[] bArr, byte[] bArr2, int i10) {
        byte[] computeHash2A;
        byte[] truncate127 = truncate127(bArr);
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[8];
        System.arraycopy(bArr2, 0, bArr3, 0, 32);
        System.arraycopy(bArr2, 32, bArr4, 0, 8);
        if (i10 == 5) {
            computeHash2A = computeSHA256(truncate127, bArr4, null);
        } else {
            computeHash2A = computeHash2A(truncate127, bArr4, null);
        }
        return Arrays.equals(computeHash2A, bArr3);
    }

    private static void logIfStrongEncryptionMissing() {
        try {
            Cipher.getMaxAllowedKeyLength("AES");
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    private void prepareEncryptionDictAES(PDEncryption pDEncryption, COSName cOSName) {
        PDCryptFilterDictionary pDCryptFilterDictionary = new PDCryptFilterDictionary();
        pDCryptFilterDictionary.setCryptFilterMethod(cOSName);
        pDCryptFilterDictionary.setLength(getKeyLength());
        pDEncryption.setStdCryptFilterDictionary(pDCryptFilterDictionary);
        COSName cOSName2 = COSName.STD_CF;
        pDEncryption.setStreamFilterName(cOSName2);
        pDEncryption.setStringFilterName(cOSName2);
        setAES(true);
    }

    private void prepareEncryptionDictRev2345(String str, String str2, PDEncryption pDEncryption, int i10, PDDocument pDDocument, int i11, int i12) {
        COSArray documentID = pDDocument.getDocument().getDocumentID();
        if (documentID == null || documentID.size() < 2) {
            MessageDigest md5 = MessageDigests.getMD5();
            md5.update(BigInteger.valueOf(System.currentTimeMillis()).toByteArray());
            Charset charset = Charsets.ISO_8859_1;
            md5.update(str.getBytes(charset));
            md5.update(str2.getBytes(charset));
            md5.update(pDDocument.getDocument().toString().getBytes(charset));
            COSString cOSString = new COSString(md5.digest(toString().getBytes(charset)));
            documentID = new COSArray();
            documentID.add((COSBase) cOSString);
            documentID.add((COSBase) cOSString);
            pDDocument.getDocument().setDocumentID(documentID);
        }
        COSString cOSString2 = (COSString) documentID.getObject(0);
        Charset charset2 = Charsets.ISO_8859_1;
        byte[] computeOwnerPassword = computeOwnerPassword(str.getBytes(charset2), str2.getBytes(charset2), i11, i12);
        byte[] computeUserPassword = computeUserPassword(str2.getBytes(charset2), computeOwnerPassword, i10, cOSString2.getBytes(), i11, i12, true);
        setEncryptionKey(computeEncryptedKey(str2.getBytes(charset2), computeOwnerPassword, null, null, null, i10, cOSString2.getBytes(), i11, i12, true, false));
        pDEncryption.setOwnerKey(computeOwnerPassword);
        pDEncryption.setUserKey(computeUserPassword);
        if (i11 == 4) {
            prepareEncryptionDictAES(pDEncryption, COSName.AESV2);
        }
    }

    private void prepareEncryptionDictRev6(String str, String str2, PDEncryption pDEncryption, int i10) {
        try {
            SecureRandom secureRandom = new SecureRandom();
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            setEncryptionKey(new byte[32]);
            secureRandom.nextBytes(getEncryptionKey());
            Charset charset = Charsets.UTF_8;
            byte[] truncate127 = truncate127(str2.getBytes(charset));
            byte[] bArr = new byte[8];
            byte[] bArr2 = new byte[8];
            secureRandom.nextBytes(bArr);
            secureRandom.nextBytes(bArr2);
            byte[] concat = concat(computeHash2B(concat(truncate127, bArr), truncate127, null), bArr, bArr2);
            cipher.init(1, new SecretKeySpec(computeHash2B(concat(truncate127, bArr2), truncate127, null), "AES"), new IvParameterSpec(new byte[16]));
            byte[] doFinal = cipher.doFinal(getEncryptionKey());
            byte[] truncate1272 = truncate127(str.getBytes(charset));
            byte[] bArr3 = new byte[8];
            byte[] bArr4 = new byte[8];
            secureRandom.nextBytes(bArr3);
            secureRandom.nextBytes(bArr4);
            byte[] concat2 = concat(computeHash2B(concat(truncate1272, bArr3, concat), truncate1272, concat), bArr3, bArr4);
            cipher.init(1, new SecretKeySpec(computeHash2B(concat(truncate1272, bArr4, concat), truncate1272, concat), "AES"), new IvParameterSpec(new byte[16]));
            byte[] doFinal2 = cipher.doFinal(getEncryptionKey());
            pDEncryption.setUserKey(concat);
            pDEncryption.setUserEncryptionKey(doFinal);
            pDEncryption.setOwnerKey(concat2);
            pDEncryption.setOwnerEncryptionKey(doFinal2);
            prepareEncryptionDictAES(pDEncryption, COSName.AESV3);
            byte[] bArr5 = new byte[16];
            bArr5[0] = (byte) i10;
            bArr5[1] = (byte) (i10 >>> 8);
            bArr5[2] = (byte) (i10 >>> 16);
            bArr5[3] = (byte) (i10 >>> 24);
            bArr5[4] = -1;
            bArr5[5] = -1;
            bArr5[6] = -1;
            bArr5[7] = -1;
            bArr5[8] = Field.ADVANCE;
            bArr5[9] = 97;
            bArr5[10] = 100;
            bArr5[11] = 98;
            for (int i11 = 12; i11 <= 15; i11++) {
                bArr5[i11] = (byte) secureRandom.nextInt();
            }
            cipher.init(1, new SecretKeySpec(getEncryptionKey(), "AES"), new IvParameterSpec(new byte[16]));
            pDEncryption.setPerms(cipher.doFinal(bArr5));
        } catch (GeneralSecurityException e10) {
            logIfStrongEncryptionMissing();
            throw new IOException(e10);
        }
    }

    private static byte[] truncate127(byte[] bArr) {
        if (bArr.length <= 127) {
            return bArr;
        }
        byte[] bArr2 = new byte[ShapeTypes.VERTICAL_SCROLL];
        System.arraycopy(bArr, 0, bArr2, 0, ShapeTypes.VERTICAL_SCROLL);
        return bArr2;
    }

    private byte[] truncateOrPad(byte[] bArr) {
        byte[] bArr2 = ENCRYPT_PADDING;
        int length = bArr2.length;
        byte[] bArr3 = new byte[length];
        int min = Math.min(bArr.length, length);
        System.arraycopy(bArr, 0, bArr3, 0, min);
        System.arraycopy(bArr2, 0, bArr3, min, bArr2.length - min);
        return bArr3;
    }

    private void validatePerms(PDEncryption pDEncryption, int i10, boolean z10) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(2, new SecretKeySpec(getEncryptionKey(), "AES"));
            byte[] doFinal = cipher.doFinal(pDEncryption.getPerms());
            if (doFinal[9] == 97 && doFinal[10] == 100) {
                byte b10 = doFinal[11];
            }
            int i11 = (doFinal[0] & 255) | ((doFinal[1] & 255) << 8) | ((doFinal[2] & 255) << 16) | ((doFinal[3] & 255) << 24);
            if (i11 != i10) {
                String.format("%08X", Integer.valueOf(i11));
                String.format("%08X", Integer.valueOf(i10));
            }
            if ((!z10 || doFinal[8] == 84) && !z10) {
                byte b11 = doFinal[8];
            }
        } catch (GeneralSecurityException e10) {
            logIfStrongEncryptionMissing();
            throw new IOException(e10);
        }
    }

    public byte[] computeEncryptedKey(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i10, byte[] bArr6, int i11, int i12, boolean z10, boolean z11) {
        if (i11 != 6 && i11 != 5) {
            return computeEncryptedKeyRev234(bArr, bArr2, i10, bArr6, z10, i12, i11);
        }
        return computeEncryptedKeyRev56(bArr, z11, bArr2, bArr3, bArr4, bArr5, i11);
    }

    public byte[] computeOwnerPassword(byte[] bArr, byte[] bArr2, int i10, int i11) {
        if (i10 == 2 && i11 != 5) {
            throw new IOException(a.c("Expected length=5 actual=", i11));
        }
        byte[] computeRC4key = computeRC4key(bArr, i10, i11);
        byte[] truncateOrPad = truncateOrPad(bArr2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encryptDataRC4(computeRC4key, new ByteArrayInputStream(truncateOrPad), byteArrayOutputStream);
        if (i10 == 3 || i10 == 4) {
            int length = computeRC4key.length;
            byte[] bArr3 = new byte[length];
            for (int i12 = 1; i12 < 20; i12++) {
                System.arraycopy(computeRC4key, 0, bArr3, 0, computeRC4key.length);
                for (int i13 = 0; i13 < length; i13++) {
                    bArr3[i13] = (byte) (bArr3[i13] ^ ((byte) i12));
                }
                InputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.reset();
                encryptDataRC4(bArr3, byteArrayInputStream, byteArrayOutputStream);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] computeUserPassword(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, int i11, int i12, boolean z10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] computeEncryptedKey = computeEncryptedKey(bArr, bArr2, null, null, null, i10, bArr3, i11, i12, z10, true);
        if (i11 == 2) {
            encryptDataRC4(computeEncryptedKey, ENCRYPT_PADDING, byteArrayOutputStream);
        } else if (i11 == 3 || i11 == 4) {
            MessageDigest md5 = MessageDigests.getMD5();
            md5.update(ENCRYPT_PADDING);
            md5.update(bArr3);
            byteArrayOutputStream.write(md5.digest());
            int length = computeEncryptedKey.length;
            byte[] bArr4 = new byte[length];
            for (int i13 = 0; i13 < 20; i13++) {
                System.arraycopy(computeEncryptedKey, 0, bArr4, 0, length);
                for (int i14 = 0; i14 < length; i14++) {
                    bArr4[i14] = (byte) (bArr4[i14] ^ i13);
                }
                InputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.reset();
                encryptDataRC4(bArr4, byteArrayInputStream, byteArrayOutputStream);
            }
            byte[] bArr5 = new byte[32];
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr5, 0, 16);
            System.arraycopy(ENCRYPT_PADDING, 0, bArr5, 16, 16);
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(bArr5);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] getUserPassword(byte[] bArr, byte[] bArr2, int i10, int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] computeRC4key = computeRC4key(bArr, i10, i11);
        if (i10 == 2) {
            encryptDataRC4(computeRC4key, bArr2, byteArrayOutputStream);
        } else if (i10 == 3 || i10 == 4) {
            int length = computeRC4key.length;
            byte[] bArr3 = new byte[length];
            byte[] bArr4 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
            for (int i12 = 19; i12 >= 0; i12--) {
                System.arraycopy(computeRC4key, 0, bArr3, 0, computeRC4key.length);
                for (int i13 = 0; i13 < length; i13++) {
                    bArr3[i13] = (byte) (bArr3[i13] ^ ((byte) i12));
                }
                byteArrayOutputStream.reset();
                encryptDataRC4(bArr3, bArr4, byteArrayOutputStream);
                bArr4 = byteArrayOutputStream.toByteArray();
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public boolean isOwnerPassword(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4, int i11, int i12, boolean z10) {
        byte[] computeHash2A;
        if (i11 != 6 && i11 != 5) {
            return isUserPassword(getUserPassword(bArr, bArr3, i11, i12), bArr2, bArr3, i10, bArr4, i11, i12, z10);
        }
        byte[] truncate127 = truncate127(bArr);
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[8];
        if (bArr3.length >= 40) {
            System.arraycopy(bArr3, 0, bArr5, 0, 32);
            System.arraycopy(bArr3, 32, bArr6, 0, 8);
            if (i11 == 5) {
                computeHash2A = computeSHA256(truncate127, bArr6, bArr2);
            } else {
                computeHash2A = computeHash2A(truncate127, bArr6, bArr2);
            }
            return Arrays.equals(computeHash2A, bArr5);
        }
        throw new IOException("Owner password is too short");
    }

    public boolean isUserPassword(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4, int i11, int i12, boolean z10) {
        if (i11 == 2 || i11 == 3 || i11 == 4) {
            return isUserPassword234(bArr, bArr2, bArr3, i10, bArr4, i11, i12, z10);
        }
        if (i11 != 5 && i11 != 6) {
            throw new IOException(a.c("Unknown Encryption Revision ", i11));
        }
        return isUserPassword56(bArr, bArr2, i11);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.encryption.SecurityHandler
    public void prepareDocumentForEncryption(PDDocument pDDocument) {
        PDEncryption encryption = pDDocument.getEncryption();
        if (encryption == null) {
            encryption = new PDEncryption();
        }
        int computeVersionNumber = computeVersionNumber();
        int computeRevisionNumber = computeRevisionNumber(computeVersionNumber);
        encryption.setFilter("Standard");
        encryption.setVersion(computeVersionNumber);
        if (computeVersionNumber != 4 && computeVersionNumber != 5) {
            encryption.removeV45filters();
        }
        encryption.setRevision(computeRevisionNumber);
        encryption.setLength(getKeyLength());
        StandardProtectionPolicy standardProtectionPolicy = (StandardProtectionPolicy) getProtectionPolicy();
        String ownerPassword = standardProtectionPolicy.getOwnerPassword();
        String userPassword = standardProtectionPolicy.getUserPassword();
        if (ownerPassword == null) {
            ownerPassword = "";
        }
        if (userPassword == null) {
            userPassword = "";
        }
        if (ownerPassword.isEmpty()) {
            ownerPassword = userPassword;
        }
        int permissionBytes = standardProtectionPolicy.getPermissions().getPermissionBytes();
        encryption.setPermissions(permissionBytes);
        int keyLength = getKeyLength() / 8;
        if (computeRevisionNumber == 6) {
            prepareEncryptionDictRev6(SaslPrep.saslPrepStored(ownerPassword), SaslPrep.saslPrepStored(userPassword), encryption, permissionBytes);
        } else {
            prepareEncryptionDictRev2345(ownerPassword, userPassword, encryption, permissionBytes, pDDocument, computeRevisionNumber, keyLength);
        }
        pDDocument.setEncryptionDictionary(encryption);
        pDDocument.getDocument().setEncryptionDictionary(encryption.getCOSObject());
    }

    @Override // com.tom_roush.pdfbox.pdmodel.encryption.SecurityHandler
    public void prepareForDecryption(PDEncryption pDEncryption, COSArray cOSArray, DecryptionMaterial decryptionMaterial) {
        int length;
        COSArray cOSArray2;
        Charset charset;
        byte[] userEncryptionKey;
        byte[] ownerEncryptionKey;
        boolean z10;
        int i10;
        PDCryptFilterDictionary stdCryptFilterDictionary;
        boolean z11;
        byte[] bArr;
        char c;
        byte[] bArr2;
        if (decryptionMaterial instanceof StandardDecryptionMaterial) {
            if (pDEncryption.getVersion() >= 4) {
                setStreamFilterName(pDEncryption.getStreamFilterName());
                setStringFilterName(pDEncryption.getStreamFilterName());
            }
            setDecryptMetadata(pDEncryption.isEncryptMetaData());
            String password = ((StandardDecryptionMaterial) decryptionMaterial).getPassword();
            if (password == null) {
                password = "";
            }
            int permissions = pDEncryption.getPermissions();
            int revision = pDEncryption.getRevision();
            if (pDEncryption.getVersion() == 1) {
                cOSArray2 = cOSArray;
                length = 5;
            } else {
                length = pDEncryption.getLength() / 8;
                cOSArray2 = cOSArray;
            }
            byte[] documentIDBytes = getDocumentIDBytes(cOSArray2);
            boolean isEncryptMetaData = pDEncryption.isEncryptMetaData();
            byte[] userKey = pDEncryption.getUserKey();
            byte[] ownerKey = pDEncryption.getOwnerKey();
            Charset charset2 = Charsets.ISO_8859_1;
            if (revision != 6 && revision != 5) {
                charset = charset2;
                ownerEncryptionKey = null;
                userEncryptionKey = null;
            } else {
                charset = Charsets.UTF_8;
                userEncryptionKey = pDEncryption.getUserEncryptionKey();
                ownerEncryptionKey = pDEncryption.getOwnerEncryptionKey();
            }
            if (revision == 6) {
                password = SaslPrep.saslPrepQuery(password);
            }
            String str = password;
            Charset charset3 = charset;
            if (isOwnerPassword(str.getBytes(charset), userKey, ownerKey, permissions, documentIDBytes, revision, length, isEncryptMetaData)) {
                setCurrentAccessPermission(AccessPermission.getOwnerAccessPermission());
                if (revision != 6) {
                    c = 5;
                    if (revision == 5) {
                        bArr = ownerKey;
                    } else {
                        bArr = ownerKey;
                        bArr2 = getUserPassword(str.getBytes(charset3), bArr, revision, length);
                        i10 = 6;
                        z10 = true;
                        setEncryptionKey(computeEncryptedKey(bArr2, bArr, userKey, ownerEncryptionKey, userEncryptionKey, permissions, documentIDBytes, revision, length, isEncryptMetaData, true));
                    }
                } else {
                    bArr = ownerKey;
                    c = 5;
                }
                bArr2 = str.getBytes(charset3);
                i10 = 6;
                z10 = true;
                setEncryptionKey(computeEncryptedKey(bArr2, bArr, userKey, ownerEncryptionKey, userEncryptionKey, permissions, documentIDBytes, revision, length, isEncryptMetaData, true));
            } else {
                z10 = true;
                if (isUserPassword(str.getBytes(charset3), userKey, ownerKey, permissions, documentIDBytes, revision, length, isEncryptMetaData)) {
                    AccessPermission accessPermission = new AccessPermission(permissions);
                    accessPermission.setReadOnly();
                    setCurrentAccessPermission(accessPermission);
                    i10 = 6;
                    setEncryptionKey(computeEncryptedKey(str.getBytes(charset3), ownerKey, userKey, ownerEncryptionKey, userEncryptionKey, permissions, documentIDBytes, revision, length, isEncryptMetaData, false));
                } else {
                    throw new InvalidPasswordException("Cannot decrypt PDF, the password is incorrect");
                }
            }
            if (revision == i10 || revision == 5) {
                validatePerms(pDEncryption, permissions, isEncryptMetaData);
            }
            if ((pDEncryption.getVersion() == 4 || pDEncryption.getVersion() == 5) && (stdCryptFilterDictionary = pDEncryption.getStdCryptFilterDictionary()) != null) {
                COSName cryptFilterMethod = stdCryptFilterDictionary.getCryptFilterMethod();
                if (!COSName.AESV2.equals(cryptFilterMethod) && !COSName.AESV3.equals(cryptFilterMethod)) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                setAES(z11);
                return;
            }
            return;
        }
        throw new IOException("Decryption material is not compatible with the document");
    }

    public StandardSecurityHandler(StandardProtectionPolicy standardProtectionPolicy) {
        setProtectionPolicy(standardProtectionPolicy);
        setKeyLength(standardProtectionPolicy.getEncryptionKeyLength());
    }

    private static byte[] concat(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, bArr.length + bArr2.length, bArr3.length);
        return bArr4;
    }

    public boolean isOwnerPassword(String str, byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, int i11, int i12, boolean z10) {
        return isOwnerPassword(str.getBytes(Charsets.ISO_8859_1), bArr, bArr2, i10, bArr3, i11, i12, z10);
    }

    public boolean isUserPassword(String str, byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, int i11, int i12, boolean z10) {
        if (i11 != 6 && i11 != 5) {
            return isUserPassword(str.getBytes(Charsets.ISO_8859_1), bArr, bArr2, i10, bArr3, i11, i12, z10);
        }
        return isUserPassword(str.getBytes(Charsets.UTF_8), bArr, bArr2, i10, bArr3, i11, i12, z10);
    }
}
