package v4;

import android.content.Context;
import be.a;
import java.io.File;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30633a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f30634b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f30635d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f30636e;

    public /* synthetic */ u(Context context, int i10, File file, nl.b bVar) {
        this.f30634b = context;
        this.c = i10;
        this.f30635d = file;
        this.f30636e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f30633a;
        int i11 = this.c;
        Context context = this.f30634b;
        Object obj = this.f30636e;
        Object obj2 = this.f30635d;
        switch (i10) {
            case 0:
                t this$0 = (t) obj2;
                String message = (String) obj;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                kotlin.jvm.internal.g.e(message, "$message");
                a.InterfaceC0036a interfaceC0036a = this$0.f30627g;
                String str = this$0.f30623b;
                if (interfaceC0036a != null) {
                    interfaceC0036a.a(context, new yd.a(str + ":onError, errorCode: " + i11 + ' ' + message, 0));
                }
                fe.a a10 = fe.a.a();
                a10.b(str + ":onError, errorCode: " + i11 + ' ' + message);
                return;
            default:
                File file = (File) obj2;
                pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
                kotlin.jvm.internal.g.e(file, ea.a.p("ZmYYbGU=", "I4BqJuVl"));
                yn.a aVar2 = yn.a.f32189o;
                kotlin.jvm.internal.g.d(context, ea.a.p("EHAabAdjN3QhbwhDW24jZUB0", "RCqjnVR4"));
                String name = file.getName();
                kotlin.jvm.internal.g.d(name, ea.a.p("VWknZV1uA21l", "Ze5FREzy"));
                aVar2.i0(context, i11, name, (nl.b) obj);
                return;
        }
    }

    public /* synthetic */ u(t tVar, Context context, int i10, String str) {
        this.f30635d = tVar;
        this.f30634b = context;
        this.c = i10;
        this.f30636e = str;
    }
}
