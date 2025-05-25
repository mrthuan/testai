package pdf.pdfreader.viewer.editor.free.fnbridge.impl;

import android.app.Activity;
import java.util.ArrayList;
import kotlin.collections.m;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.f;
import pdf.pdfreader.viewer.editor.free.fnbridge.a;
import tf.c;

/* compiled from: NativeItemClickApiImpl.kt */
/* loaded from: classes3.dex */
public final class NativeItemClickApiImpl implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final NativeItemClickApiImpl f25884a = new NativeItemClickApiImpl();

    /* renamed from: b  reason: collision with root package name */
    public static final c f25885b = kotlin.a.a(new cg.a<ArrayList<a>>() { // from class: pdf.pdfreader.viewer.editor.free.fnbridge.impl.NativeItemClickApiImpl$listeners$2
        @Override // cg.a
        public final ArrayList<a> invoke() {
            return new ArrayList<>();
        }
    });

    @Override // pdf.pdfreader.viewer.editor.free.fnbridge.a
    public final void k() {
        for (a aVar : (ArrayList) f25885b.getValue()) {
            aVar.k();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.fnbridge.a
    public final void n() {
        a aVar = (a) m.y0((ArrayList) f25885b.getValue());
        if (aVar != null) {
            aVar.n();
            return;
        }
        Activity l10 = ReaderPdfApplication.l();
        if (l10 != null) {
            ea.a.p("UGVMQwByIGUmdCdjQGkhaUx5eik=", "gJ78uRyO");
            f.m().n(l10, null);
        }
    }
}
