package pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh;

import am.b2;
import am.c3;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import androidx.appcompat.widget.AppCompatImageView;
import cg.l;
import com.airbnb.lottie.LottieAnimationView;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import kotlin.collections.m;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.x;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIAnswerContent;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ImageMindPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIAnswerView;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.utils.event.AIEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import rk.c;
import vk.f;

/* compiled from: AIChatAnswerViewHolder.kt */
/* loaded from: classes3.dex */
public final class b extends g<km.a, c3> {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f24708m = 0;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f24709d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f24710e;

    /* renamed from: f  reason: collision with root package name */
    public cg.a<tf.d> f24711f;

    /* renamed from: g  reason: collision with root package name */
    public l<? super km.a, tf.d> f24712g;

    /* renamed from: h  reason: collision with root package name */
    public l<? super km.a, tf.d> f24713h;

    /* renamed from: i  reason: collision with root package name */
    public l<? super String, tf.d> f24714i;

    /* renamed from: j  reason: collision with root package name */
    public l<? super km.a, tf.d> f24715j;

    /* renamed from: k  reason: collision with root package name */
    public cg.a<tf.d> f24716k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f24717l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c3 c3Var, boolean z10) {
        super(c3Var);
        ea.a.p("UWklZBpuZw==", "a7lAgC8M");
        this.f24709d = z10;
        this.f24717l = true;
    }

    public static String m(String str, Spanned spanned, int i10) {
        if (i10 == -1) {
            return new vk.f(new f.b()).a(new rk.c(new c.a()).a(str));
        } else if (spanned != null) {
            int length = str.length();
            int i11 = length;
            while (i10 <= length) {
                i11 = (i10 + length) / 2;
                jf.f fVar = pdf.pdfreader.viewer.editor.free.feature.ai.typing.c.f24352a;
                String substring = str.substring(0, i11);
                kotlin.jvm.internal.g.d(substring, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtno4DWaTZnbXM7YUN0MG5TZSIsamUbZCFuUWUWKQ==", "EE2OApXE"));
                SpannableStringBuilder J = fVar.J(substring);
                ea.a.p("G3lBaRdnfW84TStuFGcNchttD3IudwpuqYDBbnRzM2I8dENpF2cfMHYgL24RSQZkUHhHKQ==", "RrNLKgZF");
                if (J.length() == spanned.length()) {
                    break;
                } else if (J.length() < spanned.length()) {
                    i10 = i11 + 1;
                } else {
                    length = i11 - 1;
                }
            }
            String substring2 = str.substring(0, i11);
            kotlin.jvm.internal.g.d(substring2, ea.a.p("I2gYc3RhFSAiYRBhGmw2bl8uAXQ7aVhnloDXaT9nanMjYQN0HW4CZTAsRmVaZB5uXGUqKQ==", "sUWqTfyV"));
            return new vk.f(new f.b()).a(new rk.c(new c.a()).a(substring2));
        } else {
            return null;
        }
    }

    public static File n(Context context, String str, String str2) {
        BufferedWriter bufferedWriter;
        kotlin.jvm.internal.g.e(context, "context");
        String C = kotlin.text.f.C("\n        <!DOCTYPE html>\n        <html>\n        <head>\n            <meta charset=\"UTF-8\">\n            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n        </head>\n        <body>\n            " + str + "\n        </body>\n        </html>\n    ");
        File file = new File(context.getCacheDir(), str2.concat(".html"));
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, kotlin.text.a.f19966b);
            if (outputStreamWriter instanceof BufferedWriter) {
                bufferedWriter = (BufferedWriter) outputStreamWriter;
            } else {
                bufferedWriter = new BufferedWriter(outputStreamWriter, 8192);
            }
            bufferedWriter.write(C);
            tf.d dVar = tf.d.f30009a;
            o9.d.l(bufferedWriter, null);
            o9.d.l(fileOutputStream, null);
            return file;
        } finally {
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g
    public final void l(int i10, km.a aVar) {
        boolean z10;
        tf.d dVar;
        final km.a aVar2 = aVar;
        int i11 = aVar2.A;
        if (1 <= i11 && i11 < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        V v10 = this.f24704b;
        if (z10) {
            c3 c3Var = (c3) v10;
            c3Var.c.setVisibility(0);
            c3Var.c.setText(this.c.getString(R.string.arg_res_0x7f1302f9, aVar2.A + "%"));
        } else {
            ((c3) v10).c.setVisibility(8);
        }
        final AIAnswerView aIAnswerView = ((c3) v10).f799b;
        if (aVar2.f19894x == 400) {
            b2 b2Var = (b2) aIAnswerView.f24761a;
            if (b2Var != null) {
                b2Var.f750b.setVisibility(8);
                LottieAnimationView lottieAnimationView = b2Var.f761n;
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.j();
                b2Var.f754g.setVisibility(8);
                b2Var.f758k.setVisibility(8);
                b2Var.f759l.setVisibility(8);
                b2Var.f762o.setVisibility(8);
                b2Var.f763p.setVisibility(8);
                AppCompatImageView appCompatImageView = b2Var.f755h;
                appCompatImageView.setVisibility(8);
                appCompatImageView.setImageResource(0);
                return;
            }
            return;
        }
        aIAnswerView.setOnAIAnswerListener(new AIAnswerView.a() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.AIChatAnswerViewHolder$onBindView$1$1
            @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIAnswerView.a
            public final void a() {
                l<? super km.a, tf.d> lVar = b.this.f24713h;
                if (lVar != null) {
                    lVar.invoke(aVar2);
                }
            }

            @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIAnswerView.a
            public final void b() {
                AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                String p10 = ea.a.p("QGgqcmU=", "8m5MY7Gn");
                aIEventCenter.getClass();
                AIEventCenter.e(p10);
                km.a aVar3 = aVar2;
                ArrayList arrayList = aVar3.f19893w;
                kotlin.jvm.internal.g.d(arrayList, ea.a.p("JnRUbVdhWXMtZThDGm4cZVt0", "UIOLvFVE"));
                AIAnswerContent aIAnswerContent = (AIAnswerContent) m.t0(aVar3.f19892v - 1, arrayList);
                if (aIAnswerContent != null) {
                    int type = aIAnswerContent.getType();
                    String str = null;
                    final b bVar = b.this;
                    if (type == 2) {
                        if (!bVar.f24717l) {
                            return;
                        }
                        bVar.f24717l = false;
                        ArrayList arrayList2 = aVar3.f19893w;
                        kotlin.jvm.internal.g.d(arrayList2, ea.a.p("HHRcbWFhFHM_ZRRDW24jZVZ0", "NQu9Oztc"));
                        AIAnswerContent aIAnswerContent2 = (AIAnswerContent) m.t0(aVar3.f19892v - 1, arrayList2);
                        if (aIAnswerContent2 != null) {
                            str = aIAnswerContent2.getContent();
                        }
                        cg.a<tf.d> aVar4 = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.AIChatAnswerViewHolder$onBindView$1$1$clickShare$1$1
                            {
                                super(0);
                            }

                            @Override // cg.a
                            public /* bridge */ /* synthetic */ tf.d invoke() {
                                invoke2();
                                return tf.d.f30009a;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                b.this.f24717l = true;
                            }
                        };
                        cg.a<tf.d> aVar5 = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.AIChatAnswerViewHolder$onBindView$1$1$clickShare$1$2
                            {
                                super(0);
                            }

                            @Override // cg.a
                            public /* bridge */ /* synthetic */ tf.d invoke() {
                                invoke2();
                                return tf.d.f30009a;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                w0.c cVar = w0.a().f28791b;
                                final b bVar2 = b.this;
                                cVar.execute(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.a
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String p11 = ea.a.p("O2hYc10w", "rnJ4GzQK");
                                        b bVar3 = b.this;
                                        kotlin.jvm.internal.g.e(bVar3, p11);
                                        int i12 = b.f24708m;
                                        Context context = bVar3.c;
                                        j1.e(context, context.getString(R.string.arg_res_0x7f13055f), true, null, -1);
                                    }
                                });
                            }
                        };
                        Context context = bVar.c;
                        if (context != null) {
                            com.bumptech.glide.e<Bitmap> a10 = com.bumptech.glide.b.c(context).f(context).a();
                            a10.F = str;
                            a10.I = true;
                            a10.F(new lm.c(context, aVar4, aVar5));
                            return;
                        }
                        return;
                    }
                    t0.d0(x.a(j0.f20207b), null, null, new AIChatAnswerViewHolder$onBindView$1$1$clickShare$1$3(bVar, aIAnswerContent, null), 3);
                }
            }

            @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIAnswerView.a
            public final void c() {
                AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                String p10 = ea.a.p("LGhQbh5l", "dCz8T2y3");
                aIEventCenter.getClass();
                AIEventCenter.e(p10);
                l<? super km.a, tf.d> lVar = b.this.f24712g;
                if (lVar != null) {
                    lVar.invoke(aVar2);
                }
            }

            @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIAnswerView.a
            public final void d(String str) {
                AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                String p10 = ea.a.p("LG9BeQ==", "JkUmXwKk");
                aIEventCenter.getClass();
                AIEventCenter.e(p10);
                l<? super String, tf.d> lVar = b.this.f24714i;
                if (lVar != null) {
                    lVar.invoke(str);
                }
            }

            @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIAnswerView.a
            public final void e(boolean z11) {
                b bVar = b.this;
                l<? super km.a, tf.d> lVar = bVar.f24715j;
                km.a aVar3 = aVar2;
                if (lVar != null) {
                    lVar.invoke(aVar3);
                }
                if (z11) {
                    aVar3.f19892v++;
                } else {
                    aVar3.f19892v--;
                }
                aIAnswerView.e(aVar3, bVar.f24709d, Boolean.FALSE);
                cg.a<tf.d> aVar4 = bVar.f24716k;
                if (aVar4 != null) {
                    aVar4.invoke();
                }
            }

            @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIAnswerView.a
            public final void f() {
                km.a aVar3 = aVar2;
                ArrayList arrayList = aVar3.f19893w;
                kotlin.jvm.internal.g.d(arrayList, ea.a.p("JnRUbVdhWXMtZThDGm4cZVt0", "FTrZ6YuQ"));
                AIAnswerContent aIAnswerContent = (AIAnswerContent) m.t0(aVar3.f19892v - 1, arrayList);
                if (aIAnswerContent != null && aIAnswerContent.getType() == 2) {
                    boolean isLock = aIAnswerContent.isLock();
                    b bVar = b.this;
                    if (isLock) {
                        Context context = bVar.c;
                        j1.e(context, context.getString(R.string.arg_res_0x7f1304e2), true, null, -1);
                        return;
                    }
                    String str = ImageMindPreviewActivity.f24429v;
                    Context context2 = bVar.c;
                    String content = aIAnswerContent.getContent();
                    if (context2 != null) {
                        Intent intent = new Intent(context2, ImageMindPreviewActivity.class);
                        intent.putExtra(ImageMindPreviewActivity.f24429v, content);
                        context2.startActivity(intent);
                    }
                }
            }
        });
        ArrayList arrayList = aVar2.f19893w;
        kotlin.jvm.internal.g.d(arrayList, ea.a.p("JnRUbVdhWXMtZThDGm4cZVt0", "cwTl2ml8"));
        AIAnswerContent aIAnswerContent = (AIAnswerContent) m.t0(aVar2.f19892v - 1, arrayList);
        String str = null;
        boolean z11 = this.f24709d;
        if (aIAnswerContent != null) {
            if (aIAnswerContent.getType() == 2) {
                aIAnswerView.setOnMindFirstLoadCallBack(this.f24716k);
                aIAnswerView.e(aVar2, z11, Boolean.TRUE);
            } else {
                aIAnswerView.setTag(aVar2.c);
                if (aVar2.f19894x == 402) {
                    aIAnswerView.e(aVar2, z11, Boolean.TRUE);
                } else {
                    AIChatAnswerViewHolder$onBindView$1$2$1 aIChatAnswerViewHolder$onBindView$1$2$1 = new l<CharSequence, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.AIChatAnswerViewHolder$onBindView$1$2$1
                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(CharSequence charSequence) {
                        }

                        @Override // cg.l
                        public /* bridge */ /* synthetic */ tf.d invoke(CharSequence charSequence) {
                            invoke2(charSequence);
                            return tf.d.f30009a;
                        }
                    };
                    String str2 = aVar2.c;
                    kotlin.jvm.internal.g.d(str2, ea.a.p("JnRUbVdpZA==", "ibvOMRTs"));
                    aIAnswerView.f(str2, aIChatAnswerViewHolder$onBindView$1$2$1);
                }
            }
            dVar = tf.d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            if (aVar2.f19891u == 2) {
                aIAnswerView.setOnMindFirstLoadCallBack(this.f24716k);
                aIAnswerView.e(aVar2, z11, Boolean.TRUE);
            } else {
                aIAnswerView.setTag(aVar2.c);
                if (aVar2.f19894x == 402) {
                    aIAnswerView.e(aVar2, z11, Boolean.TRUE);
                } else {
                    AIChatAnswerViewHolder$onBindView$1$3$1 aIChatAnswerViewHolder$onBindView$1$3$1 = new l<CharSequence, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.AIChatAnswerViewHolder$onBindView$1$3$1
                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(CharSequence charSequence) {
                        }

                        @Override // cg.l
                        public /* bridge */ /* synthetic */ tf.d invoke(CharSequence charSequence) {
                            invoke2(charSequence);
                            return tf.d.f30009a;
                        }
                    };
                    String str3 = aVar2.c;
                    kotlin.jvm.internal.g.d(str3, ea.a.p("WnQubV1pZA==", "y9o8yw5F"));
                    aIAnswerView.f(str3, aIChatAnswerViewHolder$onBindView$1$3$1);
                }
            }
        }
        if (aVar2.B) {
            b2 b2Var2 = (b2) aIAnswerView.f24761a;
            if (b2Var2 != null) {
                if (!im.a.c) {
                    tn.a.d(aIAnswerView.getContext(), ea.a.p("WmFw", "abWw5npF"), ea.a.p("IGE4XxhuOG8razlzXG93", "kXIHmTDz"), ea.a.p("LGhQdA==", "f2OPYyQl"), false);
                    AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                    String p10 = ea.a.p("OWkgb1llN3UmbAljX18kaFd3", "T4XH4hbc");
                    String p11 = ea.a.p("UGgqdA==", "uST3WeqU");
                    aIEventCenter.getClass();
                    AIEventCenter.i(p10, p11);
                    im.a.c = true;
                }
                b2Var2.c.setVisibility(0);
                Context context = aIAnswerView.getContext();
                if (context != null) {
                    if (BillingConfigImpl.c.i()) {
                        str = context.getString(R.string.arg_res_0x7f130044, ea.a.p("Nw==", "r9BeX5D1"));
                    } else {
                        str = context.getString(R.string.arg_res_0x7f130042);
                    }
                }
                if (str != null) {
                    b2Var2.f752e.setText(str);
                }
            }
        } else {
            b2 b2Var3 = (b2) aIAnswerView.f24761a;
            if (b2Var3 != null) {
                b2Var3.c.setVisibility(8);
            }
        }
        aIAnswerView.setOnHeightChange(new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.AIChatAnswerViewHolder$onBindView$1$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ tf.d invoke() {
                invoke2();
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                cg.a<tf.d> aVar3;
                if (km.a.this.f19895y || (aVar3 = this.f24711f) == null) {
                    return;
                }
                aVar3.invoke();
            }
        });
    }
}
