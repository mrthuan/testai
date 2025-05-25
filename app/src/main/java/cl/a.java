package cl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.s.network.NetworkType;
import pdf.pdfreader.viewer.editor.free.ui.vm.AppViewModel;
import t5.i;

/* compiled from: NetworkChangeMonitor.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5710a;

    /* renamed from: b  reason: collision with root package name */
    public b f5711b;

    /* compiled from: NetworkChangeMonitor.java */
    /* renamed from: cl.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0044a extends BroadcastReceiver {
        public C0044a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a aVar = a.this;
            NetworkType a10 = cl.b.a(aVar.f5710a);
            b bVar = aVar.f5711b;
            if (bVar != null) {
                ((i) bVar).getClass();
                pdf.pdfreader.viewer.editor.free.utils.init.b bVar2 = pdf.pdfreader.viewer.editor.free.utils.init.b.f28709a;
                if (a10 != NetworkType.NETWORK_NULL) {
                    wk.b.b().e(new al.a());
                }
                AppViewModel k10 = ReaderPdfApplication.k();
                g.d(a10, ea.a.p("LHVDcjdlQ3c1cms=", "ghelfu8P"));
                k10.e(a10);
            }
        }
    }

    /* compiled from: NetworkChangeMonitor.java */
    /* loaded from: classes3.dex */
    public interface b {
    }

    static {
        ea.a.p("K2VNd15yLkMgYQhnUU04blF0PXI=", "wZe91E2k");
    }

    public a(ReaderPdfApplication readerPdfApplication) {
        this.f5710a = readerPdfApplication;
        androidx.core.content.a.registerReceiver(readerPdfApplication, new C0044a(), new IntentFilter(ea.a.p("Lm5VchZpUy40ZT4uFm8GbhtDIU4LRSZUGFYQVClfCEgOTnZF", "K2kpQYpK")), 2);
    }
}
