package pdf.pdfreader.viewer.editor.free.feature.scan.adapter;

import am.n1;
import am.o1;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.activity.f;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.recyclerview.widget.RecyclerView;
import cg.l;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustPayload;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: ThumbAdapter.kt */
/* loaded from: classes3.dex */
public final class ThumbAdapter extends RecyclerView.Adapter<RecyclerView.b0> {

    /* renamed from: d  reason: collision with root package name */
    public final w f25623d;

    /* renamed from: e  reason: collision with root package name */
    public final tf.c f25624e;

    /* renamed from: f  reason: collision with root package name */
    public final tf.c f25625f;

    /* renamed from: g  reason: collision with root package name */
    public int f25626g;

    /* renamed from: h  reason: collision with root package name */
    public int f25627h;

    /* renamed from: i  reason: collision with root package name */
    public int f25628i;

    /* renamed from: j  reason: collision with root package name */
    public int f25629j;

    /* renamed from: k  reason: collision with root package name */
    public int f25630k;

    /* renamed from: l  reason: collision with root package name */
    public l<? super Integer, tf.d> f25631l;

    /* compiled from: ThumbAdapter.kt */
    /* loaded from: classes3.dex */
    public final class ViewHolder extends RecyclerView.b0 implements BaseImageAdjustViewHolder {

        /* renamed from: b  reason: collision with root package name */
        public final n1 f25632b;
        public l1 c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ThumbAdapter f25633d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public ViewHolder(pdf.pdfreader.viewer.editor.free.feature.scan.adapter.ThumbAdapter r3, am.n1 r4) {
            /*
                r2 = this;
                java.lang.String r0 = "LWlfZBBuZw=="
                java.lang.String r1 = "bkCXDLQ4"
                ea.a.p(r0, r1)
                r2.f25633d = r3
                android.view.View r0 = r4.f1169e
                android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
                r2.<init>(r0)
                r2.f25632b = r4
                pdf.pdfreader.viewer.editor.free.feature.scan.adapter.e r4 = new pdf.pdfreader.viewer.editor.free.feature.scan.adapter.e
                r1 = 0
                r4.<init>(r1, r2, r3)
                r0.setOnClickListener(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.ThumbAdapter.ViewHolder.<init>(pdf.pdfreader.viewer.editor.free.feature.scan.adapter.ThumbAdapter, am.n1):void");
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
        public final void a(ul.b image) {
            Bitmap bitmap;
            g.e(image, "image");
            n1 n1Var = this.f25632b;
            Context context = ((FrameLayout) n1Var.f1169e).getContext();
            ThumbAdapter thumbAdapter = this.f25633d;
            if (thumbAdapter.f25627h == 0) {
                g.d(context, ea.a.p("LG9fdBx4dA==", "j3EhrUKm"));
                thumbAdapter.f25627h = context.getResources().getDisplayMetrics().widthPixels;
            }
            if (thumbAdapter.f25628i == 0) {
                thumbAdapter.f25628i = context.getResources().getDimensionPixelSize(R.dimen.dp_40);
            }
            if (thumbAdapter.f25629j == 0) {
                thumbAdapter.f25629j = context.getResources().getDimensionPixelSize(R.dimen.dp_50);
            }
            if (thumbAdapter.f25630k == 0) {
                thumbAdapter.f25630k = context.getResources().getDimensionPixelSize(R.dimen.dp_6);
            }
            int bindingAdapterPosition = getBindingAdapterPosition();
            FrameLayout frameLayout = (FrameLayout) n1Var.f1169e;
            g.d(frameLayout, ea.a.p("LWlfZBBuUC4obyV0", "gtpsVGTI"));
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                RecyclerView.n nVar = (RecyclerView.n) layoutParams;
                if (bindingAdapterPosition == 0) {
                    nVar.setMarginStart((thumbAdapter.f25627h / 2) - (thumbAdapter.f25628i / 2));
                    nVar.setMarginEnd(0);
                } else {
                    nVar.setMarginStart(thumbAdapter.f25630k);
                    nVar.setMarginEnd(0);
                }
                frameLayout.setLayoutParams(nVar);
                int i10 = thumbAdapter.f25626g;
                View view = n1Var.f1170f;
                if (i10 == bindingAdapterPosition) {
                    view.setBackgroundResource(R.drawable.shape_image_adjust_thumb_bg_selected);
                } else {
                    view.setBackgroundResource(R.drawable.shape_image_adjust_thumb_bg_normal);
                }
                WeakReference<Bitmap> weakReference = image.f30416n;
                if (weakReference != null) {
                    bitmap = weakReference.get();
                } else {
                    bitmap = null;
                }
                if (bitmap == null || bitmap.isRecycled()) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    ((ProgressBar) n1Var.f1171g).setVisibility(8);
                    if (!bitmap.isRecycled()) {
                        n1Var.f1167b.setImageBitmap(bitmap);
                        return;
                    }
                    return;
                }
                Long valueOf = Long.valueOf(image.f30405b);
                AppCompatImageView appCompatImageView = n1Var.f1167b;
                appCompatImageView.setTag(valueOf);
                ((ProgressBar) n1Var.f1171g).setVisibility(0);
                appCompatImageView.setImageBitmap(null);
                this.c = t0.d0(thumbAdapter.f25623d, null, null, new ThumbAdapter$ViewHolder$onBinding$2(this, context, image, thumbAdapter, bindingAdapterPosition, null), 3);
                return;
            }
            throw new NullPointerException(ea.a.p("KnU7bFVjCW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAweSdlVWEGZDpvD2RMLiVlW3kxbCxyQGkRd193OGQlZTAuBWUWeQtsLXIwaVF3eUxZeT11PVBXchVtcw==", "xYDWuh7P"));
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
        public final Object c(Context context, ul.b bVar, ul.c cVar, boolean z10, kotlin.coroutines.c<? super Bitmap> cVar2) {
            return BaseImageAdjustViewHolder.DefaultImpls.g(this, context, bVar, cVar, z10, cVar2);
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
        public final Object e(Context context, ul.b bVar, ul.c cVar, kotlin.coroutines.c<? super tf.d> cVar2) {
            return BaseImageAdjustViewHolder.DefaultImpls.e(this, context, bVar, cVar, cVar2);
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
        public final Object f(Context context, String str, ul.c cVar, ul.c cVar2, Bitmap bitmap, kotlin.coroutines.c<? super tf.d> cVar3) {
            return BaseImageAdjustViewHolder.DefaultImpls.c(context, str, cVar, cVar2, cVar3);
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
        public final void h(ul.b bVar, ImageAdjustPayload imageAdjustPayload) {
            BaseImageAdjustViewHolder.DefaultImpls.l(this, bVar, imageAdjustPayload);
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
        public final Object i(Context context, ul.b bVar, int i10, int i11, ul.c cVar, boolean z10, kotlin.coroutines.c<? super Bitmap> cVar2) {
            return BaseImageAdjustViewHolder.DefaultImpls.h(bVar, context, i10, i11, this, cVar, z10, cVar2);
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
        public final Object j(Context context, ul.b bVar, int i10, int i11, ul.c cVar, boolean z10, kotlin.coroutines.c<? super Bitmap> cVar2) {
            return BaseImageAdjustViewHolder.DefaultImpls.k(bVar, context, i10, i11, this, cVar, cVar2);
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
        public final void k(Context context, ul.b bVar, ul.c cVar) {
            BaseImageAdjustViewHolder.DefaultImpls.f(context, bVar, cVar);
        }
    }

    /* compiled from: ThumbAdapter.kt */
    /* loaded from: classes3.dex */
    public final class a extends RecyclerView.b0 implements BaseImageAdjustViewHolder {

        /* renamed from: b  reason: collision with root package name */
        public final o1 f25634b;
        public final /* synthetic */ ThumbAdapter c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ThumbAdapter thumbAdapter, o1 o1Var) {
            super((FrameLayout) o1Var.f1257b);
            ea.a.p("PWVBbBhjUkIzbi5pG2c=", "4LNG3Jnd");
            this.c = thumbAdapter;
            this.f25634b = o1Var;
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
        public final void a(ul.b image) {
            g.e(image, "image");
            FrameLayout frameLayout = (FrameLayout) this.f25634b.c;
            g.d(frameLayout, ea.a.p("CGUebA1jFUIhbgJpWmd5cl1wPmEqZWRvG3Q=", "nbznlpVH"));
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                RecyclerView.n nVar = (RecyclerView.n) layoutParams;
                ThumbAdapter thumbAdapter = this.c;
                ((ViewGroup.MarginLayoutParams) nVar).width = ((thumbAdapter.f25627h / 2) - (thumbAdapter.f25628i / 2)) - thumbAdapter.f25630k;
                frameLayout.setLayoutParams(nVar);
                return;
            }
            throw new NullPointerException(ea.a.p("DXUtbBdjGW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAXeTFlF2EWZDpvD2RMLiVlW3kxbCxyQGkRd193OGQlZRcuE2VUeRtsLXIwaVF3eUxZeT11PVBXchVtcw==", "GpcA7xvi"));
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
        public final Object c(Context context, ul.b bVar, ul.c cVar, boolean z10, kotlin.coroutines.c<? super Bitmap> cVar2) {
            return BaseImageAdjustViewHolder.DefaultImpls.g(this, context, bVar, cVar, z10, cVar2);
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
        public final Object e(Context context, ul.b bVar, ul.c cVar, kotlin.coroutines.c<? super tf.d> cVar2) {
            return BaseImageAdjustViewHolder.DefaultImpls.e(this, context, bVar, cVar, cVar2);
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
        public final Object f(Context context, String str, ul.c cVar, ul.c cVar2, Bitmap bitmap, kotlin.coroutines.c<? super tf.d> cVar3) {
            return BaseImageAdjustViewHolder.DefaultImpls.c(context, str, cVar, cVar2, cVar3);
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
        public final void h(ul.b bVar, ImageAdjustPayload imageAdjustPayload) {
            BaseImageAdjustViewHolder.DefaultImpls.l(this, bVar, imageAdjustPayload);
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
        public final Object i(Context context, ul.b bVar, int i10, int i11, ul.c cVar, boolean z10, kotlin.coroutines.c<? super Bitmap> cVar2) {
            return BaseImageAdjustViewHolder.DefaultImpls.h(bVar, context, i10, i11, this, cVar, z10, cVar2);
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
        public final Object j(Context context, ul.b bVar, int i10, int i11, ul.c cVar, boolean z10, kotlin.coroutines.c<? super Bitmap> cVar2) {
            return BaseImageAdjustViewHolder.DefaultImpls.k(bVar, context, i10, i11, this, cVar, cVar2);
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
        public final void k(Context context, ul.b bVar, ul.c cVar) {
            BaseImageAdjustViewHolder.DefaultImpls.f(context, bVar, cVar);
        }
    }

    public ThumbAdapter(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl) {
        ea.a.p("RWkudyBjDXBl", "fS8U36cQ");
        this.f25623d = lifecycleCoroutineScopeImpl;
        this.f25624e = kotlin.a.a(new cg.a<kn.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.ThumbAdapter$diffCallback$2
            @Override // cg.a
            public final kn.a invoke() {
                return new kn.a();
            }
        });
        this.f25625f = kotlin.a.a(new cg.a<androidx.recyclerview.widget.e<ul.b>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.ThumbAdapter$differ$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final androidx.recyclerview.widget.e<ul.b> invoke() {
                ThumbAdapter thumbAdapter = ThumbAdapter.this;
                return new androidx.recyclerview.widget.e<>(thumbAdapter, (kn.a) thumbAdapter.f25624e.getValue());
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((androidx.recyclerview.widget.e) this.f25625f.getValue()).f4412f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        return g.a(h(i10).f30411i, ea.a.p("QWU7bBJjB0gdbFBlG1Y_ZXc=", "duYmSuAl")) ? 1 : 0;
    }

    public final ul.b h(int i10) {
        Object obj = ((androidx.recyclerview.widget.e) this.f25625f.getValue()).f4412f.get(i10);
        g.d(obj, ea.a.p("K2lXZhxyGWMvcjhlG3QkaUZ0NXAqcwx0A28nXQ==", "NBGOjIj4"));
        return (ul.b) obj;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.b0 holder, int i10) {
        g.e(holder, "holder");
        if (holder instanceof ViewHolder) {
            ((ViewHolder) holder).a(h(i10));
        } else if (holder instanceof a) {
            ((a) holder).a(h(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.b0 onCreateViewHolder(ViewGroup parent, int i10) {
        RecyclerView.b0 aVar;
        g.e(parent, "parent");
        if (i10 == 0) {
            View i11 = f.i(parent, R.layout.item_image_adjust_thumb, parent, false);
            int i12 = R.id.content_fl;
            FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(i11, R.id.content_fl);
            if (frameLayout != null) {
                i12 = R.id.content_mask_view;
                View u7 = com.google.android.play.core.assetpacks.c.u(i11, R.id.content_mask_view);
                if (u7 != null) {
                    i12 = R.id.picture_iv;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(i11, R.id.picture_iv);
                    if (appCompatImageView != null) {
                        i12 = R.id.progress;
                        ProgressBar progressBar = (ProgressBar) com.google.android.play.core.assetpacks.c.u(i11, R.id.progress);
                        if (progressBar != null) {
                            FrameLayout frameLayout2 = (FrameLayout) i11;
                            n1 n1Var = new n1(frameLayout2, frameLayout, u7, appCompatImageView, progressBar, frameLayout2);
                            ea.a.p("Jm5XbBh0UigWYTNvAHQhblNsD3Qgcktmp4DlLhtvO3QqeEUpVSBHYShlJHRZIA5hWXMLKQ==", "k2lEECxU");
                            aVar = new ViewHolder(this, n1Var);
                        }
                    }
                }
            }
            throw new NullPointerException(ea.a.p("JmkCcz1uISA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "kNkqTFhR").concat(i11.getResources().getResourceName(i12)));
        }
        View i13 = f.i(parent, R.layout.item_image_adjust_thumb_replace, parent, false);
        if (i13 != null) {
            FrameLayout frameLayout3 = (FrameLayout) i13;
            o1 o1Var = new o1(0, frameLayout3, frameLayout3);
            ea.a.p("Wm4tbBJ0Byg-YU1vHHQfbiJsU3Qjcm1mu4DgLiFvGHRWeD8pXyASYQBlWnRFIDBhKHNXKQ==", "YFBvW5YT");
            aVar = new a(this, o1Var);
        } else {
            throw new NullPointerException(ea.a.p("QW8kdCVpB3c=", "MTow4WGS"));
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0.u() == true) goto L7;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewRecycled(androidx.recyclerview.widget.RecyclerView.b0 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.g.e(r3, r0)
            super.onViewRecycled(r3)
            boolean r0 = r3 instanceof pdf.pdfreader.viewer.editor.free.feature.scan.adapter.ThumbAdapter.ViewHolder
            if (r0 == 0) goto L25
            pdf.pdfreader.viewer.editor.free.feature.scan.adapter.ThumbAdapter$ViewHolder r3 = (pdf.pdfreader.viewer.editor.free.feature.scan.adapter.ThumbAdapter.ViewHolder) r3
            kotlinx.coroutines.l1 r0 = r3.c
            if (r0 == 0) goto L1a
            boolean r0 = r0.u()
            r1 = 1
            if (r0 != r1) goto L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 != 0) goto L25
            kotlinx.coroutines.l1 r3 = r3.c
            if (r3 == 0) goto L25
            r0 = 0
            r3.b(r0)
        L25:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.ThumbAdapter.onViewRecycled(androidx.recyclerview.widget.RecyclerView$b0):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.b0 holder, int i10, List<Object> payloads) {
        g.e(holder, "holder");
        g.e(payloads, "payloads");
        if (holder instanceof ViewHolder) {
            ViewHolder viewHolder = (ViewHolder) holder;
            ul.b h10 = h(i10);
            if (payloads.isEmpty()) {
                viewHolder.a(h10);
                return;
            }
            n1 n1Var = viewHolder.f25632b;
            Context context = ((FrameLayout) n1Var.f1169e).getContext();
            ThumbAdapter thumbAdapter = viewHolder.f25633d;
            if (thumbAdapter.f25627h == 0) {
                g.d(context, ea.a.p("UG8ldBZ4dA==", "nLYr05hc"));
                thumbAdapter.f25627h = context.getResources().getDisplayMetrics().widthPixels;
            }
            if (thumbAdapter.f25628i == 0) {
                thumbAdapter.f25628i = context.getResources().getDimensionPixelSize(R.dimen.dp_40);
            }
            if (thumbAdapter.f25629j == 0) {
                thumbAdapter.f25629j = context.getResources().getDimensionPixelSize(R.dimen.dp_50);
            }
            if (thumbAdapter.f25630k == 0) {
                thumbAdapter.f25630k = context.getResources().getDimensionPixelSize(R.dimen.dp_6);
            }
            FrameLayout frameLayout = (FrameLayout) n1Var.f1169e;
            g.d(frameLayout, ea.a.p("UWklZBpuBS4Ab1t0", "DbyhgCaY"));
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                RecyclerView.n nVar = (RecyclerView.n) layoutParams;
                if (nVar.f4304a.getBindingAdapterPosition() == 0) {
                    nVar.setMarginStart((thumbAdapter.f25627h / 2) - (thumbAdapter.f25628i / 2));
                    nVar.setMarginEnd(0);
                } else {
                    nVar.setMarginStart(thumbAdapter.f25630k);
                    nVar.setMarginEnd(0);
                }
                frameLayout.setLayoutParams(nVar);
                int i11 = thumbAdapter.f25626g;
                int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
                View view = n1Var.f1170f;
                if (i11 == bindingAdapterPosition) {
                    view.setBackgroundResource(R.drawable.shape_image_adjust_thumb_bg_selected);
                    return;
                } else {
                    view.setBackgroundResource(R.drawable.shape_image_adjust_thumb_bg_normal);
                    return;
                }
            }
            throw new NullPointerException(ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuGG5nbi1sCiA7eUFlWWFZZChvI2QNLhplVnkNbCByE2kSd2R3MWQBZTsuY2UaeVRsP3IcaRB3RkxUeQF1MVAEchZtcw==", "vz2YwJXf"));
        } else if (holder instanceof a) {
            ((a) holder).a(h(i10));
        }
    }
}
