package u;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: CustomTabsIntent.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f30089a;

    /* compiled from: CustomTabsIntent.java */
    /* loaded from: classes.dex */
    public static class a {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public e(Intent intent) {
        this.f30089a = intent;
    }

    /* compiled from: CustomTabsIntent.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f30090a;

        /* renamed from: b  reason: collision with root package name */
        public final t0 f30091b;
        public Bundle c;

        /* renamed from: d  reason: collision with root package name */
        public int f30092d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f30093e;

        public b() {
            this.f30090a = new Intent("android.intent.action.VIEW");
            this.f30091b = new t0();
            this.f30092d = 0;
            this.f30093e = true;
        }

        public final e a() {
            Bundle bundle;
            Intent intent = this.f30090a;
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle2 = new Bundle();
                k0.i.b(bundle2, "android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle2);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f30093e);
            this.f30091b.getClass();
            intent.putExtras(new Bundle());
            Bundle bundle3 = this.c;
            if (bundle3 != null) {
                intent.putExtras(bundle3);
            }
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f30092d);
            if (Build.VERSION.SDK_INT >= 24) {
                String a10 = a.a();
                if (!TextUtils.isEmpty(a10)) {
                    if (intent.hasExtra("com.android.browser.headers")) {
                        bundle = intent.getBundleExtra("com.android.browser.headers");
                    } else {
                        bundle = new Bundle();
                    }
                    if (!bundle.containsKey("Accept-Language")) {
                        bundle.putString("Accept-Language", a10);
                        intent.putExtra("com.android.browser.headers", bundle);
                    }
                }
            }
            return new e(intent);
        }

        public b(l lVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f30090a = intent;
            this.f30091b = new t0();
            this.f30092d = 0;
            this.f30093e = true;
            if (lVar != null) {
                intent.setPackage(lVar.f30109d.getPackageName());
                IBinder asBinder = lVar.c.asBinder();
                Bundle bundle = new Bundle();
                k0.i.b(bundle, "android.support.customtabs.extra.SESSION", asBinder);
                PendingIntent pendingIntent = lVar.f30110e;
                if (pendingIntent != null) {
                    bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                }
                intent.putExtras(bundle);
            }
        }
    }
}
