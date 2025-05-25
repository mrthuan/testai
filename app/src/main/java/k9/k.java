package k9;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.inmobi.ads.rendering.InMobiAdActivity;
import kotlinx.coroutines.l1;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionAIJ1Activity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestJActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19664a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f19665b;

    public /* synthetic */ k(Object obj, int i10) {
        this.f19664a = i10;
        this.f19665b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        int i10 = this.f19664a;
        Object obj = this.f19665b;
        switch (i10) {
            case 0:
                n nVar = (n) obj;
                nVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - nVar.f19678o;
                    if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        nVar.f19676m = false;
                    }
                    nVar.u();
                    nVar.f19676m = true;
                    nVar.f19678o = System.currentTimeMillis();
                }
                return false;
            case 1:
                return InMobiAdActivity.d((InMobiAdActivity) obj, view, motionEvent);
            case 2:
                SubscriptionAIJ1Activity subscriptionAIJ1Activity = (SubscriptionAIJ1Activity) obj;
                SubscriptionAIJ1Activity.a aVar = SubscriptionAIJ1Activity.Z;
                kotlin.jvm.internal.g.e(subscriptionAIJ1Activity, ea.a.p("O2hYc10w", "B2oirTUl"));
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        subscriptionAIJ1Activity.N2();
                    }
                } else {
                    ValueAnimator valueAnimator = subscriptionAIJ1Activity.Y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    l1 l1Var = subscriptionAIJ1Activity.W;
                    if (l1Var != null) {
                        l1Var.b(null);
                    }
                }
                return false;
            default:
                SubscriptionDarkTestJActivity subscriptionDarkTestJActivity = (SubscriptionDarkTestJActivity) obj;
                SubscriptionDarkTestJActivity.a aVar2 = SubscriptionDarkTestJActivity.f24905b0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestJActivity, ea.a.p("O2hYc10w", "LpGgutQP"));
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 == 1 || actionMasked2 == 3) {
                        subscriptionDarkTestJActivity.E2();
                    }
                } else {
                    ValueAnimator valueAnimator2 = subscriptionDarkTestJActivity.f24906a0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    l1 l1Var2 = subscriptionDarkTestJActivity.Y;
                    if (l1Var2 != null) {
                        l1Var2.b(null);
                    }
                }
                return false;
        }
    }
}
