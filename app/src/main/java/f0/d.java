package f0;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: Key.java */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public int f16836a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f16837b = -1;
    public String c = null;

    /* renamed from: d  reason: collision with root package name */
    public HashMap<String, ConstraintAttribute> f16838d;

    public static float g(Number number) {
        if (number instanceof Float) {
            return ((Float) number).floatValue();
        }
        return Float.parseFloat(number.toString());
    }

    public abstract void a(HashMap<String, e0.d> hashMap);

    @Override // 
    /* renamed from: b */
    public abstract d clone();

    public d c(d dVar) {
        this.f16836a = dVar.f16836a;
        this.f16837b = dVar.f16837b;
        this.c = dVar.c;
        this.f16838d = dVar.f16838d;
        return this;
    }

    public abstract void d(HashSet<String> hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap<String, Integer> hashMap) {
    }
}
