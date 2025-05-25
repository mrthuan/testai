package com.bytedance.sdk.component.embedapplog;

import android.util.Pair;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
class PangleEncryptUtilsType4 {
    public static Pair<Integer, String> decrypt(String str) {
        try {
            Pair<Integer, String> cypher4Decrypt = PglCryptUtils.getInstance().cypher4Decrypt(str);
            return new Pair<>(Integer.valueOf(getCryptFailedReason(((Integer) cypher4Decrypt.first).intValue())), cypher4Decrypt.second);
        } catch (Throwable th2) {
            th2.getMessage();
            return new Pair<>(2, null);
        }
    }

    public static JSONObject encrypt(JSONObject jSONObject, IDefaultEncrypt iDefaultEncrypt) {
        Pair<Integer, JSONObject> pair;
        int cryptFailedReason;
        Object obj;
        try {
            pair = PglCryptUtils.getInstance().cypher4Encrypt(jSONObject);
        } catch (Throwable th2) {
            th2.getMessage();
            pair = null;
        }
        if (pair != null && ((Integer) pair.first).intValue() == 0 && (obj = pair.second) != null) {
            return (JSONObject) obj;
        }
        if (iDefaultEncrypt == null) {
            return null;
        }
        if (pair == null) {
            cryptFailedReason = 0;
        } else {
            cryptFailedReason = getCryptFailedReason(((Integer) pair.first).intValue());
        }
        try {
            return iDefaultEncrypt.encrypt(jSONObject, cryptFailedReason);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Pair<Integer, byte[]> encryptWithoutBase64(byte[] bArr) {
        Pair<Integer, byte[]> pair;
        Object obj;
        byte[] bArr2 = null;
        if (bArr == null) {
            return null;
        }
        try {
            pair = PglCryptUtils.getInstance().cypher4Encrypt(bArr);
        } catch (Throwable th2) {
            th2.getMessage();
            pair = null;
        }
        int i10 = 0;
        if (pair != null && ((Integer) pair.first).intValue() == 0 && (obj = pair.second) != null && ((byte[]) obj).length > 0) {
            bArr2 = (byte[]) obj;
        } else if (pair != null) {
            i10 = getCryptFailedReason(((Integer) pair.first).intValue());
        }
        return new Pair<>(Integer.valueOf(i10), bArr2);
    }

    private static int getCryptFailedReason(int i10) {
        switch (i10) {
            case PglCryptUtils.LOAD_SO_FAILED /* 501 */:
                return 6;
            case PglCryptUtils.INPUT_INVALID /* 502 */:
                return 4;
            case PglCryptUtils.COMPRESS_FAILED /* 503 */:
                return 1;
            case PglCryptUtils.BASE64_FAILED /* 504 */:
                return 3;
            case PglCryptUtils.ENCRYPT_FAILED /* 505 */:
            case PglCryptUtils.DECRYPT_FAILED /* 506 */:
                return 2;
            default:
                return 0;
        }
    }
}
