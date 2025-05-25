package com.facebook;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GraphResponse.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f9726e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final HttpURLConnection f9727a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f9728b;
    public final FacebookRequestError c;

    /* renamed from: d  reason: collision with root package name */
    public final JSONObject f9729d;

    /* compiled from: GraphResponse.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static ArrayList a(List requests, HttpURLConnection httpURLConnection, FacebookException facebookException) {
            kotlin.jvm.internal.g.e(requests, "requests");
            List<e> list = requests;
            ArrayList arrayList = new ArrayList(kotlin.collections.g.h0(list, 10));
            for (e eVar : list) {
                arrayList.add(new i(eVar, httpURLConnection, new FacebookRequestError(facebookException)));
            }
            return arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x00de A[Catch: JSONException -> 0x011b, TryCatch #0 {JSONException -> 0x011b, blocks: (B:5:0x0018, B:7:0x001e, B:9:0x0028, B:11:0x002c, B:14:0x0038, B:16:0x0043, B:19:0x004d, B:22:0x0057, B:25:0x005f, B:27:0x0065, B:30:0x006f, B:33:0x0079, B:47:0x00de, B:35:0x0082, B:38:0x008f, B:40:0x0098, B:44:0x00af, B:55:0x00f8, B:57:0x010a, B:58:0x0110), top: B:101:0x0018 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01ad  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.facebook.i b(com.facebook.e r23, java.net.HttpURLConnection r24, java.lang.Object r25, java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 525
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.i.a.b(com.facebook.e, java.net.HttpURLConnection, java.lang.Object, java.lang.Object):com.facebook.i");
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.util.ArrayList c(java.io.InputStream r13, java.net.HttpURLConnection r14, com.facebook.h r15) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.i.a.c(java.io.InputStream, java.net.HttpURLConnection, com.facebook.h):java.util.ArrayList");
        }
    }

    public i(e request, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        kotlin.jvm.internal.g.e(request, "request");
        this.f9727a = httpURLConnection;
        this.f9728b = jSONObject;
        this.c = facebookRequestError;
        this.f9729d = jSONObject;
    }

    public final String toString() {
        String str;
        int i10;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f9727a;
            if (httpURLConnection != null) {
                i10 = httpURLConnection.getResponseCode();
            } else {
                i10 = 200;
            }
            objArr[0] = Integer.valueOf(i10);
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            kotlin.jvm.internal.g.d(str, "format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder g10 = b.a.g("{Response:  responseCode: ", str, ", graphObject: ");
        g10.append(this.f9728b);
        g10.append(", error: ");
        g10.append(this.c);
        g10.append("}");
        String sb2 = g10.toString();
        kotlin.jvm.internal.g.d(sb2, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return sb2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(e request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, jSONObject, null, null);
        kotlin.jvm.internal.g.e(request, "request");
        kotlin.jvm.internal.g.e(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(e request, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(request, httpURLConnection, null, null, facebookRequestError);
        kotlin.jvm.internal.g.e(request, "request");
    }
