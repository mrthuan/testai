package qb;

import com.inmobi.media.P;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIDataBase;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29190a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ cg.a f29191b;

    public /* synthetic */ f(cg.a aVar, int i10) {
        this.f29190a = i10;
        this.f29191b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29190a;
        cg.a aVar = this.f29191b;
        switch (i10) {
            case 0:
                P.b(aVar);
                return;
            case 1:
                AIDataBase aIDataBase = km.e.f19907a;
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            default:
                kotlin.jvm.internal.g.e(aVar, ea.a.p("F3I-bh1hAGxl", "VMVGO0tc"));
                aVar.invoke();
                return;
        }
    }
}
