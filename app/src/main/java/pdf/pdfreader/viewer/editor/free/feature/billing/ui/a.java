package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import android.content.Context;
import androidx.fragment.app.w;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;

/* compiled from: BaseSubscriptionActivity.kt */
/* loaded from: classes3.dex */
public final class a extends w {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ BaseSubscriptionActivity f24919d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f24920e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f24921f;

    public a(BaseSubscriptionActivity baseSubscriptionActivity, String str, String str2) {
        this.f24919d = baseSubscriptionActivity;
        this.f24920e = str;
        this.f24921f = str2;
    }

    @Override // oo.a
    public final void a() {
        SubscriptionType subscriptionType;
        Context m10 = ReaderPdfApplication.m();
        String p10 = ea.a.p("WmFw", "16CM5aYW");
        String p11 = ea.a.p("JmFBchx0Vmk0Xzl0FHIcX1ZsB2Nr", "Abok1dLk");
        BaseSubscriptionActivity baseSubscriptionActivity = this.f24919d;
        String str = this.f24920e;
        String str2 = this.f24921f;
        tn.a.d(m10, p10, p11, baseSubscriptionActivity.g2(str, str2, false), false);
        tn.a.d(ReaderPdfApplication.m(), ea.a.p("WmFw", "rcFbGo6a"), ea.a.p("WmE7chZ0A2kcX0d0CHIiXydsW2Nr", "OjfAoML5"), baseSubscriptionActivity.g2(str, str2, true), false);
        if (baseSubscriptionActivity.C) {
            subscriptionType = SubscriptionType.YEAR_TRIAL_7D;
        } else {
            subscriptionType = SubscriptionType.YEAR_TRIAL_14D;
        }
        baseSubscriptionActivity.J = subscriptionType;
        baseSubscriptionActivity.w2(subscriptionType, str);
    }

    @Override // androidx.fragment.app.w, oo.a
    public final void cancel() {
        Context m10 = ReaderPdfApplication.m();
        String p10 = ea.a.p("WmFw", "3S8T4Nln");
        String p11 = ea.a.p("WmE7chZ0A2kcX1hlCHYzXydsW2Nr", "L0b6ZDNq");
        BaseSubscriptionActivity baseSubscriptionActivity = this.f24919d;
        String str = this.f24920e;
        String str2 = this.f24921f;
        tn.a.d(m10, p10, p11, baseSubscriptionActivity.g2(str, str2, false), false);
        tn.a.d(ReaderPdfApplication.m(), ea.a.p("WmFw", "2idaB6s6"), ea.a.p("JmFBchx0Vmk0XyZlFHYNX1ZsB2Nr", "Wikghl8k"), baseSubscriptionActivity.g2(str, str2, true), false);
        String string = baseSubscriptionActivity.getString(R.string.arg_res_0x7f1304a1);
        kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHMzYjBjO2kJdARvW19VYSJsFmQp", "Iym5MVgm"));
        baseSubscriptionActivity.z2(string, false);
    }
}
