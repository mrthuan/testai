package cn;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.g;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: Pdf2ImageThumbHelper.kt */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f5754a;

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f5755b;
    public static ExecutorService c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f5756d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f5757e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f5758f;

    /* renamed from: g  reason: collision with root package name */
    public static final int f5759g;

    /* renamed from: h  reason: collision with root package name */
    public static final int f5760h;

    static {
        ea.a.p("H2RXMjBtVmc_VCJ1GGIgZVlwC3I=", "w1ZUVUPA");
        f5754a = new e();
        f5755b = new Handler(Looper.getMainLooper());
        f5756d = 4.0f;
        f5757e = 2480;
        f5758f = 3507;
        f5759g = 50;
        f5760h = 50;
    }

    public static void a(ImageView imageView, dn.b bVar, bn.a aVar, Ref$ObjectRef ref$ObjectRef, boolean z10) {
        g.e(imageView, ea.a.p("F2kmYRRlNGkXdw==", "avLB7zve"));
        g.e(bVar, ea.a.p("F2wicwdlDGVy", "Dq9SOzYj"));
        g.e(aVar, ea.a.p("a2lcYR5l", "cvpYj8si"));
        g.e(ref$ObjectRef, ea.a.p("ZnQrdRtiKWEvZSluV2U=", "fTBCvyqy"));
        try {
            if (imageView.getContext() instanceof Activity) {
                Context context = imageView.getContext();
                g.c(context, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuW25jbkZsPyBHeTtlU2EMZABvXWRHYSZwakFRdC92KnR5", "4N3Sj5MS"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b((Activity) context)) {
                    return;
                }
            }
            bVar.h(aVar, (Bitmap) ref$ObjectRef.element, z10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap != null) {
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                g.d(createBitmap, ea.a.p("EnIkYR1lAWk8bQdwHHc-ZExofiAhZV9nloDXIBNpNm0QcG9DBm4laS8uJ1JzQgg4ADhqKQ==", "7tqAiCld"));
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                int i10 = f5757e;
                int i11 = (f5759g * width) / i10;
                int i12 = (f5760h * height) / f5758f;
                float f10 = (width * f5756d) / i10;
                f5754a.getClass();
                Bitmap d10 = d(context, f10);
                if (d10 != null) {
                    d10.getWidth();
                    d10.getHeight();
                    canvas.drawBitmap(d10, (width - d10.getWidth()) - i11, (height - d10.getHeight()) - i12, (Paint) null);
                }
                bitmap.recycle();
                if (d10 != null) {
                    d10.recycle();
                }
                return createBitmap;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static String c(Context context) {
        Locale locale;
        LocaleList locales;
        String string = context.getString(R.string.arg_res_0x7f130227);
        if (Build.VERSION.SDK_INT >= 24) {
            locales = context.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
        } else {
            locale = context.getResources().getConfiguration().locale;
        }
        return a0.a.h("PDFReader_Convert_", new SimpleDateFormat(string, locale).format(Long.valueOf(System.currentTimeMillis())));
    }

    public static Bitmap d(Context context, float f10) {
        if (context == null) {
            return null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_watermark, (ViewGroup) null, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.ivWatermark);
        TextView textView = (TextView) inflate.findViewById(R.id.tvWatermark);
        textView.setText(ea.a.p("cmwnICNEJCAgZVVkDHIg", "YZ1BgfHS"));
        inflate.setLayoutDirection(0);
        textView.setTextSize(0, context.getResources().getDimension(R.dimen.sp_9) * f10);
        if (imageView != null) {
            ea.a.p("JnZmYQ1lRW07cms=", "RdYNYyiG");
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                int dimensionPixelSize = (int) (context.getResources().getDimensionPixelSize(R.dimen.dp_10) * f10);
                layoutParams2.width = dimensionPixelSize;
                layoutParams2.height = dimensionPixelSize;
                imageView.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException(ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuHG5jbidsKCA7eUFlWWFZZChvI2RbdwFkUmUaLglpC2UScgJhK28xdGFMUHkWdUNQO3IrbXM=", "GbZFsNRD"));
            }
        }
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = inflate.getMeasuredWidth();
        int measuredHeight = inflate.getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            measuredWidth = context.getResources().getDimensionPixelSize(R.dimen.dp_86);
            measuredHeight = context.getResources().getDimensionPixelSize(R.dimen.dp_20);
        }
        inflate.layout(0, 0, measuredWidth, measuredHeight);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        g.d(createBitmap, ea.a.p("LHJUYQ1ldWkubStwXXcBZEFoQiAtZQxnhID_IHFpE20ucB9DFm5RaT0uC1IyQjc4DThWKQ==", "EVghfY3g"));
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        inflate.draw(canvas);
        return createBitmap;
    }

    public static Future e(String str, boolean z10, bn.a aVar, int i10, int i11, ImageView imageView, ReaderPDFCore readerPDFCore, dn.b bVar) {
        g.e(imageView, "imageView");
        return f(str, z10, aVar, i10, i11, imageView, readerPDFCore, true, bVar);
    }

    public static Future f(String str, final boolean z10, final bn.a aVar, final int i10, final int i11, final ImageView imageView, final ReaderPDFCore readerPDFCore, boolean z11, final dn.b bVar) {
        Future<?> submit;
        g.e(imageView, "imageView");
        if (c == null) {
            try {
                ge.a z12 = ge.a.z();
                Context context = imageView.getContext();
                z12.getClass();
                c = Executors.newFixedThreadPool(ge.a.B(context)[1]);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (z11) {
            imageView.setImageBitmap(null);
        }
        int i12 = aVar.f5491e;
        imageView.setTag(str + "_" + i12);
        ExecutorService executorService = c;
        if (executorService == null || (submit = executorService.submit(new Runnable() { // from class: cn.c

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ int f5745d = 1560;

            /* JADX WARN: Type inference failed for: r0v5, types: [T, android.graphics.Bitmap] */
            /* JADX WARN: Type inference failed for: r0v8, types: [T, android.graphics.Bitmap] */
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable;
                int i13 = i10;
                int i14 = i11;
                int i15 = this.f5745d;
                final boolean z13 = z10;
                Handler handler = e.f5755b;
                String p10 = ea.a.p("a2lcYR5l", "VUn1EvMQ");
                final bn.a aVar2 = aVar;
                g.e(aVar2, p10);
                String p11 = ea.a.p("a2lcYR5lYWk_dw==", "roJebgri");
                final ImageView imageView2 = imageView;
                g.e(imageView2, p11);
                String p12 = ea.a.p("F2wicwdlDGVy", "zz0xmuo8");
                final dn.b bVar2 = bVar;
                g.e(bVar2, p12);
                ReaderPDFCore readerPDFCore2 = ReaderPDFCore.this;
                if (readerPDFCore2 != null) {
                    final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    try {
                        try {
                            ref$ObjectRef.element = readerPDFCore2.thumbPageOnce(i13, i14, i15, aVar2.f5491e);
                            if (z13) {
                                e eVar = e.f5754a;
                                Context context2 = imageView2.getContext();
                                g.d(context2, ea.a.p("G200ZylWI2U_LgVvWnQyeHQ=", "KXrULJB9"));
                                eVar.getClass();
                                ref$ObjectRef.element = e.b(context2, (Bitmap) ref$ObjectRef.element);
                            }
                            runnable = new Runnable() { // from class: cn.d
                                @Override // java.lang.Runnable
                                public final void run() {
                                    e.a(imageView2, bVar2, aVar2, ref$ObjectRef, z13);
                                }
                            };
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            runnable = new Runnable() { // from class: cn.d
                                @Override // java.lang.Runnable
                                public final void run() {
                                    e.a(imageView2, bVar2, aVar2, ref$ObjectRef, z13);
                                }
                            };
                        }
                        handler.post(runnable);
                    } catch (Throwable th2) {
                        handler.post(new Runnable() { // from class: cn.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                e.a(imageView2, bVar2, aVar2, ref$ObjectRef, z13);
                            }
                        });
                        throw th2;
                    }
                }
            }
        })) == null) {
            return null;
        }
        return submit;
    }
}
