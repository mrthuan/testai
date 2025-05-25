package ma;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: IdManager.java */
/* loaded from: classes2.dex */
public final class f0 implements g0 {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f21894g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    public static final String f21895h = Pattern.quote(PackagingURIHelper.FORWARD_SLASH_STRING);

    /* renamed from: a  reason: collision with root package name */
    public final k3.e f21896a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f21897b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final eb.e f21898d;

    /* renamed from: e  reason: collision with root package name */
    public final a0 f21899e;

    /* renamed from: f  reason: collision with root package name */
    public String f21900f;

    public f0(Context context, String str, eb.e eVar, a0 a0Var) {
        if (str != null) {
            this.f21897b = context;
            this.c = str;
            this.f21898d = eVar;
            this.f21899e = a0Var;
            this.f21896a = new k3.e();
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    public static String b() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        String uuid = UUID.randomUUID().toString();
        if (uuid == null) {
            lowerCase = null;
        } else {
            lowerCase = f21894g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final synchronized String c() {
        String str;
        String str2 = this.f21900f;
        if (str2 != null) {
            return str2;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        boolean z10 = false;
        SharedPreferences sharedPreferences = this.f21897b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        Log.isLoggable("FirebaseCrashlytics", 2);
        if (this.f21899e.b()) {
            try {
                str = (String) j0.a(this.f21898d.getId());
            } catch (Exception unused) {
                str = null;
            }
            Log.isLoggable("FirebaseCrashlytics", 2);
            if (str == null) {
                if (string == null) {
                    str = b();
                } else {
                    str = string;
                }
            }
            if (str.equals(string)) {
                this.f21900f = sharedPreferences.getString("crashlytics.installation.id", null);
            } else {
                this.f21900f = a(sharedPreferences, str);
            }
        } else {
            if (string != null && string.startsWith("SYN_")) {
                z10 = true;
            }
            if (z10) {
                this.f21900f = sharedPreferences.getString("crashlytics.installation.id", null);
            } else {
                this.f21900f = a(sharedPreferences, b());
            }
        }
        if (this.f21900f == null) {
            this.f21900f = a(sharedPreferences, b());
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        return this.f21900f;
    }

    public final String d() {
        String str;
        k3.e eVar = this.f21896a;
        Context context = this.f21897b;
        synchronized (eVar) {
            if (((String) eVar.f19557a) == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                eVar.f19557a = installerPackageName;
            }
            if ("".equals((String) eVar.f19557a)) {
                str = null;
            } else {
                str = (String) eVar.f19557a;
            }
        }
        return str;
    }
}
