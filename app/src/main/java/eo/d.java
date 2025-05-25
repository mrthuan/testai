package eo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.w;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import d8.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import l.p;
import me.f;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderFeedbackActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c;
import pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.g;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.i1;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import u9.h;

/* compiled from: RateHelper.java */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f16828a;

    /* compiled from: RateHelper.java */
    /* loaded from: classes3.dex */
    public class a implements oe.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference f16829a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f16830b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ oe.a f16831d;

        public a(WeakReference weakReference, String str, int i10, oe.a aVar) {
            this.f16829a = weakReference;
            this.f16830b = str;
            this.c = i10;
            this.f16831d = aVar;
        }

        @Override // oe.a
        public final void a() {
            ea.a.p("OWERZX9lAHAtckZkXXM6aUtz", "sAKe7lwl");
            String str = n0.f28727a;
        }

        @Override // oe.a
        public final void b() {
            ea.a.p("PWFFZTFlW3A_cmpjFG4LZWw=", "WVi8QvjP");
            String str = n0.f28727a;
            g gVar = new g();
            w<po.b> wVar = pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c.f27668m;
            c.a.a(gVar);
        }

        @Override // oe.a
        public final void c() {
            ea.a.p("PWFFZTFlW3A_cmpzEG4MRUNlAHRlYwR0XWcKcg89", "yyJZ8ev3");
            ea.a.p("VSBYYxJpGG49", "HFy9fwRr");
            String str = n0.f28727a;
        }

        @Override // oe.a
        public final void d() {
            ea.a.p("QWE_ZTtlDnAXchRmDGUyYiVjWSA1dCJyRD0=", "0me7bMLU");
            String str = n0.f28727a;
            Context context = (Context) this.f16829a.get();
            if (context != null) {
                String str2 = this.f16830b;
                if (TextUtils.isEmpty(str2)) {
                    tn.a.d(context, ea.a.p("PWFFZQ==", "VT1xiO6b"), ea.a.p("QWE_ZSxkDW5l", "Cfl9ha3g"), ea.a.p("Bl8x", "cj8BL2ca"), false);
                } else {
                    String p10 = ea.a.p("PWFFZQ==", "bwTF6z2e");
                    String p11 = ea.a.p("PWFFZSZkWG5l", "GmyKupNC");
                    StringBuilder k10 = a0.a.k(str2);
                    k10.append(ea.a.p("EDE=", "fFyxhBdB"));
                    tn.a.d(context, p10, p11, k10.toString(), false);
                }
                Intent intent = new Intent(context, ReaderFeedbackActivity.class);
                if (!TextUtils.equals(ea.a.p("NQ==", "DUiZAFOQ"), str2)) {
                    intent.putExtra(ea.a.p("O2Fn", "sw1Gc1X3"), ea.a.p("PWFFZQ==", "FZX2hhfi"));
                } else {
                    intent.putExtra(ea.a.p("R2Fn", "SCN6QeTi"), ea.a.p("I2laZQ==", "jknwgGrs"));
                }
                h1.startActivity(context, intent);
            }
        }

        @Override // oe.a
        public final void e(int i10) {
            JSONObject jSONObject;
            boolean z10;
            ea.a.p("PWFFZTFlW3A_cmpyFHQNVUYgHXQkchE9", "GgQB4y2F");
            String str = n0.f28727a;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final Context context = (Context) this.f16829a.get();
            if (context != null) {
                boolean z11 = tn.a.f30064a;
                String[] strArr = new String[1];
                String p10 = ea.a.p("YWE_ZSZz", "K6x0CgsC");
                if (b.b.f5172e == null) {
                    String f10 = de.e.f(context);
                    if (!f10.equals("")) {
                        try {
                            jSONObject = new JSONObject(f10);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        if (jSONObject.has("enable_FBA")) {
                            if (jSONObject.getInt("enable_FBA") != 1) {
                                z10 = false;
                                b.b.f5172e = Boolean.valueOf(z10);
                            }
                        }
                    }
                    z10 = true;
                    b.b.f5172e = Boolean.valueOf(z10);
                }
                if (b.b.f5172e.booleanValue()) {
                    try {
                        Bundle bundle = new Bundle();
                        String str2 = strArr[0];
                        if (str2 instanceof String) {
                            bundle.putString(str2, str2);
                        } else if (str2 instanceof Long) {
                            bundle.putLong(str2, ((Long) str2).longValue());
                        }
                        FirebaseAnalytics.getInstance(context).b(bundle, p10);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                String str3 = this.f16830b;
                if (TextUtils.isEmpty(str3)) {
                    tn.a.d(context, ea.a.p("PWFFZQ==", "vp3YdOJ6"), ea.a.p("QWE_ZSxkDW5l", "77V055iM"), ea.a.p("el81", "Uhu3CPyf"), false);
                } else {
                    String p11 = ea.a.p("QWE_ZQ==", "iKThSczw");
                    String p12 = ea.a.p("PWFFZSZkWG5l", "RxiedYkz");
                    StringBuilder k10 = a0.a.k(str3);
                    k10.append(ea.a.p("bDU=", "yBCMMmN0"));
                    tn.a.d(context, p11, p12, k10.toString(), false);
                }
                int i11 = this.c;
                oe.a aVar = this.f16831d;
                if (i11 >= 1 && c1.i(context)) {
                    ea.a.p("YWE_ZTtlDnAXcg==", "v64fOE0I");
                    ea.a.p("HHRQcg0gcG81ZyZlVVAEYUwgPGUzaQB3", "3XCzDDQ3");
                    try {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context;
                        }
                        final u9.e eVar = new u9.e(new h(applicationContext));
                        o a10 = eVar.a();
                        final oe.a aVar2 = this.f16831d;
                        a10.b(new OnCompleteListener() { // from class: eo.b
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public final void onComplete(Task task) {
                                o oVar;
                                boolean o10 = task.o();
                                final long j10 = elapsedRealtime;
                                final Context context2 = context;
                                final oe.a aVar3 = aVar2;
                                if (o10) {
                                    t1.b(ea.a.p("dG8kZx9lQlAeYU0gO2UndSFzRiAVdSBjBHM3ZhhsOg==", "aDmpKjWl") + (SystemClock.elapsedRealtime() - j10));
                                    ea.a.p("YWE_ZTtlDnAXcg==", "F4YY6a4b");
                                    ea.a.p("dG8kZx9lQlAeYU0gO2UndSFzRiAVdSBjN3M_ZhRsOg==", "RLaHdLJ2");
                                    SystemClock.elapsedRealtime();
                                    Activity l10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.l(context2);
                                    if (l10 != null) {
                                        u9.a aVar4 = (u9.a) task.k();
                                        if (aVar4 == null) {
                                            d.a(context2, aVar3, true);
                                            return;
                                        }
                                        u9.e eVar2 = eVar;
                                        eVar2.getClass();
                                        if (aVar4.b()) {
                                            oVar = Tasks.e(null);
                                        } else {
                                            Intent intent = new Intent(l10, PlayCoreDialogWrapperActivity.class);
                                            intent.putExtra("confirmation_intent", aVar4.a());
                                            intent.putExtra("window_flags", l10.getWindow().getDecorView().getWindowSystemUiVisibility());
                                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                                            intent.putExtra("result_receiver", new u9.d(eVar2.f30267b, taskCompletionSource));
                                            l10.startActivity(intent);
                                            oVar = taskCompletionSource.f11978a;
                                        }
                                        oVar.b(new OnCompleteListener(j10, context2, aVar3) { // from class: eo.c

                                            /* renamed from: a  reason: collision with root package name */
                                            public final /* synthetic */ Context f16826a;

                                            /* renamed from: b  reason: collision with root package name */
                                            public final /* synthetic */ oe.a f16827b;

                                            {
                                                this.f16826a = context2;
                                                this.f16827b = aVar3;
                                            }

                                            @Override // com.google.android.gms.tasks.OnCompleteListener
                                            public final void onComplete(Task task2) {
                                                ea.a.p("BWE7ZTBlJXAtcg==", "ppWOxIy7");
                                                ea.a.p("CG9eZxVlF1A2YTMgJ2UObFp3TlQkcw4gDW8ncCBlGmVvR2EgKWFQZXpTIm8COiA=", "B6frNJLn");
                                                boolean z12 = d.f16828a;
                                                SystemClock.elapsedRealtime();
                                                d.a(this.f16826a, this.f16827b, !d.f16828a);
                                                d.f16828a = false;
                                            }
                                        });
                                    }
                                } else if (task.m()) {
                                    ea.a.p("GmEHZQdlCHAtcg==", "18HsOdY3");
                                    ea.a.p("CG9eZxVlF1A2YTMgJ2UZdVBzGiAGYQtjDWwdZA==", "x8R8hxFG");
                                } else {
                                    try {
                                        Exception j11 = task.j();
                                        t1.b(ea.a.p("dG8kZx9lQlAeYU0gO2UndSFzRiADcjFvBjog", "tyChOabX") + j11 + ea.a.p("E3QibRYg", "jXSrnGFY") + (SystemClock.elapsedRealtime() - j10));
                                        ea.a.p("YWE_ZTtlDnAXcg==", "H9xeqEad");
                                        ea.a.p("dG8kZx9lQlAeYU0gO2UndSFzRiADcjFvPzog", "MMSYCrcf");
                                        Objects.toString(j11);
                                        ea.a.p("E3QibRYg", "10Gj4v7e");
                                        SystemClock.elapsedRealtime();
                                    } catch (Exception unused) {
                                        t1.b(ea.a.p("CG9eZxVlF1A2YTMgJ2UZdVBzGiAAchdvRDog", "FBjA6PXp") + (SystemClock.elapsedRealtime() - j10));
                                        ea.a.p("HWFFZTFlW3A_cg==", "QOnZ3umF");
                                        ea.a.p("CG9eZxVlF1A2YTMgJ2UZdVBzGiAAchdvNzog", "Url1ETKx");
                                        SystemClock.elapsedRealtime();
                                    }
                                    d.a(context2, aVar3, true);
                                }
                            }
                        });
                        return;
                    } catch (Exception unused) {
                        d.a(context, aVar, true);
                        return;
                    }
                }
                ea.a.p("BmFNZX5lLXAtcg==", "RFT96Amp");
                ea.a.p("AW9FIDhwR2wjIA1vGmcEZRVQAmE8IDdlL2kcdw==", "jDLsYyk6");
                d.a(context, aVar, true);
            }
        }
    }

    static {
        ea.a.p("YWE_ZTtlDnAXcg==", "BeSDGTPm");
        f16828a = false;
    }

    public static void a(Context context, oe.a aVar, boolean z10) {
        int i10;
        if (context != null) {
            e.t(context, ea.a.p("PWFFZSZ1cw==", "DJ34rxiJ"), true);
            if (z10) {
                String str = ea.a.p("J3RFcAo6GC8qbCt5W2cHb1JsCy4mbwgvJ3QNch0vKHA_cx5kHHRWaTZzdWkRPQ==", "1AZiTbxI") + context.getPackageName();
                try {
                    Intent intent = new Intent(ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLhVJMlc=", "wBYTg65B"), Uri.parse(str));
                    intent.setPackage(ea.a.p("KG8aLhFuEnInaQIuQmU5ZFFuZw==", "HMKwpvkm"));
                    context.startActivity(intent);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    try {
                        Intent intent2 = new Intent(ea.a.p("Lm5VchZpUy4zbj5lG3RGYVZ0B28rLjNJNVc=", "MPRGpjvh"), Uri.parse(str));
                        intent2.setFlags(268435456);
                        context.startActivity(intent2);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.h.f27692d = true;
            }
            if (aVar != null) {
                if (z10) {
                    i10 = 5;
                } else {
                    i10 = -1;
                }
                aVar.e(i10);
            }
        }
    }

    public static boolean b(Context context) {
        if (e.l(context)) {
            ea.a.p("UGguYxhSA3QXVWfl3rKxu8vonYSiu_To8YeNuP3lzo3Wh_E6IA==", "NipH5as3");
            return false;
        } else if (e.h(context) > 3) {
            ea.a.p("UGguYxhSA3QXVWfoxoSwmNvltbqgneY0v6zg5I2Nj4a-5cy6SSA=", "YA5jG6P1");
            return false;
        } else {
            long e10 = e.e(context);
            ea.a.p("LGhUYxJSVnQ_VRljHWULa2dhGmUQc19sL3MwVDttZQ==", "MGfNNDRA");
            if (i1.a(e10)) {
                ea.a.p("UGguYxhSA3QXVWc6SebOr6ObiuXWjKSa7eSMgIOk-uWXmq2soQ==", "i4fSOASw");
                return false;
            }
            ea.a.p("LGhUYxJSVnQ_VRk6VeTQjdOYwSCim93l6Yylmrfk_YCqpKk=", "wEZnyB3E");
            if (e.k(context) == 2) {
                ea.a.p("UGguYxhSA3QXVWfm3I--p8xwVmagrOLm-rAQMg==", "o0hVGAIw");
                return true;
            } else if (e.j(context) == 1) {
                ea.a.p("OWhcYyBSVnQtVTXkjICxrJnl2oatuqs=", "w2Z9K7th");
                return true;
            } else if (e.c(context) == 2) {
                ea.a.p("LGhUYxJSVnQ_VRnl24yOiKUyiKzk59mWr77z5du2pr_S5ZyYCWRm", "KFcKGbbB");
                return true;
            } else {
                if (e.g(context) >= 4) {
                    pdf.pdfreader.viewer.editor.free.utils.c cVar = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
                    if (!pdf.pdfreader.viewer.editor.free.utils.c.f28559b.getBoolean(ea.a.p("IHBUbiZ0Xm0_cxVyFHRl", "jf8omdbC"), false)) {
                        ea.a.p("UGguYxhSA3QXVWfm4JOzvMQ11Kyh", "8N2352h0");
                        return true;
                    }
                }
                if (e.w(context, null)) {
                    ea.a.p("CmgDYwxSO3QtVTXplbqyu47nyISvnIzkyJpd5eCVpaTT5emKgbbS6MiXXOaBj7-niA==", "ztifgZHB");
                    return true;
                } else if (e.v(context, null)) {
                    ea.a.p("UGguYxhSA3QXVWfpyLqzu_LnqISgnPnkzJp_5dKVnqSJ5cSKlbbq6PKXDuXhhrK6qw==", "pScyHliy");
                    return true;
                } else if (e.a(context, null)) {
                    ea.a.p("UGguYxhSA3QXVWfpyLqzu_LnqISgnPnk85pr5fyVqaSJ5cSKlbbq6PKXDufVlr6-1eSNnaOtmA==", "OGMN0Pf5");
                    return true;
                } else if (!e.m(context, null)) {
                    return false;
                } else {
                    ea.a.p("LGhUYxJSVnQ_VRnp1LqNu4Pn9ISjnN_kjppj5eaVlaT15b6Kn7a_6NqXcOb8k428tWEecA==", "1Foh2OWr");
                    return true;
                }
            }
        }
    }

    public static void c(Context context, String str, oe.a aVar) {
        Configuration configuration;
        WeakReference weakReference = new WeakReference(context);
        ea.a.p("QWE_ZSZzWHQLcGU=", "OHSPXPAe");
        tn.a.d(context, ea.a.p("C2EuZQ==", "7uyZHykN"), ea.a.p("QWE_ZSxzCm93", "bsaoSHmx"), str, false);
        char c = 65535;
        int d10 = e.d(context, -1, ea.a.p("QWE_ZSxhDmwtY1VzDF81bzFudA==", "C375BdhH"));
        if (d10 < 0) {
            d10 = e.h(context);
            e.u(context, d10, ea.a.p("PWFFZSZhW2wFYytzEF8Lb0BudA==", "L3kcfhB4"));
        }
        boolean z10 = true;
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.equals(ea.a.p("NQ==", "ZPrbzbZd"), str)) {
                long currentTimeMillis = System.currentTimeMillis();
                long e10 = e.e(context);
                if (currentTimeMillis > e10) {
                    e.o(context, currentTimeMillis);
                } else {
                    e.o(context, e10 + 1);
                }
            }
            e.u(context, d10 + 1, ea.a.p("PWFFZSZhW2wFYytzEF8Lb0BudA==", "L3kcfhB4"));
            switch (str.hashCode()) {
                case 49:
                    if (str.equals(ea.a.p("MQ==", "l339baQo"))) {
                        c = 0;
                        break;
                    }
                    break;
                case 50:
                    if (str.equals(ea.a.p("Mg==", "mkHJGl2y"))) {
                        c = 1;
                        break;
                    }
                    break;
                case 51:
                    if (str.equals(ea.a.p("Mw==", "SFwNRSME"))) {
                        c = 2;
                        break;
                    }
                    break;
                case 52:
                    if (str.equals(ea.a.p("NA==", "UOvJuqTc"))) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0 || c == 1 || c == 2 || c == 3) {
                e.u(context, e.h(context) + 1, ea.a.p("HmFDZSZjH3UmdA==", "YKl7ypyX"));
            }
        }
        ne.a aVar2 = new me.g(context, pdf.pdfreader.viewer.editor.free.utils.extension.c.h(context)).f22015a;
        aVar2.f22445h = false;
        a aVar3 = new a(weakReference, str, d10, aVar);
        f fVar = new f();
        try {
            if (!me.d.b(Locale.getDefault()) && ((configuration = context.getResources().getConfiguration()) == null || !me.d.b(configuration.locale))) {
                z10 = false;
            }
            if (!z10) {
                aVar3.c();
                ArrayList arrayList = new ArrayList();
                pe.a aVar4 = new pe.a(arrayList);
                fVar.f22007l = aVar4;
                p d11 = fVar.d(context, aVar2, aVar4, aVar3);
                fVar.f22006k = d11;
                d11.setCanceledOnTouchOutside(false);
                if (aVar2.f22439a && !aVar2.f22440b) {
                    arrayList.add(fVar.f22000e);
                    arrayList.add(fVar.f21999d);
                    arrayList.add(fVar.c);
                    arrayList.add(fVar.f21998b);
                    arrayList.add(fVar.f21997a);
                } else {
                    arrayList.add(fVar.f21997a);
                    arrayList.add(fVar.f21998b);
                    arrayList.add(fVar.c);
                    arrayList.add(fVar.f21999d);
                    arrayList.add(fVar.f22000e);
                }
                fVar.f22006k.setOnCancelListener(new me.a(aVar3));
                fVar.f22004i.setOnClickListener(new me.b(fVar, aVar2, context, aVar3));
                fVar.f22006k.setOnDismissListener(new me.c(aVar3));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
