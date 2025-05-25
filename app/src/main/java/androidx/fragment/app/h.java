package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.SpecialEffectsController;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import d7.a;
import db.a;
import java.util.Map;
import jl.a;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import s0.d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements d.a, a.InterfaceC0194a, a.InterfaceC0196a, Continuation, OnPaidEventListener, x0.u, a.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3813a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3814b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.f3813a = i10;
        this.f3814b = obj;
        this.c = obj2;
    }

    @Override // jl.a.d
    public final void B(boolean z10) {
        OfficeReaderActivity officeReaderActivity = (OfficeReaderActivity) this.f3814b;
        Bundle bundle = (Bundle) this.c;
        String str = OfficeReaderActivity.D2;
        kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("R2gic1cw", "VT0PlXqe"));
        if (z10) {
            officeReaderActivity.P2(bundle);
        } else {
            officeReaderActivity.s2();
        }
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void a(AdValue adValue) {
        String str;
        ResponseInfo responseInfo;
        Context context = (Context) this.f3814b;
        ud.h this$0 = (ud.h) this.c;
        kotlin.jvm.internal.g.e(context, "$context");
        kotlin.jvm.internal.g.e(this$0, "this$0");
        String str2 = this$0.f30311i;
        InterstitialAd interstitialAd = this$0.f30307e;
        if (interstitialAd != null && (responseInfo = interstitialAd.getResponseInfo()) != null) {
            str = responseInfo.a();
        } else {
            str = null;
        }
        wd.a.d(context, adValue, str2, str, this$0.f30305b, this$0.f30310h);
    }

    @Override // db.a.InterfaceC0196a
    public final void g(db.b bVar) {
        ((a.InterfaceC0196a) this.f3814b).g(bVar);
        ((a.InterfaceC0196a) this.c).g(bVar);
    }

    @Override // d7.a.InterfaceC0194a
    public final Object l() {
        b7.e eVar = (b7.e) this.f3814b;
        eVar.getClass();
        for (Map.Entry entry : ((Map) this.c).entrySet()) {
            eVar.f5359i.d(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    @Override // x0.u
    public final x0.s0 m(View view, x0.s0 s0Var) {
        int i10 = this.f3813a;
        Object obj = this.c;
        Object obj2 = this.f3814b;
        switch (i10) {
            case 5:
                BaseUserGuideTestFragment baseUserGuideTestFragment = (BaseUserGuideTestFragment) obj2;
                View view2 = (View) obj;
                BaseUserGuideTestFragment.a aVar = BaseUserGuideTestFragment.f24996h0;
                kotlin.jvm.internal.g.e(baseUserGuideTestFragment, ea.a.p("O2hYc10w", "GiLWex4y"));
                kotlin.jvm.internal.g.e(view2, ea.a.p("cnQkcBFwK2Nl", "EvVKBJl7"));
                kotlin.jvm.internal.g.e(view, ea.a.p("D2Elbx15D28HcxRwCHI3bSF0V3JmMD4=", "idT0ZbVL"));
                ea.a.p("Jm5CZQ1z", "sdzrP1sh");
                u i11 = baseUserGuideTestFragment.i();
                if (i11 != null && i11.hasWindowFocus()) {
                    o0.b a10 = s0Var.a(7);
                    kotlin.jvm.internal.g.d(a10, ea.a.p("Jm5CZQ1zGWc_dANuBmUccx1XB24hbxJJsID_QzttFmE7LmV5CWUZcyNzPmUYQglyRihHKQ==", "rzCORYTf"));
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams != null) {
                        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                        ((ViewGroup.MarginLayoutParams) bVar).height = a10.f22640b;
                        view2.setLayoutParams(bVar);
                    } else {
                        throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuPm5ubjhsGCBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQ9YTpvOHRad1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTDB5LHU5UBVyUm1z", "QCMt1air"));
                    }
                }
                return s0Var;
            default:
                InquiryAfterGuideFragment inquiryAfterGuideFragment = (InquiryAfterGuideFragment) obj2;
                Space space = (Space) obj;
                InquiryAfterGuideFragment.a aVar2 = InquiryAfterGuideFragment.f25030e0;
                kotlin.jvm.internal.g.e(inquiryAfterGuideFragment, ea.a.p("O2hYc10w", "EIYbdpi6"));
                kotlin.jvm.internal.g.e(space, ea.a.p("a3RecCpwVmNl", "LCxxr2pD"));
                kotlin.jvm.internal.g.e(view, ea.a.p("D2Elbx15D28HcxRwCHI3bSF0V3JmMD4=", "hpJSaUij"));
                ea.a.p("Jm5CZQ1z", "YUEdDVPX");
                u i12 = inquiryAfterGuideFragment.i();
                if (i12 != null) {
                    o0.b a11 = s0Var.a(7);
                    kotlin.jvm.internal.g.d(a11, ea.a.p("Wm44ZQdzTGcXdH1uGmUic2xXW24ibzRJrYDRQ1ptPGFHLh95A2VMcwtzQGUEQjdyNygbKQ==", "Ow5Lh7Xy"));
                    boolean hasWindowFocus = i12.hasWindowFocus();
                    int i13 = a11.f22640b;
                    if (hasWindowFocus || i13 != 0) {
                        ViewGroup.LayoutParams layoutParams2 = space.getLayoutParams();
                        if (layoutParams2 != null) {
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
                            ((ViewGroup.MarginLayoutParams) bVar2).height = i13;
                            space.setLayoutParams(bVar2);
                        } else {
                            throw new NullPointerException(ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuHW5sbhFsIyA7eUFlWWFZZChvI2QNLgtvW3MaciRpC3QeYThvEXRhdyZkVmUNLnRvNHM-chRpBnR5YRdvMHRLTBN5LnUQUC5yLm1z", "G1ljrAdO"));
                        }
                    }
                }
                return s0Var;
        }
    }

    @Override // s0.d.a
    public final void onCancel() {
        SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) this.c;
        kotlin.jvm.internal.g.e(operation, "$operation");
        ((Animator) this.f3814b).end();
        if (g0.J(2)) {
            operation.toString();
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int[] iArr = ConfigFetchHandler.f13694k;
        return ((ConfigFetchHandler) this.f3814b).b(0L, task, (Map) this.c);
    }
}
