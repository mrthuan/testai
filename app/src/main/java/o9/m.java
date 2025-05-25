package o9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.ads.ADRequestList;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.install.InstallException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import p9.x;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: e  reason: collision with root package name */
    public static final p9.n f22774e = new p9.n("AppUpdateService");

    /* renamed from: f  reason: collision with root package name */
    public static final Intent f22775f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a  reason: collision with root package name */
    public final x f22776a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22777b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final n f22778d;

    public m(Context context, n nVar) {
        String str;
        this.f22777b = context.getPackageName();
        this.c = context;
        this.f22778d = nVar;
        p9.n nVar2 = p9.a.f23801a;
        boolean z10 = false;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (r1 = signatureArr.length) != 0) {
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
                    p9.n nVar3 = p9.a.f23801a;
                    nVar3.getClass();
                    if (Log.isLoggable("PlayCore", 5)) {
                        p9.n.d(nVar3.f23814a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (z10) {
            Context applicationContext = context.getApplicationContext();
            this.f22776a = new x(applicationContext != null ? applicationContext : context, f22774e, f22775f);
        }
    }

    public static Bundle a(m mVar, String str) {
        Integer num;
        Context context = mVar.c;
        Bundle bundle = new Bundle();
        bundle.putAll(b());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            Object[] objArr = new Object[0];
            p9.n nVar = f22774e;
            nVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                p9.n.d(nVar.f23814a, "The current version of the app could not be retrieved", objArr);
            }
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    public static Bundle b() {
        Map map;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        HashMap hashMap = p9.k.f23808a;
        synchronized (p9.k.class) {
            HashMap hashMap2 = p9.k.f23808a;
            if (!hashMap2.containsKey("app_update")) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("java", 11004);
                hashMap2.put("app_update", hashMap3);
            }
            map = (Map) hashMap2.get("app_update");
        }
        bundle2.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey(ADRequestList.UNITY)) {
            bundle2.putInt("playcore_unity_version", ((Integer) map.get(ADRequestList.UNITY)).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    public static d8.o c() {
        Object[] objArr = {-9};
        p9.n nVar = f22774e;
        nVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            p9.n.d(nVar.f23814a, "onError(%d)", objArr);
        }
        return Tasks.d(new InstallException(-9));
    }
}
