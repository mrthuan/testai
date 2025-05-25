package eg;

import ig.h;
import kotlin.jvm.internal.g;

/* compiled from: ObservableProperty.kt */
/* loaded from: classes.dex */
public abstract class a<V> {
    private V value;

    public a(V v10) {
        this.value = v10;
    }

    public void afterChange(h<?> property, V v10, V v11) {
        g.e(property, "property");
    }

    public boolean beforeChange(h<?> property, V v10, V v11) {
        g.e(property, "property");
        return true;
    }

    public V getValue(Object obj, h<?> property) {
        g.e(property, "property");
        return this.value;
    }

    public void setValue(Object obj, h<?> property, V v10) {
        g.e(property, "property");
        V v11 = this.value;
        if (!beforeChange(property, v11, v10)) {
            return;
        }
        this.value = v10;
        afterChange(property, v11, v10);
    }

    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
