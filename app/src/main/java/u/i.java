package u;

import android.os.Bundle;
import com.inmobi.media.A3;
import com.inmobi.media.Ib;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30099a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f30100b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f30101d;

    public /* synthetic */ i(A3 a32, boolean z10) {
        this.f30099a = 1;
        this.c = a32;
        this.f30101d = null;
        this.f30100b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f30099a;
        boolean z10 = this.f30100b;
        Object obj = this.f30101d;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                ((n) obj2).onSessionEnded(z10, (Bundle) obj);
                return;
            case 1:
                A3.a((A3) obj2, (Ib) obj, z10);
                return;
            default:
                BaseOperatePDFActivity.l2((String) obj, (BaseOperatePDFActivity) obj2, z10);
                return;
        }
    }

    public /* synthetic */ i(Object obj, int i10, Object obj2, boolean z10) {
        this.f30099a = i10;
        this.c = obj;
        this.f30100b = z10;
        this.f30101d = obj2;
    }
}
