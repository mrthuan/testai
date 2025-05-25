package com.inmobi.media;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.inmobi.media.t6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1813t6 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15467a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15468b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final long f15469d;

    /* renamed from: e  reason: collision with root package name */
    public final A4 f15470e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15471f = "t6";

    /* renamed from: g  reason: collision with root package name */
    public G8 f15472g;

    public C1813t6(String str, int i10, int i11, long j10, A4 a42) {
        this.f15467a = str;
        this.f15468b = i10;
        this.c = i11;
        this.f15469d = j10;
        this.f15470e = a42;
    }

    public final void a() {
        String str = this.f15467a;
        if (str == null) {
            A4 a42 = this.f15470e;
            if (a42 != null) {
                String TAG = this.f15471f;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a42).b(TAG, "MRAID Js Url provided is invalid.");
                return;
            }
            return;
        }
        G8 g82 = new G8(str, this.f15470e);
        g82.f14293t = false;
        g82.f14294u = false;
        g82.f14297x = false;
        this.f15472g = g82;
        ((ScheduledThreadPoolExecutor) G3.f14268b.getValue()).submit(new androidx.activity.b(this, 17));
    }

    public static final void a(C1813t6 this$0) {
        byte[] bArr;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        G8 g82 = this$0.f15472g;
        Context d10 = Ha.d();
        if (d10 != null) {
            if ((System.currentTimeMillis() / 1000) - new C1752o9(d10, "mraid_js_store").b() <= this$0.f15469d || g82 == null) {
                return;
            }
            int i10 = 0;
            while (i10 <= this$0.f15468b) {
                A4 a42 = this$0.f15470e;
                if (a42 != null) {
                    String TAG = this$0.f15471f;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    ((B4) a42).a(TAG, "Attempting to get MRAID Js.");
                }
                H8 b10 = g82.b();
                Context d11 = Ha.d();
                if (b10.b()) {
                    A4 a43 = this$0.f15470e;
                    if (a43 != null) {
                        String TAG2 = this$0.f15471f;
                        kotlin.jvm.internal.g.d(TAG2, "TAG");
                        ((B4) a43).b(TAG2, "Getting MRAID Js from server failed.");
                    }
                    i10++;
                    if (i10 > this$0.f15468b) {
                        return;
                    }
                    try {
                        Thread.sleep(this$0.c * 1000);
                    } catch (InterruptedException e10) {
                        A4 a44 = this$0.f15470e;
                        if (a44 != null) {
                            String TAG3 = this$0.f15471f;
                            kotlin.jvm.internal.g.d(TAG3, "TAG");
                            ((B4) a44).a(TAG3, "MRAID Js client interrupted while sleeping.", e10);
                        }
                    }
                } else if (d11 != null) {
                    C1752o9 c1752o9 = new C1752o9(d11, "mraid_js_store");
                    Map map = b10.f14323e;
                    String str = null;
                    List list = map != null ? (List) map.get("Content-Encoding") : null;
                    if (kotlin.jvm.internal.g.a(list != null ? (String) list.get(0) : null, "gzip")) {
                        A4 a45 = this$0.f15470e;
                        if (a45 != null) {
                            String TAG4 = this$0.f15471f;
                            kotlin.jvm.internal.g.d(TAG4, "TAG");
                            ((B4) a45).a(TAG4, "Response is GZIP-compressed, uncompressing it");
                        }
                        byte[] bArr2 = b10.f14321b;
                        if (bArr2 == null || bArr2.length == 0) {
                            bArr = new byte[0];
                        } else {
                            bArr = new byte[bArr2.length];
                            kotlin.jvm.internal.g.b(bArr2);
                            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                        }
                        byte[] a10 = K8.a(bArr);
                        if (a10 != null) {
                            try {
                                String str2 = new String(a10, kotlin.text.a.f19966b);
                                A4 a46 = this$0.f15470e;
                                if (a46 != null) {
                                    String TAG5 = this$0.f15471f;
                                    kotlin.jvm.internal.g.d(TAG5, "TAG");
                                    ((B4) a46).a(TAG5, "Getting MRAID Js from server succeeded.");
                                }
                                str = str2;
                            } catch (UnsupportedEncodingException e11) {
                                A4 a47 = this$0.f15470e;
                                if (a47 != null) {
                                    String str3 = this$0.f15471f;
                                    StringBuilder a11 = A5.a(str3, "TAG", "Failed to get MRAID JS \n");
                                    a11.append(e11.getMessage());
                                    ((B4) a47).b(str3, a11.toString());
                                }
                            }
                        }
                    } else {
                        A4 a48 = this$0.f15470e;
                        if (a48 != null) {
                            String TAG6 = this$0.f15471f;
                            kotlin.jvm.internal.g.d(TAG6, "TAG");
                            ((B4) a48).a(TAG6, "Getting MRAID Js from server succeeded.");
                        }
                        str = b10.a();
                    }
                    if (str != null) {
                        c1752o9.b("mraid_js_string", str);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
