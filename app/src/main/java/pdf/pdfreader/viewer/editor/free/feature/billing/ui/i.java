package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.ReaderDeepLinkActivity;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.UserGuideActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: SubscriptionDarkTestActivity.kt */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final a f24934a;

    /* compiled from: SubscriptionDarkTestActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static boolean a(Context context, Intent intent, Intent intent2) {
            boolean z10;
            kotlin.jvm.internal.g.e(context, "context");
            BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
            if (!billingConfigImpl.w() && billingConfigImpl.z()) {
                ol.d b10 = billingConfigImpl.k().b();
                BaseSubscriptionActivity.L.getClass();
                if (!kotlin.jvm.internal.g.a(b10, BaseSubscriptionActivity.R)) {
                    if (intent != null && intent.hasExtra(ea.a.p("C2VccChsBW4tXw5hRHAuX1ZlJV8wZVdyKzJBMmRfMmEdYW0=", "fEo9wloi")) && intent.getBooleanExtra(ea.a.p("V2UucCxsC24XX1xhGXAvXyplRV8_ZSJyLjJnMnlfRmFBYW0=", "qWL6aBz8"), false)) {
                        long longExtra = intent.getLongExtra(ea.a.p("V2UucCxsC24XX1xhGXAvXyplRV8_ZSJyEjJXMgZfOGleZQ==", "Mg3LK81S"), 0L);
                        ReaderDeepLinkActivity.f23848a.getClass();
                        HashMap<Long, Boolean> hashMap = ReaderDeepLinkActivity.f23851e;
                        Boolean bool = hashMap.get(Long.valueOf(longExtra));
                        if (bool != null && bool.booleanValue() && c1.C(context)) {
                            if (q0.j(context) >= 83) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && billingConfigImpl.n()) {
                                hashMap.put(Long.valueOf(longExtra), Boolean.FALSE);
                                Iterator<Activity> it = ReaderPdfApplication.f23858j.iterator();
                                while (it.hasNext()) {
                                    Activity next = it.next();
                                    if (next instanceof SubscriptionDarkTestFActivity) {
                                        SubscriptionDarkTestFActivity subscriptionDarkTestFActivity = (SubscriptionDarkTestFActivity) next;
                                        subscriptionDarkTestFActivity.Z = true;
                                        subscriptionDarkTestFActivity.finish();
                                    } else if (next instanceof SubscriptionAIActivity) {
                                        SubscriptionAIActivity subscriptionAIActivity = (SubscriptionAIActivity) next;
                                        subscriptionAIActivity.T = true;
                                        subscriptionAIActivity.finish();
                                    } else if (next instanceof SubscriptionAIJ1Activity) {
                                        SubscriptionAIJ1Activity subscriptionAIJ1Activity = (SubscriptionAIJ1Activity) next;
                                        subscriptionAIJ1Activity.T = true;
                                        subscriptionAIJ1Activity.finish();
                                    } else if (next instanceof SubscriptionDarkTestJActivity) {
                                        SubscriptionDarkTestJActivity subscriptionDarkTestJActivity = (SubscriptionDarkTestJActivity) next;
                                        subscriptionDarkTestJActivity.X = true;
                                        subscriptionDarkTestJActivity.finish();
                                    } else if (next instanceof SubscriptionBlackFridayActivity) {
                                        SubscriptionBlackFridayActivity subscriptionBlackFridayActivity = (SubscriptionBlackFridayActivity) next;
                                        subscriptionBlackFridayActivity.Z = true;
                                        subscriptionBlackFridayActivity.finish();
                                    } else if (next instanceof LanguageChooseActivity) {
                                        next.finish();
                                    } else if (next instanceof UserGuideActivity) {
                                        next.finish();
                                    }
                                }
                                ReaderPdfApplication.d();
                                intent2.putExtra(ea.a.p("JGVIXx9yWG0FcCtnZQ==", "xzuQ1tkK"), ea.a.p("FHYhbnQ=", "keqDHWwO"));
                                intent2.setClass(context, SubscriptionBlackFridayActivity.class);
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
            pdf.pdfreader.viewer.editor.free.billing.h hVar = pdf.pdfreader.viewer.editor.free.billing.h.f24062a;
            hVar.getClass();
            pdf.pdfreader.viewer.editor.free.billing.h.a("checkBlackFridayState = isPremiumUser: " + billingConfigImpl.w() + ", isSupport: " + billingConfigImpl.z() + ", productInfo: " + billingConfigImpl.k().b());
            return false;
        }

        public static void b(Context context, Intent intent, String str, Class cls) {
            boolean z10;
            boolean equals;
            kotlin.jvm.internal.g.e(context, "context");
            BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
            if (!billingConfigImpl.w() && billingConfigImpl.z()) {
                ol.d b10 = billingConfigImpl.k().b();
                BaseSubscriptionActivity.L.getClass();
                if (!kotlin.jvm.internal.g.a(b10, BaseSubscriptionActivity.R)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int d10 = c1.d(context);
                    if (BillingConfigImpl.l() < d10) {
                        if (!t0.b0(currentTimeMillis, ((Number) BillingConfigImpl.B.b(BillingConfigImpl.f24850d[7])).longValue())) {
                            String h10 = de.e.h(c1.P, "");
                            boolean z11 = true;
                            if (h10 != null && h10.length() != 0) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                ea.a.p("LWldbBBuUF8pcCZhBmg3c0BiHWM3aRV0A28LX1dwMm4QMQQ2WWNYbjxpLSAcc0hkUGYPdSl0", "6yZ3je8W");
                                equals = false;
                            } else {
                                equals = TextUtils.equals(ea.a.p("MQ==", "mKVAd9hO"), h10);
                            }
                            String f10 = c1.f(context);
                            pdf.pdfreader.viewer.editor.free.billing.h.f24062a.getClass();
                            pdf.pdfreader.viewer.editor.free.billing.h.a("checkSplashSubscriptionState = showSplashSubscription: " + equals + ", splashSubscriptionPlanL: " + f10);
                            pdf.pdfreader.viewer.editor.free.billing.h.a("checkSplashSubscriptionState = splashSubscriptionShowCount: " + BillingConfigImpl.l() + ", limit " + d10);
                            if (equals) {
                                if (cls != null) {
                                    intent.setClass(context, cls);
                                }
                                intent.putExtra(ea.a.p("AGUaXzFyIG0XcAdnZQ==", "7DkcWO6C"), str);
                                String p10 = ea.a.p("WGUyXwB1AHMRcl1iDF8mbCVu", "QNfKealQ");
                                if (f10.length() <= 0) {
                                    z11 = false;
                                }
                                if (!z11) {
                                    f10 = null;
                                }
                                if (f10 == null) {
                                    f10 = ea.a.p("XW8=", "meZqrtSy");
                                }
                                intent.putExtra(p10, f10);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            pdf.pdfreader.viewer.editor.free.billing.h hVar = pdf.pdfreader.viewer.editor.free.billing.h.f24062a;
            hVar.getClass();
            pdf.pdfreader.viewer.editor.free.billing.h.a("checkSplashSubscriptionState = isPremiumUser: " + billingConfigImpl.w() + ", isSupport: " + billingConfigImpl.z() + ", productInfo: " + billingConfigImpl.k().b());
        }

        public static CharSequence c(Context context, String str, TextPaint textPaint) {
            int[] iArr;
            String obj = str.toString();
            if (!kotlin.text.k.O(obj, ea.a.p("D2I-", "ie5MQf7U"), false)) {
                return str;
            }
            try {
                int V = kotlin.text.k.V(obj, ea.a.p("RWI-", "DHyWMtxW"), 0, false, 6);
                int V2 = kotlin.text.k.V(obj, ea.a.p("cS80Pg==", "7GMVlGzy"), 0, false, 6) - 3;
                String K = kotlin.text.j.K(kotlin.text.j.K(obj, ea.a.p("D2I-", "aWyHWrdP"), ""), ea.a.p("cy9TPg==", "gBrxfkGh"), "");
                SpannableString spannableString = new SpannableString(K);
                if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(context)) {
                    iArr = new int[]{-2544661, -11511809};
                } else {
                    iArr = new int[]{-2544661, -13419534};
                }
                spannableString.setSpan(new so.a(new LinearGradient(0.0f, 0.0f, textPaint.measureText(K, V, V2), 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP)), V, V2, 18);
                return spannableString;
            } catch (Throwable unused) {
                return str;
            }
        }

        public final void checkLanguageIntent(Context context, Intent intent) {
            kotlin.jvm.internal.g.e(context, "context");
            kotlin.jvm.internal.g.e(intent, "intent");
            if (intent.hasExtra(ea.a.p("JGVIXx9yWG0FcCtnZQ==", "LCg3RBXX")) && intent.hasExtra(ea.a.p("WGUyXwB1AHMRcl1iDF8mbCVu", "ZSMtQAtN"))) {
                intent.setClass(context, SubscriptionDarkTestFActivity.class);
            }
        }
    }

    static {
        ea.a.p("HnUgcydyUHA8aQlucGEla2xlIXQ=", "lqMBD9mW");
        ea.a.p("A2ULaw==", "HbgxY3Lu");
        ea.a.p("O2hYcmQ=", "8bcleRAG");
        ea.a.p("KHVYZGU=", "mNAYgPp2");
        ea.a.p("VnYubnQ=", "yIajrthL");
        f24934a = new a();
    }
}
