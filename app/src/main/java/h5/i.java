package h5;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import d7.a;
import h5.m;
import jb.v;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import pdf.pdfreader.viewer.editor.free.ads.a;
import pdf.pdfreader.viewer.editor.free.ads.n;
import v6.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements OnSuccessListener, a.InterfaceC0194a, OnPaidEventListener, Continuation, a.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f18029a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18030b;

    public /* synthetic */ i(Object obj, Object obj2) {
        this.f18029a = obj;
        this.f18030b = obj2;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void a(AdValue adValue) {
        String str;
        ResponseInfo responseInfo;
        Context context = (Context) this.f18029a;
        ud.e this$0 = (ud.e) this.f18030b;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        String str2 = this$0.f30299i;
        AdManagerAdView adManagerAdView = this$0.f30295e;
        if (adManagerAdView != null && (responseInfo = adManagerAdView.getResponseInfo()) != null) {
            str = responseInfo.a();
        } else {
            str = null;
        }
        wd.a.d(context, adValue, str2, str, this$0.f30293b, this$0.f30298h);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.e
    public void d(Dialog dialog) {
        cg.a aVar = (cg.a) this.f18029a;
        Activity activity = (Activity) this.f18030b;
        n nVar = n.f23972a;
        kotlin.jvm.internal.g.e(aVar, ea.a.p("a2NdbwpldmQ=", "TvdbTZng"));
        kotlin.jvm.internal.g.e(activity, ea.a.p("aGl0", "7OLQiJij"));
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        aVar.invoke();
        pdf.pdfreader.viewer.editor.free.ads.d.m().n(activity, null);
    }

    @Override // d7.a.InterfaceC0194a
    public Object l() {
        return ((b7.e) this.f18029a).c.F((s) this.f18030b);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        String str;
        m.a aVar = (m.a) this.f18030b;
        o9.a aVar2 = (o9.a) obj;
        ((m) this.f18029a).getClass();
        StringBuilder sb2 = new StringBuilder("availableStatus = ");
        int i10 = aVar2.f22747b;
        String str2 = "UNKNOWN";
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    str = "UNKNOWN";
                } else {
                    str = "TRIGGERED_IN_PROGRESS";
                }
            } else {
                str = "AVAILABLE";
            }
        } else {
            str = "NOT_AVAILABLE";
        }
        sb2.append(str);
        sb2.append(" availableVersionCode = ");
        sb2.append(aVar2.f22746a);
        sb2.append("\nupdatePriority = ");
        sb2.append(aVar2.f22748d);
        sb2.append("\nisImmediateAllowed = ");
        sb2.append(aVar2.a(1));
        sb2.append(" isFlexibleAllowed = ");
        sb2.append(aVar2.a(0));
        sb2.append("\nStatus = ");
        int i11 = aVar2.c;
        if (i11 != 10) {
            if (i11 != 11) {
                switch (i11) {
                    case 1:
                        str2 = "PENDING";
                        break;
                    case 2:
                        str2 = "DOWNLOADING";
                        break;
                    case 3:
                        str2 = "INSTALLING";
                        break;
                    case 4:
                        str2 = "INSTALLED";
                        break;
                    case 5:
                        str2 = "FAILED";
                        break;
                    case 6:
                        str2 = "CANCELED";
                        break;
                }
            } else {
                str2 = "DOWNLOADED";
            }
        } else {
            str2 = "REQUIRES_UI_INTENT";
        }
        sb2.append(str2);
        sb2.append("\nDownload = ");
        sb2.append(aVar2.f22749e);
        sb2.append(PackagingURIHelper.FORWARD_SLASH_STRING);
        sb2.append(aVar2.f22750f);
        sb2.toString().getClass();
        m.f();
        aVar.h(aVar2);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        v vVar = (v) this.f18029a;
        String str = (String) this.f18030b;
        synchronized (vVar) {
            vVar.f19157b.remove(str);
        }
        return task;
    }
}
