package de;

import com.google.android.gms.tasks.OnFailureListener;
import de.d;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: RemoteConfig.java */
/* loaded from: classes.dex */
public final class c implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.a f16197a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f16198b;

    public c(d dVar, ReaderPdfApplication.b bVar) {
        this.f16198b = dVar;
        this.f16197a = bVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        d.a aVar = this.f16197a;
        if (aVar != null) {
            ((ReaderPdfApplication.b) aVar).a(false);
        }
        this.f16198b.f16201b = false;
    }
}
