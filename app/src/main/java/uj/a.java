package uj;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlinx.coroutines.flow.x;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.enums.AesKeyStrength;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: AESDecrypter.java */
/* loaded from: classes3.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public vj.a f30396a;

    /* renamed from: b  reason: collision with root package name */
    public x f30397b;
    public int c = 1;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f30398d = new byte[16];

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f30399e = new byte[16];

    public a(xj.a aVar, boolean z10, byte[] bArr, byte[] bArr2, char[] cArr) {
        int i10;
        int i11;
        byte[] bArr3 = bArr;
        if (cArr != null && cArr.length > 0) {
            AesKeyStrength aesKeyStrength = aVar.c;
            int keyLength = aesKeyStrength.getKeyLength();
            int macLength = aesKeyStrength.getMacLength();
            int i12 = keyLength + macLength + 2;
            byte[] y10 = t0.y(cArr, z10);
            x xVar = new x("HmacSHA1");
            Object obj = xVar.f20151b;
            try {
                ((Mac) obj).init(new SecretKeySpec(y10, "HmacSHA1"));
                int i13 = xVar.f20150a;
                if (i12 == 0) {
                    i10 = i13;
                } else {
                    i10 = i12;
                }
                if (i10 % i13 > 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                int i14 = (i10 / i13) + i11;
                int i15 = i10 - ((i14 - 1) * i13);
                byte[] bArr4 = new byte[i14 * i13];
                int i16 = 1;
                int i17 = 0;
                while (i16 <= i14) {
                    byte[] bArr5 = new byte[i13];
                    int i18 = i14;
                    byte[] bArr6 = new byte[bArr3.length + 4];
                    int i19 = macLength;
                    int i20 = keyLength;
                    System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
                    int length = bArr3.length;
                    bArr6[length] = (byte) (i16 / 16777216);
                    bArr6[length + 1] = (byte) (i16 / 65536);
                    bArr6[length + 2] = (byte) (i16 / 256);
                    bArr6[length + 3] = (byte) i16;
                    for (int i21 = 0; i21 < 1000; i21++) {
                        if (((ByteArrayOutputStream) xVar.f20152d).size() > 0) {
                            xVar.a(0);
                        }
                        bArr6 = ((Mac) obj).doFinal(bArr6);
                        for (int i22 = 0; i22 < i13; i22++) {
                            bArr5[i22] = (byte) (bArr5[i22] ^ bArr6[i22]);
                        }
                    }
                    int i23 = i17;
                    System.arraycopy(bArr5, 0, bArr4, i23, i13);
                    i17 = i23 + i13;
                    i16++;
                    bArr3 = bArr;
                    i14 = i18;
                    macLength = i19;
                    keyLength = i20;
                }
                int i24 = keyLength;
                int i25 = macLength;
                if (i15 < i13) {
                    byte[] bArr7 = new byte[i10];
                    System.arraycopy(bArr4, 0, bArr7, 0, i10);
                    bArr4 = bArr7;
                }
                if (bArr4.length == i12) {
                    byte[] bArr8 = new byte[2];
                    System.arraycopy(bArr4, aesKeyStrength.getMacLength() + aesKeyStrength.getKeyLength(), bArr8, 0, 2);
                    if (Arrays.equals(bArr2, bArr8)) {
                        int keyLength2 = aesKeyStrength.getKeyLength();
                        byte[] bArr9 = new byte[keyLength2];
                        System.arraycopy(bArr4, 0, bArr9, 0, keyLength2);
                        this.f30396a = new vj.a(bArr9);
                        int macLength2 = aesKeyStrength.getMacLength();
                        byte[] bArr10 = new byte[macLength2];
                        System.arraycopy(bArr4, aesKeyStrength.getKeyLength(), bArr10, 0, macLength2);
                        x xVar2 = new x("HmacSHA1");
                        try {
                            ((Mac) xVar2.f20151b).init(new SecretKeySpec(bArr10, "HmacSHA1"));
                            this.f30397b = xVar2;
                            return;
                        } catch (InvalidKeyException e10) {
                            throw new RuntimeException(e10);
                        }
                    }
                    throw new ZipException("Wrong Password", ZipException.Type.WRONG_PASSWORD);
                }
                throw new ZipException(String.format("Derived Key invalid for Key Length [%d] MAC Length [%d]", Integer.valueOf(i24), Integer.valueOf(i25)));
            } catch (InvalidKeyException e11) {
                throw new RuntimeException(e11);
            }
        }
        throw new ZipException("empty or null password provided for AES decryption", ZipException.Type.WRONG_PASSWORD);
    }

    @Override // uj.b
    public final int a(int i10, int i11, byte[] bArr) {
        int i12;
        int[] iArr;
        a aVar = this;
        byte[] bArr2 = bArr;
        int i13 = i10;
        while (true) {
            int i14 = i10 + i11;
            if (i13 < i14) {
                int i15 = i13 + 16;
                if (i15 <= i14) {
                    i12 = 16;
                } else {
                    i12 = i14 - i13;
                }
                x xVar = aVar.f30397b;
                Object obj = xVar.f20152d;
                try {
                    if (((ByteArrayOutputStream) obj).size() + i12 > 4096) {
                        xVar.a(0);
                    }
                    ((ByteArrayOutputStream) obj).write(bArr2, i13, i12);
                    int i16 = aVar.c;
                    byte[] bArr3 = aVar.f30398d;
                    bArr3[0] = (byte) i16;
                    bArr3[1] = (byte) (i16 >> 8);
                    bArr3[2] = (byte) (i16 >> 16);
                    bArr3[3] = (byte) (i16 >> 24);
                    for (int i17 = 4; i17 <= 15; i17++) {
                        bArr3[i17] = 0;
                    }
                    vj.a aVar2 = aVar.f30396a;
                    int[][] iArr2 = aVar2.f30825b;
                    if (iArr2 != null) {
                        if (16 <= bArr3.length) {
                            byte[] bArr4 = aVar.f30399e;
                            if (16 <= bArr4.length) {
                                int i18 = ((bArr3[1] & 255) << 8) | (bArr3[0] & 255) | ((bArr3[2] & 255) << 16) | (bArr3[3] << 24);
                                int i19 = (bArr3[5] & 255) << 8;
                                int i20 = (bArr3[15] << 24) | ((bArr3[14] & 255) << 16) | (bArr3[12] & 255) | ((bArr3[13] & 255) << 8);
                                int[] iArr3 = iArr2[0];
                                aVar2.c = i18 ^ iArr3[0];
                                aVar2.f30826d = (((i19 | (bArr3[4] & 255)) | ((bArr3[6] & 255) << 16)) | (bArr3[7] << 24)) ^ iArr3[1];
                                aVar2.f30827e = iArr3[2] ^ ((((bArr3[8] & 255) | ((bArr3[9] & 255) << 8)) | ((bArr3[10] & 255) << 16)) | (bArr3[11] << 24));
                                aVar2.f30828f = i20 ^ iArr3[3];
                                int i21 = 1;
                                while (true) {
                                    int i22 = aVar2.f30824a - 1;
                                    iArr = vj.a.f30823i;
                                    if (i21 >= i22) {
                                        break;
                                    }
                                    int i23 = aVar2.c;
                                    int i24 = iArr[i23 & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i25 = aVar2.f30826d;
                                    int i26 = iArr[(i25 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i27 = i24 ^ ((i26 << (-24)) | (i26 >>> 24));
                                    int i28 = aVar2.f30827e;
                                    int i29 = iArr[(i28 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i30 = i27 ^ ((i29 << (-16)) | (i29 >>> 16));
                                    int i31 = aVar2.f30828f;
                                    int i32 = iArr[(i31 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i33 = ((i32 << (-8)) | (i32 >>> 8)) ^ i30;
                                    int[] iArr4 = iArr2[i21];
                                    int i34 = i33 ^ iArr4[0];
                                    int i35 = i15;
                                    int i36 = iArr[i25 & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i37 = iArr[(i28 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i38 = ((i37 << (-24)) | (i37 >>> 24)) ^ i36;
                                    int i39 = iArr[(i31 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i40 = i38 ^ ((i39 << (-16)) | (i39 >>> 16));
                                    int i41 = iArr[(i23 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i42 = (i40 ^ ((i41 << (-8)) | (i41 >>> 8))) ^ iArr4[1];
                                    int i43 = iArr[i28 & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i44 = iArr[(i31 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i45 = ((i44 << (-24)) | (i44 >>> 24)) ^ i43;
                                    int i46 = iArr[(i23 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i47 = i45 ^ ((i46 << (-16)) | (i46 >>> 16));
                                    int i48 = iArr[(i25 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i49 = (i47 ^ ((i48 << (-8)) | (i48 >>> 8))) ^ iArr4[2];
                                    int i50 = iArr[i31 & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i51 = iArr[(i23 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i52 = i50 ^ ((i51 << (-24)) | (i51 >>> 24));
                                    int i53 = iArr[(i25 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i54 = i52 ^ ((i53 << (-16)) | (i53 >>> 16));
                                    int i55 = iArr[(i28 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i56 = i21 + 1;
                                    int i57 = (i54 ^ ((i55 << (-8)) | (i55 >>> 8))) ^ iArr4[3];
                                    int i58 = iArr[i34 & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i59 = iArr[(i42 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i60 = i58 ^ ((i59 << (-24)) | (i59 >>> 24));
                                    int i61 = iArr[(i49 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i62 = i60 ^ ((i61 << (-16)) | (i61 >>> 16));
                                    int i63 = iArr[(i57 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i64 = i62 ^ ((i63 << (-8)) | (i63 >>> 8));
                                    int[] iArr5 = iArr2[i56];
                                    aVar2.c = i64 ^ iArr5[0];
                                    int i65 = iArr[i42 & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i66 = iArr[(i49 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i67 = i65 ^ ((i66 << (-24)) | (i66 >>> 24));
                                    int i68 = iArr[(i57 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i69 = i67 ^ ((i68 << (-16)) | (i68 >>> 16));
                                    int i70 = iArr[(i34 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    aVar2.f30826d = (i69 ^ ((i70 << (-8)) | (i70 >>> 8))) ^ iArr5[1];
                                    int i71 = iArr[i49 & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i72 = iArr[(i57 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i73 = i71 ^ ((i72 << (-24)) | (i72 >>> 24));
                                    int i74 = iArr[(i34 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i75 = i73 ^ ((i74 << (-16)) | (i74 >>> 16));
                                    int i76 = iArr[(i42 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    aVar2.f30827e = (i75 ^ ((i76 << (-8)) | (i76 >>> 8))) ^ iArr5[2];
                                    int i77 = iArr[i57 & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i78 = iArr[(i34 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i79 = iArr[(i42 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    int i80 = iArr[(i49 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                    i21 = i56 + 1;
                                    aVar2.f30828f = (((i80 << (-8)) | (i80 >>> 8)) ^ (((i79 << (-16)) | (i79 >>> 16)) ^ (i77 ^ ((i78 << (-24)) | (i78 >>> 24))))) ^ iArr5[3];
                                    i15 = i35;
                                }
                                int i81 = i15;
                                int i82 = aVar2.c;
                                int i83 = iArr[i82 & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                int i84 = aVar2.f30826d;
                                int i85 = iArr[(i84 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                int i86 = i83 ^ ((i85 << (-24)) | (i85 >>> 24));
                                int i87 = aVar2.f30827e;
                                int i88 = iArr[(i87 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                int i89 = i86 ^ ((i88 << (-16)) | (i88 >>> 16));
                                int i90 = aVar2.f30828f;
                                int i91 = iArr[(i90 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                int i92 = i89 ^ ((i91 << (-8)) | (i91 >>> 8));
                                int[] iArr6 = iArr2[i21];
                                int i93 = i92 ^ iArr6[0];
                                int i94 = iArr[i84 & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                int i95 = iArr[(i87 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                int i96 = i94 ^ ((i95 << (-24)) | (i95 >>> 24));
                                int i97 = iArr[(i90 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                int i98 = i96 ^ ((i97 << (-16)) | (i97 >>> 16));
                                int i99 = iArr[(i82 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                int i100 = (i98 ^ ((i99 << (-8)) | (i99 >>> 8))) ^ iArr6[1];
                                int i101 = iArr[i87 & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                int i102 = iArr[(i90 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                int i103 = i101 ^ ((i102 << (-24)) | (i102 >>> 24));
                                int i104 = iArr[(i82 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                int i105 = i103 ^ ((i104 << (-16)) | (i104 >>> 16));
                                int i106 = iArr[(i84 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                int i107 = (i105 ^ ((i106 << (-8)) | (i106 >>> 8))) ^ iArr6[2];
                                int i108 = iArr[i90 & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                int i109 = iArr[(i82 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                int i110 = iArr[(i84 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                int i111 = (((i109 << (-24)) | (i109 >>> 24)) ^ i108) ^ ((i110 << (-16)) | (i110 >>> 16));
                                int i112 = iArr[(i87 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC];
                                int i113 = (i111 ^ ((i112 << (-8)) | (i112 >>> 8))) ^ iArr6[3];
                                byte[] bArr5 = vj.a.f30821g;
                                int[] iArr7 = iArr2[i21 + 1];
                                int i114 = ((((bArr5[i93 & FunctionEval.FunctionID.EXTERNAL_FUNC] & 255) ^ ((bArr5[(i100 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC] & 255) << 8)) ^ ((bArr5[(i107 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC] & 255) << 16)) ^ (bArr5[(i113 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC] << 24)) ^ iArr7[0];
                                aVar2.c = i114;
                                int i115 = ((((bArr5[i100 & FunctionEval.FunctionID.EXTERNAL_FUNC] & 255) ^ ((bArr5[(i107 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC] & 255) << 8)) ^ ((bArr5[(i113 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC] & 255) << 16)) ^ (bArr5[(i93 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC] << 24)) ^ iArr7[1];
                                aVar2.f30826d = i115;
                                int i116 = ((((bArr5[i107 & FunctionEval.FunctionID.EXTERNAL_FUNC] & 255) ^ ((bArr5[(i113 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC] & 255) << 8)) ^ ((bArr5[(i93 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC] & 255) << 16)) ^ (bArr5[(i100 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC] << 24)) ^ iArr7[2];
                                aVar2.f30827e = i116;
                                int i117 = ((((bArr5[i113 & FunctionEval.FunctionID.EXTERNAL_FUNC] & 255) ^ ((bArr5[(i93 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC] & 255) << 8)) ^ ((bArr5[(i100 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC] & 255) << 16)) ^ (bArr5[(i107 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC] << 24)) ^ iArr7[3];
                                aVar2.f30828f = i117;
                                bArr4[0] = (byte) i114;
                                bArr4[1] = (byte) (i114 >> 8);
                                bArr4[2] = (byte) (i114 >> 16);
                                bArr4[3] = (byte) (i114 >> 24);
                                bArr4[4] = (byte) i115;
                                bArr4[5] = (byte) (i115 >> 8);
                                bArr4[6] = (byte) (i115 >> 16);
                                bArr4[7] = (byte) (i115 >> 24);
                                bArr4[8] = (byte) i116;
                                bArr4[9] = (byte) (i116 >> 8);
                                bArr4[10] = (byte) (i116 >> 16);
                                bArr4[11] = (byte) (i116 >> 24);
                                bArr4[12] = (byte) i117;
                                bArr4[13] = (byte) (i117 >> 8);
                                bArr4[14] = (byte) (i117 >> 16);
                                bArr4[15] = (byte) (i117 >> 24);
                                for (int i118 = 0; i118 < i12; i118++) {
                                    int i119 = i13 + i118;
                                    bArr[i119] = (byte) (bArr[i119] ^ bArr4[i118]);
                                }
                                aVar = this;
                                aVar.c++;
                                bArr2 = bArr;
                                i13 = i81;
                            } else {
                                throw new ZipException("output buffer too short");
                            }
                        } else {
                            throw new ZipException("input buffer too short");
                        }
                    } else {
                        throw new ZipException("AES engine not initialised");
                    }
                } catch (IllegalStateException e10) {
                    throw new RuntimeException(e10);
                }
            } else {
                return i11;
            }
        }
    }
}
