package u9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.adjust.sdk.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import v9.o;
import v9.p;

/* compiled from: com.google.android.play:review@@2.0.1 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class h {
    public static final v9.f c = new v9.f("ReviewService");

    /* renamed from: a  reason: collision with root package name */
    public final o f30271a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30272b;

    public h(Context context) {
        String str;
        this.f30272b = context.getPackageName();
        v9.f fVar = p.f30800a;
        boolean z10 = false;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (r3 = signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        byte[] byteArray = signature.toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance(Constants.SHA256);
                            messageDigest.update(byteArray);
                            str = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            str = "";
                        }
                        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str) || ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str))) {
                            z10 = true;
                            break;
                        }
                    }
                } else {
                    Object[] objArr = new Object[0];
                    v9.f fVar2 = p.f30800a;
                    fVar2.getClass();
                    if (Log.isLoggable("PlayCore", 5)) {
                        v9.f.b(fVar2.f30779a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (z10) {
            this.f30271a = new o(context, c, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"));
        }
    }
}
