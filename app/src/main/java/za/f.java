package za;

import com.google.firebase.encoders.EncodingException;

/* compiled from: ProtobufValueEncoderContext.java */
/* loaded from: classes2.dex */
public final class f implements wa.f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f32329a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f32330b = false;
    public wa.b c;

    /* renamed from: d  reason: collision with root package name */
    public final com.google.firebase.encoders.proto.b f32331d;

    public f(com.google.firebase.encoders.proto.b bVar) {
        this.f32331d = bVar;
    }

    @Override // wa.f
    public final wa.f d(String str) {
        if (!this.f32329a) {
            this.f32329a = true;
            this.f32331d.d(this.c, str, this.f32330b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // wa.f
    public final wa.f e(boolean z10) {
        if (!this.f32329a) {
            this.f32329a = true;
            this.f32331d.e(this.c, z10 ? 1 : 0, this.f32330b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }
}
