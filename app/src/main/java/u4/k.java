package u4;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.r;
import be.a;
import com.inmobi.ads.InMobiNative;
import ge.d;
import pdf.pdfreader.viewer.editor.free.R;
import zd.d;

/* compiled from: InmobiNativeCard.kt */
/* loaded from: classes.dex */
public final class k extends be.d {
    public j3.h c;

    /* renamed from: e  reason: collision with root package name */
    public a.InterfaceC0036a f30205e;

    /* renamed from: h  reason: collision with root package name */
    public float f30208h;

    /* renamed from: i  reason: collision with root package name */
    public InMobiNative f30209i;

    /* renamed from: j  reason: collision with root package name */
    public InMobiNative f30210j;

    /* renamed from: b  reason: collision with root package name */
    public final String f30203b = "InmobiNativeCard";

    /* renamed from: d  reason: collision with root package name */
    public String f30204d = "";

    /* renamed from: f  reason: collision with root package name */
    public String f30206f = "";

    /* renamed from: g  reason: collision with root package name */
    public int f30207g = R.layout.ad_native_card;

    /* compiled from: InmobiNativeCard.kt */
    /* loaded from: classes.dex */
    public static final class a implements d.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ImageView f30212b;

        public a(ImageView imageView) {
            this.f30212b = imageView;
        }

        @Override // ge.d.a
        public final void a(Bitmap bitmap) {
            kotlin.jvm.internal.g.e(bitmap, "bitmap");
            Object lock = k.this.f5405a;
            kotlin.jvm.internal.g.d(lock, "lock");
            ImageView imageView = this.f30212b;
            synchronized (lock) {
                imageView.setImageBitmap(bitmap);
                tf.d dVar = tf.d.f30009a;
            }
        }

        @Override // ge.d.a
        public final void b() {
            Object lock = k.this.f5405a;
            kotlin.jvm.internal.g.d(lock, "lock");
            ImageView imageView = this.f30212b;
            synchronized (lock) {
                imageView.setVisibility(8);
                tf.d dVar = tf.d.f30009a;
            }
        }
    }

    /* compiled from: InmobiNativeCard.kt */
    /* loaded from: classes.dex */
    public static final class b implements d {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f30214b;
        public final /* synthetic */ a.InterfaceC0036a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f30215d;

        public b(Activity activity, d.a aVar, Context context) {
            this.f30214b = activity;
            this.c = aVar;
            this.f30215d = context;
        }

        @Override // u4.d
        public final void a(boolean z10) {
            k kVar = k.this;
            if (z10) {
                String str = kVar.f30206f;
                Activity activity = this.f30214b;
                Context applicationContext = activity.getApplicationContext();
                try {
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    kotlin.jvm.internal.g.d(applicationContext2, "context.applicationContext");
                    InMobiNative inMobiNative = new InMobiNative(applicationContext2, Long.parseLong(str), new l(applicationContext, kVar, activity));
                    kVar.f30209i = inMobiNative;
                    inMobiNative.load();
                    return;
                } catch (Throwable th2) {
                    fe.a.a().c(th2);
                    a.InterfaceC0036a interfaceC0036a = kVar.f30205e;
                    if (interfaceC0036a != null) {
                        interfaceC0036a.a(applicationContext, new yd.a(kVar.f30203b + ":loadAd exception " + th2.getMessage() + '}', 0));
                        return;
                    }
                    return;
                }
            }
            this.c.a(this.f30215d, new yd.a(r.g(new StringBuilder(), kVar.f30203b, ": init failed"), 0));
            a6.h.k(new StringBuilder(), kVar.f30203b, ": init failed", fe.a.a());
        }
    }

    @Override // be.a
    public final void a(Activity context) {
        kotlin.jvm.internal.g.e(context, "context");
        try {
            InMobiNative inMobiNative = this.f30209i;
            if (inMobiNative != null) {
                inMobiNative.destroy();
            }
            this.f30209i = null;
            InMobiNative inMobiNative2 = this.f30210j;
            if (inMobiNative2 != null) {
                inMobiNative2.destroy();
            }
            this.f30210j = null;
        } catch (Throwable th2) {
            fe.a.a().c(th2);
        }
    }

    @Override // be.a
    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30203b);
        sb2.append('@');
        return b.a.d(this.f30206f, sb2);
    }

    @Override // be.a
    public final void d(Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        j3.h hVar;
        kotlin.jvm.internal.g.e(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        String str = this.f30203b;
        a6.h.k(sb2, str, ":load", a10);
        if (applicationContext != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            this.f30205e = interfaceC0036a;
            try {
                this.f30208h = applicationContext.getResources().getDisplayMetrics().widthPixels;
                this.c = hVar;
                Bundle bundle = (Bundle) hVar.c;
                kotlin.jvm.internal.g.d(bundle, "adConfig.params");
                String string = bundle.getString("account_id", "");
                kotlin.jvm.internal.g.d(string, "params.getString(KEY_ACCOUNT_ID, \"\")");
                this.f30204d = string;
                this.f30207g = bundle.getInt("layout_id", R.layout.ad_native_card);
                this.f30208h = bundle.getFloat("cover_width", this.f30208h);
                if (TextUtils.isEmpty(this.f30204d)) {
                    ((d.a) interfaceC0036a).a(applicationContext, new yd.a(str + ": accountId is empty", 0));
                    fe.a a11 = fe.a.a();
                    a11.b(str + ":accountId is empty");
                    return;
                }
                j3.h hVar2 = this.c;
                if (hVar2 != null) {
                    String str2 = (String) hVar2.f19039b;
                    kotlin.jvm.internal.g.d(str2, "adConfig.id");
                    this.f30206f = str2;
                    String str3 = u4.b.f30157a;
                    u4.b.a(activity, this.f30204d, new b(activity, (d.a) interfaceC0036a, applicationContext));
                    return;
                }
                kotlin.jvm.internal.g.i("adConfig");
                throw null;
            } catch (Throwable th2) {
                fe.a.a().c(th2);
                StringBuilder g10 = a0.d.g(str, ":loadAd exception ");
                g10.append(th2.getMessage());
                g10.append('}');
                ((d.a) interfaceC0036a).a(applicationContext, new yd.a(g10.toString(), 0));
            }
        } else if (interfaceC0036a != null) {
            ((d.a) interfaceC0036a).a(applicationContext, new yd.a(a6.h.c(str, ":Please check params is right."), 0));
        } else {
            throw new IllegalArgumentException(a6.h.c(str, ":Please check MediationListener is right."));
        }
    }

    @Override // be.d
    public final View j(Activity activity, int i10, int i11) {
        kotlin.jvm.internal.g.e(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        String str = this.f30203b;
        a6.h.k(sb2, str, ":getAdView", a10);
        try {
            InMobiNative inMobiNative = this.f30210j;
            if (inMobiNative == null) {
                return null;
            }
            View inflate = LayoutInflater.from(activity).inflate(i10, (ViewGroup) null);
            kotlin.jvm.internal.g.c(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            TextView textView = (TextView) viewGroup.findViewById(R.id.ad_title_textview);
            TextView textView2 = (TextView) viewGroup.findViewById(R.id.ad_describe_textview);
            Button button = (Button) viewGroup.findViewById(R.id.ad_action_button);
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.ad_icon_imageview);
            LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.ad_cover_mediaview);
            ((ImageView) viewGroup.findViewById(R.id.ad_cover_imageview)).setVisibility(8);
            linearLayout.setVisibility(0);
            if (i11 != -1) {
                linearLayout.addView(inMobiNative.getPrimaryViewOfWidth(applicationContext, linearLayout, linearLayout, i11));
            } else {
                linearLayout.addView(inMobiNative.getPrimaryViewOfWidth(applicationContext, linearLayout, linearLayout, (int) this.f30208h));
            }
            ge.d.b(activity, new a(imageView), inMobiNative.getAdIconUrl(), true);
            textView.setText(inMobiNative.getAdTitle());
            textView2.setText(inMobiNative.getAdDescription());
            button.setText(inMobiNative.getAdCtaText());
            viewGroup.setOnClickListener(new j(inMobiNative, 0));
            button.setClickable(false);
            return viewGroup;
        } catch (Throwable th2) {
            fe.a.a().c(th2);
            a.InterfaceC0036a interfaceC0036a = this.f30205e;
            if (interfaceC0036a != null) {
                StringBuilder g10 = a0.d.g(str, ":loadAd exception ");
                g10.append(th2.getMessage());
                g10.append('}');
                interfaceC0036a.a(applicationContext, new yd.a(g10.toString(), 0));
            }
            return null;
