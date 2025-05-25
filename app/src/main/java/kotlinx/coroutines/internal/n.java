package kotlinx.coroutines.internal;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final LockFreeLinkedListNode f20195a;

    public n(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f20195a = lockFreeLinkedListNode;
    }

    public final String toString() {
        return "Removed[" + this.f20195a + ']';
    }
}
