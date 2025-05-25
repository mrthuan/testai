package v4;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import be.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIChatRecyclerView;
import pdf.pdfreader.viewer.editor.free.utils.n0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30617a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f30618b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f30619d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f30620e;

    public /* synthetic */ r(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f30617a = i11;
        this.c = obj;
        this.f30619d = obj2;
        this.f30618b = i10;
        this.f30620e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f30617a;
        int i11 = this.f30618b;
        Object obj = this.f30620e;
        Object obj2 = this.f30619d;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                q this$0 = (q) obj3;
                Context context = (Context) obj2;
                String message = (String) obj;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                kotlin.jvm.internal.g.e(message, "$message");
                a.InterfaceC0036a interfaceC0036a = this$0.f30605f;
                String str = this$0.f30602b;
                if (interfaceC0036a != null) {
                    interfaceC0036a.a(context, new yd.a(str + ":onError, errorCode: " + i11 + ' ' + message, 0));
                }
                fe.a a10 = fe.a.a();
                a10.b(str + ":onError, errorCode: " + i11 + ' ' + message);
                return;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                AIChatRecyclerView aIChatRecyclerView = (AIChatRecyclerView) obj2;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) obj;
                int i12 = AIChatRecyclerView.L0;
                kotlin.jvm.internal.g.e(ref$ObjectRef, ea.a.p("a2JedA1vWlYzZXc=", "XCnexlZv"));
                kotlin.jvm.internal.g.e(aIChatRecyclerView, ea.a.p("R2gic1cw", "9X15Dnff"));
                kotlin.jvm.internal.g.e(linearLayoutManager, ea.a.p("fWwgeT91TE0pbgdnUXI=", "76YAP81p"));
                if (((View) ref$ObjectRef.element).getBottom() > 0) {
                    ea.a.p("UnU_byBjEG8ebGBhZw==", "jIfEzDaV");
                    aIChatRecyclerView.canScrollVertically(1);
                    ((View) ref$ObjectRef.element).getBottom();
                    ((View) ref$ObjectRef.element).getMeasuredHeight();
                    String str2 = n0.f28727a;
                    if (aIChatRecyclerView.canScrollVertically(1)) {
                        if (i11 == linearLayoutManager.M() - 1) {
                            ea.a.p("UnU_byBjEG8ebGBhZw==", "c0fi0ZMo");
                            ((View) ref$ObjectRef.element).getBottom();
                            aIChatRecyclerView.getMeasuredHeight();
                            aIChatRecyclerView.t0(0, (((View) ref$ObjectRef.element).getBottom() - aIChatRecyclerView.getMeasuredHeight()) + aIChatRecyclerView.H0, false);
                            return;
                        }
                        aIChatRecyclerView.t0(0, ((View) ref$ObjectRef.element).getBottom() - aIChatRecyclerView.getMeasuredHeight(), false);
                        ea.a.p("LnVFbypjRW82bB5hZw==", "8hEFvheQ");
                        ((View) ref$ObjectRef.element).getBottom();
                        aIChatRecyclerView.getMeasuredHeight();
                        return;
                    }
                    aIChatRecyclerView.B0();
                    aIChatRecyclerView.z0();
                    return;
                }
                return;
        }
    }
}
