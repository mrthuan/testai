package pdf.pdfreader.viewer.editor.free.convert.opt;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import cg.l;
import cg.p;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.y;

/* compiled from: OptTaskWrapper.kt */
/* loaded from: classes3.dex */
public final class OptTaskWrapper implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24127a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f24128b;
    public final List<ul.b> c;

    /* renamed from: d  reason: collision with root package name */
    public final l<List<? extends ul.b>, tf.d> f24129d;

    /* renamed from: e  reason: collision with root package name */
    public y f24130e;

    /* renamed from: f  reason: collision with root package name */
    public String f24131f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f24132g;

    /* renamed from: h  reason: collision with root package name */
    public long f24133h;

    /* renamed from: i  reason: collision with root package name */
    public final b7.g f24134i;

    /* renamed from: j  reason: collision with root package name */
    public List<? extends ul.b> f24135j;

    public OptTaskWrapper(ImageAdjustActivity imageAdjustActivity, boolean z10, List list, l lVar) {
        ea.a.p("E28XdDV4dA==", "NDpyPu6q");
        kotlin.jvm.internal.g.e(list, ea.a.p("Wm0qZxZz", "zvb0944J"));
        ea.a.p("IG53aRdpRGg=", "T1scbscB");
        this.f24127a = imageAdjustActivity;
        this.f24128b = z10;
        this.c = list;
        this.f24129d = lVar;
        this.f24131f = "";
        this.f24132g = new Handler(Looper.getMainLooper());
        this.f24134i = new b7.g(this, 17);
    }

    @Override // pdf.pdfreader.viewer.editor.free.convert.opt.a
    public final void a(List<? extends ul.b> images) {
        kotlin.jvm.internal.g.e(images, "images");
        long currentTimeMillis = System.currentTimeMillis() - this.f24133h;
        int i10 = (currentTimeMillis > 500L ? 1 : (currentTimeMillis == 500L ? 0 : -1));
        Handler handler = this.f24132g;
        b7.g gVar = this.f24134i;
        if (i10 < 0) {
            this.f24135j = images;
            handler.postDelayed(gVar, ((long) OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM) - currentTimeMillis);
            return;
        }
        this.f24135j = images;
        handler.postDelayed(gVar, 100L);
    }

    @Override // pdf.pdfreader.viewer.editor.free.convert.opt.a
    public final void b(int i10, int i11) {
        y yVar = this.f24130e;
        if (yVar != null) {
            yVar.c(i10, i11);
        }
    }

    public final void d() {
        if (this.f24130e == null) {
            y yVar = new y(this.f24127a, this.f24128b, new p<Integer, Integer, String>() { // from class: pdf.pdfreader.viewer.editor.free.convert.opt.OptTaskWrapper$onStartOptImage$1
                {
                    super(2);
                }

                public final String invoke(int i10, int i11) {
                    if (TextUtils.isEmpty(OptTaskWrapper.this.f24131f)) {
                        String string = OptTaskWrapper.this.f24127a.getString(R.string.arg_res_0x7f1301aa);
                        kotlin.jvm.internal.g.d(string, ea.a.p("SAprIFMgQiBSIBQgSSB2IGQgEiBmICBvkoCfb0d0J25UKUEgUyBCIFIgFCBJIHYgZCASfQ==", "p95Nq1a3"));
                        return string;
                    }
                    return OptTaskWrapper.this.f24131f;
                }

                @Override // cg.p
                public /* bridge */ /* synthetic */ String invoke(Integer num, Integer num2) {
                    return invoke(num.intValue(), num2.intValue());
                }
            }, false, false, true);
            yVar.setOnDismissListener(new i());
            this.f24133h = System.currentTimeMillis();
            yVar.d(0, 100);
            this.f24130e = yVar;
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.convert.opt.a
    public final void c(ul.b bVar, Throwable th2) {
    }
}
