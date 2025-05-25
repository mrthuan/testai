package jl;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import jl.a;
import pdf.pdfreader.viewer.editor.free.utils.h1;

/* compiled from: BaseActivity.java */
/* loaded from: classes3.dex */
public final class b implements xn.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f19309a;

    public b(a aVar) {
        this.f19309a = aVar;
    }

    @Override // xn.b
    public final void a() {
        boolean isExternalStorageManager;
        boolean c = h1.c();
        a aVar = this.f19309a;
        if (c) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (!isExternalStorageManager) {
                try {
                    aVar.startActivityForResult(new Intent(ea.a.p("Um4vchxpBi4BZUB0AG4xc2pNc04HRwZfFlAVXxBMCF91SQdFIF8jQzFFZ1M2UBNSCUlhUw9PTg==", "WEQDQjX5"), Uri.parse(ea.a.p("P2FSaxhnUjoqZCwuBWQOclBhCmU3LhNpV3cKclplDGk7b0MuH3JSZQ==", "LLtd2oth"))), 100);
                    return;
                } catch (ActivityNotFoundException e10) {
                    dp.a.a().getClass();
                    dp.a.e(e10);
                    return;
                }
            }
        }
        a.d dVar = aVar.f19290d;
        if (dVar != null) {
            dVar.B(true);
        }
    }

    @Override // xn.b
    public final void b() {
        a.d dVar = this.f19309a.f19290d;
        if (dVar != null) {
            dVar.B(false);
        }
    }
}
