package b5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import com.google.android.play.core.assetpacks.c;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AesUtils.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f5325a;

    public static String a(Context context, String str) {
        String E = c.E(c(context));
        fe.a.a().b(E);
        String substring = E.substring(0, 16);
        String substring2 = E.substring(16);
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(substring.getBytes(StandardCharsets.UTF_8), "AES"), new IvParameterSpec(substring2.getBytes(StandardCharsets.UTF_8)));
            return new String(cipher.doFinal(Base64.decode(str, 0)));
        } catch (Exception e10) {
            fe.a.a().c(e10);
            return "";
        }
    }

    public static String b(Context context, String str) {
        String E = c.E(c(context));
        fe.a.a().b(E);
        String substring = E.substring(0, 16);
        String substring2 = E.substring(16);
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(substring.getBytes(StandardCharsets.UTF_8), "AES"), new IvParameterSpec(substring2.getBytes(StandardCharsets.UTF_8)));
            return Base64.encodeToString(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)), 2);
        } catch (Exception e10) {
            fe.a.a().c(e10);
            return "";
        }
    }

    public static String c(Context context) {
        if (f5325a == null) {
            try {
                for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
                    f5325a = signature.toCharsString();
                }
            } catch (PackageManager.NameNotFoundException e10) {
                fe.a.a().c(e10);
            }
        }
        return f5325a;
    }
}
