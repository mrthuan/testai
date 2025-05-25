package c4;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import t3.d;

/* compiled from: VideoDecoder.java */
/* loaded from: classes.dex */
public final class y<T> implements t3.f<T, Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public static final t3.d<Long> f5554d = new t3.d<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e  reason: collision with root package name */
    public static final t3.d<Integer> f5555e = new t3.d<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f  reason: collision with root package name */
    public static final e f5556f = new e();

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f5557a;

    /* renamed from: b  reason: collision with root package name */
    public final w3.c f5558b;
    public final e c = f5556f;

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public class a implements d.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f5559a = ByteBuffer.allocate(8);

        @Override // t3.d.b
        public final void a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            Long l11 = l10;
            messageDigest.update(bArr);
            synchronized (this.f5559a) {
                this.f5559a.position(0);
                messageDigest.update(this.f5559a.putLong(l11.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public class b implements d.b<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f5560a = ByteBuffer.allocate(4);

        @Override // t3.d.b
        public final void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 != null) {
                messageDigest.update(bArr);
                synchronized (this.f5560a) {
                    this.f5560a.position(0);
                    messageDigest.update(this.f5560a.putInt(num2.intValue()).array());
                }
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static final class c implements f<AssetFileDescriptor> {
        @Override // c4.y.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static final class d implements f<ByteBuffer> {
        @Override // c4.y.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new z(byteBuffer));
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static class e {
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t4);
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static final class g implements f<ParcelFileDescriptor> {
        @Override // c4.y.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public y(w3.c cVar, f<T> fVar) {
        this.f5558b = cVar;
        this.f5557a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L57
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L57
            if (r14 == r0) goto L57
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f7042d
            if (r15 == r0) goto L57
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch: java.lang.Throwable -> L51
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L51
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch: java.lang.Throwable -> L51
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L51
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch: java.lang.Throwable -> L51
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L51
            r3 = 90
            if (r2 == r3) goto L36
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L39
        L36:
            r8 = r1
            r1 = r0
            r0 = r8
        L39:
            float r13 = r15.b(r0, r1, r13, r14)     // Catch: java.lang.Throwable -> L51
            float r14 = (float) r0     // Catch: java.lang.Throwable -> L51
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch: java.lang.Throwable -> L51
            float r14 = (float) r1     // Catch: java.lang.Throwable -> L51
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch: java.lang.Throwable -> L51
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = c4.x.a(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L51
            goto L58
        L51:
            java.lang.String r13 = "VideoDecoder"
            r14 = 3
            android.util.Log.isLoggable(r13, r14)
        L57:
            r13 = 0
        L58:
            if (r13 != 0) goto L5e
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L5e:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.y.c(android.media.MediaMetadataRetriever, long, int, int, int, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy):android.graphics.Bitmap");
    }

    @Override // t3.f
    public final boolean a(T t4, t3.e eVar) {
        return true;
    }

    @Override // t3.f
    public final v3.l<Bitmap> b(T t4, int i10, int i11, t3.e eVar) {
        long longValue = ((Long) eVar.c(f5554d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.d.c("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
        Integer num = (Integer) eVar.c(f5555e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) eVar.c(DownsampleStrategy.f7044f);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f7043e;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        this.c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                this.f5557a.a(mediaMetadataRetriever, t4);
                Bitmap c10 = c(mediaMetadataRetriever, longValue, num.intValue(), i10, i11, downsampleStrategy2);
                mediaMetadataRetriever.release();
                return c4.c.b(c10, this.f5558b);
            } catch (RuntimeException e10) {
                throw new IOException(e10);
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }
}
