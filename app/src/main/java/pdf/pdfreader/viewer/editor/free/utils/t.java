package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Context;
import java.io.File;

/* compiled from: FileUtils.java */
/* loaded from: classes3.dex */
public final class t implements u0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f28767a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f28768b;

    public t(jl.a aVar, Context context) {
        this.f28767a = aVar;
        this.f28768b = context;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.u0
    public final void a(File file) {
        v.F(this.f28767a, this.f28768b, file);
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.u0
    public final void onStart() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.u0
    public final void onProgress(int i10, int i11) {
    }
}
