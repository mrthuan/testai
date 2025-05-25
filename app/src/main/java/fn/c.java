package fn;

import android.content.Context;
import android.text.TextUtils;
import de.e;
import ig.h;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.i;
import lm.f;
import pdf.pdfreader.viewer.editor.free.datasource.sp.SharePreferencesImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.q0;

/* compiled from: PdfEditorConfig.kt */
/* loaded from: classes3.dex */
public final class c extends SharePreferencesImpl {
    public static final a c;

    /* renamed from: d  reason: collision with root package name */
    public static final pdf.pdfreader.viewer.editor.free.datasource.sp.a<Integer> f17310d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f17311e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f17312f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f17313g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f17314h;

    /* compiled from: PdfEditorConfig.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ h<Object>[] f17315a;

        /* compiled from: PdfEditorConfig.kt */
        /* renamed from: fn.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0222a implements b {
            @Override // fn.b
            public final void a() {
                c.c.getClass();
                c.f17310d.c(a.f17315a[0], Integer.valueOf(a.b() - 1));
            }
        }

        static {
            MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(a.class, ea.a.p("VmQidDVyB2Unc1FDBnU4dA==", "aCPkoTgN"), ea.a.p("JmUGRTRpHkY6ZQNVR2UUb01uJihgSQ==", "9IArPjBU"), 0);
            i.f19949a.getClass();
            f17315a = new h[]{mutablePropertyReference1Impl};
        }

        public static boolean a(Context context, fn.a aVar) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean equals;
            int i10;
            g.e(context, "context");
            BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
            boolean z13 = true;
            if (!billingConfigImpl.w() && billingConfigImpl.z()) {
                Boolean bool = BillingConfigImpl.P;
                if (bool != null) {
                    z11 = bool.booleanValue();
                } else {
                    h<Object>[] hVarArr = BillingConfigImpl.f24850d;
                    h<Object> hVar = hVarArr[16];
                    pdf.pdfreader.viewer.editor.free.datasource.sp.a aVar2 = BillingConfigImpl.O;
                    int intValue = ((Number) aVar2.b(hVar)).intValue();
                    if (intValue == 0) {
                        SharePreferencesImpl.c();
                        String h10 = e.h(c1.S, "");
                        if (h10 != null && h10.length() != 0) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (z12) {
                            ea.a.p("LWldbBBuUF8_ZCN0KnQNeEFfHXUncwZyMXAQaTpuZ28_ZV9fSDcHIDlvJGYcZ0hpRiAKZSNhEGx0", "RsNWXdU8");
                            equals = false;
                        } else {
                            equals = TextUtils.equals(ea.a.p("MQ==", "qOg0CoYG"), h10);
                        }
                        if (equals) {
                            i10 = 1;
                        } else {
                            i10 = 2;
                        }
                        aVar2.c(hVarArr[16], Integer.valueOf(i10));
                        BillingConfigImpl.P = Boolean.valueOf(equals);
                        z11 = equals;
                    } else {
                        if (intValue == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        BillingConfigImpl.P = Boolean.valueOf(z10);
                        if (intValue == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                }
                if (z11) {
                    ea.a.p("aWQfRR5pE286QwluUmln", "NJ9yzgnP");
                    ea.a.p("LGhUYxJTVnY_IGctWCAOYVlzCyB7IEVbKXUJcw5yJGIqIFByHGFd", "PFIZZkmM");
                    String str = n0.f28727a;
                    if (q0.j(context) >= 83) {
                        z13 = false;
                    }
                    if (z13) {
                        ea.a.p("Y2QtRRdpFm8AQ1tuD2ln", "v6k0C9RW");
                        b();
                        if (b() <= 0) {
                            aVar.b();
                        } else {
                            aVar.a(new C0222a());
                        }
                    } else {
                        ea.a.p("Y2QtRRdpFm8AQ1tuD2ln", "lAS7M1M5");
                        ea.a.p("LGhUYxJTVnY_IGctWCAOYVlzCyB7IEVbC2VDIAJzHHISIA==", "JLWAe4wy");
                        aVar.b();
                    }
                    return false;
                }
                ea.a.p("Y2QtRRdpFm8AQ1tuD2ln", "fAze0rj9");
                ea.a.p("LGhUYxJTVnY_IGctWCBWIEFyG2VlWwNyP2VsYRllBl0=", "Ij6iZLkg");
                String str2 = n0.f28727a;
                return true;
            }
            ea.a.p("GWRQRTVpTG86QwluUmln", "1OI6Q86q");
            String str3 = n0.f28727a;
            return true;
        }

        public static int b() {
            return ((Number) c.f17310d.b(f17315a[0])).intValue();
        }

        public static boolean c(Context context) {
            g.e(context, "context");
            return q0.g(context, 83, ea.a.p("JnNucxFvQF8ubyVsBl8YZFNfC2QsdApyPG4fdzVpAF9-NzA=", "EAgOczjn"));
        }

        public static void d(Context context) {
            g.e(context, "context");
            q0.w(context, ea.a.p("WnMUcxtvFV8Gb1tsGl8mZCJfV2QvdCxyDW5VdxVpI18CNzA=", "R0JMQwiH"), false);
        }
    }

    static {
        ea.a.p("Y2QtRRdpFm8AQ1tuD2ln", "ryejd5tv");
        c = new a();
        f17310d = com.google.android.play.core.assetpacks.c.J(f.c, 3, null, 6);
    }
}
