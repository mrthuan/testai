package com.bykv.vk.openvk.component.video.Qhi.cJ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: Urls.java */
/* loaded from: classes.dex */
public class ABk {
    private static final Set<String> Qhi = new HashSet();
    private static final Set<String> cJ = new HashSet();
    private final int CJ;
    private final int ROR;
    private int Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final ArrayList<Qhi> f7126ac;

    /* renamed from: fl  reason: collision with root package name */
    private int f7127fl = -1;

    /* compiled from: Urls.java */
    /* loaded from: classes.dex */
    public class Qhi {
        final String Qhi;
        int cJ;

        public Qhi(String str) {
            this.Qhi = str;
        }

        public void Qhi() {
            ABk.Qhi.add(this.Qhi);
        }

        public void cJ() {
            ABk.cJ.add(this.Qhi);
        }

        public String toString() {
            return this.Qhi;
        }
    }

    public ABk(List<String> list) {
        int i10;
        if (!list.isEmpty()) {
            int size = list.size();
            this.CJ = size;
            this.f7126ac = new ArrayList<>(size);
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (String str : list) {
                Qhi qhi = new Qhi(str);
                if (Qhi.contains(str)) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(qhi);
                } else if (cJ.contains(str)) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(qhi);
                } else {
                    this.f7126ac.add(qhi);
                }
            }
            if (arrayList != null) {
                this.f7126ac.addAll(arrayList);
            }
            if (arrayList2 != null) {
                this.f7126ac.addAll(arrayList2);
            }
            Integer num = Tgh.f7145hm;
            if (num != null && num.intValue() > 0) {
                i10 = num.intValue();
            } else {
                i10 = this.CJ >= 2 ? 1 : 2;
            }
            this.ROR = i10;
            return;
        }
        throw new IllegalArgumentException("urls can't be empty");
    }

    public boolean Qhi() {
        if (this.Tgh < this.ROR) {
            return true;
        }
        return false;
    }

    public Qhi cJ() {
        if (Qhi()) {
            int i10 = this.f7127fl + 1;
            if (i10 >= this.CJ - 1) {
                this.f7127fl = -1;
                this.Tgh++;
            } else {
                this.f7127fl = i10;
            }
            Qhi qhi = this.f7126ac.get(i10);
            qhi.cJ = (this.Tgh * this.CJ) + this.f7127fl;
            return qhi;
        }
        throw new NoSuchElementException();
    }

    public ABk(String str) {
        ArrayList<Qhi> arrayList = new ArrayList<>(1);
        this.f7126ac = arrayList;
        arrayList.add(new Qhi(str));
        this.CJ = 1;
        this.ROR = 1;
    }
}
