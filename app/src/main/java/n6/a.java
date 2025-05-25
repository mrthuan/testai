package n6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.g;

/* compiled from: CertificateUtil.kt */
/* loaded from: classes.dex */
public final class a {
    public static final String a(Context context) {
        try {
            Signature[] signatures = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            StringBuilder sb2 = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            g.d(signatures, "signatures");
            boolean z10 = false;
            for (Signature signature : signatures) {
                messageDigest.update(signature.toByteArray());
                sb2.append(Base64.encodeToString(messageDigest.digest(), 0));
                sb2.append(":");
            }
            if (sb2.length() > 0) {
                z10 = true;
            }
            if (z10) {
                sb2.setLength(sb2.length() - 1);
            }
            String sb3 = sb2.toString();
            g.d(sb3, "sb.toString()");
            return sb3;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
