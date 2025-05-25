package com.facebook;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.i;
import com.facebook.internal.j;
import com.facebook.internal.p;
import com.facebook.internal.q;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GraphRequest.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: j  reason: collision with root package name */
    public static final String f9701j;

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f9702k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile String f9703l;

    /* renamed from: a  reason: collision with root package name */
    public final com.facebook.a f9704a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9705b;
    public JSONObject c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f9706d;

    /* renamed from: e  reason: collision with root package name */
    public Object f9707e;

    /* renamed from: f  reason: collision with root package name */
    public final String f9708f;

    /* renamed from: g  reason: collision with root package name */
    public b f9709g;

    /* renamed from: h  reason: collision with root package name */
    public HttpMethod f9710h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9711i;

    /* compiled from: GraphRequest.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final e f9712a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f9713b;

        public a(e eVar, Object obj) {
            this.f9712a = eVar;
            this.f9713b = obj;
        }
    }

    /* compiled from: GraphRequest.kt */
    /* loaded from: classes.dex */
    public interface b {
        void b(i iVar);
    }

    /* compiled from: GraphRequest.kt */
    /* loaded from: classes.dex */
    public static final class c {
        public static final String a(Object obj) {
            String str = e.f9701j;
            if (obj instanceof String) {
                return (String) obj;
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Number)) {
                if (obj instanceof Date) {
                    String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    kotlin.jvm.internal.g.d(format, "iso8601DateFormat.format(value)");
                    return format;
                }
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            return obj.toString();
        }

        public static HttpURLConnection b(URL url) {
            URLConnection openConnection = url.openConnection();
            kotlin.jvm.internal.g.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            if (e.f9703l == null) {
                e.f9703l = b.a.f(new Object[]{"FBAndroidSDK", "18.0.2"}, 2, "%s.%s", "format(format, *args)");
                if (!p.v(null)) {
                    String format = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{e.f9703l, null}, 2));
                    kotlin.jvm.internal.g.d(format, "format(locale, format, *args)");
                    e.f9703l = format;
                }
            }
            httpURLConnection.setRequestProperty("User-Agent", e.f9703l);
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        public static ArrayList c(h hVar) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            ArrayList arrayList;
            q.b(hVar);
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = o(hVar);
                exc = null;
            } catch (Exception e10) {
                exc = e10;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                p.j(httpURLConnection2);
                throw th;
            }
            try {
                if (httpURLConnection != null) {
                    arrayList = d(hVar, httpURLConnection);
                } else {
                    int i10 = i.f9726e;
                    ArrayList a10 = i.a.a(hVar.c, null, new FacebookException(exc));
                    l(hVar, a10);
                    arrayList = a10;
                }
                p.j(httpURLConnection);
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection;
                p.j(httpURLConnection2);
                throw th;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
            if ((r6 - r13.f9428g.getTime()) > 86400000) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.util.ArrayList d(com.facebook.h r12, java.net.HttpURLConnection r13) {
            /*
                Method dump skipped, instructions count: 273
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.e.c.d(com.facebook.h, java.net.HttpURLConnection):java.util.ArrayList");
        }

        public static boolean e(Object obj) {
            if (!(obj instanceof Bitmap) && !(obj instanceof byte[]) && !(obj instanceof Uri) && !(obj instanceof ParcelFileDescriptor) && !(obj instanceof f)) {
                return false;
            }
            return true;
        }

        public static boolean f(Object obj) {
            if (!(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Number) && !(obj instanceof Date)) {
                return false;
            }
            return true;
        }

        public static e g(com.facebook.a aVar, String str, b bVar) {
            return new e(aVar, str, null, null, bVar, 32);
        }

        public static e h(com.facebook.a aVar, String str, JSONObject jSONObject, b bVar) {
            e eVar = new e(aVar, str, null, HttpMethod.POST, bVar, 32);
            eVar.c = jSONObject;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void i(org.json.JSONObject r7, java.lang.String r8, com.facebook.e.d r9) {
            /*
                java.util.regex.Pattern r0 = com.facebook.e.f9702k
                java.util.regex.Matcher r0 = r0.matcher(r8)
                boolean r1 = r0.matches()
                r2 = 1
                if (r1 == 0) goto L17
                java.lang.String r0 = r0.group(r2)
                java.lang.String r1 = "matcher.group(1)"
                kotlin.jvm.internal.g.d(r0, r1)
                goto L18
            L17:
                r0 = r8
            L18:
                java.lang.String r1 = "me/"
                r3 = 0
                boolean r1 = kotlin.text.j.M(r0, r1, r3)
                if (r1 != 0) goto L2c
                java.lang.String r1 = "/me/"
                boolean r0 = kotlin.text.j.M(r0, r1, r3)
                if (r0 == 0) goto L2a
                goto L2c
            L2a:
                r0 = r3
                goto L2d
            L2c:
                r0 = r2
            L2d:
                if (r0 == 0) goto L46
                java.lang.String r0 = ":"
                r1 = 6
                int r0 = kotlin.text.k.V(r8, r0, r3, r3, r1)
                java.lang.String r4 = "?"
                int r8 = kotlin.text.k.V(r8, r4, r3, r3, r1)
                r1 = 3
                if (r0 <= r1) goto L46
                r1 = -1
                if (r8 == r1) goto L44
                if (r0 >= r8) goto L46
            L44:
                r8 = r2
                goto L47
            L46:
                r8 = r3
            L47:
                java.util.Iterator r0 = r7.keys()
            L4b:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L76
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r4 = r7.opt(r1)
                if (r8 == 0) goto L67
                java.lang.String r5 = "image"
                boolean r5 = kotlin.text.j.G(r1, r5, r2)
                if (r5 == 0) goto L67
                r5 = r2
                goto L68
            L67:
                r5 = r3
            L68:
                java.lang.String r6 = "key"
                kotlin.jvm.internal.g.d(r1, r6)
                java.lang.String r6 = "value"
                kotlin.jvm.internal.g.d(r4, r6)
                j(r1, r4, r9, r5)
                goto L4b
            L76:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.e.c.i(org.json.JSONObject, java.lang.String, com.facebook.e$d):void");
        }

        public static void j(String str, Object obj, d dVar, boolean z10) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z10) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String f10 = b.a.f(new Object[]{str, next}, 2, "%s[%s]", "format(format, *args)");
                        Object opt = jSONObject.opt(next);
                        kotlin.jvm.internal.g.d(opt, "jsonObject.opt(propertyName)");
                        j(f10, opt, dVar, z10);
                    }
                } else if (jSONObject.has(FacebookMediationAdapter.KEY_ID)) {
                    String optString = jSONObject.optString(FacebookMediationAdapter.KEY_ID);
                    kotlin.jvm.internal.g.d(optString, "jsonObject.optString(\"id\")");
                    j(str, optString, dVar, z10);
                } else if (jSONObject.has(InMobiNetworkValues.URL)) {
                    String optString2 = jSONObject.optString(InMobiNetworkValues.URL);
                    kotlin.jvm.internal.g.d(optString2, "jsonObject.optString(\"url\")");
                    j(str, optString2, dVar, z10);
                } else if (jSONObject.has("fbsdk:create_object")) {
                    String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.g.d(jSONObject2, "jsonObject.toString()");
                    j(str, jSONObject2, dVar, z10);
                }
            } else if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String format = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
                    kotlin.jvm.internal.g.d(format, "format(locale, format, *args)");
                    Object opt2 = jSONArray.opt(i10);
                    kotlin.jvm.internal.g.d(opt2, "jsonArray.opt(i)");
                    j(format, opt2, dVar, z10);
                }
            } else if (!String.class.isAssignableFrom(cls) && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls)) {
                if (Date.class.isAssignableFrom(cls)) {
                    String format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    kotlin.jvm.internal.g.d(format2, "iso8601DateFormat.format(date)");
                    dVar.a(str, format2);
                    return;
                }
                String str2 = e.f9701j;
                p pVar = p.f9815a;
                com.facebook.d dVar2 = com.facebook.d.f9685a;
            } else {
                dVar.a(str, obj.toString());
            }
        }

        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        public static void k(h hVar, com.facebook.internal.j jVar, int i10, URL url, OutputStream outputStream, boolean z10) {
            String b10;
            boolean z11;
            g gVar = new g(outputStream, jVar, z10);
            int i11 = 1;
            if (i10 == 1) {
                e eVar = (e) hVar.c.get(0);
                HashMap hashMap = new HashMap();
                for (String key : eVar.f9706d.keySet()) {
                    Object obj = eVar.f9706d.get(key);
                    if (e(obj)) {
                        kotlin.jvm.internal.g.d(key, "key");
                        hashMap.put(key, new a(eVar, obj));
                    }
                }
                if (jVar != null) {
                    jVar.c();
                }
                Bundle bundle = eVar.f9706d;
                for (String key2 : bundle.keySet()) {
                    Object obj2 = bundle.get(key2);
                    if (f(obj2)) {
                        kotlin.jvm.internal.g.d(key2, "key");
                        gVar.g(key2, obj2, eVar);
                    }
                }
                if (jVar != null) {
                    jVar.c();
                }
                m(hashMap, gVar);
                JSONObject jSONObject = eVar.c;
                if (jSONObject != null) {
                    String path = url.getPath();
                    kotlin.jvm.internal.g.d(path, "url.path");
                    i(jSONObject, path, gVar);
                    return;
                }
                return;
            }
            Iterator<e> it = hVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    com.facebook.a aVar = it.next().f9704a;
                    if (aVar != null) {
                        b10 = aVar.f9429h;
                        break;
                    }
                } else {
                    String str = e.f9701j;
                    b10 = com.facebook.d.b();
                    break;
                }
            }
            if (b10.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                gVar.a("batch_app_id", b10);
                HashMap hashMap2 = new HashMap();
                JSONArray jSONArray = new JSONArray();
                Iterator<e> it2 = hVar.iterator();
                while (it2.hasNext()) {
                    e next = it2.next();
                    next.getClass();
                    JSONObject jSONObject2 = new JSONObject();
                    int i12 = com.facebook.internal.m.f9811a;
                    Object[] objArr = new Object[i11];
                    objArr[0] = com.facebook.d.d();
                    String format = String.format("https://graph.%s", Arrays.copyOf(objArr, i11));
                    kotlin.jvm.internal.g.d(format, "format(format, *args)");
                    String h10 = next.h(format);
                    next.a();
                    Uri parse = Uri.parse(next.b(h10, i11));
                    int i13 = 2;
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = parse.getPath();
                    objArr2[i11] = parse.getQuery();
                    String format2 = String.format("%s?%s", Arrays.copyOf(objArr2, 2));
                    kotlin.jvm.internal.g.d(format2, "format(format, *args)");
                    jSONObject2.put("relative_url", format2);
                    jSONObject2.put("method", next.f9710h);
                    com.facebook.a aVar2 = next.f9704a;
                    if (aVar2 != null) {
                        j.a aVar3 = com.facebook.internal.j.f9803d;
                        String accessToken = aVar2.f9426e;
                        synchronized (aVar3) {
                            kotlin.jvm.internal.g.e(accessToken, "accessToken");
                            com.facebook.d.h(LoggingBehavior.INCLUDE_ACCESS_TOKENS);
                            aVar3.d(accessToken);
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> it3 = next.f9706d.keySet().iterator();
                    while (true) {
                        boolean hasNext = it3.hasNext();
                        String str2 = e.f9701j;
                        if (!hasNext) {
                            break;
                        }
                        Object obj3 = next.f9706d.get(it3.next());
                        if (e(obj3)) {
                            Locale locale = Locale.ROOT;
                            Object[] objArr3 = new Object[i13];
                            objArr3[0] = "file";
                            objArr3[1] = Integer.valueOf(hashMap2.size());
                            String format3 = String.format(locale, "%s%d", Arrays.copyOf(objArr3, i13));
                            kotlin.jvm.internal.g.d(format3, "format(locale, format, *args)");
                            arrayList.add(format3);
                            hashMap2.put(format3, new a(next, obj3));
                            i13 = 2;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        jSONObject2.put("attached_files", TextUtils.join(",", arrayList));
                    }
                    JSONObject jSONObject3 = next.c;
                    if (jSONObject3 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        i(jSONObject3, format2, new com.facebook.f(arrayList2));
                        jSONObject2.put("body", TextUtils.join("&", arrayList2));
                    }
                    jSONArray.put(jSONObject2);
                    i11 = 1;
                }
                OutputStream outputStream2 = gVar.f9716a;
                if (!(outputStream2 instanceof t5.m)) {
                    String jSONArray2 = jSONArray.toString();
                    kotlin.jvm.internal.g.d(jSONArray2, "requestJsonArray.toString()");
                    gVar.a("batch", jSONArray2);
                } else {
                    kotlin.jvm.internal.g.c(outputStream2, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
                    t5.m mVar = (t5.m) outputStream2;
                    gVar.c("batch", null, null);
                    gVar.b("[", new Object[0]);
                    Iterator<e> it4 = hVar.iterator();
                    int i14 = 0;
                    while (it4.hasNext()) {
                        int i15 = i14 + 1;
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i14);
                        mVar.a(it4.next());
                        if (i14 > 0) {
                            gVar.b(",%s", jSONObject4.toString());
                        } else {
                            gVar.b("%s", jSONObject4.toString());
                        }
                        i14 = i15;
                    }
                    gVar.b("]", new Object[0]);
                    com.facebook.internal.j jVar2 = gVar.f9717b;
                    if (jVar2 != null) {
                        String concat = "    ".concat("batch");
                        String jSONArray3 = jSONArray.toString();
                        kotlin.jvm.internal.g.d(jSONArray3, "requestJsonArray.toString()");
                        jVar2.a(jSONArray3, concat);
                    }
                }
                if (jVar != null) {
                    jVar.c();
                }
                m(hashMap2, gVar);
                return;
            }
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }

        public static void l(h requests, ArrayList arrayList) {
            kotlin.jvm.internal.g.e(requests, "requests");
            int size = requests.size();
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) requests.c.get(i10);
                if (eVar.f9709g != null) {
                    arrayList2.add(new Pair(eVar.f9709g, arrayList.get(i10)));
                }
            }
            if (arrayList2.size() > 0) {
                androidx.fragment.app.g gVar = new androidx.fragment.app.g(3, arrayList2, requests);
                Handler handler = requests.f9723a;
                if (handler != null) {
                    handler.post(gVar);
                } else {
                    gVar.run();
                }
            }
        }

        public static void m(HashMap hashMap, g gVar) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = e.f9701j;
                if (e(((a) entry.getValue()).f9713b)) {
                    gVar.g((String) entry.getKey(), ((a) entry.getValue()).f9713b, ((a) entry.getValue()).f9712a);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:63:0x0156  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void n(com.facebook.h r14, java.net.HttpURLConnection r15) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.e.c.n(com.facebook.h, java.net.HttpURLConnection):void");
        }

        public static HttpURLConnection o(h hVar) {
            URL url;
            Iterator<e> it = hVar.iterator();
            while (it.hasNext()) {
                e next = it.next();
                if (HttpMethod.GET == next.f9710h && p.v(next.f9706d.getString("fields"))) {
                    j.a aVar = com.facebook.internal.j.f9803d;
                    LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                    StringBuilder sb2 = new StringBuilder("GET requests for /");
                    String str = next.f9705b;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    sb2.append(" should contain an explicit \"fields\" parameter.");
                    j.a.c(loggingBehavior, "Request", sb2.toString());
                }
            }
            try {
                if (hVar.size() == 1) {
                    url = new URL(((e) hVar.c.get(0)).g());
                } else {
                    int i10 = com.facebook.internal.m.f9811a;
                    String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{com.facebook.d.d()}, 1));
                    kotlin.jvm.internal.g.d(format, "format(format, *args)");
                    url = new URL(format);
                }
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = b(url);
                    n(hVar, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e10) {
                    p.j(httpURLConnection);
                    throw new FacebookException("could not construct request body", e10);
                } catch (JSONException e11) {
                    p.j(httpURLConnection);
                    throw new FacebookException("could not construct request body", e11);
                }
            } catch (MalformedURLException e12) {
                throw new FacebookException("could not construct URL for request", e12);
            }
        }
    }

    /* compiled from: GraphRequest.kt */
    /* loaded from: classes.dex */
    public interface d {
        void a(String str, String str2);
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0145e extends b {
        void a();
    }

    /* compiled from: GraphRequest.kt */
    /* loaded from: classes.dex */
    public static final class f<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<f<?>> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final String f9714a;

        /* renamed from: b  reason: collision with root package name */
        public final RESOURCE f9715b;

        /* compiled from: GraphRequest.kt */
        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<f<?>> {
            @Override // android.os.Parcelable.Creator
            public final f<?> createFromParcel(Parcel source) {
                kotlin.jvm.internal.g.e(source, "source");
                return new f<>(source);
            }

            @Override // android.os.Parcelable.Creator
            public final f<?>[] newArray(int i10) {
                return new f[i10];
            }
        }

        public f(Parcel parcel) {
            this.f9714a = parcel.readString();
            this.f9715b = (RESOURCE) parcel.readParcelable(com.facebook.d.a().getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i10) {
            kotlin.jvm.internal.g.e(out, "out");
            out.writeString(this.f9714a);
            out.writeParcelable(this.f9715b, i10);
        }
    }

    /* compiled from: GraphRequest.kt */
    /* loaded from: classes.dex */
    public static final class g implements d {

        /* renamed from: a  reason: collision with root package name */
        public final OutputStream f9716a;

        /* renamed from: b  reason: collision with root package name */
        public final com.facebook.internal.j f9717b;
        public boolean c = true;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f9718d;

        public g(OutputStream outputStream, com.facebook.internal.j jVar, boolean z10) {
            this.f9716a = outputStream;
            this.f9717b = jVar;
            this.f9718d = z10;
        }

        @Override // com.facebook.e.d
        public final void a(String key, String value) {
            kotlin.jvm.internal.g.e(key, "key");
            kotlin.jvm.internal.g.e(value, "value");
            c(key, null, null);
            f("%s", value);
            h();
            com.facebook.internal.j jVar = this.f9717b;
            if (jVar != null) {
                jVar.a(value, "    ".concat(key));
            }
        }

        public final void b(String str, Object... args) {
            kotlin.jvm.internal.g.e(args, "args");
            boolean z10 = this.f9718d;
            OutputStream outputStream = this.f9716a;
            if (!z10) {
                if (this.c) {
                    Charset charset = kotlin.text.a.f19966b;
                    byte[] bytes = "--".getBytes(charset);
                    kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    byte[] bytes2 = e.f9701j.getBytes(charset);
                    kotlin.jvm.internal.g.d(bytes2, "this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes2);
                    byte[] bytes3 = "\r\n".getBytes(charset);
                    kotlin.jvm.internal.g.d(bytes3, "this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes3);
                    this.c = false;
                }
                Object[] copyOf = Arrays.copyOf(args, args.length);
                byte[] bytes4 = b.a.f(copyOf, copyOf.length, str, "format(format, *args)").getBytes(kotlin.text.a.f19966b);
                kotlin.jvm.internal.g.d(bytes4, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes4);
                return;
            }
            Locale locale = Locale.US;
            Object[] copyOf2 = Arrays.copyOf(args, args.length);
            String format = String.format(locale, str, Arrays.copyOf(copyOf2, copyOf2.length));
            kotlin.jvm.internal.g.d(format, "format(locale, format, *args)");
            String encode = URLEncoder.encode(format, "UTF-8");
            kotlin.jvm.internal.g.d(encode, "encode(String.format(Loc… format, *args), \"UTF-8\")");
            byte[] bytes5 = encode.getBytes(kotlin.text.a.f19966b);
            kotlin.jvm.internal.g.d(bytes5, "this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes5);
        }

        public final void c(String str, String str2, String str3) {
            if (!this.f9718d) {
                b("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    b("; filename=\"%s\"", str2);
                }
                f("", new Object[0]);
                if (str3 != null) {
                    f("%s: %s", "Content-Type", str3);
                }
                f("", new Object[0]);
                return;
            }
            byte[] bytes = b.a.f(new Object[]{str}, 1, "%s=", "format(format, *args)").getBytes(kotlin.text.a.f19966b);
            kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
            this.f9716a.write(bytes);
        }

        public final void d(Uri contentUri, String key, String str) {
            int i10;
            long j10;
            kotlin.jvm.internal.g.e(key, "key");
            kotlin.jvm.internal.g.e(contentUri, "contentUri");
            if (str == null) {
                str = "content/unknown";
            }
            c(key, key, str);
            OutputStream outputStream = this.f9716a;
            if (outputStream instanceof t5.l) {
                p pVar = p.f9815a;
                Cursor cursor = null;
                try {
                    cursor = com.facebook.d.a().getContentResolver().query(contentUri, null, null, null, null);
                    if (cursor == null) {
                        j10 = 0;
                    } else {
                        int columnIndex = cursor.getColumnIndex("_size");
                        cursor.moveToFirst();
                        j10 = cursor.getLong(columnIndex);
                        cursor.close();
                    }
                    ((t5.l) outputStream).b(j10);
                    i10 = 0;
                } catch (Throwable th2) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th2;
                }
            } else {
                i10 = p.i(com.facebook.d.a().getContentResolver().openInputStream(contentUri), outputStream) + 0;
            }
            f("", new Object[0]);
            h();
            com.facebook.internal.j jVar = this.f9717b;
            if (jVar != null) {
                String concat = "    ".concat(key);
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
                kotlin.jvm.internal.g.d(format, "format(locale, format, *args)");
                jVar.a(format, concat);
            }
        }

        public final void e(String key, ParcelFileDescriptor descriptor, String str) {
            int i10;
            kotlin.jvm.internal.g.e(key, "key");
            kotlin.jvm.internal.g.e(descriptor, "descriptor");
            if (str == null) {
                str = "content/unknown";
            }
            c(key, key, str);
            OutputStream outputStream = this.f9716a;
            if (outputStream instanceof t5.l) {
                ((t5.l) outputStream).b(descriptor.getStatSize());
                i10 = 0;
            } else {
                i10 = p.i(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), outputStream) + 0;
            }
            f("", new Object[0]);
            h();
            com.facebook.internal.j jVar = this.f9717b;
            if (jVar != null) {
                String concat = "    ".concat(key);
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
                kotlin.jvm.internal.g.d(format, "format(locale, format, *args)");
                jVar.a(format, concat);
            }
        }

        public final void f(String str, Object... objArr) {
            b(str, Arrays.copyOf(objArr, objArr.length));
            if (!this.f9718d) {
                b("\r\n", new Object[0]);
            }
        }

        public final void g(String key, Object obj, e eVar) {
            kotlin.jvm.internal.g.e(key, "key");
            OutputStream outputStream = this.f9716a;
            if (outputStream instanceof t5.m) {
                kotlin.jvm.internal.g.c(outputStream, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
                ((t5.m) outputStream).a(eVar);
            }
            String str = e.f9701j;
            if (c.f(obj)) {
                a(key, c.a(obj));
                return;
            }
            boolean z10 = obj instanceof Bitmap;
            com.facebook.internal.j jVar = this.f9717b;
            if (z10) {
                Bitmap bitmap = (Bitmap) obj;
                kotlin.jvm.internal.g.e(bitmap, "bitmap");
                c(key, key, ContentTypes.IMAGE_PNG);
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
                f("", new Object[0]);
                h();
                if (jVar != null) {
                    jVar.a("<Image>", "    ".concat(key));
                }
            } else if (obj instanceof byte[]) {
                byte[] bytes = (byte[]) obj;
                kotlin.jvm.internal.g.e(bytes, "bytes");
                c(key, key, "content/unknown");
                outputStream.write(bytes);
                f("", new Object[0]);
                h();
                if (jVar != null) {
                    String concat = "    ".concat(key);
                    String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
                    kotlin.jvm.internal.g.d(format, "format(locale, format, *args)");
                    jVar.a(format, concat);
                }
            } else if (obj instanceof Uri) {
                d((Uri) obj, key, null);
            } else if (obj instanceof ParcelFileDescriptor) {
                e(key, (ParcelFileDescriptor) obj, null);
            } else if (obj instanceof f) {
                f fVar = (f) obj;
                RESOURCE resource = fVar.f9715b;
                boolean z11 = resource instanceof ParcelFileDescriptor;
                String str2 = fVar.f9714a;
                if (z11) {
                    e(key, (ParcelFileDescriptor) resource, str2);
                } else if (resource instanceof Uri) {
                    d((Uri) resource, key, str2);
                } else {
                    throw new IllegalArgumentException("value is not a supported type.");
                }
            } else {
                throw new IllegalArgumentException("value is not a supported type.");
            }
        }

        public final void h() {
            if (!this.f9718d) {
                f("--%s", e.f9701j);
                return;
            }
            byte[] bytes = "&".getBytes(kotlin.text.a.f19966b);
            kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
            this.f9716a.write(bytes);
        }
    }

    static {
        new c();
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        kotlin.jvm.internal.g.d(charArray, "this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i10 = 0; i10 < nextInt; i10++) {
            sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, "buffer.toString()");
        f9701j = sb3;
        f9702k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public e() {
        this(null, null, null, null, null, 63);
    }

    public static String f() {
        boolean z10;
        String b10 = com.facebook.d.b();
        q.e();
        String str = com.facebook.d.f9690g;
        if (str != null) {
            boolean z11 = true;
            if (b10.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (str.length() <= 0) {
                    z11 = false;
                }
                if (z11) {
                    return b10 + '|' + str;
                }
            }
            p pVar = p.f9815a;
            return null;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r3 == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r6 = this;
            android.os.Bundle r0 = r6.f9706d
            java.lang.String r1 = r6.e()
            r2 = 0
            if (r1 == 0) goto L10
            java.lang.String r3 = "|"
            boolean r3 = kotlin.text.k.O(r1, r3, r2)
            goto L11
        L10:
            r3 = r2
        L11:
            r4 = 1
            if (r1 == 0) goto L20
            java.lang.String r5 = "IG"
            boolean r1 = kotlin.text.j.M(r1, r5, r2)
            if (r1 == 0) goto L20
            if (r3 != 0) goto L20
            r1 = r4
            goto L21
        L20:
            r1 = r2
        L21:
            if (r1 == 0) goto L2a
            boolean r1 = r6.i()
            if (r1 == 0) goto L2a
            goto L41
        L2a:
            java.lang.String r1 = com.facebook.d.d()
            java.lang.String r5 = "instagram.com"
            boolean r1 = kotlin.jvm.internal.g.a(r1, r5)
            if (r1 != 0) goto L38
            r1 = r4
            goto L3d
        L38:
            boolean r1 = r6.i()
            r1 = r1 ^ r4
        L3d:
            if (r1 != 0) goto L42
            if (r3 != 0) goto L42
        L41:
            r2 = r4
        L42:
            java.lang.String r1 = "access_token"
            if (r2 == 0) goto L4e
            java.lang.String r2 = f()
            r0.putString(r1, r2)
            goto L57
        L4e:
            java.lang.String r2 = r6.e()
            if (r2 == 0) goto L57
            r0.putString(r1, r2)
        L57:
            boolean r1 = r0.containsKey(r1)
            if (r1 != 0) goto L71
            com.facebook.d r1 = com.facebook.d.f9685a
            com.facebook.internal.q.e()
            java.lang.String r1 = com.facebook.d.f9690g
            if (r1 == 0) goto L69
            com.facebook.internal.p r1 = com.facebook.internal.p.f9815a
            goto L71
        L69:
            com.facebook.FacebookException r0 = new com.facebook.FacebookException
            java.lang.String r1 = "A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information."
            r0.<init>(r1)
            throw r0
        L71:
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "android"
            r0.putString(r1, r2)
            java.lang.String r1 = "format"
            java.lang.String r2 = "json"
            r0.putString(r1, r2)
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.GRAPH_API_DEBUG_INFO
            com.facebook.d.h(r0)
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.GRAPH_API_DEBUG_WARNING
            com.facebook.d.h(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.e.a():void");
    }

    public final String b(String str, boolean z10) {
        if (!z10 && this.f9710h == HttpMethod.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f9706d.keySet()) {
            Object obj = this.f9706d.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (c.f(obj)) {
                buildUpon.appendQueryParameter(str2, c.a(obj).toString());
            } else if (this.f9710h != HttpMethod.GET) {
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                kotlin.jvm.internal.g.d(format, "format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        kotlin.jvm.internal.g.d(builder, "uriBuilder.toString()");
        return builder;
    }

    public final i c() {
        List requests = kotlin.collections.f.H(new e[]{this});
        kotlin.jvm.internal.g.e(requests, "requests");
        ArrayList c10 = c.c(new h(requests));
        if (c10.size() == 1) {
            return (i) c10.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    public final void d() {
        List requests = kotlin.collections.f.H(new e[]{this});
        kotlin.jvm.internal.g.e(requests, "requests");
        h hVar = new h(requests);
        q.b(hVar);
        new com.facebook.g(hVar).executeOnExecutor(com.facebook.d.c(), new Void[0]);
    }

    public final String e() {
        com.facebook.a aVar = this.f9704a;
        if (aVar != null) {
            if (!this.f9706d.containsKey("access_token")) {
                j.a aVar2 = com.facebook.internal.j.f9803d;
                String accessToken = aVar.f9426e;
                synchronized (aVar2) {
                    kotlin.jvm.internal.g.e(accessToken, "accessToken");
                    com.facebook.d.h(LoggingBehavior.INCLUDE_ACCESS_TOKENS);
                    aVar2.d(accessToken);
                }
                return accessToken;
            }
        } else if (!this.f9706d.containsKey("access_token")) {
            return f();
        }
        return this.f9706d.getString("access_token");
    }

    public final String g() {
        String f10;
        String str;
        if (this.f9710h == HttpMethod.POST && (str = this.f9705b) != null && kotlin.text.j.F(str, "/videos", false)) {
            int i10 = com.facebook.internal.m.f9811a;
            f10 = b.a.f(new Object[]{com.facebook.d.d()}, 1, "https://graph-video.%s", "format(format, *args)");
        } else {
            String subdomain = com.facebook.d.d();
            int i11 = com.facebook.internal.m.f9811a;
            kotlin.jvm.internal.g.e(subdomain, "subdomain");
            f10 = b.a.f(new Object[]{subdomain}, 1, "https://graph.%s", "format(format, *args)");
        }
        String h10 = h(f10);
        a();
        return b(h10, false);
    }

    public final String h(String str) {
        boolean z10;
        if (!kotlin.jvm.internal.g.a(com.facebook.d.d(), "instagram.com")) {
            z10 = true;
        } else {
            z10 = !i();
        }
        if (!z10) {
            int i10 = com.facebook.internal.m.f9811a;
            str = b.a.f(new Object[]{com.facebook.d.f9698o}, 1, "https://graph.%s", "format(format, *args)");
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        Pattern pattern = f9702k;
        String str2 = this.f9705b;
        if (!pattern.matcher(str2).matches()) {
            str2 = b.a.f(new Object[]{this.f9708f, str2}, 2, "%s/%s", "format(format, *args)");
        }
        objArr[1] = str2;
        return b.a.f(objArr, 2, "%s/%s", "format(format, *args)");
    }

    public final boolean i() {
        String str = this.f9705b;
        if (str == null) {
            return false;
        }
        String str2 = "^/?" + com.facebook.d.b() + "/?.*";
        if (!this.f9711i && !Pattern.matches(str2, str) && !Pattern.matches("^/?app/?.*", str)) {
            return false;
        }
        return true;
    }

    public final void j(b bVar) {
        com.facebook.d.h(LoggingBehavior.GRAPH_API_DEBUG_INFO);
        com.facebook.d.h(LoggingBehavior.GRAPH_API_DEBUG_WARNING);
        this.f9709g = bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.f9704a;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.f9705b);
        sb2.append(", graphObject: ");
        sb2.append(this.c);
        sb2.append(", httpMethod: ");
        sb2.append(this.f9710h);
        sb2.append(", parameters: ");
        sb2.append(this.f9706d);
        sb2.append("}");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return sb3;
    }

    public e(com.facebook.a aVar, String str, Bundle bundle, HttpMethod httpMethod, b bVar, int i10) {
        aVar = (i10 & 1) != 0 ? null : aVar;
        str = (i10 & 2) != 0 ? null : str;
        bundle = (i10 & 4) != 0 ? null : bundle;
        httpMethod = (i10 & 8) != 0 ? null : httpMethod;
        bVar = (i10 & 16) != 0 ? null : bVar;
        this.f9704a = aVar;
        this.f9705b = str;
        this.f9708f = null;
        j(bVar);
        this.f9710h = httpMethod == null ? HttpMethod.GET : httpMethod;
        if (bundle != null) {
            this.f9706d = new Bundle(bundle);
        } else {
            this.f9706d = new Bundle();
        }
        String str2 = com.facebook.d.f9696m;
        kotlin.jvm.internal.g.d(String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str2}, 1)), "format(format, *args)");
        p pVar = p.f9815a;
        this.f9708f = str2;
    }
