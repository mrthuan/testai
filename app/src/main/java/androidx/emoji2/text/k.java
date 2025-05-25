package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.g;
import androidx.emoji2.text.o;
import o0.c;

/* compiled from: EmojiProcessor.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final g.i f3640a;

    /* renamed from: b  reason: collision with root package name */
    public final o f3641b;
    public final g.d c;

    /* compiled from: EmojiProcessor.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f3642a = 1;

        /* renamed from: b  reason: collision with root package name */
        public final o.a f3643b;
        public o.a c;

        /* renamed from: d  reason: collision with root package name */
        public o.a f3644d;

        /* renamed from: e  reason: collision with root package name */
        public int f3645e;

        /* renamed from: f  reason: collision with root package name */
        public int f3646f;

        public a(o.a aVar) {
            this.f3643b = aVar;
            this.c = aVar;
        }

        public final int a(int i10) {
            o.a aVar;
            boolean z10;
            SparseArray<o.a> sparseArray = this.c.f3661a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(i10);
            }
            int i11 = 1;
            if (this.f3642a != 2) {
                if (aVar == null) {
                    b();
                } else {
                    this.f3642a = 2;
                    this.c = aVar;
                    this.f3646f = 1;
                    i11 = 2;
                }
            } else {
                if (aVar != null) {
                    this.c = aVar;
                    this.f3646f++;
                } else {
                    boolean z11 = false;
                    if (i10 == 65038) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        b();
                    } else {
                        if (i10 == 65039) {
                            z11 = true;
                        }
                        if (!z11) {
                            o.a aVar2 = this.c;
                            if (aVar2.f3662b != null) {
                                if (this.f3646f == 1) {
                                    if (c()) {
                                        this.f3644d = this.c;
                                        b();
                                    } else {
                                        b();
                                    }
                                } else {
                                    this.f3644d = aVar2;
                                    b();
                                }
                                i11 = 3;
                            } else {
                                b();
                            }
                        }
                    }
                }
                i11 = 2;
            }
            this.f3645e = i10;
            return i11;
        }

        public final void b() {
            this.f3642a = 1;
            this.c = this.f3643b;
            this.f3646f = 0;
        }

        public final boolean c() {
            boolean z10;
            boolean z11;
            h1.a c = this.c.f3662b.c();
            int a10 = c.a(6);
            if (a10 != 0 && c.f17948b.get(a10 + c.f17947a) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
            if (this.f3645e == 65039) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return false;
            }
            return true;
        }
    }

    public k(o oVar, g.i iVar, e eVar) {
        this.f3640a = iVar;
        this.f3641b = oVar;
        this.c = eVar;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        boolean z11;
        l[] lVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 && (lVarArr = (l[]) editable.getSpans(selectionStart, selectionEnd, l.class)) != null && lVarArr.length > 0) {
            for (l lVar : lVarArr) {
                int spanStart = editable.getSpanStart(lVar);
                int spanEnd = editable.getSpanEnd(lVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i10, int i11, j jVar) {
        int i12;
        if (jVar.c == 0) {
            g.d dVar = this.c;
            h1.a c = jVar.c();
            int a10 = c.a(8);
            if (a10 != 0) {
                c.f17948b.getShort(a10 + c.f17947a);
            }
            e eVar = (e) dVar;
            eVar.getClass();
            ThreadLocal<StringBuilder> threadLocal = e.f3614b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = eVar.f3615a;
            String sb3 = sb2.toString();
            int i13 = o0.c.f22642a;
            if (c.a.a(textPaint, sb3)) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            jVar.c = i12;
        }
        if (jVar.c != 2) {
            return false;
        }
        return true;
    }
}
