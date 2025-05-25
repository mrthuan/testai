package io.flutter.plugin.editing;

import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ListenableEditingState.java */
/* loaded from: classes.dex */
public final class f extends SpannableStringBuilder {

    /* renamed from: a  reason: collision with root package name */
    public int f18761a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f18762b = 0;
    public final ArrayList<a> c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<a> f18763d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<g> f18764e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public String f18765f;

    /* renamed from: g  reason: collision with root package name */
    public String f18766g;

    /* renamed from: h  reason: collision with root package name */
    public int f18767h;

    /* renamed from: i  reason: collision with root package name */
    public int f18768i;

    /* renamed from: j  reason: collision with root package name */
    public int f18769j;

    /* renamed from: k  reason: collision with root package name */
    public int f18770k;

    /* renamed from: l  reason: collision with root package name */
    public final e f18771l;

    /* compiled from: ListenableEditingState.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z10);
    }

    public f(View view, TextInputChannel.d dVar) {
        this.f18771l = new e(view, this);
        if (dVar != null) {
            e(dVar);
        }
    }

    public final void a() {
        int i10 = this.f18761a + 1;
        this.f18761a = i10;
        if (i10 == 1 && !this.c.isEmpty()) {
            this.f18766g = toString();
            this.f18767h = Selection.getSelectionStart(this);
            this.f18768i = Selection.getSelectionEnd(this);
            this.f18769j = BaseInputConnection.getComposingSpanStart(this);
            this.f18770k = BaseInputConnection.getComposingSpanEnd(this);
        }
    }

    public final void b() {
        boolean z10;
        int i10 = this.f18761a;
        if (i10 == 0) {
            return;
        }
        ArrayList<a> arrayList = this.f18763d;
        ArrayList<a> arrayList2 = this.c;
        if (i10 == 1) {
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                this.f18762b++;
                it.next().a(true);
                this.f18762b--;
            }
            if (!arrayList2.isEmpty()) {
                String.valueOf(arrayList2.size());
                boolean z11 = !toString().equals(this.f18766g);
                boolean z12 = false;
                if (this.f18767h == Selection.getSelectionStart(this) && this.f18768i == Selection.getSelectionEnd(this)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (this.f18769j != BaseInputConnection.getComposingSpanStart(this) || this.f18770k != BaseInputConnection.getComposingSpanEnd(this)) {
                    z12 = true;
                }
                c(z11, z10, z12);
            }
        }
        arrayList2.addAll(arrayList);
        arrayList.clear();
        this.f18761a--;
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        if (z10 || z11 || z12) {
            Iterator<a> it = this.c.iterator();
            while (it.hasNext()) {
                this.f18762b++;
                it.next().a(z10);
                this.f18762b--;
            }
        }
    }

    public final void d(a aVar) {
        if (this.f18762b > 0) {
            aVar.toString();
        }
        this.c.remove(aVar);
        if (this.f18761a > 0) {
            this.f18763d.remove(aVar);
        }
    }

    public final void e(TextInputChannel.d dVar) {
        int i10;
        a();
        boolean z10 = false;
        replace(0, length(), (CharSequence) dVar.f18725a);
        int i11 = dVar.f18726b;
        if (i11 >= 0) {
            z10 = true;
        }
        if (z10) {
            Selection.setSelection(this, i11, dVar.c);
        } else {
            Selection.removeSelection(this);
        }
        int i12 = dVar.f18727d;
        if (i12 >= 0 && i12 < (i10 = dVar.f18728e)) {
            this.f18771l.setComposingRegion(i12, i10);
        } else {
            BaseInputConnection.removeComposingSpans(this);
        }
        this.f18764e.clear();
        b();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        super.setSpan(obj, i10, i11, i12);
        this.f18764e.add(new g(Selection.getSelectionStart(this), Selection.getSelectionEnd(this), toString(), BaseInputConnection.getComposingSpanStart(this), BaseInputConnection.getComposingSpanEnd(this)));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f18765f;
        if (str == null) {
            String spannableStringBuilder = super.toString();
            this.f18765f = spannableStringBuilder;
            return spannableStringBuilder;
        }
        return str;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        boolean z10;
        boolean z11;
        String fVar = toString();
        int i14 = i11 - i10;
        boolean z12 = i14 != i13 - i12;
        for (int i15 = 0; i15 < i14 && !z12; i15++) {
            z12 |= charAt(i10 + i15) != charSequence.charAt(i12 + i15);
        }
        if (z12) {
            this.f18765f = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i10, i11, charSequence, i12, i13);
        boolean z13 = z12;
        this.f18764e.add(new g(fVar, i10, i11, charSequence, Selection.getSelectionStart(this), Selection.getSelectionEnd(this), BaseInputConnection.getComposingSpanStart(this), BaseInputConnection.getComposingSpanEnd(this)));
        if (this.f18761a > 0) {
            return replace;
        }
        boolean z14 = (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true;
        if (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) {
            z10 = z13;
            z11 = false;
        } else {
            z10 = z13;
            z11 = true;
        }
        c(z10, z14, z11);
        return replace;
    }
}
