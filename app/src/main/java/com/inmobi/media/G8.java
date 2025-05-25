package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class G8 {

    /* renamed from: a  reason: collision with root package name */
    public final String f14275a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14276b;
    public final Ib c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14277d;

    /* renamed from: e  reason: collision with root package name */
    public final A4 f14278e;

    /* renamed from: f  reason: collision with root package name */
    public final String f14279f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f14280g;

    /* renamed from: h  reason: collision with root package name */
    public final String f14281h;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f14282i;

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f14283j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap f14284k;

    /* renamed from: l  reason: collision with root package name */
    public JSONObject f14285l;

    /* renamed from: m  reason: collision with root package name */
    public String f14286m;

    /* renamed from: n  reason: collision with root package name */
    public H8 f14287n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f14288o;

    /* renamed from: p  reason: collision with root package name */
    public int f14289p;

    /* renamed from: q  reason: collision with root package name */
    public int f14290q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f14291r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f14292s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f14293t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f14294u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f14295v;

    /* renamed from: w  reason: collision with root package name */
    public C1629fa f14296w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f14297x;

    public G8(String requestType, String str, Ib ib2, boolean z10, A4 a42, String requestContentType, boolean z11) {
        kotlin.jvm.internal.g.e(requestType, "requestType");
        kotlin.jvm.internal.g.e(requestContentType, "requestContentType");
        this.f14275a = requestType;
        this.f14276b = str;
        this.c = ib2;
        this.f14277d = z10;
        this.f14278e = a42;
        this.f14279f = requestContentType;
        this.f14280g = z11;
        this.f14281h = "G8";
        this.f14282i = new HashMap();
        this.f14286m = Ha.b();
        this.f14289p = 60000;
        this.f14290q = 60000;
        this.f14291r = true;
        this.f14293t = true;
        this.f14294u = true;
        this.f14295v = true;
        this.f14297x = true;
        if (kotlin.jvm.internal.g.a("GET", requestType)) {
            this.f14283j = new HashMap();
        } else if (kotlin.jvm.internal.g.a("POST", requestType)) {
            this.f14284k = new HashMap();
            this.f14285l = new JSONObject();
        }
    }

    public final void a(cg.l onResponse) {
        kotlin.jvm.internal.g.e(onResponse, "onResponse");
        A4 a42 = this.f14278e;
        if (a42 != null) {
            String str = this.f14281h;
            StringBuilder a10 = A5.a(str, "TAG", "executeAsync: ");
            a10.append(this.f14276b);
            ((B4) a42).a(str, a10.toString());
        }
        e();
        if (!this.f14277d) {
            A4 a43 = this.f14278e;
            if (a43 != null) {
                String TAG = this.f14281h;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a43).c(TAG, "Dropping REQUEST FOR GDPR");
            }
            H8 h82 = new H8();
            h82.c = new D8(EnumC1849w3.f15559j, "Network Request dropped as current request is not GDPR compliant.");
            onResponse.invoke(h82);
            return;
        }
        C1643ga a11 = a();
        a11.f15111l = new F8(this, onResponse);
        AbstractC1671ia.f15193a.add(a11);
        AbstractC1671ia.a(a11, 0L);
    }

    public final H8 b() {
        C1727ma a10;
        EnumC1849w3 enumC1849w3;
        A4 a42 = this.f14278e;
        if (a42 != null) {
            String str = this.f14281h;
            StringBuilder a11 = A5.a(str, "TAG", "executeRequest: ");
            a11.append(this.f14276b);
            ((B4) a42).c(str, a11.toString());
        }
        e();
        if (!this.f14277d) {
            A4 a43 = this.f14278e;
            if (a43 != null) {
                String TAG = this.f14281h;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a43).c(TAG, "Dropping REQUEST FOR GDPR");
            }
            H8 h82 = new H8();
            h82.c = new D8(EnumC1849w3.f15559j, "Network Request dropped as current request is not GDPR compliant.");
            return h82;
        }
        D8 d82 = null;
        if (this.f14287n != null) {
            A4 a44 = this.f14278e;
            if (a44 != null) {
                String str2 = this.f14281h;
                StringBuilder a12 = A5.a(str2, "TAG", "response has been failed before execute - ");
                H8 h83 = this.f14287n;
                if (h83 != null) {
                    d82 = h83.c;
                }
                a12.append(d82);
                ((B4) a44).c(str2, a12.toString());
            }
            H8 h84 = this.f14287n;
            kotlin.jvm.internal.g.b(h84);
            return h84;
        }
        C1643ga request = a();
        kotlin.jvm.internal.g.e(request, "request");
        do {
            a10 = C8.a(request, (cg.p) null);
            D8 d83 = a10.f15319a;
            if (d83 != null) {
                enumC1849w3 = d83.f14201a;
            } else {
                enumC1849w3 = null;
            }
        } while (enumC1849w3 == EnumC1849w3.f15562m);
        H8 h85 = new H8();
        byte[] bArr = a10.c;
        if (bArr != null) {
            if (bArr.length == 0) {
                h85.f14321b = new byte[0];
            } else {
                byte[] bArr2 = new byte[bArr.length];
                h85.f14321b = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        h85.f14323e = a10.f15320b;
        h85.f14322d = a10.f15322e;
        h85.c = a10.f15319a;
        return h85;
    }

    public final String c() {
        String str = this.f14279f;
        if (kotlin.jvm.internal.g.a(str, "application/json")) {
            return String.valueOf(this.f14285l);
        }
        if (kotlin.jvm.internal.g.a(str, "application/x-www-form-urlencoded")) {
            K8.a(this.f14284k);
            return K8.a("&", (Map) this.f14284k);
        }
        return "";
    }

    public final String d() {
        int i10;
        boolean z10;
        String str = this.f14276b;
        HashMap hashMap = this.f14283j;
        if (hashMap != null) {
            K8.a(hashMap);
            String a10 = K8.a("&", (Map) this.f14283j);
            A4 a42 = this.f14278e;
            if (a42 != null) {
                String str2 = this.f14281h;
                ((B4) a42).c(str2, AbstractC1890z5.a(str2, "TAG", "Get params: ", a10));
            }
            int length = a10.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                if (!z11) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (kotlin.jvm.internal.g.f(a10.charAt(i10), 32) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z11) {
                    if (!z10) {
                        z11 = true;
                    } else {
                        i11++;
                    }
                } else if (!z10) {
                    break;
                } else {
                    length--;
                }
            }
            if (a10.subSequence(i11, length + 1).toString().length() > 0) {
                if (str != null && !kotlin.text.k.O(str, "?", false)) {
                    str = str.concat("?");
                }
                if (str != null && !kotlin.text.j.F(str, "&", false) && !kotlin.text.j.F(str, "?", false)) {
                    str = str.concat("&");
                }
                str = a6.h.c(str, a10);
            }
        }
        kotlin.jvm.internal.g.b(str);
        return str;
    }

    public final void e() {
        f();
        this.f14282i.put("User-Agent", Ha.k());
        if (kotlin.jvm.internal.g.a("POST", this.f14275a)) {
            this.f14282i.put("Content-Type", this.f14279f);
            if (this.f14280g) {
                this.f14282i.put("Content-Encoding", "gzip");
            } else {
                this.f14282i.put("Content-Length", String.valueOf(c().length()));
            }
        }
    }

    public void f() {
        HashMap hashMap;
        JSONObject c;
        HashMap hashMap2;
        M3 m32 = M3.f14454a;
        m32.j();
        this.f14277d = m32.a(this.f14277d);
        if (kotlin.jvm.internal.g.a("GET", this.f14275a)) {
            HashMap hashMap3 = this.f14283j;
            if (this.f14293t) {
                if (hashMap3 != null) {
                    hashMap3.putAll(I0.f14337e);
                }
                if (hashMap3 != null) {
                    hashMap3.putAll(C1566b3.f14952a.a(this.f14288o));
                }
                if (hashMap3 != null) {
                    hashMap3.putAll(AbstractC1581c4.a());
                }
            }
            HashMap hashMap4 = this.f14283j;
            if (this.f14294u) {
                a(hashMap4);
            }
        } else if (kotlin.jvm.internal.g.a("POST", this.f14275a)) {
            HashMap hashMap5 = this.f14284k;
            if (this.f14293t) {
                if (hashMap5 != null) {
                    hashMap5.putAll(I0.f14337e);
                }
                if (hashMap5 != null) {
                    hashMap5.putAll(C1566b3.f14952a.a(this.f14288o));
                }
                if (hashMap5 != null) {
                    hashMap5.putAll(AbstractC1581c4.a());
                }
            }
            HashMap hashMap6 = this.f14284k;
            if (this.f14294u) {
                a(hashMap6);
            }
        }
        if (this.f14295v && (c = M3.c()) != null) {
            if (kotlin.jvm.internal.g.a("GET", this.f14275a)) {
                HashMap hashMap7 = this.f14283j;
                if (hashMap7 != null) {
                    String jSONObject = c.toString();
                    kotlin.jvm.internal.g.d(jSONObject, "toString(...)");
                    String str = (String) hashMap7.put("consentObject", jSONObject);
                }
            } else if (kotlin.jvm.internal.g.a("POST", this.f14275a) && (hashMap2 = this.f14284k) != null) {
                String jSONObject2 = c.toString();
                kotlin.jvm.internal.g.d(jSONObject2, "toString(...)");
                String str2 = (String) hashMap2.put("consentObject", jSONObject2);
            }
        }
        if (this.f14297x) {
            if (kotlin.jvm.internal.g.a("GET", this.f14275a)) {
                HashMap hashMap8 = this.f14283j;
                if (hashMap8 != null) {
                    String str3 = (String) hashMap8.put("u-appsecure", String.valueOf((int) I0.f14338f));
                }
            } else if (kotlin.jvm.internal.g.a("POST", this.f14275a) && (hashMap = this.f14284k) != null) {
                String str4 = (String) hashMap.put("u-appsecure", String.valueOf((int) I0.f14338f));
            }
        }
    }

    public final C1643ga a() {
        EnumC1601da method;
        String type = this.f14275a;
        kotlin.jvm.internal.g.e(type, "type");
        if (kotlin.jvm.internal.g.a(type, "GET")) {
            method = EnumC1601da.f15018a;
        } else {
            method = kotlin.jvm.internal.g.a(type, "POST") ? EnumC1601da.f15019b : EnumC1601da.f15018a;
        }
        String str = this.f14276b;
        kotlin.jvm.internal.g.b(str);
        kotlin.jvm.internal.g.e(method, "method");
        C1587ca c1587ca = new C1587ca(str, method);
        K8.a(this.f14282i);
        HashMap header = this.f14282i;
        kotlin.jvm.internal.g.e(header, "header");
        c1587ca.c = header;
        c1587ca.f14999h = Integer.valueOf(this.f14289p);
        c1587ca.f15000i = Integer.valueOf(this.f14290q);
        c1587ca.f14997f = Boolean.valueOf(this.f14291r);
        c1587ca.f15001j = Boolean.valueOf(this.f14292s);
        C1629fa c1629fa = this.f14296w;
        if (c1629fa != null) {
            c1587ca.f14998g = c1629fa;
        }
        int ordinal = method.ordinal();
        if (ordinal == 0) {
            HashMap hashMap = this.f14283j;
            if (hashMap != null) {
                A4 a42 = this.f14278e;
                if (a42 != null) {
                    String TAG = this.f14281h;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    ((B4) a42).c(TAG, "getParams " + hashMap);
                }
                c1587ca.f14995d = hashMap;
            }
        } else if (ordinal == 1) {
            String postBody = c();
            A4 a43 = this.f14278e;
            if (a43 != null) {
                String str2 = this.f14281h;
                ((B4) a43).c(str2, AbstractC1890z5.a(str2, "TAG", "httpPostBody ", postBody));
            }
            kotlin.jvm.internal.g.e(postBody, "postBody");
            c1587ca.f14996e = postBody;
        }
        return new C1643ga(c1587ca);
    }

    public /* synthetic */ G8(String str, String str2, Ib ib2, boolean z10, A4 a42, String str3, int i10) {
        this(str, str2, ib2, (i10 & 8) != 0 ? false : z10, a42, (i10 & 32) != 0 ? "application/x-www-form-urlencoded" : str3, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public G8(String url, A4 a42) {
        this("GET", url, (Ib) null, false, a42, "application/x-www-form-urlencoded", 64);
        kotlin.jvm.internal.g.e(url, "url");
        this.f14295v = false;
    }

    public final void a(HashMap hashMap) {
        C1885z0 b10;
        String a10;
        Ib ib2 = this.c;
        if (ib2 == null || hashMap == null) {
            return;
        }
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        try {
            if (ib2.f14350a.a() && (b10 = Hb.f14332a.b()) != null && (a10 = b10.a()) != null) {
                hashMap3.put("GPID", a10);
            }
        } catch (Exception unused) {
        }
        String jSONObject = new JSONObject(hashMap3).toString();
        kotlin.jvm.internal.g.d(jSONObject, "toString(...)");
        hashMap2.put("u-id-map", jSONObject);
        hashMap.putAll(hashMap2);
    }
}
