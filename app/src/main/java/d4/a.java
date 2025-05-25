package d4;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferRewinder.java */
/* loaded from: classes.dex */
public final class a implements e<ByteBuffer> {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f16116a;

    /* compiled from: ByteBufferRewinder.java */
    /* renamed from: d4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0192a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f16116a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f16116a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
    }
}
