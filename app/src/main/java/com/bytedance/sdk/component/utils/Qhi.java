package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;
import androidx.appcompat.view.menu.d;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* compiled from: AESUtils.java */
/* loaded from: classes.dex */
public class Qhi {

    /* compiled from: AESUtils.java */
    /* renamed from: com.bytedance.sdk.component.utils.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0098Qhi {
        static final Random Qhi = Qhi.ac();
    }

    public static JSONObject Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return Qhi(jSONObject.toString());
    }

    public static String ac(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String Qhi = Qhi(str.substring(1, 33), 32);
        String substring = str.substring(33, 49);
        return (substring == null || Qhi == null) ? str : com.bytedance.sdk.component.CJ.Qhi.cJ(str.substring(49), substring, Qhi);
    }

    public static String cJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String Qhi = Qhi();
        String Qhi2 = Qhi(Qhi, 32);
        String cJ = cJ();
        return d.d("3", Qhi, cJ, (Qhi2 == null || cJ == null) ? null : com.bytedance.sdk.component.CJ.Qhi.Qhi(str, cJ, Qhi2));
    }

    public static JSONObject Qhi(String str) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            try {
                String cJ = cJ(str);
                if (!TextUtils.isEmpty(cJ)) {
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, cJ);
                    jSONObject.put("cypher", 3);
                } else {
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                    jSONObject.put("cypher", 0);
                }
            } catch (Throwable unused) {
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                jSONObject.put("cypher", 0);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
        return jSONObject;
    }

    public static Random ac() {
        SecureRandom instanceStrong;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                instanceStrong = SecureRandom.getInstanceStrong();
                return instanceStrong;
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    public static String cJ() {
        String Qhi = Qhi(8);
        if (Qhi == null || Qhi.length() != 16) {
            return null;
        }
        return Qhi;
    }

    public static String Qhi() {
        String Qhi = Qhi(16);
        if (Qhi == null || Qhi.length() != 32) {
            return null;
        }
        return Qhi;
    }

    public static String Qhi(String str, int i10) {
        if (str == null || str.length() != i10) {
            return null;
        }
        int i11 = i10 / 2;
        return str.substring(i11, i10) + str.substring(0, i11);
    }

    public static String Qhi(int i10) {
        try {
            byte[] bArr = new byte[i10];
            C0098Qhi.Qhi.nextBytes(bArr);
            return Tgh.Qhi(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
