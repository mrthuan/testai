package le;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import be.a;
import j3.h;
import java.util.ArrayList;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.R;
import zd.d;

/* compiled from: ZJAdCard.java */
/* loaded from: classes.dex */
public final class f extends be.d {

    /* renamed from: b  reason: collision with root package name */
    public int f20569b = R.layout.ad_native_card;
    public Bitmap c;

    /* renamed from: d  reason: collision with root package name */
    public Bitmap f20570d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f20571e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f20572f;

    /* renamed from: g  reason: collision with root package name */
    public a.InterfaceC0036a f20573g;

    /* renamed from: h  reason: collision with root package name */
    public String f20574h;

    /* renamed from: i  reason: collision with root package name */
    public g f20575i;

    @Override // be.a
    public final synchronized void a(Activity activity) {
        synchronized (this.f5405a) {
            ImageView imageView = this.f20571e;
            if (imageView != null) {
                imageView.setImageBitmap(null);
            }
            Bitmap bitmap = this.c;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.c.recycle();
            }
            ImageView imageView2 = this.f20572f;
            if (imageView2 != null) {
                imageView2.setImageBitmap(null);
            }
            Bitmap bitmap2 = this.f20570d;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.f20570d.recycle();
            }
        }
    }

    @Override // be.a
    public final String b() {
        return b.a.d(this.f20574h, new StringBuilder("ZJAdCard@"));
    }

    @Override // be.a
    public final void d(Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        h hVar;
        fe.a.a().b("ZJAdCard:load");
        if (activity != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            try {
                this.f20573g = interfaceC0036a;
                Object obj = hVar.c;
                if (((Bundle) obj) != null) {
                    this.f20569b = ((Bundle) obj).getInt("layout_id", R.layout.ad_native_card);
                }
                g k10 = k(activity, de.e.i(activity).getString("self_ads", ""));
                this.f20575i = k10;
                if (k10 != null) {
                    this.f20574h = k10.f20580f;
                    View l10 = l(activity, this.f20569b);
                    if (l10 != null) {
                        ((d.a) interfaceC0036a).e(activity, l10, new yd.d("Z", "NC", this.f20574h));
                    }
                    fe.a a10 = fe.a.a();
                    a10.b("ZJAdCard: get selfAd: " + this.f20575i.f20580f);
                    return;
                }
                fe.a.a().b("ZJAdCard: no selfAd return");
                ((d.a) interfaceC0036a).a(activity, new yd.a("ZJAdCard: no selfAd return", 0));
            } catch (Throwable th2) {
                fe.a.a().c(th2);
            }
        } else if (interfaceC0036a != null) {
            ((d.a) interfaceC0036a).a(activity, new yd.a("ZJAdCard:Please check params is right.", 0));
        } else {
            throw new IllegalArgumentException("ZJAdCard:Please check MediationListener is right.");
        }
    }

    public final g k(Context context, String str) {
        PackageInfo packageInfo;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String optString = jSONObject.optString("package", "");
                String str2 = a.f20548a;
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
                if (!z10 && !de.e.l(context, 3, optString)) {
                    g gVar = new g();
                    gVar.f20580f = optString;
                    gVar.f20579e = jSONObject.optString("market_url", "");
                    gVar.c = jSONObject.optString("app_name", "");
                    gVar.f20578d = jSONObject.optString("app_des", "");
                    gVar.f20576a = jSONObject.optString("app_icon", "");
                    gVar.f20581g = jSONObject.optString("action", "");
                    String optString2 = jSONObject.optString("app_cover", "");
                    gVar.f20577b = optString2;
                    if (!optString2.equals("")) {
                        arrayList.add(gVar);
                    }
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

    public final synchronized View l(Activity activity, int i10) {
        if (this.f20575i == null) {
            return null;
        }
        Context applicationContext = activity.getApplicationContext();
        View inflate = LayoutInflater.from(applicationContext).inflate(i10, (ViewGroup) null);
        Button button = (Button) inflate.findViewById(R.id.ad_action_button);
        this.f20571e = (ImageView) inflate.findViewById(R.id.ad_icon_imageview);
        this.f20572f = (ImageView) inflate.findViewById(R.id.ad_cover_imageview);
        ((TextView) inflate.findViewById(R.id.ad_title_textview)).setText(this.f20575i.c);
        ((TextView) inflate.findViewById(R.id.ad_describe_textview)).setText(this.f20575i.f20578d);
        button.setText(this.f20575i.f20581g);
        button.setClickable(false);
        new Thread(new c(this, activity)).start();
        new Thread(new d(this, activity)).start();
        inflate.setOnClickListener(new e(this, applicationContext));
        return inflate;
    }
}
