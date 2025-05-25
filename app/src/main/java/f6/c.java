package f6;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SuggestedEventViewHierarchy.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f17127a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final List<Class<? extends View>> f17128b = ge.a.I(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    public static final ArrayList a(View view) {
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            g.e(view, "view");
            ArrayList arrayList = new ArrayList();
            for (Class<? extends View> cls : f17128b) {
                if (cls.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator it = w5.c.b(view).iterator();
            while (it.hasNext()) {
                arrayList.addAll(a((View) it.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    public static final JSONObject b(View view, View view2) {
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            g.e(view, "view");
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = w5.c.b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b((View) it.next(), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    public static final String d(View hostView) {
        boolean z10;
        if (k6.a.b(c.class)) {
            return null;
        }
        try {
            g.e(hostView, "hostView");
            String j10 = w5.c.j(hostView);
            if (j10.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return j10;
            }
            String join = TextUtils.join(" ", f17127a.c(hostView));
            g.d(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
            return null;
        }
    }

    public static final void e(View view, JSONObject jSONObject) {
        boolean z10;
        if (k6.a.b(c.class)) {
            return;
        }
        try {
            g.e(view, "view");
            try {
                String j10 = w5.c.j(view);
                String h10 = w5.c.h(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", w5.c.c(view));
                boolean z11 = true;
                if (j10.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    jSONObject.put("text", j10);
                }
                if (h10.length() <= 0) {
                    z11 = false;
                }
                if (z11) {
                    jSONObject.put("hint", h10);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            k6.a.a(c.class, th2);
        }
    }

    public final ArrayList c(View view) {
        boolean z10;
        if (k6.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = w5.c.b(view).iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                String j10 = w5.c.j(view2);
                if (j10.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(j10);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }
}
