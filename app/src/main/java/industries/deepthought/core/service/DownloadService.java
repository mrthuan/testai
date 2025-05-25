package industries.deepthought.core.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;

/* loaded from: classes.dex */
public class DownloadService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public final a f18570a = new a();

    /* loaded from: classes.dex */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 0) {
                DownloadService.this.stopSelf();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[Catch: Exception -> 0x0063, TRY_LEAVE, TryCatch #1 {Exception -> 0x0063, blocks: (B:11:0x002f, B:13:0x005a, B:21:0x0068), top: B:34:0x002f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(industries.deepthought.core.service.DownloadService r12, android.content.Context r13) {
        /*
            java.lang.String r0 = "exitadCode"
            r12.getClass()
            java.lang.String r12 = "app_icon"
            java.lang.String r1 = ""
            android.content.SharedPreferences r2 = de.e.i(r13)     // Catch: org.json.JSONException -> L93
            java.lang.String r2 = r2.getString(r0, r1)     // Catch: org.json.JSONException -> L93
            if (r2 == 0) goto L97
            boolean r3 = r2.equals(r1)     // Catch: org.json.JSONException -> L93
            if (r3 != 0) goto L97
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: org.json.JSONException -> L93
            r3.<init>(r2)     // Catch: org.json.JSONException -> L93
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L93
            r2.<init>()     // Catch: org.json.JSONException -> L93
            r4 = 0
            r5 = r4
        L25:
            int r6 = r3.length()     // Catch: org.json.JSONException -> L93
            if (r5 >= r6) goto L79
            org.json.JSONObject r6 = r3.getJSONObject(r5)     // Catch: org.json.JSONException -> L93
            java.lang.String r7 = r6.getString(r12)     // Catch: java.lang.Exception -> L63
            java.lang.String r8 = com.google.android.play.core.assetpacks.c.E(r7)     // Catch: java.lang.Exception -> L63
            java.io.File r9 = new java.io.File     // Catch: java.lang.Exception -> L63
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L63
            r10.<init>()     // Catch: java.lang.Exception -> L63
            java.lang.String r11 = de.e.g(r13)     // Catch: java.lang.Exception -> L63
            r10.append(r11)     // Catch: java.lang.Exception -> L63
            java.lang.String r11 = "/"
            r10.append(r11)     // Catch: java.lang.Exception -> L63
            r10.append(r8)     // Catch: java.lang.Exception -> L63
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Exception -> L63
            r9.<init>(r8)     // Catch: java.lang.Exception -> L63
            boolean r8 = r9.exists()     // Catch: java.lang.Exception -> L63
            if (r8 != 0) goto L65
            java.lang.String r7 = d(r9, r7)     // Catch: java.lang.Exception -> L63
            if (r7 == 0) goto L61
            goto L65
        L61:
            r7 = r4
            goto L66
        L63:
            r6 = move-exception
            goto L73
        L65:
            r7 = 1
        L66:
            if (r7 == 0) goto L76
            java.lang.String r7 = r9.getAbsolutePath()     // Catch: java.lang.Exception -> L63
            r6.put(r12, r7)     // Catch: java.lang.Exception -> L63
            r2.put(r6)     // Catch: java.lang.Exception -> L63
            goto L76
        L73:
            r6.printStackTrace()     // Catch: org.json.JSONException -> L93
        L76:
            int r5 = r5 + 1
            goto L25
        L79:
            java.lang.String r12 = r2.toString()     // Catch: org.json.JSONException -> L93
            boolean r1 = r12.equals(r1)     // Catch: org.json.JSONException -> L93
            if (r1 != 0) goto L97
            android.content.SharedPreferences r13 = de.e.i(r13)     // Catch: org.json.JSONException -> L93
            android.content.SharedPreferences$Editor r13 = r13.edit()     // Catch: org.json.JSONException -> L93
            android.content.SharedPreferences$Editor r12 = r13.putString(r0, r12)     // Catch: org.json.JSONException -> L93
            r12.apply()     // Catch: org.json.JSONException -> L93
            goto L97
        L93:
            r12 = move-exception
            r12.printStackTrace()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: industries.deepthought.core.service.DownloadService.a(industries.deepthought.core.service.DownloadService, android.content.Context):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
        r9.put("app_cover", r7.getAbsolutePath());
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[Catch: Exception -> 0x0076, TRY_LEAVE, TryCatch #2 {Exception -> 0x0076, blocks: (B:12:0x003c, B:14:0x0042, B:16:0x0048, B:18:0x006d, B:26:0x007b), top: B:55:0x003c, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(industries.deepthought.core.service.DownloadService r16, android.content.Context r17) {
        /*
            java.lang.String r1 = "self_ads"
            r16.getClass()
            java.lang.String r2 = "/"
            java.lang.String r3 = "app_cover"
            java.lang.String r4 = "app_icon"
            java.lang.String r5 = ""
            android.content.SharedPreferences r0 = de.e.i(r17)     // Catch: org.json.JSONException -> Le7
            java.lang.String r0 = r0.getString(r1, r5)     // Catch: org.json.JSONException -> Le7
            if (r0 == 0) goto Leb
            boolean r6 = r0.equals(r5)     // Catch: org.json.JSONException -> Le7
            if (r6 != 0) goto Leb
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: org.json.JSONException -> Le7
            r6.<init>(r0)     // Catch: org.json.JSONException -> Le7
            r8 = 0
        L23:
            int r0 = r6.length()     // Catch: org.json.JSONException -> Le7
            if (r8 >= r0) goto Ld3
            org.json.JSONObject r9 = r6.getJSONObject(r8)     // Catch: org.json.JSONException -> Le7
            java.lang.String r0 = r9.optString(r4, r5)     // Catch: org.json.JSONException -> Le7
            java.lang.String r10 = r9.optString(r3, r5)     // Catch: org.json.JSONException -> Le7
            java.lang.String r11 = "package"
            java.lang.String r11 = r9.optString(r11, r5)     // Catch: org.json.JSONException -> Le7
            r12 = 1
            boolean r13 = r11.equals(r5)     // Catch: java.lang.Exception -> L76
            if (r13 != 0) goto L86
            boolean r13 = r0.equals(r5)     // Catch: java.lang.Exception -> L76
            if (r13 != 0) goto L86
            java.lang.String r13 = com.google.android.play.core.assetpacks.c.E(r0)     // Catch: java.lang.Exception -> L76
            java.io.File r14 = new java.io.File     // Catch: java.lang.Exception -> L76
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L76
            r15.<init>()     // Catch: java.lang.Exception -> L76
            java.lang.String r7 = de.e.g(r17)     // Catch: java.lang.Exception -> L76
            r15.append(r7)     // Catch: java.lang.Exception -> L76
            r15.append(r2)     // Catch: java.lang.Exception -> L76
            r15.append(r13)     // Catch: java.lang.Exception -> L76
            java.lang.String r7 = r15.toString()     // Catch: java.lang.Exception -> L76
            r14.<init>(r7)     // Catch: java.lang.Exception -> L76
            boolean r7 = r14.exists()     // Catch: java.lang.Exception -> L76
            if (r7 != 0) goto L78
            java.lang.String r0 = d(r14, r0)     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L74
            goto L78
        L74:
            r0 = 0
            goto L79
        L76:
            r0 = move-exception
            goto L83
        L78:
            r0 = r12
        L79:
            if (r0 == 0) goto L86
            java.lang.String r0 = r14.getAbsolutePath()     // Catch: java.lang.Exception -> L76
            r9.put(r4, r0)     // Catch: java.lang.Exception -> L76
            goto L86
        L83:
            r0.printStackTrace()     // Catch: org.json.JSONException -> Le7
        L86:
            boolean r0 = r11.equals(r5)     // Catch: java.lang.Exception -> Lc0
            if (r0 != 0) goto Lcf
            boolean r0 = r10.equals(r5)     // Catch: java.lang.Exception -> Lc0
            if (r0 != 0) goto Lcf
            java.lang.String r0 = com.google.android.play.core.assetpacks.c.E(r10)     // Catch: java.lang.Exception -> Lc0
            java.io.File r7 = new java.io.File     // Catch: java.lang.Exception -> Lc0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc0
            r11.<init>()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r13 = de.e.g(r17)     // Catch: java.lang.Exception -> Lc0
            r11.append(r13)     // Catch: java.lang.Exception -> Lc0
            r11.append(r2)     // Catch: java.lang.Exception -> Lc0
            r11.append(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Exception -> Lc0
            r7.<init>(r0)     // Catch: java.lang.Exception -> Lc0
            boolean r0 = r7.exists()     // Catch: java.lang.Exception -> Lc0
            if (r0 != 0) goto Lc2
            java.lang.String r0 = d(r7, r10)     // Catch: java.lang.Exception -> Lc0
            if (r0 == 0) goto Lbe
            goto Lc2
        Lbe:
            r12 = 0
            goto Lc2
        Lc0:
            r0 = move-exception
            goto Lcc
        Lc2:
            if (r12 == 0) goto Lcf
            java.lang.String r0 = r7.getAbsolutePath()     // Catch: java.lang.Exception -> Lc0
            r9.put(r3, r0)     // Catch: java.lang.Exception -> Lc0
            goto Lcf
        Lcc:
            r0.printStackTrace()     // Catch: org.json.JSONException -> Le7
        Lcf:
            int r8 = r8 + 1
            goto L23
        Ld3:
            java.lang.String r0 = r6.toString()     // Catch: org.json.JSONException -> Le7
            android.content.SharedPreferences r2 = de.e.i(r17)     // Catch: org.json.JSONException -> Le7
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: org.json.JSONException -> Le7
            android.content.SharedPreferences$Editor r0 = r2.putString(r1, r0)     // Catch: org.json.JSONException -> Le7
            r0.apply()     // Catch: org.json.JSONException -> Le7
            goto Leb
        Le7:
            r0 = move-exception
            r0.printStackTrace()
        Leb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: industries.deepthought.core.service.DownloadService.b(industries.deepthought.core.service.DownloadService, android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[Catch: Exception -> 0x0077, TryCatch #1 {Exception -> 0x0077, blocks: (B:13:0x003f, B:15:0x006e, B:23:0x007c, B:24:0x0083), top: B:36:0x003f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(industries.deepthought.core.service.DownloadService r14, android.content.Context r15) {
        /*
            java.lang.String r0 = "self_spread"
            r14.getClass()
            java.lang.String r14 = "bg_img"
            java.lang.String r1 = ""
            android.content.SharedPreferences r2 = de.e.i(r15)     // Catch: org.json.JSONException -> La5
            java.lang.String r2 = r2.getString(r0, r1)     // Catch: org.json.JSONException -> La5
            if (r2 == 0) goto La9
            boolean r1 = r2.equals(r1)     // Catch: org.json.JSONException -> La5
            if (r1 != 0) goto La9
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> La5
            r1.<init>(r2)     // Catch: org.json.JSONException -> La5
            java.util.Iterator r2 = r1.keys()     // Catch: org.json.JSONException -> La5
        L22:
            boolean r3 = r2.hasNext()     // Catch: org.json.JSONException -> La5
            if (r3 == 0) goto L91
            java.lang.Object r3 = r2.next()     // Catch: org.json.JSONException -> La5
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> La5
            org.json.JSONArray r4 = r1.getJSONArray(r3)     // Catch: org.json.JSONException -> La5
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: org.json.JSONException -> La5
            r5.<init>()     // Catch: org.json.JSONException -> La5
            r6 = 0
            r7 = r6
        L39:
            int r8 = r4.length()     // Catch: org.json.JSONException -> La5
            if (r7 >= r8) goto L8d
            org.json.JSONObject r8 = r4.getJSONObject(r7)     // Catch: java.lang.Exception -> L77
            java.lang.String r9 = r8.getString(r14)     // Catch: java.lang.Exception -> L77
            java.lang.String r10 = com.google.android.play.core.assetpacks.c.E(r9)     // Catch: java.lang.Exception -> L77
            java.io.File r11 = new java.io.File     // Catch: java.lang.Exception -> L77
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L77
            r12.<init>()     // Catch: java.lang.Exception -> L77
            java.lang.String r13 = de.e.g(r15)     // Catch: java.lang.Exception -> L77
            r12.append(r13)     // Catch: java.lang.Exception -> L77
            java.lang.String r13 = "/"
            r12.append(r13)     // Catch: java.lang.Exception -> L77
            r12.append(r10)     // Catch: java.lang.Exception -> L77
            java.lang.String r10 = r12.toString()     // Catch: java.lang.Exception -> L77
            r11.<init>(r10)     // Catch: java.lang.Exception -> L77
            boolean r10 = r11.exists()     // Catch: java.lang.Exception -> L77
            if (r10 != 0) goto L79
            java.lang.String r9 = d(r11, r9)     // Catch: java.lang.Exception -> L77
            if (r9 == 0) goto L75
            goto L79
        L75:
            r9 = r6
            goto L7a
        L77:
            r8 = move-exception
            goto L87
        L79:
            r9 = 1
        L7a:
            if (r9 == 0) goto L83
            java.lang.String r9 = r11.getAbsolutePath()     // Catch: java.lang.Exception -> L77
            r8.put(r14, r9)     // Catch: java.lang.Exception -> L77
        L83:
            r5.put(r8)     // Catch: java.lang.Exception -> L77
            goto L8a
        L87:
            r8.printStackTrace()     // Catch: org.json.JSONException -> La5
        L8a:
            int r7 = r7 + 1
            goto L39
        L8d:
            r1.put(r3, r5)     // Catch: org.json.JSONException -> La5
            goto L22
        L91:
            java.lang.String r14 = r1.toString()     // Catch: org.json.JSONException -> La5
            android.content.SharedPreferences r15 = de.e.i(r15)     // Catch: org.json.JSONException -> La5
            android.content.SharedPreferences$Editor r15 = r15.edit()     // Catch: org.json.JSONException -> La5
            android.content.SharedPreferences$Editor r14 = r15.putString(r0, r14)     // Catch: org.json.JSONException -> La5
            r14.apply()     // Catch: org.json.JSONException -> La5
            goto La9
        La5:
            r14 = move-exception
            r14.printStackTrace()
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: industries.deepthought.core.service.DownloadService.c(industries.deepthought.core.service.DownloadService, android.content.Context):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
        if (r6 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0096, code lost:
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bc, code lost:
        if (r6 != 0) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d(java.io.File r5, java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: industries.deepthought.core.service.DownloadService.d(java.io.File, java.lang.String):java.lang.String");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this) {
            new Thread(new se.a(this, this)).start();
        }
        return super.onStartCommand(intent, i10, i11);
    }
}
