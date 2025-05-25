package pdf.pdfreader.viewer.editor.free.utils.drag;

import java.util.HashSet;
import java.util.Set;
import pdf.pdfreader.viewer.editor.free.utils.drag.a;

/* loaded from: classes3.dex */
public final class DragSelectionProcessor implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public Mode f28620a = Mode.Simple;

    /* renamed from: b  reason: collision with root package name */
    public final b f28621b;
    public HashSet<Integer> c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f28622d;

    /* loaded from: classes3.dex */
    public enum Mode {
        Simple,
        ToggleAndUndo,
        FirstItemDependent,
        FirstItemDependentToggleAndUndo
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28624a;

        static {
            int[] iArr = new int[Mode.values().length];
            f28624a = iArr;
            try {
                iArr[Mode.Simple.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28624a[Mode.ToggleAndUndo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28624a[Mode.FirstItemDependent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28624a[Mode.FirstItemDependentToggleAndUndo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(int i10, int i11, boolean z10, boolean z11);

        Set<Integer> q();
    }

    public DragSelectionProcessor(b bVar) {
        this.f28621b = bVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.drag.a.b
    public final void a() {
        this.c = null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.drag.a.b
    public final void b(int i10) {
        this.c = new HashSet<>();
        b bVar = this.f28621b;
        Set<Integer> q5 = bVar.q();
        if (q5 != null) {
            this.c.addAll(q5);
        }
        this.f28622d = this.c.contains(Integer.valueOf(i10));
        int i11 = a.f28624a[this.f28620a.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        bVar.a(i10, i10, !this.f28622d, true);
                        return;
                    }
                    return;
                }
                bVar.a(i10, i10, !this.f28622d, true);
                return;
            }
            bVar.a(i10, i10, !this.c.contains(Integer.valueOf(i10)), true);
            return;
        }
        bVar.a(i10, i10, true, true);
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.drag.a.c
    public final void c(int i10, int i11, boolean z10) {
        boolean contains;
        int i12 = a.f28624a[this.f28620a.ordinal()];
        b bVar = this.f28621b;
        boolean z11 = true;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 == 4) {
                        while (i10 <= i11) {
                            if (z10) {
                                if (!this.f28622d) {
                                    contains = true;
                                } else {
                                    contains = false;
                                }
                            } else {
                                contains = this.c.contains(Integer.valueOf(i10));
                            }
                            bVar.a(i10, i10, contains, false);
                            i10++;
                        }
                        return;
                    }
                    return;
                }
                if (z10) {
                    if (this.f28622d) {
                        z11 = false;
                    }
                } else {
                    z11 = this.f28622d;
                }
                bVar.a(i10, i11, z11, false);
                return;
            }
            while (i10 <= i11) {
                boolean contains2 = this.c.contains(Integer.valueOf(i10));
                if (z10) {
                    if (!contains2) {
                        contains2 = true;
                    } else {
                        contains2 = false;
                    }
                }
                bVar.a(i10, i10, contains2, false);
                i10++;
            }
            return;
        }
        bVar.a(i10, i11, z10, false);
    }
}
