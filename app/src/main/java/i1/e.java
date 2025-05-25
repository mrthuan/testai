package i1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.k;

/* compiled from: EmojiKeyListener.java */
/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final KeyListener f18418a;

    /* renamed from: b  reason: collision with root package name */
    public final a f18419b;

    /* compiled from: EmojiKeyListener.java */
    /* loaded from: classes.dex */
    public static class a {
    }

    public e(KeyListener keyListener) {
        a aVar = new a();
        this.f18418a = keyListener;
        this.f18419b = aVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f18418a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f18418a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean a10;
        boolean z10;
        this.f18419b.getClass();
        Object obj = androidx.emoji2.text.g.f3617i;
        if (i10 != 67) {
            if (i10 != 112) {
                a10 = false;
            } else {
                a10 = k.a(editable, keyEvent, true);
            }
        } else {
            a10 = k.a(editable, keyEvent, false);
        }
        if (a10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !this.f18418a.onKeyDown(view, editable, i10, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f18418a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f18418a.onKeyUp(view, editable, i10, keyEvent);
    }
}
