package com.bytedance.sdk.component.embedapplog;

import android.util.Pair;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PangleEncryptManager {
    public static final int CYPHER_VERSION_V4 = 4;
    public static final String KEY_CYPHER = "cypher";

    public static Pair<Integer, String> decryptType4(String str) {
        return PangleEncryptUtilsType4.decrypt(str);
    }

    public static byte[] decryptV3(byte[] bArr, int i10) {
        if (bArr != null && bArr.length != 0) {
            return PangleEncryptUtils.decrypt(bArr, bArr.length);
        }
        return null;
    }

    public static JSONObject encryptType4(JSONObject jSONObject, IDefaultEncrypt iDefaultEncrypt) {
        return PangleEncryptUtilsType4.encrypt(jSONObject, iDefaultEncrypt);
    }

    public static Pair<Integer, byte[]> encryptType4WithoutBase64(byte[] bArr) {
        return PangleEncryptUtilsType4.encryptWithoutBase64(bArr);
    }

    public static byte[] encryptV3(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return PangleEncryptUtils.encrypt(bArr, bArr.length);
        }
        return null;
    }
}
