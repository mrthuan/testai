package v4;

import am.b3;
import am.p2;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import be.a;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import d7.a;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30596a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f30597b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f30598d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f30599e;

    public /* synthetic */ o(int i10, b3 b3Var, ImageAdjustActivity imageAdjustActivity, p2 p2Var) {
        this.f30596a = 3;
        this.f30597b = i10;
        this.c = b3Var;
        this.f30598d = imageAdjustActivity;
        this.f30599e = p2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f30596a;
        boolean z10 = false;
        final int i11 = this.f30597b;
        Object obj = this.f30599e;
        Object obj2 = this.f30598d;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                n this$0 = (n) obj3;
                Context context = (Context) obj2;
                String message = (String) obj;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                kotlin.jvm.internal.g.e(message, "$message");
                a.InterfaceC0036a interfaceC0036a = this$0.f30588f;
                String str = this$0.f30585b;
                if (interfaceC0036a != null) {
                    interfaceC0036a.a(context, new yd.a(str + ":onError, errorCode: " + i11 + ' ' + message, 0));
                }
                fe.a.a().b(str + ":onError, errorCode: " + i11 + ' ' + message);
                return;
            case 1:
                final b7.e eVar = (b7.e) obj3;
                final v6.s sVar = (v6.s) obj2;
                Runnable runnable = (Runnable) obj;
                d7.a aVar = eVar.f5356f;
                try {
                    try {
                        c7.d dVar = eVar.c;
                        Objects.requireNonNull(dVar);
                        aVar.a(new a1.e(dVar, 2));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) eVar.f5352a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            z10 = true;
                        }
                        if (!z10) {
                            aVar.a(new a.InterfaceC0194a() { // from class: b7.b
                                @Override // d7.a.InterfaceC0194a
                                public final Object l() {
                                    e.this.f5354d.a(sVar, i11 + 1);
                                    return null;
                                }
                            });
                        } else {
                            eVar.a(sVar, i11);
                        }
                    } catch (SynchronizationException unused) {
                        eVar.f5354d.a(sVar, i11 + 1);
                    }
                    return;
                } finally {
                    runnable.run();
                }
            case 2:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj2;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj;
                PDFPageManagerActivity.a aVar2 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(ref$BooleanRef, ea.a.p("F2gqczVhC2wXZH1tZw==", "nmFo6J0Y"));
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "cJI4fwXr"));
                kotlin.jvm.internal.g.e(ref$IntRef, ea.a.p("a3NEYxplRHMZbz9udA==", "iYCtCVy2"));
                if (ref$BooleanRef.element) {
                    j1.e(pDFPageManagerActivity, pDFPageManagerActivity.getResources().getString(R.string.arg_res_0x7f130569), false, null, -1);
                }
                pDFPageManagerActivity.f25273l0 = 0L;
                pDFPageManagerActivity.f25313t.removeCallbacks(pDFPageManagerActivity.f25274m0);
                pDFPageManagerActivity.o2().f1264d.f1510b.setVisibility(8);
                pDFPageManagerActivity.V = false;
                if (ref$IntRef.element > 0) {
                    ArrayList arrayList = new ArrayList();
                    int i12 = ref$IntRef.element + i11;
                    for (int i13 = i11; i13 < i12; i13++) {
                        bn.a aVar3 = new bn.a();
                        aVar3.f5491e = i13;
                        arrayList.add(aVar3);
                    }
                    pDFPageManagerActivity.s2().f();
                    if (!arrayList.isEmpty()) {
                        if (pDFPageManagerActivity.R) {
                            pDFPageManagerActivity.s2().e(arrayList);
                        } else {
                            pDFPageManagerActivity.s2().d((bn.a) kotlin.collections.m.r0(arrayList));
                        }
                    }
                    pDFPageManagerActivity.q2().i(i11, arrayList);
                    pDFPageManagerActivity.z2();
                    pDFPageManagerActivity.C2(i11);
                    pDFPageManagerActivity.I2(pDFPageManagerActivity.q2().getItemCount());
                    return;
                }
                return;
            default:
                b3 b3Var = (b3) obj3;
                ImageAdjustActivity imageAdjustActivity = (ImageAdjustActivity) obj2;
                p2 p2Var = (p2) obj;
                ImageAdjustActivity.a aVar4 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(b3Var, ea.a.p("b3AjcHBpH2Qhbmc=", "tyKL2qUi"));
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("H2hQc1Yw", "pOk9rIVQ"));
                kotlin.jvm.internal.g.e(p2Var, ea.a.p("a2ZYbA1lRUIzbi5pG2c=", "CIkPR1Ps"));
                ConstraintLayout constraintLayout = (ConstraintLayout) b3Var.f769f;
                if (i11 != constraintLayout.getMeasuredHeight()) {
                    imageAdjustActivity.M2();
                }
                LottieAnimationView lottieAnimationView = p2Var.f1309g;
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.j();
                ea.a.p("P29BQhBuU2k0Z2RyGm8cVlxldw==", "PPYZQxom");
                float dimensionPixelSize = imageAdjustActivity.getResources().getDimensionPixelSize(R.dimen.dp_6);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(constraintLayout, ea.a.p("R3IqbgBsA3Qbb1pZ", "T62hlIaF"), 0.0f, -dimensionPixelSize, dimensionPixelSize, 0.0f);
                imageAdjustActivity.f25757p0 = ofFloat;
                if (ofFloat != null) {
                    ofFloat.setDuration(1500L);
                }
                ObjectAnimator objectAnimator = imageAdjustActivity.f25757p0;
                if (objectAnimator != null) {
                    objectAnimator.setInterpolator(new LinearInterpolator());
                }
                ObjectAnimator objectAnimator2 = imageAdjustActivity.f25757p0;
                if (objectAnimator2 != null) {
                    objectAnimator2.start();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ o(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f30596a = i11;
        this.c = obj;
        this.f30598d = obj2;
        this.f30597b = i10;
        this.f30599e = obj3;
    }

    public /* synthetic */ o(Ref$BooleanRef ref$BooleanRef, PDFPageManagerActivity pDFPageManagerActivity, Ref$IntRef ref$IntRef, int i10) {
        this.f30596a = 2;
        this.c = ref$BooleanRef;
        this.f30598d = pDFPageManagerActivity;
        this.f30599e = ref$IntRef;
        this.f30597b = i10;
    }
}
