package de;

import com.google.android.gms.tasks.OnSuccessListener;
import de.d;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: RemoteConfig.java */
/* loaded from: classes.dex */
public final class b implements OnSuccessListener<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.a f16195a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f16196b;

    public b(d dVar, ReaderPdfApplication.b bVar) {
        this.f16196b = dVar;
        this.f16195a = bVar;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Boolean bool) {
        d.f16199d = System.currentTimeMillis();
        d.a aVar = this.f16195a;
        if (aVar != null) {
            ((ReaderPdfApplication.b) aVar).a(true);
        }
        this.f16196b.f16201b = false;
    }
}
