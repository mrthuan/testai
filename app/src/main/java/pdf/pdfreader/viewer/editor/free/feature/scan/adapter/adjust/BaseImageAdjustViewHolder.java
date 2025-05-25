package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust;

import android.content.Context;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.j0;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustFilterViewHolder;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.d;

/* compiled from: BaseImageAdjustViewHolder.kt */
/* loaded from: classes3.dex */
public interface BaseImageAdjustViewHolder {

    /* compiled from: BaseImageAdjustViewHolder.kt */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static Object a(Context context, Bitmap bitmap, ho.b bVar, c cVar) {
            return t0.w0(j0.f20206a, new BaseImageAdjustViewHolder$applyFilter$2(bVar, bitmap, context, null), cVar);
        }

        public static Object b(Context context, String str, ul.c cVar, Bitmap bitmap, c cVar2) {
            return t0.w0(j0.f20206a, new BaseImageAdjustViewHolder$cropBitmap$2(bitmap, cVar, context, str, null), cVar2);
        }

        public static Object c(Context context, String str, ul.c cVar, ul.c cVar2, c cVar3) {
            Object w02 = t0.w0(j0.f20206a, new BaseImageAdjustViewHolder$getAutoCropArea$2(context, str, cVar, cVar2, null), cVar3);
            if (w02 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return w02;
            }
            return d.f30009a;
        }

        public static Bitmap d(ul.b image, ul.c cVar) {
            Bitmap bitmap;
            g.e(image, "image");
            if (cVar.a()) {
                WeakReference<Bitmap> weakReference = image.f30413k;
                if (weakReference != null) {
                    bitmap = weakReference.get();
                } else {
                    bitmap = null;
                }
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
            } else {
                WeakReference<Bitmap> weakReference2 = image.f30414l;
                if (weakReference2 != null) {
                    bitmap = weakReference2.get();
                } else {
                    bitmap = null;
                }
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
            }
            return bitmap;
        }

        public static Object e(BaseImageAdjustViewHolder baseImageAdjustViewHolder, Context context, ul.b bVar, ul.c cVar, c<? super d> cVar2) {
            Object w02 = t0.w0(j0.f20207b, new BaseImageAdjustViewHolder$justFilterBitmap$2(baseImageAdjustViewHolder, context, bVar, cVar, null), cVar2);
            if (w02 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return w02;
            }
            return d.f30009a;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:3:0x000f, B:6:0x0017, B:21:0x0060, B:8:0x001d, B:10:0x0021, B:16:0x002d, B:18:0x0047, B:20:0x005a, B:19:0x0051), top: B:26:0x000f }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void f(android.content.Context r5, ul.b r6, ul.c r7) {
            /*
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g.e(r5, r0)
                java.lang.String r0 = "image"
                kotlin.jvm.internal.g.e(r6, r0)
                java.lang.String r0 = "imageConfig"
                kotlin.jvm.internal.g.e(r7, r0)
                ho.b r7 = r7.c     // Catch: java.lang.Throwable -> L66
                boolean r7 = r7 instanceof ho.a     // Catch: java.lang.Throwable -> L66
                ul.c r0 = r6.f30419q
                if (r7 != 0) goto L1d
                ho.b r7 = r0.c     // Catch: java.lang.Throwable -> L66
                boolean r7 = r7 instanceof ho.a     // Catch: java.lang.Throwable -> L66
                if (r7 == 0) goto L60
            L1d:
                java.lang.String r7 = r6.f30404a     // Catch: java.lang.Throwable -> L66
                if (r7 == 0) goto L2a
                int r7 = r7.length()     // Catch: java.lang.Throwable -> L66
                if (r7 != 0) goto L28
                goto L2a
            L28:
                r7 = 0
                goto L2b
            L2a:
                r7 = 1
            L2b:
                if (r7 != 0) goto L60
                ln.a r7 = new ln.a     // Catch: java.lang.Throwable -> L66
                r7.<init>(r5)     // Catch: java.lang.Throwable -> L66
                java.lang.String r1 = r6.f30404a     // Catch: java.lang.Throwable -> L66
                java.lang.String r2 = "image.filePath"
                kotlin.jvm.internal.g.d(r1, r2)     // Catch: java.lang.Throwable -> L66
                float r7 = r7.a(r1)     // Catch: java.lang.Throwable -> L66
                double r1 = (double) r7     // Catch: java.lang.Throwable -> L66
                r3 = 4596373779694328218(0x3fc999999999999a, double:0.2)
                int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r7 >= 0) goto L51
                io.d r7 = new io.d     // Catch: java.lang.Throwable -> L66
                r7.<init>(r5)     // Catch: java.lang.Throwable -> L66
                r0.c = r7     // Catch: java.lang.Throwable -> L66
                java.lang.String r5 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a     // Catch: java.lang.Throwable -> L66
                goto L5a
            L51:
                io.e r7 = new io.e     // Catch: java.lang.Throwable -> L66
                r7.<init>(r5)     // Catch: java.lang.Throwable -> L66
                r0.c = r7     // Catch: java.lang.Throwable -> L66
                java.lang.String r5 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a     // Catch: java.lang.Throwable -> L66
            L5a:
                ul.c r5 = r6.f30420r     // Catch: java.lang.Throwable -> L66
                ho.b r6 = r0.c     // Catch: java.lang.Throwable -> L66
                r5.c = r6     // Catch: java.lang.Throwable -> L66
            L60:
                tf.d r5 = tf.d.f30009a     // Catch: java.lang.Throwable -> L66
                kotlin.Result.m13constructorimpl(r5)     // Catch: java.lang.Throwable -> L66
                goto L6e
            L66:
                r5 = move-exception
                kotlin.Result$Failure r5 = androidx.activity.s.v(r5)
                kotlin.Result.m13constructorimpl(r5)
            L6e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder.DefaultImpls.f(android.content.Context, ul.b, ul.c):void");
        }

        public static Object g(BaseImageAdjustViewHolder baseImageAdjustViewHolder, Context context, ul.b bVar, ul.c cVar, boolean z10, c<? super Bitmap> cVar2) {
            return t0.w0(j0.f20207b, new BaseImageAdjustViewHolder$makeOriginBitmap$2(baseImageAdjustViewHolder, context, bVar, cVar, z10, null), cVar2);
        }

        public static Object h(ul.b bVar, Context context, int i10, int i11, BaseImageAdjustViewHolder baseImageAdjustViewHolder, ul.c cVar, boolean z10, c cVar2) {
            return t0.w0(j0.f20207b, new BaseImageAdjustViewHolder$makeOriginBitmap$4(bVar, context, i10, i11, baseImageAdjustViewHolder, cVar, z10, null), cVar2);
        }

        public static Object j(ImageAdjustFilterViewHolder imageAdjustFilterViewHolder, Context context, ul.b bVar, ul.c cVar, c cVar2) {
            return t0.w0(j0.f20207b, new BaseImageAdjustViewHolder$makeOriginBitmapWithoutFilter$2(imageAdjustFilterViewHolder, context, bVar, cVar, false, null), cVar2);
        }

        public static Object k(ul.b bVar, Context context, int i10, int i11, BaseImageAdjustViewHolder baseImageAdjustViewHolder, ul.c cVar, c cVar2) {
            return t0.w0(j0.f20207b, new BaseImageAdjustViewHolder$makeOriginBitmapWithoutFilter$4(bVar, context, i10, i11, baseImageAdjustViewHolder, cVar, null), cVar2);
        }

        public static void l(BaseImageAdjustViewHolder baseImageAdjustViewHolder, ul.b image, ImageAdjustPayload payload) {
            g.e(image, "image");
            g.e(payload, "payload");
            baseImageAdjustViewHolder.a(image);
        }

        public static void m(ul.b image, ul.c cVar, Bitmap bitmap) {
            g.e(image, "image");
            g.e(bitmap, "bitmap");
            if (cVar.a()) {
                image.f30413k = new WeakReference<>(bitmap);
            } else {
                image.f30414l = new WeakReference<>(bitmap);
            }
        }
    }

    void a(ul.b bVar);

    Object c(Context context, ul.b bVar, ul.c cVar, boolean z10, c<? super Bitmap> cVar2);

    Object e(Context context, ul.b bVar, ul.c cVar, c<? super d> cVar2);

    Object f(Context context, String str, ul.c cVar, ul.c cVar2, Bitmap bitmap, c<? super d> cVar3);

    void h(ul.b bVar, ImageAdjustPayload imageAdjustPayload);

    Object i(Context context, ul.b bVar, int i10, int i11, ul.c cVar, boolean z10, c<? super Bitmap> cVar2);

    Object j(Context context, ul.b bVar, int i10, int i11, ul.c cVar, boolean z10, c<? super Bitmap> cVar2);

    void k(Context context, ul.b bVar, ul.c cVar);
}
