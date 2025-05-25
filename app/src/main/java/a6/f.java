package a6;

import android.app.Activity;
import cg.l;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.appevents.iap.d;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderSplashActivity;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenStatus;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f69a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f70b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f71d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f72e;

    public /* synthetic */ f(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f69a = i10;
        this.f70b = obj;
        this.c = obj2;
        this.f71d = obj3;
        this.f72e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = null;
        int i10 = this.f69a;
        Object obj2 = this.f72e;
        Object obj3 = this.f71d;
        Object obj4 = this.c;
        Object obj5 = this.f70b;
        switch (i10) {
            case 0:
                com.facebook.appevents.iap.d this$0 = (com.facebook.appevents.iap.d) obj5;
                Runnable completionHandler = (Runnable) obj4;
                InAppPurchaseUtils.IAPProductType skuType = (InAppPurchaseUtils.IAPProductType) obj3;
                List<String> skuIDs = (List) obj2;
                if (!k6.a.b(com.facebook.appevents.iap.d.class)) {
                    try {
                        kotlin.jvm.internal.g.e(this$0, "this$0");
                        Class<?> cls = this$0.f9553e;
                        kotlin.jvm.internal.g.e(completionHandler, "$completionHandler");
                        kotlin.jvm.internal.g.e(skuType, "$skuType");
                        kotlin.jvm.internal.g.e(skuIDs, "$skuIDs");
                        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new d.e(this$0, completionHandler));
                        Object a10 = this$0.f9559k.a(skuType, skuIDs);
                        Class<?> cls2 = this$0.f9551b;
                        Method method = this$0.f9557i;
                        if (!k6.a.b(this$0)) {
                            obj = this$0.f9550a;
                        }
                        InAppPurchaseUtils.d(cls2, method, obj, a10, newProxyInstance);
                        return;
                    } catch (Throwable th2) {
                        k6.a.a(com.facebook.appevents.iap.d.class, th2);
                        return;
                    }
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj3;
                l lVar = (l) obj2;
                ThirdOpenParseManager thirdOpenParseManager = ThirdOpenParseManager.f28760a;
                kotlin.jvm.internal.g.e(arrayList, ea.a.p("a3RZaQtkfm07Z2U=", "xUtUXZwT"));
                kotlin.jvm.internal.g.e(activity, ea.a.p("a2FSdBB2XnR5", "QXxLwGyi"));
                if (arrayList.size() != ((ArrayList) obj4).size()) {
                    j1.e(activity, activity.getString(R.string.arg_res_0x7f130569), false, null, -1);
                }
                ReaderSplashActivity.a aVar = ReaderSplashActivity.f23873s;
                String p10 = ea.a.p("Jm1QZxwgR2Eocy8gE2kGaUZoC2Q=", "448CB4ZT");
                aVar.getClass();
                ReaderSplashActivity.a.b(p10);
                if (lVar != null) {
                    lVar.invoke(new ip.a(ThirdOpenStatus.DONE, arrayList));
                    return;
                }
                return;
        }
    }
}
