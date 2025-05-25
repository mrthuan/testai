package qb;

import android.content.Context;
import android.view.View;
import com.inmobi.media.AbstractC1855w9;
import java.util.Map;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29224a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f29225b;
    public final /* synthetic */ Context c;

    public /* synthetic */ i1(Context context, boolean z10, int i10) {
        this.f29224a = i10;
        this.c = context;
        this.f29225b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29224a;
        boolean z10 = this.f29225b;
        Context context = this.c;
        switch (i10) {
            case 0:
                AbstractC1855w9.a(context, z10);
                return;
            default:
                ReaderPreviewActivity.b0 b0Var = ((ReaderPreviewActivity) context).f26276w1;
                if (b0Var != null) {
                    for (Map.Entry<ij.d, View> entry : b0Var.f21384d.entrySet()) {
                        if (entry.getKey().f18533a) {
                            View value = entry.getValue();
                            if (value instanceof lib.zj.pdfeditor.a0) {
                                lib.zj.pdfeditor.a0 a0Var = (lib.zj.pdfeditor.a0) value;
                                a0Var.j(z10);
                                a0Var.D();
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }
}
