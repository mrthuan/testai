package g4;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import g4.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import p4.j;
import v3.l;

/* compiled from: ByteBufferGifDecoder.java */
/* loaded from: classes.dex */
public final class a implements t3.f<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    public static final C0231a f17621f = new C0231a();

    /* renamed from: g  reason: collision with root package name */
    public static final b f17622g = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Context f17623a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ImageHeaderParser> f17624b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final C0231a f17625d;

    /* renamed from: e  reason: collision with root package name */
    public final g4.b f17626e;

    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: g4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0231a {
    }

    /* compiled from: ByteBufferGifDecoder.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque f17627a;

        public b() {
            char[] cArr = j.f23703a;
            this.f17627a = new ArrayDeque(0);
        }

        public final synchronized void a(s3.d dVar) {
            dVar.f29728b = null;
            dVar.c = null;
            this.f17627a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, w3.c cVar, w3.b bVar) {
        C0231a c0231a = f17621f;
        this.f17623a = context.getApplicationContext();
        this.f17624b = list;
        this.f17625d = c0231a;
        this.f17626e = new g4.b(cVar, bVar);
        this.c = f17622g;
    }

    @Override // t3.f
    public final boolean a(ByteBuffer byteBuffer, t3.e eVar) {
        ImageHeaderParser.ImageType imageType;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (((Boolean) eVar.c(h.f17664b)).booleanValue()) {
            return false;
        }
        if (byteBuffer2 == null) {
            imageType = ImageHeaderParser.ImageType.UNKNOWN;
        } else {
            List<ImageHeaderParser> list = this.f17624b;
            int size = list.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    ImageHeaderParser.ImageType a10 = list.get(i10).a(byteBuffer2);
                    if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                        imageType = a10;
                        break;
                    }
                    i10++;
                } else {
                    imageType = ImageHeaderParser.ImageType.UNKNOWN;
                    break;
                }
            }
        }
        if (imageType != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }

    @Override // t3.f
    public final l<c> b(ByteBuffer byteBuffer, int i10, int i11, t3.e eVar) {
        s3.d dVar;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.c;
        synchronized (bVar) {
            s3.d dVar2 = (s3.d) bVar.f17627a.poll();
            if (dVar2 == null) {
                dVar2 = new s3.d();
            }
            dVar = dVar2;
            dVar.f29728b = null;
            Arrays.fill(dVar.f29727a, (byte) 0);
            dVar.c = new s3.c();
            dVar.f29729d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            dVar.f29728b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f29728b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return c(byteBuffer2, i10, i11, dVar, eVar);
        } finally {
            this.c.a(dVar);
        }
    }

    public final d c(ByteBuffer byteBuffer, int i10, int i11, s3.d dVar, t3.e eVar) {
        Bitmap.Config config;
        int highestOneBit;
        int i12 = p4.f.f23697a;
        SystemClock.elapsedRealtimeNanos();
        try {
            s3.c b10 = dVar.b();
            if (b10.c > 0 && b10.f29718b == 0) {
                if (eVar.c(h.f17663a) == DecodeFormat.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int min = Math.min(b10.f29722g / i11, b10.f29721f / i10);
                if (min == 0) {
                    highestOneBit = 0;
                } else {
                    highestOneBit = Integer.highestOneBit(min);
                }
                int max = Math.max(1, highestOneBit);
                Log.isLoggable("BufferGifDecoder", 2);
                C0231a c0231a = this.f17625d;
                g4.b bVar = this.f17626e;
                c0231a.getClass();
                s3.e eVar2 = new s3.e(bVar, b10, byteBuffer, max);
                eVar2.h(config);
                eVar2.b();
                Bitmap a10 = eVar2.a();
                if (a10 == null) {
                    return null;
                }
                d dVar2 = new d(new c(new c.a(new f(com.bumptech.glide.b.b(this.f17623a), eVar2, i10, i11, b4.a.f5324b, a10))));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
                return dVar2;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
