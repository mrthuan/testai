package ya;

import java.io.Writer;

/* compiled from: JsonDataEncoderBuilder.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f32098a;

    public d(e eVar) {
        this.f32098a = eVar;
    }

    public final void a(Object obj, Writer writer) {
        e eVar = this.f32098a;
        f fVar = new f(writer, eVar.f32103a, eVar.f32104b, eVar.c, eVar.f32105d);
        fVar.g(obj);
        fVar.i();
        fVar.f32108b.flush();
    }
}
