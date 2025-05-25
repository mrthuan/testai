package i1;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.g;

/* compiled from: EmojiInputConnection.java */
/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f18412a;

    /* renamed from: b  reason: collision with root package name */
    public final a f18413b;

    /* compiled from: EmojiInputConnection.java */
    /* loaded from: classes.dex */
    public static class a {
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0050, code lost:
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0080, code lost:
            if (r11 != false) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x008d, code lost:
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L67;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean a(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: i1.c.a.a(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        boolean z10;
        int i10;
        a aVar = new a();
        this.f18412a = editText;
        this.f18413b = aVar;
        if (androidx.emoji2.text.g.f3618j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            androidx.emoji2.text.g a10 = androidx.emoji2.text.g.a();
            if ((a10.b() == 1) && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                g.a aVar2 = a10.f3622e;
                aVar2.getClass();
                Bundle bundle = editorInfo.extras;
                h1.b bVar = aVar2.c.f3658a;
                int a11 = bVar.a(4);
                if (a11 != 0) {
                    i10 = bVar.f17948b.getInt(a11 + bVar.f17947a);
                } else {
                    i10 = 0;
                }
                bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i10);
                Bundle bundle2 = editorInfo.extras;
                aVar2.f3627a.getClass();
                bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        Editable editableText = this.f18412a.getEditableText();
        this.f18413b.getClass();
        if (!a.a(this, editableText, i10, i11, false) && !super.deleteSurroundingText(i10, i11)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        Editable editableText = this.f18412a.getEditableText();
        this.f18413b.getClass();
        if (a.a(this, editableText, i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11)) {
            return true;
        }
        return false;
    }
}
