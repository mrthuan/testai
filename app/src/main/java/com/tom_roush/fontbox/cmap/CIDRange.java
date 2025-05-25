package com.tom_roush.fontbox.cmap;

/* loaded from: classes2.dex */
class CIDRange {
    private final int cid;
    private final char from;

    /* renamed from: to  reason: collision with root package name */
    private char f15981to;

    public CIDRange(char c, char c10, int i10) {
        this.from = c;
        this.f15981to = c10;
        this.cid = i10;
    }

    public boolean extend(char c, char c10, int i10) {
        char c11 = this.f15981to;
        if (c == c11 + 1 && i10 == ((this.cid + c11) - this.from) + 1) {
            this.f15981to = c10;
            return true;
        }
        return false;
    }

    public int map(char c) {
        char c10 = this.from;
        if (c10 <= c && c <= this.f15981to) {
            return (c - c10) + this.cid;
        }
        return -1;
    }

    public int unmap(int i10) {
        int i11 = this.cid;
        if (i11 <= i10) {
            char c = this.f15981to;
            char c10 = this.from;
            if (i10 <= (c - c10) + i11) {
                return (i10 - i11) + c10;
            }
            return -1;
        }
        return -1;
    }
}
