package le;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import be.a;
import j3.h;
import java.util.ArrayList;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.R;
import zd.a;

/* compiled from: ZJAdBanner.java */
/* loaded from: classes.dex */
public final class b extends be.b {

    /* renamed from: b  reason: collision with root package name */
    public h f20550b;
    public int c = R.layout.ad_native_banner;

    /* renamed from: d  reason: collision with root package name */
    public int f20551d = R.layout.ad_native_banner_root;

    /* renamed from: e  reason: collision with root package name */
    public Bitmap f20552e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f20553f;

    /* renamed from: g  reason: collision with root package name */
    public a.InterfaceC0036a f20554g;

    /* renamed from: h  reason: collision with root package name */
    public String f20555h;

    /* compiled from: ZJAdBanner.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f20556a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f20557b;

        /* compiled from: ZJAdBanner.java */
        /* renamed from: le.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0278a implements Runnable {
            public RunnableC0278a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                Bitmap bitmap;
                a aVar = a.this;
                b bVar = b.this;
                if (bVar.f20553f != null && (bitmap = bVar.f20552e) != null && !bitmap.isRecycled()) {
                    try {
                        b bVar2 = b.this;
                        bVar2.f20553f.setImageBitmap(bVar2.f20552e);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }

        public a(g gVar, Activity activity) {
            this.f20556a = gVar;
            this.f20557b = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                synchronized (b.this.f5405a) {
                    b.this.f20552e = BitmapFactory.decodeFile(this.f20556a.f20576a);
                    Bitmap bitmap = b.this.f20552e;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        this.f20557b.runOnUiThread(new RunnableC0278a());
                    }
                }
            } catch (Error e10) {
                e10.printStackTrace();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* compiled from: ZJAdBanner.java */
    /* renamed from: le.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0279b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f20559a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f20560b;

        public View$OnClickListenerC0279b(g gVar, Activity activity) {
            this.f20559a = gVar;
            this.f20560b = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            g gVar = this.f20559a;
            Activity activity = this.f20560b;
            b bVar = b.this;
            if (bVar.f20554g != null) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(gVar.f20579e));
                    intent.setFlags(268435456);
                    intent.setPackage("com.android.vending");
                    activity.startActivity(intent);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    try {
                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(gVar.f20579e));
                        intent2.setFlags(268435456);
                        activity.startActivity(intent2);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                bVar.f20554g.b(activity, new yd.d("Z", "NB", bVar.f20555h));
                de.e.a(activity, 1, gVar.f20580f);
            }
        }
    }

    @Override // be.a
    public final synchronized void a(Activity activity) {
        synchronized (this.f5405a) {
            ImageView imageView = this.f20553f;
            if (imageView != null) {
                imageView.setImageBitmap(null);
            }
            Bitmap bitmap = this.f20552e;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f20552e.recycle();
            }
        }
    }

    @Override // be.a
    public final String b() {
        return b.a.d(this.f20555h, new StringBuilder("ZJAdBanner@"));
    }

    @Override // be.a
    public final void d(Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        h hVar;
        fe.a.a().b("ZJAdBanner:load");
        if (activity != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            try {
                this.f20550b = hVar;
                this.f20554g = interfaceC0036a;
                Object obj = hVar.c;
                if (((Bundle) obj) != null) {
                    this.c = ((Bundle) obj).getInt("layout_id", R.layout.ad_native_banner);
                    this.f20551d = ((Bundle) this.f20550b.c).getInt("root_layout_id", R.layout.ad_native_banner_root);
                }
                g l10 = l(activity, de.e.i(activity).getString("self_ads", ""));
                if (l10 != null) {
                    this.f20555h = l10.f20580f;
                    View m10 = m(activity, l10);
                    if (m10 != null) {
                        ((a.C0429a) interfaceC0036a).e(activity, m10, new yd.d("Z", "NB", this.f20555h));
                    }
                    fe.a a10 = fe.a.a();
                    a10.b("ZJAdBanner: get selfAd: " + l10.f20580f);
                    return;
                }
                fe.a.a().b("ZJAdBanner: no selfAd return");
                ((a.C0429a) interfaceC0036a).a(activity, new yd.a("ZJAdBanner: no selfAd return", 0));
            } catch (Throwable th2) {
                fe.a.a().c(th2);
            }
        } else if (interfaceC0036a != null) {
            ((a.C0429a) interfaceC0036a).a(activity, new yd.a("ZJAdBanner:Please check params is right.", 0));
        } else {
            throw new IllegalArgumentException("ZJAdBanner:Please check MediationListener is right.");
        }
    }

    public final g l(Context context, String str) {
        PackageInfo packageInfo;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String optString = jSONObject.optString("package", "");
                String str2 = le.a.f20548a;
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(optString, 8192);
                } catch (Throwable unused) {
                    packageInfo = null;
                }
                if (packageInfo == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10 && !de.e.l(context, 1, optString) && de.e.j(context, optString) <= 9) {
                    g gVar = new g();
                    gVar.f20580f = optString;
                    gVar.f20579e = jSONObject.optString("market_url", "");
                    gVar.c = jSONObject.optString("app_name", "");
                    gVar.f20578d = jSONObject.optString("app_des", "");
                    gVar.f20576a = jSONObject.optString("app_icon", "");
                    gVar.f20581g = jSONObject.optString("action", "");
                    gVar.f20577b = jSONObject.optString("app_cover", "");
                    arrayList.add(gVar);
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        return (g) arrayList.get(new Random().nextInt(arrayList.size()));
    }

    public final synchronized View m(Activity activity, g gVar) {
        View view;
        view = null;
        try {
            View inflate = LayoutInflater.from(activity).inflate(this.c, (ViewGroup) null);
            Button button = (Button) inflate.findViewById(R.id.ad_action_button);
            this.f20553f = (ImageView) inflate.findViewById(R.id.ad_icon_imageview);
            ((TextView) inflate.findViewById(R.id.ad_title_textview)).setText(gVar.c);
            ((TextView) inflate.findViewById(R.id.ad_describe_textview)).setText(gVar.f20578d);
            button.setText(gVar.f20581g);
            button.setClickable(false);
            new Thread(new a(gVar, activity)).start();
            view = LayoutInflater.from(activity).inflate(this.f20551d, (ViewGroup) null);
            ((LinearLayout) view.findViewById(R.id.ad_native_banner_root_linearLayout)).addView(inflate);
            inflate.setOnClickListener(new View$OnClickListenerC0279b(gVar, activity));
            de.e.b(activity, gVar.f20580f);
        } catch (Throwable th2) {
            fe.a.a().c(th2);
        }
        return view;
    }

    @Override // be.b
    public final void j() {
    }

    @Override // be.b
    public final void k() {
    }
}
