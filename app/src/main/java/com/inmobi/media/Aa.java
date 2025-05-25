package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.inmobi.media.Aa;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Aa {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f14131a;

    /* renamed from: b  reason: collision with root package name */
    public final Ba f14132b;
    public EnumC1586c9 c;

    public Aa(WeakReference activityRef, S9 safeAreaListener) {
        kotlin.jvm.internal.g.e(activityRef, "activityRef");
        kotlin.jvm.internal.g.e(safeAreaListener, "safeAreaListener");
        this.f14131a = activityRef;
        this.f14132b = safeAreaListener;
    }

    public final void a(View view) {
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: qb.a
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return Aa.a(Aa.this, view2, windowInsets);
            }
        });
    }

    public static final WindowInsets a(Aa this$0, View view, WindowInsets windowInsets) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(view, "<anonymous parameter 0>");
        kotlin.jvm.internal.g.e(windowInsets, "windowInsets");
        if (!kotlin.jvm.internal.g.a(PDLayoutAttributeObject.BORDER_STYLE_HIDDEN, ((S9) this$0.f14132b).f14677p)) {
            JSONObject a10 = AbstractC1573ba.a(windowInsets);
            Integer f10 = AbstractC1692k3.f();
            int intValue = f10 != null ? f10.intValue() : AbstractC1692k3.a(windowInsets);
            ((S9) this$0.f14132b).setNavBarTypeByInsets(intValue);
            this$0.a(a10, intValue);
            return windowInsets;
        }
        return windowInsets;
    }

    public final void a(JSONObject jSONObject, int i10) {
        EnumC1586c9 orientation = AbstractC1600d9.a(AbstractC1692k3.g());
        JSONObject jSONObject2 = (JSONObject) ((S9) this.f14132b).G0.get(Integer.valueOf(i10));
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        JSONObject optJSONObject = jSONObject2.optJSONObject(String.valueOf(AbstractC1600d9.a(orientation)));
        if (optJSONObject == null) {
            jSONObject2.put(String.valueOf(AbstractC1600d9.a(orientation)), jSONObject);
            Objects.toString(jSONObject2);
            S9 s92 = (S9) this.f14132b;
            s92.getClass();
            s92.G0.put(Integer.valueOf(i10), jSONObject2);
            AbstractC1692k3.a(((S9) this.f14132b).getAllSafeArea());
        } else {
            optJSONObject.toString();
            Objects.toString(jSONObject);
            if (!C1708l5.a(optJSONObject, jSONObject)) {
                jSONObject2.put(String.valueOf(AbstractC1600d9.a(orientation)), jSONObject);
                Objects.toString(jSONObject2);
                S9 s93 = (S9) this.f14132b;
                s93.getClass();
                s93.G0.put(Integer.valueOf(i10), jSONObject2);
                AbstractC1692k3.a(((S9) this.f14132b).getAllSafeArea());
            }
        }
        if (this.c != orientation) {
            this.c = orientation;
            Integer navBarType = ((S9) this.f14132b).getNavBarType();
            JSONObject jSONObject3 = null;
            if (navBarType != null) {
                JSONObject jSONObject4 = (JSONObject) ((S9) this.f14132b).G0.get(navBarType);
                JSONObject optJSONObject2 = jSONObject4 != null ? jSONObject4.optJSONObject(String.valueOf(Integer.valueOf(AbstractC1600d9.a(orientation)))) : null;
                if (optJSONObject2 != null && (optJSONObject2.optInt("top") != 0 || optJSONObject2.optInt("right") != 0)) {
                    ((S9) this.f14132b).setCloseAssetArea(optJSONObject2);
                    S9 s94 = (S9) this.f14132b;
                    C1565b2 c1565b2 = new C1565b2(s94, !s94.C, !s94.F, s94.f14665j);
                    c1565b2.c();
                    c1565b2.d();
                }
            }
            S9 s95 = (S9) this.f14132b;
            s95.getClass();
            kotlin.jvm.internal.g.e(orientation, "orientation");
            A4 a42 = s95.f14665j;
            if (a42 != null) {
                String str = S9.O0;
                ((B4) a42).c(str, G9.a(s95, str, "TAG", "fireOnSafeAreaChanged "));
            }
            Integer num = s95.E0;
            if (num == null && (num = s95.F0) == null) {
                return;
            }
            JSONObject jSONObject5 = (JSONObject) s95.G0.get(Integer.valueOf(num.intValue()));
            JSONObject optJSONObject3 = jSONObject5 != null ? jSONObject5.optJSONObject(String.valueOf(AbstractC1600d9.a(orientation))) : null;
            if (optJSONObject3 == null) {
                return;
            }
            try {
                jSONObject3 = new JSONObject(optJSONObject3.toString()).put("orientation", AbstractC1600d9.a(orientation));
            } catch (Exception unused) {
            }
            if (jSONObject3 == null) {
                return;
            }
            s95.b("window.imraid.broadcastEvent('onSafeAreaChange', " + jSONObject3 + ')');
        }
    }

    public final void a() {
        Window window;
        View decorView;
        Activity activity = (Activity) this.f14131a.get();
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setOnApplyWindowInsetsListener(null);
        }
        this.f14131a.clear();
    }
}
