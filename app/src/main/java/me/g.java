package me;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: RateManager.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ne.a f22015a;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r3.equals("ur") != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(android.content.Context r6, boolean r7) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.f22015a = r0
            ne.a r0 = new ne.a
            r0.<init>()
            r5.f22015a = r0
            r1 = 0
            r2 = 1
            android.content.res.Resources r3 = r6.getResources()     // Catch: java.lang.Throwable -> L43
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Throwable -> L43
            java.util.Locale r3 = r3.locale     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = r3.getLanguage()     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "ar"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L43
            if (r4 != 0) goto L41
            java.lang.String r4 = "iw"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L43
            if (r4 != 0) goto L41
            java.lang.String r4 = "fa"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L43
            if (r4 != 0) goto L41
            java.lang.String r4 = "ur"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L47
        L41:
            r3 = r2
            goto L48
        L43:
            r3 = move-exception
            r3.printStackTrace()
        L47:
            r3 = r1
        L48:
            r0.f22439a = r3
            ne.a r0 = r5.f22015a
            android.content.pm.ApplicationInfo r3 = r6.getApplicationInfo()
            int r3 = r3.flags
            r4 = 4194304(0x400000, float:5.877472E-39)
            r3 = r3 & r4
            if (r3 != r4) goto L58
            goto L59
        L58:
            r2 = r1
        L59:
            r0.f22440b = r2
            ne.a r0 = r5.f22015a
            r0.f22442e = r1
            r0.c = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "https://play.google.com/store/apps/details?id="
            r7.<init>(r1)
            java.lang.String r1 = r6.getPackageName()
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            r0.f22443f = r7
            ne.a r7 = r5.f22015a
            java.lang.String r0 = "com.android.vending"
            r7.f22444g = r0
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131952075(0x7f1301cb, float:1.9540583E38)
            java.lang.String r6 = r6.getString(r0)
            r7.f22441d = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.g.<init>(android.content.Context, boolean):void");
    }

    public static void a(Context context, ne.a aVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(aVar.f22443f));
            if (!TextUtils.isEmpty(aVar.f22444g)) {
                intent.setPackage(aVar.f22444g);
            }
            context.startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(aVar.f22443f));
                intent2.setFlags(268435456);
                context.startActivity(intent2);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
