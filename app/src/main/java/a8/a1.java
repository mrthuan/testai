package a8;

import a8.a1;
import a8.v;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgc;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzin;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class a1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final URL f106a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzin f107b;
    public final zzgc c;

    public a1(zzin zzinVar, String str, URL url, zzgc zzgcVar) {
        this.f107b = zzinVar;
        Preconditions.f(str);
        this.f106a = url;
        this.c = zzgcVar;
    }

    public final void a(final int i10, final IOException iOException, final byte[] bArr, final Map map) {
        zzgb zzgbVar = ((zzge) this.f107b.f3529a).f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new Runnable(i10, iOException, bArr, map) { // from class: com.google.android.gms.measurement.internal.zzil

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ int f11840b;
            public final /* synthetic */ Exception c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ byte[] f11841d;

            @Override // java.lang.Runnable
            public final void run() {
                List<ResolveInfo> queryIntentActivities;
                zzge zzgeVar = a1.this.c.f11772a;
                zzlo zzloVar = zzgeVar.f11783l;
                int i11 = this.f11840b;
                Exception exc = this.c;
                zzeu zzeuVar = zzgeVar.f11780i;
                if (i11 != 200 && i11 != 204) {
                    if (i11 == 304) {
                        i11 = 304;
                    }
                    zzge.f(zzeuVar);
                    zzeuVar.f11715i.c(Integer.valueOf(i11), "Network Request for Deferred Deep Link failed. response, exception", exc);
                }
                if (exc == null) {
                    v vVar = zzgeVar.f11779h;
                    zzge.d(vVar);
                    vVar.f355r.a(true);
                    byte[] bArr2 = this.f11841d;
                    if (bArr2 != null && bArr2.length != 0) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(bArr2));
                            String optString = jSONObject.optString(Constants.DEEPLINK, "");
                            String optString2 = jSONObject.optString("gclid", "");
                            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                            if (TextUtils.isEmpty(optString)) {
                                zzge.f(zzeuVar);
                                zzeuVar.f11719m.a("Deferred Deep Link is empty.");
                            } else {
                                zzge.d(zzloVar);
                                Object obj = zzloVar.f3529a;
                                if (!TextUtils.isEmpty(optString) && (queryIntentActivities = ((zzge) obj).f11773a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("gclid", optString2);
                                    bundle.putString("_cis", "ddp");
                                    zzgeVar.f11787p.t(bundle, "auto", "_cmp");
                                    if (!TextUtils.isEmpty(optString)) {
                                        try {
                                            SharedPreferences.Editor edit = ((zzge) obj).f11773a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                            edit.putString(Constants.DEEPLINK, optString);
                                            edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                            if (edit.commit()) {
                                                ((zzge) obj).f11773a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                            }
                                        } catch (RuntimeException e10) {
                                            zzeu zzeuVar2 = ((zzge) obj).f11780i;
                                            zzge.f(zzeuVar2);
                                            zzeuVar2.f11712f.b(e10, "Failed to persist Deferred Deep Link. exception");
                                        }
                                    }
                                }
                                zzge.f(zzeuVar);
                                zzeuVar.f11715i.c(optString2, "Deferred Deep Link validation failed. gclid, deep link", optString);
                            }
                            return;
                        } catch (JSONException e11) {
                            zzge.f(zzeuVar);
                            zzeuVar.f11712f.b(e11, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    zzge.f(zzeuVar);
                    zzeuVar.f11719m.a("Deferred Deep Link response empty.");
                    return;
                }
                zzge.f(zzeuVar);
                zzeuVar.f11715i.c(Integer.valueOf(i11), "Network Request for Deferred Deep Link failed. response, exception", exc);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.zzin r0 = r10.f107b
            java.lang.Object r1 = r0.f3529a
            com.google.android.gms.measurement.internal.zzge r1 = (com.google.android.gms.measurement.internal.zzge) r1
            com.google.android.gms.measurement.internal.zzgb r1 = r1.f11781j
            com.google.android.gms.measurement.internal.zzge.f(r1)
            r1.q()
            java.lang.Object r0 = r0.f3529a
            r1 = 0
            r2 = 0
            java.net.URL r3 = r10.f106a     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            if (r4 == 0) goto L8a
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            r3.setDefaultUseCaches(r1)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            r4 = r0
            com.google.android.gms.measurement.internal.zzge r4 = (com.google.android.gms.measurement.internal.zzge) r4     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            r4.getClass()     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            com.google.android.gms.measurement.internal.zzge r0 = (com.google.android.gms.measurement.internal.zzge) r0     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            r0.getClass()     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            r0 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r0)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            r3.setInstanceFollowRedirects(r1)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            r0 = 1
            r3.setDoInput(r0)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            int r0 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            java.util.Map r4 = r3.getHeaderFields()     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L80
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L6e
            r5.<init>()     // Catch: java.lang.Throwable -> L6e
            java.io.InputStream r6 = r3.getInputStream()     // Catch: java.lang.Throwable -> L6e
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L6c
        L54:
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L6c
            if (r8 <= 0) goto L5e
            r5.write(r7, r1, r8)     // Catch: java.lang.Throwable -> L6c
            goto L54
        L5e:
            byte[] r1 = r5.toByteArray()     // Catch: java.lang.Throwable -> L6c
            r6.close()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
            r3.disconnect()
            r10.a(r0, r2, r1, r4)
            return
        L6c:
            r1 = move-exception
            goto L70
        L6e:
            r1 = move-exception
            r6 = r2
        L70:
            if (r6 == 0) goto L75
            r6.close()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
        L75:
            throw r1     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
        L76:
            r1 = move-exception
            goto L7c
        L78:
            r1 = move-exception
            goto L82
        L7a:
            r1 = move-exception
            r4 = r2
        L7c:
            r9 = r1
            r1 = r0
            r0 = r9
            goto L95
        L80:
            r1 = move-exception
            r4 = r2
        L82:
            r9 = r1
            r1 = r0
            r0 = r9
            goto La1
        L86:
            r0 = move-exception
            goto L94
        L88:
            r0 = move-exception
            goto La0
        L8a:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            throw r0     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
        L92:
            r0 = move-exception
            r3 = r2
        L94:
            r4 = r2
        L95:
            if (r3 == 0) goto L9a
            r3.disconnect()
        L9a:
            r10.a(r1, r2, r2, r4)
            throw r0
        L9e:
            r0 = move-exception
            r3 = r2
        La0:
            r4 = r2
        La1:
            if (r3 == 0) goto La6
            r3.disconnect()
        La6:
            r10.a(r1, r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.a1.run():void");
    }
}
