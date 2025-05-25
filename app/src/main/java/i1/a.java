package i1;

import android.widget.EditText;

/* compiled from: EmojiEditTextHelper.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0247a f18407a;

    /* compiled from: EmojiEditTextHelper.java */
    /* renamed from: i1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0247a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final EditText f18408a;

        /* renamed from: b  reason: collision with root package name */
        public final g f18409b;

        public C0247a(EditText editText) {
            this.f18408a = editText;
            g gVar = new g(editText);
            this.f18409b = gVar;
            editText.addTextChangedListener(gVar);
            if (i1.b.f18411b == null) {
                synchronized (i1.b.f18410a) {
                    if (i1.b.f18411b == null) {
                        i1.b.f18411b = new i1.b();
                    }
                }
            }
            editText.setEditableFactory(i1.b.f18411b);
        }
    }

    /* compiled from: EmojiEditTextHelper.java */
    /* loaded from: classes.dex */
    public static class b {
    }

    public a(EditText editText) {
        if (editText != null) {
            this.f18407a = new C0247a(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }
}
