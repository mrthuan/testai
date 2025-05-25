package f8;

import android.util.Property;
import android.view.ViewGroup;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ChildrenAlphaProperty.java */
/* loaded from: classes2.dex */
public final class d extends Property<ViewGroup, Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f17146a = new d();

    public d() {
        super(Float.class, "childrenAlpha");
    }

    @Override // android.util.Property
    public final Float get(ViewGroup viewGroup) {
        Float f10 = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        if (f10 == null) {
            return Float.valueOf(1.0f);
        }
        return f10;
    }

    @Override // android.util.Property
    public final void set(ViewGroup viewGroup, Float f10) {
        ViewGroup viewGroup2 = viewGroup;
        float floatValue = f10.floatValue();
        viewGroup2.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup2.getChildAt(i10).setAlpha(floatValue);
        }
    }
}
