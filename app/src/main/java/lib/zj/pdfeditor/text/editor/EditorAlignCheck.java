package lib.zj.pdfeditor.text.editor;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import mj.e;
import mj.e0;

/* loaded from: classes3.dex */
public final class EditorAlignCheck {

    /* renamed from: a  reason: collision with root package name */
    public float f21657a = -1.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f21658b = -1.0f;
    public float c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f21659d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public final e0 f21660e = new e0();

    /* renamed from: f  reason: collision with root package name */
    public final e0 f21661f = new e0();

    /* renamed from: g  reason: collision with root package name */
    public final e0 f21662g = new e0();

    /* renamed from: h  reason: collision with root package name */
    public final e0 f21663h = new e0();

    /* loaded from: classes3.dex */
    public enum EditorAlignType {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21665a;

        static {
            int[] iArr = new int[EditorAlignType.values().length];
            f21665a = iArr;
            try {
                iArr[EditorAlignType.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21665a[EditorAlignType.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21665a[EditorAlignType.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21665a[EditorAlignType.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final EditorAlignCheck f21666a = new EditorAlignCheck();
    }

    public final void a(RectF rectF, mj.a aVar, ArrayList arrayList, e eVar, ArrayList arrayList2, EditorAlignType... editorAlignTypeArr) {
        this.f21659d = -1.0f;
        this.c = -1.0f;
        this.f21658b = -1.0f;
        this.f21657a = -1.0f;
        for (EditorAlignType editorAlignType : editorAlignTypeArr) {
            int i10 = a.f21665a[editorAlignType.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            float f10 = rectF.bottom;
                            float f11 = e0.c;
                            e0 e0Var = this.f21663h;
                            e0Var.f22054a = f10 - f11;
                            e0Var.f22055b = f10 + f11;
                        }
                    } else {
                        float f12 = rectF.right;
                        float f13 = e0.c;
                        e0 e0Var2 = this.f21662g;
                        e0Var2.f22054a = f12 - f13;
                        e0Var2.f22055b = f12 + f13;
                    }
                } else {
                    float f14 = rectF.top;
                    float f15 = e0.c;
                    e0 e0Var3 = this.f21661f;
                    e0Var3.f22054a = f14 - f15;
                    e0Var3.f22055b = f14 + f15;
                }
            } else {
                float f16 = rectF.left;
                float f17 = e0.c;
                e0 e0Var4 = this.f21660e;
                e0Var4.f22054a = f16 - f17;
                e0Var4.f22055b = f16 + f17;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mj.a aVar2 = (mj.a) it.next();
                if (aVar == null || aVar2.f22044a != aVar.f22044a) {
                    for (EditorAlignType editorAlignType2 : editorAlignTypeArr) {
                        int i11 = a.f21665a[editorAlignType2.ordinal()];
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    if (i11 == 4) {
                                        b(aVar2, null);
                                    }
                                } else {
                                    d(aVar2, null);
                                }
                            } else {
                                e(aVar2, null);
                            }
                        } else {
                            c(aVar2, null);
                        }
                    }
                }
            }
        }
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                e eVar2 = (e) it2.next();
                if (eVar == null || eVar.f22052a.getImgIndex() != eVar2.f22052a.getImgIndex()) {
                    for (EditorAlignType editorAlignType3 : editorAlignTypeArr) {
                        int i12 = a.f21665a[editorAlignType3.ordinal()];
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 != 3) {
                                    if (i12 == 4) {
                                        b(null, eVar2);
                                    }
                                } else {
                                    d(null, eVar2);
                                }
                            } else {
                                e(null, eVar2);
                            }
                        } else {
                            c(null, eVar2);
                        }
                    }
                }
            }
        }
    }

    public final void b(mj.a aVar, e eVar) {
        if (this.f21659d != -1.0f) {
            return;
        }
        e0 e0Var = this.f21663h;
        if (aVar != null) {
            RectF rectF = aVar.f22045b;
            if (e0Var.a(rectF.top)) {
                this.f21659d = rectF.top;
                return;
            } else if (e0Var.a(rectF.bottom)) {
                this.f21659d = rectF.bottom;
                return;
            }
        }
        if (eVar != null) {
            RectF rectF2 = eVar.f22053b;
            if (e0Var.a(rectF2.top)) {
                this.f21659d = rectF2.top;
            } else if (e0Var.a(rectF2.bottom)) {
                this.f21659d = rectF2.bottom;
            }
        }
    }

    public final void c(mj.a aVar, e eVar) {
        if (this.f21657a != -1.0f) {
            return;
        }
        e0 e0Var = this.f21660e;
        if (aVar != null) {
            RectF rectF = aVar.f22045b;
            if (e0Var.a(rectF.left)) {
                this.f21657a = rectF.left;
                return;
            } else if (e0Var.a(rectF.right)) {
                this.f21657a = rectF.right;
                return;
            }
        }
        if (eVar != null) {
            RectF rectF2 = eVar.f22053b;
            if (e0Var.a(rectF2.left)) {
                this.f21657a = rectF2.left;
            } else if (e0Var.a(rectF2.right)) {
                this.f21657a = rectF2.right;
            }
        }
    }

    public final void d(mj.a aVar, e eVar) {
        if (this.c != -1.0f) {
            return;
        }
        e0 e0Var = this.f21662g;
        if (aVar != null) {
            RectF rectF = aVar.f22045b;
            if (e0Var.a(rectF.left)) {
                this.c = rectF.left;
                return;
            } else if (e0Var.a(rectF.right)) {
                this.c = rectF.right;
                return;
            }
        }
        if (eVar != null) {
            RectF rectF2 = eVar.f22053b;
            if (e0Var.a(rectF2.left)) {
                this.c = rectF2.left;
            } else if (e0Var.a(rectF2.right)) {
                this.c = rectF2.right;
            }
        }
    }

    public final void e(mj.a aVar, e eVar) {
        if (this.f21658b != -1.0f) {
            return;
        }
        e0 e0Var = this.f21661f;
        if (aVar != null) {
            RectF rectF = aVar.f22045b;
            if (e0Var.a(rectF.top)) {
                this.f21658b = rectF.top;
                return;
            } else if (e0Var.a(rectF.bottom)) {
                this.f21658b = rectF.bottom;
                return;
            }
        }
        if (eVar != null) {
            RectF rectF2 = eVar.f22053b;
            if (e0Var.a(rectF2.top)) {
                this.f21658b = rectF2.top;
            } else if (e0Var.a(rectF2.bottom)) {
                this.f21658b = rectF2.bottom;
            }
        }
    }
}
