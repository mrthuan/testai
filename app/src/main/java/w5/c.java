package w5;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.facebook.d;
import com.facebook.internal.p;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ViewHierarchy.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f30977a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference<View> f30978b = new WeakReference<>(null);
    public static Method c;

    public static final View a(View view) {
        boolean z10;
        if (k6.a.b(c.class)) {
            return null;
        }
        while (view != null) {
            try {
                c cVar = f30977a;
                cVar.getClass();
                if (!k6.a.b(cVar)) {
                    z10 = g.a(view.getClass().getName(), "com.facebook.react.ReactRootView");
                } else {
                    z10 = false;
                }
                if (z10) {
                    return view;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } catch (Throwable th2) {
                k6.a.a(c.class, th2);
            }
        }
        return null;
    }

    public static final ArrayList b(View view) {
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i10));
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:39:0x005e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static final int c(android.view.View r9) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.c.c(android.view.View):int");
    }

    public static final JSONObject d(View view) {
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            g.e(view, "view");
            if (g.a(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f30978b = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                n(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList b10 = b(view);
                int size = b10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put(d((View) b10.get(i10)));
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    public static final View.OnClickListener f(View view) {
        Field declaredField;
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            g.c(obj2, "null cannot be cast to non-null type android.view.View.OnClickListener");
            return (View.OnClickListener) obj2;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    public static final View.OnTouchListener g(View view) {
        Field declaredField;
        try {
            if (k6.a.b(c.class)) {
                return null;
            }
            try {
                try {
                    Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                        return null;
                    }
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    g.c(obj2, "null cannot be cast to non-null type android.view.View.OnTouchListener");
                    return (View.OnTouchListener) obj2;
                } catch (ClassNotFoundException unused) {
                    p pVar = p.f9815a;
                    d dVar = d.f9685a;
                    return null;
                } catch (IllegalAccessException unused2) {
                    p pVar2 = p.f9815a;
                    d dVar2 = d.f9685a;
                    return null;
                }
            } catch (NoSuchFieldException unused3) {
                p pVar3 = p.f9815a;
                d dVar3 = d.f9685a;
                return null;
            }
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    public static final String h(View view) {
        CharSequence charSequence;
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                charSequence = ((EditText) view).getHint();
            } else if (view instanceof TextView) {
                charSequence = ((TextView) view).getHint();
            } else {
                charSequence = null;
            }
            if (charSequence != null) {
                String obj = charSequence.toString();
                if (obj != null) {
                    return obj;
                }
            }
            return "";
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    public static final ViewGroup i(View view) {
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            return (ViewGroup) parent;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    public static final String j(View view) {
        CharSequence valueOf;
        Object selectedItem;
        String str;
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                valueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    if (((Switch) view).isChecked()) {
                        str = "1";
                    } else {
                        str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
                    }
                    valueOf = str;
                }
            } else if (view instanceof Spinner) {
                if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    valueOf = selectedItem.toString();
                }
                valueOf = null;
            } else {
                if (view instanceof DatePicker) {
                    valueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((DatePicker) view).getYear()), Integer.valueOf(((DatePicker) view).getMonth()), Integer.valueOf(((DatePicker) view).getDayOfMonth())}, 3));
                    g.d(valueOf, "format(format, *args)");
                } else if (view instanceof TimePicker) {
                    Integer currentHour = ((TimePicker) view).getCurrentHour();
                    g.d(currentHour, "view.currentHour");
                    int intValue = currentHour.intValue();
                    Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                    g.d(currentMinute, "view.currentMinute");
                    valueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(currentMinute.intValue())}, 2));
                    g.d(valueOf, "format(format, *args)");
                } else if (view instanceof RadioGroup) {
                    int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                    int childCount = ((RadioGroup) view).getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = ((RadioGroup) view).getChildAt(i10);
                        if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                            valueOf = ((RadioButton) childAt).getText();
                            break;
                        }
                    }
                    valueOf = null;
                } else {
                    if (view instanceof RatingBar) {
                        valueOf = String.valueOf(((RatingBar) view).getRating());
                    }
                    valueOf = null;
                }
            }
            if (valueOf != null) {
                String obj = valueOf.toString();
                if (obj != null) {
                    return obj;
                }
            }
            return "";
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    public static final void n(View view, JSONObject jSONObject) {
        if (k6.a.b(c.class)) {
            return;
        }
        try {
            g.e(view, "view");
            try {
                String j10 = j(view);
                String h10 = h(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", c(view));
                jSONObject.put(FacebookMediationAdapter.KEY_ID, view.getId());
                if (!b.b(view)) {
                    jSONObject.put("text", p.d(p.C(j10)));
                } else {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                }
                jSONObject.put("hint", p.d(p.C(h10)));
                if (tag != null) {
                    jSONObject.put("tag", p.d(p.C(tag.toString())));
                }
                if (contentDescription != null) {
                    jSONObject.put(InMobiNetworkValues.DESCRIPTION, p.d(p.C(contentDescription.toString())));
                }
                jSONObject.put("dimension", f30977a.e(view));
            } catch (JSONException unused) {
                p pVar = p.f9815a;
                d dVar = d.f9685a;
            }
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
        }
    }

    public final JSONObject e(View view) {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put(InMobiNetworkValues.WIDTH, view.getWidth());
                jSONObject.put(InMobiNetworkValues.HEIGHT, view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    public final View k(float[] fArr, View view) {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            l();
            Method method = c;
            if (method != null && view != null) {
                try {
                    if (method != null) {
                        Object invoke = method.invoke(null, fArr, view);
                        g.c(invoke, "null cannot be cast to non-null type android.view.View");
                        View view2 = (View) invoke;
                        if (view2.getId() > 0) {
                            ViewParent parent = view2.getParent();
                            g.c(parent, "null cannot be cast to non-null type android.view.View");
                            return (View) parent;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } catch (IllegalAccessException unused) {
                    p pVar = p.f9815a;
                    d dVar = d.f9685a;
                } catch (InvocationTargetException unused2) {
                    p pVar2 = p.f9815a;
                    d dVar2 = d.f9685a;
                }
            }
            return null;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    public final void l() {
        if (k6.a.b(this)) {
            return;
        }
        try {
            if (c != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                c = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } catch (ClassNotFoundException unused) {
                p pVar = p.f9815a;
                d dVar = d.f9685a;
            } catch (NoSuchMethodException unused2) {
                p pVar2 = p.f9815a;
                d dVar2 = d.f9685a;
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    public final boolean m(View view, View view2) {
        float[] fArr;
        if (k6.a.b(this)) {
            return false;
        }
        try {
            g.e(view, "view");
            if (!g.a(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            if (!k6.a.b(this)) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                fArr = new float[]{iArr[0], iArr[1]};
            } else {
                fArr = null;
            }
            View k10 = k(fArr, view2);
            if (k10 == null) {
                return false;
            }
            if (k10.getId() != view.getId()) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return false;
        }
    }
}
