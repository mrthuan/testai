package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.j;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.appevents.iap.d;
import com.inmobi.media.AbstractC1846w0;
import com.inmobi.media.C1761p5;
import com.inmobi.media.Nb;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import ha.h;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderSplashActivity;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenStatus;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3761a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3762b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f3763d;

    public /* synthetic */ d(int i10, Object obj, Object obj2, Object obj3) {
        this.f3761a = i10;
        this.c = obj;
        this.f3763d = obj2;
        this.f3762b = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = null;
        int i10 = this.f3761a;
        Object obj2 = this.f3762b;
        Object obj3 = this.f3763d;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                List awaitingContainerChanges = (List) obj4;
                SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) obj3;
                kotlin.jvm.internal.g.e(awaitingContainerChanges, "$awaitingContainerChanges");
                kotlin.jvm.internal.g.e(operation, "$operation");
                kotlin.jvm.internal.g.e((j) obj2, "this$0");
                if (awaitingContainerChanges.contains(operation)) {
                    awaitingContainerChanges.remove(operation);
                    View view = operation.c.H;
                    SpecialEffectsController.Operation.State state = operation.f3721a;
                    kotlin.jvm.internal.g.d(view, "view");
                    state.applyState(view);
                    return;
                }
                return;
            case 1:
                j this$0 = (j) obj2;
                j.a animationInfo = (j.a) obj3;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                kotlin.jvm.internal.g.e(animationInfo, "$animationInfo");
                this$0.f3717a.endViewTransition((View) obj4);
                animationInfo.a();
                return;
            case 2:
                com.facebook.appevents.iap.d this$02 = (com.facebook.appevents.iap.d) obj4;
                InAppPurchaseUtils.IAPProductType productType = (InAppPurchaseUtils.IAPProductType) obj3;
                Runnable completionHandler = (Runnable) obj2;
                d.b bVar = com.facebook.appevents.iap.d.f9544l;
                if (!k6.a.b(com.facebook.appevents.iap.d.class)) {
                    try {
                        kotlin.jvm.internal.g.e(this$02, "this$0");
                        Class<?> cls = this$02.f9554f;
                        kotlin.jvm.internal.g.e(productType, "$productType");
                        kotlin.jvm.internal.g.e(completionHandler, "$completionHandler");
                        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new d.c(this$02, productType, completionHandler));
                        Class<?> cls2 = this$02.f9551b;
                        Method method = this$02.f9558j;
                        if (!k6.a.b(this$02)) {
                            obj = this$02.f9550a;
                        }
                        InAppPurchaseUtils.d(cls2, method, obj, productType.getType(), newProxyInstance);
                        return;
                    } catch (Throwable th2) {
                        k6.a.a(com.facebook.appevents.iap.d.class, th2);
                        return;
                    }
                }
                return;
            case 3:
                String applicationId = (String) obj4;
                Context context = (Context) obj3;
                String gateKeepersKey = (String) obj2;
                com.facebook.internal.e eVar = com.facebook.internal.e.f9761a;
                kotlin.jvm.internal.g.e(applicationId, "$applicationId");
                kotlin.jvm.internal.g.e(context, "$context");
                kotlin.jvm.internal.g.e(gateKeepersKey, "$gateKeepersKey");
                com.facebook.internal.e.f9761a.getClass();
                JSONObject a10 = com.facebook.internal.e.a();
                if (a10.length() != 0) {
                    com.facebook.internal.e.d(applicationId, a10);
                    context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(gateKeepersKey, a10.toString()).apply();
                    com.facebook.internal.e.f9764e = Long.valueOf(System.currentTimeMillis());
                }
                com.facebook.internal.e.e();
                com.facebook.internal.e.f9762b.set(false);
                return;
            case 4:
                ha.g gVar = (ha.g) obj4;
                gVar.getClass();
                gVar.f18134a.execute(new g(4, (Runnable) obj3, (h.b) obj2));
                return;
            case 5:
                Nb.b((InMobiUnifiedIdInterface) obj4, (JSONObject) obj3, (Error) obj2);
                return;
            case 6:
                C1761p5.b((C1761p5) obj4, (String) obj3, (String) obj2);
                return;
            case 7:
                AbstractC1846w0.a((AbstractC1846w0) obj4, (cg.a) obj3, (cg.l) obj2);
                return;
            default:
                Activity activity = (Activity) obj4;
                cg.l lVar = (cg.l) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ThirdOpenParseManager thirdOpenParseManager = ThirdOpenParseManager.f28760a;
                kotlin.jvm.internal.g.e(activity, ea.a.p("a2FSdBB2XnR5", "fJR8ixUL"));
                kotlin.jvm.internal.g.e(arrayList, ea.a.p("F3QjaQFkK20TZ2U=", "aE1p4hMn"));
                ReaderSplashActivity.a aVar = ReaderSplashActivity.f23873s;
                String p10 = ea.a.p("Wm0qZxYgEmEAc1EgAG4iZTZyR3B0", "UkbauhHM");
                aVar.getClass();
                ReaderSplashActivity.a.b(p10);
                j1.e(activity, activity.getString(R.string.arg_res_0x7f1301ac), false, null, -1);
                if (lVar != null) {
                    lVar.invoke(new ip.a(ThirdOpenStatus.INTERRUPT, arrayList));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ d(j jVar, View view, j.a aVar) {
        this.f3761a = 1;
        this.f3762b = jVar;
        this.c = view;
        this.f3763d = aVar;
    }
}
