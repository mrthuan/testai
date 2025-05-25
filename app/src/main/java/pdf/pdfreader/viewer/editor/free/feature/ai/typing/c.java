package pdf.pdfreader.viewer.editor.free.feature.ai.typing;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import jf.d;
import jf.e;
import jf.f;
import jf.i;
import jf.k;
import jf.m;
import kf.o;
import kf.p;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.x;
import kotlinx.coroutines.y0;
import of.a;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import rk.c;

/* compiled from: TypingJobManager.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final f f24352a;

    /* renamed from: b  reason: collision with root package name */
    public static y0 f24353b;
    public static pdf.pdfreader.viewer.editor.free.feature.ai.typing.b c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f24354d;

    /* renamed from: e  reason: collision with root package name */
    public static CharSequence f24355e;

    /* compiled from: TypingJobManager.kt */
    /* loaded from: classes3.dex */
    public static final class a extends jf.a {
        @Override // jf.a, jf.g
        public final void d(p.a aVar) {
            aVar.f19748g = new float[]{1.5f, 1.3f, 1.17f, 1.0f, 0.83f, 0.67f};
            aVar.f19745d = ReaderPdfApplication.m().getResources().getDimensionPixelSize(R.dimen.dp_5);
            aVar.f19747f = 0;
        }

        @Override // jf.g
        public final void i(m.a aVar) {
            aVar.f19199b = new pdf.pdfreader.viewer.editor.free.feature.ai.typing.a();
        }
    }

    /* compiled from: TypingJobManager.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        public static void a(String text, boolean z10, CharSequence charSequence, cg.p pVar, int i10) {
            CharSequence charSequence2;
            long j10;
            cg.p pVar2;
            f fVar = c.f24352a;
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            boolean z11 = z10;
            if ((i10 & 4) != 0) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            if ((i10 & 8) != 0) {
                j10 = -1;
            } else {
                j10 = 0;
            }
            long j11 = j10;
            if ((i10 & 16) != 0) {
                pVar2 = null;
            } else {
                pVar2 = pVar;
            }
            g.e(text, "text");
            y0 y0Var = c.f24353b;
            if (y0Var != null) {
                y0Var.b(null);
            }
            c.f24353b = t0.d0(x.a(j0.f20206a), null, null, new TypingJobManager$Companion$startTyping$1(text, charSequence2, z11, pVar2, j11, null), 3);
        }
    }

    static {
        new b();
        Context m10 = ReaderPdfApplication.m();
        ArrayList arrayList = new ArrayList(3);
        TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
        arrayList.add(new o());
        arrayList.add(new a());
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            HashSet hashSet = new HashSet(3);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jf.g gVar = (jf.g) it.next();
                if (!arrayList2.contains(gVar)) {
                    if (!hashSet.contains(gVar)) {
                        hashSet.add(gVar);
                        gVar.f();
                        hashSet.remove(gVar);
                        if (!arrayList2.contains(gVar)) {
                            if (o.class.isAssignableFrom(gVar.getClass())) {
                                arrayList2.add(0, gVar);
                            } else {
                                arrayList2.add(gVar);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Cyclic dependency chain found: " + hashSet);
                    }
                }
            }
            c.a aVar = new c.a();
            float f10 = m10.getResources().getDisplayMetrics().density;
            p.a aVar2 = new p.a();
            aVar2.f19746e = (int) ((8 * f10) + 0.5f);
            aVar2.f19743a = (int) ((24 * f10) + 0.5f);
            int i10 = (int) ((4 * f10) + 0.5f);
            aVar2.f19744b = i10;
            int i11 = (int) ((1 * f10) + 0.5f);
            aVar2.c = i11;
            aVar2.f19747f = i11;
            aVar2.f19749h = i10;
            e.a aVar3 = new e.a();
            m.a aVar4 = new m.a();
            i.a aVar5 = new i.a();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                jf.g gVar2 = (jf.g) it2.next();
                gVar2.h();
                gVar2.d(aVar2);
                gVar2.g();
                gVar2.i(aVar4);
                gVar2.e(aVar5);
            }
            p pVar = new p(aVar2);
            i iVar = new i(Collections.unmodifiableMap(aVar5.f19191a));
            aVar3.f19180a = pVar;
            aVar3.f19185g = iVar;
            if (aVar3.f19181b == null) {
                aVar3.f19181b = new aj.b();
            }
            if (aVar3.c == null) {
                aVar3.c = new z3.c(6);
            }
            if (aVar3.f19182d == null) {
                aVar3.f19182d = new d();
            }
            if (aVar3.f19183e == null) {
                aVar3.f19183e = new a.C0317a();
            }
            if (aVar3.f19184f == null) {
                aVar3.f19184f = new o9.d();
            }
            f fVar = new f(new rk.c(aVar), new k(aVar4, new e(aVar3)), Collections.unmodifiableList(arrayList2), true);
            ea.a.p("OnUnbAtlBigaZQdkUXIHZF5BInAlaVVhloDXIHF9awp4IG4gTyBUIGggRiAaYiJpVGR6KQ==", "2gXNotqp");
            f24352a = fVar;
            return;
        }
        throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
    }
}
