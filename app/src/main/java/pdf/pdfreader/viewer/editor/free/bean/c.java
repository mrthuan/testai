package pdf.pdfreader.viewer.editor.free.bean;

import pdf.pdfreader.viewer.editor.free.bean.IToolsItem;

/* compiled from: ToolsUnit.java */
/* loaded from: classes3.dex */
public final class c implements IToolsItem {

    /* renamed from: a  reason: collision with root package name */
    public final String f24036a;

    public c(String str) {
        this.f24036a = str;
    }

    @Override // pdf.pdfreader.viewer.editor.free.bean.IToolsItem
    public final IToolsItem.ToolsItemType a() {
        return IToolsItem.ToolsItemType.norm;
    }

    /* compiled from: ToolsUnit.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f24037a;

        /* renamed from: b  reason: collision with root package name */
        public final int f24038b;
        public final boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f24039d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f24040e;

        public a(boolean z10, int i10, String str, boolean z11, boolean z12) {
            this.f24038b = i10;
            this.f24037a = str;
            this.c = z10;
            this.f24039d = z11;
            this.f24040e = z12;
        }

        public a(int i10, String str, boolean z10) {
            this(z10, i10, str, false, false);
        }
    }
}
