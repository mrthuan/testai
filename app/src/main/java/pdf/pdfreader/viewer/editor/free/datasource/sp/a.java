package pdf.pdfreader.viewer.editor.free.datasource.sp;

import android.content.SharedPreferences;
import ig.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: SharedPreferencesDelegate.kt */
/* loaded from: classes3.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f24208a;

    /* renamed from: b  reason: collision with root package name */
    public final T f24209b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24210d;

    public a(SharedPreferences sharedPreferences, T t4, String str, String str2) {
        ea.a.p("QGgqchZkMnIXZlFyDG41ZXM=", "Kz63yu3S");
        this.f24208a = sharedPreferences;
        this.f24209b = t4;
        this.c = str;
        this.f24210d = str2;
    }

    public final String a(h<?> hVar) {
        String str = this.c;
        if (str == null) {
            String name = hVar.getName();
            String str2 = this.f24210d;
            if (str2 == null) {
                str2 = "";
            }
            return a6.h.c(name, str2);
        }
        return str;
    }

    public final Object b(h property) {
        Set<String> set;
        g.e(property, "property");
        String a10 = a(property);
        T t4 = this.f24209b;
        boolean z10 = t4 instanceof Integer;
        SharedPreferences sharedPreferences = this.f24208a;
        if (z10) {
            return Integer.valueOf(sharedPreferences.getInt(a10, ((Number) t4).intValue()));
        }
        if (t4 instanceof Long) {
            return Long.valueOf(sharedPreferences.getLong(a10, ((Number) t4).longValue()));
        }
        if (t4 instanceof Float) {
            return Float.valueOf(sharedPreferences.getFloat(a10, ((Number) t4).floatValue()));
        }
        if (t4 instanceof Boolean) {
            return Boolean.valueOf(sharedPreferences.getBoolean(a10, ((Boolean) t4).booleanValue()));
        }
        if (t4 instanceof String) {
            return sharedPreferences.getString(a10, (String) t4);
        }
        boolean z11 = t4 instanceof Set;
        if (z11) {
            if (z11) {
                set = (Set) t4;
            } else {
                set = null;
            }
            return sharedPreferences.getStringSet(a10, set);
        }
        throw new IllegalStateException(ea.a.p("Zm44dQNwDXIGZVAgHXkmZQ==", "vcd5X19H"));
    }

    public final void c(h property, Object obj) {
        g.e(property, "property");
        String a10 = a(property);
        SharedPreferences.Editor edit = this.f24208a.edit();
        if (obj instanceof Integer) {
            edit.putInt(a10, ((Number) obj).intValue());
        } else if (obj instanceof Long) {
            edit.putLong(a10, ((Number) obj).longValue());
        } else if (obj instanceof Float) {
            edit.putFloat(a10, ((Number) obj).floatValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(a10, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            edit.putString(a10, (String) obj);
        } else if (obj instanceof Set) {
            Iterable<T> iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(kotlin.collections.g.h0(iterable, 10));
            for (T t4 : iterable) {
                arrayList.add(String.valueOf(t4));
            }
            HashSet hashSet = new HashSet(t0.g0(kotlin.collections.g.h0(arrayList, 12)));
            m.C0(arrayList, hashSet);
            edit.putStringSet(a10, hashSet);
        } else {
            throw new IllegalStateException(ea.a.p("Zm44dQNwDXIGZVAgHXkmZQ==", "5yOwvUOx"));
        }
        edit.apply();
    }
}
