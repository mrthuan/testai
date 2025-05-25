package pdf.pdfreader.viewer.editor.free.feature.ocr.helper;

import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25079a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f25080b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f25081d;

    public /* synthetic */ e(int i10, Object obj, int i11, int i12) {
        this.f25079a = i12;
        this.f25081d = obj;
        this.f25080b = i10;
        this.c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11 = this.f25079a;
        Object obj = this.f25081d;
        switch (i11) {
            case 0:
                k kVar = (k) obj;
                kotlin.jvm.internal.g.e(kVar, ea.a.p("F2MqbB9iA2Nr", "T3c2F3za"));
                kVar.c();
                return;
            default:
                ReaderHomeActivity readerHomeActivity = (ReaderHomeActivity) obj;
                String str = ReaderHomeActivity.Y1;
                readerHomeActivity.getClass();
                int i12 = this.f25080b;
                if (i12 >= 0) {
                    readerHomeActivity.N2(i12);
                }
                if (i12 < 3 && (i10 = this.c) >= 0) {
                    try {
                        readerHomeActivity.M.M0(i12, i10);
                        return;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return;
                    }
                }
                return;
        }
    }
}
