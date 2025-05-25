package i1;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.p;

/* compiled from: EmojiEditableFactory.java */
/* loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f18410a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile b f18411b;
    public static Class<?> c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = c;
        if (cls != null) {
            return new p(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
