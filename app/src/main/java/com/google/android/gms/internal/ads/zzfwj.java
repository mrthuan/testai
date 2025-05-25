package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzfwj extends zzfwh implements List {
    final /* synthetic */ zzfwk zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwj(zzfwk zzfwkVar, Object obj, List list, zzfwh zzfwhVar) {
        super(zzfwkVar, obj, list, zzfwhVar);
        this.zzf = zzfwkVar;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i10, obj);
        zzfwk zzfwkVar = this.zzf;
        i11 = zzfwkVar.zzb;
        zzfwkVar.zzb = i11 + 1;
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        int i11;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i10, collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzfwk zzfwkVar = this.zzf;
            i11 = zzfwkVar.zzb;
            zzfwkVar.zzb = i11 + (size2 - size);
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzb();
        return ((List) this.zzb).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzfwi(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        int i11;
        zzb();
        Object remove = ((List) this.zzb).remove(i10);
        zzfwk zzfwkVar = this.zzf;
        i11 = zzfwkVar.zzb;
        zzfwkVar.zzb = i11 - 1;
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        zzb();
        return ((List) this.zzb).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        zzb();
        List subList = ((List) this.zzb).subList(i10, i11);
        zzfwh zzfwhVar = this.zzc;
        if (zzfwhVar == null) {
            zzfwhVar = this;
        }
        return this.zzf.zzh(this.zza, subList, zzfwhVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        zzb();
        return new zzfwi(this, i10);
    }
}
