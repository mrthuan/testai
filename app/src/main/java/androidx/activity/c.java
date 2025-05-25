package androidx.activity;

import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1801a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f1802b;

    public /* synthetic */ c(ComponentActivity componentActivity, int i10) {
        this.f1801a = i10;
        this.f1802b = componentActivity;
    }

    @Override // cg.a
    public final Object invoke() {
        int i10 = this.f1801a;
        ComponentActivity componentActivity = this.f1802b;
        switch (i10) {
            case 0:
                return ComponentActivity.r1(componentActivity);
            default:
                ((ReaderPreviewActivity) componentActivity).O5 = true;
                return null;
        }
    }
}
