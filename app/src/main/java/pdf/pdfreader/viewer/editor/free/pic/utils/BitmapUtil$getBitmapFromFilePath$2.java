package pdf.pdfreader.viewer.editor.free.pic.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import androidx.activity.s;
import cg.p;
import com.bumptech.glide.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.w;
import o4.d;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BitmapUtil.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.pic.utils.BitmapUtil$getBitmapFromFilePath$2", f = "BitmapUtil.kt", l = {292}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BitmapUtil$getBitmapFromFilePath$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super Bitmap>, Object> {
    final /* synthetic */ Integer $bitmapHeight;
    final /* synthetic */ Integer $bitmapWidth;
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $isFirstTry;
    final /* synthetic */ d $objectKey;
    final /* synthetic */ String $this_getBitmapFromFilePath;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapUtil$getBitmapFromFilePath$2(Integer num, Integer num2, Context context, String str, d dVar, boolean z10, kotlin.coroutines.c<? super BitmapUtil$getBitmapFromFilePath$2> cVar) {
        super(2, cVar);
        this.$bitmapWidth = num;
        this.$bitmapHeight = num2;
        this.$context = context;
        this.$this_getBitmapFromFilePath = str;
        this.$objectKey = dVar;
        this.$isFirstTry = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BitmapUtil$getBitmapFromFilePath$2(this.$bitmapWidth, this.$bitmapHeight, this.$context, this.$this_getBitmapFromFilePath, this.$objectKey, this.$isFirstTry, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        Integer num;
        int intValue;
        int i10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            try {
                Integer num2 = this.$bitmapWidth;
                if (num2 == null || this.$bitmapHeight == null || num2.intValue() == 0 || ((num = this.$bitmapHeight) != null && num.intValue() == 0)) {
                    Integer num3 = this.$bitmapWidth;
                    if (num3 != null && num3.intValue() != 0) {
                        Size a10 = c.a(this.$context, this.$this_getBitmapFromFilePath);
                        int intValue2 = (int) (((this.$bitmapWidth.intValue() * 1.0f) * a10.getHeight()) / a10.getWidth());
                        if (this.$objectKey == null) {
                            e<Bitmap> a11 = com.bumptech.glide.b.f(this.$context).a();
                            a11.F = this.$this_getBitmapFromFilePath;
                            a11.I = true;
                            bitmap = (Bitmap) a11.d().J(this.$bitmapWidth.intValue(), intValue2).get();
                        } else {
                            e<Bitmap> a12 = com.bumptech.glide.b.f(this.$context).a();
                            a12.F = this.$this_getBitmapFromFilePath;
                            a12.I = true;
                            bitmap = (Bitmap) a12.u(this.$objectKey).d().J(this.$bitmapWidth.intValue(), intValue2).get();
                        }
                    } else {
                        Integer num4 = this.$bitmapHeight;
                        if (num4 != null && num4.intValue() != 0) {
                            Size a13 = c.a(this.$context, this.$this_getBitmapFromFilePath);
                            int intValue3 = (int) (((this.$bitmapHeight.intValue() * 1.0f) * a13.getWidth()) / a13.getHeight());
                            if (this.$objectKey == null) {
                                e<Bitmap> a14 = com.bumptech.glide.b.f(this.$context).a();
                                a14.F = this.$this_getBitmapFromFilePath;
                                a14.I = true;
                                bitmap = (Bitmap) a14.d().J(intValue3, this.$bitmapHeight.intValue()).get();
                            } else {
                                e<Bitmap> a15 = com.bumptech.glide.b.f(this.$context).a();
                                a15.F = this.$this_getBitmapFromFilePath;
                                a15.I = true;
                                bitmap = (Bitmap) a15.u(this.$objectKey).d().J(intValue3, this.$bitmapHeight.intValue()).get();
                            }
                        } else {
                            Size a16 = c.a(this.$context, this.$this_getBitmapFromFilePath);
                            float width = (a16.getWidth() * 1.0f) / a16.getHeight();
                            if (a16.getWidth() > 4320 || a16.getHeight() > 4320) {
                                if (a16.getWidth() > a16.getHeight()) {
                                    a16 = new Size(4320, (int) (4320 / width));
                                } else {
                                    a16 = new Size((int) (4320 * width), 4320);
                                }
                            }
                            if (this.$objectKey == null) {
                                e<Bitmap> a17 = com.bumptech.glide.b.f(this.$context).a();
                                a17.F = this.$this_getBitmapFromFilePath;
                                a17.I = true;
                                bitmap = (Bitmap) a17.J(a16.getWidth(), a16.getHeight()).get();
                            } else {
                                e<Bitmap> a18 = com.bumptech.glide.b.f(this.$context).a();
                                a18.F = this.$this_getBitmapFromFilePath;
                                a18.I = true;
                                bitmap = (Bitmap) a18.u(this.$objectKey).J(a16.getWidth(), a16.getHeight()).get();
                            }
                        }
                    }
                    g.d(bitmap, "if (bitmapWidth != null …ight).get()\n            }");
                    return bitmap;
                }
                Size a19 = c.a(this.$context, this.$this_getBitmapFromFilePath);
                float width2 = (a19.getWidth() * 1.0f) / a19.getHeight();
                a19.getWidth();
                a19.getHeight();
                if (width2 > (this.$bitmapWidth.intValue() * 1.0f) / this.$bitmapHeight.intValue()) {
                    i10 = a19.getWidth();
                    int intValue4 = this.$bitmapWidth.intValue();
                    if (i10 > intValue4) {
                        i10 = intValue4;
                    }
                    intValue = (int) (i10 / width2);
                } else {
                    int height = a19.getHeight();
                    intValue = this.$bitmapHeight.intValue();
                    if (height <= intValue) {
                        intValue = height;
                    }
                    i10 = (int) (intValue * width2);
                }
                if (this.$objectKey == null) {
                    e<Bitmap> a20 = com.bumptech.glide.b.f(this.$context).a();
                    a20.F = this.$this_getBitmapFromFilePath;
                    a20.I = true;
                    bitmap = (Bitmap) a20.d().J(i10, intValue).get();
                } else {
                    e<Bitmap> a21 = com.bumptech.glide.b.f(this.$context).a();
                    a21.F = this.$this_getBitmapFromFilePath;
                    a21.I = true;
                    bitmap = (Bitmap) a21.u(this.$objectKey).d().J(i10, intValue).get();
                }
                g.d(bitmap, "if (bitmapWidth != null …ight).get()\n            }");
                return bitmap;
            } catch (Throwable unused) {
                if (this.$isFirstTry) {
                    String str = this.$this_getBitmapFromFilePath;
                    Context context = this.$context;
                    Integer num5 = this.$bitmapWidth;
                    Integer num6 = this.$bitmapHeight;
                    d dVar = this.$objectKey;
                    this.label = 1;
                    obj = t0.w0(j0.f20207b, new BitmapUtil$getBitmapFromFilePath$2(num5, num6, context, str, dVar, false, null), this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(24, 24, Bitmap.Config.ARGB_8888);
                    g.d(createBitmap, "createBitmap(24, 24, Bitmap.Config.ARGB_8888)");
                    return createBitmap;
                }
            }
        }
        return obj;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super Bitmap> cVar) {
        return ((BitmapUtil$getBitmapFromFilePath$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
