package com.google.android.gms.ads.internal.util;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzfel;
import com.google.android.gms.internal.ads.zzfui;
import com.google.android.gms.internal.ads.zzfvh;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzbv {
    public static WindowManager.LayoutParams a() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhj)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject b(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    int i10 = point2.x;
                    com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f10107f;
                    jSONObject3.put("x", zzayVar.f10108a.f(context, i10));
                    jSONObject3.put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, zzayVar.f10108a.f(context, point2.y));
                    jSONObject3.put("start_x", zzayVar.f10108a.f(context, point.x));
                    jSONObject3.put("start_y", zzayVar.f10108a.f(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.g(6);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception unused2) {
                jSONObject = jSONObject2;
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                return jSONObject;
            }
        } catch (Exception unused3) {
        }
    }

    public static JSONObject c(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        Iterator it;
        JSONObject jSONObject;
        com.google.android.gms.ads.internal.client.zzay zzayVar;
        JSONObject jSONObject2;
        boolean z10;
        int i10;
        Context context2 = context;
        JSONObject jSONObject3 = new JSONObject();
        if (map != null && view != null) {
            int i11 = 2;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr2 = new int[i11];
                    view2.getLocationOnScreen(iArr2);
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = new JSONObject();
                    it = it2;
                    try {
                        int measuredWidth = view2.getMeasuredWidth();
                        JSONObject jSONObject6 = jSONObject3;
                        try {
                            zzayVar = com.google.android.gms.ads.internal.client.zzay.f10107f;
                        } catch (JSONException unused) {
                        }
                        try {
                            com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzayVar.f10108a;
                            com.google.android.gms.ads.internal.util.client.zzf zzfVar2 = zzayVar.f10108a;
                            jSONObject5.put(InMobiNetworkValues.WIDTH, zzfVar.f(context2, measuredWidth));
                            jSONObject5.put(InMobiNetworkValues.HEIGHT, zzfVar2.f(context2, view2.getMeasuredHeight()));
                            jSONObject5.put("x", zzfVar2.f(context2, iArr2[0] - iArr[0]));
                            jSONObject5.put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, zzfVar2.f(context2, iArr2[1] - iArr[1]));
                            jSONObject5.put("relative_to", "ad_view");
                            jSONObject4.put("frame", jSONObject5);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject2 = i(context2, rect);
                            } else {
                                jSONObject2 = new JSONObject();
                                jSONObject2.put(InMobiNetworkValues.WIDTH, 0);
                                jSONObject2.put(InMobiNetworkValues.HEIGHT, 0);
                                jSONObject2.put("x", zzfVar2.f(context2, iArr2[0] - iArr[0]));
                                jSONObject2.put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, zzfVar2.f(context2, iArr2[1] - iArr[1]));
                                jSONObject2.put("relative_to", "ad_view");
                            }
                            jSONObject4.put("visible_bounds", jSONObject2);
                            if (((String) entry.getKey()).equals("3010")) {
                                zzbbn zzbbnVar = zzbbw.zzhe;
                                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
                                zzbbu zzbbuVar = zzbaVar.c;
                                zzbbu zzbbuVar2 = zzbaVar.c;
                                if (((Boolean) zzbbuVar.zza(zzbbnVar)).booleanValue()) {
                                    jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) zzbbuVar2.zza(zzbbw.zzhf)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    int i12 = layoutParams.width;
                                    int i13 = 3;
                                    if (i12 != -2) {
                                        if (i12 != -1) {
                                            i10 = 2;
                                        } else {
                                            i10 = 3;
                                        }
                                    } else {
                                        i10 = 4;
                                    }
                                    jSONObject4.put("view_width_layout_type", i10 - 1);
                                    int i14 = layoutParams.height;
                                    if (i14 != -2) {
                                        if (i14 != -1) {
                                            i13 = 2;
                                        }
                                    } else {
                                        i13 = 4;
                                    }
                                    jSONObject4.put("view_height_layout_type", i13 - 1);
                                }
                                if (((Boolean) zzbbuVar2.zza(zzbbw.zzhg)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject4.put("view_path", TextUtils.join(PackagingURIHelper.FORWARD_SLASH_STRING, arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject4.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject4.put("text_color", textView.getCurrentTextColor());
                                jSONObject4.put("font_size", textView.getTextSize());
                                jSONObject4.put("text", textView.getText());
                            }
                            if (map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            jSONObject4.put("is_clickable", z10);
                            jSONObject = jSONObject6;
                        } catch (JSONException unused2) {
                            jSONObject = jSONObject6;
                            com.google.android.gms.ads.internal.util.client.zzm.e("Unable to get asset views information");
                            context2 = context;
                            jSONObject3 = jSONObject;
                            i11 = 2;
                            it2 = it;
                        }
                        try {
                            jSONObject.put((String) entry.getKey(), jSONObject4);
                        } catch (JSONException unused3) {
                            com.google.android.gms.ads.internal.util.client.zzm.e("Unable to get asset views information");
                            context2 = context;
                            jSONObject3 = jSONObject;
                            i11 = 2;
                            it2 = it;
                        }
                    } catch (JSONException unused4) {
                        jSONObject = jSONObject3;
                    }
                } else {
                    it = it2;
                    jSONObject = jSONObject3;
                }
                context2 = context;
                jSONObject3 = jSONObject;
                i11 = 2;
                it2 = it;
            }
        }
        return jSONObject3;
    }

    public static JSONObject d(Context context, View view) {
        KeyguardManager keyguardManager;
        boolean z10;
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
                jSONObject.put("can_show_on_lock_screen", zzt.B(view));
                if (context != null) {
                    Object systemService = context.getSystemService("keyguard");
                    if (systemService != null && (systemService instanceof KeyguardManager)) {
                        keyguardManager = (KeyguardManager) systemService;
                    } else {
                        keyguardManager = null;
                    }
                    if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                        z10 = true;
                        jSONObject.put("is_keyguard_locked", z10);
                    }
                }
                z10 = false;
                jSONObject.put("is_keyguard_locked", z10);
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject e(View view) {
        int positionForView;
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                boolean z10 = false;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhd)).booleanValue()) {
                    zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    if (parent != null) {
                        z10 = true;
                    }
                    jSONObject.put("contained_in_scroll_view", z10);
                } else {
                    zzt zztVar2 = com.google.android.gms.ads.internal.zzu.B.c;
                    ViewParent parent2 = view.getParent();
                    while (parent2 != null && !(parent2 instanceof AdapterView)) {
                        parent2 = parent2.getParent();
                    }
                    if (parent2 == null) {
                        positionForView = -1;
                    } else {
                        positionForView = ((AdapterView) parent2).getPositionForView(view);
                    }
                    if (positionForView != -1) {
                        z10 = true;
                    }
                    jSONObject.put("contained_in_scroll_view", z10);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:3|4|5|(2:8|6)|9|10|11|12|(1:14)(1:73)|15|16|(7:67|68|19|20|21|22|(9:24|(7:28|29|30|(2:32|(4:34|35|36|(6:38|39|(1:(1:42)(1:51))(1:52)|43|(1:(1:46)(1:49))(1:50)|47))(2:55|56))(1:59)|57|36|(0))|62|29|30|(0)(0)|57|36|(0))(9:63|(7:65|29|30|(0)(0)|57|36|(0))|62|29|30|(0)(0)|57|36|(0)))|18|19|20|21|22|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:24|(7:28|29|30|(2:32|(4:34|35|36|(6:38|39|(1:(1:42)(1:51))(1:52)|43|(1:(1:46)(1:49))(1:50)|47))(2:55|56))(1:59)|57|36|(0))|62|29|30|(0)(0)|57|36|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0147, code lost:
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
        com.google.android.gms.ads.internal.util.client.zzm.g(6);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141 A[Catch: JSONException -> 0x0148, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0148, blocks: (B:46:0x013d, B:47:0x0141), top: B:74:0x0132 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject f(android.content.Context r16, android.view.View r17) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzbv.f(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static boolean g(Context context, zzfel zzfelVar) {
        if (!zzfelVar.zzN) {
            return false;
        }
        zzbbn zzbbnVar = zzbbw.zzhh;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            return ((Boolean) zzbaVar.c.zza(zzbbw.zzhk)).booleanValue();
        }
        String str = (String) zzbaVar.c.zza(zzbbw.zzhi);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            for (String str2 : zzfvh.zzb(zzfui.zzc(';')).zzc(str)) {
                if (str2.equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean h(int i10) {
        zzbbn zzbbnVar = zzbbw.zzdd;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            if (!((Boolean) zzbaVar.c.zza(zzbbw.zzde)).booleanValue() && i10 > 15299999) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static JSONObject i(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        int i10 = rect.right - rect.left;
        com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f10107f;
        jSONObject.put(InMobiNetworkValues.WIDTH, zzayVar.f10108a.f(context, i10));
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzayVar.f10108a;
        jSONObject.put(InMobiNetworkValues.HEIGHT, zzfVar.f(context, rect.bottom - rect.top));
        jSONObject.put("x", zzfVar.f(context, rect.left));
        jSONObject.put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, zzfVar.f(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }
}
