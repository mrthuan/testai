package pdf.pdfreader.viewer.editor.free.ads;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.v;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class AppOpenManager_LifecycleAdapter implements androidx.lifecycle.i {

    /* renamed from: a  reason: collision with root package name */
    public final AppOpenManager f23913a;

    public AppOpenManager_LifecycleAdapter(AppOpenManager appOpenManager) {
        this.f23913a = appOpenManager;
    }

    @Override // androidx.lifecycle.i
    public final void a(Lifecycle.Event event, boolean z10, v vVar) {
        boolean z11;
        int i10;
        boolean z12 = false;
        if (vVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 && event == Lifecycle.Event.ON_START) {
            if (z11) {
                String p10 = ea.a.p("IG5wcAlGWHI_ZzhvAG4MZWQ=", "2GUcAWj4");
                vVar.getClass();
                HashMap hashMap = vVar.f4082a;
                Integer num = (Integer) hashMap.get(p10);
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = 0;
                }
                if ((i10 & 1) != 0) {
                    z12 = true;
                }
                hashMap.put(p10, Integer.valueOf(i10 | 1));
                if (!(!z12)) {
                    return;
                }
            }
            this.f23913a.onAppForegrounded();
        }
    }
}
